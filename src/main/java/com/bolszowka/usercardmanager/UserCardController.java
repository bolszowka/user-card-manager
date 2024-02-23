package com.bolszowka.usercardmanager;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserCardController {

    private final UserCardService userCardService;

    @PostMapping("/card")
    public void addCard(List<AddCardDto> cards) {
        userCardService.addCards(cards);
    }
}
