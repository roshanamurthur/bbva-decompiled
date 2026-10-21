package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u000e8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/dp;", "Lcom/mypinpad/tsdk/i/do;", "", "b", "[B", "setOnFocusChangeListener", "()[B", "", "c", "B", "setCompoundDrawableTintBlendMode", "()B", "d", "setDividerPadding", "", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "()I", "setY", "p0", "<init>", "([B)V"}, k = 1, mv = {1, 5, 1})
public abstract class dp extends Cdo {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55231f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55232g = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final byte setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.dp$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/dp$setDividerPadding;", "", "", "p0", "", "setY", "([B)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55237a;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr = (byte[]) objArr[0];
            int i13 = f55237a;
            int i14 = i13 & 95;
            int i15 = (i14 - (~((i13 ^ 95) | i14))) - 1;
            int i16 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            if (bArr == null) {
                int i17 = i16 & 63;
                int i18 = -(-((i16 ^ 63) | i17));
                int i19 = (i17 & i18) + (i17 | i18);
                f55237a = i19 % 128;
                int i20 = i19 % 2;
            } else if (bArr.length == 0) {
                int i21 = i16 & 5;
                int i22 = i21 + ((i16 ^ 5) | i21);
                f55237a = i22 % 128;
                int i23 = i22 % 2;
                int i24 = ((i16 | 43) << 1) - (i16 ^ 43);
                f55237a = i24 % 128;
                int i25 = i24 % 2;
                int i110 = i16 & 63;
                int i111 = -(-((i16 ^ 63) | i110));
                int i112 = (i110 & i111) + (i110 | i111);
                f55237a = i112 % 128;
                int i26 = i112 % 2;
            } else {
                int i27 = i16 + 107;
                f55237a = i27 % 128;
                int i28 = i27 % 2;
                byte b10 = bArr[0];
                int i29 = b10 & 1;
                int i30 = (b10 ^ 1) | i29;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i32 = -(-(i31 * 131));
                int i33 = (-129) & i32;
                int i34 = (((-129) ^ i32) | i33) << 1;
                int i35 = -((i32 | (-129)) & (~i33));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                int i37 = ~i31;
                int i38 = ~iCurrentTimeMillis;
                int i39 = (i37 ^ i38) | (i37 & i38);
                int i40 = (i39 & 1) | (i39 ^ 1);
                int i41 = ~i40;
                int i42 = -(-(((i40 | i41) & i41) * 130));
                int i43 = ((((i36 ^ i42) | (i36 & i42)) << 1) - (~(-(((~i36) & i42) | ((~i42) & i36))))) - 1;
                int i44 = i37 & 1;
                int i45 = -(-((~(i44 | ((~i44) & (i37 | 1)))) * (-260)));
                int i46 = (i43 & i45) + (i45 | i43);
                int i47 = ((-2) & i37) | (i31 & 1);
                int i48 = (-2) & i31;
                int i49 = ~((i48 & i47) | (i47 ^ i48));
                int i50 = i37 & (i31 | i37);
                int i51 = i50 & 1;
                int i52 = (i50 | 1) & (~i51);
                int i53 = (i52 & i51) | (i52 ^ i51);
                int i54 = (i53 & i38) | ((~i53) & iCurrentTimeMillis);
                int i55 = iCurrentTimeMillis & i53;
                int i56 = ~((i55 & i54) | (i54 ^ i55));
                int i57 = i49 ^ i56;
                int i58 = i56 & i49;
                int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * 130));
                int i60 = i46 & i59;
                int i61 = -(-(i59 | i46));
                int i62 = (i60 & i61) + (i61 | i60);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i63 = i62 * (-215);
                int i64 = ((~i63) & 1736) | (i63 & (-1737));
                int i65 = (i63 & 1736) << 1;
                int i66 = (i64 & i65) + (i65 | i64);
                int i67 = (iCurrentTimeMillis2 ^ 8) | (iCurrentTimeMillis2 & 8);
                int i68 = ~i67;
                int i69 = (i66 - (~(-(~(-(-(((i67 | i68) & i68) * 216))))))) - 2;
                int i70 = ~i62;
                int i71 = (i70 & 8) | (i70 ^ 8);
                int i72 = ~iCurrentTimeMillis2;
                int i73 = i71 & i72;
                int i74 = (i71 | i72) & (~i73);
                int i75 = -(-(((i74 & i73) | (i74 ^ i73)) * (-216)));
                int i76 = ((i69 | i75) << 1) - (i75 ^ i69);
                int i77 = i72 ^ 8;
                int i78 = i72 & 8;
                int i79 = ~((i78 & i77) | (i77 ^ i78));
                int i80 = -(-(((i79 & i62) | (i62 ^ i79)) * 216));
                if (bArr.length == (i76 & i80) + (i80 | i76) + 20) {
                    int i81 = f55237a;
                    int i82 = i81 & 19;
                    int i83 = i82 + ((i81 ^ 19) | i82);
                    int i84 = i83 % 128;
                    return Boolean.valueOf(i83 % 2 != 0);
                }
                int i85 = f55237a;
                int i86 = ((((i85 ^ 65) | (i85 & 65)) << 1) - (~(-(((~i85) & 65) | (i85 & (-66)))))) - 1;
                int i87 = i86 % 128;
                if (i86 % 2 == 0) {
                    throw null;
                }
            }
            return Boolean.FALSE;
        }

        public static boolean setY(@Nullable byte[] p4) {
            return ((Boolean) setDividerPadding(new Object[]{p4}, 544999026, -544999026, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    static {
        int i10 = f55232g;
        int i11 = ((((i10 ^ 13) | (i10 & 13)) << 1) - (~(-(((~i10) & 13) | (i10 & (-14)))))) - 1;
        f55231f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public dp(@Nullable byte[] bArr) {
        super(bArr);
        int length = setY().length;
        int i10 = (length & (-2)) | ((~length) & 1);
        int i11 = -(-((length & 1) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        Intrinsics.checkNotNull(bArr);
        this.setCompoundDrawableTintBlendMode = bArr[i12];
        int i13 = ((i12 & 2) + (i12 | 2)) - 1;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i14 = 2182 - (~(-(~(i13 * (-271)))));
        int i15 = (~i13) & ((~i13) | i13);
        int i16 = (-9) & i15;
        int i17 = ((i15 | (-9)) & (~i16)) | i16;
        int i18 = ~iCurrentTimeMillis;
        int i19 = ~iCurrentTimeMillis;
        int i20 = i18 & (i19 | iCurrentTimeMillis);
        int i21 = i17 ^ i20;
        int i22 = i17 & i20;
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = (i23 | (~i23)) & (~i23);
        int i25 = i13 & 8;
        int i26 = i25 | ((~i25) & (i13 | 8));
        int i27 = (i26 & i19) | ((~i26) & iCurrentTimeMillis);
        int i28 = i26 & iCurrentTimeMillis;
        int i29 = ~((i28 & i27) | (i27 ^ i28));
        int i30 = -(~(((i24 & i29) | ((~i29) & i24) | ((~i24) & i29)) * (-272)));
        int i31 = ((i14 ^ i30) + ((i14 & i30) << 1)) - 1;
        int i32 = (-9) & i13;
        int i33 = ~(i32 | ((~i32) & ((-9) | i13)));
        int i34 = (-9) & iCurrentTimeMillis;
        int i35 = ((-9) | iCurrentTimeMillis) & (~i34);
        int i36 = (i34 & i35) | (i35 ^ i34);
        int i37 = (i36 | (~i36)) & (~i36);
        int i38 = i33 ^ i37;
        int i39 = i33 & i37;
        int i40 = ((i39 & i38) | (i38 ^ i39)) * (-272);
        int i41 = i31 & i40;
        int i42 = (i41 - (~(-(-((i40 ^ i31) | i41))))) - 1;
        int i43 = ~((iCurrentTimeMillis & 8) | (i19 & 8) | (iCurrentTimeMillis & (-9)));
        int i44 = i13 & i43;
        int i45 = (i43 | i13) & (~i44);
        int i46 = -(~(((i45 & i44) | (i45 ^ i44)) * 272));
        this.setOnFocusChangeListener = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i13, ((i42 & i46) + (i46 | i42)) - 1));
        int i47 = i13 & 100;
        int i48 = (((i13 | 100) & (~i47)) - (~(i47 << 1))) - 1;
        int i49 = i48 & (-92);
        int i50 = (((i48 | (-92)) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i51 = -(-(i50 * 569));
        int i52 = 11380 | i51;
        int i53 = ((i52 << 1) - (~(-((~(i51 & 11380)) & i52)))) - 1;
        int i54 = ~i50;
        int i55 = ~i50;
        int i56 = (i55 | i50) & i54;
        int i57 = ((~i56) & (-21)) | (i56 & 20);
        int i58 = (-21) & i56;
        int i59 = ~((i57 & i58) | (i57 ^ i58));
        int i60 = ~iCurrentTimeMillis2;
        int i61 = ~(((-21) ^ i60) | ((-21) & i60));
        int i62 = i59 & i61;
        int i63 = (i59 | i61) & (~i62);
        int i64 = (i63 & i62) | (i63 ^ i62);
        int i65 = ~iCurrentTimeMillis2;
        int i66 = i54 | i65;
        int i67 = (i66 | (~i66)) & (~i66);
        int i68 = ((i67 & i64) | (i64 ^ i67)) * (-1136);
        int i69 = ((i53 & i68) - (~(-(-(i68 | i53))))) - 1;
        int i70 = (-21) & iCurrentTimeMillis2;
        int i71 = (~i70) & ((-21) | iCurrentTimeMillis2);
        int i72 = (i70 & i71) | (i71 ^ i70);
        int i73 = (i72 | (~i72)) & (~i72);
        int i74 = i56 & iCurrentTimeMillis2;
        int i75 = (i56 | iCurrentTimeMillis2) & (~i74);
        int i76 = (i75 & i74) | (i75 ^ i74);
        int i77 = (i76 | (~i76)) & (~i76);
        int i78 = i73 & i77;
        int i79 = (i73 | i77) & (~i78);
        int i80 = (i79 & i78) | (i79 ^ i78);
        int i81 = (i60 & (-21)) | ((~i60) & 20);
        int i82 = i60 & 20;
        int i83 = (i81 & i82) | (i81 ^ i82);
        int i84 = i83 & i50;
        int i85 = (i83 | i50) & (~i84);
        int i86 = ~((i85 & i84) | (i85 ^ i84));
        int i87 = i80 ^ i86;
        int i88 = i80 & i86;
        int i89 = -(~(-(-(((i88 & i87) | (i87 ^ i88)) * (-568)))));
        int i90 = (((i69 | i89) << 1) - (i89 ^ i69)) - 1;
        int i91 = (i65 & (-21)) | ((~i65) & 20);
        int i92 = i65 & 20;
        int i93 = ~((i91 & i92) | (i91 ^ i92));
        int i94 = ~((i65 ^ i50) | (i65 & i50));
        int i95 = i93 ^ i94;
        int i96 = i93 & i94;
        int i97 = (i96 & i95) | (i95 ^ i96);
        int i98 = (-21) & i55;
        int i99 = (~i98) & ((-21) | i55);
        int i100 = (i98 & i99) | (i99 ^ i98);
        int i101 = i100 ^ iCurrentTimeMillis2;
        int i102 = iCurrentTimeMillis2 & i100;
        int i103 = ~((i102 & i101) | (i101 ^ i102));
        int i104 = i97 & i103;
        int i105 = (i103 | i97) & (~i104);
        int i106 = ((i105 & i104) | (i105 ^ i104)) * 568;
        int i107 = i90 & i106;
        this.setDividerPadding = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i50, ((((i90 ^ i106) | i107) << 1) - (~(-((i106 | i90) & (~i107))))) - 1));
        int i108 = (i50 & (-33)) | (i55 & 32);
        int i109 = (i50 & 32) << 1;
        int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
        int i111 = i110 ^ (-12);
        int i112 = ((i110 & (-12)) | i111) << 1;
        int i113 = -i111;
        this.setY = (i112 & i113) + (i113 | i112);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            dp dpVar = (dp) objArr[0];
            int i17 = f55232g;
            int i18 = ((i17 ^ 111) | (i17 & 111)) << 1;
            int i19 = -(((~i17) & 111) | (i17 & (-112)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            f55231f = i21;
            int i22 = i20 % 2;
            byte[] bArr = dpVar.setDividerPadding;
            int i23 = i21 & 123;
            int i24 = (i21 | 123) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            f55232g = i26 % 128;
            int i27 = i26 % 2;
            return bArr;
        }
        if (i16 == 2) {
            dp dpVar2 = (dp) objArr[0];
            int i28 = f55232g;
            int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
            int i30 = i29 % 128;
            f55231f = i30;
            int i31 = i29 % 2;
            byte[] bArr2 = dpVar2.setOnFocusChangeListener;
            int i32 = i30 + 7;
            f55232g = i32 % 128;
            int i33 = i32 % 2;
            return bArr2;
        }
        if (i16 != 3) {
            dp dpVar3 = (dp) objArr[0];
            int i34 = f55231f;
            int i35 = ((i34 ^ 102) + ((i34 & 102) << 1)) - 1;
            int i36 = i35 % 128;
            f55232g = i36;
            int i37 = i35 % 2;
            int i38 = dpVar3.setY;
            int i39 = (i36 & 55) + (i36 | 55);
            f55231f = i39 % 128;
            int i40 = i39 % 2;
            return Integer.valueOf(i38);
        }
        dp dpVar4 = (dp) objArr[0];
        int i41 = (-2) - ((f55232g + 98) ^ (-1));
        int i42 = i41 % 128;
        f55231f = i42;
        int i43 = i41 % 2;
        byte b10 = dpVar4.setCompoundDrawableTintBlendMode;
        int i44 = ((i42 ^ 65) | (i42 & 65)) << 1;
        int i45 = -(((~i42) & 65) | (i42 & (-66)));
        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
        f55232g = i46 % 128;
        if (i46 % 2 != 0) {
            return Byte.valueOf(b10);
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setY(new Object[]{this}, -2037836328, 2037836331, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, 1264143770, -1264143769, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.Cdo
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, -97068492, 97068494, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final int setX() {
        return ((Integer) setY(new Object[]{this}, 1911016683, -1911016683, System.identityHashCode(this))).intValue();
    }
}
