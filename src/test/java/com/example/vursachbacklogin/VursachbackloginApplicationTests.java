package com.example.vursachbacklogin;

import com.example.vursachbacklogin.dto.request.UserRequestDTO;
import com.example.vursachbacklogin.dto.response.UserResponseDTO;
import com.example.vursachbacklogin.entity.Organization;
import com.example.vursachbacklogin.entity.Qualification;
import com.example.vursachbacklogin.entity.Role;
import com.example.vursachbacklogin.entity.User;
import com.example.vursachbacklogin.services.Converter;
import com.example.vursachbacklogin.services.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.LocalDate;

@SpringBootTest
class VursachbackloginApplicationTests {
    @Autowired
    LoginService loginService;
    @Test
    void TestConverterUserToDtoValidId()
    {
        Organization organization = new Organization();
        Qualification qualification = new Qualification();
        Role role = new Role();
        User user = User.builder()
                .id(1)
                .phone("89123644673")
                .login("login")
                .lastEntry(LocalDate.now())
                .organization(organization)
                .password("admin")
                .qualification(qualification)
                .role(role)
                .secondName("SecondName")
                .thirdName("ThirdName")
                .firstName("FirstName").firstName("FirstName").build();
        Converter converter = new Converter();
        Assertions.assertEquals(user.getId(),converter.UserToUserResponseDTO(user).getId());
    }
    @Test
    void TestConverterUserToDto()
    {
        Organization organization = new Organization();
        Qualification qualification = new Qualification();
        Role role = new Role();
        User user = User.builder()
                .id(1)
                .phone("89123644673")
                .login("login")
                .lastEntry(LocalDate.now())
                .organization(organization)
                .password("admin")
                .qualification(qualification)
                .role(role)
                .secondName("SecondName")
                .thirdName("ThirdName")
                .firstName("FirstName").build();
        Converter converter = new Converter();
        Assertions.assertNotNull(converter.UserToUserResponseDTO(user));
    }
    @Test
    void TestLoginSerivse(){
        UserRequestDTO userRequestDTO = UserRequestDTO.builder()
                .login("admin")
                .password("admin")
                .build();
        Assertions.assertEquals(1,loginService.Authorise(userRequestDTO).getId());
    }
}
