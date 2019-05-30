/* Populate tabla clientes */
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
-- INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

use cachuelitos;

INSERT INTO distritos (iddistritos, dis_nombre) VALUES (1, 'ANCON');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (2, 'ATE');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (3, 'BARRANCO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (4, 'BREÑA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (5, 'CARABAYLLO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (6, 'CHACLACAYO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (7, 'CHORRILLOS');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (8, 'CIENEGUILLA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (9, 'COMAS');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (10, 'EL AGUSTINO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (11, 'INDEPENDENCIA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (12, 'JESUS MARIA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (13, 'LA MOLINA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (14, 'LA VICTORIA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (15, 'LIMA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (16, 'LINCE');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (17, 'LOS OLIVOS');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (18, 'LURIGANCHO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (19, 'LURIN');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (20, 'MAGDALENA DEL MAR');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (21, 'MAGDALENA VIEJA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (22, 'MIRAFLORES');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (23, 'PACHACAMAC');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (24, 'PUCUSANA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (25, 'PUENTE PIEDRA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (26, 'PUNTA HERMOSA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (27, 'PUNTA NEGRA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (28, 'RIMAC');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (29, 'SAN BARTOLO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (30, 'SAN BORJA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (31, 'SAN ISIDRO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (32, 'SAN JUAN DE LURIGANCHO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (33, 'SAN JUAN DE MIRAFLORES');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (34, 'SAN LUIS');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (35, 'SAN MARTIN DE PORRES');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (36, 'SAN MIGUEL');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (37, 'SANTA ANITA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (38, 'SANTA MARIA DEL MAR');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (39, 'SANTA ROSA');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (40, 'SANTIAGO DE SURCO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (41, 'SURQUILLO');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (42, 'VILLA EL SALVADOR');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES (43, 'VILLA MARIA DEL TRIUNFO');



-- INSERT INTO usuarios (idusuarios, id_firebase, usu_nombre, usu_telefono, usu_email, usu_estado, usu_disponibilidad, usu_calificacion_emp, usu_calificacion_clien, usu_horarios, distrito_iddistritos) VALUES
-- (1, 'GBcUqVwbK3TakAa38sA0oXtcfym1', 'Álvaro Mañuico', '972930579', 'alvaro.sebastian98@gmail.com', b'1', b'1', NULL, NULL, 'Lun - Vier / 5pm - 9pm', 7);
-- INSERT INTO usuarios (idusuarios, id_firebase, usu_nombre, usu_telefono, usu_email, usu_estado, usu_disponibilidad, usu_calificacion_emp, usu_calificacion_clien, usu_horarios, distrito_iddistritos) VALUES
-- (2, 'Plse6xWmJRfAIHI2H71pPhGvHUN2', 'Pamela Loyola', '948543049', 'kogan.03.10@gmail.com', b'0', b'0', NULL, NULL, '', 18);


