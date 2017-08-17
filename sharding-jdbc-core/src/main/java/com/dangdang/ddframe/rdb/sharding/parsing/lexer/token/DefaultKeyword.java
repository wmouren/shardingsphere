/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License,Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.parsing.lexer.token;

/**
 * 默认词法关键词.
 * 
 * @author zhangliang 
 */
public enum DefaultKeyword implements Keyword {
    
    SELECT,
    DELETE,
    INSERT,
    UPDATE,
    CREATE,
    ALTER,
    DROP,
    TRUNCATE,
    REPLACE,
    DECLARE,
    GRANT,
    REVOKE,
    AS,
    DISTINCT,
    FROM,
    WHERE,
    ORDER,
    ASC,
    DESC,
    GROUP,
    BY, 
    HAVING, 
    INTO, 
    VALUES, 
    COLUMN, 
    TABLE, 
    TABLESPACE, 
    SET, 
    ADD,
    RENAME, 
    INDEX,
    INNER,
    LEFT,
    RIGHT,
    FULL,
    OUTER,
    CROSS, 
    JOIN,
    STRAIGHT_JOIN,
    APPLY,
    ON,
    NO,
    FOR,
    UNION,
    CAST,
    USE,
    USING,
    TO,
    CASE,
    WHEN,
    THEN,
    ELSE,
    END,
    EXISTS,
    NEW,
    ESCAPE,
    LOCK,
    SOME,
    WHILE,
    DO,
    LEAVE,
    ITERATE,
    REPEAT,
    UNTIL,
    OPEN,
    CLOSE,
    OUT,
    INOUT,
    OVER,
    FETCH,
    WITH,
    WITHOUT,
    CURSOR,
    ADVISE,
    SIBLINGS,
    LOOP,
    ENABLE,
    DISABLE,
    EXPLAIN,
    SCHEMA,
    DATABASE,
    VIEW,
    SEQUENCE,
    TRIGGER,
    PROCEDURE,
    FUNCTION,
    DEFAULT,
    EXCEPT,
    INTERSECT,
    MINUS,
    USER,
    PASSWORD,
    IF,
    GLOBAL,
    LOCAL, 
    TEMPORARY,
    COMMENT,
    STORAGE,
    DATA,
    
    /*
    Types
     */
    CHAR,
    CHARACTER,
    VARYING,
    VARCHAR,
    VARCHAR2,
    INTEGER,
    INT,
    SMALLINT,
    DECIMAL,
    DEC,
    NUMERIC,
    FLOAT,
    REAL,
    DOUBLE,
    PRECISION,
    DATE,
    TIME,
    INTERVAL,
    BOOLEAN,
    BLOB,
    
    /*
    Conditionals
     */
    AND,
    OR,
    XOR,
    IS,
    NOT,
    NULL,
    IN,
    BETWEEN,
    LIKE,
    ANY,
    ALL,
    
    /*
    Functions
     */
    AVG,
    MAX,
    MIN,
    SUM,
    COUNT,
    GREATEST,
    LEAST,
    ROUND,
    TRUNC,
    POSITION,
    EXTRACT,
    LENGTH,
    CHAR_LENGTH,
    SUBSTRING,
    SUBSTR,
    INSTR,
    INITCAP,
    UPPER,
    LOWER,
    TRIM,
    LTRIM,
    RTRIM,
    BOTH,
    LEADING,
    TRAILING,
    TRANSLATE,
    CONVERT,
    LPAD,
    RPAD,
    DECODE,
    NVL,
    
    /*
    Constraints
     */
    CONSTRAINT,
    UNIQUE,
    PRIMARY,
    FOREIGN,
    KEY,
    CHECK,
    REFERENCES,
    CASCADE
}
