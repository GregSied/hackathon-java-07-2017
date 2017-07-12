DROP TABLE IF EXISTS employer;
DROP TABLE IF EXISTS candidate;
DROP TABLE IF EXISTS job;
DROP TABLE IF EXISTS skill;
DROP TABLE IF EXISTS candidate_skill;

CREATE TABLE employer(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  name            TEXT NOT NULL,
  email           TEXT NOT NULL,
  location        TEXT NOT NULL,
  employees_count INTEGER NOT NULL
);

CREATE TABLE candidate(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  first_name      TEXT NOT NULL,
  last_name       TEXT NOT NULL,
  email           TEXT NOT NULL,
  age             INTEGER NOT NULL,
  hobbies         TEXT NOT NULL
);

CREATE TABLE job(
  id              BIGSERIAL NOT NULL  PRIMARY KEY,
  id_employer     BIGINT NOT NULL REFERENCES employer (id),
  job_title       TEXT NOT NULL,
  job_description TEXT NOT NULL,
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