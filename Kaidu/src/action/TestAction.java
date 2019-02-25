package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.User;
import service.TestService;

public class TestAction extends ActionSupport implements ModelDriven<User> {


    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    //模型驱动
    private User user=new User();
    @Override
    public User getModel() {
        return user;
    }

    public String test(){
        System.out.println("接收到struts测试请求");
        testService.add(user);
        return SUCCESS;
    }


}
