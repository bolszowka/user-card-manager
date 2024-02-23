package com.bolszowka.usercardmanager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCardService {

    private final UserCardRepository userCardRepository;

    public void addCards(List<AddCardDto> cards) {
        //TODO add logic: if card exists -> update amount, else -> add new card
        userCardRepository.saveAll(
                cards.stream()
                        .map(UserCardMapper::toEntity)
                        .toList()
        );
    }
}
