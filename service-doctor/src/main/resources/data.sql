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

