package com.example.hexagonalarchitectureinspringboot.ports.output;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;


public interface GetUserPort {
   SocialMediaFriendShip load(String userName);
}
