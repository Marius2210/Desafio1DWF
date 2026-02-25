INSERT INTO profesor(nombre) VALUES ('Alexander');
INSERT INTO profesor(nombre) VALUES ('Daniel');
INSERT INTO profesor(nombre) VALUES ('Nelson');
INSERT INTO profesor(nombre) VALUES ('Francisco');
INSERT INTO profesor(nombre) VALUES ('Alejandro');

INSERT INTO alumno(nombre,apellido) VALUES ('Mario','Melendez');
INSERT INTO alumno(nombre,apellido) VALUES ('Jose','Lopez');
INSERT INTO alumno(nombre,apellido) VALUES ('Marta','Gomez');
INSERT INTO alumno(nombre,apellido) VALUES ('Andrea','Torres');
INSERT INTO alumno(nombre,apellido) VALUES ('Luis','Castro');

INSERT INTO materia(nombre,id_profesor) VALUES ('Programacion',1);
INSERT INTO materia(nombre,id_profesor) VALUES ('Algebra',2);
INSERT INTO materia(nombre,id_profesor) VALUES ('Redes',3);
INSERT INTO materia(nombre,id_profesor) VALUES ('Base de datos',4);
INSERT INTO materia(nombre,id_profesor) VALUES ('Servidores',5);

INSERT INTO alumno_materia VALUES (1,1);
INSERT INTO alumno_materia VALUES (2,2);
INSERT INTO alumno_materia VALUES (3,3);
INSERT INTO alumno_materia VALUES (4,4);
INSERT INTO alumno_materia VALUES (5,5);