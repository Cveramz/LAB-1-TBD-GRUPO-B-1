CREATE DATABASE voluntariadoTBD
USE voluntariadoTBD

-- Tabla Habilidad
CREATE TABLE habilidad(
    id_habilidad SERIAL PRIMARY KEY,
    nombre_habilidad VARCHAR(50)
);

-- Tabla Estado_tarea
CREATE TABLE estado_tarea(
    id_estado_tarea SERIAL PRIMARY KEY,
    estado VARCHAR(50)
);

-- Tabla Coordinador
CREATE TABLE coordinador(
    id_coordinador SERIAL PRIMARY KEY,
    nombre_coordinador VARCHAR(50),
    email_coordinador VARCHAR(50),
    password_coordinador VARCHAR(50)
);

-- Tabla Institución
CREATE TABLE institucion(
    id_institucion SERIAL PRIMARY KEY,
    id_coordinador BIGINT REFERENCES coordinador(id_coordinador),
    nombre_institucion VARCHAR(100),
    telefono INT,
    ubicacion_institucion VARCHAR(50)
);

-- Tabla Emergencia
CREATE TABLE emergencia(
    id_emergencia SERIAL PRIMARY KEY,
    id_institucion BIGINT REFERENCES institucion(id_institucion),
    tipo VARCHAR(50),
    ubicacion VARCHAR(50),
    equipamiento_necesario VARCHAR(50),
    titulo VARCHAR(50),
    descripcion VARCHAR(100)
);

-- Tabla Eme_habilidad
CREATE TABLE eme_habilidad(
    id_eme_habilidad SERIAL PRIMARY KEY,
    id_emergencia BIGINT REFERENCES emergencia(id_emergencia),
    id_habilidad BIGINT REFERENCES habilidad(id_habilidad)
);

-- Tabla Tarea
CREATE TABLE tarea(
    id_tarea SERIAL PRIMARY KEY,
    id_emergencia BIGINT REFERENCES emergencia(id_emergencia),
    id_estado_tarea BIGINT REFERENCES estado_tarea(id_estado_tarea),
    nombre_tarea VARCHAR(50)
);

-- Tabla Voluntario
CREATE TABLE voluntario(
    id_voluntario SERIAL PRIMARY KEY,
    nombre_voluntario VARCHAR(50),
    edad INT,
    equipamiento VARCHAR(100),
    estado_salud BOOLEAN,
    disponibilidad BOOLEAN,
    email_voluntario VARCHAR(50),
    password_voluntario VARCHAR(50)
);

-- Tabla Ranking
CREATE TABLE ranking(
    id_ranking SERIAL PRIMARY KEY,
    id_voluntario BIGINT REFERENCES voluntario(id_voluntario),
    id_tarea BIGINT REFERENCES tarea(id_tarea),
    puntos_requisito INT
);

-- Tabla Vol_habilidad
CREATE TABLE vol_habilidad(
    id_vol_habilidad SERIAL PRIMARY KEY,
    id_voluntario BIGINT REFERENCES voluntario(id_voluntario),
    id_habilidad BIGINT REFERENCES habilidad(id_habilidad)
);

-- Tabla Tarea_habilidad
CREATE TABLE tarea_habilidad(
    id_tarea_habilidad SERIAL PRIMARY KEY,
    id_tarea BIGINT REFERENCES tarea(id_tarea),
    id_habilidad BIGINT REFERENCES habilidad(id_habilidad)
);