package com.example.hexagonalarchitectureinspringboot.service;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;
import com.example.hexagonalarchitectureinspringboot.ports.input.AddFriendUseCase;
import com.example.hexagonalarchitectureinspringboot.ports.input.BlockFriendUseCase;
import com.example.hexagonalarchitectureinspringboot.ports.output.GetUserPort;
import com.example.hexagonalarchitectureinspringboot.ports.output.SaveUserPort;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class SocialMediaService implements AddFriendUseCase, BlockFriendUseCase {

    GetUserPort getUserPort;
    SaveUserPort saveUserPort;

    @Override
    public void AddFriend(String userName, int count) {
        SocialMediaFriendShip socialMediaFriendShip = getUserPort.load(userName);


        socialMediaFriendShip.addFriend(count);
        saveUserPort.save(socialMediaFriendShip);
    }

    @Override
    public boolean blockFriend(String userName, int count) {
        SocialMediaFriendShip socialMediaFriendShip= getUserPort.load(userName);
        boolean isBlocked=socialMediaFriendShip.isBlockeFriend(count);
        if (isBlocked){
            saveUserPort.save(socialMediaFriendShip);
        }
        return isBlocked;
    }
}
