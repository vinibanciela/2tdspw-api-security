package br.com.fiap.apisecurity.service;

import br.com.fiap.apisecurity.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;

}
