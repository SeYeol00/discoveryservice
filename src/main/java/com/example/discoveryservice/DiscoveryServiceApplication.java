package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 현재 프로젝트를 유레카 서버로 사용하겠다.
// 유레카 서버 -> 각 서비스들의 정보를 모아둔 로드벨런서 바로 뒤에 있는 집합 서버
// 여기에서 로드 벨런싱을 통해 서비스 서버로 데이터를 전송할 예정이다.
@EnableEurekaServer
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

}
