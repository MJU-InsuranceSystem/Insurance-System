package org.example.user;

import java.util.Map;
import org.example.Contract;
import org.example.common.AuthGuideMessage;
import org.example.IncomeInfo;

/**
 * @author USER
 * @version 1.0
 */
public class Customer extends User {

  private int familyHistory;
  private IncomeInfo IncomeInfo;
  private Contract m_ontract;

  public Customer() {

  }

  public Customer(String name, String age, String sex, String phoneNumber, String id, String password) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.phoneNumber = phoneNumber;
    this.id = id;
    this.password = password;
  }

  public static Customer create(Map<String, String> authInfo) {
    String name = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);
    String age = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);
    String sex = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);
    String phoneNumber = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);
    String id = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);
    String password = authInfo.get(AuthGuideMessage.AUTH_NAME_KEY);

    return new Customer(name, age, sex, phoneNumber, id, password);
  }

  public void applyComplaint() {

  }

  public void applyConsultation() {

  }

  public void claimlnsuranceMoney() {

  }

  public void dropComplaint() {

  }

  public void evaluateComplaint() {

  }

  public void pay() {

  }

  public void signUplnsurance() {

  }

  public void updateComplaint() {

  }

}