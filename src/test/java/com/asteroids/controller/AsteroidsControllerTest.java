package com.asteroids.controller;

import com.asteroids.model.AsteroidDetails;
import com.asteroids.service.AsteroidsAnalyzerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class AsteroidsControllerTest {

    private static final String API_PATH="/api/v1/";
    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private AsteroidsController asteroidsController;

    @Mock
    private AsteroidsAnalyzerService asteroidsAnalyzerService;


    @Before
    public void initMocks() throws IOException {
        asteroidsAnalyzerService = new AsteroidsAnalyzerService();
        this.mockMvc = MockMvcBuilders.standaloneSetup(asteroidsController).build();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAsteroidDetails() throws Exception {
        String requestUrl=API_PATH + "asteroids";
        List<AsteroidDetails> asteroidDetailsList=new ArrayList<>();
        when(asteroidsAnalyzerService.findAsteroids()).thenReturn(asteroidDetailsList);
        mockMvc.perform(get(requestUrl))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
