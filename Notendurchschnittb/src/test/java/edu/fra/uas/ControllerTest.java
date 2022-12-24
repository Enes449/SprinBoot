package edu.fra.uas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.NotendurchschnittbController;



@SpringBootTest
public class ControllerTest {
    @Autowired
    private NotendurchschnittbController notendurchschnittbController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(notendurchschnittbController).isNotNull();
    }

}