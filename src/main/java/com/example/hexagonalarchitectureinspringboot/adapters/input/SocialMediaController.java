package com.example.hexagonalarchitectureinspringboot.adapters.input;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;
import com.example.hexagonalarchitectureinspringboot.ports.input.AddFriendUseCase;
import com.example.hexagonalarchitectureinspringboot.ports.input.BlockFriendUseCase;
import com.example.hexagonalarchitectureinspringboot.ports.output.GetUserPort;
import com.example.hexagonalarchitectureinspringboot.ports.output.SaveUserPort;
import com.example.hexagonalarchitectureinspringboot.service.SocialMediaService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/socialMedia")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SocialMediaController {
    final AddFriendUseCase addFriendUseCase;
    final BlockFriendUseCase blockFriendUseCase;
    final SaveUserPort socialMediaPort;
    final GetUserPort socialMediaGetPort;


    @PostMapping(value = "/addFriend/{count}")
    void addFriend(@RequestParam final String userName, @PathVariable("count") int count){
        addFriendUseCase.AddFriend(userName, count);
    }
    @PostMapping(value = "/blockeFriend/{count}")
    void blockFriend(@RequestParam final String userName, @PathVariable("count") final int count) {
        blockFriendUseCase.blockFriend(userName, count);
    }

    @PostMapping(value = "/save/user")
    void saveUser(@RequestParam final String userName, @RequestParam final int count) {
        SocialMediaFriendShip socialMediaFriendShip=new SocialMediaFriendShip(userName,count);
        socialMediaPort.save(socialMediaFriendShip);
    }


}
