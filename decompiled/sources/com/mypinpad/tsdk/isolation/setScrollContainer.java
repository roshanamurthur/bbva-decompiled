package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u0006\u001a\u00020\u0004X\u0087\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\u00020\u000f8\u0007X\u0086\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0006\u0010\u0018R\"\u0010\u0016\u001a\u00020\n8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\f\"\u0004\b\b\u0010\u001c"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollContainer;", "Lcom/mypinpad/tsdk/i/setLeftTopRightBottom;", "", "p0", "", "p1", "setOnFocusChangeListener", "([BI)I", "setCompoundDrawableTintBlendMode", "()[B", "", "toString", "()Ljava/lang/String;", "setY", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "a", "Z", "()Z", "Lcom/mypinpad/tsdk/i/setPressed;", "b", "Lcom/mypinpad/tsdk/i/setPressed;", "setX", "()Lcom/mypinpad/tsdk/i/setPressed;", "(Lcom/mypinpad/tsdk/i/setPressed;)V", "setDividerPadding", "c", "Ljava/lang/String;", "(Ljava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class setScrollContainer extends setLeftTopRightBottom {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60494d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60495e = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public setPressed setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    public int setOnFocusChangeListener;

    static {
        int i10 = f60495e;
        int i11 = ((i10 | 91) << 1) - (i10 ^ 91);
        f60494d = i11 % 128;
        int i12 = i11 % 2;
    }

    public setScrollContainer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integer a(Object[] objArr) {
        setScrollContainer setscrollcontainer = (setScrollContainer) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = f60495e;
        int i12 = (i11 & 15) + (i11 | 15);
        f60494d = i12 % 128;
        int i13 = i12 % 2;
        if (bArr == null) {
            throw new setOnHierarchyChangeListener(2003, null, i10, null == true ? 1 : 0);
        }
        setscrollcontainer.setY = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr[iIntValue]), 5}, 1812344530, -1812344522, 5)).booleanValue();
        setPressed.Companion companion = setPressed.INSTANCE;
        setOnFocusChangeListener(new Object[]{setscrollcontainer, (setPressed) setPressed.Companion.setOnFocusChangeListener(new Object[]{Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf((byte) (bArr[iIntValue] & Constants.CVR_B2b87_11_RFU)), 6}, 1382640069, -1382640067, 6)).byteValue())}, 666873186, -666873186, (int) System.currentTimeMillis())}, -1763311823, 1763311825, System.identityHashCode(setscrollcontainer));
        boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue)}, -404720954, 404720962, iIntValue)).booleanValue();
        int i14 = f60494d;
        int i15 = i14 & 15;
        int i16 = ((((i14 ^ 15) | i15) << 1) - (~(-((i14 | 15) & (~i15))))) - 1;
        f60495e = i16 % 128;
        int i17 = i16 % 2;
        int i18 = iIntValue;
        while (!(!zBooleanValue)) {
            int i19 = f60495e;
            int i20 = ((i19 & (-96)) | ((~i19) & 95)) + ((i19 & 95) << 1);
            f60494d = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = i18 & 41;
                int i22 = ((i18 ^ 41) | i21) << 1;
                int i23 = -((i18 | 41) & (~i21));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = i24 & (-10);
                i18 = (i25 << 1) + ((~i25) & (i24 | (-10)));
                if (!((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr[i18]), 85}, 1812344530, -1812344522, 85)).booleanValue()) {
                    break;
                }
            } else {
                int i26 = i18 & 1;
                int i27 = ((i18 ^ 1) | i26) << 1;
                int i28 = -((i18 | 1) & (~i26));
                i18 = (i28 | i27) + (i27 & i28);
                if (!((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr[i18]), 7}, 1812344530, -1812344522, 7)).booleanValue()) {
                    break;
                }
            }
        }
        int i29 = i18 * 370;
        int i30 = 370 & i29;
        int i31 = (i29 | 370) & (~i30);
        int i32 = i30 << 1;
        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
        int i34 = ~iIntValue;
        int i35 = ((i18 ^ 1) | (i18 & 1) | ((i34 | iIntValue) & i34)) * (-369);
        int i36 = i33 & i35;
        int i37 = -(-(i35 | i33));
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        int i39 = i34 & 1;
        int i40 = ((~i34) & (-2)) | i39;
        int i41 = i34 & (-2);
        int i42 = i40 | i41;
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        int i45 = (~i44) & i18;
        int i46 = ~i18;
        int i47 = i45 | (i44 & i46);
        int i48 = i44 & i18;
        int i49 = ((i47 ^ i48) | (i48 & i47)) * (-369);
        int i50 = i38 & i49;
        int i51 = i38 | i49;
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        int i53 = i46 ^ 1;
        int i54 = i46 & 1;
        int i55 = ~((i53 & i54) | (i53 ^ i54));
        int i56 = i39 | (iIntValue & (-2));
        int i57 = iIntValue & 1;
        int i58 = (i56 & i57) | (i56 ^ i57);
        int i59 = ~i58;
        int i60 = (i58 | i59) & i59;
        int i61 = i55 & i60;
        int i62 = (i55 | i60) & (~i61);
        int i63 = (i62 & i61) | (i62 ^ i61);
        int i64 = (i40 & i41) | (i40 ^ i41);
        int i65 = ~((i18 & i64) | (i64 ^ i18));
        int i66 = (-2) - (((i52 - (~(-(~(((i65 & i63) | (i63 ^ i65)) * 369))))) - 1) ^ (-1));
        if (zBooleanValue) {
            int i67 = f60494d;
            int i68 = ((i67 | 9) << 1) - (i67 ^ 9);
            f60495e = i68 % 128;
            int i69 = i68 % 2;
            int i70 = -iIntValue;
            int i71 = i70 * 678;
            int i72 = -(-(i66 * (-676)));
            int i73 = i71 & i72;
            int i74 = (i71 ^ i72) | i73;
            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
            int i76 = ~i70;
            int i77 = i76 * 677;
            int i78 = i75 & i77;
            int i79 = i78 + ((i75 ^ i77) | i78);
            int i80 = ~i66;
            int i81 = i76 & i80;
            int i82 = -(-((i81 | ((~i81) & (i76 | i80))) * (-677)));
            int i83 = ((i79 & i82) - (~(i82 | i79))) - 1;
            int i84 = i80 & (i80 | i66);
            int i85 = (i76 & i84) | ((~i84) & i70);
            int i86 = i70 & i84;
            int i87 = (~((i86 & i85) | (i85 ^ i86))) * 677;
            int i88 = i83 & i87;
            int i89 = -(-((i87 ^ i83) | i88));
            int i90 = (i88 & i89) + (i89 | i88);
            setscrollcontainer.setOnFocusChangeListener = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(i90), bArr}, 1821881576, -1821881566, iIntValue)).intValue();
            setOnFocusChangeListener(new Object[]{setscrollcontainer, (String) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue), Integer.valueOf(i90)}, 641926949, -641926938, iIntValue)}, -809862657, 809862664, System.identityHashCode(setscrollcontainer));
            int i91 = f60494d + 89;
            f60495e = i91 % 128;
            int i92 = i91 % 2;
        } else {
            setscrollcontainer.setOnFocusChangeListener = ((Integer) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue)}, -1347584242, 1347584254, iIntValue)).intValue();
            setOnFocusChangeListener(new Object[]{setscrollcontainer, (String) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue)}, -1209174827, 1209174836, iIntValue)}, -809862657, 809862664, System.identityHashCode(setscrollcontainer));
            int i93 = f60494d;
            int i94 = i93 & 105;
            int i95 = ((((i93 ^ 105) | i94) << 1) - (~(-((i93 | 105) & (~i94))))) - 1;
            f60495e = i95 % 128;
            int i96 = i95 % 2;
        }
        int i97 = f60494d;
        int i98 = (i97 & 87) + (i97 | 87);
        f60495e = i98 % 128;
        if (i98 % 2 != 0) {
            return Integer.valueOf(i66);
        }
        int i99 = 39 / 0;
        return Integer.valueOf(i66);
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int i10 = f60495e;
        int i11 = (-2) - ((((i10 | 44) << 1) - (i10 ^ 44)) ^ (-1));
        f60494d = i11 % 128;
        if (i11 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        } else {
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0109  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15 = ~i10;
        switch ((((~(i10 | (~i11))) | (~(i11 | i15 | i12))) * 235) + (((~(i15 | i12)) | i11) * (-470)) + (((~((~i12) | i15)) | i11) * (-235)) + (i11 * 471) + (i10 * 236)) {
            case 1:
                b(objArr);
                return "";
            case 2:
                obj = null;
                setScrollContainer setscrollcontainer = (setScrollContainer) objArr[0];
                setPressed setpressed = (setPressed) objArr[1];
                int i16 = f60494d;
                int i17 = ((i16 & 1) - (~(-(-(i16 | 1))))) - 1;
                f60495e = i17 % 128;
                if (i17 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setpressed, "");
                    setscrollcontainer.setDividerPadding = setpressed;
                    int i18 = 71 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(setpressed, "");
                    setscrollcontainer.setDividerPadding = setpressed;
                }
                int i19 = f60494d;
                int i20 = ((i19 | 45) << 1) - (((~i19) & 45) | (i19 & (-46)));
                f60495e = i20 % 128;
                int i21 = i20 % 2;
                return obj;
            case 3:
                setScrollContainer setscrollcontainer2 = (setScrollContainer) objArr[0];
                int i22 = f60495e;
                int i23 = (i22 & 26) + (i22 | 26);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                f60494d = i24 % 128;
                int i25 = i24 % 2;
                boolean z10 = setscrollcontainer2.setY;
                if (i25 != 0) {
                    throw null;
                }
                int i26 = i22 & 39;
                int i27 = i26 + ((i22 ^ 39) | i26);
                f60494d = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.valueOf(z10);
            case 4:
                setScrollContainer setscrollcontainer3 = (setScrollContainer) objArr[0];
                int i29 = f60494d;
                int i30 = i29 & 63;
                int i31 = (i29 ^ 63) | i30;
                int i32 = (i30 & i31) + (i30 | i31);
                f60495e = i32 % 128;
                int i33 = i32 % 2;
                setPressed setpressed2 = setscrollcontainer3.setDividerPadding;
                if (setpressed2 != null) {
                    int i34 = i29 + 15;
                    f60495e = i34 % 128;
                    if (i34 % 2 == 0) {
                        int i35 = 83 / 0;
                    }
                    return setpressed2;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i36 = f60494d;
                int i37 = ((i36 ^ 73) | (i36 & 73)) << 1;
                int i38 = -(((~i36) & 73) | (i36 & (-74)));
                int i39 = (i37 & i38) + (i38 | i37);
                f60495e = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 5:
                return a(objArr);
            case 6:
                setScrollContainer setscrollcontainer4 = (setScrollContainer) objArr[0];
                int i41 = f60495e;
                int i42 = (i41 ^ 91) + ((i41 & 91) << 1);
                int i43 = i42 % 128;
                f60494d = i43;
                if (i42 % 2 != 0) {
                    String str = setscrollcontainer4.setX;
                    throw null;
                }
                obj = setscrollcontainer4.setX;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i44 = f60494d + 95;
                    f60495e = i44 % 128;
                    if (i44 % 2 == 0) {
                        throw null;
                    }
                    return null;
                }
                int i45 = (i43 & (-102)) | ((~i43) & 101);
                int i46 = (i43 & 101) << 1;
                int i47 = (i45 & i46) + (i46 | i45);
                f60495e = i47 % 128;
                if (i47 % 2 == 0) {
                    throw null;
                }
                return obj;
            case 7:
                setScrollContainer setscrollcontainer5 = (setScrollContainer) objArr[0];
                String str2 = (String) objArr[1];
                int i48 = f60494d + 1;
                f60495e = i48 % 128;
                if (i48 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    setscrollcontainer5.setX = str2;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str2, "");
                setscrollcontainer5.setX = str2;
                int i49 = f60494d;
                int i50 = i49 | 79;
                int i51 = ((i50 << 1) - (~(-((~(i49 & 79)) & i50)))) - 1;
                f60495e = i51 % 128;
                if (i51 % 2 == 0) {
                    int i52 = 88 / 0;
                }
                return null;
            case 8:
                byte[] bArr = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i53 = f60495e;
                int i54 = (i53 ^ 53) + ((i53 & 53) << 1);
                f60494d = i54 % 128;
                int i55 = i54 % 2;
                if (((Integer) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue)}, -1347584242, 1347584254, iIntValue)).intValue() == 31) {
                    int i56 = f60495e + 47;
                    int i57 = i56 % 128;
                    f60494d = i57;
                    int i58 = i56 % 2;
                    int i59 = ((i57 ^ 25) | (i57 & 25)) << 1;
                    int i60 = -(((~i57) & 25) | (i57 & (-26)));
                    int i61 = (i59 & i60) + (i59 | i60);
                    f60495e = i61 % 128;
                    int i62 = i61 % 2;
                    obj = Boolean.TRUE;
                } else {
                    int i63 = f60495e;
                    int i64 = (i63 | 1) << 1;
                    int i65 = -(((~i63) & 1) | (i63 & (-2)));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    f60494d = i66 % 128;
                    if (i66 % 2 != 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                }
                return obj;
            case 9:
                byte[] bArr2 = (byte[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i67 = f60494d;
                int i68 = (((i67 | 73) << 1) - (~(-(((~i67) & 73) | (i67 & (-74)))))) - 1;
                f60495e = i68 % 128;
                int i69 = i68 % 2;
                String str3 = (String) setInputExtras.setDividerPadding(new Object[]{new byte[]{bArr2[iIntValue2]}}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                int i70 = f60495e;
                int i71 = ((i70 ^ 122) + ((i70 & 122) << 1)) - 1;
                f60494d = i71 % 128;
                int i72 = i71 % 2;
                return str3;
            case 10:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                byte[] bArr3 = (byte[]) objArr[2];
                int i73 = f60495e;
                int i74 = i73 | 55;
                int i75 = i74 << 1;
                int i76 = -((~(i73 & 55)) & i74);
                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                f60494d = i77 % 128;
                int i78 = i77 % 2;
                byte[] bArr4 = new byte[4];
                int i79 = iIntValue3 * 825;
                int i80 = 1649 & i79;
                int i81 = (~i80) & (i79 | 1649);
                int i82 = -(-(i80 << 1));
                int i83 = (i81 & i82) + (i81 | i82);
                int i84 = ~iIntValue3;
                int i85 = (i84 | iIntValue3) & i84;
                int i86 = -(-(((i85 ^ 1) | (i85 & 1)) * (-824)));
                int i87 = i83 ^ i86;
                int i88 = ((i87 | (i83 & i86)) << 1) - i87;
                int i89 = iIntValue3 & 1;
                int i90 = (~i89) & (iIntValue3 | 1);
                int i91 = (i90 ^ i89) | (i90 & i89);
                int i92 = i91 * (-1648);
                int i93 = i88 ^ i92;
                int i94 = ((i93 | (i88 & i92)) << 1) - i93;
                int i95 = -2;
                int i96 = (-2) ^ i84;
                int i97 = (-2) & i84;
                int i98 = -(~(-(-(((i96 ^ i97) | (i96 & i97)) * 824))));
                int i99 = (-2) - ((((i94 | i98) << 1) - (i98 ^ i94)) ^ (-1));
                int i100 = (iIntValue4 ^ iIntValue3) + ((iIntValue4 & iIntValue3) << 1);
                if (i99 < i100) {
                    int i101 = 0;
                    while (true) {
                        int i102 = i99 + 1;
                        bArr4[i101] = bArr3[i99];
                        int i103 = (-950) - (~(i101 * (-949)));
                        int i104 = ~i101;
                        int i105 = i104 ^ i84;
                        int i106 = i104 & i84;
                        int i107 = (i105 ^ i106) | (i105 & i106);
                        int i108 = ~i107;
                        int i109 = (i107 | i108) & i108;
                        int i110 = ~(i95 | iIntValue3);
                        int i111 = ((i109 ^ i110) | (i109 & i110)) * ReturnCode.ERR_REPOSITORY;
                        int i112 = i103 & i111;
                        int i113 = (i111 | i103) & (~i112);
                        int i114 = -(-(i112 << 1));
                        int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
                        int i116 = i101 & i84;
                        int i117 = (i104 & iIntValue3) | i116;
                        int i118 = i101 & iIntValue3;
                        int i119 = -(-(((~((i117 ^ i118) | (i117 & i118))) | (~((i84 ^ 1) | (i84 & 1)))) * (-950)));
                        int i120 = i115 & i119;
                        int i121 = -(-((i119 ^ i115) | i120));
                        int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                        int i123 = i84 ^ i101;
                        int i124 = ~((i123 & i116) | (i123 ^ i116));
                        int i125 = ~i91;
                        int i126 = i124 ^ i125;
                        int i127 = i124 & i125;
                        int i128 = ((i127 & i126) | (i126 ^ i127)) * 950;
                        int i129 = i122 & i128;
                        i101 = (((i122 ^ i128) | i129) << 1) - ((i128 | i122) & (~i129));
                        if (i102 < i100) {
                            i99 = i102;
                            i95 = -2;
                        }
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf((byte[]) setInputExtras.setDividerPadding(new Object[]{bArr4}, 1395673408, -1395673387, (int) System.currentTimeMillis()), 4);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                int iIntValue5 = ((Integer) setInputExtras.setDividerPadding(new Object[]{bArrCopyOf}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                int i130 = iIntValue5 * (-764);
                int i131 = (-45870) & i130;
                int i132 = (i131 - (~(-(-((i130 ^ (-45870)) | i131))))) - 1;
                int i133 = ~iIntValue5;
                int i134 = (i133 | iIntValue5) & i133;
                int i135 = (i134 & (-31)) | ((-31) ^ i134) | i85;
                int i136 = ~i135;
                int i137 = (i135 | i136) & i136;
                int i138 = (-31) & i133;
                int i139 = (iIntValue5 & 30) | i138;
                int i140 = iIntValue5 & (-31);
                int i141 = (i140 & i139) | (i139 ^ i140);
                int i142 = ~((i141 & iIntValue3) | (i141 ^ iIntValue3));
                int i143 = i137 ^ i142;
                int i144 = i142 & i137;
                int i145 = (i144 & i143) | (i143 ^ i144);
                int i146 = ~i133;
                int i147 = i133 & 30;
                int i148 = (~i147) & (i133 | 30);
                int i149 = (i148 & i147) | (i148 ^ i147);
                int i150 = i149 & iIntValue3;
                int i151 = (i149 | iIntValue3) & (~i150);
                int i152 = ~((i151 & i150) | (i151 ^ i150));
                int i153 = i145 & i152;
                int i154 = (i145 | i152) & (~i153);
                int i155 = ((i154 & i153) | (i154 ^ i153)) * 765;
                int i156 = ((i132 | i155) << 1) - (i155 ^ i132);
                int i157 = ~(((-31) & i146) | i147 | i138);
                int i158 = (-31) & i84;
                int i159 = (~i158) & ((-31) | i84);
                int i160 = (i159 & i158) | (i159 ^ i158);
                int i161 = ~i160;
                int i162 = (i160 | i161) & i161;
                int i163 = ((i157 & i162) | (i157 ^ i162)) * 1530;
                int i164 = (i156 | i163) << 1;
                int i165 = -(i163 ^ i156);
                int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                int i167 = ~((iIntValue3 & (-31)) | (iIntValue3 & 30) | i158);
                int i168 = i133 ^ i85;
                int i169 = i133 & i85;
                int i170 = (i168 & i169) | (i168 ^ i169);
                int i171 = i170 ^ 30;
                int i172 = i170 & 30;
                int i173 = ~((i172 & i171) | (i171 ^ i172));
                int i174 = i167 & i173;
                int i175 = (i167 | i173) & (~i174);
                int i176 = ((i175 & i174) | (i175 ^ i174)) * 765;
                int i177 = (i166 & i176) + (i176 | i166);
                int i178 = f60495e;
                int i179 = i178 & 103;
                int i180 = -(-(i178 | 103));
                int i181 = (i179 & i180) + (i180 | i179);
                f60494d = i181 % 128;
                if (i181 % 2 == 0) {
                    return Integer.valueOf(i177);
                }
                throw null;
            case 11:
                byte[] bArr5 = (byte[]) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int iIntValue7 = ((Number) objArr[2]).intValue();
                int i182 = f60495e;
                int i183 = i182 & 39;
                int i184 = ((i182 ^ 39) | i183) << 1;
                int i185 = -((i182 | 39) & (~i183));
                int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
                f60494d = i186 % 128;
                int i187 = i186 % 2;
                String str4 = (String) setInputExtras.setDividerPadding(new Object[]{ArraysKt___ArraysKt.sliceArray(bArr5, c.until(iIntValue6, (iIntValue6 - (~iIntValue7)) - 1))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                int i188 = f60495e;
                int i189 = ((i188 & 70) + (i188 | 70)) - 1;
                f60494d = i189 % 128;
                if (i189 % 2 == 0) {
                    return str4;
                }
                int i190 = 68 / 0;
                return str4;
            case 12:
                byte[] bArr6 = (byte[]) objArr[0];
                int iIntValue8 = ((Number) objArr[1]).intValue();
                int i191 = f60494d + 91;
                int i192 = i191 % 128;
                f60495e = i192;
                int i193 = i191 % 2;
                int i194 = bArr6[iIntValue8] & 31;
                int i195 = (((i192 | 16) << 1) - (i192 ^ 16)) - 1;
                f60494d = i195 % 128;
                int i196 = i195 % 2;
                return Integer.valueOf(i194);
            default:
                setScrollContainer setscrollcontainer6 = (setScrollContainer) objArr[0];
                int i197 = f60495e;
                int i198 = i197 ^ 53;
                int i199 = (i197 & 53) << 1;
                int i200 = ((i198 | i199) << 1) - (i198 ^ i199);
                f60494d = i200 % 128;
                int i201 = i200 % 2;
                if (setscrollcontainer6.setOnFocusChangeListener == 0) {
                    int i202 = i197 & 101;
                    int i203 = ((i197 | 101) & (~i202)) + (i202 << 1);
                    f60494d = i203 % 128;
                    if (i203 % 2 != 0) {
                        setscrollcontainer6.setOnFocusChangeListener((byte[]) setInputExtras.setDividerPadding(new Object[]{(String) setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6))}, -1768743273, 1768743278, (int) System.currentTimeMillis()), 0);
                    } else {
                        setscrollcontainer6.setOnFocusChangeListener((byte[]) setInputExtras.setDividerPadding(new Object[]{(String) setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6))}, -1768743273, 1768743278, (int) System.currentTimeMillis()), 0);
                    }
                    int i204 = f60495e;
                    int i205 = (i204 ^ 31) + ((i204 & 31) << 1);
                    f60494d = i205 % 128;
                    int i206 = i205 % 2;
                }
                ArrayList arrayList = new ArrayList();
                int i207 = setscrollcontainer6.setOnFocusChangeListener;
                if (i207 >= 0) {
                    int i208 = f60495e;
                    int i209 = (i208 & (-112)) | ((~i208) & 111);
                    int i210 = (i208 & 111) << 1;
                    int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                    f60494d = i211 % 128;
                    if (i211 % 2 == 0 ? i207 <= 30 : i207 <= 80) {
                        arrayList.add(ArraysKt___ArraysKt.toByteArray(new Byte[]{Byte.valueOf((byte) i207)}));
                        int i212 = f60494d;
                        i13 = i212 & 107;
                        i14 = (i212 ^ 107) | i13;
                    } else {
                        arrayList.add(new byte[]{31});
                        int i213 = setscrollcontainer6.setOnFocusChangeListener;
                        int i214 = i213 & (-30);
                        int i215 = -(-(i213 | (-30)));
                        int i216 = ((i214 | i215) << 1) - (i215 ^ i214);
                        arrayList.add((byte[]) setInputExtras.setDividerPadding(new Object[]{(byte[]) setInputExtras.setDividerPadding(new Object[]{Integer.valueOf(i216)}, -1690212590, 1690212600, i216)}, 1395673408, -1395673387, (int) System.currentTimeMillis()));
                        int i217 = f60494d;
                        i13 = i217 ^ 23;
                        i14 = (i217 & 23) << 1;
                    }
                } else {
                    arrayList.add(new byte[]{31});
                    int i218 = setscrollcontainer6.setOnFocusChangeListener;
                    int i219 = i218 & (-30);
                    int i2110 = -(-(i218 | (-30)));
                    int i2111 = ((i219 | i2110) << 1) - (i2110 ^ i219);
                    arrayList.add((byte[]) setInputExtras.setDividerPadding(new Object[]{(byte[]) setInputExtras.setDividerPadding(new Object[]{Integer.valueOf(i2111)}, -1690212590, 1690212600, i2111)}, 1395673408, -1395673387, (int) System.currentTimeMillis()));
                    int i2112 = f60494d;
                    i13 = i2112 ^ 23;
                    i14 = (i2112 & 23) << 1;
                }
                int i220 = (i13 - (~(-(-i14)))) - 1;
                f60495e = i220 % 128;
                int i221 = i220 % 2;
                if (setscrollcontainer6.setY) {
                    int i222 = f60494d;
                    int i223 = i222 & 37;
                    int i224 = (((i222 ^ 37) | i223) << 1) - ((i222 | 37) & (~i223));
                    f60495e = i224 % 128;
                    int i225 = i224 % 2;
                    ((byte[]) arrayList.get(0))[0] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) arrayList.get(0))[0]), 5}, -1215674910, 1215674913, 5)).byteValue();
                    int i226 = f60495e;
                    int i227 = i226 & 27;
                    int i228 = (i226 ^ 27) | i227;
                    int i229 = (i227 ^ i228) + ((i228 & i227) << 1);
                    f60494d = i229 % 128;
                    int i230 = i229 % 2;
                }
                byte[] bArr7 = (byte[]) arrayList.get(0);
                byte b10 = ((byte[]) arrayList.get(0))[0];
                byte bByteValue = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((setPressed) setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -1730794875, 1730794879, System.identityHashCode(setscrollcontainer6))).setY()), 6}, 310482515, -310482506, 6)).byteValue();
                bArr7[0] = (byte) ((bByteValue & b10) | (b10 ^ bByteValue));
                byte[] bArr8 = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList}, -822524174, 822524177, (int) System.currentTimeMillis());
                int i231 = f60495e + 63;
                f60494d = i231 % 128;
                int i232 = i231 % 2;
                return bArr8;
        }
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1634346618, -1634346618, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -888877733, 888877739, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final setPressed setX() {
        return (setPressed) setOnFocusChangeListener(new Object[]{this}, -1730794875, 1730794879, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1018331266, -1018331265, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setScrollContainer(@NotNull String str) {
        this();
        Intrinsics.checkNotNullParameter(str, "");
        ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{this, (byte[]) setInputExtras.setDividerPadding(new Object[]{str}, -1768743273, 1768743278, (int) System.currentTimeMillis())}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setScrollContainer$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollContainer$setX;", "", "", "p0", "", "p1", "Lkotlin/Pair;", "Lcom/mypinpad/tsdk/i/setScrollContainer;", "setDividerPadding", "([BI)Lkotlin/Pair;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            Intrinsics.checkNotNullParameter(bArr, "");
            setScrollContainer setscrollcontainer = new setScrollContainer();
            return new Pair(setscrollcontainer, Integer.valueOf(setscrollcontainer.setOnFocusChangeListener(bArr, iIntValue)));
        }

        @NotNull
        public static Pair<setScrollContainer, Integer> setDividerPadding(@NotNull byte[] p4, int p10) {
            return (Pair) setDividerPadding(new Object[]{p4, Integer.valueOf(p10)}, -388954655, 388954655, p10);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] p4, int p10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, p4, Integer.valueOf(p10)}, -735126466, 735126471, p10)).intValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -927948209, 927948212, System.identityHashCode(this))).booleanValue();
    }
}
