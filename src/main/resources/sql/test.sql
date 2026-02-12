use haetssal_jangteo;

select * from tbl_market;

select * from tbl_store;

select * from tbl_category;

select * from tbl_sub_category;

select * from tbl_item;

select * from tbl_item_option;

select * from tbl_file;

select * from tbl_file_item;

select * from tbl_file_user;

delete from tbl_file
where file_type = 'image';

select * from tbl_user;

# 뷰 조회 확인
select * from vw_file_item
where item_id = 3;

# 확인용 유저 샘플
insert into tbl_user (id, user_email, user_phone, user_name, user_intro)
values (1, 'example@example.com', '01012345678', '홍길동', '설명1');

insert into tbl_user (id, user_email, user_phone, user_name, user_intro, user_latest_login)
values (2, 'example2@example.com', '01011112222', '김철수', '설명2', current_timestamp);