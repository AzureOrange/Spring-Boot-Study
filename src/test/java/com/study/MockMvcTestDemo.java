package com.study;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * 功能描述：测试mockmvc类
 * <p>测试Controller层</p>
 *
 *@author orange
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc 
public class MockMvcTestDemo {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void apiTest() throws Exception {
		
		MvcResult mvcResult =  mockMvc.perform( MockMvcRequestBuilders.get("/test/home") ).
				andExpect(MockMvcResultMatchers.status().isOk() ).andReturn();
		int status = mvcResult.getResponse().getStatus();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println(result);
		System.out.println(status);
		
	}
	
}
