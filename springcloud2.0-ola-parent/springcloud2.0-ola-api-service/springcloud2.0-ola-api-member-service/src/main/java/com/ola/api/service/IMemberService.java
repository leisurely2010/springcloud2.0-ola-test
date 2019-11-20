/**
 * 
 */
package com.ola.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ola.api.entity.UserEntity;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 上午11:35:29  
 * @版本：V1.0  
 */
public interface IMemberService {
	@RequestMapping("/getMember")
	UserEntity getMember(@RequestParam("name") String name);
}
