package com.mn.cloud_common.es.service;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EsTemplateService {

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    public long searchTemplate() {
        String aliasName = "dns_2019_04_12_monitoresmodel";
        String typeName = "is0011";
        SearchRequestBuilder srb = elasticsearchTemplate.getClient().prepareSearch().setIndices(aliasName).setTypes(typeName);
        SearchResponse searchResponse = srb
                .setQuery(QueryBuilders.prefixQuery("url", "phttp://www.hunan.gov.cn/"))
                .execute().actionGet();
        long count = searchResponse.getHits().getTotalHits();
        return count;
    }
}
