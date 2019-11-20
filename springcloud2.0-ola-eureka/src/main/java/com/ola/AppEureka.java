/**
 * 
 */
package com.ola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 下午2:31:19  
 * @版本：V1.0  
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {
public static void main(String[] args) {
	SpringApplication.run(AppEureka.class, args);
}
}
