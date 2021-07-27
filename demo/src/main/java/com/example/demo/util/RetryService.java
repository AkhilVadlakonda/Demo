package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.ArticleUsersResponse;

@Component
public class RetryService {
	@Autowired
    private RestTemplate customRestTemplate;

	public ResponseEntity<ArticleUsersResponse> hackerrankCall(String url, HttpEntity<Object> requestEntity) {
		 return customRestTemplate.exchange(url, HttpMethod.GET, requestEntity, ArticleUsersResponse.class);
	}
}
