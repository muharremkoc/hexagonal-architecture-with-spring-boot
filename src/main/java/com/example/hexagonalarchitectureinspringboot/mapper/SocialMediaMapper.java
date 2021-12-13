package com.example.hexagonalarchitectureinspringboot.mapper;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;
import com.example.hexagonalarchitectureinspringboot.dto.SocialMediaFriendShipDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SocialMediaMapper {
    public SocialMediaMapper(){
        super();
    }
    public SocialMediaFriendShipDTO mediaFriendShipDTOToMediaFriendShip(SocialMediaFriendShip socialMediaFriendShip){
        return SocialMediaFriendShipDTO.builder()
                .userName(socialMediaFriendShip.getUserName())
                .countFriends(socialMediaFriendShip.getCountFriends())
                .build();
    }
    public SocialMediaFriendShip mediaFriendShipToMediaFriendShipDTO(SocialMediaFriendShipDTO socialMediaFriendShipDTO){
        return new SocialMediaFriendShip(socialMediaFriendShipDTO.getUserName(),socialMediaFriendShipDTO.getCountFriends());
    }
}
