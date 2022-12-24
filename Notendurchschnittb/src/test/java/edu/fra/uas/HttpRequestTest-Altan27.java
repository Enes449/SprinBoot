package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import edu.fra.uas.config.NDInitializer;
import edu.fra.uas.controller.NotendurchschnittbController;
import edu.fra.uas.model.StudentAccount;
import edu.fra.uas.service.NotendurchschnittRechnerService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


@SpringBootTest
public class HttpRequestTest {}
//    @Autowired
//    private NotendurchschnittbController notendurchschnittbController;
//
//    @Test
//    public void TestHttp() throws Exception {
//        assertThat(notendurchschnittbController.(isNotNull());
//    }
//
//}

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class HttpRequestTest {


//    private int port;

//    @Autowired
//    private TestRestTemplate restTemplate;

//    @Test
//     void shouldreturnListOfAllUser() throws Exception {
//        when()
//        …
//        .andExpect(view().name("messaging"))
//        .andExpect(model().attribute("listAllMessages", hasSize(5)))
//        .andExpect(model().attribute("toUser", "donald"))
//        .andDo(print());
//        }
//    }