package com.example.hexagonalarchitectureinspringboot.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Id;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
public class SocialMediaFriendShip {

    @Id
    String userName;
    int countFriends;

    public boolean isBlockeFriend(int count){
        if (countFriends>0){
            if (countFriends-count<0){
                countFriends=0;
            }else {
                countFriends-=count;
            }
        }
        return true;
    }
    public void addFriend(int count){
        countFriends+=count;
    }
}
