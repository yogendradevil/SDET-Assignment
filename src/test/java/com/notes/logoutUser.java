package com.notes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.ParseException;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class logoutUser {
	String token;
	BaseClass obj = new BaseClass();
	@BeforeTest
	public void login() {
		token = obj.createToken("yogibijapur@gmail.com", "admin@123");
	}
	@Test
	  public void logoutUser() 
	  {
		 obj.logoutUser(token);
	  }
}
