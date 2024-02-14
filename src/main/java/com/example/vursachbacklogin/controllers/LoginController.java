package com.example.vursachbacklogin.controllers;

import com.example.vursachbacklogin.dto.request.UserRequestDTO;
import com.example.vursachbacklogin.dto.response.UserResponseDTO;
import com.example.vursachbacklogin.entity.User;
import com.example.vursachbacklogin.services.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:4200")
@RestControllerAdvice
@Tag(name = "LOGIN API")
public class LoginController {
    @Autowired
    LoginService loginService;
    @Operation(summary = "",
            description = "")
    @PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDTO GetExerciseWithInventoryAndImg(@RequestBody UserRequestDTO userRequestDTO)
    {
        return loginService.Authorise(userRequestDTO);
    }
}
