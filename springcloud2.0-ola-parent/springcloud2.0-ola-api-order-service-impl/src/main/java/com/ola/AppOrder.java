/**
 * 
 */
package com.ola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 下午4:00:00  
 * @版本：V1.0  
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
public class AppOrder {
	public static void main(String[] args) {
		SpringApplication.run(AppOrder.class, args);
	}
}
