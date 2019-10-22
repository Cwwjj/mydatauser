package hunau.com.mydatauser.service;

/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
import hunau.com.mydatauser.entity.User;
import hunau.com.mydatauser.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User selectUser(int id){
        return userDao.selectUser(id);
    }

    public List<User> findBy(String name){
        return userDao.findBy(name);
    }
}