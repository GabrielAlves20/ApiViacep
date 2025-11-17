# Avaliação de Desempenho da API REST - ViaCEP

Este projeto tem como objetivo avaliar o desempenho da API REST implementada para consultar o ViaCEP, medindo diversos parâmetros de desempenho, incluindo tempo de resposta, taxa de transferência, erro percentual, conexões ativas e pico de conexões.

## Endpoint Testado

`http://localhost:8080/cep?cep=01001000`

## Parâmetros do Teste

- **Number of Threads**: 10 (Número de usuários simultâneos)
- **Ramp-Up Period**: 0 segundos (Tempo para iniciar os usuários)
- **Loop Count**: 2000 (Número total de iterações para cada thread)

## Resultados do Teste

### Tempo de Resposta

- **Tempo de Resposta Médio**: 217 ms
- **Tempo de Resposta Mínimo**: 122 ms
- **Tempo de Resposta Máximo**: 20282 ms
- **Throughput**: 46.0 requisições/segundo

![Summary Report](images/Summary%20Report.png)

### Erro Percentual

- **Error %**: 0.36%  
No final das requisições, o IP foi bloqueado para fazer requisições.

### Pico de Conexões Ativas

O gráfico a seguir mostra que o número de **Active Threads** (conexões ativas) atingiu entre 45 e 50 durante o teste. Esse pico ocorreu entre **00:13:25** e **00:14:55**, indicando um período em que o servidor estava sob carga máxima.
<img width="1129" height="136" alt="image" src="https://github.com/user-attachments/assets/841839ab-8c2d-4dbf-b3d3-5c2471906230" />


## Gráficos de Desempenho

### Taxa de Transferência (Throughput)

A taxa de transferência foi medida durante o teste e pode ser visualizada nos relatórios a seguir.

46.0 /sec

### Resultados em Tabela

Os resultados detalhados de cada requisição podem ser encontrados na tabela abaixo.

<img width="1142" height="63" alt="image" src="https://github.com/user-attachments/assets/a841c1c3-5b0a-47b1-a3ab-0956a6938ef8" />



## Conclusão

Os testes realizados mostram que a API REST para consulta ao ViaCEP apresenta um desempenho razoável sob carga, com um erro percentual muito baixo. No entanto, o bloqueio do IP sugere que pode haver limites de requisição a serem considerados ao fazer testes de carga mais intensos.

