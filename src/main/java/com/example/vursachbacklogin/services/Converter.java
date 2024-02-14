package com.example.vursachbacklogin.services;

import com.example.vursachbacklogin.dto.response.UserResponseDTO;
import com.example.vursachbacklogin.entity.User;

import java.util.Objects;

public class Converter {

    // User to UserResponseDto
    public UserResponseDTO UserToUserResponseDTO(User user) {
        return UserResponseDTO.builder()
                .id(user.getId())
                .phone(user.getPhone())
                .firstName(user.getFirstName())
                .secondName(user.getSecondName())
                .thirdName(user.getThirdName())
                .qualification(user.getQualification())
                .lastEntry(user.getLastEntry())
                .role(user.getRole())
                .organization(user.getOrganization()).build();
    }
}
