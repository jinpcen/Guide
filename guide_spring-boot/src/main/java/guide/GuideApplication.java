package guide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("guide.dao")
@EnableCaching
public class GuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuideApplication.class, args);
	}

}
