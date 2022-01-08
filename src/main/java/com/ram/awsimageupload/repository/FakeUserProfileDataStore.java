package com.ram.awsimageupload.datastore;

import com.ram.awsimageupload.userprofile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FackUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "test1", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "test2", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "test3", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
