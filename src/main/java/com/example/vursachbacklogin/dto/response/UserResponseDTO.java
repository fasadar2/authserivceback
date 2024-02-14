package com.example.vursachbacklogin.dto.response;

import com.example.vursachbacklogin.entity.Organization;
import com.example.vursachbacklogin.entity.Qualification;
import com.example.vursachbacklogin.entity.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Schema(description = "")
@AllArgsConstructor
@Builder
@NoArgsConstructor(force = true)
public class UserResponseDTO {
    private final int id;
    private final String firstName;
    private final String secondName;
    private final String thirdName;
    private final String phone;
    private final LocalDate lastEntry;
    private final Role role;
    private final Organization organization;
    private final Qualification qualification;
}
