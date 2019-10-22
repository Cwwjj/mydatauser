package hunau.com.mydatauser.Dao;

import hunau.com.mydatauser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
@Mapper
@Repository
public interface UserDao {
    @Select("select id,name,pwd,sexy,birthday,isuse from tb_user where name like'%${value}%'")
        //@Transactional(readOnly = true)
    List<User> findBy(String name);

    @Select("select id,name,pwd,sexy,birthday,isuse from tb_user where id=#{id}")
    User selectUser(int id);
}
