CREATE TABLE race_car (
    id long NOT NULL,
    nickname character varying(256),
    model character varying(256),
    year character varying(256),
    owner character varying(256),
    status character varying(30),
    topSpeed integer,
    PRIMARY KEY (id)
);

CREATE SEQUENCE car_id_seq INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;