INSERT INTO users (login, password, role) VALUES ('mietek', 'mietek', 'CANDIDATE');
INSERT INTO users (login, password, role) VALUES ('bolek', 'bolek', 'CANDIDATE');
INSERT INTO users (login, password, role) VALUES ('heniek', 'heniek', 'CANDIDATE');
INSERT INTO users (login, password, role) VALUES ('rysiek', 'rysiek', 'EMPLOYER');
INSERT INTO users (login, password, role) VALUES ('zenek', 'zenek', 'EMPLOYER');
INSERT INTO users (login, password, role) VALUES ('wladek', 'wladek', 'EMPLOYER');
INSERT INTO users (login, password, role) VALUES ('admin', 'admin', 'ADMIN');

INSERT INTO candidate (user_id, first_name, last_name, age, hobbies, email) VALUES (1, 'Mieczysław', 'Mietkowski', 69, 'skoki na spadochronie', 'mietek@mietek.pl');
INSERT INTO candidate (user_id, first_name, last_name, age, hobbies, email) VALUES (2, 'Bolesław', 'Bolkowski', 69, 'jazda konna', 'bolek@bolek.pl');
INSERT INTO candidate (user_id, first_name, last_name, age, hobbies, email) VALUES (3, 'Henryk', 'Henrykowski', 69, 'jazda samochodem', 'heniek@heniek.pl');

INSERT INTO employer (user_id, name, email, location, employees_count) VALUES (4, 'Programowanie u Ryśka', 'uryska@uryska.pl', 'Warszawa', 5);
INSERT INTO employer (user_id, name, email, location, employees_count) VALUES (5, 'Zenek programming', 'zenekpr@zenekpr.pl', 'Kraków', 10);
INSERT INTO employer (user_id, name, email, location, employees_count) VALUES (6, 'Kołchoz u Władka', 'kołchoz@kołchoz.pl', 'Warszawa', 150);

INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (1, 'Koder', 'Miękkie kodowanie', 'UoP', 'Multisport', 1000, 2000);
INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (1, 'Ostry koder', 'Ostre kodowanie', 'B2B', 'Multisport', 1500, 2500);
INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (2, 'Programista java', 'Ostre kodowanie bez trzymanki', 'UoP', 'Luxmed', 2000, 3000);
INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (2, 'Haker', 'Ostre Hakowanie', 'Dzieło', 'brak', 3000, 3500);
INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (3, 'System Architect', 'Ostre kodowanie', 'Zlecenie', 'brak', 10000, 20000);
INSERT INTO job (employer_id, title, description, conditions, benefits, salary_low, salary_high) VALUES (3, 'Tester', 'Ostre kodowanie', 'B2B', 'Multisport', 5000, 10000);

INSERT INTO skill (name) VALUES ('java');
INSERT INTO skill (name) VALUES ('spring');
INSERT INTO skill (name) VALUES ('hibernate');
INSERT INTO skill (name) VALUES ('postgresql');
INSERT INTO skill (name) VALUES ('maven');
INSERT INTO skill (name) VALUES ('gradle');
INSERT INTO skill (name) VALUES ('mockito');
INSERT INTO skill (name) VALUES ('junit');