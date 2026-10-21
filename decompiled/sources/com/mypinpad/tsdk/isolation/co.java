package com.mypinpad.tsdk.isolation;

import androidx.core.view.PointerIconCompat;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\r\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/co;", "", "", "setY", "()[B", "a", "[B", "setOnFocusChangeListener", "setDividerPadding", "", "b", "B", "()B", "setCompoundDrawableTintBlendMode", "c", "p0", "", "p1", "<init>", "([BI)V"}, k = 1, mv = {1, 5, 1})
public final class co {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54833e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54834f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final byte setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setY;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final byte[] f54832d = {0, 1};

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.co$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/co$setOnFocusChangeListener;", "", "", "setCompoundDrawableTintBlendMode", "[B", "()[B", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return (byte[]) co.setX(new Object[0], -346554963, 346554965, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f54834f;
        int i11 = i10 & 39;
        int i12 = (i10 | 39) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f54833e = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public co(@NotNull byte[] bArr, int i10) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length < (i10 & 3) + (i10 | 3)) {
            throw new setIndeterminateDrawable(PointerIconCompat.TYPE_ALIAS, setInputExtras.setOnFocusChangeListener(bArr), null, 4, null);
        }
        int i11 = i10 & 1;
        int i12 = ((i10 ^ 1) | i11) << 1;
        int i13 = -((~i11) & (i10 | 1));
        this.setDividerPadding = CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(bArr, new IntRange(i10, (i12 ^ i13) + ((i12 & i13) << 1))));
        byte b10 = bArr[i10 + 2];
        this.setCompoundDrawableTintBlendMode = b10;
        int length = bArr.length;
        int i14 = i10 * (-712);
        int i15 = 2142 ^ i14;
        int i16 = (i14 & 2142) << 1;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        int i18 = ~i10;
        int i19 = ((~i18) & (-4)) | (i18 & 3);
        int i20 = (-4) & i18;
        int i21 = ~((i19 & i20) | (i19 ^ i20));
        int i22 = (-4) & i10;
        int i23 = ((-4) | i10) & (~i22);
        int i24 = (i23 & i22) | (i23 ^ i22);
        int i25 = (i24 | (~i24)) & (~i24);
        int i26 = (i21 & i25) | (i21 ^ i25);
        int i27 = (i18 ^ 3) | (i18 & 3);
        int i28 = i27 & i10;
        int i29 = (i27 | i10) & (~i28);
        int i30 = ~((i29 & i28) | (i29 ^ i28));
        int i31 = ((~i30) & i26) | ((~i26) & i30);
        int i32 = i26 & i30;
        int i33 = i17 - (~(((i32 & i31) | (i31 ^ i32)) * (-713)));
        int i34 = (i33 ^ (-1)) + (i33 << 1);
        int i35 = ~i10;
        int i36 = (i35 ^ 3) | (i35 & 3);
        int i37 = (~((i36 & i10) | (i36 ^ i10))) * 1426;
        int i38 = i34 & i37;
        int i39 = (i38 - (~(-(-((i34 ^ i37) | i38))))) - 1;
        int i40 = ~i10;
        int i41 = -(-((~((i40 & i35) | (i40 ^ i35))) * 713));
        int i42 = i39 ^ i41;
        int i43 = (((i41 & i39) | i42) << 1) - i42;
        int i44 = -(-b10);
        int i45 = i43 & i44;
        int i46 = (i43 | i44) & (~i45);
        int i47 = i45 << 1;
        if (length < (i46 & i47) + (i46 | i47)) {
            throw new setIndeterminateDrawable(PointerIconCompat.TYPE_ALIAS, setInputExtras.setOnFocusChangeListener(bArr), null, 4, null);
        }
        if (b10 > 0) {
            int i48 = (i10 & (-4)) | (i18 & 3);
            int i49 = -(-((i10 & 3) << 1));
            int i50 = (i48 & i49) + (i48 | i49);
            int i51 = b10 * 471;
            int i52 = i50 * 471;
            int i53 = i51 & i52;
            int i54 = (((i51 ^ i52) | i53) << 1) - ((i51 | i52) & (~i53));
            int i55 = ~i50;
            int i56 = (b10 & i55) | ((~b10) & i50);
            int i57 = b10 & i50;
            int i58 = (i54 - (~(((i56 & i57) | (i56 ^ i57)) * (-470)))) - 1;
            int i59 = ~b10;
            int i60 = (i59 & i55) | (i59 ^ i55);
            int i61 = (i60 | (~i60)) & (~i60);
            int i62 = ~((i55 ^ i10) | (i55 & i10));
            int i63 = i61 & i62;
            int i64 = (i61 | i62) & (~i63);
            int i65 = (i64 & i63) | (i64 ^ i63);
            int i66 = i18 & b10;
            int i67 = (~i66) & (i18 | b10);
            int i68 = (i66 & i67) | (i67 ^ i66);
            int i69 = i68 & i50;
            int i70 = (i68 | i50) & (~i69);
            int i71 = (i70 & i69) | (i70 ^ i69);
            int i72 = (i71 | (~i71)) & (~i71);
            int i73 = i65 & i72;
            int i74 = (i65 | i72) & (~i73);
            int i75 = ((i74 & i73) | (i74 ^ i73)) * (-470);
            int i76 = i58 & i75;
            int i77 = (i75 | i58) & (~i76);
            int i78 = i76 << 1;
            int i79 = (i77 & i78) + (i77 | i78);
            int i80 = i55 & b10;
            int i81 = (i55 | b10) & (~i80);
            int i82 = (i81 & i80) | (i81 ^ i80);
            int i83 = (i82 & i18) | ((~i82) & i10);
            int i84 = i82 & i10;
            int i85 = ~((i84 & i83) | (i83 ^ i84));
            int i86 = i35 & (i18 | i10);
            int i87 = i86 & b10;
            int i88 = (b10 | i86) & (~i87);
            int i89 = ~((i88 & i87) | (i88 ^ i87) | i50);
            int i90 = ((~i89) & i85) | ((~i85) & i89);
            int i91 = i89 & i85;
            int i92 = ((i91 & i90) | (i90 ^ i91)) * 470;
            int i93 = i79 & i92;
            int i94 = (i92 ^ i79) | i93;
            int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
            int i96 = -(-(i95 * (-755)));
            int i97 = (755 ^ i96) + ((i96 & 755) << 1);
            int i98 = ~i95;
            int i99 = ~i95;
            int i100 = -(-((~(i98 & (i99 | i95))) * 1512));
            int i101 = ((i97 ^ i100) | (i97 & i100)) << 1;
            int i102 = -((i100 & (~i97)) | ((~i100) & i97));
            int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
            int i104 = ~i99;
            int i105 = ((-1) ^ i95) | i95;
            int i106 = (i105 & i18) | ((~i105) & i10);
            int i107 = i10 & i105;
            int i108 = ~((i107 & i106) | (i106 ^ i107));
            int i109 = i104 & i108;
            int i110 = (i108 | i104) & (~i109);
            int i111 = -(-(((i110 & i109) | (i110 ^ i109)) * (-756)));
            int i112 = i103 ^ i111;
            int i113 = (i111 & i103) << 1;
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            int i115 = ~i95;
            int i116 = (i115 & i95) | (i115 ^ i95);
            int i117 = ((~i18) & i116) | ((~i116) & i18);
            int i118 = i116 & i18;
            int i119 = -(-(((i118 & i117) | (i117 ^ i118)) * 756));
            byteArray = CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(bArr, new IntRange(i50, (i114 ^ i119) + ((i119 & i114) << 1))));
        } else {
            byteArray = new byte[0];
        }
        this.setY = byteArray;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
        int i16 = i11 | i13;
        int i17 = (((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15;
        if (i17 == 1) {
            co coVar = (co) objArr[0];
            int i18 = f54833e;
            int i19 = ((-1) << 1) - ((-1) ^ ((i18 ^ 8) + ((i18 & 8) << 1)));
            f54834f = i19 % 128;
            int i20 = i19 % 2;
            byte[] bArr = coVar.setY;
            int i21 = (i18 & 15) + (i18 | 15);
            f54834f = i21 % 128;
            int i22 = i21 % 2;
            return bArr;
        }
        if (i17 == 2) {
            int i23 = f54834f;
            int i24 = (i23 & 89) + (i23 | 89);
            f54833e = i24 % 128;
            if (i24 % 2 == 0) {
                return f54832d;
            }
            throw null;
        }
        if (i17 == 3) {
            co coVar2 = (co) objArr[0];
            int i25 = f54833e;
            int i26 = (i25 & 119) + (i25 | 119);
            int i27 = i26 % 128;
            f54834f = i27;
            int i28 = i26 % 2;
            byte b10 = coVar2.setCompoundDrawableTintBlendMode;
            int i29 = (i27 & 45) + (i27 | 45);
            f54833e = i29 % 128;
            if (i29 % 2 == 0) {
                return Byte.valueOf(b10);
            }
            throw null;
        }
        if (i17 == 4) {
            co coVar3 = (co) objArr[0];
            int i30 = f54833e - (-1);
            f54834f = i30 % 128;
            int i31 = i30 % 2;
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(coVar3.setDividerPadding, coVar3.setCompoundDrawableTintBlendMode), coVar3.setY);
            int i32 = f54834f + 85;
            f54833e = i32 % 128;
            int i33 = i32 % 2;
            return bArrPlus;
        }
        co coVar4 = (co) objArr[0];
        int i34 = f54834f;
        int i35 = (((i34 & (-90)) | ((~i34) & 89)) - (~(-(-((i34 & 89) << 1))))) - 1;
        int i36 = i35 % 128;
        f54833e = i36;
        int i37 = i35 % 2;
        byte[] bArr2 = coVar4.setDividerPadding;
        int i38 = i36 ^ 59;
        int i39 = (((i36 & 59) | i38) << 1) - i38;
        f54834f = i39 % 128;
        int i40 = i39 % 2;
        return bArr2;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, -1106532120, 1106532121, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        return ((Byte) setX(new Object[]{this}, -1540617402, 1540617405, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, -805717122, 805717122, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 659767438, -659767434, System.identityHashCode(this));
    }

    public static final /* synthetic */ byte[] setX() {
        return (byte[]) setX(new Object[0], -346554963, 346554965, (int) System.currentTimeMillis());
    }
}
