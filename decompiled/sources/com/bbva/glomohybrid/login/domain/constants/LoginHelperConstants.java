package com.bbva.glomohybrid.login.domain.constants;

import com.bbva.glomohybrid.login.domain.model.FormInputValidatorRule;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginHelperConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004¨\u0006."}, d2 = {"Lcom/bbva/glomohybrid/login/domain/constants/LoginHelperConstants;", "", "", "CLIENT_STATUS_NEW_CLIENT", "Ljava/lang/String;", "CLIENT_STATUS_PIN_BLOCKED", "CLIENT_STATUS_USER_BLOCKED", "CLIENT_STATUS_CANCELLED_BY_BUSINESS", "CLIENT_STATUS_CANCELLED_BY_BRANCH", "CLIENT_STATUS_PENDING_TO_ACTIVATE_EC", "CLIENT_STATUS_PENDING_TO_ACTIVATE_PE", "CLIENT_STATUS_PENDING_TO_ACTIVATE_PA", "CLIENT_STATUS_PENDING_TO_ACTIVATE_PS", "CLIENT_STATUS_TEMPORARY_SUSPENSION", "CLIENT_STATUS_DEVICE_NOT_REGISTER", "CLIENT_STATUS_CANCEL", "CLIENT_STATUS_ERASED", "CLIENT_STATUS_REACTIVATE", "", "FLOWMETER_RESPONSE_CODE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "Lcom/bbva/glomohybrid/login/domain/model/FormInputValidatorRule;", "a", "Ljava/util/List;", "getDocumentValidations", "()Ljava/util/List;", "documentValidations", "MAINTENANCE_RESPONSE_CODE", "MAINTENANCE_ERROR_CODE", "CUSTOMER_STATES", "FUNCTIONAL_ERROR", "CODE_HTTP_DENIED", "RESPONSE_HEADER_INDICATORS", "ERROR_CODE_INVALID_CREDENTIAL", "CODE_HTTP_INVALID_CREDENTIAL", "ERROR_CODE_TSECNULL", "MESSAGE_ERROR_24_HRS", "ERROR_CODE_TSECEXPIRATOR", "MESSAGE_ERROR_UPDATE_APP", "ERROR_CODE_FORBIDEN", "CLASSIFICATION_ID", "CLIENT_STATUS_CANCELLED_LOGIN_ERROR", "CUSTOMER_NUMBER_SYNCHRONIZATION_FAILED", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginHelperConstants {

    @NotNull
    public static final String CLASSIFICATION_ID = "33";

    @NotNull
    public static final String CLIENT_STATUS_CANCEL = "519";

    @NotNull
    public static final String CLIENT_STATUS_CANCELLED_BY_BRANCH = "C4";

    @NotNull
    public static final String CLIENT_STATUS_CANCELLED_BY_BUSINESS = "CN";

    @NotNull
    public static final String CLIENT_STATUS_CANCELLED_LOGIN_ERROR = "CNE0007";

    @NotNull
    public static final String CLIENT_STATUS_DEVICE_NOT_REGISTER = "475";

    @NotNull
    public static final String CLIENT_STATUS_ERASED = "451";

    @NotNull
    public static final String CLIENT_STATUS_NEW_CLIENT = "NE";

    @NotNull
    public static final String CLIENT_STATUS_PENDING_TO_ACTIVATE_EC = "EC";

    @NotNull
    public static final String CLIENT_STATUS_PENDING_TO_ACTIVATE_PA = "PA";

    @NotNull
    public static final String CLIENT_STATUS_PENDING_TO_ACTIVATE_PE = "PE";

    @NotNull
    public static final String CLIENT_STATUS_PENDING_TO_ACTIVATE_PS = "PS";

    @NotNull
    public static final String CLIENT_STATUS_PIN_BLOCKED = "B4";

    @NotNull
    public static final String CLIENT_STATUS_REACTIVATE = "KNE1582";

    @NotNull
    public static final String CLIENT_STATUS_TEMPORARY_SUSPENSION = "S4";

    @NotNull
    public static final String CLIENT_STATUS_USER_BLOCKED = "PB";
    public static final int CODE_HTTP_DENIED = 403;
    public static final int CODE_HTTP_INVALID_CREDENTIAL = 400;

    @NotNull
    public static final String CUSTOMER_NUMBER_SYNCHRONIZATION_FAILED = "KNE0116";

    @NotNull
    public static final String CUSTOMER_STATES = "KNE1582#";

    @NotNull
    public static final String ERROR_CODE_FORBIDEN = "forbidden";

    @NotNull
    public static final String ERROR_CODE_INVALID_CREDENTIAL = "invalidCredentials";

    @NotNull
    public static final String ERROR_CODE_TSECEXPIRATOR = "SAS_68";

    @NotNull
    public static final String ERROR_CODE_TSECNULL = "badRequest";
    public static final int FLOWMETER_RESPONSE_CODE = 504;

    @NotNull
    public static final String FUNCTIONAL_ERROR = "KNE5027#";

    @NotNull
    public static final String MAINTENANCE_ERROR_CODE = "170";
    public static final int MAINTENANCE_RESPONSE_CODE = 430;

    @NotNull
    public static final String MESSAGE_ERROR_24_HRS = "KNE0116#REINTENTAR DESPUES DE 24 HRS";

    @NotNull
    public static final String MESSAGE_ERROR_UPDATE_APP = "AKM0101";

    @NotNull
    public static final String RESPONSE_HEADER_INDICATORS = "authenticationtype";

    @NotNull
    public static final LoginHelperConstants INSTANCE = new LoginHelperConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<FormInputValidatorRule> documentValidations = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public final List<FormInputValidatorRule> getDocumentValidations() {
        return documentValidations;
    }
}
