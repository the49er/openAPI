package com.example.springopenapirest.contoller;

import com.example.springopenapirest.service.UserService;
import com.example.web.controller.UserApi;
import com.example.web.dto.FindUserRequest;
import com.example.web.dto.UserCreateRequest;
import com.example.web.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class UserController implements UserApi {
    private final UserService userService;

    @Override
    public ResponseEntity<UserResponse> createUser(UserCreateRequest userCreateRequest) {
        UserResponse userResponse = userService.createUser(userCreateRequest);
        return ResponseEntity.ok(userResponse);
    }

    @Override
    public ResponseEntity<List<UserResponse>> findUsers(FindUserRequest userParams) {
        List<UserResponse> result = userService.findUsers(userParams);
        return ResponseEntity.ok(result);
    }


}
