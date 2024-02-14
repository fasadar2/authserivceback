package com.example.vursachbacklogin.services;

import com.example.vursachbacklogin.dto.request.UserRequestDTO;
import com.example.vursachbacklogin.dto.response.UserResponseDTO;
import com.example.vursachbacklogin.repsoitory.UserRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    // region Autowired
    private final UserRepos userRepos;

    //endregion
    public UserResponseDTO Authorise(UserRequestDTO userRequestDTO)
    {
        final Converter converter = new Converter();
        return converter.UserToUserResponseDTO(userRepos.getUserByLoginAndPassword(userRequestDTO.getLogin(), userRequestDTO.getPassword()));
    }
}
