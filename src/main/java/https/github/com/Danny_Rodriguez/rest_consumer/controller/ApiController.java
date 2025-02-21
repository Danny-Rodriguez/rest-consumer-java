package https.github.com.Danny_Rodriguez.rest_consumer.controller;

import https.github.com.Danny_Rodriguez.rest_consumer.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/joke")
    public String getJoke() {
        return apiService.getJoke();
    }
}
