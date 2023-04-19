CREATE TABLE Kino
(
    telefon BIGINT NOT NULL,
    film VARCHAR(255) NOT NULL,
    antall int NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    epostadresse VARCHAR(255) NOT NULL
    PRIMARY KEY (telefon)
);