DROP TABLE IF EXISTS empleado;

create table empleado(
	id long auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario int
);

insert into empleado (nombre, trabajo, salario)values('Jose','Senior',30000);
insert into empleado (nombre, trabajo, salario)values('Juan','Jefe',40000);
insert into empleado (nombre, trabajo, salario)values('Pedro','Diseño',35000);
insert into empleado (nombre, trabajo, salario)values('Jordi','Junior',25000);
insert into empleado (nombre, trabajo, salario)values('Jonatan','Becario',20000);