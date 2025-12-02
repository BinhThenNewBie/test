package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    private final ProfileManager prfm = new ProfileManager();
    @Test // trả về NullReferenceException
    public void Profile_01(){
        assertThrows(NullPointerException.class, () -> {prfm.getName(null);});
    }
    @Test
    public void Profile_02(){
        Profile profile = new Profile("toitenlabinh");
        assertEquals("toitenlabinh",prfm.getName(profile));
    }
}