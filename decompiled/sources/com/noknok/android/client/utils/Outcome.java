package com.noknok.android.client.utils;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class Outcome {
    public static final Outcome ACCESS_DENIED;
    public static final Outcome APP_NOT_FOUND;
    public static final Outcome ATTESTATION_NOT_SUPPORTED;
    public static final Outcome AUTHENTICATOR_DISCONNECTED;
    public static final Outcome AUTHENTICATOR_EXISTS;
    public static final Outcome AUTHENTICATOR_UNAVAILABLE;
    public static final Outcome CANCELED;
    public static final Outcome CMD_NOT_SUPPORTED;
    public static final Outcome ERR_PIN_SLOTRESET;
    public static final Outcome FALLBACK;
    public static final Outcome INSECURE_TRANSPORT;
    public static final Outcome INSUFFICIENT_AUTHENTICATOR_RESOURCES;
    public static final Outcome INVALID_TRANSACTION_CONTENT;
    public static final Outcome KEY_DISAPPEARED_PERMANENTLY;
    public static final Outcome NOT_COMPATIBLE;
    public static final Outcome NO_MATCH;
    public static final Outcome PARAMS_INVALID;
    public static final Outcome PROTOCOL_ERROR;
    public static final Outcome SAMSUNG_USER_LOCKOUT;
    public static final Outcome SUCCESS;
    public static final Outcome SYSTEM_CANCELED;
    public static final Outcome TIMEOUT;
    public static final Outcome USER_LOCKOUT;
    public static final Outcome USER_NOT_ENROLLED;
    public static final Outcome USER_NOT_RESPONSIVE;
    public static final Outcome WAIT_USER_ACTION;
    private final Codes mCodes;
    public static final Outcome FAILURE = new Outcome("FAILURE", 1);
    public static final Outcome ALREADY_INITIALIZED = new Outcome("ALREADY_INITIALIZED", 25);
    public static final Outcome NOT_INSTALLED = new Outcome("NOT_INSTALLED", 26);
    public static final Outcome CHANGE_AUTHENTICATOR = new Outcome("CHANGE_AUTHENTICATOR", 27);
    public static final Outcome NOT_SUPPORTED = new Outcome("NOT_SUPPORTED", 28);
    public static final Outcome INVALID_MESSAGE = new Outcome("INVALID_MESSAGE", 29);
    public static final Outcome BAD_TOKEN = new Outcome("BAD_TOKEN", 30);
    public static final Outcome MISMATCH = new Outcome("MISMATCH", 31);
    private static final /* synthetic */ Outcome[] $VALUES = $values();

    public static class Codes {
        public int mCalError;
        public short mUafAsmStatus;
        public short mUafCmdStatus;
        public short mUafError;

        public /* synthetic */ Codes(int i10) {
            this();
        }

        public Codes calError(int i10) {
            this.mCalError = i10;
            return this;
        }

        public Codes uafAsmStatus(int i10) {
            this.mUafAsmStatus = (short) i10;
            return this;
        }

        public Codes uafCmdStatus(int i10) {
            this.mUafCmdStatus = (short) i10;
            return this;
        }

        public Codes uafError(int i10) {
            this.mUafError = (short) i10;
            return this;
        }

        private Codes() {
            this.mUafError = (short) 255;
            this.mUafAsmStatus = (short) 1;
            this.mUafCmdStatus = (short) 1;
            this.mCalError = 1;
        }
    }

    private static /* synthetic */ Outcome[] $values() {
        return new Outcome[]{SUCCESS, FAILURE, WAIT_USER_ACTION, INSECURE_TRANSPORT, CANCELED, NOT_COMPATIBLE, NO_MATCH, PROTOCOL_ERROR, APP_NOT_FOUND, KEY_DISAPPEARED_PERMANENTLY, ACCESS_DENIED, INVALID_TRANSACTION_CONTENT, USER_NOT_RESPONSIVE, INSUFFICIENT_AUTHENTICATOR_RESOURCES, USER_LOCKOUT, AUTHENTICATOR_DISCONNECTED, USER_NOT_ENROLLED, AUTHENTICATOR_UNAVAILABLE, CMD_NOT_SUPPORTED, ATTESTATION_NOT_SUPPORTED, PARAMS_INVALID, TIMEOUT, ERR_PIN_SLOTRESET, AUTHENTICATOR_EXISTS, SAMSUNG_USER_LOCKOUT, ALREADY_INITIALIZED, NOT_INSTALLED, CHANGE_AUTHENTICATOR, NOT_SUPPORTED, INVALID_MESSAGE, BAD_TOKEN, MISMATCH, FALLBACK, SYSTEM_CANCELED};
    }

    static {
        int i10 = 0;
        SUCCESS = new Outcome(NotifyProvisionResult.SUCCESS_RESULT, 0, new Codes(i10).uafError(0).uafAsmStatus(0).uafCmdStatus(0).calError(0));
        WAIT_USER_ACTION = new Outcome("WAIT_USER_ACTION", 2, new Codes(i10).uafError(1));
        INSECURE_TRANSPORT = new Outcome("INSECURE_TRANSPORT", 3, new Codes(i10).uafError(2));
        CANCELED = new Outcome("CANCELED", 4, new Codes(i10).uafError(3).uafAsmStatus(3).uafCmdStatus(5).calError(13));
        NOT_COMPATIBLE = new Outcome("NOT_COMPATIBLE", 5, new Codes(i10).uafError(4));
        NO_MATCH = new Outcome("NO_MATCH", 6, new Codes(i10).uafError(5));
        PROTOCOL_ERROR = new Outcome("PROTOCOL_ERROR", 7, new Codes(i10).uafError(6));
        APP_NOT_FOUND = new Outcome("APP_NOT_FOUND", 8, new Codes(i10).uafError(7));
        KEY_DISAPPEARED_PERMANENTLY = new Outcome("KEY_DISAPPEARED_PERMANENTLY", 9, new Codes(i10).uafError(9).uafAsmStatus(9).uafCmdStatus(9).calError(14));
        ACCESS_DENIED = new Outcome("ACCESS_DENIED", 10, new Codes(i10).uafError(12).uafAsmStatus(2).uafCmdStatus(2));
        INVALID_TRANSACTION_CONTENT = new Outcome("INVALID_TRANSACTION_CONTENT", 11, new Codes(i10).uafError(13).uafAsmStatus(4).uafCmdStatus(4));
        USER_NOT_RESPONSIVE = new Outcome("USER_NOT_RESPONSIVE", 12, new Codes(i10).uafError(14).uafAsmStatus(14).uafCmdStatus(14).calError(18));
        INSUFFICIENT_AUTHENTICATOR_RESOURCES = new Outcome("INSUFFICIENT_AUTHENTICATOR_RESOURCES", 13, new Codes(i10).uafError(15).uafAsmStatus(15).uafCmdStatus(15));
        USER_LOCKOUT = new Outcome("USER_LOCKOUT", 14, new Codes(i10).uafError(16).uafAsmStatus(16).uafCmdStatus(16).calError(11));
        AUTHENTICATOR_DISCONNECTED = new Outcome("AUTHENTICATOR_DISCONNECTED", 15, new Codes(i10).uafAsmStatus(11));
        USER_NOT_ENROLLED = new Outcome("USER_NOT_ENROLLED", 16, new Codes(i10).uafError(17).uafAsmStatus(17).uafCmdStatus(3).calError(15));
        AUTHENTICATOR_UNAVAILABLE = new Outcome("AUTHENTICATOR_UNAVAILABLE", 17, new Codes(i10).uafError(19).uafAsmStatus(19).calError(19));
        CMD_NOT_SUPPORTED = new Outcome("CMD_NOT_SUPPORTED", 18, new Codes(i10).uafCmdStatus(6).calError(2));
        ATTESTATION_NOT_SUPPORTED = new Outcome("ATTESTATION_NOT_SUPPORTED", 19, new Codes(i10).uafCmdStatus(7));
        PARAMS_INVALID = new Outcome("PARAMS_INVALID", 20, new Codes(i10).uafCmdStatus(8));
        TIMEOUT = new Outcome("TIMEOUT", 21, new Codes(i10).uafCmdStatus(10));
        ERR_PIN_SLOTRESET = new Outcome("ERR_PIN_SLOTRESET", 22, new Codes(i10).uafCmdStatus(13));
        AUTHENTICATOR_EXISTS = new Outcome("AUTHENTICATOR_EXISTS", 23, new Codes(i10).uafCmdStatus(17));
        SAMSUNG_USER_LOCKOUT = new Outcome("SAMSUNG_USER_LOCKOUT", 24, new Codes(i10).uafCmdStatus(16383));
        FALLBACK = new Outcome("FALLBACK", 32, new Codes(i10).uafError(12287).uafAsmStatus(12287).uafCmdStatus(238).calError(16));
        SYSTEM_CANCELED = new Outcome("SYSTEM_CANCELED", 33, new Codes(i10).uafError(18).uafAsmStatus(18).uafCmdStatus(18).calError(17));
    }

    private Outcome(String str, int i10) {
        super(str, i10);
        this.mCodes = new Codes(0);
    }

    public static Outcome fromAsmStatusCode(short s4) {
        if (FAILURE.getUafAsmStatusCode() != s4) {
            for (Outcome outcome : values()) {
                if (outcome.getUafAsmStatusCode() == s4) {
                    return outcome;
                }
            }
        }
        return FAILURE;
    }

    public static Outcome fromCalErrorCode(int i10) {
        if (FAILURE.getCalErrorCode() != i10) {
            for (Outcome outcome : values()) {
                if (outcome.getCalErrorCode() == i10) {
                    return outcome;
                }
            }
        }
        return FAILURE;
    }

    public static Outcome fromUafCmdStatusCode(short s4) {
        if (FAILURE.getUafCmdStatusCode() != s4) {
            for (Outcome outcome : values()) {
                if (outcome.getUafCmdStatusCode() == s4) {
                    return outcome;
                }
            }
        }
        return FAILURE;
    }

    public static Outcome fromUafErrorCode(short s4) {
        if (FAILURE.getUafErrorCode() != s4) {
            for (Outcome outcome : values()) {
                if (outcome.getUafErrorCode() == s4) {
                    return outcome;
                }
            }
        }
        return FAILURE;
    }

    public static Outcome valueOf(String str) {
        return (Outcome) Enum.valueOf(Outcome.class, str);
    }

    public static Outcome[] values() {
        return (Outcome[]) $VALUES.clone();
    }

    public int getCalErrorCode() {
        return this.mCodes.mCalError;
    }

    public short getUafAsmStatusCode() {
        return this.mCodes.mUafAsmStatus;
    }

    public short getUafCmdStatusCode() {
        return this.mCodes.mUafCmdStatus;
    }

    public short getUafErrorCode() {
        return this.mCodes.mUafError;
    }

    private Outcome(String str, int i10, Codes codes) {
        super(str, i10);
        this.mCodes = codes;
    }
}
