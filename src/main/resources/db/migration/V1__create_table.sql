DROP TABLE IF EXISTS currency;

CREATE TABLE currency (
    id bigserial NOT NULL,
    name varchar(64) NOT NULL,
    symbol varchar(10) NOT NULL,
    amount decimal(40, 20),
    PRIMARY KEY (id)
)