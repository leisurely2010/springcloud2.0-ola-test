/**
 * 
 */
package com.ola.api.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.ola.api.service.IMemberService;

/**  
 * @类功能说明：    
 * @作者：Administrator  
 * @创建时间：2019年11月20日 下午3:56:25  
 * @版本：V1.0  
 */
@FeignClient("app-itmayiedu-member")
public interface MemberServiceFeign extends IMemberService{

}
