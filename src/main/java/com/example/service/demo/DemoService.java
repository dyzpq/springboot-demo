package com.example.service.demo;

import com.example.mapper.demo.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ddyy
 * @Date 2020/10/16 0016 15:51
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<String> listString(){
        return demoMapper.listString();
    }
}
