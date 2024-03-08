package com.example.vursachbacklogin.services;

import com.example.vursachbacklogin.Exceptions.AuthException;
import com.example.vursachbacklogin.dto.request.UserRequestDTO;
import com.example.vursachbacklogin.dto.response.UserResponseDTO;
import com.example.vursachbacklogin.entity.User;
import com.example.vursachbacklogin.repsoitory.UserRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LoginService {
    // region Autowired
    private final UserRepos userRepos;

    //endregion
    public UserResponseDTO Authorise(UserRequestDTO userRequestDTO)
    {
        String login = userRequestDTO.getLogin();
        String password = userRequestDTO.getPassword();
        User u = userRepos.getUserByLogin(login);
        final Converter converter = new Converter();
        if (Objects.isNull(u)){
            throw new UsernameNotFoundException("User not found");
        }
        else if (!u.getPassword().equals(password))
        {
            throw new UsernameNotFoundException("User password incorrect");
        }
        u.setLastEntry(LocalDate.now());
        userRepos.save(u);
        return converter.UserToUserResponseDTO(u);
    }
}
