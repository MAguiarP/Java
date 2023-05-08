drop database "DBControleEstoque";


drop role "UserControleEstoque";



CREATE ROLE "UserControleEstoque" 
LOGIN
  SUPERUSER CREATEDB CREATEROLE REPLICATION

VALID UNTIL 'infinity';



CREATE DATABASE "DBControleEstoque"
  
WITH ENCODING='UTF8'
       
OWNER="UserControleEstoque"
       
CONNECTION LIMIT=-1;