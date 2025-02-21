package https.github.com.Danny_Rodriguez.rest_consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getJoke() {
        String url = UriComponentsBuilder.fromUriString("https://official-joke-api.appspot.com/random_joke")
                                         .toUriString();
        return restTemplate.getForObject(url, String.class);
    }
}
