package com.bbva.glomo.semaas;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 com.bbva.glomo.semaas.OmegaLogLevel[], still in use, count: 1, list:
  (r13v2 com.bbva.glomo.semaas.OmegaLogLevel[]) from 0x0059: INVOKE (r13v2 com.bbva.glomo.semaas.OmegaLogLevel[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
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
/* JADX INFO: compiled from: OmegaLogLevel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomo/semaas/OmegaLogLevel;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "TRACE", "DEBUG", "INFO", "WARN", "WARNING", "ERROR", "FATAL", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class OmegaLogLevel {
    TRACE("TRACE"),
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARN("WARN"),
    WARNING("WARNING"),
    ERROR("ERROR"),
    FATAL("FATAL");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: OmegaLogLevel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomo/semaas/OmegaLogLevel$Companion;", "", "()V", "parse", "Lcom/bbva/glomo/semaas/OmegaLogLevel;", "level", "", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOmegaLogLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OmegaLogLevel.kt\ncom/bbva/glomo/semaas/OmegaLogLevel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final OmegaLogLevel parse(@NotNull String level) {
            Intrinsics.checkNotNullParameter(level, "level");
            for (OmegaLogLevel omegaLogLevel : OmegaLogLevel.values()) {
                if (l.equals(omegaLogLevel.name(), level, true)) {
                    return omegaLogLevel;
                }
            }
            return null;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new OmegaLogLevel[]{r0, r1, r3, r5, r7, r9, r11});
    }

    public OmegaLogLevel(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<OmegaLogLevel> getEntries() {
        return $ENTRIES;
    }

    public static OmegaLogLevel valueOf(String str) {
        return (OmegaLogLevel) Enum.valueOf(OmegaLogLevel.class, str);
    }

    public static OmegaLogLevel[] values() {
        return (OmegaLogLevel[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
