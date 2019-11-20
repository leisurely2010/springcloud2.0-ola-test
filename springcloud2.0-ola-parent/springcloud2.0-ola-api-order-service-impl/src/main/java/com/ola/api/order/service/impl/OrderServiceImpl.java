/**
 * 
 */
package com.ola.api.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ola.api.entity.UserEntity;
import com.ola.api.feign.MemberServiceFeign;
import com.ola.api.service.IOrderService;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 下午3:08:30  
 * @版本：V1.0  
 */
@RestController
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private MemberServiceFeign memberServiceFeign;
	/* (non-Javadoc)
	 * @see com.ola.api.service.IOrderService#orderToMember()
	 */
	@RequestMapping("/orderToMember")
	public String orderToMember(@RequestParam("name") String name) {
		UserEntity userentity=memberServiceFeign.getMember(name);
		return userentity==null?"未找到用户":userentity.toString();
	}

}
