package com.goodskill.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务启动类
 * Created by techa03 on 2017/2/3.
 *
 * @author techa
 */
@SpringBootApplication(scanBasePackages = {
        "com.goodskill.service.**",
        "com.goodskill.common.core",
})
@EnableTransactionManagement
@MapperScan("com.goodskill.service.mapper")
@EnableDiscoveryClient
@EnableFeignClients({"com.goodskill.order.api", "com.goodskill.es.api"})
@RestController
public class SeckillApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SeckillApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }


}
