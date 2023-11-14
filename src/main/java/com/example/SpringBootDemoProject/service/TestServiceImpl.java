package com.example.SpringBootDemoProject.service;

import com.example.SpringBootDemoProject.dao.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceImpl implements TestService{

    @Autowired
    public TestRepository testRepository;

    @Override
    public String getStatementDetails(int arrangementID) {
        return testRepository.getStatementDetails(arrangementID);
    }
}
