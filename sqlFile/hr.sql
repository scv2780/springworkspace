select * from aaa;

delete aaa;

desc aaa;

create table board(
  bno number(6, 0) primary key,
  title varchar2(200) not null,
  contents varchar2(4000) default 'No Content',
  writer varchar2(100) not null,
  regdate date not null,
  updatedate date default sysdate,
  image varchar2(300)
);

select * from board;

desc board;

insert into board (bno, title, writer, regdate)
values (1000, 'First Title', 'Any', sysdate);

insert into board (bno, title, writer, regdate)
values (1001, 'Second Board', 'Beti', sysdate);

select bno
      ,title
      ,contents
      ,writer
      ,regdate
      ,updatedate
      ,image
from board
order by bno;