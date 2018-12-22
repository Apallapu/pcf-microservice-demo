package com.ankamma.pcf.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ankamma.pcf.model.User;

@FeignClient("pcf-demo")
public interface UserFeignClient {
	@GetMapping("/user/list")
	public User getUsers();
}
