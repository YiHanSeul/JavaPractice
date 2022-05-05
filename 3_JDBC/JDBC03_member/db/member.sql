drop table member;

create table MEMBER(
	M_NO INT AUTO_INCREMENT primary KEY,
	M_NAME VARCHAR(20) not NULL,
	M_AGE INT not NULL,
	M_GENDER VARCHAR(3) check(M_GENDER in('M','F')) not NULL,
	M_LOCATION VARCHAR(20),
	M_JOB VARCHAR(10),
	M_TEL VARCHAR(20),
	M_EMAIL VARCHAR(20)
);

-- 번호, 이름, 나이, 성별, 지역, 직업, 전화번호, 메일
insert into member VALUES(null,'이한슬',24,'F','관악구','무직','010-1234-5678','ihanseul731@test.com');

select * from `member` ;