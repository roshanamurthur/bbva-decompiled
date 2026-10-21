package bk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes12.dex */
public class z {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(it.next().getF79395p0() & 255) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(it.next().getF79399p0() + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long jM5595constructorimpl = 0;
        while (it.hasNext()) {
            jM5595constructorimpl = ULong.m5595constructorimpl(it.next().getF79403p0() + jM5595constructorimpl);
        }
        return jM5595constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int iM5570constructorimpl = 0;
        while (it.hasNext()) {
            iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(it.next().getF79407p0() & UShort.MAX_VALUE) + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrM5552constructorimpl = UByteArray.m5552constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            UByteArray.m5563setVurrAj0(bArrM5552constructorimpl, i10, it.next().getF79395p0());
            i10++;
        }
        return bArrM5552constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrM5577constructorimpl = UIntArray.m5577constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            UIntArray.m5588setVXSXFK8(iArrM5577constructorimpl, i10, it.next().getF79399p0());
            i10++;
        }
        return iArrM5577constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM5602constructorimpl = ULongArray.m5602constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ULongArray.m5613setk8EXiF4(jArrM5602constructorimpl, i10, it.next().getF79403p0());
            i10++;
        }
        return jArrM5602constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrM5627constructorimpl = UShortArray.m5627constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            UShortArray.m5638set01HTLdE(sArrM5627constructorimpl, i10, it.next().getF79407p0());
            i10++;
        }
        return sArrM5627constructorimpl;
    }
}
