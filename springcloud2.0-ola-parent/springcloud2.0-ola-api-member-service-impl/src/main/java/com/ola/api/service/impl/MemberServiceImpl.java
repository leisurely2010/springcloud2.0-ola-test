/**
 * 
 */
package com.ola.api.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ola.api.entity.UserEntity;
import com.ola.api.service.IMemberService;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 上午11:57:03  
 * @版本：V1.0  
 */
@RestController
public class MemberServiceImpl implements IMemberService{

	/* (non-Javadoc)
	 * @see com.ola.api.service.IMemberService#getMember(java.lang.String)
	 */
	@RequestMapping("/getMember")
	public UserEntity getMember(String name) {
		UserEntity userEntity=new UserEntity();
		userEntity.setName(name);
		userEntity.setAge(20);
		return userEntity;
	}

}
