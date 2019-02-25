package dao;

import entity.User;
import org.hibernate.Hibernate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TestDao extends HibernateDaoSupport {

    public void add(User user){
        System.out.println("dao层执行...");
        System.out.println("添加用户名："+user.getName());
        System.out.println("添加密码："+user.getPasswd());

        this.getHibernateTemplate().save(user);
    }
}
