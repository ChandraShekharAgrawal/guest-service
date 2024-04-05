CREATE TABLE guest (
    id UUID PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(20),
    address VARCHAR(255),
    dob DATE,
    id_proof VARCHAR(255)
);
