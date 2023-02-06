/* customer data*/
INSERT INTO customer(cust_id, cust_name, cust_age, cust_gender, cust_address_no, cust_address, cust_tel, cust_email) 
                VALUES('0000001', 'Elon Musk', 48, 1, '211-0011','57B Devonshire road #06-06', '050-5546-9090', 'strudy-coretree@outlook.com');
INSERT INTO customer(cust_id, cust_name, cust_age, cust_gender, cust_address_no, cust_address, cust_tel, cust_email) 
                VALUES('0000002', 'Bernard Arnault', 28, 2, '111-0011','埼玉県　大和市　10丁目', '070-1234-5678', '00002@yahoo.com');
INSERT INTO customer(cust_id, cust_name, cust_age, cust_gender, cust_address_no, cust_address, cust_tel, cust_email) 
                VALUES('0000003', 'Jeff Bezos', 73, 1, '344-9090','横浜市　港区　3丁目', '080-9090-9999', '00003@google.com');
INSERT INTO customer(cust_id, cust_name, cust_age, cust_gender, cust_address_no, cust_address, cust_tel, cust_email) 
                VALUES('0000004', 'Gautam Adani', 34, 2, '510-0081','東京都目黒区八雲9丁目', '090-4343-1111', '00004@amazon.com');
INSERT INTO customer(cust_id, cust_name, cust_age, cust_gender, cust_address_no, cust_address, cust_tel, cust_email) 
                VALUES('0000005', 'Bill Gates', 65, 2, '331-0191','埼玉県　朝霞市　5丁目', '050-3333-2222', '00005@microsoft.com');

/* branch data */
INSERT INTO branch(branch_id, branch_name, branch_address_no, branch_address, branch_tel, branch_email) 
                VALUES('001', 'Tokyo branch', '111-0011','1-1-1, Chuo-ku, Tokyo', '050-1111-1111', 'tokyobranch-tokyobank@tokyobank.co.jp');
INSERT INTO branch(branch_id, branch_name, branch_address_no, branch_address, branch_tel, branch_email) 
                VALUES('002', 'Osaka branch', '333-0011','1-10-3, Osaka', '050-2222-2222', 'osakabranch-tokyobank@tokyobank.co.jp');
INSERT INTO branch(branch_id, branch_name, branch_address_no, branch_address, branch_tel, branch_email) 
                VALUES('003', 'Kyoto branch', '555-0011','5-2-1, Fukuchiyama, Kyoto', '050-3333-3333', 'kyotobranch-tokyobank@tokyobank.co.jp');

/* account data*/
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('001', '001', '1111111', '0000001', 100000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('002', '001', '1111112', '0000001', 200000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('003', '001', '1111113', '0000001', 300000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('001', '001', '2222221', '0000002', 400000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('001', '001', '3333331', '0000003', 500000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('001', '001', '4444441', '0000004', 600000);
INSERT INTO account(branch_id, account_type, account_id, cust_id, balance) VALUES('001', '001', '5555551', '0000005', 700000);

/* account_transaction data*/
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-04-11','0001', '001', '001', '001', '1111111', 100000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-05-23','0001', '001', '002', '001', '1111112', 200000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-06-20','0001', '001', '003', '001', '1111113', 300000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-04-03','0001', '001', '001', '001', '2222221', 400000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-05-22','0001', '001', '001', '001', '3333331', 500000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-06-05','0001', '001', '001', '001', '4444441', 600000, 'Deposit', '0');
INSERT INTO account_transaction(transaction_date, transaction_no, transaction_type, branch_id, account_type, account_id, amount, purpose, cancel) 
                        VALUES('2022-07-17','0001', '001', '001', '001', '5555551', 700000, 'Deposit', '0');