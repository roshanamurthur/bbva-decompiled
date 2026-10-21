package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import com.esotericsoftware.asm.Opcodes;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0012\u001a\u0004\u0018\u00010\u0011\"\b\b\u0000\u0010\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0015J\u0015\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0017J%\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u001bJ!\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/mypinpad/tsdk/i/du;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "", "p1", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;[B)Z", "Lcom/mypinpad/tsdk/i/setRotationX;", "setX", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setRotationX;)[B", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/setTextKeepState;", "Lcom/mypinpad/tsdk/i/ew;", "p2", "p3", "Lcom/mypinpad/tsdk/i/fk;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/setRotationX;)Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/df;", "([BLcom/mypinpad/tsdk/i/df;[B)[B", "", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)V", "Lcom/mypinpad/tsdk/i/av;", "setY", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setRotationX;Lcom/mypinpad/tsdk/i/av;)V", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Z", "Lcom/mypinpad/tsdk/i/getValue;", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/getValue;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class du {

    @NotNull
    public static final du INSTANCE = new du();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55254a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55255b = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55256q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55257r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ am f55258p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(am amVar) {
            super(1);
            this.f55258p0 = amVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x016a  */
        /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14;
            int i15 = (~i10) | (~i12);
            if (((i10 | (~(i11 | i12))) * 519) + (((~(i15 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i15) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i16 = f55257r0;
                int i17 = ((i16 & 4) + (i16 | 4)) - 1;
                f55256q0 = i17 % 128;
                cv cvVar = (cv) obj;
                if (i17 % 2 != 0) {
                    a(new Object[]{aVar, cvVar}, -136855896, 136855896, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar, cvVar}, -136855896, 136855896, System.identityHashCode(aVar));
                Unit unit2 = Unit.INSTANCE;
                int i18 = f55256q0;
                int i19 = (i18 & (-28)) | ((~i18) & 27);
                int i20 = (i18 & 27) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f55257r0 = i21 % 128;
                if (i21 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            cv cvVar2 = (cv) objArr[1];
            int i22 = f55256q0;
            int i23 = i22 ^ 75;
            int i24 = ((i22 & 75) | i23) << 1;
            int i25 = -i23;
            int i26 = (i24 & i25) + (i24 | i25);
            f55257r0 = i26 % 128;
            int i27 = i26 % 2;
            Intrinsics.checkNotNullParameter(cvVar2, "");
            am amVar = aVar2.f55258p0;
            if (!((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue()) {
                am amVar2 = aVar2.f55258p0;
                if (((Boolean) am.setY(new Object[]{amVar2}, -1574629909, 1574629909, System.identityHashCode(amVar2))).booleanValue()) {
                    int i28 = f55257r0 + 13;
                    f55256q0 = i28 % 128;
                    if (i28 % 2 != 0) {
                        cv.setDividerPadding(new Object[]{cvVar2}, -1388264608, 1388264633, System.identityHashCode(cvVar2));
                        throw null;
                    }
                    cv.setDividerPadding(new Object[]{cvVar2}, -1388264608, 1388264633, System.identityHashCode(cvVar2));
                    int i29 = f55256q0;
                    int i30 = i29 ^ 89;
                    int i31 = ((i29 & 89) | i30) << 1;
                    int i32 = -i30;
                    i13 = ((i31 | i32) << 1) - (i31 ^ i32);
                    f55257r0 = i13 % 128;
                } else if (((Boolean) am.setY(new Object[]{amVar2}, -1378668101, 1378668110, System.identityHashCode(amVar2))).booleanValue()) {
                    int i33 = f55256q0;
                    int i34 = ((i33 & 108) + (i33 | 108)) - 1;
                    f55257r0 = i34 % 128;
                    if (i34 % 2 == 0) {
                        cv.setDividerPadding(new Object[]{cvVar2}, -86802886, 86802895, System.identityHashCode(cvVar2));
                        throw null;
                    }
                    cv.setDividerPadding(new Object[]{cvVar2}, -86802886, 86802895, System.identityHashCode(cvVar2));
                }
                cv.setDividerPadding(new Object[]{cvVar2, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar2));
                i14 = f55256q0 + 125;
                f55257r0 = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                int i35 = 54 / 0;
                return null;
            }
            int i36 = f55257r0;
            int i37 = (i36 | 5) << 1;
            int i38 = -(i36 ^ 5);
            int i39 = (i37 & i38) + (i38 | i37);
            f55256q0 = i39 % 128;
            if (i39 % 2 != 0) {
                cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar2));
            } else {
                cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar2));
            }
            int i40 = f55257r0;
            int i41 = i40 & 67;
            int i42 = -(-((i40 ^ 67) | i41));
            i13 = ((i41 | i42) << 1) - (i42 ^ i41);
            f55256q0 = i13 % 128;
            int i43 = i13 % 2;
            cv.setDividerPadding(new Object[]{cvVar2, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar2));
            i14 = f55256q0 + 125;
            f55257r0 = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            int i310 = 54 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 1376121205, -1376121204, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f55259p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55260q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55261r0 = 1;

        static {
            int i10 = f55261r0;
            int i11 = i10 & 109;
            int i12 = i11 + ((i10 ^ 109) | i11);
            f55260q0 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 70 / 0;
            }
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
            int i14 = ~i12;
            int i15 = ~i10;
            int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
            int i17 = ~i11;
            int i18 = i15 | i17;
            int i19 = i14 | i17;
            if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i20 = f55261r0 + 31;
                f55260q0 = i20 % 128;
                dc dcVar = (dc) obj;
                if (i20 % 2 != 0) {
                    a(new Object[]{bVar, dcVar}, 515548334, -515548333, System.identityHashCode(bVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{bVar, dcVar}, 515548334, -515548333, System.identityHashCode(bVar));
                Unit unit2 = Unit.INSTANCE;
                int i21 = f55260q0;
                int i22 = (((i21 ^ 65) | (i21 & 65)) << 1) - (((~i21) & 65) | (i21 & (-66)));
                f55261r0 = i22 % 128;
                if (i22 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }
            dc dcVar2 = (dc) objArr[1];
            int i23 = f55260q0;
            int i24 = i23 & 3;
            int i25 = -(-((i23 ^ 3) | i24));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f55261r0 = i26 % 128;
            if (i26 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dcVar2, "");
                dc.setDividerPadding(new Object[]{dcVar2}, -1087540522, 1087540523, System.identityHashCode(dcVar2));
                int i27 = 6 / 0;
            } else {
                Intrinsics.checkNotNullParameter(dcVar2, "");
                dc.setDividerPadding(new Object[]{dcVar2}, -1087540522, 1087540523, System.identityHashCode(dcVar2));
            }
            int i28 = f55260q0;
            int i29 = ((i28 ^ 6) + ((i28 & 6) << 1)) - 1;
            f55261r0 = i29 % 128;
            if (i29 % 2 != 0) {
                return null;
            }
            int i30 = 1 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, 1452175781, -1452175781, System.identityHashCode(this));
        }
    }

    public final class setCompoundDrawableTintBlendMode extends dp {
    }

    public static final class setDividerPadding extends dp {
    }

    static {
        int i10 = f55254a;
        int i11 = i10 ^ 77;
        int i12 = (((i10 & 77) | i11) << 1) - i11;
        f55255b = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(setrotationx, "");
        setOverscrollHeader setoverscrollheader = new setOverscrollHeader();
        setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 553421671, -553421615, System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
        setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 644962865, -644962859, System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
        int i10 = f55255b + 81;
        f55254a = i10 % 128;
        int i11 = i10 % 2;
        for (getBeepOnFailure getbeeponfailure : setrotationx.setOnDragListener()) {
            int i12 = f55254a;
            int i13 = i12 & 75;
            int i14 = -(-((i12 ^ 75) | i13));
            int i15 = (i13 & i14) + (i14 | i13);
            f55255b = i15 % 128;
            int i16 = i15 % 2;
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
            if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                int i17 = f55254a;
                int i18 = (((i17 ^ 81) | (i17 & 81)) << 1) - (((~i17) & 81) | (i17 & (-82)));
                f55255b = i18 % 128;
                int i19 = i18 % 2;
                setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
                int i20 = f55254a;
                int i21 = i20 & 77;
                int i22 = (i20 ^ 77) | i21;
                int i23 = (i21 & i22) + (i22 | i21);
                f55255b = i23 % 128;
                int i24 = i23 % 2;
            }
            int i25 = f55254a;
            int i26 = ((i25 ^ 64) + ((i25 & 64) << 1)) - 1;
            f55255b = i26 % 128;
            int i27 = i26 % 2;
        }
        byte[] bArr = (byte[]) setOverscrollHeader.setX(new Object[]{setoverscrollheader}, -158300171, 158300171, System.identityHashCode(setoverscrollheader));
        int i28 = f55254a;
        int i29 = i28 & 37;
        int i30 = i29 + ((i28 ^ 37) | i29);
        f55255b = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 38 / 0;
        }
        return bArr;
    }

    public static setCompoundDrawableTintBlendMode b(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        df dfVar = (df) objArr[2];
        byte[] bArr2 = (byte[]) objArr[3];
        int i10 = f55254a + 77;
        f55255b = i10 % 128;
        if (i10 % 2 == 0) {
            int length = bArr.length;
            int length2 = ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar))).length;
            throw null;
        }
        if (bArr.length != ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar))).length) {
            int i11 = f55255b;
            int i12 = ((i11 | 113) << 1) - (i11 ^ 113);
            f55254a = i12 % 128;
            int i13 = i12 % 2;
            return null;
        }
        dr drVar = new dr((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2055662065, 2055662076, System.identityHashCode(dfVar))}, -1375611456, 1375611456, (int) System.currentTimeMillis()));
        if (((Byte) dr.setX(new Object[]{drVar}, 562516893, -562516887, System.identityHashCode(drVar))).byteValue() != -68) {
            int i14 = f55255b;
            int i15 = ((i14 ^ 111) | (i14 & 111)) << 1;
            int i16 = -(((~i14) & 111) | (i14 & (-112)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            int i18 = i17 % 128;
            f55254a = i18;
            if (i17 % 2 != 0) {
                throw null;
            }
            int i19 = i18 & 75;
            int i20 = -(-((i18 ^ 75) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f55255b = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (((Byte) dr.setX(new Object[]{drVar}, -1465781391, 1465781396, System.identityHashCode(drVar))).byteValue() != 106) {
            int i23 = f55255b + 1;
            int i24 = i23 % 128;
            f55254a = i24;
            if (i23 % 2 != 0) {
                int i25 = 75 / 0;
            }
            int i26 = (i24 ^ 125) + ((i24 & 125) << 1);
            f55255b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 23 / 0;
            }
            return null;
        }
        if (((Byte) dr.setX(new Object[]{drVar}, 640139105, -640139096, System.identityHashCode(drVar))).byteValue() != 5) {
            int i28 = f55254a;
            int i29 = (i28 ^ 47) + ((i28 & 47) << 1);
            int i30 = i29 % 128;
            f55255b = i30;
            int i31 = i29 % 2;
            int i32 = (i30 & 87) + (i30 | 87);
            f55254a = i32 % 128;
            int i33 = i32 % 2;
            return null;
        }
        dp.Companion companion = dp.INSTANCE;
        if (!((Boolean) dp.Companion.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar}, 1936783142, -1936783140, System.identityHashCode(drVar))}, 544999026, -544999026, (int) System.currentTimeMillis())).booleanValue()) {
            int i34 = f55254a;
            int i35 = i34 & 19;
            int i36 = (((i34 | 19) & (~i35)) - (~(i35 << 1))) - 1;
            f55255b = i36 % 128;
            if (i36 % 2 != 0) {
                return null;
            }
            throw null;
        }
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode((byte[]) dr.setX(new Object[]{drVar}, 1936783142, -1936783140, System.identityHashCode(drVar)));
        setAnimation setanimation = setAnimation.INSTANCE;
        if (((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade)))[0] != ((Byte) dp.setY(new Object[]{setcompounddrawabletintblendmode}, -2037836328, 2037836331, System.identityHashCode(setcompounddrawabletintblendmode))).byteValue()) {
            int i37 = f55254a;
            int i38 = i37 ^ 49;
            int i39 = ((i37 & 49) | i38) << 1;
            int i40 = -i38;
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            f55255b = i41 % 128;
            int i42 = i41 % 2;
            int i43 = i37 & 1;
            int i44 = (i43 - (~((i37 ^ 1) | i43))) - 1;
            f55255b = i44 % 128;
            int i45 = i44 % 2;
            return null;
        }
        byte[] bArr3 = (byte[]) dr.setX(new Object[]{drVar, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade))}, -1014006140, 1014006148, System.identityHashCode(drVar));
        if (((Byte) dr.setX(new Object[]{drVar}, -477940013, 477940014, System.identityHashCode(drVar))).byteValue() != 1) {
            int i46 = f55254a;
            int i47 = i46 & 23;
            int i48 = ((((i46 ^ 23) | i47) << 1) - (~(-((i46 | 23) & (~i47))))) - 1;
            f55255b = i48 % 128;
            if (i48 % 2 != 0) {
                return null;
            }
            int i49 = 75 / 0;
            return null;
        }
        if (!Arrays.equals((byte[]) dr.setX(new Object[]{drVar}, -845228896, 845228903, System.identityHashCode(drVar)), (byte[]) dy.setDividerPadding(new Object[]{bArr3}, 504323118, -504323118, (int) System.currentTimeMillis()))) {
            int i50 = f55255b;
            int i51 = i50 & 117;
            int i52 = ((~i51) & (i50 | 117)) + (i51 << 1);
            f55254a = i52 % 128;
            int i53 = i52 % 2;
            int i54 = i50 + 37;
            f55254a = i54 % 128;
            int i55 = i54 % 2;
            return null;
        }
        if (Arrays.equals((byte[]) dp.setY(new Object[]{setcompounddrawabletintblendmode}, 1264143770, -1264143769, System.identityHashCode(setcompounddrawabletintblendmode)), (byte[]) dy.setDividerPadding(new Object[]{bArr2}, 504323118, -504323118, (int) System.currentTimeMillis()))) {
            int i56 = f55255b + 99;
            f55254a = i56 % 128;
            if (i56 % 2 != 0) {
                int i57 = 3 / 0;
            }
            return setcompounddrawabletintblendmode;
        }
        int i58 = f55255b;
        int i59 = i58 & 43;
        int i60 = i59 + ((i58 ^ 43) | i59);
        f55254a = i60 % 128;
        if (i60 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f55254a + 103;
        f55255b = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1877415399, -1877415355, (int) System.currentTimeMillis());
            ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        setAnimation setanimation2 = setAnimation.INSTANCE;
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1877415399, -1877415355, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, 2064855914, -2064855856, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
            int i11 = f55255b + 107;
            f55254a = i11 % 128;
            int i12 = i11 % 2;
            String str = (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 1877415399, -1877415355, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
            if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                int i13 = f55254a;
                int i14 = (i13 & (-82)) | ((~i13) & 81);
                int i15 = (i13 & 81) << 1;
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                f55255b = i16 % 128;
                int i17 = i16 % 2;
                int i18 = (i13 & 39) + (i13 | 39);
                f55255b = i18 % 128;
                if (i18 % 2 != 0) {
                    return Boolean.FALSE;
                }
                int i19 = 94 / 0;
                return Boolean.FALSE;
            }
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -854811249, 854811301, System.identityHashCode(setscrollbardefaultdelaybeforefade)), (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade)))}, 1069122946, -1069122918, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i20 = f55255b;
            int i21 = (i20 & (-68)) | ((~i20) & 67);
            int i22 = -(-((i20 & 67) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f55254a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = f55254a;
        int i26 = (i25 & 85) + (i25 | 85);
        f55255b = i26 % 128;
        if (i26 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b3, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b7, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.setAnimation.INSTANCE;
        r5 = (byte[]) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -1554496015, 1554496070, (int) java.lang.System.currentTimeMillis())}, -1344789201, 1344789222, java.lang.System.identityHashCode(r1));
        r9 = (com.mypinpad.tsdk.isolation.df) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r1}, -566041279, 566041293, java.lang.System.identityHashCode(r1));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
        r3 = (com.mypinpad.tsdk.isolation.dp) setOnFocusChangeListener(new java.lang.Object[]{r1, r5, r9, r3}, -628921813, 628921817, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0111, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.du.f55255b;
        r5 = ((r3 & 6) + (r3 | 6)) - 1;
        com.mypinpad.tsdk.isolation.du.f55254a = r5 % 128;
        r5 = r5 % 2;
        setOnFocusChangeListener(new java.lang.Object[]{r1}, 859455416, -859455408, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.du.f55254a;
        r1 = (r0 & (-24)) | ((~r0) & 23);
        r0 = (r0 & 23) << 1;
        r2 = (r1 & r0) + (r0 | r1);
        com.mypinpad.tsdk.isolation.du.f55255b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0141, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0142, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.dv.INSTANCE;
        com.mypinpad.tsdk.isolation.dv.setOnFocusChangeListener(new java.lang.Object[]{r1, r3}, -2054554965, 2054554965, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.du.f55254a;
        r1 = ((r0 ^ 113) | (r0 & 113)) << 1;
        r0 = -(((~r0) & 113) | (r0 & (-114)));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.du.f55255b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0174, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        if (((com.mypinpad.tsdk.isolation.df) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r1}, -566041279, 566041293, java.lang.System.identityHashCode(r1))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0090, code lost:
    
        if (((com.mypinpad.tsdk.isolation.df) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r1}, -566041279, 566041293, java.lang.System.identityHashCode(r1))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0092, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.du.f55254a + 125;
        com.mypinpad.tsdk.isolation.du.f55255b = r3 % 128;
        r3 = r3 % 2;
        setOnFocusChangeListener(new java.lang.Object[]{r1}, 859455416, -859455408, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.du.f55255b;
        r1 = (r0 & 27) + (r0 | 27);
        com.mypinpad.tsdk.isolation.du.f55254a = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean d(java.lang.Object[] r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.du.d(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ fk e(Object[] objArr) throws Exception {
        setMaxWidth setmaxwidth;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        getValue getvalue = (getValue) objArr[2];
        int i10 = f55254a;
        int i11 = i10 & 85;
        int i12 = -(-((i10 ^ 85) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55255b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{20025, null, 6}, 1336485880, -1336485874, 20025);
        if (((df) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -566041279, 566041293, System.identityHashCode(setscrollbardefaultdelaybeforefade))) == null) {
            int i15 = f55254a;
            int i16 = i15 & 3;
            int i17 = i15 | 3;
            int i18 = (i16 & i17) + (i17 | i16);
            f55255b = i18 % 128;
            int i19 = i18 % 2;
            setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 1409702984, -1409702975, (int) System.currentTimeMillis());
            int i20 = f55255b + 83;
            f55254a = i20 % 128;
            if (i20 % 2 == 0) {
                return null;
            }
            throw null;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], -328193798, 328193974, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure == null) {
            int i21 = f55255b;
            int i22 = i21 + 19;
            f55254a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i21 & 117;
            int i25 = (i21 ^ 117) | i24;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f55254a = i26 % 128;
            int i27 = i26 % 2;
            setmaxwidth = null;
        } else {
            bg bgVar = new bg(getbeeponfailure);
            bk bkVar = (bk) ((setImageTintList) w.setX(new Object[]{bgVar}, 1693919772, -1693919769, System.identityHashCode(bgVar)));
            setmaxwidth = (setMaxWidth) ((List) bk.setDividerPadding(new Object[]{bkVar}, -948914151, 948914151, System.identityHashCode(bkVar)));
            int i28 = f55254a;
            int i29 = i28 & 25;
            int i30 = (((i28 | 25) & (~i29)) - (~(i29 << 1))) - 1;
            f55255b = i30 % 128;
            int i31 = i30 % 2;
        }
        if (setmaxwidth == null) {
            int i32 = f55255b;
            int i33 = i32 & 91;
            int i34 = (i33 - (~(-(-((i32 ^ 91) | i33))))) - 1;
            f55254a = i34 % 128;
            if (i34 % 2 != 0) {
                setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 1409702984, -1409702975, (int) System.currentTimeMillis());
                throw null;
            }
            setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 1409702984, -1409702975, (int) System.currentTimeMillis());
            int i35 = f55254a;
            int i36 = (i35 ^ 51) + ((i35 & 51) << 1);
            f55255b = i36 % 128;
            int i37 = i36 % 2;
            return null;
        }
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
        if (((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1248486622, -1248486599, System.identityHashCode(setmaxwidth))).booleanValue()) {
            int i38 = f55254a;
            int i39 = ((i38 | 63) << 1) - (i38 ^ 63);
            f55255b = i39 % 128;
            if (i39 % 2 == 0) {
                setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 1409702984, -1409702975, (int) System.currentTimeMillis());
                int i40 = 63 / 0;
            } else {
                setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 1409702984, -1409702975, (int) System.currentTimeMillis());
            }
            return null;
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setmaxwidth}, 1048306138, -1048306100, (int) System.currentTimeMillis());
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (byte[]) ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).clone()}, 55385802, -55385749, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        getvalue.setOnFocusChangeListener(new getACTIVATION_ALREADY_STARTEDannotations(getbeeponfailure2));
        fk fkVar = fk.getAmountFieldTextColor;
        int i41 = f55254a;
        int i42 = i41 & 73;
        int i43 = ((i41 ^ 73) | i42) << 1;
        int i44 = -((i41 | 73) & (~i42));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        f55255b = i45 % 128;
        int i46 = i45 % 2;
        return fkVar;
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55254a;
        int i11 = (((i10 | 35) << 1) - (~(-(((~i10) & 35) | (i10 & (-36)))))) - 1;
        f55255b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        dj djVar = (dj) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 1462944051, -1462944002, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (djVar == null) {
            int i13 = f55254a;
            int i14 = (i13 ^ 85) + ((i13 & 85) << 1);
            f55255b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 76 / 0;
            }
            int i16 = i13 + 91;
            f55255b = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        if (bArr.length != ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar))).length) {
            int i18 = f55255b;
            int i19 = i18 & 19;
            int i20 = ((i18 ^ 19) | i19) << 1;
            int i21 = -((i18 | 19) & (~i19));
            int i22 = (i20 & i21) + (i21 | i20);
            int i23 = i22 % 128;
            f55254a = i23;
            int i24 = i22 % 2;
            int i25 = i23 ^ 75;
            int i26 = (i23 & 75) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f55255b = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        dw dwVar = new dw((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2055662065, 2055662076, System.identityHashCode(djVar))}, -1375611456, 1375611456, (int) System.currentTimeMillis()));
        if (((Byte) dw.setX(new Object[]{dwVar}, -1659590139, 1659590146, System.identityHashCode(dwVar))).byteValue() != -68) {
            int i29 = f55254a + 109;
            int i30 = i29 % 128;
            f55255b = i30;
            if (i29 % 2 == 0) {
                throw null;
            }
            int i31 = (((i30 | 78) << 1) - (i30 ^ 78)) - 1;
            f55254a = i31 % 128;
            int i32 = i31 % 2;
            return null;
        }
        if (((Byte) dw.setX(new Object[]{dwVar}, 1856901440, -1856901438, System.identityHashCode(dwVar))).byteValue() != 106) {
            int i33 = f55255b;
            int i34 = (((i33 | 15) << 1) - (~(-(((~i33) & 15) | (i33 & (-16)))))) - 1;
            int i35 = i34 % 128;
            f55254a = i35;
            int i36 = i34 % 2;
            int i37 = i35 & 41;
            int i38 = (i35 | 41) & (~i37);
            int i39 = -(-(i37 << 1));
            int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
            f55255b = i40 % 128;
            int i41 = i40 % 2;
            return null;
        }
        if (((Byte) dw.setX(new Object[]{dwVar}, 1316271760, -1316271760, System.identityHashCode(dwVar))).byteValue() != 3) {
            int i42 = f55254a;
            int i43 = i42 + 11;
            f55255b = i43 % 128;
            int i44 = i43 % 2;
            int i45 = i42 + 51;
            f55255b = i45 % 128;
            if (i45 % 2 == 0) {
                int i46 = 63 / 0;
            }
            return null;
        }
        byte[] bArr2 = (byte[]) dw.setX(new Object[]{dwVar, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -854811249, 854811301, System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 556876150, -556876142, System.identityHashCode(dwVar));
        if (((Byte) dw.setX(new Object[]{dwVar}, 520091065, -520091064, System.identityHashCode(dwVar))).byteValue() != 1) {
            int i47 = f55255b + 113;
            f55254a = i47 % 128;
            if (i47 % 2 != 0) {
                int i48 = 28 / 0;
            }
            return null;
        }
        if (!Arrays.equals((byte[]) dy.setDividerPadding(new Object[]{bArr2}, 504323118, -504323118, (int) System.currentTimeMillis()), (byte[]) dw.setX(new Object[]{dwVar}, 184917073, -184917067, System.identityHashCode(dwVar)))) {
            int i49 = f55255b;
            int i50 = (i49 & 1) + (i49 | 1);
            f55254a = i50 % 128;
            if (i50 % 2 != 0) {
                int i51 = 48 / 0;
            }
            int i52 = i49 + 83;
            f55254a = i52 % 128;
            int i53 = i52 % 2;
            return null;
        }
        byte[] bArr3 = (byte[]) dw.setX(new Object[]{dwVar}, 1681307825, -1681307822, System.identityHashCode(dwVar));
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i54 = (-5260) & iCurrentTimeMillis;
        int i55 = ((-5260) | iCurrentTimeMillis) & (~i54);
        int i56 = (~((i55 & i54) | (i55 ^ i54))) * 623;
        int i57 = (-837802866) & i56;
        int i58 = (i57 - (~(-(-((i56 ^ (-837802866)) | i57))))) - 1;
        int i59 = ~iCurrentTimeMillis;
        int i60 = (2009562559 & i59) | ((~i59) & (-2009562560));
        int i61 = i59 & (-2009562560);
        int i62 = ((i60 & i61) | (i60 ^ i61)) * (-623);
        int i63 = i58 & i62;
        int i64 = -(-((i62 ^ i58) | i63));
        int i65 = (i63 & i64) + (i64 | i63);
        int i66 = ~(((-1648516528) & iCurrentTimeMillis) | ((-1648516528) ^ iCurrentTimeMillis));
        int i67 = 5259 & i66;
        int i68 = (i66 | 5259) & (~i67);
        int i69 = (i68 & i67) | (i68 ^ i67);
        int i70 = (i59 & (-361051292)) | (361051291 & iCurrentTimeMillis);
        int i71 = iCurrentTimeMillis & (-361051292);
        int i72 = ~((i71 & i70) | (i70 ^ i71));
        int i73 = ((~i72) & i69) | ((~i69) & i72);
        int i74 = i72 & i69;
        int i75 = ((i74 & i73) | (i73 ^ i74)) * 623;
        int i76 = i65 ^ i75;
        int i77 = ((i75 & i65) | i76) << 1;
        int i78 = -i76;
        int i79 = (i77 & i78) + (i77 | i78);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i80 = ~iCurrentTimeMillis2;
        int i81 = (-1686323804) ^ i80;
        int i82 = (-1686323804) & i80;
        int i83 = ~((i82 & i81) | (i81 ^ i82));
        int i84 = ((~i83) & 545456731) | ((-545456732) & i83);
        int i85 = i83 & 545456731;
        int i86 = (i85 & i84) | (i84 ^ i85);
        int i87 = ~iCurrentTimeMillis2;
        int i88 = 1315495328 & i87;
        int i89 = (i87 | 1315495328) & (~i88);
        int i90 = ~((i89 & i88) | (i89 ^ i88));
        int i91 = i86 ^ i90;
        int i92 = i86 & i90;
        int i93 = (i92 & i91) | (i91 ^ i92);
        int i94 = (-174628257) & iCurrentTimeMillis2;
        int i95 = i94 | ((~i94) & ((-174628257) | iCurrentTimeMillis2));
        int i96 = (i95 | (~i95)) & (~i95);
        int i97 = ((~i96) & i93) | ((~i93) & i96);
        int i98 = i93 & i96;
        int i99 = 1455649217 - (~(-(-(((i98 & i97) | (i97 ^ i98)) * (-84)))));
        int i100 = (1315495328 & i80) | (iCurrentTimeMillis2 & (-1315495329));
        int i101 = 1315495328 & iCurrentTimeMillis2;
        int i102 = ~((i100 & i101) | (i100 ^ i101));
        int i103 = 1686323803 & i102;
        int i104 = (i102 | 1686323803) & (~i103);
        int i105 = (i104 & i103) | (i104 ^ i103);
        int i106 = ~((i80 ^ (-1315495329)) | (i80 & (-1315495329)));
        int i107 = (((i105 & i106) | (i105 ^ i106)) * (-84)) + i99;
        int i108 = (iCurrentTimeMillis2 | i80) & (~iCurrentTimeMillis2);
        int i109 = i108 & (-1315495329);
        int i110 = (i108 | (-1315495329)) & (~i109);
        int i111 = ~((i110 & i109) | (i110 ^ i109));
        int i112 = (i111 & (-174628257)) | ((~i111) & 174628256);
        int i113 = i111 & 174628256;
        int i114 = -(-(((i113 & i112) | (i112 ^ i113)) * 84));
        int i115 = i107 & i114;
        int i116 = -(-(i114 | i107));
        if (i79 > (i115 ^ i116) + ((i116 & i115) << 1)) {
            return bArr3;
        }
        throw null;
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull byte[] p10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4, p10}, -597819605, 597819611, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0883  */
    /* JADX WARN: Code duplicated, block: B:101:0x0894 A[PHI: r1
      0x0894: PHI (r1v38 com.mypinpad.tsdk.i.getBeepOnFailure) = (r1v10 com.mypinpad.tsdk.i.getBeepOnFailure), (r1v50 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:99:0x0881, B:96:0x0848] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0a13  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x013f, code lost:
    
        if (r4 != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x018f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r4}, 1914607362, -1914607356, java.lang.System.identityHashCode(r4))) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b7, code lost:
    
        if (((java.lang.Byte) com.mypinpad.tsdk.isolation.av.setY(new java.lang.Object[]{r3}, -888174800, 888174800, java.lang.System.identityHashCode(r3))).byteValue() >= 11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b9, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.du.f55255b;
        r8 = r3 & 91;
        r3 = -(-((r3 ^ 91) | r8));
        r10 = (r8 & r3) + (r3 | r8);
        com.mypinpad.tsdk.isolation.du.f55254a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01cc, code lost:
    
        if ((r10 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ce, code lost:
    
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, kotlin.collections.ArraysKt___ArraysJvmKt.plus((byte[]) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0}, -854811249, 854811301, java.lang.System.identityHashCode(r0)), (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 252497730, -252497710, java.lang.System.identityHashCode(r1)))}, 1069122946, -1069122918, java.lang.System.identityHashCode(r0));
        r0 = 70 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0206, code lost:
    
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, kotlin.collections.ArraysKt___ArraysJvmKt.plus((byte[]) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0}, -854811249, 854811301, java.lang.System.identityHashCode(r0)), (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 252497730, -252497710, java.lang.System.identityHashCode(r1)))}, 1069122946, -1069122918, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x023a, code lost:
    
        r0 = (-2) - ((com.mypinpad.tsdk.isolation.du.f55254a + 50) ^ (-1));
        com.mypinpad.tsdk.isolation.du.f55255b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0248, code lost:
    
        if ((r0 % 2) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x024a, code lost:
    
        r0 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x024f, code lost:
    
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, kotlin.collections.ArraysKt___ArraysJvmKt.plus((byte[]) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0}, -854811249, 854811301, java.lang.System.identityHashCode(r0)), (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 243863605, -243863605, java.lang.System.identityHashCode(r1)))}, 1069122946, -1069122918, java.lang.System.identityHashCode(r0));
        r0 = com.mypinpad.tsdk.isolation.du.f55255b;
        r1 = ((r0 ^ 17) - (~((r0 & 17) << 1))) - 1;
        com.mypinpad.tsdk.isolation.du.f55254a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0295, code lost:
    
        r1 = new com.mypinpad.tsdk.isolation.cy(r0);
        r1 = (com.mypinpad.tsdk.isolation.w) com.mypinpad.tsdk.isolation.w.setX(new java.lang.Object[]{r1, com.mypinpad.tsdk.i.du.b.f55259p0}, -1790938757, 1790938757, java.lang.System.identityHashCode(r1));
        r1 = new com.mypinpad.tsdk.isolation.aq(r0);
        r1 = (com.mypinpad.tsdk.isolation.am) ((com.mypinpad.tsdk.isolation.setImageTintList) com.mypinpad.tsdk.isolation.w.setX(new java.lang.Object[]{r1}, 1693919772, -1693919769, java.lang.System.identityHashCode(r1)));
        r3 = new com.mypinpad.tsdk.isolation.cz(r0);
        r0 = (com.mypinpad.tsdk.isolation.w) com.mypinpad.tsdk.isolation.w.setX(new java.lang.Object[]{r3, new com.mypinpad.tsdk.i.du.a(r1)}, -1790938757, 1790938757, java.lang.System.identityHashCode(r3));
        r0 = com.mypinpad.tsdk.isolation.du.f55255b;
        r1 = (r0 & 87) + (r0 | 87);
        com.mypinpad.tsdk.isolation.du.f55254a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setOnFocusChangeListener(java.lang.Object[] r18, int r19, int r20, int r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.du.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static boolean setX(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, 1016771223, -1016771218, (int) System.currentTimeMillis())).booleanValue();
    }

    public static void setY(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setRotationX p10, @NotNull av p11) throws Exception {
        setOnFocusChangeListener(new Object[]{p4, p10, p11}, 1164874386, -1164874374, (int) System.currentTimeMillis());
    }

    @NotNull
    public static byte[] setX(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setRotationX p10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{p4, p10}, 895823171, -895823170, (int) System.currentTimeMillis());
    }

    @Nullable
    public final fk setY(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull getValue p10) {
        return (fk) setOnFocusChangeListener(new Object[]{this, p4, p10}, 1872420095, -1872420092, System.identityHashCode(this));
    }

    public static void setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade p4) throws Exception {
        setOnFocusChangeListener(new Object[]{p4}, 397100190, -397100183, (int) System.currentTimeMillis());
    }

    @Nullable
    public static byte[] setOnFocusChangeListener(@NotNull byte[] p4, @NotNull df p10, @NotNull byte[] p11) {
        return (byte[]) setOnFocusChangeListener(new Object[]{p4, p10, p11}, -723868142, 723868153, (int) System.currentTimeMillis());
    }

    @Nullable
    public static <T extends setScrollBarDefaultDelayBeforeFade> fk setOnFocusChangeListener(@NotNull T p4, @NotNull setTextKeepState p10, @NotNull ew<T> p11, @NotNull setRotationX p12) {
        return (fk) setOnFocusChangeListener(new Object[]{p4, p10, p11, p12}, -307728844, 307728854, (int) System.currentTimeMillis());
    }
}
