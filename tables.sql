-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-10-23 21:26:18.124

-- tables
-- Table: Automovil
CREATE TABLE Automovil (
    idAutomovil int  NOT NULL,
    color varchar(30)  NOT NULL,
    aceleracion int  NOT NULL,
    resistencia int  NOT NULL,
    velocidad varchar(30)  NOT NULL,
    CONSTRAINT Automovil_pk PRIMARY KEY (idAutomovil)
);

-- Table: Carrera
CREATE TABLE Carrera (
    identificador varchar(50)  NOT NULL,
    clima varchar(50)  NOT NULL,
    numeroVueltas int  NOT NULL,
    CONSTRAINT Carrera_pk PRIMARY KEY (identificador)
);

-- Table: Estrategia
CREATE TABLE Estrategia (
    idEstrategia int  NOT NULL,
    llanta varchar(30)  NOT NULL,
    aerodinamico varchar(30)  NOT NULL,
    trasmision varchar(30)  NOT NULL,
    estilo varchar(30)  NOT NULL,
    CONSTRAINT Estrategia_pk PRIMARY KEY (idEstrategia)
);

-- Table: Jugador
CREATE TABLE Jugador (
    usuario varchar(50)  NOT NULL,
    contrasena varchar(8)  NOT NULL,
    puntos int  NOT NULL,
    posicion int  NULL,
    tiempo real  NULL,
    Automovil_idAutomovil int  NOT NULL,
    Estrategia_idEstrategia int  NOT NULL,
    Carrera_identificador varchar(50)  NOT NULL,
    CONSTRAINT Jugador_pk PRIMARY KEY (usuario)
);

-- foreign keys
-- Reference: Jugador_Automovil (table: Jugador)
ALTER TABLE Jugador ADD CONSTRAINT Jugador_Automovil
    FOREIGN KEY (Automovil_idAutomovil)
    REFERENCES Automovil (idAutomovil)  
    NOT DEFERRABLE 
;

-- Reference: Jugador_Carrera (table: Jugador)
ALTER TABLE Jugador ADD CONSTRAINT Jugador_Carrera
    FOREIGN KEY (Carrera_identificador)
    REFERENCES Carrera (identificador)  
    NOT DEFERRABLE 
;

-- Reference: Jugador_Estrategia (table: Jugador)
ALTER TABLE Jugador ADD CONSTRAINT Jugador_Estrategia
    FOREIGN KEY (Estrategia_idEstrategia)
    REFERENCES Estrategia (idEstrategia)  
    NOT DEFERRABLE 
;

-- Poblar Automovil --  

INSERT INTO Automovil VALUES (1,'Rojo',80,32,'60.5'); 
INSERT INTO Automovil VALUES (2,'Azul',90,40,'67.8'); 
 
-- Poblar Estrategia --  

INSERT INTO Estrategia VALUES (1,'Soft','Balanced','Balanced','Balanced'); 
INSERT INTO Estrategia VALUES (2,'Hard','Straight','Acceleration','Press down');

--Poblar Carrera


INSERT  INTO Carrera (identificador, clima, numeroVueltas)
VALUES ('ca1','cloudy',3);
INSERT  INTO Carrera (identificador, clima, numeroVueltas)
VALUES ('cl1','cloudy',3);

-- Poblar Jugador
INSERT  INTO Jugador (usuario,contrasena, puntos, posicion, tiempo, Automovil_idAutomovil, Estrategia_idEstrategia, Carrera_identificador)
VALUES ('pepito1234','1234',  0,0, 0,1,1, 'ca1');
INSERT  INTO Jugador (usuario,contrasena, puntos, posicion, tiempo, Automovil_idAutomovil, Estrategia_idEstrategia, Carrera_identificador)
VALUES ('user1341','us3r', 0,0,0,2,2, 'cl1');
INSERT  INTO Jugador (usuario,contrasena, puntos, posicion, tiempo, Automovil_idAutomovil, Estrategia_idEstrategia, Carrera_identificador)
VALUES ('pepita2020','p3p1t4', 0,0,0,2,2, 'cl1');

-- End of file.

