create table clientes(
	id bigint not null auto_increment,
    nome varchar(60) not null,
	cpf varchar(11) not null,
	primary key (id)
);