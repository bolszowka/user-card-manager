package com.bolszowka.usercardmanager;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserCardManagerController {

    private final UserCardManagerService userCardManagerService;

    @PostMapping("/card")
    public void addCard(List<AddCardDto> cards) {
        userCardManagerService.addCards(cards);
    }
}
