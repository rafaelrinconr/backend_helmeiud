INSERT INTO usuarios (username, nombre, apellido, password, red_Social, fecha_nacimiento, enable, image)
    VALUES
     ('rafael.rincon@est.iudigital.edu.co', 'Rafael', 'Rincon', '', 0, '1979-06-15', 1, '' );

INSERT INTO roles (nombre, descripcion)
VALUES
    ('ROLE_ADMIN', 'administrador');

INSERT INTO roles (nombre, descripcion)
VALUES
    ('ROLE_USER', 'usuario normal');

INSERT INTO roles_usuarios(usuarios_id, roles_id)
VALUES
    (1, 1);

INSERT INTO roles_usuarios(usuarios_id, roles_id)
VALUES
    (1, 2);


INSERT INTO delitos (nombre, descripcion, usuarios_id)
    VALUES
        ('hurto', 'cuando lo roban a uno', 1);

INSERT INTO delitos (nombre, descripcion, usuarios_id)
VALUES
    ('homicidio', 'cuando lo matan a uno', 1);