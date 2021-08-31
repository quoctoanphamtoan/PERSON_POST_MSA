package com.quoctoanphamtoan.postservice.component.Feign;

import com.quoctoanphamtoan.postservice.common.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserComponent {
    @GetMapping("/user/{id}")
     UserDto getUserById(@PathVariable Long id);
}
