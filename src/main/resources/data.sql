-- Insertar Profesores
INSERT INTO profesor (nombre) VALUES ('Alexander');
INSERT INTO profesor (nombre) VALUES ('Nelson');
INSERT INTO profesor (nombre) VALUES ('Roberto');
INSERT INTO profesor (nombre) VALUES ('Daniel');
INSERT INTO profesor (nombre) VALUES ('Eduardo');

-- Insertar Materias (referenciando profesores)
INSERT INTO materia (nombre, id_profesor) VALUES ('Programacion', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Redes', 2);
INSERT INTO materia (nombre, id_profesor) VALUES ('Algebra', 3);
INSERT INTO materia (nombre, id_profesor) VALUES ('Servidores', 4);
INSERT INTO materia (nombre, id_profesor) VALUES ('Base de datos', 5);

-- Insertar Alumnos
INSERT INTO alumno (nombre, apellido) VALUES ('Mario', 'Melendez');
INSERT INTO alumno (nombre, apellido) VALUES ('Andrea', 'Torres');
INSERT INTO alumno (nombre, apellido) VALUES ('Diego', 'Gomez');
INSERT INTO alumno (nombre, apellido) VALUES ('Valentina', 'Flores');
INSERT INTO alumno (nombre, apellido) VALUES ('Andrés', 'Castillo');

-- Insertar Inscripciones (alumno_materia)
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (2, 2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (3, 3);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (4, 4);