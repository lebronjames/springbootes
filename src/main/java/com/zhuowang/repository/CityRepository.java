package com.zhuowang.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.zhuowang.domain.City;

@Repository
public interface CityRepository extends ElasticsearchRepository<City,Long> {

}
