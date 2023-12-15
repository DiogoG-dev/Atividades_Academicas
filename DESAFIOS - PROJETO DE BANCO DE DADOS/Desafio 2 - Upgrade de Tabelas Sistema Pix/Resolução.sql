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