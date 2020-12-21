package com.oltraining.oltraining.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {

    @MockBean
    private EmployeeService employeeService;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(new EmployeeController(employeeService)).build();
    }

    @Test
    public void getAllTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employees")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
    @Test
    public void getEmployeeTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employees/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    @Test
    public void saveEmployeeTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(new EmployeeDTO()))
                .accept(MediaType.ALL))
                .andExpect(status().isOk());
    }

//    @Test
//    public void updateEmployeeTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.put("/employees/1")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(new ObjectMapper().writeValueAsString(new Employee()))
//                .content("1")
//                .accept(MediaType.ALL))
//                .andExpect(status().isOk());
//    }

    @Test
    public void deleteEmployeeTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/employees/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("1")
                .accept(MediaType.ALL))
                .andExpect(status().isOk());
    }
}
