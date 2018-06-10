create database votessm;
USE votessm;
drop table IF EXISTS user;
create table user(
userId varchar(36) NOT NULL,
loginAccount varchar(255),
loginPassword varchar(255),
bindEmail varchar(512),
bindMobile varchar(11),
nickName varchar(45),
avatarUrl varchar(1024),
userType int(11),
userState int(11),
thirdPartyOpenId varchar(255),
thirdPartyType varchar(45),
shortId int(11) NOT NULL,
recordState int(11),
createTime datetime,
updateTime datetime,
lastOperator varchar(36),
lastOperatorIp varchar(45),
PRIMARY key (userId) 
);
insert into user(
userId,
loginAccount,
loginPassword,
bindEmail,
bindMobile,
nickName,
avataUrl,
userType,
userState,
thirdPartyOpenId,
thirdPartyType,
shortId,
recordState,
createTime,
updateTime,
lastOperator,
lastOpeeratorIp) values(

);
