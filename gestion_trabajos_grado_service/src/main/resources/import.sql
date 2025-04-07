INSERT INTO `Docentes` (`nombres`,`apellidos`,`grupo`, `correo`) VALUES ('Daniel','Paz',"Grupo ATN", "danielp@unicauca.edu.co")
INSERT INTO `Docentes` (`nombres`,`apellidos`,`grupo`, `correo`) VALUES ('Jimena','Timaná','Grupo BD2', 'jtimana@unicauca.edu.co')
INSERT INTO `Docentes` (`nombres`,`apellidos`,`grupo`, `correo`) VALUES ('Pablo','Majé','Grupo ATN', 'pablomaje@unicauca.edu.co')

INSERT INTO `Estados` (`estado`,`fecha_registro`) VALUES ('en_formulacion', '2024-11-03')
INSERT INTO `Estados` (`estado`,`fecha_registro`) VALUES ('en_evaluacion', '2024-11-06')
INSERT INTO `Estados` (`estado`,`fecha_registro`) VALUES ('en_evaluacion', '2024-11-15')
INSERT INTO `Estados` (`estado`,`fecha_registro`) VALUES ('aprobado', '2024-11-17')
INSERT INTO `Estados` (`estado`,`fecha_registro`) VALUES ('rechazado', '2024-11-17')

INSERT INTO `Evaluaciones` (`concepto`,`fechaRegistroConcepto`, `nombreCoordinador`) VALUES ('Pasado a evaluar', '2024-11-05', 'Daniel Paz')
INSERT INTO `Evaluaciones` (`concepto`,`fechaRegistroConcepto`, `nombreCoordinador`) VALUES ('Pasado a formular', '2024-11-05', 'Jimena Timana')
INSERT INTO `Evaluaciones` (`concepto`,`fechaRegistroConcepto`, `nombreCoordinador`) VALUES ('Pasado a Rechazar', '2024-11-05', 'Pablo Majé')

INSERT INTO `FormatosTIA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreEstudiante1`, `nombreEstudiante2`) VALUES ('Daniel Paz', 'TI acerca de la gestión de grupos de trabajo', 'Gestión de grupos medianos', `Sharyth Velasco`, `Jeison Vallejo`)
INSERT INTO `FormatosTIA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreEstudiante1`, `nombreEstudiante2`) VALUES ('Jimena Timaná', 'TI de bodega de datos', 'Análisis de datos', `Juan Perez`, ``)
INSERT INTO `FormatosTIA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreEstudiante1`, `nombreEstudiante2`) VALUES ('Pablo Majé', 'TI de Sistemas Operativos', 'Análisis de datos para S.O', `Juan Carlos Melo`, `Juan José Arias`)

INSERT INTO `FormatosPPA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreAsesor`, `nombreEstudiante`, `rutaCartaAceptacion`) VALUES ('Daniel Paz', 'PP resultados de aprendizaje', 'Gestión de grupos medianos', `Sharyth Velasco`, `Jeison Vallejo`)
INSERT INTO `FormatosPPA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreAsesor`, `nombreEstudiante`, `rutaCartaAceptacion`) VALUES ('Daniel Paz', 'PP de requisitos', 'Gestión de grupos medianos', `Sharyth Velasco`, `Jeison Vallejo`)
INSERT INTO `FormatosPPA` (`nombreDirector`,`objetivoGeneral`, `objetivosEspecíficos`, `nombreAsesor`, `nombreEstudiante`, `rutaCartaAceptacion`) VALUES ('Daniel Paz', 'PP de gestión de formatos A', 'Gestión de grupos medianos', `Sharyth Velasco`, `Jeison Vallejo`)
