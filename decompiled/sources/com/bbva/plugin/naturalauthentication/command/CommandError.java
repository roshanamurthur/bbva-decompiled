package com.bbva.plugin.naturalauthentication.command;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v13 com.bbva.plugin.naturalauthentication.command.CommandError[], still in use, count: 1, list:
  (r6v13 com.bbva.plugin.naturalauthentication.command.CommandError[]) from 0x018d: INVOKE (r6v13 com.bbva.plugin.naturalauthentication.command.CommandError[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:398)
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
/* JADX INFO: compiled from: CommandError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/CommandError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "", "getMessage", "", "getCode", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "ErrorInitialization", "ErrorRegister", "ErrorCheckRegister", "ErrorDelete", "ErrorDeleteAll", "ErrorSignTransaction", "ErrorListAuthenticators", "ErrorCheckAuthenticate", "ErrorAuthenticate", "ErrorGetDeviceId", "ErrorCreateAuthMessage", "ErrorProcessAuthMessage", "ErrorSettingFacetsUrl", "ErrorDiscoverBiometricCapabilities", "ErrorHasSuitableAuthenticator", "ErrorDiscoverCapabilities", "ErrorSettingQuickAuthEnabled", "ErrorGettingQuickAuthData", "ErrorGettingQuickAuthDataEmpty", "ErrorSettingExternalDeviceId", "ErrorGetFacetsUrl", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class CommandError implements ErrorMessage {
    ErrorInitialization(-1, "Fido initialization error"),
    ErrorRegister(-2, "Fido register error"),
    ErrorCheckRegister(-3, "Fido register check error"),
    ErrorDelete(-4, "Fido delete error"),
    ErrorDeleteAll(-5, "Fido delete all error"),
    ErrorSignTransaction(-6, "Fido sign transaction error"),
    ErrorListAuthenticators(-7, "Fido list authenticators error"),
    ErrorCheckAuthenticate(-8, "Fido authenticate check error"),
    ErrorAuthenticate(-9, "Fido authenticate error"),
    ErrorGetDeviceId(-10, "Fido get device id error"),
    ErrorCreateAuthMessage(-11, "Fido create auth message error"),
    ErrorProcessAuthMessage(-12, "Fido process auth message error"),
    ErrorSettingFacetsUrl(-13, "Fido set facets url error"),
    ErrorDiscoverBiometricCapabilities(-14, "Fido discover device biometric capabilities error"),
    ErrorHasSuitableAuthenticator(-15, "Fido has suitable authenticator error"),
    ErrorDiscoverCapabilities(-16, "Fido discover device capabilities error"),
    ErrorSettingQuickAuthEnabled(-17, "Fido set quick-auth enabled error"),
    ErrorGettingQuickAuthData(-18, "Fido get quick-auth data error"),
    ErrorGettingQuickAuthDataEmpty(-19, "Fido get quick-auth data empty"),
    ErrorSettingExternalDeviceId(-20, "Fido set external device id error"),
    ErrorGetFacetsUrl(-21, "Fido get facets url error");

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int code;

    @NotNull
    private final String message;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(commandErrorArr);
    }

    public CommandError(int i10, String str) {
        super(str, i);
        this.code = i10;
        this.message = str;
    }

    @NotNull
    public static EnumEntries<CommandError> getEntries() {
        return $ENTRIES;
    }

    public static CommandError valueOf(String str) {
        return (CommandError) Enum.valueOf(CommandError.class, str);
    }

    public static CommandError[] values() {
        return (CommandError[]) $VALUES.clone();
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
