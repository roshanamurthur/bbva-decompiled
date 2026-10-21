package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setInputExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59912a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59913b = 1;

    public static final class setDividerPadding implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f59918a;

        public setDividerPadding(byte[] bArr) {
            this.f59918a = bArr;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return (String) setInputExtras.setDividerPadding(new Object[]{((setDividerPadding) objArr[0]).f59918a}, 1609250238, -1609250236, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setX(new Object[]{this}, 624912182, -624912182, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ Long a(Object[] objArr) {
        int i10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i11 = f59912a;
        int i12 = ((i11 & 80) + (i11 | 80)) - 1;
        f59913b = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            int length = bArr.length;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 0) {
            int i13 = f59913b;
            int i14 = i13 | 103;
            int i15 = i14 << 1;
            int i16 = -(i14 & (~(i13 & 103)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f59912a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i13 + 114;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f59912a = i20 % 128;
            int i21 = i20 % 2;
            if (bArr.length <= 6) {
                int length2 = bArr.length;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i22 = -(~(-(-(length2 * (-55)))));
                int i23 = ((55 ^ i22) + ((i22 & 55) << 1)) - 1;
                int i24 = iCurrentTimeMillis | (iCurrentTimeMillis ^ (-1));
                int i25 = ~i24;
                int i26 = (i24 | i25) & i25;
                int i27 = (~i26) & length2;
                int i28 = ~length2;
                int i29 = ((i26 & length2) | i27 | (i26 & i28)) * 56;
                int i30 = i23 & i29;
                int i31 = (i29 | i23) & (~i30);
                int i32 = i30 << 1;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                int i34 = length2 | i28;
                int i35 = ~i34;
                int i36 = ((i34 | i35) & i35) * (-56);
                int i37 = i33 & i36;
                int i38 = (i37 - (~(-(-((i36 ^ i33) | i37))))) - 1;
                int i39 = (((i38 | (-55)) << 1) - (i38 ^ (-55))) - 1;
                long j10 = 0;
                if (i39 >= 0) {
                    while (true) {
                        int i40 = (-2) - ((((i10 | 2) << 1) - (i10 ^ 2)) ^ (-1));
                        long j11 = ((long) bArr[i10]) & 255;
                        int length3 = bArr.length;
                        int i41 = -i10;
                        int i42 = ((length3 | i41) << 1) - (i41 ^ length3);
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i43 = -(-(i42 * (-219)));
                        int i44 = (-221) & i43;
                        int i45 = (((-221) ^ i43) | i44) << 1;
                        int i46 = -((i43 | (-221)) & (~i44));
                        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                        int i48 = ~i42;
                        int i49 = ~((i48 | i42) & i48);
                        int i50 = ~iCurrentTimeMillis2;
                        int i51 = ~i50;
                        int i52 = (i51 & i50) | (i51 ^ i50);
                        int i53 = i52 ^ i42;
                        int i54 = i52 & i42;
                        int i55 = ~((i53 ^ i54) | (i54 & i53));
                        int i56 = (((i49 & i55) | (i49 ^ i55)) * 220) + i47;
                        int i57 = i50 ^ i42;
                        int i58 = i50 & i42;
                        int i59 = ~((i57 & i58) | (i57 ^ i58));
                        int i60 = (i59 | (~i59)) * (-440);
                        int i61 = ((~i60) & i56) | ((~i56) & i60);
                        int i62 = (i60 & i56) << 1;
                        int i63 = (i61 & i62) + (i62 | i61);
                        int i64 = (i48 & i42) | (i48 ^ i42);
                        int i65 = i64 & iCurrentTimeMillis2;
                        int i66 = (iCurrentTimeMillis2 | i64) & (~i65);
                        int i67 = -(-(((i66 & i65) | (i66 ^ i65)) * 220));
                        int i68 = ((i63 ^ i67) | (i63 & i67)) << 1;
                        int i69 = -((i67 & (~i63)) | ((~i67) & i63));
                        j10 += j11 << ((((i68 | i69) << 1) - (i69 ^ i68)) * 8);
                        if (i40 > i39) {
                            break;
                        }
                        i10 = i40;
                    }
                }
                int i70 = f59913b;
                int i71 = ((i70 ^ 99) - (~(-(-((i70 & 99) << 1))))) - 1;
                f59912a = i71 % 128;
                if (i71 % 2 == 0) {
                    return Long.valueOf(j10);
                }
                throw null;
            }
        } else {
            int i72 = f59912a;
            int i73 = i72 + 43;
            f59913b = i73 % 128;
            int i74 = i73 % 2;
            int i75 = i72 ^ 87;
            int i76 = ((i72 & 87) | i75) << 1;
            int i77 = -i75;
            int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
            f59913b = i78 % 128;
            int i79 = i78 % 2;
        }
        throw new setIndeterminateDrawable(1004, String.valueOf(bArr.length), null, 4, null);
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f59912a;
        int i11 = (i10 & (-8)) | ((~i10) & 7);
        int i12 = (i10 & 7) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f59913b = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr[iIntValue]), Integer.valueOf(iIntValue2)}, 1812344530, -1812344522, iIntValue2)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        boolean zBooleanValue = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr[iIntValue]), Integer.valueOf(iIntValue2)}, 1812344530, -1812344522, iIntValue2)).booleanValue();
        int i14 = f59912a + 101;
        f59913b = i14 % 128;
        if (i14 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i15 = 85 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        List list = (List) objArr[0];
        Intrinsics.checkNotNullParameter(list, "");
        setOverscrollHeader setoverscrollheader = new setOverscrollHeader();
        setoverscrollheader.addAll(CollectionsKt___CollectionsKt.filterNotNull(list));
        byte[] bArr = (byte[]) setOverscrollHeader.setX(new Object[]{setoverscrollheader}, -158300171, 158300171, System.identityHashCode(setoverscrollheader));
        int i10 = f59912a;
        int i11 = ((i10 & (-44)) | ((~i10) & 43)) + ((i10 & 43) << 1);
        f59913b = i11 % 128;
        if (i11 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i10 = f59912a;
        int i11 = i10 & 51;
        int i12 = -(-(i10 | 51));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f59913b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        bArr[iIntValue] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(bArr[iIntValue]), Integer.valueOf(iIntValue2), Boolean.valueOf(zBooleanValue)}, -1488015476, 1488015481, iIntValue2)).byteValue();
        int i15 = f59912a;
        int i16 = i15 & 3;
        int i17 = (i15 | 3) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        f59913b = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f59912a;
        int i11 = ((i10 ^ 45) | (i10 & 45)) << 1;
        int i12 = -(((~i10) & 45) | (i10 & (-46)));
        int i13 = (i11 & i12) + (i12 | i11);
        f59913b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i15 = -(-(length * (-489)));
        int i16 = ((((-491) ^ i15) | ((-491) & i15)) << 1) - ((i15 & 490) | ((-491) & (~i15)));
        int i17 = ~length;
        int i18 = (~iCurrentTimeMillis) & ((~iCurrentTimeMillis) | iCurrentTimeMillis);
        int i19 = -(-(((i18 & i17) | (i17 ^ i18)) * (-490)));
        int i20 = (i16 ^ i19) + ((i19 & i16) << 1);
        int i21 = ~length;
        int i22 = i21 ^ (-1);
        int i23 = ~((i21 & i22) | (i22 ^ i21));
        int i24 = (length | i17) & (~length);
        int i25 = i24 & iCurrentTimeMillis;
        int i26 = (i24 | iCurrentTimeMillis) & (~i25);
        int i27 = ~((i26 & i25) | (i26 ^ i25));
        int i28 = i23 & i27;
        int i29 = (i27 | i23) & (~i28);
        int i30 = ((i29 & i28) | (i29 ^ i28)) * 490;
        int i31 = (((i20 ^ i30) | (i20 & i30)) << 1) - ((i30 & (~i20)) | ((~i30) & i20));
        int i32 = f59912a;
        int i33 = (i32 & 115) + (i32 | 115);
        f59913b = i33 % 128;
        while (true) {
            int i34 = i33 % 2;
            if (i31 <= 0) {
                break;
            }
            int i35 = f59912a;
            int i36 = (i35 & 41) + (i35 | 41);
            f59913b = i36 % 128;
            int i37 = i36 % 2;
            if (bArr[i31] != -1) {
                break;
            }
            int i38 = (i35 ^ 119) + ((i35 & 119) << 1);
            int i39 = i38 % 128;
            f59913b = i39;
            if (i38 % 2 == 0) {
                i31 /= -1;
            } else {
                int i40 = ~i31;
                int i41 = -(-(i31 << 1));
                i31 = (i40 & i41) + (i41 | i40);
            }
            int i42 = i39 & 111;
            i33 = (i42 - (~((i39 ^ 111) | i42))) - 1;
            f59912a = i33 % 128;
        }
        if (i31 >= 0) {
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, i31));
            int i43 = f59912a;
            int i44 = (((i43 | 64) << 1) - (i43 ^ 64)) - 1;
            f59913b = i44 % 128;
            if (i44 % 2 != 0) {
                return bArrSliceArray;
            }
            throw null;
        }
        int i45 = f59912a;
        int i46 = (i45 & 42) + (i45 | 42);
        int i47 = (i46 ^ (-1)) + (i46 << 1);
        int i48 = i47 % 128;
        f59913b = i48;
        int i49 = i47 % 2;
        byte[] bArr2 = new byte[0];
        int i50 = i48 + 17;
        f59912a = i50 % 128;
        if (i50 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        byte[] bArr;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f59913b;
        int i11 = i10 & 61;
        int i12 = i11 + ((i10 ^ 61) | i11);
        int i13 = i12 % 128;
        f59912a = i13;
        if (i12 % 2 != 0) {
            int i14 = iIntValue & 119;
            int i15 = -(-((iIntValue ^ 119) | i14));
            bArr = new byte[]{(byte) (iIntValue * 98), (byte) ((i14 & i15) + (i14 | i15)), 0, (byte) iIntValue, (byte) (iIntValue * 38)};
        } else {
            bArr = new byte[]{(byte) (iIntValue >> 24), (byte) (iIntValue >> 16), (byte) (iIntValue >> 8), (byte) iIntValue};
        }
        int i16 = i13 + 85;
        f59913b = i16 % 128;
        if (i16 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        int i10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i11 = f59912a;
        int i12 = i11 & 9;
        int i13 = ((((i11 ^ 9) | i12) << 1) - (~(-((i11 | 9) & (~i12))))) - 1;
        f59913b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        int i15 = f59913b;
        int i16 = (i15 & 77) + (i15 | 77);
        f59912a = i16 % 128;
        int i17 = i16 % 2;
        while (i10 < length) {
            int i18 = f59912a + 3;
            int i19 = i18 % 128;
            f59913b = i19;
            if (i18 % 2 == 0) {
                byte b10 = bArr[i10];
                throw null;
            }
            if (bArr[i10] != 0) {
                int i20 = i19 + 3;
                int i21 = i20 % 128;
                f59912a = i21;
                int i22 = i20 % 2;
                int i23 = ((i21 | 1) << 1) - (i21 ^ 1);
                f59913b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = (i21 & 45) + (i21 | 45);
                f59913b = i25 % 128;
                int i26 = i25 % 2;
                byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i10, bArr.length));
                int i27 = f59913b;
                int i28 = i27 ^ 89;
                int i29 = ((i27 & 89) | i28) << 1;
                int i30 = -i28;
                int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                f59912a = i31 % 128;
                int i32 = i31 % 2;
                return bArrSliceArray;
            }
            int i33 = i19 & 119;
            int i34 = (i33 - (~(-(-((i19 ^ 119) | i33))))) - 1;
            int i35 = i34 % 128;
            f59912a = i35;
            int i36 = i34 % 2;
            int i37 = (i10 & 125) + (i10 | 125);
            i10 = ((i37 | (-124)) << 1) - (i37 ^ (-124));
            int i38 = ((i35 ^ 94) + ((i35 & 94) << 1)) - 1;
            f59913b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = f59912a;
        int i41 = ((-1) << 1) - (((i40 & 12) + (i40 | 12)) ^ (-1));
        f59913b = i41 % 128;
        int i42 = i41 % 2;
        i10 = -1;
        byte[] bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i10, bArr.length));
        int i210 = f59913b;
        int i211 = i210 ^ 89;
        int i212 = ((i210 & 89) | i211) << 1;
        int i310 = -i211;
        int i311 = ((i212 | i310) << 1) - (i212 ^ i310);
        f59912a = i311 % 128;
        int i312 = i311 % 2;
        return bArrSliceArray2;
    }

    public static final long getNavBarTitleString(@NotNull byte[] bArr) {
        return ((Long) setDividerPadding(new Object[]{bArr}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:20:0x0116  */
    /* JADX WARN: Code duplicated, block: B:21:0x0119  */
    /* JADX WARN: Code duplicated, block: B:23:0x011b  */
    /* JADX WARN: Code duplicated, block: B:26:0x015e  */
    public static /* synthetic */ String h(Object[] objArr) {
        int i10;
        int i11;
        byte[] bArr = (byte[]) objArr[0];
        ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i12 = f59913b + 17;
        f59912a = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        String strDropLast = (String) setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
        if (strDropLast.length() > 0) {
            int i14 = f59913b;
            int i15 = i14 & 73;
            int i16 = i14 | 73;
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = i17 % 128;
            f59912a = i18;
            int i19 = i17 % 2;
            int i20 = (i18 | 27) << 1;
            int i21 = -(((~i18) & 27) | (i18 & (-28)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = i22 % 128;
            f59913b = i23;
            int i24 = i22 % 2;
            int i25 = (i23 & 89) + (i23 | 89);
            f59912a = i25 % 128;
            int i26 = i25 % 2;
            if (zBooleanValue) {
                int i27 = i23 & 121;
                int i28 = (i23 ^ 121) | i27;
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f59912a = i29 % 128;
                if (i29 % 2 == 0 ? StringsKt___StringsKt.last(strDropLast) == 'F' : StringsKt___StringsKt.last(strDropLast) == '6') {
                    int i30 = f59912a;
                    int i31 = i30 ^ 59;
                    int i32 = -(-((i30 & 59) << 1));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f59913b = i33 % 128;
                    int i34 = i33 % 2;
                    strDropLast = StringsKt___StringsKt.dropLast(strDropLast, 1);
                    int i35 = f59912a;
                    int i36 = i35 & 55;
                    int i37 = (((i35 | 55) & (~i36)) - (~(-(-(i36 << 1))))) - 1;
                    f59913b = i37 % 128;
                    int i38 = i37 % 2;
                }
            }
            if (strDropLast.length() == 0) {
                int i39 = f59913b;
                int i40 = (i39 ^ 3) + ((i39 & 3) << 1);
                int i41 = i40 % 128;
                f59912a = i41;
                int i42 = i40 % 2;
                int i43 = i41 ^ 23;
                int i44 = ((((i41 & 23) | i43) << 1) - (~(-i43))) - 1;
                int i45 = i44 % 128;
                f59913b = i45;
                int i46 = i44 % 2;
                int i47 = i45 ^ 83;
                int i48 = (i45 & 83) << 1;
                i11 = (i47 ^ i48) + ((i47 & i48) << 1);
                f59912a = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                strDropLast = "0";
            } else {
                int i49 = f59912a;
                int i50 = (i49 & (-54)) | ((~i49) & 53);
                int i51 = -(-((i49 & 53) << 1));
                int i52 = (i50 & i51) + (i51 | i50);
                int i53 = i52 % 128;
                f59913b = i53;
                int i54 = i52 % 2;
                int i55 = ((i53 & (-16)) | ((~i53) & 15)) + ((i53 & 15) << 1);
                f59912a = i55 % 128;
                int i56 = i55 % 2;
            }
            String strPadStart = StringsKt__StringsKt.padStart(strDropLast, 0, '0');
            int i57 = f59913b;
            int i58 = (i57 & (-100)) | ((~i57) & 99);
            int i59 = -(-((i57 & 99) << 1));
            i10 = (i58 & i59) + (i59 | i58);
            f59912a = i10 % 128;
            if (i10 % 2 != 0) {
                int i60 = 52 / 0;
            }
            return strPadStart;
        }
        int i61 = f59913b;
        int i62 = ((((i61 ^ 13) | (i61 & 13)) << 1) - (~(-(((~i61) & 13) | (i61 & (-14)))))) - 1;
        f59912a = i62 % 128;
        int i63 = i62 % 2;
        int i64 = f59913b;
        int i65 = i64 & 43;
        int i66 = (i64 ^ 43) | i65;
        int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
        f59912a = i67 % 128;
        int i68 = i67 % 2;
        if (strDropLast.length() == 0) {
            int i310 = f59913b;
            int i410 = (i310 ^ 3) + ((i310 & 3) << 1);
            int i411 = i410 % 128;
            f59912a = i411;
            int i412 = i410 % 2;
            int i413 = i411 ^ 23;
            int i414 = ((((i411 & 23) | i413) << 1) - (~(-i413))) - 1;
            int i415 = i414 % 128;
            f59913b = i415;
            int i416 = i414 % 2;
            int i417 = i415 ^ 83;
            int i418 = (i415 & 83) << 1;
            i11 = (i417 ^ i418) + ((i417 & i418) << 1);
            f59912a = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            strDropLast = "0";
        } else {
            int i419 = f59912a;
            int i510 = (i419 & (-54)) | ((~i419) & 53);
            int i511 = -(-((i419 & 53) << 1));
            int i512 = (i510 & i511) + (i511 | i510);
            int i513 = i512 % 128;
            f59913b = i513;
            int i514 = i512 % 2;
            int i515 = ((i513 & (-16)) | ((~i513) & 15)) + ((i513 & 15) << 1);
            f59912a = i515 % 128;
            int i516 = i515 % 2;
        }
        String strPadStart2 = StringsKt__StringsKt.padStart(strDropLast, 0, '0');
        int i517 = f59913b;
        int i518 = (i517 & (-100)) | ((~i517) & 99);
        int i519 = -(-((i517 & 99) << 1));
        i10 = (i518 & i519) + (i519 | i518);
        f59912a = i10 % 128;
        if (i10 % 2 != 0) {
            int i69 = 52 / 0;
        }
        return strPadStart2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1 A[LOOP:0: B:6:0x0025->B:25:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[SYNTHETIC] */
    public static /* synthetic */ Object i(Object[] objArr) {
        int length;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        byte[] bArr = (byte[]) objArr[0];
        int i12 = f59913b;
        int i13 = ((i12 ^ 111) - (~((i12 & 111) << 1))) - 1;
        f59912a = i13 % 128;
        String str = "";
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            length = bArr.length;
            i10 = 1;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            length = bArr.length;
            i10 = 0;
        }
        while (true) {
            if (i10 >= length) {
                int i14 = f59912a + 103;
                f59913b = i14 % 128;
                int i15 = i14 % 2;
                break;
            }
            int i16 = f59912a;
            int i17 = (((i16 | 17) << 1) - (~(-(i16 ^ 17)))) - 1;
            int i18 = i17 % 128;
            f59913b = i18;
            int i19 = i17 % 2;
            byte b10 = bArr[i10];
            if (48 <= b10) {
                int i20 = ((i18 & (-24)) | ((~i18) & 23)) + ((i18 & 23) << 1);
                int i21 = i20 % 128;
                f59912a = i21;
                int i22 = i20 % 2;
                if (b10 <= 57) {
                    int i23 = i21 + 11;
                    int i24 = i23 % 128;
                    f59913b = i24;
                    int i25 = i23 % 2;
                    int i26 = (((i24 ^ 1) | (i24 & 1)) << 1) - (((~i24) & 1) | (i24 & (-2)));
                    f59912a = i26 % 128;
                    int i27 = i26 % 2;
                    z10 = true;
                } else {
                    int i28 = i21 & 107;
                    int i29 = i28 + ((i21 ^ 107) | i28);
                    f59913b = i29 % 128;
                    int i30 = i29 % 2;
                }
                if (!z10) {
                    int i31 = f59912a;
                    int i32 = i31 & 37;
                    int i33 = (i31 ^ 37) | i32;
                    int i34 = (i32 & i33) + (i33 | i32);
                    int i35 = i34 % 128;
                    f59913b = i35;
                    int i36 = i34 % 2;
                    int i37 = i35 ^ 59;
                    int i38 = ((i35 & 59) | i37) << 1;
                    int i39 = -i37;
                    int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                    int i41 = i40 % 128;
                    f59912a = i41;
                    int i42 = i40 % 2;
                    int i43 = i41 & 75;
                    int i44 = (i41 ^ 75) | i43;
                    i11 = ((i43 | i44) << 1) - (i44 ^ i43);
                    f59913b = i11 % 128;
                    if (i11 % 2 == 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        break;
                    }
                    throw new setIndeterminateDrawable(3007, setOnFocusChangeListener(bArr), null, 4, null);
                }
                int i45 = f59913b;
                int i46 = i45 ^ 89;
                int i47 = (i45 & 89) << 1;
                int i48 = (i46 & i47) + (i47 | i46);
                int i49 = i48 % 128;
                f59912a = i49;
                int i50 = i48 % 2;
                i10++;
                int i51 = (i49 & 81) + (i49 | 81);
                f59913b = i51 % 128;
                int i52 = i51 % 2;
            } else {
                int i53 = (i16 & (-34)) | ((~i16) & 33);
                int i54 = (i16 & 33) << 1;
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f59913b = i55 % 128;
                int i56 = i55 % 2;
            }
            z10 = false;
            if (!z10) {
                int i310 = f59912a;
                int i311 = i310 & 37;
                int i312 = (i310 ^ 37) | i311;
                int i313 = (i311 & i312) + (i312 | i311);
                int i314 = i313 % 128;
                f59913b = i314;
                int i315 = i313 % 2;
                int i316 = i314 ^ 59;
                int i317 = ((i314 & 59) | i316) << 1;
                int i318 = -i316;
                int i410 = (i317 ^ i318) + ((i317 & i318) << 1);
                int i411 = i410 % 128;
                f59912a = i411;
                int i412 = i410 % 2;
                int i413 = i411 & 75;
                int i414 = (i411 ^ 75) | i413;
                i11 = ((i413 | i414) << 1) - (i414 ^ i413);
                f59913b = i11 % 128;
                if (i11 % 2 == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    break;
                }
                throw new setIndeterminateDrawable(3007, setOnFocusChangeListener(bArr), null, 4, null);
            }
            int i415 = f59913b;
            int i416 = i415 ^ 89;
            int i417 = (i415 & 89) << 1;
            int i418 = (i416 & i417) + (i417 | i416);
            int i419 = i418 % 128;
            f59912a = i419;
            int i57 = i418 % 2;
            i10++;
            int i58 = (i419 & 81) + (i419 | 81);
            f59913b = i58 % 128;
            int i59 = i58 % 2;
        }
        String str2 = new String(bArr, Charsets.UTF_8);
        if (bArr.length % 2 != 0) {
            int i60 = f59912a;
            int i61 = (i60 & 123) + (i60 | 123);
            f59913b = i61 % 128;
            if (i61 % 2 == 0) {
                throw null;
            }
            str = "F";
        } else {
            int i62 = f59912a;
            int i63 = (i62 ^ 91) + ((i62 & 91) << 1);
            f59913b = i63 % 128;
            int i64 = i63 % 2;
        }
        byte[] bArr2 = (byte[]) setDividerPadding(new Object[]{Intrinsics.stringPlus(str2, str)}, -1768743273, 1768743278, (int) System.currentTimeMillis());
        int i65 = f59913b;
        int i66 = i65 & 71;
        int i67 = (i65 | 71) & (~i66);
        int i68 = i66 << 1;
        int i69 = (i67 & i68) + (i67 | i68);
        f59912a = i69 % 128;
        int i70 = i69 % 2;
        return bArr2;
    }

    public static /* synthetic */ ArrayList j(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f59912a;
        int i11 = (((i10 ^ 117) | (i10 & 117)) << 1) - (((~i10) & 117) | (i10 & (-118)));
        f59913b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length % 2 != 0) {
            int i13 = PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bArr.length);
            sb2.append(", 2");
            throw new setIndeterminateDrawable(i13, sb2.toString(), null, 4, null);
        }
        IntRange intRangeUntil = c.until(0, bArr.length / 2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        int i14 = f59913b;
        int i15 = i14 & 107;
        int i16 = -(-((i14 ^ 107) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f59912a = i17 % 128;
        int i18 = i17 % 2;
        while (!(!it.hasNext())) {
            int i19 = f59913b;
            int i20 = i19 & 27;
            int i21 = (i20 - (~(-(-((i19 ^ 27) | i20))))) - 1;
            f59912a = i21 % 128;
            int i22 = i21 % 2;
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(ArraysKt___ArraysKt.sliceArray(bArr, c.until(iNextInt << 1, (((iNextInt ^ 1) - (~((iNextInt & 1) << 1))) - 1) << 1)));
            int i23 = f59912a;
            int i24 = i23 & 101;
            int i25 = (i24 - (~(-(-((i23 ^ 101) | i24))))) - 1;
            f59913b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f59913b;
        int i28 = (((i27 & (-114)) | ((~i27) & 113)) - (~(-(-((i27 & 113) << 1))))) - 1;
        f59912a = i28 % 128;
        if (i28 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static /* synthetic */ Long k(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f59912a;
        int i11 = ((i10 ^ 72) + ((i10 & 72) << 1)) - 1;
        f59913b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        long j10 = Long.parseLong((String) setDividerPadding(new Object[]{bArr, Boolean.FALSE, 3}, -1521120231, 1521120244, 3));
        int i13 = f59913b;
        int i14 = ((i13 | 23) << 1) - (((~i13) & 23) | (i13 & (-24)));
        f59912a = i14 % 128;
        if (i14 % 2 == 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    public static /* synthetic */ Integer l(Object[] objArr) {
        int i10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i11 = f59912a;
        int i12 = (i11 ^ 4) + ((i11 & 4) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        f59913b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 0) {
            int i15 = f59912a;
            int i16 = i15 & 123;
            int i17 = i16 + ((i15 ^ 123) | i16);
            f59913b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (((i15 | 100) << 1) - (i15 ^ 100)) - 1;
            f59913b = i19 % 128;
            if (i19 % 2 != 0 ? bArr.length <= 4 : bArr.length <= 2) {
                int length = bArr.length;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i20 = length * 319;
                int i21 = 317 & i20;
                int i22 = -(-((i20 ^ TypedValues.AttributesType.TYPE_EASING) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = ~length;
                int i25 = i24 & iCurrentTimeMillis;
                int i26 = (~i25) & (i24 | iCurrentTimeMillis);
                int i27 = ~iCurrentTimeMillis;
                int i28 = (i25 & i26) | (i26 ^ i25);
                int i29 = ~i28;
                int i30 = (i28 | i29) & i29;
                int i31 = i27 | iCurrentTimeMillis;
                int i32 = i27 & i31;
                int i33 = i32 | (~i32);
                int i34 = (length & i33) | (i33 ^ length);
                int i35 = ~i34;
                int i36 = (i34 | i35) & i35;
                int i37 = i30 & i36;
                int i38 = (i36 | i30) & (~i37);
                int i39 = (i23 - (~(-(~(((i38 & i37) | (i38 ^ i37)) * (-318)))))) - 1;
                int i40 = (i39 ^ (-1)) + (i39 << 1);
                int i41 = ~i24;
                int i42 = ~((i41 & i24) | (i41 ^ i24));
                int i43 = ~i31;
                int i44 = ((~i43) & i42) | ((~i42) & i43);
                int i45 = i42 & i43;
                int i46 = -(-(((i45 & i44) | (i44 ^ i45)) * (-318)));
                int i47 = i40 & i46;
                int i48 = ((i40 | i46) & (~i47)) + (i47 << 1);
                int i49 = ~iCurrentTimeMillis;
                int i50 = i24 ^ i49;
                int i51 = i49 & i24;
                int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i53 = (i48 ^ i52) + ((i48 & i52) << 1);
                if (i53 >= 0) {
                    int i54 = 0;
                    while (true) {
                        int i55 = i10 & 1;
                        int i56 = -(-((i10 ^ 1) | i55));
                        int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                        int i58 = bArr[i10] & 255;
                        int length2 = bArr.length;
                        int i59 = -i10;
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i60 = ((i59 * (-51)) - (~(-(-(length2 * 53))))) - 1;
                        int i61 = ~iCurrentTimeMillis2;
                        int i62 = i61 ^ i59;
                        int i63 = i61 & i59;
                        int i64 = i62 | i63;
                        int i65 = i64 ^ length2;
                        int i66 = ~length2;
                        int i67 = i64 & length2;
                        int i68 = -(-((~((i67 & i65) | (i65 ^ i67))) * 52));
                        int i69 = i60 ^ i68;
                        int i70 = -(-((i60 & i68) << 1));
                        int i71 = (i69 & i70) + (i70 | i69);
                        int i72 = (i66 | length2) & i66;
                        int i73 = ~((i72 & i61) | (i72 ^ i61));
                        int i74 = i66 & i59;
                        int i75 = (~i74) & (i66 | i59);
                        int i76 = ~((i75 ^ i74) | (i74 & i75));
                        int i77 = i73 & i76;
                        int i78 = ((~i77) & (i73 | i76)) | i77;
                        int i79 = ~i59;
                        int i80 = ~((i62 ^ i63) | (i62 & i63));
                        int i81 = ((~i80) & i78) | ((~i78) & i80);
                        int i82 = i78 & i80;
                        int i83 = ((i82 & i81) | (i81 ^ i82)) * (-52);
                        int i84 = (i71 & i83) + (i83 | i71);
                        int i85 = (~i61) & i79;
                        int i86 = ~i79;
                        int i87 = i85 | (i61 & i86) | (i61 & i79);
                        int i88 = ~i87;
                        int i89 = (i87 | i88) & i88;
                        int i90 = ~((i79 & length2) | (i79 & i66) | (i86 & length2));
                        int i91 = ((~i90) & i89) | ((~i89) & i90);
                        int i92 = i90 & i89;
                        int i93 = ((i92 & i91) | (i91 ^ i92)) * 52;
                        int i94 = i84 & i93;
                        int i95 = -(-((i93 ^ i84) | i94));
                        int i96 = (i94 & i95) + (i95 | i94);
                        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                        int i97 = (i96 * (-445)) + 445;
                        int i98 = ~i96;
                        int i99 = ~((i96 | i98) & i98);
                        int i100 = ~iCurrentTimeMillis3;
                        int i101 = i98 & i100;
                        int i102 = (i100 | i98) & (~i101);
                        int i103 = (i102 & i101) | (i102 ^ i101);
                        int i104 = ~i103;
                        int i105 = (i103 | i104) & i104;
                        int i106 = ((~i105) & i99) | ((~i99) & i105);
                        int i107 = i99 & i105;
                        int i108 = ((i107 & i106) | (i106 ^ i107)) * 446;
                        int i109 = i97 & i108;
                        int i110 = ((((i97 ^ i108) | i109) << 1) - (~(-((i97 | i108) & (~i109))))) - 1;
                        int i111 = i98 ^ (-1);
                        int i112 = ~(iCurrentTimeMillis3 | (i111 & i98) | (i111 ^ i98));
                        int i113 = i98 ^ i112;
                        int i114 = i112 & i98;
                        int i115 = -(~(-(-(((i114 & i113) | (i113 ^ i114)) * 446))));
                        int i116 = (i110 & i115) + (i115 | i110);
                        int i117 = (i116 ^ (-1)) + (i116 << 1);
                        int i118 = -(-((~i98) * 446));
                        int i119 = i117 & i118;
                        int i120 = i58 << ((i119 + ((i117 ^ i118) | i119)) * 8);
                        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                        int i121 = i120 * (-958);
                        int i122 = -(-(i54 * (-958)));
                        int i123 = ((((i121 ^ i122) | (i121 & i122)) << 1) - (~(-(((~i121) & i122) | ((~i122) & i121))))) - 1;
                        int i124 = ~i54;
                        int i125 = ~iCurrentTimeMillis4;
                        int i126 = i124 & i125;
                        int i127 = ~(((~i126) & (i124 | i125)) | i126);
                        int i128 = ~i120;
                        int i129 = i127 | (~((i128 ^ iCurrentTimeMillis4) | (i128 & iCurrentTimeMillis4)));
                        int i130 = i125 & i128;
                        int i131 = ~i125;
                        int i132 = (i120 & i131) | i130;
                        int i133 = i125 & i120;
                        int i134 = (i132 ^ i133) | (i132 & i133);
                        int i135 = ~i134;
                        int i136 = (i134 | i135) & i135;
                        int i137 = i129 & i136;
                        byte[] bArr2 = bArr;
                        int i138 = (~i137) & (i129 | i136);
                        int i139 = (((i138 & i137) | (i138 ^ i137)) * 959) + i123;
                        int i140 = i120 & i54;
                        int i141 = (i54 | i120) & (~i140);
                        int i142 = -(-((~((i141 & i140) | (i141 ^ i140))) * (-959)));
                        int i143 = ((((~i142) & i139) | ((~i139) & i142)) - (~(-(-((i139 & i142) << 1))))) - 1;
                        int i144 = (i128 & i131) | ((~i128) & i125);
                        int i145 = ~((i144 & i130) | (i144 ^ i130));
                        int i146 = ((~i124) & iCurrentTimeMillis4) | i126;
                        int i147 = i124 & iCurrentTimeMillis4;
                        int i148 = ~((i146 & i147) | (i146 ^ i147));
                        int i149 = (i145 & i148) | (i145 ^ i148);
                        int i150 = ~((i120 & iCurrentTimeMillis4) | (i120 ^ iCurrentTimeMillis4));
                        int i151 = ((~i150) & i149) | ((~i149) & i150);
                        int i152 = i150 & i149;
                        i54 = (((i152 & i151) | (i151 ^ i152)) * 959) + i143;
                        if (i57 > i53) {
                            break;
                        }
                        i10 = i57;
                        bArr = bArr2;
                    }
                    i10 = i54;
                }
                int i153 = f59913b;
                int i154 = i153 & 41;
                int i155 = i154 + ((i153 ^ 41) | i154);
                f59912a = i155 % 128;
                if (i155 % 2 == 0) {
                    return Integer.valueOf(i10);
                }
                throw null;
            }
        } else {
            int i156 = f59913b + 5;
            int i157 = i156 % 128;
            f59912a = i157;
            int i158 = i156 % 2;
            int i159 = i157 | 103;
            int i160 = ((i159 << 1) - (~(-(i159 & (~(i157 & 103)))))) - 1;
            f59913b = i160 % 128;
            int i161 = i160 % 2;
        }
        throw new setIndeterminateDrawable(1003, String.valueOf(bArr.length), null, 4, null);
    }

    public static /* synthetic */ Object m(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f59912a;
        int i11 = ((i10 | 8) << 1) - (i10 ^ 8);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f59913b = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            int i14 = f59912a;
            int i15 = i14 ^ 69;
            int i16 = (((i14 & 69) | i15) << 1) - i15;
            f59913b = i16 % 128;
            if (i16 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i17 = -(-(length * 561));
        int i18 = ((((559 ^ i17) | (559 & i17)) << 1) - (~(-((i17 & (-560)) | (559 & (~i17)))))) - 1;
        int i19 = ~iCurrentTimeMillis;
        int i20 = -(-((~(-1)) * (-560)));
        int i21 = (((~i20) & i18) | ((~i18) & i20)) + ((i18 & i20) << 1);
        int i22 = ~length;
        int i23 = (~i22) | i22;
        int i24 = ~iCurrentTimeMillis;
        int i25 = (i23 & iCurrentTimeMillis) | (i23 & i24) | ((~i23) & iCurrentTimeMillis);
        int i26 = -(-(((i25 | (~i25)) & (~i25)) * (-560)));
        int i27 = i21 ^ i26;
        int i28 = (i26 & i21) << 1;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int i30 = ~length;
        int i31 = (iCurrentTimeMillis | i24) & i19;
        int i32 = (i31 & i22) | ((~i31) & length);
        int i33 = length & i31;
        int i34 = ~((i33 & i32) | (i32 ^ i33));
        int i35 = -(-(((i34 & i30) | (i30 ^ i34)) * 560));
        int i36 = ((i29 | i35) << 1) - (i35 ^ i29);
        int i37 = f59913b;
        int i38 = (((i37 ^ 77) | (i37 & 77)) << 1) - (((~i37) & 77) | (i37 & (-78)));
        f59912a = i38 % 128;
        int i39 = i38 % 2;
        while (i36 >= 0) {
            int i40 = f59913b + 71;
            f59912a = i40 % 128;
            if (i40 % 2 != 0) {
                byte b10 = bArr[i36];
                throw null;
            }
            if (bArr[i36] != 0) {
                break;
            }
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i41 = i36 * (-929);
            int i42 = 464 & i41;
            int i43 = -(-(i41 | 464));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            int i45 = i36 & iCurrentTimeMillis2;
            int i46 = (~i45) & (i36 | iCurrentTimeMillis2);
            int i47 = (i45 & i46) | (i46 ^ i45);
            int i48 = -(~(-(-(((~i47) & ((~i47) | i47)) * (-465)))));
            int i49 = ~iCurrentTimeMillis2;
            int i50 = (((-1) << 1) - (((i44 ^ i48) + ((i44 & i48) << 1)) ^ (-1))) - (~(-(-(((i49 & i36) | (i36 ^ i49)) * 930))));
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            int i52 = -(-(i47 * 465));
            int i53 = i51 & i52;
            int i54 = i51 | i52;
            i36 = (i53 & i54) + (i54 | i53);
            int i55 = f59912a;
            int i56 = (i55 & (-64)) | ((~i55) & 63);
            int i57 = (i55 & 63) << 1;
            int i58 = (i56 & i57) + (i57 | i56);
            f59913b = i58 % 128;
            int i59 = i58 % 2;
        }
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, i36));
        int i60 = f59913b + 109;
        f59912a = i60 % 128;
        int i61 = i60 % 2;
        return bArrSliceArray;
    }

    @NotNull
    public static final byte[] setCompoundDrawableTintBlendMode(@NotNull List<byte[]> list) {
        return (byte[]) setDividerPadding(new Object[]{list}, -822524174, 822524177, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00dd A[LOOP:0: B:11:0x0063->B:14:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[PHI: r8
      PHI (r8v56 byte[] A[IMMUTABLE_TYPE]) = (r8v55 byte[]), (r8v58 byte[]) binds: [B:10:0x0061, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        Boolean boolValueOf;
        byte[] bArr;
        int i15;
        int i16 = ~((~i10) | i11);
        int i17 = ((i12 | i16) * 988) + (i11 * 989) + (i10 * (-1975));
        int i18 = ~i11;
        int i19 = ~(i18 | i10);
        int i20 = ~i12;
        int i21 = 0;
        switch ((((~(i11 | i20)) | (~(i12 | i18)) | i16) * 988) + (((~(i10 | i20)) | i19) * (-1976)) + i17) {
            case 1:
                byte[] bArr2 = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                Intrinsics.checkNotNullParameter(bArr2, "");
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(bArr2, iIntValue);
                int i22 = f59912a;
                int i23 = i22 & 107;
                int i24 = ((i22 ^ 107) | i23) << 1;
                int i25 = -((i22 | 107) & (~i23));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f59913b = i26 % 128;
                int i27 = i26 % 2;
                return setcompounddrawabletintblendmode;
            case 2:
                byte[] bArr3 = (byte[]) objArr[0];
                Intrinsics.checkNotNullParameter(bArr3, "");
                StringBuilder sb2 = new StringBuilder();
                int length = bArr3.length;
                int i28 = f59912a;
                int i29 = i28 & 25;
                int i30 = i29 + ((i28 ^ 25) | i29);
                f59913b = i30 % 128;
                int i31 = i30 % 2;
                while (i21 < length) {
                    int i32 = f59912a;
                    int i33 = (i32 & 25) + (i32 | 25);
                    f59913b = i33 % 128;
                    if (i33 % 2 == 0) {
                        byte b10 = bArr3[i21];
                        sb2.append("0123456789ABCDEF".charAt((b10 & 8659) / 2));
                        sb2.append("0123456789ABCDEF".charAt(b10 & 99));
                        i13 = (((i21 & (-32)) | ((~i21) & 31)) - (~(-(-((i21 & 31) << 1))))) - 1;
                    } else {
                        byte b11 = bArr3[i21];
                        sb2.append("0123456789ABCDEF".charAt((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4));
                        sb2.append("0123456789ABCDEF".charAt(b11 & 15));
                        i13 = (i21 ^ 1) + ((i21 & 1) << 1);
                    }
                    i21 = i13;
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i34 = f59912a;
                int i35 = (i34 & (-124)) | ((~i34) & 123);
                int i36 = (i34 & 123) << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f59913b = i37 % 128;
                int i38 = i37 % 2;
                return string;
            case 3:
                return c(objArr);
            case 4:
                String strStringPlus = (String) objArr[0];
                int i39 = f59912a;
                int i40 = (i39 ^ 79) + ((i39 & 79) << 1);
                f59913b = i40 % 128;
                if (i40 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(strStringPlus, "");
                } else {
                    Intrinsics.checkNotNullParameter(strStringPlus, "");
                }
                int i41 = 0;
                while (i41 < strStringPlus.length()) {
                    int i42 = f59913b + 25;
                    f59912a = i42 % 128;
                    int i43 = i42 % 2;
                    char cCharAt = strStringPlus.charAt(i41);
                    if (!Character.isDigit(cCharAt)) {
                        int i44 = f59912a;
                        int i45 = (i44 & 81) + (i44 | 81);
                        f59913b = i45 % 128;
                        int i46 = i45 % 2;
                        if (cCharAt != 'F') {
                            int i47 = (((i44 | 106) << 1) - (i44 ^ 106)) - 1;
                            f59913b = i47 % 128;
                            int i48 = i47 % 2;
                            int i49 = i44 ^ 123;
                            int i50 = (i44 & 123) << 1;
                            int i51 = (i49 & i50) + (i49 | i50);
                            f59913b = i51 % 128;
                            int i52 = i51 % 2;
                            throw new setIndeterminateDrawable(3007, strStringPlus, null, 4, null);
                        }
                    }
                    int i53 = f59913b;
                    int i54 = i53 + 63;
                    f59912a = i54 % 128;
                    int i55 = i54 % 2;
                    int i56 = i41 & 1;
                    i41 = (i56 - (~(-(-((i41 ^ 1) | i56))))) - 1;
                    int i57 = (i53 & (-120)) | ((~i53) & 119);
                    int i58 = (i53 & 119) << 1;
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    f59912a = i59 % 128;
                    int i60 = i59 % 2;
                }
                int i61 = f59912a;
                int i62 = i61 & 1;
                int i63 = ((i61 | 1) & (~i62)) + (i62 << 1);
                f59913b = i63 % 128;
                int i64 = i63 % 2;
                if (strStringPlus.length() % 2 == 1) {
                    int i65 = f59912a + 69;
                    f59913b = i65 % 128;
                    int i66 = i65 % 2;
                    strStringPlus = Intrinsics.stringPlus(strStringPlus, "F");
                    int i67 = f59913b;
                    i14 = ((i67 ^ 25) - (~((i67 & 25) << 1))) - 1;
                    f59912a = i14 % 128;
                } else {
                    int i68 = f59912a;
                    i14 = ((i68 ^ 52) + ((i68 & 52) << 1)) - 1;
                    f59913b = i14 % 128;
                }
                int i69 = i14 % 2;
                byte[] bArr4 = (byte[]) setDividerPadding(new Object[]{strStringPlus}, -1768743273, 1768743278, (int) System.currentTimeMillis());
                int i70 = f59913b;
                int i71 = ((i70 ^ 81) | (i70 & 81)) << 1;
                int i72 = -(((~i70) & 81) | (i70 & (-82)));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f59912a = i73 % 128;
                int i74 = i73 % 2;
                return bArr4;
            case 5:
                String str = (String) objArr[0];
                int i75 = f59913b + 17;
                f59912a = i75 % 128;
                byte[] bArr5 = (byte[]) (i75 % 2 != 0 ? setDividerPadding(new Object[]{str, 0}, -689525923, 689525942, 0) : setDividerPadding(new Object[]{str, 0}, -689525923, 689525942, 0));
                int i76 = f59912a;
                int i77 = (i76 ^ 39) + ((i76 & 39) << 1);
                f59913b = i77 % 128;
                int i78 = i77 % 2;
                return bArr5;
            case 6:
                d(objArr);
                return null;
            case 7:
                return l(objArr);
            case 8:
                return h(objArr);
            case 9:
                return k(objArr);
            case 10:
                return f(objArr);
            case 11:
                return b(objArr);
            case 12:
                return g(objArr);
            case 13:
                byte[] bArr6 = (byte[]) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i79 = f59912a;
                int i80 = ((((i79 ^ 107) | (i79 & 107)) << 1) - (~(-((i79 & (-108)) | ((~i79) & 107))))) - 1;
                f59913b = i80 % 128;
                int i81 = i80 % 2;
                if ((iIntValue2 & 2) != 0) {
                    int i82 = i79 + 23;
                    int i83 = i82 % 128;
                    f59913b = i83;
                    int i84 = i82 % 2;
                    int i85 = i83 + 71;
                    f59912a = i85 % 128;
                    int i86 = i85 % 2;
                    zBooleanValue = false;
                }
                String str2 = (String) setDividerPadding(new Object[]{bArr6, 0, Boolean.valueOf(zBooleanValue)}, 2046100460, -2046100452, 0);
                int i87 = f59912a;
                int i88 = i87 & 79;
                int i89 = i88 + ((i87 ^ 79) | i88);
                f59913b = i89 % 128;
                int i90 = i89 % 2;
                return str2;
            case 14:
                return e(objArr);
            case 15:
                byte[] bArr7 = (byte[]) objArr[0];
                Intrinsics.checkNotNullParameter(bArr7, "");
                setDividerPadding setdividerpadding = new setDividerPadding(bArr7);
                int i91 = f59912a;
                int i92 = (i91 ^ 86) + ((i91 & 86) << 1);
                int i93 = (i92 ^ (-1)) + (i92 << 1);
                f59913b = i93 % 128;
                int i94 = i93 % 2;
                return setdividerpadding;
            case 16:
                return i(objArr);
            case 17:
                return j(objArr);
            case 18:
                return a(objArr);
            case 19:
                String str3 = (String) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i95 = f59912a;
                int i96 = i95 & 67;
                int i97 = (i95 | 67) & (~i96);
                int i98 = -(-(i96 << 1));
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                f59913b = i99 % 128;
                int i100 = i99 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                String strReplace$default = l.replace$default(l.replace$default(str3, " ", "", false, 4, (Object) null), RootService.LINE_BREAK, "", false, 4, (Object) null);
                if (iIntValue3 != 0) {
                    int i101 = f59913b;
                    int i102 = ((i101 | 91) << 1) - (i101 ^ 91);
                    f59912a = i102 % 128;
                    int i103 = i102 % 2;
                    strReplace$default = StringsKt__StringsKt.padStart(strReplace$default, iIntValue3 << 1, '0');
                    int i104 = f59912a + 36;
                    int i105 = (i104 ^ (-1)) + (i104 << 1);
                    f59913b = i105 % 128;
                    int i106 = i105 % 2;
                } else {
                    int i107 = f59912a;
                    int i108 = ((i107 & 48) + (48 | i107)) - 1;
                    f59913b = i108 % 128;
                    int i109 = i108 % 2;
                }
                String str4 = strReplace$default;
                if (str4.length() % 2 != 0) {
                    throw new setIndeterminateDrawable(1002, str4, null, 4, null);
                }
                int length2 = str4.length() / 2;
                byte[] bArr8 = new byte[length2];
                int i110 = f59912a;
                int i111 = (i110 & (-40)) | ((~i110) & 39);
                int i112 = -(-((i110 & 39) << 1));
                int i113 = (i111 & i112) + (i112 | i111);
                f59913b = i113 % 128;
                int i114 = i113 % 2;
                while (i21 < length2) {
                    int i115 = f59913b;
                    int i116 = (-2) - (((i115 ^ 86) + ((i115 & 86) << 1)) ^ (-1));
                    f59912a = i116 % 128;
                    int i117 = i116 % 2;
                    int i118 = i21 << 1;
                    int i119 = i118 * (-932);
                    int i120 = 1868 & i119;
                    int i121 = ((1868 ^ i119) | i120) << 1;
                    int i122 = -((i119 | 1868) & (~i120));
                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                    int i124 = ~i118;
                    int i125 = ~iIntValue3;
                    int i126 = i125 & (i125 | iIntValue3);
                    int i127 = ~i126;
                    int i128 = ((-3) & i127) | (i126 & 2);
                    int i129 = (-3) & i126;
                    int i130 = ~((i128 ^ i129) | (i129 & i128));
                    int i131 = (~i130) & i124;
                    int i132 = ~i124;
                    int i133 = i131 | (i130 & i132);
                    int i134 = i130 & i124;
                    int i135 = -(-(((i133 ^ i134) | (i134 & i133)) * (-933)));
                    int i136 = ((i123 & i135) - (~(-(-(i123 | i135))))) - 1;
                    int i137 = (i132 & i126) | (i124 & i127);
                    int i138 = i124 & i126;
                    int i139 = ~((i137 & i138) | (i137 ^ i138));
                    int i140 = i124 & (i124 | i118);
                    int i141 = (i140 & 2) | (i140 & (-3)) | ((~i140) & 2);
                    int i142 = ~i141;
                    int i143 = (i141 | i142) & i142;
                    int i144 = ((~i143) & i139) | ((~i139) & i143);
                    int i145 = i139 & i143;
                    int i146 = -(~(-(-(((i145 & i144) | (i144 ^ i145)) * 933))));
                    int i147 = (((i136 | i146) << 1) - (i146 ^ i136)) - 1;
                    int i148 = i118 ^ 2;
                    int i149 = i118 & 2;
                    int i150 = (~((i148 & i149) | (i148 ^ i149))) * 933;
                    String strSubstring = str4.substring(i118, (((~i150) & i147) | ((~i147) & i150)) + ((i150 & i147) << 1));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    bArr8[i21] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                    int i151 = -(-(i21 * 917));
                    int i152 = ((((~i151) & (-1831)) | (i151 & 1830)) - (~((i151 & (-1831)) << 1))) - 1;
                    int i153 = ((-2) ^ i21) | ((-2) & i21);
                    int i154 = ~i153;
                    int i155 = -(~(-(-(((i153 | i154) & i154) * 2748))));
                    int i156 = (-2) - (((i152 ^ i155) + ((i155 & i152) << 1)) ^ (-1));
                    int i157 = ~i21;
                    int i158 = (-2) & i157;
                    int i159 = (~i158) & ((-2) | i157);
                    int i160 = -(~(-(-(((i159 & i158) | (i159 ^ i158)) * (-916)))));
                    int i161 = (((i156 | i160) << 1) - (i156 ^ i160)) - 1;
                    int i162 = ~(((-2) ^ i157) | i158);
                    int i163 = (i21 & 1) | (i21 ^ 1);
                    int i164 = ~i163;
                    int i165 = (i163 | i164) & i164;
                    int i166 = i162 & i165;
                    int i167 = (((i165 | i162) & (~i166)) | i166) * 916;
                    int i168 = i161 & i167;
                    int i169 = (i167 ^ i161) | i168;
                    i21 = ((i169 & i168) << 1) + (i168 ^ i169);
                    int i170 = f59913b;
                    int i171 = (i170 & 17) + (i170 | 17);
                    f59912a = i171 % 128;
                    int i172 = i171 % 2;
                }
                int i173 = f59912a;
                int i174 = i173 ^ 113;
                int i175 = ((i173 & 113) | i174) << 1;
                int i176 = -i174;
                int i177 = (i175 ^ i176) + ((i175 & i176) << 1);
                f59913b = i177 % 128;
                int i178 = i177 % 2;
                return bArr8;
            case 20:
                byte[] bArr9 = (byte[]) objArr[0];
                byte[] bArr10 = (byte[]) objArr[1];
                int i179 = f59912a;
                int i180 = ((i179 ^ 90) + ((i179 & 90) << 1)) - 1;
                f59913b = i180 % 128;
                int i181 = i180 % 2;
                Intrinsics.checkNotNullParameter(bArr9, "");
                Intrinsics.checkNotNullParameter(bArr10, "");
                if (bArr9.length < bArr10.length) {
                    int i182 = f59912a;
                    int i183 = i182 & 85;
                    int i184 = i183 + ((i182 ^ 85) | i183);
                    f59913b = i184 % 128;
                    int i185 = i184 % 2;
                    int i186 = (i182 & (-22)) | ((~i182) & 21);
                    int i187 = -(-((i182 & 21) << 1));
                    int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                    f59913b = i188 % 128;
                    int i189 = i188 % 2;
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean zEquals = Arrays.equals(ArraysKt___ArraysKt.sliceArray(bArr9, ArraysKt___ArraysKt.getIndices(bArr10)), bArr10);
                    int i190 = f59913b + 15;
                    f59912a = i190 % 128;
                    int i191 = i190 % 2;
                    boolValueOf = Boolean.valueOf(zEquals);
                }
                return boolValueOf;
            case 21:
                return m(objArr);
            default:
                long jLongValue = ((Number) objArr[0]).longValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i192 = f59913b;
                int i193 = i192 & 113;
                int i194 = (((i192 | 113) & (~i193)) - (~(-(-(i193 << 1))))) - 1;
                f59912a = i194 % 128;
                if (i194 % 2 != 0) {
                    bArr = new byte[iIntValue4];
                    if (iIntValue4 > 0) {
                        while (true) {
                            int i195 = i21 & (-37);
                            int i196 = i21 | (-37);
                            int i197 = (i195 ^ i196) + ((i195 & i196) << 1);
                            int i198 = i197 & 38;
                            int i199 = -(-((i197 ^ 38) | i198));
                            i15 = ((i198 & i199) << 1) + (i198 ^ i199);
                            int i200 = -i21;
                            int i201 = i200 * (-665);
                            int i202 = iIntValue4 * 334;
                            int i203 = i201 & i202;
                            int i204 = (i201 ^ i202) | i203;
                            int i205 = ((i203 | i204) << 1) - (i204 ^ i203);
                            int i206 = ~i200;
                            int i207 = (i200 | i206) & i206;
                            int i208 = (i207 * (-333)) + i205;
                            int i209 = ~iIntValue4;
                            int i210 = (i206 & i209) | (i206 ^ i209);
                            int i211 = ~i210;
                            int i212 = (i210 | i211) & i211;
                            int i213 = ~((iIntValue4 ^ iIntValue4) | (iIntValue4 & iIntValue4));
                            int i214 = -(-(((i212 & i213) | (i212 ^ i213)) * 333));
                            int i215 = i208 & i214;
                            int i216 = (((i208 ^ i214) | i215) << 1) - ((i214 | i208) & (~i215));
                            int i217 = i207 & iIntValue4;
                            int i218 = ((i207 | iIntValue4) & (~i217)) | i217;
                            int i219 = ~i218;
                            int i220 = (i218 | i219) & i219;
                            int i221 = ~((i209 & i209) | ((~i209) & iIntValue4) | (i209 & iIntValue4));
                            int i222 = -(-(((i220 & i221) | ((~i221) & i220) | ((~i220) & i221)) * 333));
                            bArr[i21] = (byte) ((jLongValue >>> (((-2) - (((i216 & i222) + (i222 | i216)) ^ (-1))) << 3)) & 255);
                            if (i15 >= iIntValue4) {
                                i21 = i15;
                            }
                        }
                    }
                } else {
                    bArr = new byte[iIntValue4];
                    if (iIntValue4 > 0) {
                        while (true) {
                            int i1910 = i21 & (-37);
                            int i1911 = i21 | (-37);
                            int i1912 = (i1910 ^ i1911) + ((i1910 & i1911) << 1);
                            int i1913 = i1912 & 38;
                            int i1914 = -(-((i1912 ^ 38) | i1913));
                            i15 = ((i1913 & i1914) << 1) + (i1913 ^ i1914);
                            int i2010 = -i21;
                            int i2011 = i2010 * (-665);
                            int i2012 = iIntValue4 * 334;
                            int i2013 = i2011 & i2012;
                            int i2014 = (i2011 ^ i2012) | i2013;
                            int i2015 = ((i2013 | i2014) << 1) - (i2014 ^ i2013);
                            int i2016 = ~i2010;
                            int i2017 = (i2010 | i2016) & i2016;
                            int i2018 = (i2017 * (-333)) + i2015;
                            int i2019 = ~iIntValue4;
                            int i2110 = (i2016 & i2019) | (i2016 ^ i2019);
                            int i2111 = ~i2110;
                            int i2112 = (i2110 | i2111) & i2111;
                            int i2113 = ~((iIntValue4 ^ iIntValue4) | (iIntValue4 & iIntValue4));
                            int i2114 = -(-(((i2112 & i2113) | (i2112 ^ i2113)) * 333));
                            int i2115 = i2018 & i2114;
                            int i2116 = (((i2018 ^ i2114) | i2115) << 1) - ((i2114 | i2018) & (~i2115));
                            int i2117 = i2017 & iIntValue4;
                            int i2118 = ((i2017 | iIntValue4) & (~i2117)) | i2117;
                            int i2119 = ~i2118;
                            int i223 = (i2118 | i2119) & i2119;
                            int i224 = ~((i2019 & i2019) | ((~i2019) & iIntValue4) | (i2019 & iIntValue4));
                            int i225 = -(-(((i223 & i224) | ((~i224) & i223) | ((~i223) & i224)) * 333));
                            bArr[i21] = (byte) ((jLongValue >>> (((-2) - (((i2116 & i225) + (i225 | i2116)) ^ (-1))) << 3)) & 255);
                            if (i15 >= iIntValue4) {
                                i21 = i15;
                            }
                        }
                    }
                }
                int i226 = f59912a;
                int i227 = (((i226 & (-106)) | ((~i226) & 105)) - (~((i226 & 105) << 1))) - 1;
                f59913b = i227 % 128;
                int i228 = i227 % 2;
                return bArr;
        }
    }

    public static final int setLayoutAnimation(@NotNull byte[] bArr) {
        return ((Integer) setDividerPadding(new Object[]{bArr}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setNavigationOnClickListener(@NotNull byte[] bArr) {
        return (getDetailsFieldTextSizeSp) setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis());
    }

    public static final long setOnDragListener(@NotNull byte[] bArr) {
        return ((Long) setDividerPadding(new Object[]{bArr}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue();
    }

    @NotNull
    public static final byte[] setOnFocusChangeListener(@NotNull String str, int i10) {
        return (byte[]) setDividerPadding(new Object[]{str, Integer.valueOf(i10)}, -689525923, 689525942, i10);
    }

    @NotNull
    public static final List<byte[]> setOnLongClickListener(@NotNull byte[] bArr) {
        return (List) setDividerPadding(new Object[]{bArr}, 1021812284, -1021812267, (int) System.currentTimeMillis());
    }

    public static final void setX(@NotNull byte[] bArr, int i10, int i11, boolean z10) {
        setDividerPadding(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10)}, -91299280, 91299286, i10);
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setY(@NotNull byte[] bArr, int i10) {
        return (getDetailsFieldTextSizeSp) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, 1296567195, -1296567194, i10);
    }

    @NotNull
    public static final byte[] setCompoundDrawableTintBlendMode(int i10) {
        return (byte[]) setDividerPadding(new Object[]{Integer.valueOf(i10)}, -1690212590, 1690212600, i10);
    }

    @NotNull
    public static final String setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (String) setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
    }

    public static final boolean setX(@NotNull byte[] bArr, int i10, int i11) {
        return ((Boolean) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 837138809, -837138798, i10)).booleanValue();
    }

    @NotNull
    public static final byte[] setY(long j10, int i10) {
        return (byte[]) setDividerPadding(new Object[]{Long.valueOf(j10), Integer.valueOf(i10)}, 672373041, -672373041, i10);
    }

    public static final boolean setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return ((Boolean) setDividerPadding(new Object[]{bArr, bArr2}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue();
    }

    public static /* synthetic */ byte[] setX(String str) {
        return (byte[]) setDividerPadding(new Object[]{str}, -1768743273, 1768743278, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{bArr}, 708511835, -708511823, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{bArr}, 1395673408, -1395673387, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setX(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{bArr}, 60045397, -60045381, (int) System.currentTimeMillis());
    }

    public static final class setCompoundDrawableTintBlendMode implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f59914c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f59915d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f59916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f59917b;

        public setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
            this.f59916a = bArr;
            this.f59917b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x006b A[PHI: r4
          0x006b: PHI (r4v5 int) = (r4v4 int), (r4v9 int) binds: [B:11:0x0069, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x007f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0096 A[PHI: r2 r4
          0x0096: PHI (r2v22 char) = (r2v10 char), (r2v29 char) binds: [B:11:0x0069, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r4v7 int) = (r4v4 int), (r4v9 int) binds: [B:11:0x0069, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0094 A[SYNTHETIC] */
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            char cCharAt;
            int i13;
            int i14;
            int i15;
            Object objValueOf;
            int i16 = 0;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            String str = (String) setInputExtras.setDividerPadding(new Object[]{setcompounddrawabletintblendmode.f59916a}, 1609250238, -1609250236, (int) System.currentTimeMillis());
            ArrayList arrayList = new ArrayList(str.length());
            int i17 = f59914c;
            int i18 = i17 & 119;
            int i19 = (((i17 | 119) & (~i18)) - (~(i18 << 1))) - 1;
            f59915d = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (i16 < str.length()) {
                int i22 = f59914c + 41;
                f59915d = i22 % 128;
                int i23 = i22 % 2;
                int i24 = setcompounddrawabletintblendmode.f59917b;
                if (i23 == 0) {
                    cCharAt = str.charAt(i16);
                    i13 = (i21 & 71) + (i21 | 71);
                    if (i21 >= i24) {
                        i14 = f59915d;
                        int i25 = (i14 | 113) << 1;
                        int i26 = -(i14 ^ 113);
                        i15 = (i25 & i26) + (i25 | i26);
                        f59914c = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        int i27 = i14 & 65;
                        int i28 = (((i14 | 65) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                        f59914c = i28 % 128;
                        int i29 = i28 % 2;
                        objValueOf = ProxyConfig.MATCH_ALL_SCHEMES;
                    } else {
                        objValueOf = Character.valueOf(cCharAt);
                        int i30 = f59915d;
                        int i31 = i30 & 15;
                        int i32 = (((i30 | 15) & (~i31)) - (~(i31 << 1))) - 1;
                        f59914c = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else {
                    cCharAt = str.charAt(i16);
                    int i34 = i21 & 1;
                    int i35 = -(-((i21 ^ 1) | i34));
                    i13 = ((i34 & i35) << 1) + (i34 ^ i35);
                    if (i21 >= i24) {
                        i14 = f59915d;
                        int i210 = (i14 | 113) << 1;
                        int i211 = -(i14 ^ 113);
                        i15 = (i210 & i211) + (i210 | i211);
                        f59914c = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        int i212 = i14 & 65;
                        int i213 = (((i14 | 65) & (~i212)) - (~(-(-(i212 << 1))))) - 1;
                        f59914c = i213 % 128;
                        int i214 = i213 % 2;
                        objValueOf = ProxyConfig.MATCH_ALL_SCHEMES;
                    } else {
                        objValueOf = Character.valueOf(cCharAt);
                        int i36 = f59915d;
                        int i37 = i36 & 15;
                        int i38 = (((i36 | 15) & (~i37)) - (~(i37 << 1))) - 1;
                        f59914c = i38 % 128;
                        int i39 = i38 % 2;
                    }
                }
                arrayList.add(objValueOf);
                i16 = ((i16 | 1) << 1) - (i16 ^ 1);
                int i40 = f59914c;
                int i41 = i40 & 17;
                int i42 = (i40 ^ 17) | i41;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f59915d = i43 % 128;
                int i44 = i43 % 2;
                i21 = i13;
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
            int i45 = f59915d;
            int i46 = i45 & 3;
            int i47 = i46 + ((i45 ^ 3) | i46);
            f59914c = i47 % 128;
            int i48 = i47 % 2;
            return strJoinToString$default;
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1414643316, 1414643316, System.identityHashCode(this));
        }
    }

    @NotNull
    public static final byte[] setDividerPadding(@NotNull String str) {
        return (byte[]) setDividerPadding(new Object[]{str}, 1866385647, -1866385643, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ String setDividerPadding(byte[] bArr, boolean z10, int i10) {
        return (String) setDividerPadding(new Object[]{bArr, Boolean.valueOf(z10), Integer.valueOf(i10)}, -1521120231, 1521120244, i10);
    }

    @NotNull
    public static final byte[] setDividerPadding(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{bArr}, -888564661, 888564675, (int) System.currentTimeMillis());
    }
}
