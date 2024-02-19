package com.bolszowka.usercardmanager;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AddCardDto {

    Long userId;
    Long cardId;
    Integer amount;
}
