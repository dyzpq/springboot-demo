package com.example.mapper.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author ddyy
 * @Date 2020/10/16 0016 15:51
 */
@Repository
public interface DemoMapper {

    List<String> listString();
}
