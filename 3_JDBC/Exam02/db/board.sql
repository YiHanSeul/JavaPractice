create table Board
(
NO INT primary key COMMENT '글번호',
TITLE VARCHAR(100) not null  COMMENT '제목',
WRITER VARCHAR(100) not null COMMENT '작성자',
CONTENT VARCHAR(500) not null COMMENT '내용',
REGDATE DATE not null COMMENT '날짜'
);

select * from BOARD;
