package br.ce.rafael.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class OlaMundo {

	public static void main(String[] args) {
		Response request = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		System.out.println(request.getBody().asString());
	}
	
}
