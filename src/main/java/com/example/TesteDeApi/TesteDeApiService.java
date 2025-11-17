package com.example.TesteDeApi;
    import org.springframework.stereotype.Service;
    import org.springframework.web.client.RestTemplate;

    import java.util.Map;

    @Service
    public class TesteDeApiService {

        private final RestTemplate restTemplate = new RestTemplate();

        public Map<String, Object> consultarCep(String cep) {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            return restTemplate.getForObject(url, Map.class);
        }
    }
