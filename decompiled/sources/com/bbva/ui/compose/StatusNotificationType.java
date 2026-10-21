package com.bbva.ui.compose;

import androidx.annotation.AttrRes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 com.bbva.ui.compose.StatusNotificationType[], still in use, count: 1, list:
  (r2v2 com.bbva.ui.compose.StatusNotificationType[]) from 0x0041: INVOKE (r2v2 com.bbva.ui.compose.StatusNotificationType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:66)
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
/* JADX INFO: compiled from: StatusNotification.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/ui/compose/StatusNotificationType;", "", "", "iconResId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIconResId", "()I", "iconColorResId", "getIconColorResId", "backgroundResId", "getBackgroundResId", "INFO", "ERROR", "WARNING", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class StatusNotificationType {
    INFO(R.drawable.ic_info_16dp, R.attr.support_info_default, R.attr.surface_info_default),
    ERROR(R.drawable.ui_ic_warning_16dp, R.attr.support_error_default, R.attr.surface_error_default),
    WARNING(R.drawable.ic_caution_16dp, R.attr.support_warning_default, R.attr.surface_warning_default);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int backgroundResId;
    private final int iconColorResId;
    private final int iconResId;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(statusNotificationTypeArr);
    }

    public StatusNotificationType(@AttrRes int i10, int i11, int i12) {
        super(str, i);
        this.iconResId = i10;
        this.iconColorResId = i11;
        this.backgroundResId = i12;
    }

    @NotNull
    public static EnumEntries<StatusNotificationType> getEntries() {
        return $ENTRIES;
    }

    public static StatusNotificationType valueOf(String str) {
        return (StatusNotificationType) Enum.valueOf(StatusNotificationType.class, str);
    }

    public static StatusNotificationType[] values() {
        return (StatusNotificationType[]) $VALUES.clone();
    }

    public final int getBackgroundResId() {
        return this.backgroundResId;
    }

    public final int getIconColorResId() {
        return this.iconColorResId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }
}
