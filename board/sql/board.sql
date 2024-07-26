-- board 
-- 테이블 작석
create table board_java(
    seq number,
    id varchar2(30),
    name  varchar2(15),
    subject  varchar2(100),
    content  varchar2(500),
    logtime  date
);

-- 시퀀스 : 값이 중복되지 않고, 캐쉬는 사용하지 않는다.
create SEQUENCE board_java_seq 
INCREMENT by 1 
START   WITH 1
NOCACHE;