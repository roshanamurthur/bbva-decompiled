package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/name;", "", "", "a", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "", "Lcom/mypinpad/tsdk/i/name$setX;", "b", "Lkotlin/Lazy;", "setY", "()[Lcom/mypinpad/tsdk/i/name$setX;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class name {

    @NotNull
    public static final name INSTANCE = new name();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57223c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57224d = 1;

    public static final class setDividerPadding extends Lambda implements Function0<setX[]> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final setDividerPadding f57225p0 = new setDividerPadding();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57226q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57227r0 = 1;

        public /* synthetic */ class setX {
            public static final /* synthetic */ int[] setX;

            static {
                int[] iArr = new int[Terminal.valuesCustom().length];
                iArr[Terminal.OTHER.ordinal()] = 1;
                iArr[Terminal.KERNEL_1.ordinal()] = 2;
                iArr[Terminal.KERNEL_2.ordinal()] = 3;
                iArr[Terminal.KERNEL_3.ordinal()] = 4;
                iArr[Terminal.KERNEL_4.ordinal()] = 5;
                iArr[Terminal.KERNEL_5.ordinal()] = 6;
                iArr[Terminal.KERNEL_6.ordinal()] = 7;
                iArr[Terminal.KERNEL_7.ordinal()] = 8;
                iArr[Terminal.KERNEL_13.ordinal()] = 9;
                iArr[Terminal.KERNEL_INTERAC.ordinal()] = 10;
                iArr[Terminal.KERNEL_EFTPOS.ordinal()] = 11;
                setX = iArr;
                int i10 = 1 + 125;
                int i11 = i10 % 128;
                int i12 = i10 % 2;
            }
        }

        static {
            int i10 = f57227r0;
            int i11 = (((i10 | 28) << 1) - (i10 ^ 28)) - 1;
            f57226q0 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public setDividerPadding() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x01e4 A[LOOP:1: B:16:0x010d->B:36:0x01e4, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:54:0x01f8 A[SYNTHETIC] */
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            setX[] setxArr;
            int i13;
            int i14;
            int i15;
            String str;
            int i16 = ~i12;
            int i17 = i16 | i10;
            int i18 = ((~(i17 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
            int i19 = ~i11;
            int i20 = (((~i17) | (~(i19 | i10)) | (~(i19 | i16))) * (-52)) + i18;
            int i21 = ~i10;
            if ((((~(i21 | i11)) | (~(i16 | i21))) * 52) + i20 != 1) {
                int i22 = f57226q0 + 15;
                f57227r0 = i22 % 128;
                int i23 = i22 % 2;
                setxArr = (setX[]) a(new Object[0], -1933969876, 1933969877, (int) System.currentTimeMillis());
                int i24 = f57227r0;
                int i25 = ((i24 & 14) + (i24 | 14)) - 1;
                f57226q0 = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
            } else {
                Terminal[] terminalArrValuesCustom = Terminal.valuesCustom();
                ArrayList arrayList = new ArrayList();
                int length = terminalArrValuesCustom.length;
                int i26 = f57227r0;
                int i27 = i26 & 95;
                int i28 = ((((i26 ^ 95) | i27) << 1) - (~(-((i26 | 95) & (~i27))))) - 1;
                f57226q0 = i28 % 128;
                int i29 = i28 % 2;
                int i30 = 0;
                while (i30 < length) {
                    int i31 = f57227r0;
                    int i32 = ((i31 ^ 99) | (i31 & 99)) << 1;
                    int i33 = -(((~i31) & 99) | (i31 & (-100)));
                    int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                    f57226q0 = i34 % 128;
                    int i35 = i34 % 2;
                    Terminal terminal = terminalArrValuesCustom[i30];
                    if (terminal.setCompoundDrawableTintBlendMode()) {
                        int i36 = f57227r0;
                        int i37 = ((i36 & 12) + (i36 | 12)) - 1;
                        f57226q0 = i37 % 128;
                        int i38 = i37 % 2;
                        arrayList.add(terminal);
                        int i39 = f57226q0;
                        int i40 = i39 & 69;
                        int i41 = ((i39 ^ 69) | i40) << 1;
                        int i42 = -((i39 | 69) & (~i40));
                        int i43 = (i41 & i42) + (i42 | i41);
                        f57227r0 = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    int i45 = i30 & 118;
                    int i46 = i30 | 118;
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    i30 = (((i47 | (-117)) << 1) - (~(-((i47 & 116) | ((~i47) & (-117)))))) - 1;
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i48 = f57226q0;
                int i49 = (((i48 ^ 97) | (i48 & 97)) << 1) - (((~i48) & 97) | (i48 & (-98)));
                f57227r0 = i49 % 128;
                while (true) {
                    int i50 = i49 % 2;
                    if (it.hasNext()) {
                        int i51 = (-2) - ((f57227r0 + 64) ^ (-1));
                        f57226q0 = i51 % 128;
                        int i52 = i51 % 2;
                        Terminal terminal2 = (Terminal) it.next();
                        switch (setX.setX[terminal2.ordinal()]) {
                            case 1:
                                int i53 = f57227r0;
                                int i54 = i53 & 31;
                                i13 = i54 + ((i53 ^ 31) | i54);
                                f57226q0 = i13 % 128;
                                int i55 = i13 % 2;
                                str = null;
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i56 = f57227r0;
                                i49 = (i56 & 111) + (i56 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 2:
                                int i57 = f57227r0;
                                i14 = i57 ^ 41;
                                i15 = ~((i57 & 41) << 1);
                                i13 = (i14 - i15) - 1;
                                f57226q0 = i13 % 128;
                                int i58 = i13 % 2;
                                str = null;
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i59 = f57227r0;
                                i49 = (i59 & 111) + (i59 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 3:
                                int i60 = f57226q0 + 74;
                                int i61 = (i60 ^ (-1)) + (i60 << 1);
                                f57227r0 = i61 % 128;
                                int i62 = i61 % 2;
                                str = "Kernel2 Version 1.1.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i510 = f57227r0;
                                i49 = (i510 & 111) + (i510 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 4:
                                int i63 = f57227r0 + 55;
                                f57226q0 = i63 % 128;
                                int i64 = i63 % 2;
                                str = "Kernel3 Version 1.2.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i511 = f57227r0;
                                i49 = (i511 & 111) + (i511 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 5:
                                int i65 = f57226q0 + 11;
                                f57227r0 = i65 % 128;
                                int i66 = i65 % 2;
                                str = "Kernel4 Version 1.1.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i512 = f57227r0;
                                i49 = (i512 & 111) + (i512 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 6:
                                int i67 = f57227r0;
                                i13 = (((i67 | 46) << 1) - (i67 ^ 46)) - 1;
                                f57226q0 = i13 % 128;
                                int i513 = i13 % 2;
                                str = null;
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i514 = f57227r0;
                                i49 = (i514 & 111) + (i514 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 7:
                                int i68 = f57226q0;
                                int i69 = i68 & 123;
                                int i70 = (i68 ^ 123) | i69;
                                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                                f57227r0 = i71 % 128;
                                int i72 = i71 % 2;
                                str = "Kernel6 Version 1.0.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i515 = f57227r0;
                                i49 = (i515 & 111) + (i515 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 8:
                                int i73 = f57227r0;
                                i14 = (i73 | 80) << 1;
                                i15 = i73 ^ 80;
                                i13 = (i14 - i15) - 1;
                                f57226q0 = i13 % 128;
                                int i516 = i13 % 2;
                                str = null;
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i517 = f57227r0;
                                i49 = (i517 & 111) + (i517 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 9:
                                int i74 = f57227r0;
                                int i75 = ((i74 & (-28)) | ((~i74) & 27)) + ((i74 & 27) << 1);
                                f57226q0 = i75 % 128;
                                int i76 = i75 % 2;
                                str = "Kernel13 Version 1.0.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i518 = f57227r0;
                                i49 = (i518 & 111) + (i518 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 10:
                                int i77 = f57227r0;
                                int i78 = ((i77 | 35) << 1) - (i77 ^ 35);
                                f57226q0 = i78 % 128;
                                int i79 = i78 % 2;
                                str = "KernelInterac Version 1.0.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i519 = f57227r0;
                                i49 = (i519 & 111) + (i519 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            case 11:
                                int i80 = f57226q0;
                                int i81 = ((i80 | 125) << 1) - (i80 ^ 125);
                                f57227r0 = i81 % 128;
                                int i82 = i81 % 2;
                                str = "KernelEftpos Version 1.0.0";
                                if (str == null) {
                                    throw new setIndeterminateDrawable(3036, String.valueOf(terminal2), null, 4, null);
                                }
                                arrayList2.add(TuplesKt.to(terminal2, str));
                                int i5110 = f57227r0;
                                i49 = (i5110 & 111) + (i5110 | 111);
                                f57226q0 = i49 % 128;
                                break;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        int i83 = f57226q0;
                        int i84 = ((i83 | 49) << 1) - (i83 ^ 49);
                        f57227r0 = i84 % 128;
                        while (true) {
                            int i85 = i84 % 2;
                            if (it2.hasNext()) {
                                Pair pair = (Pair) it2.next();
                                Terminal terminal3 = (Terminal) pair.component1();
                                arrayList3.add(new setX(terminal3.setY(), terminal3.setDividerPadding(), (String) pair.component2()));
                                int i86 = f57227r0;
                                int i87 = i86 | 3;
                                int i88 = i87 << 1;
                                int i89 = -((~(i86 & 3)) & i87);
                                i84 = (i88 ^ i89) + ((i89 & i88) << 1);
                                f57226q0 = i84 % 128;
                            } else {
                                Object[] array = arrayList3.toArray(new setX[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                setxArr = (setX[]) array;
                                int i90 = f57226q0;
                                int i91 = ((i90 & 74) + (i90 | 74)) - 1;
                                f57227r0 = i91 % 128;
                                if (i91 % 2 == 0) {
                                    int i92 = 10 / 0;
                                }
                            }
                        }
                    }
                }
            }
            return setxArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.mypinpad.tsdk.i.name$setX[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setX[] invoke() {
            return a(new Object[]{this}, 326395038, -326395038, System.identityHashCode(this));
        }
    }

    static {
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        setCompoundDrawableTintBlendMode = (String) setRenderEffect.setCompoundDrawableTintBlendMode(new Object[0], -757761411, 757761411, (int) System.currentTimeMillis());
        setX = LazyKt__LazyJVMKt.lazy(setDividerPadding.f57225p0);
        int i10 = f57224d;
        int i11 = i10 & 1;
        int i12 = -(-(i10 | 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f57223c = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public static String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[0], -249713715, 249713715, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        if ((((~(i13 | i11)) | (~(i13 | i17)) | (~(i10 | i14 | i12))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
            int i18 = f57223c;
            int i19 = (i18 & 119) + (i18 | 119);
            int i20 = i19 % 128;
            f57224d = i20;
            if (i19 % 2 == 0) {
                throw null;
            }
            int i21 = ((i20 | 76) << 1) - (i20 ^ 76);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            f57223c = i22 % 128;
            int i23 = i22 % 2;
            return setCompoundDrawableTintBlendMode;
        }
        int i24 = f57224d;
        int i25 = i24 & 95;
        int i26 = (i25 - (~(-(-((i24 ^ 95) | i25))))) - 1;
        f57223c = i26 % 128;
        int i27 = i26 % 2;
        setX[] setxArr = (setX[]) setX.getValue();
        int i28 = f57224d;
        int i29 = (i28 & (-4)) | ((~i28) & 3);
        int i30 = (i28 & 3) << 1;
        int i31 = (i29 & i30) + (i30 | i29);
        f57223c = i31 % 128;
        int i32 = i31 % 2;
        return setxArr;
    }

    @JvmName(name = "setY")
    @NotNull
    public static setX[] setY() {
        return (setX[]) setX(new Object[0], 1651376506, -1651376505, (int) System.currentTimeMillis());
    }

    public static final class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f57228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f57229b;

        public setX(byte b10, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.f57228a = b10;
            this.f57229b = str2;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 517) + (i10 * (-515));
            int i14 = ~i11;
            int i15 = ~(i14 | i12);
            int i16 = ~i12;
            int i17 = i15 | (~(i16 | i10));
            int i18 = ~(i16 | i11);
            int i19 = ~i10;
            return (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((((~(i12 | (i14 | i19))) | (~((i19 | i16) | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((i17 | i18) * (-516)) + i13)) != 1 ? Byte.valueOf(((setX) objArr[0]).f57228a) : ((setX) objArr[0]).f57229b;
        }

        public final byte setY() {
            return ((Byte) setX(new Object[]{this}, 97530741, -97530741, System.identityHashCode(this))).byteValue();
        }

        @NotNull
        public final String setX() {
            return (String) setX(new Object[]{this}, -548165890, 548165891, System.identityHashCode(this));
        }
    }
}
