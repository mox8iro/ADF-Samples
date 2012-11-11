CREATE TABLE SAMPLETABLEFORCOND
(
  ROWNAME      VARCHAR2(255 BYTE),
  ID           INTEGER                          NOT NULL,
  SELECTRADIO  VARCHAR2(1 BYTE),
  COMMENTS     VARCHAR2(255 BYTE),
  TYPEOFDATA   VARCHAR2(255 BYTE)
)
TABLESPACE USERS
PCTUSED    0
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            MINEXTENTS       1
            MAXEXTENTS       2147483645
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE
NOPARALLEL
MONITORING;


CREATE UNIQUE INDEX SAMPLETABLEFORCOND_PK ON SAMPLETABLEFORCOND
(ID)
LOGGING
TABLESPACE USERS
PCTFREE    10
INITRANS   2
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            MINEXTENTS       1
            MAXEXTENTS       2147483645
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
NOPARALLEL;


ALTER TABLE SAMPLETABLEFORCOND ADD (
  CONSTRAINT SAMPLETABLEFORCOND_PK
 PRIMARY KEY
 (ID)
    USING INDEX 
    TABLESPACE USERS
    PCTFREE    10
    INITRANS   2
    MAXTRANS   255
    STORAGE    (
                INITIAL          64K
                MINEXTENTS       1
                MAXEXTENTS       2147483645
                PCTINCREASE      0
               ));

/////////////////////////////////////////////////data/////////////////////////////////////////

INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Master Department 1', 1, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Master Department 2', 2, 'Y', NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Master Department 3', 3, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Sub Department 1', 4, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Sub Department 2', 5, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Third Party 1', 6, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Sub Department 4', 7, NULL, NULL, NULL); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 1', 11, 'Y', 'asdfs', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 2', 12, 'Y', NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 3', 13, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 4', 21, 'Y', 'commnt', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 5', 31, 'Y', 'fdasfas', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 6', 41, 'Y', 'comment comment comment', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 7', 51, 'Y', 'dddddddddddddddddddddddddddddddd', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 8', 52, 'Y', 'sasasadsadsadsdsadsdsdsdsadsdsa', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 9', 71, 'Y', 'sunshine', 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'MasterRow C', 8, NULL, NULL, 'MasterFormC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 10', 10, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 11', 1132, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 12', 33, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 13', 34, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 13', 56, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 14', 54, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 16', 23, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 17', 76, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 18', 432, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 15', 2222, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 19', 98, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 20', 70, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 21', 476, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 22', 456, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 23', 467, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 24', 24, NULL, NULL, 'formC'); 
INSERT INTO SAMPLETABLEFORCOND ( ROWNAME, ID, SELECTRADIO, COMMENTS,
TYPEOFDATA ) VALUES ( 
'Row C 25', 333, NULL, NULL, 'formC'); 
commit;
