package com.example.deployment2test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final UserProfile userProfile;

    @GetMapping("/user")
    public UserResponse getUserProfile() {
        UserResponse profile = new UserResponse();
        profile.setName(userProfile.getName());
        profile.setAge(userProfile.getAge());
        profile.setGender(userProfile.getGender());

        return profile;
    }
}
