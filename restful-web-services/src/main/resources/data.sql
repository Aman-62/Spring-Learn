INSERT INTO user_details(id,birth_date,name)
VALUES (1001, current_date(), 'Vishal');

INSERT INTO user_details(id,birth_date,name)
VALUES (1002, current_date(), 'Rahul');

INSERT INTO user_details(id,birth_date,name)
VALUES (1003, current_date(), 'Mohit');

INSERT INTO post(id,description,user_id)
VALUES (2001, 'I want to learn AWS', 1001);

INSERT INTO post(id,description,user_id)
VALUES (2002, 'I want to learn Spring', 1001);

INSERT INTO post(id,description,user_id)
VALUES (2003, 'I want to play football', 1002);

INSERT INTO post(id,description,user_id)
VALUES (2004, 'I want to go hiking', 1002);