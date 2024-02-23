package com.bolszowka.usercardmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "card")
public class UserCardEntity {

    @Id
    private Long id;
    private Long userId;
    private Long cardId;
    private Integer amount;

}
