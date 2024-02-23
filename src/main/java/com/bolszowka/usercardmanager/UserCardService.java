package com.bolszowka.usercardmanager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCardManagerService {

    public void addCards(List<AddCardDto> cards) {
        //TODO add logic: if card exists -> update amount, else -> add new card
    }
}
