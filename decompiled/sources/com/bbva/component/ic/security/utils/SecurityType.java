package com.bbva.component.ic.security.utils;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 com.bbva.component.ic.security.utils.SecurityType[], still in use, count: 1, list:
  (r10v2 com.bbva.component.ic.security.utils.SecurityType[]) from 0x005f: INVOKE (r10v2 com.bbva.component.ic.security.utils.SecurityType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:96)
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
/* JADX INFO: compiled from: SecurityType.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityType;", "", "", Constants.authenticationType, "Ljava/lang/String;", "getAuthenticationType", "()Ljava/lang/String;", Constants.authenticationData, "getAuthenticationData", "Companion", "OTP_SMS", "OTP_TOKEN", "CRONTO_TOKEN", "SOFT_TOKEN", "SOFT_TOKEN_CHALLENGE", "SOFT_TOKEN_CHALLENGE_R2", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final class SecurityType {
    OTP_SMS("05", "otp-sms"),
    OTP_TOKEN(LoginHelperConstants.CLASSIFICATION_ID, "otp-token"),
    CRONTO_TOKEN("145", "otp-token"),
    SOFT_TOKEN("131", "otp-softoken"),
    SOFT_TOKEN_CHALLENGE("132", "otp-softoken"),
    SOFT_TOKEN_CHALLENGE_R2("36", "otp-softoken");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String authenticationData;

    @NotNull
    private final String authenticationType;

    /* JADX INFO: compiled from: SecurityType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityType$Companion;", "", "<init>", "()V", "getSecurityTypeByAuthenticationType", "Lcom/bbva/component/ic/security/utils/SecurityType;", Constants.authenticationType, "", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SecurityType getSecurityTypeByAuthenticationType(@Nullable String authenticationType) {
            SecurityType securityType = SecurityType.OTP_SMS;
            if (Intrinsics.areEqual(authenticationType, securityType.getAuthenticationType())) {
                return securityType;
            }
            SecurityType securityType2 = SecurityType.OTP_TOKEN;
            if (Intrinsics.areEqual(authenticationType, securityType2.getAuthenticationType())) {
                return securityType2;
            }
            SecurityType securityType3 = SecurityType.SOFT_TOKEN;
            if (Intrinsics.areEqual(authenticationType, securityType3.getAuthenticationType())) {
                return securityType3;
            }
            SecurityType securityType4 = SecurityType.SOFT_TOKEN_CHALLENGE;
            if (Intrinsics.areEqual(authenticationType, securityType4.getAuthenticationType())) {
                return securityType4;
            }
            SecurityType securityType5 = SecurityType.SOFT_TOKEN_CHALLENGE_R2;
            if (Intrinsics.areEqual(authenticationType, securityType5.getAuthenticationType())) {
                return securityType5;
            }
            SecurityType securityType6 = SecurityType.CRONTO_TOKEN;
            if (Intrinsics.areEqual(authenticationType, securityType6.getAuthenticationType())) {
                return securityType6;
            }
            return null;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new SecurityType[]{r0, r1, r2, r5, r6, r9});
    }

    public SecurityType(String str, String str2) {
        super(str, i);
        this.authenticationType = str;
        this.authenticationData = str2;
    }

    @NotNull
    public static EnumEntries<SecurityType> getEntries() {
        return $ENTRIES;
    }

    public static SecurityType valueOf(String str) {
        return (SecurityType) Enum.valueOf(SecurityType.class, str);
    }

    public static SecurityType[] values() {
        return (SecurityType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAuthenticationData() {
        return this.authenticationData;
    }

    @NotNull
    public final String getAuthenticationType() {
        return this.authenticationType;
    }
}
