/*BRAND TABLE*/
insert into BRAND(NAME) values('NIKE');
insert into BRAND(NAME) values('REEBOK');
insert into BRAND(NAME) values('ADIDAS');
insert into BRAND(NAME) values('PUMA');


/*PRODUCT TABLE*/
insert into PRODUCT(CATEGORY,GENDER,NAME,TYPE,BRAND_ID) values('SPORTS','MALE','Running shoes','SHOES',1);
insert into PRODUCT(CATEGORY,GENDER,NAME,TYPE,BRAND_ID) values('CASUAL','FEMALE','Party jeans','JEANS',3);
insert into PRODUCT(CATEGORY,GENDER,NAME,TYPE,BRAND_ID) values('PARTY','FEMALE','Fancy t-shirt','TSHIRTS',4);


/*PRODUCT SIZE*/
insert into PRODUCT_SIZE(SIZE,PRODUCT_ID) values('8',1);
insert into PRODUCT_SIZE(SIZE,PRODUCT_ID) values('36',2);
insert into PRODUCT_SIZE(SIZE,PRODUCT_ID) values('30',3);

/*PRODUCT COLOR*/
insert into PRODUCT_COLOR(COLOR_CODE,PRODUCT_ID) values('#000000',1);
insert into PRODUCT_COLOR(COLOR_CODE,PRODUCT_ID) values('#FF0000',2);
insert into PRODUCT_COLOR(COLOR_CODE,PRODUCT_ID) values('#FFF000',3);
