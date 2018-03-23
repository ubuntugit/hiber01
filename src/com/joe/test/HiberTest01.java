package com.joe.test;

import com.joe.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author: joe
 * @time: 2018/3/23 22:39
 * @mail: yuanzhao98@gmail.com
 */
public class HiberTest01 {
    @Test
    public void demo1() {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

//        相关操作数据库
        Customer customer = new Customer();
        customer.setCust_name("小王");
        customer.setCust_source("网络推广");

        session.save(customer);

        tx.commit();
        session.close();
    }
}
