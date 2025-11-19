package iuh.fit.se.ramchaybe.services;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.SignedJWT;
import iuh.fit.se.ramchaybe.dtos.request.CustomerRegistrationRequest;
import iuh.fit.se.ramchaybe.dtos.request.LoginRequest;
import iuh.fit.se.ramchaybe.dtos.response.CustomerRegistrationResponse;
import iuh.fit.se.ramchaybe.dtos.response.LoginResponse;

import java.text.ParseException;

public interface AuthService {
    CustomerRegistrationResponse register(CustomerRegistrationRequest request);
    LoginResponse login(LoginRequest request) throws JOSEException;
    SignedJWT verify(String token) throws JOSEException, ParseException;
}
