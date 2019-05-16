package com.mn.cloud_common.es.service;

import com.mn.cloud_common.es.dao.EsRepository;
import com.mn.cloud_common.es.model.MonitorResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

/**
  * @Author Administrator
  * @Description // Elasticsearch Repositories方式
  * @Date 17:08 2019-5-15
  * @Param 
  * @return 
  **/
@Service
public class EsRepositoryService {

    @Autowired
    private EsRepository repository;

    public Page<MonitorResult> searchTemplate() {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.prefixQuery("url", "phttp://www.hunan.gov.cn/"))
                .withPageable(PageRequest.of(1, 10))
                .build();

        return repository.search(searchQuery);
    }
}
