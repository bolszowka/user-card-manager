package com.bolszowka.usercardmanager;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserCardMapper {

    public static UserCardEntity toEntity(AddCardDto dto) {
        return UserCardEntity.builder()
                .userId(dto.getUserId())
                .cardId(dto.getCardId())
                .amount(dto.getAmount())
                .build();
    }
}
