package com.bbva.component.dm.biometriclogin.domain.model;

import com.bbva.component.dm.naturalauth.data.mapper.common.response.ExceptionsResponseMapper;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoErrorResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 \"2\u00020\u0001:\u0001\"BW\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f¨\u0006#"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/FidoErrorResponse;", "", "", "a", "Ljava/lang/Integer;", "getVersion", "()Ljava/lang/Integer;", "version", "", "b", "Ljava/lang/String;", "getSeverity", "()Ljava/lang/String;", "severity", "c", "getHttpStatus", "httpStatus", "d", "getErrorCode", "errorCode", "e", "getErrorMessage", "errorMessage", "f", "getConsumerRequestId", "consumerRequestId", "g", "getSystemErrorCode", "systemErrorCode", "h", "getSystemErrorDescription", "systemErrorDescription", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoErrorResponse {

    @NotNull
    public static final String AUTHENTICATOR_DELETED_ERROR_CODE = "519";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    @Nullable
    private final Integer version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("severity")
    @Nullable
    private final String severity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("http-status")
    @Nullable
    private final Integer httpStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("error-code")
    @Nullable
    private final String errorCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("error-message")
    @Nullable
    private final String errorMessage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumer-request-id")
    @Nullable
    private final String consumerRequestId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("system-error-code")
    @Nullable
    private final String systemErrorCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("system-error-description")
    @Nullable
    private final String systemErrorDescription;

    /* JADX INFO: compiled from: FidoErrorResponse.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/FidoErrorResponse$Companion;", "", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "fidoException", "", "createFrom", "AUTHENTICATOR_DELETED_ERROR_CODE", "Ljava/lang/String;", "BLOCKED_PASSWORD_CODE", "EXPIRED_PASSWORD_CODE", "", "HTTP_STATUS_403", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "INACTIVE_ACCOUNT_CODE", "<init>", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nFidoErrorResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FidoErrorResponse.kt\ncom/bbva/component/dm/biometriclogin/domain/model/FidoErrorResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n80#1:101\n80#1:102\n1#2:103\n*S KotlinDebug\n*F\n+ 1 FidoErrorResponse.kt\ncom/bbva/component/dm/biometriclogin/domain/model/FidoErrorResponse$Companion\n*L\n58#1:101\n73#1:102\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String createFrom(@Nullable FidoException fidoException) {
            String strName;
            String strName2;
            Integer httpStatus;
            List<BodyErrorDefault> messages;
            BodyErrorDefault bodyErrorDefault;
            List<BodyErrorDefault> messages2;
            BodyErrorDefault bodyErrorDefault2;
            List<BodyErrorDefault> messages3;
            BodyErrorDefault bodyErrorDefault3;
            FidoError fidoError;
            FidoError fidoError2;
            String code = null;
            String processMessage = fidoException != null ? fidoException.getProcessMessage() : null;
            String str = "";
            if (processMessage == null) {
                processMessage = "";
            }
            String strName3 = FidoError.SDK_FIDO_NETWORK.name();
            if (fidoException == null || (fidoError2 = fidoException.getFidoError()) == null || (strName = fidoError2.name()) == null) {
                strName = "";
            }
            if (Intrinsics.areEqual(strName3, strName)) {
                return "SERVER_ERROR";
            }
            String strName4 = FidoError.SDK_BAD_SESSION.name();
            if (fidoException == null || (fidoError = fidoException.getFidoError()) == null || (strName2 = fidoError.name()) == null) {
                strName2 = "";
            }
            if (Intrinsics.areEqual(strName4, strName2)) {
                FidoErrorExpiredPassword fidoErrorExpiredPassword = (FidoErrorExpiredPassword) new Gson().fromJson(processMessage, FidoErrorExpiredPassword.class);
                String code2 = (fidoErrorExpiredPassword == null || (messages3 = fidoErrorExpiredPassword.getMessages()) == null || (bodyErrorDefault3 = (BodyErrorDefault) CollectionsKt___CollectionsKt.firstOrNull((List) messages3)) == null) ? null : bodyErrorDefault3.getCode();
                if (code2 == null) {
                    code2 = "";
                }
                if (Intrinsics.areEqual(code2, ExceptionsResponseMapper.EXPIRED_PASSWORD_ERROR_CODE)) {
                    str = "PASSWORD_EXPIRED";
                } else {
                    String code3 = (fidoErrorExpiredPassword == null || (messages2 = fidoErrorExpiredPassword.getMessages()) == null || (bodyErrorDefault2 = (BodyErrorDefault) CollectionsKt___CollectionsKt.firstOrNull((List) messages2)) == null) ? null : bodyErrorDefault2.getCode();
                    if (code3 == null) {
                        code3 = "";
                    }
                    if (Intrinsics.areEqual(code3, ExceptionsResponseMapper.BLOCKED_PASSWORD_CODE)) {
                        str = "PASSWORD_BLOCKED";
                    } else {
                        if (fidoErrorExpiredPassword != null && (messages = fidoErrorExpiredPassword.getMessages()) != null && (bodyErrorDefault = (BodyErrorDefault) CollectionsKt___CollectionsKt.firstOrNull((List) messages)) != null) {
                            code = bodyErrorDefault.getCode();
                        }
                        if (code == null) {
                            code = "";
                        }
                        if (Intrinsics.areEqual(code, ExceptionsResponseMapper.INACTIVE_ACCOUNT_CODE)) {
                            str = "INACTIVE_ACCOUNT";
                        }
                    }
                }
            } else {
                FidoErrorResponse fidoErrorResponse = (FidoErrorResponse) new Gson().fromJson(processMessage, FidoErrorResponse.class);
                FidoErrorResponse.INSTANCE.getClass();
                if (fidoErrorResponse != null && (httpStatus = fidoErrorResponse.getHttpStatus()) != null && httpStatus.intValue() == 403 && Intrinsics.areEqual(fidoErrorResponse.getErrorCode(), "519")) {
                    code = "AUTHENTICATOR_DELETED";
                }
                if (code != null) {
                    str = code;
                }
            }
            return str;
        }
    }

    public FidoErrorResponse(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.version = num;
        this.severity = str;
        this.httpStatus = num2;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.consumerRequestId = str4;
        this.systemErrorCode = str5;
        this.systemErrorDescription = str6;
    }

    @Nullable
    public final String getConsumerRequestId() {
        return this.consumerRequestId;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    @Nullable
    public final String getSeverity() {
        return this.severity;
    }

    @Nullable
    public final String getSystemErrorCode() {
        return this.systemErrorCode;
    }

    @Nullable
    public final String getSystemErrorDescription() {
        return this.systemErrorDescription;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }
}
