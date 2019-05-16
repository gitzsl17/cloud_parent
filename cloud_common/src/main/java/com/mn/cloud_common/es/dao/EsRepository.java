package com.mn.cloud_common.es.dao;

import com.mn.cloud_common.es.model.MonitorResult;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EsRepository extends ElasticsearchRepository<MonitorResult,String> {
}
