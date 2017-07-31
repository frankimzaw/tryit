package userbean;

/**
 * Created by Administrator on 2017/7/27.
 */
public class checkbean {
    private userbean user;
    public checkbean(){

    }
    public checkbean(userbean user){
        this.user=user;
    }
    public userbean getUser(){
        return this.user;
    }
    public void setUser(userbean user){
        this.user=user;
    }
    public boolean validate(){
        if(user.getAccount().equals("Frankim")&&user.getPassword().equals("aa111555"))
            return true;
        else
            return false;
    }
}
