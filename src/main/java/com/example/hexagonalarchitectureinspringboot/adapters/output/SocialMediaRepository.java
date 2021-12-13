package com.example.hexagonalarchitectureinspringboot.adapters.output;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;
import com.example.hexagonalarchitectureinspringboot.mapper.SocialMediaMapper;
import com.example.hexagonalarchitectureinspringboot.ports.output.GetUserPort;
import com.example.hexagonalarchitectureinspringboot.ports.output.SaveUserPort;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SocialMediaRepository implements GetUserPort, SaveUserPort {

    final SocialMediaMapper socialMediaMapper;
    final SocialMediaJpaRepository socialMediaJpaRepository;

    @Override
    public SocialMediaFriendShip load(String userName) {
        SocialMediaFriendShip socialMediaFriendShip=socialMediaMapper.mediaFriendShipToMediaFriendShipDTO(socialMediaJpaRepository.findById(userName).orElseThrow(NoSuchElementException::new));
            return socialMediaFriendShip;
    }

    @Override
    public void save(SocialMediaFriendShip socialMediaFriendShip) {
       socialMediaJpaRepository.save(socialMediaMapper.mediaFriendShipDTOToMediaFriendShip(socialMediaFriendShip));
    }
}
