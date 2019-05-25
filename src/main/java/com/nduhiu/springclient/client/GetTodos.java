package com.nduhiu.springclient.client;

import org.springframework.web.client.RestTemplate;

public class GetTodos {
    private static void getTodos()
    {
        final String url = "https://jsonplaceholder.typicode.com/todos";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);
    }
}
