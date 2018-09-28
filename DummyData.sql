INSERT INTO academicdb.school (id_school, name, street) VALUES (1, 'School 1', 'C/ num 1');
INSERT INTO academicdb.school (id_school, name, street) VALUES (2, 'School 2', 'C/ num 2');
INSERT INTO academicdb.school (id_school, name, street) VALUES (3, 'School 3', 'C/ num 3');

INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (1, 1, 'Course 1', 1);
INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (2, 2, 'Course 2', 2);
INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (3, 4, 'Course 3', 1);
INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (4, 3, 'Course 4', 3);
INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (5, 2, 'Course 5', 2);
INSERT INTO academicdb.course (id_course, grade, name, id_school) VALUES (6, 1, 'Course 6', 1);

INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (1, 100, true, 'Subject 1');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (2, 24, true, 'Subject 2');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (3, 33, false, 'Subject 3');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (4, 66, true, 'Subject 4');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (5, 111, true, 'Subject 5');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (6, 666, false, 'Subject 6');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (7, 22, true, 'Subject 7');
INSERT INTO academicdb.subject (id_subject, hours, mandatory, name) VALUES (8, 11, false, 'Subject 8');

INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (1, 3);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (2, 3);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (4, 3);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (3, 4);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (2, 5);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (1, 6);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (3, 7);
INSERT INTO academicdb.course_subject (course_id, subject_id) VALUES (3, 8);