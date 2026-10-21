package kl;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public class e {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence<UByte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UByte> it = sequence.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(it.next().getF79395p0() & 255) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence<UInt> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UInt> it = sequence.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(it.next().getF79399p0() + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence<ULong> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<ULong> it = sequence.iterator();
        long jM5595constructorimpl = 0;
        while (it.hasNext()) {
            jM5595constructorimpl = ULong.m5595constructorimpl(it.next().getF79403p0() + jM5595constructorimpl);
        }
        return jM5595constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence<UShort> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UShort> it = sequence.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(it.next().getF79407p0() & UShort.MAX_VALUE) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }
}
