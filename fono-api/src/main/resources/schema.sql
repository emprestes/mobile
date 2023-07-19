DROP TABLE IF EXISTS tb_device;
CREATE TABLE IF NOT EXISTS tb_device (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR2(256) NOT NULL,
    brand VARCHAR2(256) NOT NULL,
    technology VARCHAR2(256) NOT NULL,
    band2g VARCHAR2(256) NOT NULL,
    band3g VARCHAR2(256) NOT NULL,
    band4g VARCHAR2(256) NOT NULL
);

INSERT INTO tb_device (name, brand, technology, band2g, band3g, band4g)
VALUES ('GalaxyS9', 'Samsung', 'GSM / CDMA / HSPA / EVDO / LTE', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only) / CDMA 800 / 1900 - USA', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100 - Global, USA / CDMA2000 1xEV-DO - USA', '1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 38, 39, 40, 41, 66 - Global'),
       ('GalaxyS8', 'Samsung', 'GSM / HSPA / LTE', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100', '1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41'),
       ('Nexus6', 'Motorola', 'GSM / CDMA / HSPA / LTE', 'GSM 850 / 900 / 1800 / 1900 - all models /CDMA 800 / 1900 - all models', 'HSDPA 800 / 850 / 900 / 1700 / 1800 / 1900 / 2100 - Global model', '1, 2, 3, 4, 5, 7, 8, 9, 17, 19, 20, 28, 38, 39, 40, 41 - Global model'),
       ('Oneplus9', 'Oneplus', 'GSM / CDMA / HSPA / LTE / 5G', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 CDMA 800 / 1900', 'HSDPA 800 / 850 / 900 / 1700(AWS) / 1800 / 1900 / 2100', '1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 30, 32, 38, 39, 40, 41, 46, 48, 66, 71 - NA'),
       ('iPhone13', 'Apple', 'GSM / CDMA / HSPA / EVDO / LTE / 5G', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM) / CDMA 800 / 1900', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100', '1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 30, 32, 34, 38, 39, 40, 41, 42, 46, 48, 66 - A2633, A2634, A2635'),
       ('iPhone12', 'Apple', 'GSM / CDMA / HSPA / EVDO / LTE / 5G', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM) - for China / CDMA 800 / 1900', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100 / CDMA2000 1xEV-DO', '1, 2, 3, 4, 5, 7, 8, 12, 13, 14, 17, 18, 19, 20, 25, 26, 28, 29, 30, 32, 34, 38, 39, 40, 41, 42, 46, 48, 66, 71 - A2172'),
       ('iPhone11', 'Apple', 'GSM / CDMA / HSPA / EVDO / LTE', 'GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM) - for China / CDMA 800 / 1900', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100 / CDMA2000 1xEV-DO', '1, 2, 3, 4, 5, 7, 8, 11, 12, 13, 17, 18, 19, 20, 21, 25, 26, 28, 29, 30, 32, 34, 38, 39, 40, 41, 42, 46, 48, 66 - A2221'),
       ('iPhoneX', 'Apple', 'GSM / HSPA / LTE', 'GSM 850 / 900 / 1800 / 1900', 'HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100', '1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 29, 30, 34, 38, 39, 40, 41, 66'),
       ('Nokia3310', 'Motorola', 'GSM', 'GSM 900 / 1800', '', '');
