# 111mil-torneo

Este repositorio contiene la resolución al caso de uso planteado para la Certificación de Instructores del [Plan 111mil](https://www.argentina.gob.ar/111mil)

* Diagramas y enunciado: ver [documentacion](https://github.com/javier-godoy/111mil-torneo/tree/master/documentacion)
* Scripts SQL: ver [sql](https://github.com/javier-godoy/111mil-torneo/tree/master/sql)

El punto de entrada de la aplicación es la clase [Aplicacion](https://github.com/javier-godoy/111mil-torneo/blob/master/src/main/java/ar/com/rjgodoy/plan111mil/torneo/Aplicacion.java)

Este es un proyecto Maven, con las siguientes dependencias: hibernate-core 5.3.1 y mysql-connector. Puede consultar un instructivo para configurar un proyecto Maven en Netbeans [aquí](https://github.com/111milprogramadores/bd-instructivos/blob/master/Obtener%20Hibernate%20ORM%20utilizando%20Maven.pdf)

La base de datos configurada en [hibernate.cfg.xml](https://github.com/javier-godoy/111mil-torneo/blob/master/src/main/resources/hibernate.cfg.xml) es
localhost:3306/torneo_111mil (usuario:root, contraseña: root)

#### Casos de uso implementados
* Registrar Inscripcion de Aspirantes
* Registrar Categoría
* Registrar Sede
* Registrar Disciplina
* Registrar Torneo
* Registrar Competencia
* Registrar Escuela
