package userbean;
import java.io.*;

/**
 * Created by Administrator on 2017/7/26.
 */
public class userbean implements Serializable {
    private String name;
    private String sex;
    private int age;
    private String account;
    private String password;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAccount(){
        return this.account;
    }
    public void setAccount(String account){
        this.account=account;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
