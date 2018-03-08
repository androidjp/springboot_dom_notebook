package com.jpuneng.springboot_dom_notebook;

import com.jpuneng.springboot_dom_notebook.controller.note.NoteReadController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootDomNotebookApplicationTests {

	private MockMvc mockMvc;
	@Autowired
	NoteReadController controller;

	@Before
	public void setUp(){
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void contextLoads() throws Exception {
		ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/note/GET/list/0").accept(MediaType.APPLICATION_JSON));
		resultActions.andExpect(status().isOk()).andExpect(content().string(startsWith("{\"code\":200,\"message\":null,\"data\":[{")));
	}
}
