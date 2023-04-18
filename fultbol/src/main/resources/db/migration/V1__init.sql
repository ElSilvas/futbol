CREATE TABLE IF NOT EXISTS Player (
    id SERIAL,
    nui VARCHAR (13) NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    address VARCHAR (50),
    PRIMARY KEY (id)
    );