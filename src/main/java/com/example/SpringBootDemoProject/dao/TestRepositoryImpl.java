package com.example.SpringBootDemoProject.dao;

import ch.qos.logback.core.net.SyslogOutputStream;

public class TestRepositoryImpl implements TestRepository{

    @Override
    public String getStatementDetails(int arrangementID) {

        String result = TestMessage(arrangementID);

        System.out.println(result);
        return result;

    }

    private String TestMessage(int arrangementID){
        return "Test String";
    }

}
