-- 02-insert-data.sql
-- 초기 데이터 삽입
INSERT INTO shopping.items (name, img_path, price, discount_per) VALUES
    ('Example Item 1', '/img/vincent-van-gogh-1089315_1280.png', 10000000, 10),
    ('Example Item 2', '/img/ai-generated-8682714_1280.png', 20000000, 20),
    ('Example Item 3', '/img/cyborg-8728894_1280.jpg', 20000000, 50);

INSERT INTO shopping.members (email, password) VALUES
    ('example@example.com', '1234');
