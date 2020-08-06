insert into tbl_hospital (id, name, created_at, created_by) values (1, 'Bernhard Inc', '2019-08-25', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (2, 'Leuschke, Klein and Berge', '2020-06-18', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (3, 'O''Connell-Wolff', '2019-11-05', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (4, 'Mante Inc', '2020-04-16', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (5, 'McKenzie-Wolf', '2020-01-12', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (6, 'Carroll-Breitenberg', '2020-06-04', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (7, 'Bartell-Zulauf', '2020-02-02', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (8, 'Rohan, Von and Steuber', '2020-02-23', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (9, 'Schumm-Hauck', '2019-12-04', 'ALPHA_1');
insert into tbl_hospital (id, name, created_at, created_by) values (10, 'Wilkinson Inc', '2020-06-10', 'ALPHA_1');

insert into tbl_doctor (id, name, last_name, birth_date, address, photo) values (1, 'Ottilie', 'De Gregorio', '1979-01-19', '14787 Carey Alley', 'http://dummyimage.com/109x154.jpg/ff4444/ffffff');
insert into tbl_doctor (id, name, last_name, birth_date, address, photo) values (2, 'Bonita', 'Whiteson', '1977-12-02', '4390 Sullivan Alley', 'http://dummyimage.com/227x122.bmp/5fa2dd/ffffff');
insert into tbl_doctor (id, name, last_name, birth_date, address, photo) values (3, 'Brandy', 'Handling', '1982-07-27', '1031 David Street', 'http://dummyimage.com/194x197.jpg/cc0000/ffffff');

INSERT INTO tbl_speciality (id, name, description, avatar) VALUES (1, 'Otorrinolaringologia', 'Se encarga del estudio de las enfermedades del oído, tanto auditivas como del equilibrio, de las vías respiratorias superiores y parte de las inferiores (nariz, senos paranasales, faringe y laringe).', 'http://dummyimage.com/231x137.bmp/cc0000/ffffff');
INSERT INTO tbl_speciality (id, name, description, avatar) VALUES (2, 'Neurologia', 'Trata los trastornos del sistema nervioso. Específicamente se ocupa de la prevención, diagnóstico, tratamiento y rehabilitación de todas las enfermedades que involucran al sistema nervioso central, periférico y el autónomo.', 'http://dummyimage.com/228x184.png/5fa2dd/ffffff');
INSERT INTO tbl_speciality (id, name, description, avatar) VALUES (3, 'Cardiologia', 'Se encarga del estudio, diagnóstico y tratamiento de las enfermedades del corazón y del aparato circulatorio. Es médica, pero no quirúrgica.', 'http://dummyimage.com/115x230.png/5fa2dd/ffffff');

insert into tbl_doctor_speciality (doctor_id, speciality_id) values (3, 1);
insert into tbl_doctor_speciality (doctor_id, speciality_id) values (1, 2);
insert into tbl_doctor_speciality (doctor_id, speciality_id) values (2, 1);
insert into tbl_doctor_speciality (doctor_id, speciality_id) values (2, 3);
insert into tbl_doctor_speciality (doctor_id, speciality_id) values (1, 2);
insert into tbl_doctor_speciality (doctor_id, speciality_id) values (1, 2);

insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (1, 'Sibley', 'Challace', '1980-09-11', '103 Arrowood Way', 'http://dummyimage.com/148x100.bmp/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (2, 'Guido', 'Royall', '1995-09-20', '697 Ridgeway Pass', 'http://dummyimage.com/230x215.png/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (3, 'Konstantine', 'Drover', '1994-02-24', '678 7th Junction', 'http://dummyimage.com/198x196.png/5fa2dd/ffffff');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (4, 'Ewell', 'Dirand', '2010-11-13', '7058 Morrow Drive', 'http://dummyimage.com/207x240.jpg/cc0000/ffffff');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (5, 'Rollin', 'Cobby', '2017-03-03', '6649 Veith Plaza', 'http://dummyimage.com/247x211.jpg/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (6, 'Tarah', 'Erskine Sandys', '2006-04-10', '6 Marquette Parkway', 'http://dummyimage.com/246x243.bmp/cc0000/ffffff');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (7, 'Jens', 'Dossett', '1979-06-02', '862 Roxbury Lane', 'http://dummyimage.com/164x183.png/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (8, 'Pamela', 'Kellick', '1986-04-25', '58200 East Drive', 'http://dummyimage.com/123x217.jpg/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (9, 'Cordi', 'MacCrosson', '1952-09-24', '29940 Park Meadow Place', 'http://dummyimage.com/193x199.png/dddddd/000000');
insert into tbl_patient (id, name, last_name, birth_date, address, photo) values (10, 'Kristien', 'Anthill', '1977-02-03', '6 Autumn Leaf Plaza', 'http://dummyimage.com/138x243.bmp/dddddd/000000');

insert into tbl_medical_record (id, description, record_date, patient_id) values (1, 'nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at', '2019-10-28', 7);
insert into tbl_medical_record (id, description, record_date, patient_id) values (2, 'sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam', '2020-04-16', 3);
insert into tbl_medical_record (id, description, record_date, patient_id) values (3, 'eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in', '2020-06-18', 6);
insert into tbl_medical_record (id, description, record_date, patient_id) values (4, 'eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at', '2020-06-05', 1);
insert into tbl_medical_record (id, description, record_date, patient_id) values (5, 'nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget', '2020-05-24', 1);
insert into tbl_medical_record (id, description, record_date, patient_id) values (6, 'odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem', '2019-11-09', 10);
insert into tbl_medical_record (id, description, record_date, patient_id) values (7, 'luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur', '2019-08-26', 2);
insert into tbl_medical_record (id, description, record_date, patient_id) values (8, 'non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum', '2020-01-15', 1);
insert into tbl_medical_record (id, description, record_date, patient_id) values (9, 'primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est', '2019-12-03', 2);
insert into tbl_medical_record (id, description, record_date, patient_id) values (10, 'nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing', '2019-10-23', 4);
insert into tbl_medical_record (id, description, record_date, patient_id) values (11, 'in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna', '2020-07-11', 10);
insert into tbl_medical_record (id, description, record_date, patient_id) values (12, 'condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam', '2020-03-11', 2);
insert into tbl_medical_record (id, description, record_date, patient_id) values (13, 'elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis', '2020-04-02', 5);
insert into tbl_medical_record (id, description, record_date, patient_id) values (14, 'suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis', '2020-05-12', 4);
insert into tbl_medical_record (id, description, record_date, patient_id) values (15, 'erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit', '2020-08-01', 5);
insert into tbl_medical_record (id, description, record_date, patient_id) values (16, 'potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt', '2020-01-02', 2);
insert into tbl_medical_record (id, description, record_date, patient_id) values (17, 'nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi', '2019-09-17', 4);
insert into tbl_medical_record (id, description, record_date, patient_id) values (18, 'sit amet eleifend pede libero quis orci nullam molestie nibh in lectus', '2020-06-10', 3);
insert into tbl_medical_record (id, description, record_date, patient_id) values (19, 'blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor', '2020-04-30', 4);
insert into tbl_medical_record (id, description, record_date, patient_id) values (20, 'mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend', '2019-08-23', 3);
