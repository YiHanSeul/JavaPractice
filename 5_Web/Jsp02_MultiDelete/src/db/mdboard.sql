create table mdboard(
	seq int auto_increment primary key,
	writer varchar(500) not null,
	title varchar(1000) not null,
	content varchar(2000) not null,
	regdate date not null
);

select * from mdboard ;

insert into mdboard  values(null,'관리자','테스트중 ','Test123456 테스트',sysdate());