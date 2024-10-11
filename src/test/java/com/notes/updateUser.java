package com.notes;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateUser {
	String token;
	BaseClass obj = new BaseClass();
	@BeforeTest
	public void login() {
//		obj.Create_New_User("accountDel", "delaccount@gmail.com", "test@123");
		token = obj.createToken("delaccount@gmail.com", "test@123");
	}
	@Test
	  public void logoutUser() throws IOException, ParseException 
	  {
		obj.updateUser(token);
	  }
}
