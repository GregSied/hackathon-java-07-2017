DROP SCHEMA public CASCADE;
CREATE SCHEMA public;

CREATE TYPE role AS ENUM ('CANDIDATE', 'EMPLOYER', 'ADMIN');

CREATE TABLE users (
  id              BIGSERIAL NOT NULL PRIMARY KEY,
  login           TEXT NOT NULL,
  password        TEXT NOT NULL,
  role            TEXT NOT NULL
);

CREATE TABLE employer(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  user_id         BIGINT NOT NULL REFERENCES users (id),
  name            TEXT NOT NULL,
  email           TEXT NOT NULL,
  location        TEXT NOT NULL,
  employees_count INTEGER NOT NULL
);

CREATE TABLE candidate(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  user_id         BIGINT NOT NULL REFERENCES users (id),
  first_name      TEXT NOT NULL,
  last_name       TEXT NOT NULL,
  email           TEXT NOT NULL,
  age             INTEGER NOT NULL,
  hobbies         TEXT NOT NULL
);

CREATE TABLE job(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  employer_id      BIGINT NOT NULL REFERENCES employer (id),
  title           TEXT NOT NULL,
  description     TEXT NOT NULL,
  conditions      TEXT NOT NULL,
  benefits        TEXT NOT NULL,
  salary_low      INTEGER NOT NULL,
  salary_high     INTEGER NOT NULL
);

CREATE TABLE skill(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  name            TEXT NOT NULL
);

CREATE TABLE candidate_skill(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  id_candidate    BIGINT NOT NULL REFERENCES candidate (id),
  id_skill        BIGINT NOT NULL REFERENCES skill (id)
);

CREATE TABLE job_candidate (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  job_id BIGINT REFERENCES job (id),
  candidate_id BIGINT REFERENCES candidate (id)
);
CREATE TABLE messages (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  id_sender BIGINT,
  id_reciver BIGINT,
  text_message TEXT,
  time_send_message TIMESTAMP
);