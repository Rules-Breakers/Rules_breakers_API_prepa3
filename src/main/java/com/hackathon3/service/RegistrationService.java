package com.hackathon3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    /**Aza kitiana aloha
    private final UsersRepo usersRepo;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final static String User_error = "user with name %s not found";

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return usersRepo.findByName(name)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(User_error, name)));
    }

    public String signUp(Users appUser) {
        boolean exist = usersRepo.findByName(appUser.getName())
                .isPresent();
        if (exist) {
            throw new IllegalStateException("name already taken please add number");
        }
        System.out.println(appUser.getPassword());
        String encryptpassword = bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(encryptpassword);
        usersRepo.save(appUser);
        return "encryptpassword";
    } */
}
