package com.example.springopenapirest.service;

import com.example.springopenapirest.jpa.model.User;
import com.example.springopenapirest.mapper.UserMapper;
import com.example.web.dto.FindUserRequest;
import com.example.web.dto.UserCreateRequest;
import com.example.web.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;


    public UserResponse createUser(UserCreateRequest userCreateRequest) {
         User user = new User();
         user.setName(userCreateRequest.getName());
         user.setPhone(userCreateRequest.getPhone());

         userRepository.save(user);
        return UserMapper.INSTANCE.toDto(user);
    }

    public List<UserResponse> findUsers(FindUserRequest userParams) {
        return userRepository.findUserByName(userParams.getName())
                .stream()
                .map(UserMapper.INSTANCE::toDto)
                .collect(Collectors.toList());

    }


}
