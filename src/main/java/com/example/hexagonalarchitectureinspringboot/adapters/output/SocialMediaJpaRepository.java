package com.example.hexagonalarchitectureinspringboot.adapters.output;

import com.example.hexagonalarchitectureinspringboot.domain.SocialMediaFriendShip;
import com.example.hexagonalarchitectureinspringboot.dto.SocialMediaFriendShipDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaJpaRepository extends JpaRepository<SocialMediaFriendShipDTO,String> {

}
