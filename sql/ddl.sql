USE torneo_111mil;

CREATE TABLE escuelas (
	id int auto_increment primary key,
	nombre varchar(60) not null,
	direccion varchar(100) not null
) ENGINE=InnoDB;

CREATE TABLE sedes (
	id int auto_increment primary key,
	nombre varchar(60) not null,
	direccion varchar(100) not null
) ENGINE=InnoDB;

CREATE TABLE torneos (
	id int auto_increment primary key,
	nombre varchar(60) not null,
	sede int not null references sedes(id)
) ENGINE=InnoDB;

CREATE TABLE disciplinas (
	id int auto_increment primary key,
	nombre varchar(30) not null
) ENGINE=InnoDB;

CREATE TABLE sexos (
	id char(1) primary key,
	descripcion varchar(9) not null	
) ENGINE=InnoDB;

CREATE TABLE categorias (
	id int auto_increment primary key,
	descripcion varchar(30) not null,
	edad_max int null,
	edad_min int null,
	sexo char(1) null references sexos(id)
) ENGINE=InnoDB;

CREATE TABLE competencias (
	id int auto_increment primary key,
	inicio date not null,
	torneo  int not null references torneos(id),
	disciplina int not null references disciplinas(id)	
) ENGINE=InnoDB;

CREATE TABLE competencias_categorias (
	competencia int not null references competencias(id),
	categoria int not null references categorias(id)	
) ENGINE=InnoDB;

CREATE TABLE competidores (
	id int auto_increment primary key,
	escuela int not null references escuelas(id),
	dni int not null,
	sexo char(1) not null  references sexos(id),
	nombres varchar(60) not null,
	apellido varchar(60) not null,
	direccion varchar(100) not null,
	fechaNacimiento DATE not null
) ENGINE=InnoDB;

CREATE TABLE examenes (
	id int auto_increment primary key,
	fecha_examen DATE not null,
	fecha_presentacion DATE not null,
	apto CHAR(1) not null,
	observaciones VARCHAR(255) null,
	nombre_medico VARCHAR(60) null,
	matricula_medico VARCHAR(30) null
) ENGINE=InnoDB;

CREATE TABLE estado_inscripcion (
	id int primary key,
	descripcion varchar(12) not null
) ENGINE=InnoDB;

CREATE TABLE inscripciones (
	id int auto_increment primary key,
	competidor int not null references competidores(id),
	competencia int not null references competencias(id),
	disciplina int not null references disciplinas(id),
	examen int null references examenes(id),
	estado int references estado_inscripcion(id),
	posicion int null
) ENGINE=InnoDB;