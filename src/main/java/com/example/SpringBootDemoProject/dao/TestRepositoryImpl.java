package com.example.SpringBootDemoProject.dao;

public class TestRepositoryImpl implements TestRepository{
    @Override
    public String getStatementDetails(int arrangementID) {
        return "Message from TestRepositoryImpl with arrangement ID "+arrangementID;
    }
}
