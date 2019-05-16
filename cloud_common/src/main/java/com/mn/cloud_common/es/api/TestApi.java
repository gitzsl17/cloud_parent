package com.mn.cloud_common.es.api;

import com.mn.cloud_common.es.model.MonitorResult;
import com.mn.cloud_common.es.service.EsRepositoryService;
import com.mn.cloud_common.es.service.EsTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@Api(tags = "test接口", value = "测试接口!")
public class TestApi {

    @Autowired
    private EsTemplateService esTemplateService;

    @Autowired
    private EsRepositoryService esRepositoryService;


    // 增加一些说明来丰富文档内容。如下所示，我们通过@ApiOperation注解来给API增加说明、通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "name", value = "用户Name", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "info", value = "用户Info", required = true, dataType = "String", paramType = "query")
    })
    @ApiOperation(value = "获取标题统计", notes = "获取标题统计notes", produces = "application/json")
    @RequestMapping(value = "/getTitleCount", method = RequestMethod.GET, produces = "application/json")
    public long getDomainMonitorCount(String id, String name, String info){
        System.out.println(id + ":" + name + ":" + info);
        return esTemplateService.searchTemplate();
    }

    @ApiOperation(value = "获取标题统计2", notes = "获取标题统计notes2", produces = "application/json")
    @RequestMapping(value = "/getTitleCount2", method = RequestMethod.GET, produces = "application/json")
    public Page<MonitorResult> getDomainMonitorCountForRepository(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i + "");
            esRepositoryService.searchTemplate();
        }
        return esRepositoryService.searchTemplate();
    }

    @ApiOperation(value = "测试连接是否成功", notes = "测试连接是否成功notes", produces = "application/json")
    @RequestMapping(value = "/getTest", method = RequestMethod.GET, produces = "application/json")
    public void getTest(){
        System.out.println("success getTest!");
    }

}
