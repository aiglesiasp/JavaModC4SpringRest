DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250) NOT NULL,
	trabajo varchar(250) NOT NULL,
	salario integer
);

insert into empleado (nombre, trabajo, salario)values('Jose','Senior',30000);
insert into empleado (nombre, trabajo, salario)values('Juan','Jefe Proyecto',40000);
insert into empleado (nombre, trabajo, salario)values('Pedro','Diseño',35000);
insert into empleado (nombre, trabajo, salario)values('Jordi','Junior',25000);
insert into empleado (nombre, trabajo, salario)values('Jonatan','Becario',20000;