package com.example.vursachbacklogin.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
@Schema(description = "")
public class UserRequestDTO {
    @Schema(description = "Логин",example = "1")
    private final String login;
    @Schema(description = "Пароль",example = "1")
    private final String password;
}

