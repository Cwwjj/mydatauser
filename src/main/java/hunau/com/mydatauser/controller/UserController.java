package hunau.com.mydatauser.controller;

import hunau.com.mydatauser.Dao.UserDao;
import hunau.com.mydatauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
@Controller

public class UserController {
    // @Resource
    //private UserDao userDao;
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    public String Query(Model model){

        model.addAttribute("users", userService.findBy("小吴"));
        return "query";
    }

    @RequestMapping("showUser/{id}")
    public String showUser(@PathVariable int id,Model model){
        model.addAttribute("name",userService.selectUser(id).toString());
        return "showuser";
    }
}