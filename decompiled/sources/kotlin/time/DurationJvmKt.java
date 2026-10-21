package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "value", "", "decimals", "", "formatToExactDecimals", "formatUpToDecimals", "", "durationAssertionsEnabled", "Z", "getDurationAssertionsEnabled", "()Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class DurationJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<DecimalFormat>[] f82385a;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f82385a = threadLocalArr;
    }

    public static final DecimalFormat a(int i10) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i10 > 0) {
            decimalFormat.setMinimumFractionDigits(i10);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String formatToExactDecimals(double d2, int i10) {
        DecimalFormat decimalFormatA;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f82385a;
        if (i10 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i10];
            DecimalFormat decimalFormatA2 = threadLocal.get();
            if (decimalFormatA2 == null) {
                decimalFormatA2 = a(i10);
                threadLocal.set(decimalFormatA2);
            } else {
                Intrinsics.checkNotNull(decimalFormatA2);
            }
            decimalFormatA = decimalFormatA2;
        } else {
            decimalFormatA = a(i10);
        }
        String str = decimalFormatA.format(d2);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formatUpToDecimals(double d2, int i10) {
        DecimalFormat decimalFormatA = a(0);
        decimalFormatA.setMaximumFractionDigits(i10);
        String str = decimalFormatA.format(d2);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return false;
    }
}
