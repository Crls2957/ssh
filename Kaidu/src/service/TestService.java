package service;

import dao.TestDao;
import entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TestService {


    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public void add(User user){
        System.out.println("执行Service操作...");
        testDao.add(user);
    }
}
