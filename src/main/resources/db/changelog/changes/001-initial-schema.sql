CREATE TABLE user_card
(
    id      BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    card_id BIGINT NOT NULL,
    amount  SERIAL NOT NULL,
    PRIMARY KEY (id)
);
