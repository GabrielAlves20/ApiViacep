package com.example.TesteDeApi;

import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/api/cep")
public class TesteDeApiController {

    private final TesteDeApiService testeDeApiService;

    public TesteDeApiController(TesteDeApiService testeDeApiService) {
        this.testeDeApiService = testeDeApiService;
    }

    @GetMapping("/{cep}")
    public Map<String, Object> getCep(@PathVariable String cep) {
        return testeDeApiService.consultarCep(cep);
    }
}
