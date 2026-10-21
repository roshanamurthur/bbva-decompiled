package com.noknok.android.client.appsdk;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FAILURE' uses external variables
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
public final class ResultType {
    private static final /* synthetic */ ResultType[] $VALUES;
    public static final ResultType ALREADY_INITIALIZED;
    public static final ResultType APP_NOT_FOUND;
    public static final ResultType ATTESTATION_NOT_PRIVATE;
    public static final ResultType AUTHENTICATOR_ACCESS_DENIED;
    public static final ResultType AUTHENTICATOR_UNAVAILABLE;
    public static final ResultType BAD_SESSION;
    public static final ResultType CANCELED;
    public static final ResultType CONNECTION_ERROR;
    public static final ResultType CONSTRAINT_ERROR;
    public static final ResultType ENCODING_ERROR;
    public static final ResultType FAILURE;
    public static final ResultType FALLBACK;
    public static final ResultType INSECURE_TRANSPORT;
    public static final ResultType INSUFFICIENT_AUTHENTICATOR_RESOURCES;
    public static final ResultType INVALID_QR;
    public static final ResultType INVALID_SERVER_RESPONSE;
    public static final ResultType INVALID_STATE;
    public static final ResultType INVALID_TRANSACTION_CONTENT;
    public static final ResultType KEY_DISAPPEARED_PERMANENTLY;
    public static final ResultType NOT_COMPATIBLE;
    public static final ResultType NOT_INSTALLED;
    public static final ResultType NO_MATCH;
    public static final ResultType PROTOCOL_ERROR;
    public static final ResultType SERVER_ERROR;
    public static final ResultType SERVER_REG_NOT_FOUND;
    public static final ResultType SERVER_USER_NOT_FOUND;
    public static final ResultType SERVER_UVI_NOT_MATCH;
    public static final ResultType SERVER_VERIFICATION_ERROR;
    public static final ResultType SUCCESS = new ResultType(NotifyProvisionResult.SUCCESS_RESULT, 0, Outcome.SUCCESS, R.string.nnl_result_type_success);
    public static final ResultType SYSTEM_CANCELED;
    public static final ResultType TRANSACTION_ERROR;
    public static final ResultType USER_LOCKOUT;
    public static final ResultType USER_NOT_ENROLLED;
    public static final ResultType USER_NOT_RESPONSIVE;
    public static final ResultType WAIT_USER_ACTION;
    private final int mMessageResourceId;
    private final Outcome mOutcome;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.ResultType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62872a;

