package hunau.com.mydatauser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@MapperScan("hunau.com.mydatauser.Dao")
@EnableWebMvc
@SpringBootApplication
public class MydatauserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydatauserApplication.class, args);
    }

}
