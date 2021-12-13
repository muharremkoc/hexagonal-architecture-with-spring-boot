package com.example.hexagonalarchitectureinspringboot.ports.output;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;

import java.util.Optional;

public interface GetUserPort {
   SocialMediaFriendShip load(String userName);
}
