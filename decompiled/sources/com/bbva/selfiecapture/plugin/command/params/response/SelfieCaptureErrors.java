package com.bbva.selfiecapture.plugin.command.params.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.bbva.selfiecapture.plugin.command.params.response.SelfieCaptureErrors[], still in use, count: 1, list:
  (r1v1 com.bbva.selfiecapture.plugin.command.params.response.SelfieCaptureErrors[]) from 0x000f: INVOKE (r1v1 com.bbva.selfiecapture.plugin.command.params.response.SelfieCaptureErrors[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:16)
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
/* JADX INFO: compiled from: SelfieCaptureErrors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureErrors;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "description", "Ljava/lang/String;", "SELFIE_CAPTURE_NOT_INITIALIZED", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class SelfieCaptureErrors implements ErrorMessage {
    SELFIE_CAPTURE_NOT_INITIALIZED;

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int code;

    @NotNull
    private final String description;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(selfieCaptureErrorsArr);
    }

    public SelfieCaptureErrors() {
        super("SELFIE_CAPTURE_NOT_INITIALIZED", 0);
        this.code = 2001;
        this.description = "Selfie Capture not initialized";
    }

    @NotNull
    public static EnumEntries<SelfieCaptureErrors> getEntries() {
        return $ENTRIES;
    }

    public static SelfieCaptureErrors valueOf(String str) {
        return (SelfieCaptureErrors) Enum.valueOf(SelfieCaptureErrors.class, str);
    }

    public static SelfieCaptureErrors[] values() {
        return (SelfieCaptureErrors[]) $VALUES.clone();
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getDescription() {
        return this.description;
    }
}
