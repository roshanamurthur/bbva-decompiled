package com.bbva.showinfo.model;

import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 com.bbva.showinfo.model.SnackBarType[], still in use, count: 1, list:
  (r8v3 com.bbva.showinfo.model.SnackBarType[]) from 0x004b: INVOKE (r8v3 com.bbva.showinfo.model.SnackBarType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:76)
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
/* JADX INFO: compiled from: SnackBarType.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ERROR", "INFO", NotifyProvisionResult.SUCCESS_RESULT, "WARNING", "HIDE", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class SnackBarType {
    ERROR("error"),
    INFO("info"),
    SUCCESS("success"),
    WARNING("warning"),
    HIDE(HideCommand.ID);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: SnackBarType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarType$Companion;", "", "()V", "fromValue", "Lcom/bbva/showinfo/model/SnackBarType;", "value", "", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnackBarType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackBarType.kt\ncom/bbva/showinfo/model/SnackBarType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,18:1\n1282#2,2:19\n*S KotlinDebug\n*F\n+ 1 SnackBarType.kt\ncom/bbva/showinfo/model/SnackBarType$Companion\n*L\n15#1:19,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SnackBarType fromValue(@Nullable String value) {
            for (SnackBarType snackBarType : SnackBarType.values()) {
                if (Intrinsics.areEqual(snackBarType.getValue(), value)) {
                    return snackBarType;
                }
            }
            return null;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new SnackBarType[]{r0, r1, r2, r4, r6});
    }

    public SnackBarType(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<SnackBarType> getEntries() {
        return $ENTRIES;
    }

    public static SnackBarType valueOf(String str) {
        return (SnackBarType) Enum.valueOf(SnackBarType.class, str);
    }

    public static SnackBarType[] values() {
        return (SnackBarType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
