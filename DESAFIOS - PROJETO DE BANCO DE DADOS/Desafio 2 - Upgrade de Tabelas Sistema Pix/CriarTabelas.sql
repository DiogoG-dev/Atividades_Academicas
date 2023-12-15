-- Active: 1693265957766@@127.0.0.1@3306
DROP TABLE IF EXISTS account_settings;
DROP TABLE IF EXISTS auth_tokens;
DROP TABLE IF EXISTS balance_history;
DROP TABLE IF EXISTS bank_accounts;
DROP TABLE IF EXISTS banks;
DROP TABLE IF EXISTS countries;
DROP TABLE IF EXISTS currencies;
DROP TABLE IF EXISTS dispute_reasons;
DROP TABLE IF EXISTS disputes;
DROP TABLE IF EXISTS languages;
DROP TABLE IF EXISTS notifications;
DROP TABLE IF EXISTS pix_key_types;
DROP TABLE IF EXISTS pix_keys;
DROP TABLE IF EXISTS push_notifications;
DROP TABLE IF EXISTS scheduled_payments;
DROP TABLE IF EXISTS transaction_status;
DROP TABLE IF EXISTS transaction_types;
DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS user_permissions;
DROP TABLE IF EXISTS user_transaction_limits;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    balance DECIMAL(10, 2) DEFAULT 0.00
);


CREATE TABLE bank_accounts (
    account_id INT PRIMARY KEY,
    user_id INT,
    bank_name VARCHAR(100) NOT NULL,
    account_number VARCHAR(20) NOT NULL
);


CREATE TABLE pix_keys (
    key_id INT PRIMARY KEY,
    user_id INT,
    key_type VARCHAR(10) NOT NULL,
    key_value VARCHAR(100) NOT NULL
);


CREATE TABLE transactions (
    transaction_id INT PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    amount DECIMAL(10, 2) NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE scheduled_payments (
    payment_id INT PRIMARY KEY,
    sender_id INT,
    receiver_key_id INT,
    amount DECIMAL(10, 2) NOT NULL,
    scheduled_date DATE
);


CREATE TABLE disputes (
    dispute_id INT PRIMARY KEY,
    transaction_id INT,
    initiator_id INT,
    description TEXT,
    status VARCHAR(20) DEFAULT 'Open'
);


CREATE TABLE notifications (
    notification_id INT PRIMARY KEY,
    user_id INT,
    message TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE banks (
    bank_id INT PRIMARY KEY,
    bank_name VARCHAR(100) NOT NULL,
    location VARCHAR(100),
    phone_number VARCHAR(15)
);


CREATE TABLE balance_history (
    history_id INT PRIMARY KEY,
    user_id INT,
    old_balance DECIMAL(10, 2),
    new_balance DECIMAL(10, 2),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE auth_tokens (
    token_id INT PRIMARY KEY,
    user_id INT,
    token_value VARCHAR(100) NOT NULL,
    expiry_date DATETIME
);


CREATE TABLE transaction_types (
    type_id INT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL
);


CREATE TABLE transaction_status (
    status_id INT PRIMARY KEY,
    status_name VARCHAR(50) NOT NULL
);


CREATE TABLE dispute_reasons (
    reason_id INT PRIMARY KEY,
    reason_text TEXT
);


CREATE TABLE user_transaction_limits (
    limit_id INT PRIMARY KEY,
    user_id INT,
    daily_limit DECIMAL(10, 2),
    monthly_limit DECIMAL(10, 2)
);


CREATE TABLE user_permissions (
    permission_id INT PRIMARY KEY,
    user_id INT,
    permission_name VARCHAR(50) NOT NULL
);


CREATE TABLE pix_key_types (
    key_type_id INT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL
);


CREATE TABLE push_notifications (
    notification_id INT PRIMARY KEY,
    user_id INT,
    message TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE countries (
    country_id INT PRIMARY KEY,
    country_name VARCHAR(100) NOT NULL,
    country_code VARCHAR(5) NOT NULL
);


CREATE TABLE currencies (
    currency_id INT PRIMARY KEY,
    currency_name VARCHAR(50) NOT NULL,
    currency_code VARCHAR(5) NOT NULL
);


CREATE TABLE languages (
    language_id INT PRIMARY KEY,
    language_name VARCHAR(50) NOT NULL,
    language_code VARCHAR(5) NOT NULL
);


CREATE TABLE account_settings (
    setting_id INT PRIMARY KEY,
    user_id INT,
    notification_preferences TEXT,
    language_id INT,
    currency_id INT
);

-- 1 --
ALTER TABLE users
ADD is_active BOOLEAN DEFAULT TRUE;

-- 2 --
ALTER TABLE pix_keys
RENAME 'key_type' TO 'pix_type';

-- 3 --
ALTER TABLE disputes
DROP description;

-- 4 --
ALTER TABLE banks
ADD city VARCHAR(100);

-- 5 --
ALTER TABLE user_permissions
ADD is_verified BOOLEAN DEFAULT FALSE;

-- 6 --
ALTER TABLE pix_key_types
RENAME 'type_name' TO 'key_type_name';

-- 7 --
ALTER TABLE scheduled_payments
DROP scheduled_date;

-- 8 --
ALTER TABLE transaction_status
ADD status_description TEXT;

-- 9 --
ALTER TABLE countries
ADD user_code VARCHAR(10);

-- 10 --
ALTER TABLE currencies
RENAME 'currency_name' TO 'currency_full_name';

-- 11 --
ALTER TABLE languages
DROP language_code;

-- 12 --
ALTER TABLE account_settings
ADD timezone VARCHAR(50);

-- 13 --
ALTER TABLE auth_tokens
ADD is_valid BOOLEAN;

-- 14 --
ALTER TABLE balance_history
ADD notes TEXT;

-- 15 --
ALTER TABLE bank_accounts
ADD branch_code VARCHAR(10);

-- 16 --
ALTER TABLE dispute_reasons
DROP reason_text;

-- 17 --
ALTER TABLE notifications
ADD is_read BOOLEAN DEFAULT FALSE;

-- 18 --
ALTER TABLE push_notifications
ADD platform VARCHAR(20);

-- 19 --
ALTER TABLE transaction_types
ADD transaction_description TEXT;

-- 20 --
ALTER TABLE transactions
ADD transaction_note TEXT;

-- 21 --
ALTER TABLE user_transaction_limits
ADD transaction_limit_type VARCHAR(20);

-- INSERT INTO users (user_id, username, email, phone, balance)
-- VALUES (1, 'Diogo', 'dioguinho123@gmail.com', '88999999999', 0.5);

-- INSERT INTO users (user_id, username, email, phone, balance)
-- VALUES (2, 'Raissa', 'raissinha123@gmail.com', '88999958734', 0.5);

-- INSERT INTO users (user_id, username, email, phone, balance)
-- VALUES (3, 'Davi', 'davizinho123@gmail.com', '88999999999', 0.5);

-- INSERT INTO users (user_id, username, email, phone, balance)
-- VALUES (4, 'Ravi', 'ravizinho123@gmail.com', '88999958734', 1);

-- INSERT INTO users (user_id, username, email, phone, balance)
-- VALUES (5, 'Ravanna', 'ravanninha123@gmail.com', '88999958734', 2);

-- SELECT * FROM users;

-- SELECT user_id, username, email, phone, balance FROM users;

-- SELECT * FROM users WHERE phone = '88999999999';

-- SELECT * FROM users WHERE balance = 0.5;
