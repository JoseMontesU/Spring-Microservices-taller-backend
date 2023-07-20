create table especialidades(
                               id int not null auto_increment,
                               nombre varchar(50),
                               primary key(id)
);

insert into especialidades (id, nombre)
values (null,'Traumatologia'),
       (null,'Pediatria'),
       (null,'Medicina general'),
       (null,'Ginecologia');

create table medico_especialidad(
                                    id int not null auto_increment,
                                    user_id varchar(50),
                                    especialidades_id int,
                                    primary key (id),
                                    foreign key (user_id) references USER_ENTITY(ID),
                                    foreign key (especialidades_id) references especialidades(id)
);

insert into medico_especialidad(id,user_id, especialidades_id)
VALUES (null,'36b57f32-5087-45c8-8076-b5892e3cfee3',1),
       (null,'1dc34972-d799-40eb-8be2-9cb5981ebfca',1),
       (null,'2882a117-9d23-414b-a7dc-9dc6a6f1b60d',3),
       (null,'2d2c550d-4621-400f-94c6-423af65452d2',3),
       (null,'4832228f-fa58-48e5-92e3-0f119d323c59',3),
       (null,'63b09fef-885a-498c-bbe6-4ae92948f696',2),
       (null,'9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8',2),
       (null,'a0f057a2-7418-4ce2-bcd6-19672271ef5e',4),
       (null,'f1eafc02-a3c4-4632-a0ea-efc0c08479b3',4);

create table horarios(
                         id int not null auto_increment,
                         fecha date,
                         hora time,
                         user_id varchar(50),
                         disponible varchar(1),
                         primary key(id),
                         foreign key (user_id) references USER_ENTITY(ID)
);

insert into horarios(id, fecha, hora, user_id, disponible)
values
    (null,'2023-05-25','9:00','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','9:30','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','10:00','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','10:30','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','11:00','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','11:30','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','12:00','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','12:30','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','13:00','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),
    (null,'2023-05-25','13:30','36b57f32-5087-45c8-8076-b5892e3cfee3','1'),

    (null,'2023-05-25','9:00','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','9:30','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','10:00','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','10:30','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','11:00','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','11:30','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','12:00','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','12:30','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','13:00','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),
    (null,'2023-05-25','13:30','1dc34972-d799-40eb-8be2-9cb5981ebfca','1'),

    (null,'2023-05-25','9:00','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','9:30','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','10:00','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','10:30','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','11:00','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','11:30','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','12:00','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','12:30','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','13:00','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),
    (null,'2023-05-25','13:30','2882a117-9d23-414b-a7dc-9dc6a6f1b60d','1'),

    (null,'2023-05-25','9:00','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','9:30','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','10:00','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','10:30','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','11:00','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','11:30','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','12:00','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','12:30','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','13:00','2d2c550d-4621-400f-94c6-423af65452d2','1'),
    (null,'2023-05-25','13:30','2d2c550d-4621-400f-94c6-423af65452d2','1'),

    (null,'2023-05-25','9:00','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','9:30','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','10:00','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','10:30','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','11:00','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','11:30','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','12:00','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','12:30','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','13:00','4832228f-fa58-48e5-92e3-0f119d323c59','1'),
    (null,'2023-05-25','13:30','4832228f-fa58-48e5-92e3-0f119d323c59','1'),

    (null,'2023-05-25','9:00','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','9:30','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','10:00','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','10:30','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','11:00','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','11:30','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','12:00','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','12:30','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','13:00','63b09fef-885a-498c-bbe6-4ae92948f696','1'),
    (null,'2023-05-25','13:30','63b09fef-885a-498c-bbe6-4ae92948f696','1'),

    (null,'2023-05-25','9:00','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','9:30','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','10:00','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','10:30','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','11:00','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','11:30','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','12:00','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','12:30','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','13:00','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),
    (null,'2023-05-25','13:30','9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8','1'),

    (null,'2023-05-25','9:00','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','9:30','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','10:00','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','10:30','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','11:00','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','11:30','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','12:00','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','12:30','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','13:00','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),
    (null,'2023-05-25','13:30','a0f057a2-7418-4ce2-bcd6-19672271ef5e','1'),

    (null,'2023-05-25','9:00','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','9:30','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','10:00','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','10:30','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','11:00','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','11:30','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','12:00','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','12:30','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','13:00','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1'),
    (null,'2023-05-25','13:30','f1eafc02-a3c4-4632-a0ea-efc0c08479b3','1');

-- medicos por especialidad
select u.FIRST_NAME, u.LAST_NAME,e.nombre,me.user_id from USER_ENTITY u
                                                   inner join medico_especialidad me on u.ID = me.user_id
                                                   inner join especialidades e on me.especialidades_id = e.id
where e.nombre = 'Traumatologia';

-- usuarios por roles
select u.FIRST_NAME,u.LAST_NAME,kr.NAME from KEYCLOAK_ROLE kr
                                                 inner join USER_ROLE_MAPPING ur on ur.ROLE_ID = kr.ID
                                                 inner join USER_ENTITY u on u.ID=ur.USER_ID
where u.ID='ca9c2bc9-2451-47f1-bed7-b68a8fa61f0c' and kr.NAME like '%realm%';

-- seleccionar horarios disponibles por fecha, id del medico y por disponibilidad
select h.hora, h.user_id from horarios h
                       inner join medico_especialidad m on m.user_id=h.user_id
                       inner join especialidades e on  m.especialidades_id=e.id
where h.fecha='2023-05-25' and h.user_id='9ea5dbf3-61e7-4e90-9cdc-ac2d6762f0d8' and h.disponible='1'