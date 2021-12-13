package com.example.hexagonalarchitectureinspringboot.ports.output;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;

public interface SaveUserPort {
    void save(SocialMediaFriendShip socialMediaFriendShip);
}
