package com.example.SpringBootDemoProject;

import com.example.SpringBootDemoProject.dao.TestRepository;
import com.example.SpringBootDemoProject.service.TestService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDemoProjectApplicationTests {

	@MockBean
	private TestService testService;

	@MockBean
	private TestRepository testRepository;

	@Test
	public void getStatementDetails() {
		int arrangementID = 2;
		when(testRepository.getStatementDetails(arrangementID)).thenReturn("Test String");
		Assert.assertNull(testService.getStatementDetails(arrangementID));
	}

	@Test
	void contextLoads() {
	}

}