        static {
            int[] iArr = new int[ResultType.values().length];
            f62872a = iArr;
            try {
                iArr[ResultType.NO_MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62872a[ResultType.SERVER_USER_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62872a[ResultType.SERVER_REG_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62872a[ResultType.KEY_DISAPPEARED_PERMANENTLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62872a[ResultType.SYSTEM_CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62872a[ResultType.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62872a[ResultType.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62872a[ResultType.FALLBACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62872a[ResultType.CONNECTION_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62872a[ResultType.BAD_SESSION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62872a[ResultType.USER_LOCKOUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f62872a[ResultType.USER_NOT_ENROLLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f62872a[ResultType.AUTHENTICATOR_UNAVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f62872a[ResultType.SERVER_VERIFICATION_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private static /* synthetic */ ResultType[] $values() {
        return new ResultType[]{SUCCESS, FAILURE, CANCELED, NO_MATCH, NOT_INSTALLED, NOT_COMPATIBLE, APP_NOT_FOUND, TRANSACTION_ERROR, WAIT_USER_ACTION, INSECURE_TRANSPORT, PROTOCOL_ERROR, ALREADY_INITIALIZED, KEY_DISAPPEARED_PERMANENTLY, AUTHENTICATOR_ACCESS_DENIED, INVALID_TRANSACTION_CONTENT, USER_NOT_RESPONSIVE, INSUFFICIENT_AUTHENTICATOR_RESOURCES, USER_LOCKOUT, USER_NOT_ENROLLED, AUTHENTICATOR_UNAVAILABLE, INVALID_QR, SERVER_ERROR, CONNECTION_ERROR, SERVER_USER_NOT_FOUND, SERVER_REG_NOT_FOUND, SERVER_UVI_NOT_MATCH, FALLBACK, BAD_SESSION, SYSTEM_CANCELED, ATTESTATION_NOT_PRIVATE, CONSTRAINT_ERROR, INVALID_STATE, ENCODING_ERROR, INVALID_SERVER_RESPONSE, SERVER_VERIFICATION_ERROR};
    }

    static {
        Outcome outcome = Outcome.FAILURE;
        int i10 = R.string.nnl_result_type_failure;
        FAILURE = new ResultType("FAILURE", 1, outcome, i10);
        CANCELED = new ResultType("CANCELED", 2, Outcome.CANCELED, R.string.nnl_result_type_canceled);
        NO_MATCH = new ResultType("NO_MATCH", 3, Outcome.NO_MATCH, R.string.nnl_result_type_no_match);
        NOT_INSTALLED = new ResultType("NOT_INSTALLED", 4, Outcome.NOT_INSTALLED, R.string.nnl_result_type_not_installed);
        NOT_COMPATIBLE = new ResultType("NOT_COMPATIBLE", 5, Outcome.NOT_COMPATIBLE, i10);
        APP_NOT_FOUND = new ResultType("APP_NOT_FOUND", 6, Outcome.APP_NOT_FOUND, i10);
        Outcome outcome2 = Outcome.INVALID_TRANSACTION_CONTENT;
        TRANSACTION_ERROR = new ResultType("TRANSACTION_ERROR", 7, outcome2, i10);
        WAIT_USER_ACTION = new ResultType("WAIT_USER_ACTION", 8, Outcome.WAIT_USER_ACTION, i10);
        INSECURE_TRANSPORT = new ResultType("INSECURE_TRANSPORT", 9, Outcome.INSECURE_TRANSPORT, i10);
        PROTOCOL_ERROR = new ResultType("PROTOCOL_ERROR", 10, Outcome.PROTOCOL_ERROR, i10);
        ALREADY_INITIALIZED = new ResultType("ALREADY_INITIALIZED", 11, Outcome.ALREADY_INITIALIZED, i10);
        KEY_DISAPPEARED_PERMANENTLY = new ResultType("KEY_DISAPPEARED_PERMANENTLY", 12, Outcome.KEY_DISAPPEARED_PERMANENTLY, R.string.nnl_result_type_key_disappeared_permanently);
        AUTHENTICATOR_ACCESS_DENIED = new ResultType("AUTHENTICATOR_ACCESS_DENIED", 13, Outcome.ACCESS_DENIED, i10);
        INVALID_TRANSACTION_CONTENT = new ResultType("INVALID_TRANSACTION_CONTENT", 14, outcome2, i10);
        USER_NOT_RESPONSIVE = new ResultType("USER_NOT_RESPONSIVE", 15, Outcome.USER_NOT_RESPONSIVE, i10);
        INSUFFICIENT_AUTHENTICATOR_RESOURCES = new ResultType("INSUFFICIENT_AUTHENTICATOR_RESOURCES", 16, Outcome.INSUFFICIENT_AUTHENTICATOR_RESOURCES, i10);
        USER_LOCKOUT = new ResultType("USER_LOCKOUT", 17, Outcome.USER_LOCKOUT, R.string.nnl_result_type_user_lockout);
        USER_NOT_ENROLLED = new ResultType("USER_NOT_ENROLLED", 18, Outcome.USER_NOT_ENROLLED, R.string.nnl_result_type_not_enrolled);
        AUTHENTICATOR_UNAVAILABLE = new ResultType("AUTHENTICATOR_UNAVAILABLE", 19, Outcome.AUTHENTICATOR_UNAVAILABLE, R.string.nnl_result_type_authenticator_unavailable);
        INVALID_QR = new ResultType("INVALID_QR", 20, null, R.string.nnl_result_type_invalid_qr);
        SERVER_ERROR = new ResultType("SERVER_ERROR", 21, null, R.string.nnl_result_type_server_error);
        CONNECTION_ERROR = new ResultType("CONNECTION_ERROR", 22, null, R.string.nnl_result_type_connection_error);
        SERVER_USER_NOT_FOUND = new ResultType("SERVER_USER_NOT_FOUND", 23, null, R.string.nnl_result_type_server_user_not_found);
        SERVER_REG_NOT_FOUND = new ResultType("SERVER_REG_NOT_FOUND", 24, null, R.string.nnl_result_type_server_reg_not_found);
        SERVER_UVI_NOT_MATCH = new ResultType("SERVER_UVI_NOT_MATCH", 25, null, R.string.nnl_result_type_server_uvi_not_match);
        FALLBACK = new ResultType("FALLBACK", 26, Outcome.FALLBACK, R.string.nnl_result_type_fallback);
        BAD_SESSION = new ResultType("BAD_SESSION", 27, null, R.string.nnl_result_type_bad_session);
        SYSTEM_CANCELED = new ResultType("SYSTEM_CANCELED", 28, Outcome.SYSTEM_CANCELED, R.string.nnl_result_type_system_canceled);
        ATTESTATION_NOT_PRIVATE = new ResultType("ATTESTATION_NOT_PRIVATE", 29, null, R.string.nnl_result_type_attestation_not_private);
        CONSTRAINT_ERROR = new ResultType("CONSTRAINT_ERROR", 30, null, R.string.nnl_result_type_constraint_err);
        INVALID_STATE = new ResultType("INVALID_STATE", 31, null, R.string.nnl_result_type_invalid_state);
        ENCODING_ERROR = new ResultType("ENCODING_ERROR", 32, null, R.string.nnl_result_type_encoding_error);
        INVALID_SERVER_RESPONSE = new ResultType("INVALID_SERVER_RESPONSE", 33, null, R.string.nnl_result_type_invalid_server_response);
        SERVER_VERIFICATION_ERROR = new ResultType("SERVER_VERIFICATION_ERROR", 34, null, R.string.nnl_result_type_policy_verification_failed);
        $VALUES = $values();
    }

    private ResultType(String str, int i10, Outcome outcome, int i11) {
        super(str, i10);
        this.mOutcome = outcome;
        this.mMessageResourceId = i11;
    }

    public static ResultType fromOutcome(Outcome outcome) {
        for (ResultType resultType : values()) {
            if (resultType.getOutcome() == outcome) {
                return resultType;
            }
        }
        return FAILURE;
    }

    public static ResultType valueOf(String str) {
        return (ResultType) Enum.valueOf(ResultType.class, str);
    }

    public static ResultType[] values() {
        return (ResultType[]) $VALUES.clone();
    }

    public String getAuthErrorMessage(Context context) {
        int i10 = AnonymousClass1.f62872a[ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_BAD_CREDENTIALS, R.string.nnl_result_bad_credentials);
            }
            if (i10 != 3) {
                return i10 != 4 ? getErrorMessage(context) : UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_KEY_DISAPPEARED_PERMANENTLY, R.string.nnl_result_key_disappeared_permanently);
            }
        }
        return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_AUTH_NO_MATCH, R.string.nnl_result_auth_no_match);
    }

    public String getErrorMessage(Context context) {
        switch (AnonymousClass1.f62872a[ordinal()]) {
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 9:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_CONNECTION, R.string.nnl_result_connection);
            case 10:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_SESSION_EXPIRED, R.string.nnl_result_session_expired);
            case 11:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_WRONG_ATTEMPTS, R.string.nnl_result_wrong_attempts);
            case 12:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_NOT_ENROLLED, R.string.nnl_result_not_enrolled);
            case 13:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_AUTHENTICATOR_UNAVAILABLE, R.string.nnl_result_authenticator_unavailable);
            case 14:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_POLICY_VERIFICATION_FAILED, R.string.nnl_result_type_policy_verification_failed);
            default:
                return UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_DEFAULT, R.string.nnl_result_default);
        }
    }

    public String getMessage(Context context) {
        return context.getResources().getString(this.mMessageResourceId);
    }

    public Outcome getOutcome() {
        return this.mOutcome;
    }

    public String getRegErrorMessage(Context context) {
        return AnonymousClass1.f62872a[ordinal()] != 1 ? getErrorMessage(context) : UiConfig.getText(context, UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_REG_NO_MATCH, R.string.nnl_result_reg_no_match);
    }
}
