/* customer table*/
CREATE TABLE IF NOT EXISTS customer (
    cust_id VARCHAR(7) PRIMARY KEY,
    cust_name VARCHAR(50),
    cust_age INT,
    cust_gender INT,
    cust_address_no VARCHAR(10),
    cust_address VARCHAR(200),
    cust_tel VARCHAR(15),
    cust_email VARCHAR(254)
);

/* branch table */
CREATE TABLE IF NOT EXISTS branch (
    branch_id VARCHAR(3) PRIMARY KEY,
    branch_name VARCHAR(50),
    branch_address_no VARCHAR(10),
    branch_address VARCHAR(200),
    branch_tel VARCHAR(15),
    branch_email VARCHAR(254)
);

/* account table */
CREATE TABLE IF NOT EXISTS account (
    branch_id VARCHAR(3),
    account_type VARCHAR(3),
    account_id VARCHAR(7),
    cust_id VARCHAR(7),
    balance INT,
    PRIMARY KEY(branch_id, account_type, account_id),
    FOREIGN KEY(cust_id) REFERENCES customer(cust_id),
    FOREIGN KEY(branch_id) REFERENCES branch(branch_id)
);

/* account_transaction table */
CREATE TABLE IF NOT EXISTS account_transaction (
    transaction_date DATE,
    transaction_no VARCHAR(4),
    transaction_type VARCHAR(3),
    branch_id VARCHAR(3),
    account_type VARCHAR(3),
    account_id VARCHAR(7),
    amount INT,
    purpose VARCHAR(50),
    cancel VARCHAR(1),
    PRIMARY KEY(transaction_date, transaction_no),
    FOREIGN KEY(branch_id, account_type, account_id) REFERENCES account(branch_id, account_type, account_id)
);
