-- Categories
INSERT INTO categories (name, slug) VALUES
('Biscuits & Snacks', 'biscuits-snacks'),
('Sweets & Chocolates', 'sweets-chocolates'),
('Noodles & Pasta', 'noodles-pasta'),
('Beverages', 'beverages'),
('Seasoning & Spices', 'seasoning-spices'),
('Soap & Detergents', 'soap-detergents');

-- Products
INSERT INTO products (
    name,
    description,
    price,
    stock,
    image_url,
    category_id
) VALUES

(
    'Cabin Biscuit',
    'Crunchy cabin biscuit snack.',
    500,
    40,
    'https://images.unsplash.com/photo-1589987607627-6f4d5d0f6d43',
    1
),

(
    'Cadbury Chocolate',
    'Smooth milk chocolate bar.',
    600,
    35,
    'https://images.unsplash.com/photo-1606313564200-e75d5e30476c',
    2
),

(
    'Indomie Noodles',
    'Instant noodles family pack.',
    850,
    60,
    'https://images.unsplash.com/photo-1617093727343-374698b1b08d',
    3
),

(
    'Coca Cola',
    'Chilled soft drink bottle.',
    450,
    80,
    'https://images.unsplash.com/photo-1622483767028-3f66f32aef97',
    4
),

(
    'Maggi Cubes',
    'Seasoning cubes for cooking.',
    300,
    100,
    'https://images.unsplash.com/photo-1504674900247-0877df9cc836',
    5
),

(
    'Ariel Washing Powder',
    'Powerful detergent for laundry.',
    1500,
    25,
    'https://images.unsplash.com/photo-1583947582886-f40ec95dd752',
    6
);