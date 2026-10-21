package com.bbva.component.dm.biometriclogin.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v6 com.bbva.component.dm.biometriclogin.domain.model.FidoAuthenticationErrors[], still in use, count: 1, list:
  (r15v6 com.bbva.component.dm.biometriclogin.domain.model.FidoAuthenticationErrors[]) from 0x00aa: INVOKE (r15v6 com.bbva.component.dm.biometriclogin.domain.model.FidoAuthenticationErrors[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:171)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: FidoAuthenticationErrors.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/FidoAuthenticationErrors;", "", "", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "USER_NOT_ENROLLED", "KEY_DISAPPEARED_PERMANENTLY", "CANCELED", "AUTHENTICATOR_DELETED", "SYSTEM_CANCELED", "USER_LOCKOUT", "SERVER_ERROR", "PASSWORD_EXPIRED", "PASSWORD_BLOCKED", "INACTIVE_ACCOUNT", "NO_MATCH", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoAuthenticationErrors {
    USER_NOT_ENROLLED("User not enrolled on device"),
    KEY_DISAPPEARED_PERMANENTLY("Friendly Fraud"),
    CANCELED("The operation was cancelled by user"),
    AUTHENTICATOR_DELETED("Unsuccessful validation of user or credential."),
    SYSTEM_CANCELED("The operation was cancelled by system"),
    USER_LOCKOUT("Client failed while processing the operation"),
    SERVER_ERROR("Server unavailable"),
    PASSWORD_EXPIRED("Password expired"),
    PASSWORD_BLOCKED("Password blocked"),
    INACTIVE_ACCOUNT("Inactive account"),
    NO_MATCH("NO_MATCH");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String errorMessage;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(fidoAuthenticationErrorsArr);
    }

    public FidoAuthenticationErrors(String str) {
        super(str, i);
        this.errorMessage = str;
    }

    @NotNull
    public static EnumEntries<FidoAuthenticationErrors> getEntries() {
        return $ENTRIES;
    }

    public static FidoAuthenticationErrors valueOf(String str) {
        return (FidoAuthenticationErrors) Enum.valueOf(FidoAuthenticationErrors.class, str);
    }

    public static FidoAuthenticationErrors[] values() {
        return (FidoAuthenticationErrors[]) $VALUES.clone();
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
