package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.model.LoginPojo;

public class LoginService {
  public LoginPojo validateLogin(LoginPojo loginpojo)
  {
 
 LoginDao logindao = new LoginDao();
// LoginPojo loginpojo =logindao.validateLogin(loginpojo);
 LoginPojo returnLoginPojo=logindao.validateLogin(loginpojo);

/* String result=null;
 if(userName.equals("admin") && password.equals("admin"))
 {
 result= "success";
 
 }
 else
 {
 result = "failure";
 }*/
 return returnLoginPojo;
 
 
  }
 
}