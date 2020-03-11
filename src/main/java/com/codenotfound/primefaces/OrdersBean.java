package com.codenotfound.primefaces;

import com.codenotfound.model.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class OrdersBean {
    
  private List<Order> orders = new ArrayList<>();

  @PostConstruct  
  public void initialize(){
      //Aca hariamos el llamado HTTP (Jersey Client)
      orders.add(new Order(1, "abc"));
      orders.add(new Order(2, "efg"));
      
      
  }
  
  
  
  
  /*
  public OrdersBean(){
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

  

  public String showGreeting() {
    return "Hello " + firstName + " " + lastName + "!";
  }

  public void onClick(){
    System.out.println("click ...");
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

*/

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
