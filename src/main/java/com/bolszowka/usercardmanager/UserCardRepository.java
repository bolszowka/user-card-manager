package com.bolszowka.usercardmanager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCardRepository extends JpaRepository<UserCardEntity, Long> {
}
