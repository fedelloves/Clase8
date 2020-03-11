package com.codenotfound.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {

  private String userName;
  private String password;
  
  public LoginBean(){
      System.out.println("Construyendo el bean");
  }
  
  public String login(){
      System.out.println("Login execution");
      if("admin".equals(userName) && "123456".equals(password)){
          return "welcome";
      }else{
          return "index";
      }
  }
  
  public String logout() {
      return "";
  }

    public String getUserName() {
        System.out.println("Username getter");
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Username setter");
        this.userName = userName;
    }

    public String getPassword() {
        System.out.println("Password getter");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("Password setter");
        this.password = password;
    }
}
