package com.bbva.ui.components.timer;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 com.bbva.ui.components.timer.TimeFormat[], still in use, count: 1, list:
  (r8v2 com.bbva.ui.components.timer.TimeFormat[]) from 0x004e: INVOKE (r8v2 com.bbva.ui.components.timer.TimeFormat[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:79)
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
/* JADX INFO: compiled from: TimeFormat.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/components/timer/TimeFormat;", "", "", "conversionFactor", "J", "getConversionFactor", "()J", "Ljava/text/SimpleDateFormat;", "dateFormat$delegate", "Lkotlin/Lazy;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormat", "MILLIS", "SECONDS", "MINUTES", "HOUR", "DAY", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class TimeFormat {
    MILLIS(1L),
    SECONDS(1000L),
    MINUTES(60000L),
    HOUR(3600000L),
    DAY(86400000L);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final long conversionFactor;

    /* JADX INFO: renamed from: dateFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateFormat;

    /* JADX INFO: compiled from: TimeFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeFormat.values().length];
            try {
                iArr[TimeFormat.MILLIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeFormat.SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeFormat.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeFormat.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeFormat.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TimeFormat.kt */
    public static final class a extends Lambda implements Function0<SimpleDateFormat> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return TimeFormat.access$toDateFormat(TimeFormat.this);
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(timeFormatArr);
    }

    public TimeFormat(long j10) {
        super(str, i);
        this.conversionFactor = j10;
        this.dateFormat = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final SimpleDateFormat access$toDateFormat(TimeFormat timeFormat) {
        timeFormat.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[timeFormat.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new SimpleDateFormat("mm:ss", Locale.getDefault());
        }
        if (i10 == 4 || i10 == 5) {
            return new SimpleDateFormat(Time.TIME_FORMAT, Locale.getDefault());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static EnumEntries<TimeFormat> getEntries() {
        return $ENTRIES;
    }

    public static TimeFormat valueOf(String str) {
        return (TimeFormat) Enum.valueOf(TimeFormat.class, str);
    }

    public static TimeFormat[] values() {
        return (TimeFormat[]) $VALUES.clone();
    }

    public final long getConversionFactor() {
        return this.conversionFactor;
    }

    @NotNull
    public final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) this.dateFormat.getValue();
    }
}
