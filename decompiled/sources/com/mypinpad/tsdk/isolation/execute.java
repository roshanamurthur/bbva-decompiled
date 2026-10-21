package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class execute extends LinkedList<Character> implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f55432p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55433q0 = 1;

    /* JADX WARN: Code duplicated, block: B:74:0x0389  */
    /* JADX WARN: Code duplicated, block: B:76:0x0394  */
    /* JADX WARN: Code duplicated, block: B:78:0x03ad  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int size;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
        int i16 = ~i12;
        int i17 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15;
        int iValueOf = -1;
        int i18 = 0;
        switch (i17) {
            case 1:
                execute executeVar = (execute) objArr[0];
                Character ch2 = (Character) objArr[1];
                int i19 = f55433q0;
                int i20 = (i19 & (-126)) | ((~i19) & 125);
                int i21 = (i19 & 125) << 1;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f55432p0 = i22 % 128;
                int i23 = i22 % 2;
                boolean zRemove = super.remove(ch2);
                if (i23 != 0) {
                    int i24 = 94 / 0;
                }
                int i25 = f55432p0 + 10;
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f55433q0 = i26 % 128;
                if (i26 % 2 != 0) {
                    return Boolean.valueOf(zRemove);
                }
                throw null;
            case 2:
                execute executeVar2 = (execute) objArr[0];
                Object obj = objArr[1];
                int i27 = f55432p0;
                int i28 = i27 ^ 95;
                int i29 = ((i27 & 95) << 1) + i28;
                f55433q0 = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 23 / 0;
                    if (!(obj instanceof Character)) {
                        int i31 = ((i27 | 95) << 1) - i28;
                        f55433q0 = i31 % 128;
                        boolean z10 = i31 % 2 == 0;
                        int i32 = (((i27 | 13) << 1) - (~(-((i27 & (-14)) | ((~i27) & 13))))) - 1;
                        f55433q0 = i32 % 128;
                        int i33 = i32 % 2;
                        boolValueOf = Boolean.valueOf(z10);
                    } else {
                        boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{executeVar2, (Character) obj}, -2051040062, 2051040063, System.identityHashCode(executeVar2))).booleanValue();
                        int i34 = f55433q0;
                        int i35 = i34 & 23;
                        int i36 = ((i34 | 23) & (~i35)) + (i35 << 1);
                        f55432p0 = i36 % 128;
                        int i37 = i36 % 2;
                        boolValueOf = Boolean.valueOf(zBooleanValue);
                    }
                } else if (obj instanceof Character) {
                    boolean zBooleanValue2 = ((Boolean) setDividerPadding(new Object[]{executeVar2, (Character) obj}, -2051040062, 2051040063, System.identityHashCode(executeVar2))).booleanValue();
                    int i38 = f55433q0;
                    int i39 = i38 & 23;
                    int i310 = ((i38 | 23) & (~i39)) + (i39 << 1);
                    f55432p0 = i310 % 128;
                    int i311 = i310 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue2);
                } else {
                    int i312 = ((i27 | 95) << 1) - i28;
                    f55433q0 = i312 % 128;
                    if (i312 % 2 == 0) {
                    }
                    int i313 = (((i27 | 13) << 1) - (~(-((i27 & (-14)) | ((~i27) & 13))))) - 1;
                    f55433q0 = i313 % 128;
                    int i314 = i313 % 2;
                    boolValueOf = Boolean.valueOf(z10);
                }
                return boolValueOf;
            case 3:
                execute executeVar3 = (execute) objArr[0];
                Object obj2 = objArr[1];
                int i40 = f55433q0;
                int i41 = (-2) - ((-1) ^ ((i40 & 90) + (i40 | 90)));
                int i42 = i41 % 128;
                f55432p0 = i42;
                if (i41 % 2 != 0) {
                    boolean z11 = obj2 instanceof Character;
                    throw null;
                }
                if (!(obj2 instanceof Character)) {
                    int i43 = i42 & 63;
                    int i44 = (((i42 ^ 63) | i43) << 1) - ((~i43) & (i42 | 63));
                    f55433q0 = i44 % 128;
                    int i45 = i44 % 2;
                    System.identityHashCode(executeVar3);
                    System.identityHashCode(executeVar3);
                } else {
                    int iIntValue = ((Integer) setDividerPadding(new Object[]{executeVar3, (Character) obj2}, -676734930, 676734934, System.identityHashCode(executeVar3))).intValue();
                    int i46 = f55432p0;
                    int i47 = (((i46 & (-126)) | ((~i46) & 125)) - (~(-(-((i46 & 125) << 1))))) - 1;
                    f55433q0 = i47 % 128;
                    if (i47 % 2 == 0) {
                        throw null;
                    }
                    iValueOf = Integer.valueOf(iIntValue);
                }
                return iValueOf;
            case 4:
                execute executeVar4 = (execute) objArr[0];
                Character ch3 = (Character) objArr[1];
                int i48 = f55432p0;
                int i49 = ((i48 | 15) << 1) - (i48 ^ 15);
                f55433q0 = i49 % 128;
                int i50 = i49 % 2;
                int iIndexOf = super.indexOf(ch3);
                if (i50 == 0) {
                    int i51 = 16 / 0;
                }
                int i52 = f55432p0;
                int i53 = i52 & 25;
                int i54 = (i52 | 25) & (~i53);
                int i55 = i53 << 1;
                int i56 = (i54 & i55) + (i54 | i55);
                f55433q0 = i56 % 128;
                int i57 = i56 % 2;
                return Integer.valueOf(iIndexOf);
            case 5:
                execute executeVar5 = (execute) objArr[0];
                int i58 = f55433q0;
                int i59 = (i58 & (-50)) | ((~i58) & 49);
                int i60 = (i58 & 49) << 1;
                int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                f55432p0 = i61 % 128;
                if (i61 % 2 == 0 ? (size = executeVar5.size()) > 0 : (size = executeVar5.size()) > 0) {
                    while (true) {
                        int i62 = i18 | 1;
                        int i63 = (i62 << 1) - (i62 & (~(i18 & 1)));
                        executeVar5.set(i18, Character.valueOf((char) new SecureRandom().nextInt()));
                        if (i63 < size) {
                            i18 = i63;
                        }
                    }
                }
                int i64 = f55433q0;
                int i65 = i64 & 43;
                int i66 = i65 + ((i64 ^ 43) | i65);
                f55432p0 = i66 % 128;
                if (i66 % 2 == 0) {
                    return null;
                }
                throw null;
            case 6:
                execute executeVar6 = (execute) objArr[0];
                int i67 = f55433q0 + 12;
                int i68 = (i67 ^ (-1)) + (i67 << 1);
                f55432p0 = i68 % 128;
                int i69 = i68 % 2;
                int iIntValue2 = ((Integer) setDividerPadding(new Object[]{executeVar6}, 863750827, -863750827, System.identityHashCode(executeVar6))).intValue();
                int i70 = f55433q0 + 30;
                int i71 = (i70 ^ (-1)) + (i70 << 1);
                f55432p0 = i71 % 128;
                int i72 = i71 % 2;
                return Integer.valueOf(iIntValue2);
            case 7:
                execute executeVar7 = (execute) objArr[0];
                Character ch4 = (Character) objArr[1];
                int i73 = f55433q0;
                int i74 = i73 & 29;
                int i75 = -(-((i73 ^ 29) | i74));
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                f55432p0 = i76 % 128;
                int i77 = i76 % 2;
                int iLastIndexOf = super.lastIndexOf(ch4);
                int i78 = f55432p0;
                int i79 = ((((i78 ^ 51) | (i78 & 51)) << 1) - (~(-(((~i78) & 51) | (i78 & (-52)))))) - 1;
                f55433q0 = i79 % 128;
                if (i79 % 2 != 0) {
                    return Integer.valueOf(iLastIndexOf);
                }
                throw null;
            case 8:
                execute executeVar8 = (execute) objArr[0];
                Object obj3 = objArr[1];
                int i80 = f55432p0;
                int i81 = i80 & 81;
                int i82 = ((~i81) & (i80 | 81)) + (i81 << 1);
                f55433q0 = i82 % 128;
                int i83 = i82 % 2;
                if (obj3 instanceof Character) {
                    boolean zBooleanValue3 = ((Boolean) setDividerPadding(new Object[]{executeVar8, (Character) obj3}, 138190215, -138190206, System.identityHashCode(executeVar8))).booleanValue();
                    int i84 = f55433q0;
                    int i85 = i84 ^ 15;
                    int i86 = ((((i84 & 15) | i85) << 1) - (~(-i85))) - 1;
                    f55432p0 = i86 % 128;
                    int i87 = i86 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue3);
                } else {
                    int i88 = i80 | 61;
                    int i89 = (i88 << 1) - (i88 & (~(i80 & 61)));
                    int i90 = i89 % 128;
                    f55433q0 = i90;
                    int i91 = i89 % 2;
                    int i92 = i90 & 65;
                    int i93 = (((i90 | 65) & (~i92)) - (~(-(-(i92 << 1))))) - 1;
                    f55432p0 = i93 % 128;
                    int i94 = i93 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 9:
                execute executeVar9 = (execute) objArr[0];
                Character ch5 = (Character) objArr[1];
                int i95 = f55433q0;
                int i96 = (i95 ^ 99) + ((i95 & 99) << 1);
                f55432p0 = i96 % 128;
                int i97 = i96 % 2;
                boolean zContains = super.contains(ch5);
                int i98 = f55433q0;
                int i99 = (((i98 & (-72)) | ((~i98) & 71)) - (~(-(-((i98 & 71) << 1))))) - 1;
                f55432p0 = i99 % 128;
                int i100 = i99 % 2;
                return Boolean.valueOf(zContains);
            case 10:
                execute executeVar10 = (execute) objArr[0];
                Object obj4 = objArr[1];
                int i101 = f55433q0;
                int i102 = i101 & 77;
                int i103 = i102 + ((i101 ^ 77) | i102);
                int i104 = i103 % 128;
                f55432p0 = i104;
                int i105 = i103 % 2;
                if (obj4 instanceof Character) {
                    int iIntValue3 = ((Integer) setDividerPadding(new Object[]{executeVar10, (Character) obj4}, -1626095179, 1626095186, System.identityHashCode(executeVar10))).intValue();
                    int i106 = f55432p0 + 43;
                    f55433q0 = i106 % 128;
                    if (i106 % 2 == 0) {
                        throw null;
                    }
                    iValueOf = Integer.valueOf(iIntValue3);
                } else {
                    int i107 = (i104 & (-40)) | ((~i104) & 39);
                    int i108 = -(-((i104 & 39) << 1));
                    int i109 = (i107 & i108) + (i107 | i108);
                    f55433q0 = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = ((i104 ^ 121) - (~((i104 & 121) << 1))) - 1;
                    f55433q0 = i111 % 128;
                    if (i111 % 2 == 0) {
                        throw null;
                    }
                }
                return iValueOf;
            case 11:
                execute executeVar11 = (execute) objArr[0];
                int i112 = f55432p0;
                int i113 = (((i112 | 20) << 1) - (i112 ^ 20)) - 1;
                f55433q0 = i113 % 128;
                int i114 = i113 % 2;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(executeVar11.size());
                Iterator<Character> it = executeVar11.iterator();
                int i115 = f55433q0;
                int i116 = i115 ^ 31;
                int i117 = ((i115 & 31) | i116) << 1;
                int i118 = -i116;
                int i119 = (i117 & i118) + (i117 | i118);
                f55432p0 = i119 % 128;
                int i120 = i119 % 2;
                while (it.hasNext()) {
                    int i121 = f55432p0;
                    int i122 = (i121 & (-54)) | ((~i121) & 53);
                    int i123 = -(-((i121 & 53) << 1));
                    int i124 = (i122 & i123) + (i123 | i122);
                    f55433q0 = i124 % 128;
                    int i125 = i124 % 2;
                    byteBufferAllocate.put((byte) it.next().charValue());
                    int i126 = f55433q0;
                    int i127 = i126 ^ 27;
                    int i128 = (((i126 & 27) | i127) << 1) - i127;
                    f55432p0 = i128 % 128;
                    int i129 = i128 % 2;
                }
                byte[] bArrArray = byteBufferAllocate.array();
                Intrinsics.checkNotNullExpressionValue(bArrArray, "");
                int i130 = f55433q0;
                int i131 = ((i130 ^ 123) | (i130 & 123)) << 1;
                int i132 = -(((~i130) & 123) | (i130 & (-124)));
                int i133 = (i131 & i132) + (i132 | i131);
                f55432p0 = i133 % 128;
                if (i133 % 2 == 0) {
                    return bArrArray;
                }
                int i134 = 22 / 0;
                return bArrArray;
            default:
                execute executeVar12 = (execute) objArr[0];
                int i135 = f55432p0 + 3;
                f55433q0 = i135 % 128;
                if (i135 % 2 != 0) {
                    return Integer.valueOf(super.size());
                }
                super.size();
                throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setDividerPadding(new Object[]{this}, -928336311, 928336316, System.identityHashCode(this));
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean contains(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 2143899011, -2143899003, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ((Integer) setDividerPadding(new Object[]{this, obj}, -241267864, 241267867, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ((Integer) setDividerPadding(new Object[]{this, obj}, -654730, 654740, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean remove(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1793782179, -1793782177, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, -834355004, 834355015, System.identityHashCode(this));
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        return ((Integer) setDividerPadding(new Object[]{this}, 359430001, -359429995, System.identityHashCode(this))).intValue();
    }
}
