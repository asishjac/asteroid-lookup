package com.harper.asteroids;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harper.asteroids.model.NearEarthObject;
import com.harper.asteroids.service.AsteroidsAnalyzerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestAsteroidAnalyzerService {

    private ObjectMapper mapper = new ObjectMapper();
    private NearEarthObject neo1, neo2;

    @InjectMocks
    private AsteroidsAnalyzerService asteroidsAnalyzerService;

    @Before
    public void setUp() throws IOException {
        AsteroidsAnalyzerService analyzerService=new AsteroidsAnalyzerService();
        neo1 = mapper.readValue(getClass().getResource("/neo_example.json"), NearEarthObject.class);
        neo2 = mapper.readValue(getClass().getResource("/neo_example2.json"), NearEarthObject.class);
    }

    @Test
    public void testFiltering() {

        List<NearEarthObject> neos = List.of(neo1, neo2);
        List<NearEarthObject> filtered = asteroidsAnalyzerService.getClosest(neos);
        assertEquals(1, filtered.size());
        assertEquals(neo2, filtered.get(0));

    }
}
