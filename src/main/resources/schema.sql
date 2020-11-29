CREATE TABLE IF NOT EXISTS menu (
	menu_id			INT AUTO_INCREMENT  PRIMARY KEY,
	name  			VARCHAR(500) 		NOT NULL,
	description 	VARCHAR(5000)  		NULL,
	images			VARCHAR(500)    	NULL,
	price			DECIMAL(17,2)   	DEFAULT 0 NOT NULL,
	types           VARCHAR(50)     	NULL,
	status          CHAR(1)				DEFAULT 'A' NOT NULL
);

CREATE TABLE IF NOT EXISTS customer_order (
	order_id  		 INT AUTO_INCREMENT  PRIMARY KEY,
	customer_name    VARCHAR(500)		NOT NULL,
	mobile           VARCHAR(20)		NULL,
	email			 VARCHAR(200)		NULL,
	delivery_address VARCHAR(5000)      NULL,
	order_status     VARCHAR(20)        NOT NULL
);

CREATE TABLE IF NOT EXISTS customer_order_detail (
    detail_id  		INT AUTO_INCREMENT  PRIMARY KEY,
	order_id 		INT 			NOT NULL,
	menu_id			INT         	NOT NULL,
	menu_name       VARCHAR(500) 	NOT NULL,
	quantities      INT             NOT NULL,
	price			DECIMAL(17,2)   NOT NULL,
	status          CHAR(1)         DEFAULT 'A' NOT NULL
);