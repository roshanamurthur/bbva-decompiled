package com.mypinpad.tsdk.isolation;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class acb implements acp {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52376t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52377u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final aby f52378p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Inflater f52379q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f52380r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f52381s0;

    public acb(@NotNull aby abyVar, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(abyVar, "");
        Intrinsics.checkNotNullParameter(inflater, "");
        this.f52378p0 = abyVar;
        this.f52379q0 = inflater;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i11);
        int i17 = ~i11;
        int i18 = i14 | i17;
        int i19 = ((i10 | i11) * 184) + (((~(i13 | i17)) | (~i15) | (~i18)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183));
        if (i19 == 1) {
            acb acbVar = (acb) objArr[0];
            abx abxVar = (abx) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i20 = f52377u0 + 68;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f52376t0 = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(abxVar, "");
            if (jLongValue < 0) {
                int i23 = f52376t0;
                int i24 = i23 & 115;
                int i25 = (i23 ^ 115) | i24;
                int i26 = (i24 & i25) + (i25 | i24);
                f52377u0 = i26 % 128;
                int i27 = i26 % 2;
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
            }
            int i28 = f52377u0;
            int i29 = i28 ^ 97;
            int i30 = (i28 & 97) << 1;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            f52376t0 = i31 % 128;
            int i32 = i31 % 2;
            int i33 = i28 & 89;
            int i34 = (~i33) & (i28 | 89);
            int i35 = -(-(i33 << 1));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f52376t0 = i36 % 128;
            int i37 = i36 % 2;
            if (!(!acbVar.f52381s0)) {
                int i38 = ((i28 ^ 10) + ((i28 & 10) << 1)) - 1;
                f52376t0 = i38 % 128;
                int i39 = i38 % 2;
                throw new IllegalStateException("closed".toString());
            }
            int i40 = i28 ^ 67;
            int i41 = ((i28 & 67) | i40) << 1;
            int i42 = -i40;
            int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
            int i44 = i43 % 128;
            f52376t0 = i44;
            int i45 = i43 % 2;
            if (jLongValue == 0) {
                int i46 = (-2) - ((i44 + 66) ^ (-1));
                f52377u0 = i46 % 128;
                int i47 = i46 % 2;
                int i48 = i44 & 31;
                int i49 = (i48 - (~((i44 ^ 31) | i48))) - 1;
                f52377u0 = i49 % 128;
                int i50 = i49 % 2;
            } else {
                try {
                    acj x4 = abxVar.setX(1);
                    int i51 = -x4.setX;
                    int iMin = (int) Math.min(jLongValue, (((i51 ^ 8192) | (i51 & 8192)) << 1) - ((i51 & (-8193)) | ((~i51) & 8192)));
                    ((Boolean) setDividerPadding(new Object[]{acbVar}, 954650402, -954650397, System.identityHashCode(acbVar))).booleanValue();
                    int iInflate = acbVar.f52379q0.inflate(x4.setOnFocusChangeListener, x4.setX, iMin);
                    setDividerPadding(new Object[]{acbVar}, -2036457925, 2036457929, System.identityHashCode(acbVar));
                    if (iInflate > 0) {
                        int i52 = f52376t0;
                        int i53 = i52 ^ 91;
                        int i54 = ((i52 & 91) | i53) << 1;
                        int i55 = -i53;
                        int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                        f52377u0 = i56 % 128;
                        int i57 = i56 % 2;
                        int i58 = x4.setX;
                        System.identityHashCode(acbVar);
                        int i59 = iInflate * 630;
                        int i60 = i58 * (-628);
                        int i61 = i59 & i60;
                        int i62 = (i61 - (~(-(-((i59 ^ i60) | i61))))) - 1;
                        int i63 = ~i58;
                        int i64 = i63 * (-629);
                        int i65 = (i62 & i64) + (i64 | i62);
                        int i66 = ~iInflate;
                        int i67 = ((~i63) & i66) | ((~i66) & i63);
                        int i68 = i63 & i66;
                        int i69 = -(-((~((i68 & i67) | (i67 ^ i68))) * (-629)));
                        int i70 = i65 & i69;
                        int i71 = -(-((i69 ^ i65) | i70));
                        int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                        int i73 = i58 & i66;
                        int i74 = (i58 | i66) & (~i73);
                        int i75 = -(-(((i73 & i74) | (i74 ^ i73)) * 629));
                        x4.setX = (i72 ^ i75) + ((i75 & i72) << 1);
                        long j10 = iInflate;
                        abxVar.setX(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j10);
                        int i76 = f52376t0;
                        int i77 = ((i76 & 52) + (i76 | 52)) - 1;
                        f52377u0 = i77 % 128;
                        int i78 = i77 % 2;
                        objValueOf = Long.valueOf(j10);
                    } else {
                        if (x4.setCompoundDrawableTintBlendMode == x4.setX) {
                            int i79 = f52377u0 + 3;
                            f52376t0 = i79 % 128;
                            if (i79 % 2 != 0) {
                                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                                ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                                int i80 = 4 / 0;
                            } else {
                                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                                ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                            }
                        }
                        int i81 = f52376t0;
                        int i82 = i81 & 59;
                        int i83 = (((i81 ^ 59) | i82) << 1) - ((i81 | 59) & (~i82));
                        f52377u0 = i83 % 128;
                        if (i83 % 2 == 0) {
                            throw null;
                        }
                    }
                } catch (DataFormatException e5) {
                    throw new IOException(e5);
                }
            }
            objValueOf = 0L;
        } else if (i19 == 2) {
            acb acbVar2 = (acb) objArr[0];
            abx abxVar2 = (abx) objArr[1];
            long jLongValue2 = ((Number) objArr[2]).longValue();
            int i84 = f52376t0;
            int i85 = ((i84 ^ 120) + ((i84 & 120) << 1)) - 1;
            f52377u0 = i85 % 128;
            if (i85 % 2 == 0) {
                Intrinsics.checkNotNullParameter(abxVar2, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(abxVar2, "");
            while (true) {
                long jLongValue3 = ((Long) setDividerPadding(new Object[]{acbVar2, abxVar2, Long.valueOf(jLongValue2)}, 1915856680, -1915856679, System.identityHashCode(acbVar2))).longValue();
                if (jLongValue3 <= 0) {
                    if (acbVar2.f52379q0.finished()) {
                        break;
                    }
                    int i86 = f52377u0;
                    int i87 = (i86 ^ 32) + ((i86 & 32) << 1);
                    int i88 = (i87 ^ (-1)) + (i87 << 1);
                    f52376t0 = i88 % 128;
                    int i89 = i88 % 2;
                    if (acbVar2.f52379q0.needsDictionary()) {
                        break;
                    }
                    if (acbVar2.f52378p0.setX()) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } else {
                    int i90 = f52377u0;
                    int i91 = i90 & 111;
                    int i92 = (((i90 | 111) & (~i91)) - (~(-(-(i91 << 1))))) - 1;
                    f52376t0 = i92 % 128;
                    if (i92 % 2 != 0) {
                        int i93 = 31 / 0;
                    }
                    objValueOf = Long.valueOf(jLongValue3);
                }
            }
            int i94 = f52376t0;
            int i95 = i94 & 123;
            int i96 = ((i94 ^ 123) | i95) << 1;
            int i97 = -((i94 | 123) & (~i95));
            int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
            f52377u0 = i98 % 128;
            if (i98 % 2 == 0) {
                throw null;
            }
            objValueOf = -1L;
        } else if (i19 == 3) {
            acb acbVar3 = (acb) objArr[0];
            int i99 = f52377u0;
            int i100 = i99 & 33;
            int i101 = i99 | 33;
            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
            f52376t0 = i102 % 128;
            int i103 = i102 % 2;
            objValueOf = acbVar3.f52378p0.setY();
            int i104 = f52376t0 + 91;
            f52377u0 = i104 % 128;
            if (i104 % 2 == 0) {
                throw null;
            }
        } else {
            if (i19 == 4) {
                acb acbVar4 = (acb) objArr[0];
                int i105 = f52376t0;
                int i106 = (i105 & 101) + (i105 | 101);
                int i107 = i106 % 128;
                f52377u0 = i107;
                int i108 = i106 % 2;
                int i109 = acbVar4.f52380r0;
                if (i109 == 0) {
                    int i110 = ((i107 ^ 21) | (i107 & 21)) << 1;
                    int i111 = -(((~i107) & 21) | (i107 & (-22)));
                    int i112 = (i110 & i111) + (i110 | i111);
                    f52376t0 = i112 % 128;
                    if (i112 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i113 = -(~(-acbVar4.f52379q0.getRemaining()));
                int i114 = ((i109 & i113) + (i113 | i109)) - 1;
                int i115 = acbVar4.f52380r0;
                int i116 = -i114;
                acbVar4.f52380r0 = ((((~i116) & i115) | ((~i115) & i116)) - (~(-(-((i115 & i116) << 1))))) - 1;
                acbVar4.f52378p0.setNavigationOnClickListener(i114);
                int i117 = f52377u0;
                int i118 = i117 & 71;
                int i119 = ((i117 ^ 71) | i118) << 1;
                int i120 = -((i117 | 71) & (~i118));
                int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                f52376t0 = i121 % 128;
                if (i121 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (i19 != 5) {
                acb acbVar5 = (acb) objArr[0];
                int i122 = f52376t0;
                int i123 = i122 & 31;
                int i124 = (i123 - (~((31 ^ i122) | i123))) - 1;
                int i125 = i124 % 128;
                f52377u0 = i125;
                int i126 = i124 % 2;
                if (acbVar5.f52381s0) {
                    int i127 = (i125 ^ 5) + ((5 & i125) << 1);
                    f52376t0 = i127 % 128;
                    if (i127 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                acbVar5.f52379q0.end();
                acbVar5.f52381s0 = true;
                acbVar5.f52378p0.close();
                int i128 = f52376t0;
                int i129 = ((i128 & 90) + (i128 | 90)) - 1;
                f52377u0 = i129 % 128;
                int i130 = i129 % 2;
                return null;
            }
            acb acbVar6 = (acb) objArr[0];
            int i131 = f52377u0;
            int i132 = (i131 & (-104)) | ((~i131) & 103);
            int i133 = (i131 & 103) << 1;
            int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
            f52376t0 = i134 % 128;
            if (i134 % 2 != 0) {
                acbVar6.f52379q0.needsInput();
                throw null;
            }
            if (!acbVar6.f52379q0.needsInput()) {
                int i135 = f52376t0;
                int i136 = ((((i135 ^ 97) | (i135 & 97)) << 1) - (~(-((i135 & (-98)) | ((~i135) & 97))))) - 1;
                f52377u0 = i136 % 128;
                boolean z10 = !(i136 % 2 != 0);
                int i137 = ((i135 & 80) + (i135 | 80)) - 1;
                f52377u0 = i137 % 128;
                if (i137 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.valueOf(z10);
            } else {
                aby abyVar = acbVar6.f52378p0;
                if (abyVar.setX()) {
                    int i138 = f52377u0;
                    int i139 = i138 & 89;
                    int i140 = i138 | 89;
                    int i141 = (i139 & i140) + (i140 | i139);
                    f52376t0 = i141 % 128;
                    int i142 = i141 % 2;
                    System.identityHashCode(acbVar6);
                    System.identityHashCode(acbVar6);
                    objValueOf = Boolean.TRUE;
                } else {
                    acj acjVar = abyVar.setOnFocusChangeListener().setDividerPadding;
                    Intrinsics.checkNotNull(acjVar);
                    int i143 = acjVar.setX;
                    int i144 = acjVar.setCompoundDrawableTintBlendMode;
                    int i145 = i143 - i144;
                    acbVar6.f52380r0 = i145;
                    acbVar6.f52379q0.setInput(acjVar.setOnFocusChangeListener, i144, i145);
                    int i146 = f52377u0;
                    int i147 = (i146 & (-58)) | ((~i146) & 57);
                    int i148 = -(-((i146 & 57) << 1));
                    int i149 = (i147 ^ i148) + ((i148 & i147) << 1);
                    f52376t0 = i149 % 128;
                    if (i149 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
            }
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        setDividerPadding(new Object[]{this}, 1463424498, -1463424498, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    @NotNull
    public final acq setY() {
        return (acq) setDividerPadding(new Object[]{this}, -198120637, 198120640, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public final long setY(@NotNull abx abxVar, long j10) throws IOException {
        return ((Long) setDividerPadding(new Object[]{this, abxVar, Long.valueOf(j10)}, -1920763527, 1920763529, System.identityHashCode(this))).longValue();
    }
}
