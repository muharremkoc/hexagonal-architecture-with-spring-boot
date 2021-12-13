package com.example.hexagonalarchitectureinspringboot.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SocialMediaFriendShipDTO {

    @Id
    String userName;
    int countFriends;
}
