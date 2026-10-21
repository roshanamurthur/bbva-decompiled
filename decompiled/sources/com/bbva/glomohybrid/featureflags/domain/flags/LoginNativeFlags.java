package com.bbva.glomohybrid.featureflags.domain.flags;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.bbva.glomohybrid.featureflags.domain.flags.LoginNativeFlags[], still in use, count: 1, list:
  (r2v3 com.bbva.glomohybrid.featureflags.domain.flags.LoginNativeFlags[]) from 0x0021: INVOKE (r2v3 com.bbva.glomohybrid.featureflags.domain.flags.LoginNativeFlags[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:34)
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
/* JADX INFO: compiled from: LoginNativeFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/flags/LoginNativeFlags;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "LOGIN_FORGOT_PASSWORD_BUTTON", "LOGIN_FIDO_STATE", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class LoginNativeFlags {
    LOGIN_FORGOT_PASSWORD_BUTTON("glomo.login.forgotPasswordButton"),
    LOGIN_FIDO_STATE("glomo.login.fidoAccessState");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String value;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(loginNativeFlagsArr);
    }

    public LoginNativeFlags(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<LoginNativeFlags> getEntries() {
        return $ENTRIES;
    }

    public static LoginNativeFlags valueOf(String str) {
        return (LoginNativeFlags) Enum.valueOf(LoginNativeFlags.class, str);
    }

    public static LoginNativeFlags[] values() {
        return (LoginNativeFlags[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
