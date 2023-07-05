package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlus03DmlRelatedOperationApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll(){
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testSave(){
        User user = new User();
        user.setName("测试3");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }
    @Test
    void testDeleteById(){
        userDao.deleteById(2L);
    }


    @Test
    void testDelete(){
        /*List<Long> list = new ArrayList<>();
        list.add(1676495750012936194L);
        list.add(1676498547563364353L);
        list.add(1676498672004145153L);
        userDao.deleteBatchIds(list);*/


        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        userDao.selectBatchIds(list);
    }

    @Test
    void testUpdate(){
        /*User user = new User();
        user.setId(3L);
        user.setName("Jock666");
        user.setVersion(1);
        userDao.updateById(user);*/


        /*//1. Retrieve the current data by querying the data using the id of the data to be modified.
        User user2 = userDao.selectById(3L);

        // 2. Set the desired modifications to the properties one by one.
        user2.setName("Jock888");
        userDao.updateById(user2);*/

        // Simulate Seckill
        User user = userDao.selectById(3L);  //version = 2
        User user2 =userDao.selectById(3L);  //version = 2

        user2.setName("Jock aaa");
        userDao.updateById(user2);    //version = 3

        user.setName("Jock bbb");
        userDao.updateById(user);    //version=3 ?



    }



}
