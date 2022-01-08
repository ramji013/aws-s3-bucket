package com.ram.awsimageupload.datastore;

import com.ram.awsimageupload.userprofile.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {

    @GetMapping
    public List<UserProfile> getUserProfiles(){
        return null;
    }
}
