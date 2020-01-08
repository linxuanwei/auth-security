package org.seven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Seven.Lin
 * @date 2019/12/30 20:54
 */
@SpringBootApplication
@MapperScan(basePackages = "org.seven.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
