package com.example.springopenapirest.mapper;

import com.example.springopenapirest.jpa.model.User;
import com.example.web.dto.UserResponse;
import com.example.web.dto.UserResponse.UserResponseBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-14T00:47:52+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (BellSoft)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.name( user.getName() );
        userResponse.phone( user.getPhone() );

        return userResponse.build();
    }
}
