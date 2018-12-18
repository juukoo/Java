CREATE TABLE henkilo (
  henkiloID INTEGER NOT NULL PRIMARY KEY,
  henkilotunnus VARCHAR(11),
  etunimi VARCHAR(45) NOT NULL,
  sukunimi VARCHAR(255) NOT NULL
);

CREATE TABLE auto(
  rekisterinumero VARCHAR(10) NOT NULL PRIMARY KEY,
  merkki VARCHAR(255),
  omistaja INTEGER NOT NULL,
  FOREIGN KEY (omistaja) REFERENCES henkilo(henkiloID)
);