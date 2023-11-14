package com.example.SpringBootDemoProject.dao;


import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository {
    public String getStatementDetails( int arrangementID);
}
