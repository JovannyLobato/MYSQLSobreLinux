create database inventarioProductos;


use inventarioProductos;


CREATE TABLE Areas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(255) NOT NULL
);

CREATE TABLE Inventario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombreCorto VARCHAR(50) NOT NULL,
    descripcion TEXT,
    serie VARCHAR(100) UNIQUE,
    color VARCHAR(50),
    fechaAdquisision DATE,
    tipoAdquisision VARCHAR(100),
    observaciones TEXT,
    areas_id INT,
    FOREIGN KEY (areas_id) REFERENCES Areas(id) ON DELETE CASCADE
);

show tables;
describe areas;
describe inventario;

-- Registros de prueba
INSERT INTO Areas (nombre, ubicacion) VALUES
('Almacén Central', 'Planta Baja'),
('Oficina Administrativa', 'Piso 2');

INSERT INTO Inventario (nombreCorto, descripcion, serie, color, fechaAdquisision, tipoAdquisision, observaciones, areas_id) VALUES
('Laptop HP', 'Computadora portátil para oficina', 'HP123456', 'Negro', '2024-01-15', 'Compra', 'En buen estado', 1),
('Escritorio', 'Escritorio de madera', 'ESC789', 'Marrón', '2023-06-10', 'Donación', 'Ligera marca de uso', 2);

SELECT i.id, i.nombreCorto, i.serie, a.nombre AS area
FROM Inventario i
JOIN Areas a ON i.areas_id = a.id;

