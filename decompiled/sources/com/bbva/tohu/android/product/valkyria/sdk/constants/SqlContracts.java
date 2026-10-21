package com.bbva.tohu.android.product.valkyria.sdk.constants;

/* JADX INFO: loaded from: classes6.dex */
public final class SqlContracts {

    public static class BulletEntry {
        public static final String ATC = "atc";
        public static final String BULLET_ID_KEY_ID = "bullet_id";
        public static final String CARD_UNIQUE_REFERENCE_ID = "card_unique_reference";
        public static final String ID_PREFIX = "BU";
        public static final String KEY_LOCATOR = "key_locator";
        public static final String STATUS = "status";
        public static final String TABLE_NAME = "bullet";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRANSACTION_TYPE = "transaction_type";
        public static final String UNPREDICTABLE_NUMBER = "unpredictable_number";
    }

    public static class IssuerTokenEntry {
        public static final String ID_PREFIX = "ISTO";
        public static final String ISSUER_TOKEN_ID_KEY_ID = "issuer_token_id";
        public static final String PROVIDER_ID = "provider_id";
        public static final String PROVIDER_TOKEN_ID = "provider_token_id";
        public static final String TABLE_NAME = "issuer_token";
    }

    public static class TokenEntry {
        public static final String API = "api";
        public static final String CARD_UNIQUE_REFERENCE_KEY_ID = "card_unique_reference";
        public static final String DKI = "dki";
        public static final String PROVIDER = "provider";
        public static final String SC = "sc";
        public static final String STATE = "state";
        public static final String TABLE_NAME = "token";
    }

    public static class TransactionCredentialEntry {
        public static final String BULLET_ID = "bullet_id";
        public static final String TABLE_NAME = "transaction_credential";
        public static final String TRANSACTION_CREDENTIAL_ID_KEY_ID = "transaction_credential_id";
    }

    private SqlContracts() {
    }
}
