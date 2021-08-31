package com.quoctoanphamtoan.postservice.controller;

import com.quoctoanphamtoan.postservice.common.dto.UserDto;
import com.quoctoanphamtoan.postservice.component.Feign.UserComponent;
import com.quoctoanphamtoan.postservice.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final UserComponent userComponent;
    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id){
        UserDto userDto  = userComponent.getUserById(id);
        return new Post(userDto.getId(),userDto.getName(),userDto.getAge(),"Ahihi",12,12);
    }
}
