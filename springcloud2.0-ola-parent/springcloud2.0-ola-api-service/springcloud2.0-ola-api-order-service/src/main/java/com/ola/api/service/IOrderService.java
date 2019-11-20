/**
 * 
 */
package com.ola.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 下午3:04:35  
 * @版本：V1.0  
 */
public interface IOrderService {
	@RequestMapping("/orderToMember")
	public String orderToMember(String name);

}
