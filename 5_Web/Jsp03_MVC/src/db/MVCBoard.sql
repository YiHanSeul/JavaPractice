create table MVCBOARD(
	SEQ INT auto_increment primary key,
	WRITER VARCHAR(100) not null,
	TITLE VARCHAR(1000) not null,
	CONTENT VARCHAR(2000) not null,
	REGDATE DATE not NULL
);

select * from mvcboard ;

insert into mvcboard VALUES(null,'관리자','테스트 중','테스트 1234 ABCD',NOW());