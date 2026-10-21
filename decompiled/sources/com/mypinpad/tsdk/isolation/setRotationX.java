package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class setRotationX implements getRrn {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60415i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60416j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f60417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public setRotationY f60418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public setItemChecked f60419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final byte[] f60420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f60421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getBeepOnFailure f60422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final setMaxWidth f60423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final byte[] f60424h;

    public setRotationX(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60417a = bArr;
        this.f60418b = setRotationY.setCompoundDrawableTintBlendMode;
        this.f60419c = setItemChecked.setDividerPadding;
        setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
        this.f60420d = (byte[]) setNextFocusLeftId.setDividerPadding(new Object[]{bArr}, -2058921266, 2058921268, (int) System.currentTimeMillis());
        this.f60421e = ((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr}, 793691168, -793691167, (int) System.currentTimeMillis())).booleanValue();
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setX(new Object[]{bArr}, 1368786049, -1368786044, (int) System.currentTimeMillis());
        this.f60422f = getbeeponfailure;
        this.f60423g = (setMaxWidth) ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure)));
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = (length * 569) - 1138;
        int i11 = ~length;
        int i12 = ~length;
        int i13 = i11 & (i12 | length);
        int i14 = (i13 & 1) | (1 ^ i13);
        int i15 = (i14 | (~i14)) & (~i14);
        int i16 = ~iCurrentTimeMillis;
        int i17 = i15 | (~((1 ^ i16) | (1 & i16)));
        int i18 = ~length;
        int i19 = ~iCurrentTimeMillis;
        int i20 = i18 ^ i19;
        int i21 = i18 & i19;
        int i22 = (i21 & i20) | (i20 ^ i21);
        int i23 = (i22 | (~i22)) & (~i22);
        int i24 = i17 & i23;
        int i25 = (i17 | i23) & (~i24);
        int i26 = -(-(((i25 & i24) | (i25 ^ i24)) * (-1136)));
        int i27 = i10 & i26;
        int i28 = ((i10 ^ i26) | i27) << 1;
        int i29 = -((i10 | i26) & (~i27));
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = 1 & iCurrentTimeMillis;
        int i32 = (~i31) & (1 | iCurrentTimeMillis);
        int i33 = (i31 & i32) | (i32 ^ i31);
        int i34 = (i33 | (~i33)) & (~i33);
        int i35 = i12 ^ iCurrentTimeMillis;
        int i36 = i12 & iCurrentTimeMillis;
        int i37 = ~((i35 & i36) | (i35 ^ i36));
        int i38 = (i34 & i37) | ((~i37) & i34) | ((~i34) & i37);
        int i39 = (~iCurrentTimeMillis) & (i19 | iCurrentTimeMillis);
        int i40 = i39 ^ (-2);
        int i41 = i39 & (-2);
        int i42 = (i40 & i41) | (i40 ^ i41);
        int i43 = (i42 & i12) | ((~i42) & length);
        int i44 = i42 & length;
        int i45 = ~((i44 & i43) | (i43 ^ i44));
        int i46 = i38 ^ i45;
        int i47 = i38 & i45;
        int i48 = i30 - (~(-(-(((i47 & i46) | (i46 ^ i47)) * (-568)))));
        int i49 = (i48 ^ (-1)) + (i48 << 1);
        int i50 = (i39 & 1) | ((~i39) & (-2));
        int i51 = ~((i50 & i41) | (i50 ^ i41));
        int i52 = i16 & length;
        int i53 = ((length | i16) & (~i52)) | i52;
        int i54 = (i53 | (~i53)) & (~i53);
        int i55 = (i54 & i51) | (i51 ^ i54);
        int i56 = ((~i12) & 1) | (i12 & (-2)) | (i12 & 1);
        int i57 = i56 ^ iCurrentTimeMillis;
        int i58 = iCurrentTimeMillis & i56;
        int i59 = ~((i58 & i57) | (i57 ^ i58));
        int i60 = i55 ^ i59;
        int i61 = i55 & i59;
        int i62 = ((i61 & i60) | (i60 ^ i61)) * 568;
        int i63 = i49 & i62;
        this.f60424h = ArraysKt___ArraysKt.sliceArray(bArr, c.until(0, ((((i49 ^ i62) | i63) << 1) - (~(-((i62 | i49) & (~i63))))) - 1));
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        switch ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) {
            case 1:
                setRotationX setrotationx = (setRotationX) objArr[0];
                int i13 = f60416j;
                int i14 = i13 & 95;
                int i15 = (i14 - (~(-(-((i13 ^ 95) | i14))))) - 1;
                f60415i = i15 % 128;
                if (i15 % 2 == 0) {
                    return setrotationx.f60422f;
                }
                getBeepOnFailure getbeeponfailure = setrotationx.f60422f;
                throw null;
            case 2:
                setRotationX setrotationx2 = (setRotationX) objArr[0];
                int i16 = f60415i;
                int i17 = (i16 ^ 85) + ((i16 & 85) << 1);
                int i18 = i17 % 128;
                f60416j = i18;
                int i19 = i17 % 2;
                byte[] bArr = setrotationx2.f60420d;
                int i20 = i18 + 121;
                f60415i = i20 % 128;
                int i21 = i20 % 2;
                return bArr;
            case 3:
                setRotationX setrotationx3 = (setRotationX) objArr[0];
                int i22 = f60416j;
                int i23 = i22 & 25;
                int i24 = ((i22 | 25) & (~i23)) + (i23 << 1);
                f60415i = i24 % 128;
                if (i24 % 2 == 0) {
                    return setrotationx3.f60418b;
                }
                setRotationY setrotationy = setrotationx3.f60418b;
                throw null;
            case 4:
                setRotationX setrotationx4 = (setRotationX) objArr[0];
                setItemChecked setitemchecked = (setItemChecked) objArr[1];
                int i25 = f60416j;
                int i26 = i25 ^ 5;
                int i27 = ((i25 & 5) | i26) << 1;
                int i28 = -i26;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f60415i = i29 % 128;
                if (i29 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setitemchecked, "");
                    setrotationx4.f60419c = setitemchecked;
                    return null;
                }
                Intrinsics.checkNotNullParameter(setitemchecked, "");
                setrotationx4.f60419c = setitemchecked;
                int i30 = 68 / 0;
                return null;
            case 5:
                byte[] bArr2 = (byte[]) objArr[0];
                System.currentTimeMillis();
                System.currentTimeMillis();
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                int length = bArr2.length;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i31 = 205 - (~(length * (-103)));
                int i32 = ~length;
                int i33 = 1 ^ i32;
                int i34 = 1 & i32;
                int i35 = ~((i33 & i34) | (i33 ^ i34));
                int i36 = i32 & iCurrentTimeMillis;
                int i37 = ~(((i32 | iCurrentTimeMillis) & (~i36)) | i36);
                int i38 = ((i37 & i35) | (i35 ^ i37)) * 104;
                int i39 = i31 ^ i38;
                int i40 = ((i31 & i38) | i39) << 1;
                int i41 = -i39;
                int i42 = (i40 & i41) + (i40 | i41);
                int i43 = ~iCurrentTimeMillis;
                int i44 = i43 & (-2);
                int i45 = (i43 | (-2)) & (~i44);
                int i46 = (i45 & i44) | (i45 ^ i44);
                int i47 = i46 & length;
                int i48 = (i42 - (~(-(-((~(((length | i46) & (~i47)) | i47)) * (-104)))))) - 1;
                int i49 = -(~(-(-((((-2) ^ iCurrentTimeMillis) | (iCurrentTimeMillis & (-2))) * 104))));
                Pair pair = (Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{ArraysKt___ArraysKt.sliceArray(bArr2, c.until(0, ((i48 & i49) + (i49 | i48)) - 1))}, 2119034130, -2119034129, (int) System.currentTimeMillis());
                int iIntValue = ((Number) pair.getSecond()).intValue();
                int length2 = bArr2.length;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i50 = length2 * (-448);
                int i51 = (-900) & i50;
                int i52 = -(-(i50 | (-900)));
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                int i54 = ~length2;
                int i55 = (1 & i54) | (length2 & (-2));
                int i56 = 1 & length2;
                int i57 = ~((i55 & i56) | (i55 ^ i56));
                int i58 = (i54 | length2) & i54;
                int i59 = i58 & (-2);
                int i60 = ((i58 | (-2)) & (~i59)) | i59;
                int i61 = ~iCurrentTimeMillis2;
                int i62 = (iCurrentTimeMillis2 & i60) | (i60 & i61) | ((~i60) & iCurrentTimeMillis2);
                int i63 = ~i62;
                int i64 = (i62 | i63) & i63;
                int i65 = i57 & i64;
                int i66 = (i64 | i57) & (~i65);
                int i67 = (i53 - (~(-(~(-(-(((i66 & i65) | (i66 ^ i65)) * 449))))))) - 2;
                int i68 = (1 ^ length2) | i56;
                int i69 = ~i68;
                int i70 = ((i68 | i69) & i69) * (-1347);
                int i71 = ((i67 | i70) << 1) - (i70 ^ i67);
                int i72 = ~(((length2 | 1) & (~i56)) | i56);
                int i73 = ((~i61) & i54) | ((~i54) & i61);
                int i74 = i54 & i61;
                int i75 = (i73 & i74) | (i73 ^ i74);
                int i76 = i75 & (-2);
                int i77 = (i75 | (-2)) & (~i76);
                int i78 = ~((i77 & i76) | (i77 ^ i76));
                int i79 = -(-(((i72 & i78) | (i72 ^ i78)) * 449));
                int i80 = i71 & i79;
                if (iIntValue == ((((i71 ^ i79) | i80) << 1) - (~(-((i79 | i71) & (~i80))))) - 1) {
                    obj = (getBeepOnFailure) pair.getFirst();
                    int i81 = f60415i;
                    int i82 = i81 & 115;
                    int i83 = ((i81 ^ 115) | i82) << 1;
                    int i84 = -((i81 | 115) & (~i82));
                    int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                    f60416j = i85 % 128;
                    int i86 = i85 % 2;
                } else {
                    int i87 = f60416j;
                    int i88 = i87 & 49;
                    int i89 = (i87 ^ 49) | i88;
                    int i90 = (i88 & i89) + (i89 | i88);
                    f60415i = i90 % 128;
                    if (i90 % 2 != 0) {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                        obj = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode2}, -1326528808, 1326528813, System.identityHashCode(setcompounddrawabletintblendmode2));
                        int i91 = 63 / 0;
                    } else {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
                        obj = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode3}, -1326528808, 1326528813, System.identityHashCode(setcompounddrawabletintblendmode3));
                    }
                    int i92 = f60416j;
                    int i93 = ((((i92 ^ 53) | (i92 & 53)) << 1) - (~(-(((~i92) & 53) | (i92 & (-54)))))) - 1;
                    f60415i = i93 % 128;
                    int i94 = i93 % 2;
                }
                break;
            case 6:
                setRotationX setrotationx5 = (setRotationX) objArr[0];
                int i95 = f60415i;
                int i96 = ((i95 ^ 93) | (i95 & 93)) << 1;
                int i97 = -((i95 & (-94)) | ((~i95) & 93));
                int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                f60416j = i98 % 128;
                int i99 = i98 % 2;
                obj = setrotationx5.f60419c;
                int i100 = (i95 ^ 7) + ((i95 & 7) << 1);
                f60416j = i100 % 128;
                if (i100 % 2 == 0) {
                    throw null;
                }
                break;
            case 7:
                setRotationX setrotationx6 = (setRotationX) objArr[0];
                int i101 = f60415i;
                int i102 = ((i101 & 89) - (~(i101 | 89))) - 1;
                int i103 = i102 % 128;
                f60416j = i103;
                int i104 = i102 % 2;
                boolean z10 = setrotationx6.f60421e;
                int i105 = (i103 & (-76)) | ((~i103) & 75);
                int i106 = -(-((i103 & 75) << 1));
                int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                f60415i = i107 % 128;
                int i108 = i107 % 2;
                return Boolean.valueOf(z10);
            case 8:
                setRotationX setrotationx7 = (setRotationX) objArr[0];
                int i109 = f60415i;
                int i110 = (((i109 & (-16)) | ((~i109) & 15)) - (~((i109 & 15) << 1))) - 1;
                f60416j = i110 % 128;
                if (i110 % 2 == 0) {
                    setRemoteViewsAdapter.setX(new Object[]{setrotationx7.f60424h}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    throw null;
                }
                setRemoteViewsAdapter.setX(new Object[]{setrotationx7.f60424h}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                int i111 = f60416j + 31;
                f60415i = i111 % 128;
                if (i111 % 2 == 0) {
                    return null;
                }
                int i112 = 17 / 0;
                return null;
            case 9:
                setRotationX setrotationx8 = (setRotationX) objArr[0];
                setRotationY setrotationy2 = (setRotationY) objArr[1];
                int i113 = f60416j;
                int i114 = (i113 & 5) + (i113 | 5);
                f60415i = i114 % 128;
                if (i114 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setrotationy2, "");
                    setrotationx8.f60418b = setrotationy2;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setrotationy2, "");
                setrotationx8.f60418b = setrotationy2;
                int i115 = f60415i;
                int i116 = (i115 ^ 97) + ((i115 & 97) << 1);
                f60416j = i116 % 128;
                int i117 = i116 % 2;
                return null;
            case 10:
                setRotationX setrotationx9 = (setRotationX) objArr[0];
                int i118 = f60415i;
                int i119 = i118 + 123;
                f60416j = i119 % 128;
                int i120 = i119 % 2;
                byte[] bArr3 = setrotationx9.f60424h;
                int i121 = (((i118 ^ 93) | (i118 & 93)) << 1) - (((~i118) & 93) | (i118 & (-94)));
                f60416j = i121 % 128;
                if (i121 % 2 != 0) {
                    return bArr3;
                }
                int i122 = 25 / 0;
                return bArr3;
            default:
                setRotationX setrotationx10 = (setRotationX) objArr[0];
                int i123 = f60416j;
                int i124 = i123 & 57;
                int i125 = ((i123 ^ 57) | i124) << 1;
                int i126 = -((i123 | 57) & (~i124));
                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                f60415i = i127 % 128;
                if (i127 % 2 == 0) {
                    return setrotationx10.f60417a;
                }
                byte[] bArr4 = setrotationx10.f60417a;
                throw null;
        }
        return obj;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 1043258083, -1043258081, System.identityHashCode(this));
    }

    @NotNull
    public final setItemChecked setDividerPadding() {
        return (setItemChecked) setX(new Object[]{this}, 2020716727, -2020716721, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() {
        setX(new Object[]{this}, -124503039, 124503047, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setX(new Object[]{this}, -1008183286, 1008183296, System.identityHashCode(this));
    }

    @NotNull
    public setMaxWidth setOnDragListener() {
        int i10 = f60416j;
        int i11 = i10 + 41;
        f60415i = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 57;
        int i14 = i10 | 57;
        int i15 = (i13 & i14) + (i14 | i13);
        f60415i = i15 % 128;
        int i16 = i15 % 2;
        setMaxWidth setmaxwidth = this.f60423g;
        if (i16 != 0) {
            int i17 = 94 / 0;
        }
        return setmaxwidth;
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setX(new Object[]{this}, -268504199, 268504206, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final getBeepOnFailure setOnLongClickListener() {
        return (getBeepOnFailure) setX(new Object[]{this}, -707146526, 707146527, System.identityHashCode(this));
    }

    @NotNull
    public final setRotationY setY() {
        return (setRotationY) setX(new Object[]{this}, 1897018363, -1897018360, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull setItemChecked setitemchecked) {
        setX(new Object[]{this, setitemchecked}, 1094457166, -1094457162, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setRotationY setrotationy) {
        setX(new Object[]{this, setrotationy}, 1666523036, -1666523027, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setX(new Object[]{this}, -918913871, 918913871, System.identityHashCode(this));
    }
}
