--insert into query_Bean(query_Id,name) values (101,'aaaa');
--insert into query_Bean(query_Id,name) values (102,'bbbb');
--insert into query_Bean(query_Id,name) values (103,'cccc');

insert into QM_Query (QUERY_ID,INDUS_ID,CATEGORY,DATERAISED,STATUS,EMPUSERNAME,LLUSERNAME,ASSIGNEDTO,LASTUPDATEDDATETIME,ASSIGNEDDEPARTMENT) values (1234,'check','Bill',sysdate()-10,789,'James','Bond','Team1',sysdate(),'Support');
insert into QM_Query (QUERY_ID,INDUS_ID,CATEGORY,DATERAISED,STATUS,EMPUSERNAME,LLUSERNAME,ASSIGNEDTO,LASTUPDATEDDATETIME,ASSIGNEDDEPARTMENT) values (1235,'check','Bill',sysdate()-5,789,'James','Bond','Team1',sysdate(),'Support');
insert into QM_Query (QUERY_ID,INDUS_ID,CATEGORY,DATERAISED,STATUS,EMPUSERNAME,LLUSERNAME,ASSIGNEDTO,LASTUPDATEDDATETIME,ASSIGNEDDEPARTMENT) values (1236,'check','Bill',sysdate()-4,789,'James','Bond','Team1',sysdate(),'Support');
insert into QM_Query (QUERY_ID,INDUS_ID,CATEGORY,DATERAISED,STATUS,EMPUSERNAME,LLUSERNAME,ASSIGNEDTO,LASTUPDATEDDATETIME,ASSIGNEDDEPARTMENT) values (1237,'check','Bill',sysdate()-2,789,'James','Bond','Team1',sysdate(),'Support');


insert into QM_Querydetails (query_Id,query_Detail_Id,empusername,llusername,LASTUPDATEDDATETIME,CALL_FROM_TYPE,Assigned_to,CALL_FROM_name) values (1234,100,'James','Bond',sysdate,'Email','Admin','Mark');

insert into QM_Querydetails (query_Id,query_Detail_Id,empusername,llusername,LASTUPDATEDDATETIME,CALL_FROM_TYPE,Assigned_to,CALL_FROM_name) values (1235,102,'James','Bond',sysdate,'Email','Admin','Mark');

insert into QM_Querydetails (query_Id,query_Detail_Id,empusername,llusername,LASTUPDATEDDATETIME,CALL_FROM_TYPE,Assigned_to,CALL_FROM_name) values (1236,103,'James','Bond',sysdate,'Email','Admin','Mark');

insert into QM_Querydetails (query_Id,query_Detail_Id,empusername,llusername,LASTUPDATEDDATETIME,CALL_FROM_TYPE,Assigned_to,CALL_FROM_name) values (1237,104,'James','Bond',sysdate,'Email','Admin','Mark');