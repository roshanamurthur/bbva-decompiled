package com.mypinpad.tsdk.isolation;

import androidx.appcompat.widget.o1;
import androidx.compose.animation.core.AnimationKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class abx implements abv, aby, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52357q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52358r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f52359p0;

    @JvmField
    @Nullable
    public acj setDividerPadding;

    public static final class setX implements Closeable {
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            ((setX) objArr[0]).getClass();
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, 1925503188, -1925503188, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ abx B(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Charset charset = (Charset) objArr[4];
        int i10 = f52357q0;
        int i11 = i10 & 49;
        int i12 = (i10 | 49) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f52358r0 = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charset, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (iIntValue < 0) {
            int i15 = f52358r0 + 72;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f52357q0 = i16 % 128;
            int i17 = i16 % 2;
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(iIntValue)).toString());
        }
        int i18 = f52358r0;
        int i19 = (((i18 | 118) << 1) - (i18 ^ 118)) - 1;
        f52357q0 = i19 % 128;
        int i20 = i19 % 2;
        if (iIntValue2 >= iIntValue) {
            int i21 = i18 & 109;
            int i22 = i21 + ((i18 ^ 109) | i21);
            f52357q0 = i22 % 128;
            boolean z10 = i22 % 2 == 0;
            int i23 = i18 & 75;
            int i24 = (i23 - (~((i18 ^ 75) | i23))) - 1;
            f52357q0 = i24 % 128;
            int i25 = i24 % 2;
            if (z10) {
                if (iIntValue2 <= str.length()) {
                    int i26 = f52357q0;
                    int i27 = i26 & 19;
                    int i28 = -(-((i26 ^ 19) | i27));
                    int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                    f52358r0 = i29 % 128;
                    boolean z11 = i29 % 2 != 0;
                    int i30 = (i26 & (-62)) | (61 & (~i26));
                    int i31 = (i26 & 61) << 1;
                    int i32 = (i30 & i31) + (i31 | i30);
                    f52358r0 = i32 % 128;
                    int i33 = i32 % 2;
                    if (z11) {
                        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                            int i34 = f52358r0;
                            int i35 = (((i34 ^ 97) | (i34 & 97)) << 1) - (((~i34) & 97) | (i34 & (-98)));
                            f52357q0 = i35 % 128;
                            if (i35 % 2 != 0) {
                                abxVar.setY(str, iIntValue, iIntValue2);
                                throw null;
                            }
                            abx y7 = abxVar.setY(str, iIntValue, iIntValue2);
                            int i36 = f52358r0;
                            int i37 = (((i36 & (-34)) | ((~i36) & 33)) - (~((i36 & 33) << 1))) - 1;
                            f52357q0 = i37 % 128;
                            if (i37 % 2 != 0) {
                                int i38 = 40 / 0;
                            }
                            return y7;
                        }
                        String strSubstring = str.substring(iIntValue, iIntValue2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        if (strSubstring == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        byte[] bytes = strSubstring.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        abx abxVar2 = (abx) setOnFocusChangeListener(new Object[]{abxVar, bytes, 0, Integer.valueOf(bytes.length)}, 1169071493, -1169071470, 0);
                        int i39 = f52358r0;
                        int i40 = (-2) - (((i39 & 50) + (i39 | 50)) ^ (-1));
                        f52357q0 = i40 % 128;
                        if (i40 % 2 == 0) {
                            return abxVar2;
                        }
                        throw null;
                    }
                } else {
                    int i41 = f52357q0;
                    int i42 = i41 | 45;
                    int i43 = (i42 << 1) - ((~(i41 & 45)) & i42);
                    f52358r0 = i43 % 128;
                    int i44 = i43 % 2;
                }
                StringBuilder sbC = o1.c("endIndex > string.length: ", iIntValue2, " > ");
                sbC.append(str.length());
                throw new IllegalArgumentException(sbC.toString().toString());
            }
        } else {
            int i45 = i18 & 109;
            int i46 = (((i18 ^ 109) | i45) << 1) - ((~i45) & (i18 | 109));
            f52357q0 = i46 % 128;
            int i47 = i46 % 2;
        }
        StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
        sb2.append(iIntValue2);
        sb2.append(" < ");
        sb2.append(iIntValue);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Code duplicated, block: B:84:0x027d  */
    /* JADX WARN: Code duplicated, block: B:87:0x028b  */
    /* JADX WARN: Code duplicated, block: B:88:0x028f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0298  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b0  */
    public static /* synthetic */ abx C(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        boolean z10;
        int i10;
        int i11;
        abx abxVar = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i12 = f52358r0;
        int i13 = i12 & 73;
        int i14 = i13 + ((i12 ^ 73) | i13);
        int i15 = i14 % 128;
        f52357q0 = i15;
        int i16 = i14 % 2;
        int i17 = 5;
        if (jLongValue == 0) {
            int i18 = ((i15 ^ 5) | (i15 & 5)) << 1;
            int i19 = -((i15 & (-6)) | ((~i15) & 5));
            int i20 = (i18 & i19) + (i18 | i19);
            f52358r0 = i20 % 128;
            int i21 = i20 % 2;
            abx abxVar2 = (abx) setOnFocusChangeListener(new Object[]{abxVar, 48}, 1433477211, -1433477201, 48);
            int i22 = f52358r0;
            int i23 = (i22 & (-26)) | ((~i22) & 25);
            int i24 = -(-((i22 & 25) << 1));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f52357q0 = i25 % 128;
            int i26 = i25 % 2;
            return abxVar2;
        }
        if (jLongValue < 0) {
            int i27 = (i12 ^ 79) + ((i12 & 79) << 1);
            f52357q0 = i27 % 128;
            int i28 = i27 % 2;
            jLongValue = -jLongValue;
            if (jLongValue < 0) {
                int i29 = ((i12 | 112) << 1) - (i12 ^ 112);
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f52357q0 = i30 % 128;
                int i31 = i30 % 2;
                abx abxVar3 = (abx) setOnFocusChangeListener(new Object[]{abxVar, "-9223372036854775808"}, -2069576566, 2069576590, System.identityHashCode(abxVar));
                int i32 = f52358r0;
                int i33 = (i32 ^ 5) + ((i32 & 5) << 1);
                f52357q0 = i33 % 128;
                int i34 = i33 % 2;
                return abxVar3;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (jLongValue < 100000000) {
            int i35 = f52357q0;
            int i36 = i35 + 117;
            int i37 = i36 % 128;
            f52358r0 = i37;
            if (i36 % 2 == 0) {
                throw null;
            }
            if (jLongValue < 10000) {
                int i38 = i35 + 77;
                int i39 = i38 % 128;
                f52358r0 = i39;
                int i40 = i38 % 2;
                if (jLongValue < 100) {
                    int i41 = (i39 & (-122)) | ((~i39) & 121);
                    int i42 = -(-((i39 & 121) << 1));
                    int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                    f52357q0 = i43 % 128;
                    if (i43 % 2 != 0) {
                        throw null;
                    }
                    if (jLongValue < 10) {
                        int i44 = i39 & 11;
                        int i45 = -(-((i39 ^ 11) | i44));
                        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                        f52357q0 = i46 % 128;
                        int i47 = i46 % 2;
                        i17 = 1;
                    } else {
                        int i48 = ((i39 ^ 29) - (~(-(-((i39 & 29) << 1))))) - 1;
                        f52357q0 = i48 % 128;
                        int i49 = i48 % 2;
                        i17 = 2;
                    }
                } else if (jLongValue < 1000) {
                    int i50 = (i35 & (-12)) | ((~i35) & 11);
                    int i51 = (i35 & 11) << 1;
                    int i52 = (i50 & i51) + (i51 | i50);
                    f52358r0 = i52 % 128;
                    if (i52 % 2 != 0) {
                        i17 = 3;
                    }
                } else {
                    int i53 = i35 & 109;
                    int i54 = (i53 - (~(-(-((i35 ^ 109) | i53))))) - 1;
                    f52358r0 = i54 % 128;
                    int i55 = i54 % 2;
                    i17 = 4;
                }
            } else if (jLongValue < AnimationKt.MillisToNanos) {
                int i56 = i35 & 17;
                int i57 = -(-((i35 ^ 17) | i56));
                int i58 = (i56 & i57) + (i57 | i56);
                int i59 = i58 % 128;
                f52358r0 = i59;
                if (i58 % 2 == 0) {
                    throw null;
                }
                if (jLongValue < 100000) {
                    int i60 = i59 & 15;
                    int i61 = i59 | 15;
                    int i62 = (i60 & i61) + (i61 | i60);
                    f52357q0 = i62 % 128;
                    int i63 = i62 % 2;
                } else {
                    System.identityHashCode(abxVar);
                    System.identityHashCode(abxVar);
                    i17 = 6;
                }
            } else if (jLongValue < 10000000) {
                int i64 = (((i37 & (-46)) | ((~i37) & 45)) - (~(-(-((i37 & 45) << 1))))) - 1;
                f52357q0 = i64 % 128;
                if (i64 % 2 != 0) {
                    i11 = 56;
                    i17 = i11;
                } else {
                    i17 = 7;
                }
            } else {
                int i65 = i37 + 53;
                f52357q0 = i65 % 128;
                int i66 = i65 % 2;
                i17 = 8;
            }
        } else if (jLongValue < 1000000000000L) {
            int i67 = ((i12 | 5) << 1) - (i12 ^ 5);
            int i68 = i67 % 128;
            f52357q0 = i68;
            if (i67 % 2 != 0) {
                throw null;
            }
            if (jLongValue < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                int i69 = i68 + 85;
                f52358r0 = i69 % 128;
                if (i69 % 2 == 0) {
                    throw null;
                }
                if (jLongValue < 1000000000) {
                    int i70 = i68 & 87;
                    int i71 = i70 + ((i68 ^ 87) | i70);
                    f52358r0 = i71 % 128;
                    int i72 = i71 % 2;
                    i17 = 9;
                } else {
                    int i73 = i68 & 51;
                    int i74 = i73 + ((i68 ^ 51) | i73);
                    f52358r0 = i74 % 128;
                    int i75 = i74 % 2;
                    i17 = 10;
                }
            } else if (jLongValue < 100000000000L) {
                int i76 = i68 & 99;
                int i77 = ((i68 ^ 99) | i76) << 1;
                int i78 = -((i68 | 99) & (~i76));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                int i80 = i79 % 128;
                f52358r0 = i80;
                i17 = i79 % 2 == 0 ? 64 : 11;
                int i81 = ((i80 ^ 44) + ((i80 & 44) << 1)) - 1;
                f52357q0 = i81 % 128;
                int i82 = i81 % 2;
            } else {
                int i83 = i68 & 57;
                int i84 = (i68 ^ 57) | i83;
                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                f52358r0 = i85 % 128;
                int i86 = i85 % 2;
                i17 = 12;
            }
        } else {
            i17 = 18;
            if (jLongValue < 1000000000000000L) {
                int i87 = i12 & 69;
                int i88 = -(-(i12 | 69));
                int i89 = (i87 & i88) + (i88 | i87);
                int i90 = i89 % 128;
                f52357q0 = i90;
                if (i89 % 2 != 0) {
                    int i91 = 94 / 0;
                    if (jLongValue < 10000000000000L) {
                        i10 = (i90 & 123) + (i90 | 123);
                        f52358r0 = i10 % 128;
                        if (i10 % 2 != 0) {
                            i11 = 13;
                            i17 = i11;
                        }
                    } else if (jLongValue < 100000000000000L) {
                        int i92 = ((i90 ^ 110) + ((i90 & 110) << 1)) - 1;
                        f52358r0 = i92 % 128;
                        int i93 = i92 % 2;
                        int i94 = i90 + 95;
                        f52358r0 = i94 % 128;
                        int i95 = i94 % 2;
                        i17 = 14;
                    } else {
                        i17 = 15;
                    }
                } else if (jLongValue < 10000000000000L) {
                    i10 = (i90 & 123) + (i90 | 123);
                    f52358r0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        i11 = 13;
                        i17 = i11;
                    }
                } else if (jLongValue < 100000000000000L) {
                    int i96 = ((i90 ^ 110) + ((i90 & 110) << 1)) - 1;
                    f52358r0 = i96 % 128;
                    int i97 = i96 % 2;
                    int i98 = i90 + 95;
                    f52358r0 = i98 % 128;
                    int i99 = i98 % 2;
                    i17 = 14;
                } else {
                    i17 = 15;
                }
            } else if (jLongValue < 100000000000000000L) {
                int i100 = f52357q0;
                int i101 = i100 & 83;
                int i102 = (((i100 | 83) & (~i101)) - (~(-(-(i101 << 1))))) - 1;
                int i103 = i102 % 128;
                f52358r0 = i103;
                int i104 = i102 % 2;
                if (jLongValue < 10000000000000000L) {
                    int i105 = i103 + 111;
                    f52357q0 = i105 % 128;
                    i17 = i105 % 2 != 0 ? 75 : 16;
                } else {
                    i17 = 17;
                }
            } else if (jLongValue < 1000000000000000000L) {
                int i106 = (i12 & 53) + (i12 | 53);
                f52357q0 = i106 % 128;
                int i107 = i106 % 2;
                int i108 = ((i12 ^ 75) | (i12 & 75)) << 1;
                int i109 = -(((~i12) & 75) | (i12 & (-76)));
                int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                f52357q0 = i110 % 128;
                int i111 = i110 % 2;
            } else {
                int i112 = f52357q0;
                int i113 = (i112 & (-98)) | ((~i112) & 97);
                int i114 = (i112 & 97) << 1;
                int i115 = (i113 & i114) + (i114 | i113);
                f52358r0 = i115 % 128;
                int i116 = i115 % 2;
                i17 = 19;
            }
        }
        if (z10) {
            int i117 = f52358r0;
            int i118 = (i117 & 21) + (i117 | 21);
            f52357q0 = i118 % 128;
            int i119 = i118 % 2;
            int i120 = i17 & 94;
            int i121 = (i120 - (~((i17 ^ 94) | i120))) - 1;
            int i122 = i121 & (-93);
            int i123 = ((i121 ^ (-93)) | i122) << 1;
            int i124 = -((i121 | (-93)) & (~i122));
            i17 = (i123 ^ i124) + ((i124 & i123) << 1);
            System.identityHashCode(abxVar);
            System.identityHashCode(abxVar);
        }
        acj x4 = abxVar.setX(i17);
        byte[] bArr = x4.setOnFocusChangeListener;
        int i125 = x4.setX;
        int i126 = -(-i17);
        int i127 = (i125 ^ i126) + ((i125 & i126) << 1);
        for (long j10 = 0; jLongValue != j10; j10 = 0) {
            int i128 = f52358r0 + 40;
            int i129 = (i128 ^ (-1)) + (i128 << 1);
            f52357q0 = i129 % 128;
            int i130 = i129 % 2;
            i127--;
            bArr[i127] = ((byte[]) act.setDividerPadding(new Object[0], 1872722051, -1872722050, (int) System.currentTimeMillis()))[(int) (jLongValue % 10)];
            jLongValue /= 10;
        }
        if (z10) {
            int i131 = f52357q0;
            int i132 = ((i131 | 7) << 1) - (i131 ^ 7);
            f52358r0 = i132 % 128;
            if (i132 % 2 == 0) {
                int i133 = i127 ^ 182;
                int i134 = -(-((i127 & 182) << 1));
                int i135 = (i133 & i134) + (i133 | i134);
                int i136 = i135 ^ (-94);
                int i137 = -(-((i135 & (-94)) << 1));
                bArr[(i136 ^ i137) + ((i136 & i137) << 1)] = 124;
            } else {
                int i138 = i127 & (-17);
                int i139 = i138 + ((i127 ^ (-17)) | i138);
                int i140 = ((i139 ^ 16) | (i139 & 16)) << 1;
                int i141 = -((16 & (~i139)) | (i139 & (-17)));
                bArr[(i140 & i141) + (i141 | i140)] = 45;
            }
        }
        int i142 = x4.setX;
        int i143 = i142 & i17;
        x4.setX = i143 + ((i142 ^ i17) | i143);
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + ((long) i17));
        int i144 = f52358r0;
        int i145 = i144 & 15;
        int i146 = -(-((i144 ^ 15) | i145));
        int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
        f52357q0 = i147 % 128;
        if (i147 % 2 == 0) {
            return abxVar;
        }
        throw null;
    }

    public static /* synthetic */ Byte D(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = 1;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i11 = f52358r0 + 4;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f52357q0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue()), Long.valueOf(jLongValue), 1L}, 1264570852, -1264570848, (int) System.currentTimeMillis());
        acj acjVar = abxVar.setDividerPadding;
        if (acjVar == null) {
            int i15 = f52357q0;
            int i16 = i15 ^ 113;
            int i17 = (i15 & 113) << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            f52358r0 = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.checkNotNull(null);
                throw null;
            }
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - jLongValue < jLongValue) {
            int i19 = f52358r0;
            int i20 = i19 & 125;
            int i21 = (((i19 | 125) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
            f52357q0 = i21 % 128;
            if (i21 % 2 != 0) {
                ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
                throw null;
            }
            long jLongValue2 = ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
            int i22 = f52357q0;
            int i23 = i22 & 71;
            int i24 = (i22 ^ 71) | i23;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f52358r0 = i25 % 128;
            int i26 = i25 % 2;
            while (jLongValue2 > jLongValue) {
                int i27 = f52358r0;
                int i28 = i27 ^ 21;
                int i29 = ((i27 & 21) | i28) << i10;
                int i30 = -i28;
                int i31 = ((i29 | i30) << i10) - (i29 ^ i30);
                f52357q0 = i31 % 128;
                int i32 = i31 % i13;
                acj acjVar2 = acjVar.setOnDragListener;
                Intrinsics.checkNotNull(acjVar2);
                int i33 = acjVar2.setX;
                int i34 = -acjVar2.setCompoundDrawableTintBlendMode;
                int iIdentityHashCode = System.identityHashCode(abxVar);
                int i35 = i34 * 398;
                int i36 = i33 * (-396);
                int i37 = ((((i35 ^ i36) | (i35 & i36)) << i10) - (~(-(((~i35) & i36) | ((~i36) & i35))))) - i10;
                int i38 = ~i34;
                int i39 = ~iIdentityHashCode;
                int i40 = (i38 ^ i39) | (i38 & i39);
                int i41 = ~i40;
                int i42 = (i40 | i41) & i41;
                int i43 = i38 | i33;
                int i44 = ~i43;
                int i45 = i42 & i44;
                int i46 = (i44 | i42) & (~i45);
                int i47 = (i45 & i46) | (i46 ^ i45);
                int i48 = ~i33;
                int i49 = ~((i39 & i48) | ((~i39) & i33) | (i39 & i33));
                int i50 = i47 ^ i49;
                int i51 = i47 & i49;
                int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * (-397)));
                int i53 = i37 & i52;
                int i54 = -(-(i52 | i37));
                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                int i56 = i38 & i33;
                int i57 = (~i56) & i43;
                int i58 = -(-((~((i57 & i56) | (i57 ^ i56))) * (-397)));
                int i59 = i55 & i58;
                int i60 = (i58 ^ i55) | i59;
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                int i62 = i38 ^ i33;
                int i63 = ~((i56 & i62) | (i62 ^ i56));
                int i64 = (i63 & iIdentityHashCode) | ((~i63) & iIdentityHashCode) | (i63 & i39);
                int i65 = (i33 | i48) & i48;
                int i66 = ~((i65 & i34) | (i65 ^ i34));
                int i67 = -(~(-(-(((i66 & i64) | ((~i66) & i64) | ((~i64) & i66)) * 397))));
                jLongValue2 -= (long) (((i61 & i67) + (i67 | i61)) - 1);
                int i68 = f52358r0;
                int i69 = i68 & 5;
                int i70 = (i69 - (~(-(-((i68 ^ 5) | i69))))) - 1;
                f52357q0 = i70 % 128;
                int i71 = i70 % 2;
                acjVar = acjVar2;
                i10 = 1;
                i13 = 2;
            }
            Intrinsics.checkNotNull(acjVar);
            byte b10 = acjVar.setOnFocusChangeListener[(int) ((((long) acjVar.setCompoundDrawableTintBlendMode) + jLongValue) - jLongValue2)];
            int i72 = f52358r0;
            int i73 = i72 & 13;
            int i74 = -(-((i72 ^ 13) | i73));
            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
            f52357q0 = i75 % 128;
            int i76 = i75 % 2;
            return Byte.valueOf(b10);
        }
        int i77 = f52358r0;
        int i78 = (i77 & 5) + (i77 | 5);
        f52357q0 = i78 % 128;
        int i79 = i78 % 2;
        long j10 = 0;
        while (true) {
            int i80 = acjVar.setX;
            int i81 = -acjVar.setCompoundDrawableTintBlendMode;
            int iIdentityHashCode2 = System.identityHashCode(abxVar);
            int i82 = i81 * 595;
            int i83 = i80 * (-1187);
            int i84 = (((i82 ^ i83) | (i82 & i83)) << 1) - (((~i82) & i83) | ((~i83) & i82));
            int i85 = ~i81;
            int i86 = (i85 | i81) & i85;
            int i87 = ~i80;
            int i88 = ~((i86 & i80) | (i86 ^ i80));
            int i89 = ~iIdentityHashCode2;
            int i90 = i89 & (i89 | iIdentityHashCode2);
            int i91 = i90 ^ i80;
            int i92 = i90 & i80;
            int i93 = (i91 ^ i92) | (i91 & i92);
            int i94 = ~i93;
            int i95 = i94 & (i93 | i94);
            int i96 = i88 ^ i95;
            int i97 = i95 & i88;
            int i98 = -(-(((i97 & i96) | (i96 ^ i97)) * (-1188)));
            int i99 = i84 & i98;
            int i100 = -(-((i98 ^ i84) | i99));
            int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
            int i102 = ~((i85 ^ i80) | (i85 & i80));
            int i103 = (i80 | i87) & i87;
            int i104 = (i103 & i89) | ((~i103) & iIdentityHashCode2);
            int i105 = i103 & iIdentityHashCode2;
            int i106 = (i105 & i104) | (i104 ^ i105);
            int i107 = ~i106;
            int i108 = (i106 | i107) & i107;
            int i109 = i102 & i108;
            int i110 = (i108 | i102) & (~i109);
            int i111 = (i110 & i109) | (i110 ^ i109);
            int i112 = ~i89;
            int i113 = i89 & i81;
            int i114 = (~i113) & (i89 | i81);
            int i115 = i114 | i113;
            int i116 = ~i115;
            int i117 = (i115 | i116) & i116;
            int i118 = i111 ^ i117;
            int i119 = i111 & i117;
            int i120 = -(-(((i119 & i118) | (i118 ^ i119)) * 594));
            int i121 = i101 & i120;
            int i122 = (i121 - (~((i120 ^ i101) | i121))) - 1;
            int i123 = (i87 & i112) | ((~i87) & i89);
            int i124 = i87 & i89;
            int i125 = ~((i123 & i124) | (i123 ^ i124));
            int i126 = ~((i87 & i81) | (i87 ^ i81));
            int i127 = i125 & i126;
            int i128 = ((i126 | i125) & (~i127)) | i127;
            int i129 = ~((i114 ^ i113) | (i114 & i113));
            int i130 = -(~(-(-(((i128 & i129) | (i128 ^ i129)) * 594))));
            long j11 = ((long) ((-2) - (((i122 & i130) + (i130 | i122)) ^ (-1)))) + j10;
            if (j11 > jLongValue) {
                Intrinsics.checkNotNull(acjVar);
                byte b11 = acjVar.setOnFocusChangeListener[(int) ((((long) acjVar.setCompoundDrawableTintBlendMode) + jLongValue) - j10)];
                int i131 = f52357q0 + 3;
                f52358r0 = i131 % 128;
                if (i131 % 2 != 0) {
                    return Byte.valueOf(b11);
                }
                int i132 = 50 / 0;
                return Byte.valueOf(b11);
            }
            int iIdentityHashCode3 = System.identityHashCode(abxVar);
            int i133 = ~iIdentityHashCode3;
            int i134 = (i133 & 431376281) | (i133 ^ 431376281);
            int i135 = ~i134;
            int i136 = (i134 | i135) & i135;
            int i137 = i136 & 1615337476;
            int i138 = (i136 | 1615337476) & (~i137);
            int i139 = -(~(((i138 & i137) | (i138 ^ i137)) * 529));
            int i140 = (-2) - ((((-1597114518) ^ i139) + ((i139 & (-1597114518)) << 1)) ^ (-1));
            int i141 = 431376281 ^ iIdentityHashCode3;
            int i142 = iIdentityHashCode3 & 431376281;
            int i143 = ~((i142 & i141) | (i141 ^ i142));
            int i144 = 1884954132 ^ i143;
            int i145 = i143 & 1884954132;
            int i146 = ((i145 & i144) | (i144 ^ i145)) * 529;
            int i147 = i140 & i146;
            int i148 = i146 | i140;
            int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
            int iIdentityHashCode4 = System.identityHashCode(abxVar);
            int i150 = ~iIdentityHashCode4;
            int i151 = i150 & (i150 | iIdentityHashCode4);
            int i152 = ~((i151 & 2069329592) | (2069329592 ^ i151));
            int i153 = 1138321044 & i152;
            int i154 = (i152 | 1138321044) & (~i153);
            int i155 = -(~(-(-(((i154 & i153) | (i154 ^ i153)) * (-235)))));
            int i156 = ((542787520 & i155) + (i155 | 542787520)) - 1;
            int i157 = 2069329592 ^ iIdentityHashCode4;
            int i158 = 2069329592 & iIdentityHashCode4;
            int i159 = ~((i157 & i158) | (i157 ^ i158));
            int i160 = -(-(((i159 & 1138321044) | (1138321044 ^ i159)) * (-470)));
            int i161 = i156 & i160;
            int i162 = -(-((i160 ^ i156) | i161));
            int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
            int i164 = 2078242492 & iIdentityHashCode4;
            int i165 = (iIdentityHashCode4 | 2078242492) & (~i164);
            int i166 = ~((i165 & i164) | (i165 ^ i164));
            int i167 = 1129408144 & i166;
            int i168 = (i166 | 1129408144) & (~i167);
            int i169 = ((i168 & i167) | (i168 ^ i167)) * 235;
            int i170 = i163 & i169;
            int i171 = -(-((i169 ^ i163) | i170));
            if (i149 > (i170 & i171) + (i171 | i170)) {
                Intrinsics.checkNotNull(acjVar.setDividerPadding);
                throw null;
            }
            acjVar = acjVar.setDividerPadding;
            Intrinsics.checkNotNull(acjVar);
            int i172 = f52357q0;
            int i173 = i172 & 69;
            int i174 = ((((i172 ^ 69) | i173) << 1) - (~(-((i172 | 69) & (~i173))))) - 1;
            f52358r0 = i174 % 128;
            int i175 = i174 % 2;
            j10 = j11;
        }
    }

    public static /* synthetic */ Integer E(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f52357q0 + 43;
        f52358r0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        acv.setOnFocusChangeListener(new Object[]{Long.valueOf(bArr.length), Long.valueOf(iIntValue), Long.valueOf(iIntValue2)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
        acj acjVar = abxVar.setDividerPadding;
        if (acjVar == null) {
            int i12 = f52358r0;
            int i13 = (i12 & (-40)) | ((~i12) & 39);
            int i14 = (i12 & 39) << 1;
            int i15 = (i13 & i14) + (i14 | i13);
            f52357q0 = i15 % 128;
            if (i15 % 2 == 0) {
                return -1;
            }
            throw null;
        }
        int i16 = acjVar.setX;
        int i17 = -acjVar.setCompoundDrawableTintBlendMode;
        int i18 = i17 * (-300);
        int i19 = -(-(i16 * 302));
        int i20 = ((i18 ^ i19) | (i18 & i19)) << 1;
        int i21 = -(((~i18) & i19) | ((~i19) & i18));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = i17 & i16;
        int i24 = (~i23) & (i17 | i16);
        int i25 = ~i16;
        int i26 = i23 | i24;
        int i27 = ~iIntValue;
        int i28 = (i26 & i27) | ((~i26) & iIntValue);
        int i29 = i26 & iIntValue;
        int i30 = -(-((~((i28 ^ i29) | (i28 & i29))) * (-301)));
        int i31 = i22 | i30;
        int i32 = i31 << 1;
        int i33 = -((~(i30 & i22)) & i31);
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = (i25 | i16) & i25;
        int i36 = i35 ^ iIntValue;
        int i37 = i35 & iIntValue;
        int i38 = ~((i37 & i36) | (i36 ^ i37));
        int i39 = i27 | i17;
        int i40 = ~i39;
        int i41 = (i39 | i40) & i40;
        int i42 = ((~i38) & i41) | ((~i41) & i38);
        int i43 = i38 & i41;
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * (-301)));
        int i45 = ((i34 | i44) << 1) - (i44 ^ i34);
        int i46 = ~i17;
        int i47 = ~((i46 & iIntValue) | (i46 ^ iIntValue));
        int i48 = i25 & i47;
        int i49 = (i47 | i25) & (~i48);
        int iMin = Math.min(iIntValue2, (i45 - (~(((i49 & i48) | (i49 ^ i48)) * 301))) - 1);
        byte[] bArr2 = acjVar.setOnFocusChangeListener;
        int i50 = acjVar.setCompoundDrawableTintBlendMode;
        int i51 = -(-iMin);
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, iIntValue, i50, (i50 & i51) + (i51 | i50));
        int i52 = acjVar.setCompoundDrawableTintBlendMode;
        int i53 = iMin * (-574);
        int i54 = -(-(i52 * (-574)));
        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
        int i56 = ~iMin;
        int i57 = i56 ^ i27;
        int i58 = i56 & i27;
        int i59 = ~((i57 & i58) | (i57 ^ i58));
        int i60 = ~i52;
        int i61 = (i60 | i52) & i60;
        int i62 = i61 ^ iIntValue;
        int i63 = i61 & iIntValue;
        int i64 = ~((i62 ^ i63) | (i63 & i62));
        int i65 = ((~i59) & i64) | ((~i64) & i59);
        int i66 = i59 & i64;
        int i67 = ((i65 & i66) | (i65 ^ i66)) * 1150;
        int i68 = i55 & i67;
        int i69 = (i67 ^ i55) | i68;
        int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
        int i71 = i60 & iIntValue;
        int i72 = (~i71) & (i60 | iIntValue);
        int i73 = ~((i71 & i72) | (i72 ^ i71));
        int i74 = (i27 & i60) | ((~i27) & i52);
        int i75 = i52 & i27;
        int i76 = ~((i75 & i74) | (i74 ^ i75));
        int i77 = i73 & i76;
        int i78 = (i76 | i73) & (~i77);
        int i79 = -(-(((i78 & i77) | (i78 ^ i77)) * (-575)));
        int i80 = ((i70 | i79) << 1) - (i79 ^ i70);
        int i81 = ((~i56) & iIntValue) | i58 | (iIntValue & i56);
        int i82 = ~i81;
        int i83 = (i81 | i82) & i82;
        int i84 = i27 ^ iMin;
        int i85 = i27 & iMin;
        int i86 = (i84 & i85) | (i84 ^ i85);
        int i87 = ~i86;
        int i88 = (i86 | i87) & i87;
        int i89 = -(-(((i83 & i88) | ((~i88) & i83) | ((~i83) & i88)) * 575));
        int i90 = ((~i89) & i80) | ((~i80) & i89);
        int i91 = (i89 & i80) << 1;
        acjVar.setCompoundDrawableTintBlendMode = (i90 & i91) + (i91 | i90);
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - ((long) iMin));
        if (acjVar.setCompoundDrawableTintBlendMode == acjVar.setX) {
            int i92 = f52358r0 + 49;
            f52357q0 = i92 % 128;
            if (i92 % 2 != 0) {
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                int i93 = 83 / 0;
            } else {
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
            }
            int i94 = f52357q0 + 105;
            f52358r0 = i94 % 128;
            int i95 = i94 % 2;
        }
        int i96 = f52358r0;
        int i97 = (-2) - ((-1) ^ ((i96 ^ 72) + ((i96 & 72) << 1)));
        f52357q0 = i97 % 128;
        if (i97 % 2 == 0) {
            return Integer.valueOf(iMin);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    public static /* synthetic */ Object F(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f52357q0;
        int i11 = ((i10 ^ 18) + ((i10 & 18) << 1)) - 1;
        int i12 = i11 % 128;
        f52358r0 = i12;
        if (i11 % 2 != 0 ? jLongValue < 0 : jLongValue < 1) {
            int i13 = ((i12 | 69) << 1) - (i12 ^ 69);
            f52357q0 = i13 % 128;
            int i14 = i13 % 2;
        } else if (jLongValue <= 2147483647L) {
            int i15 = ((i12 ^ 43) | (i12 & 43)) << 1;
            int i16 = -(((~i12) & 43) | (i12 & (-44)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f52357q0 = i17 % 128;
            if (i17 % 2 == 0) {
                if (((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() < jLongValue) {
                    throw new EOFException();
                }
                byte[] bArr = new byte[(int) jLongValue];
                setOnFocusChangeListener(new Object[]{abxVar, bArr}, -931975970, 931976007, System.identityHashCode(abxVar));
                int i18 = f52357q0;
                int i19 = i18 ^ 97;
                int i20 = ((i18 & 97) | i19) << 1;
                int i21 = -i19;
                int i22 = (i20 & i21) + (i20 | i21);
                f52358r0 = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 71 / 0;
                }
                return bArr;
            }
        } else {
            int i110 = ((i12 | 69) << 1) - (i12 ^ 69);
            f52357q0 = i110 % 128;
            int i111 = i110 % 2;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(jLongValue)).toString());
    }

    public static /* synthetic */ String H(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        int i10;
        abx abxVar = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i11 = f52358r0;
        int i12 = i11 & 17;
        int i13 = ((i11 ^ 17) | i12) << 1;
        int i14 = -((~i12) & (i11 | 17));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = i15 % 128;
        f52357q0 = i16;
        int i17 = i15 % 2;
        if (jLongValue >= 0) {
            int i18 = i16 & 31;
            int i19 = (~i18) & (i16 | 31);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f52358r0 = i21 % 128;
            boolean z10 = i21 % 2 != 0;
            int i22 = i16 | 111;
            int i23 = ((i22 << 1) - (~(-((~(i16 & 111)) & i22)))) - 1;
            int i24 = i23 % 128;
            f52358r0 = i24;
            int i25 = i23 % 2;
            if (z10) {
                long j10 = Long.MAX_VALUE;
                if (jLongValue == Long.MAX_VALUE) {
                    int i26 = (i24 | 107) << 1;
                    int i27 = -(((~i24) & 107) | (i24 & (-108)));
                    int i28 = (i26 & i27) + (i26 | i27);
                    int i29 = i28 % 128;
                    f52357q0 = i29;
                    int i30 = i28 % 2;
                    i10 = i29 + 37;
                    f52358r0 = i10 % 128;
                } else {
                    j10 = jLongValue + 1;
                    i10 = ((i24 ^ 121) - (~(-(-((i24 & 121) << 1))))) - 1;
                    f52357q0 = i10 % 128;
                }
                int i31 = i10 % 2;
                long jLongValue2 = ((Long) setOnFocusChangeListener(new Object[]{abxVar, (byte) 10, 0L, Long.valueOf(j10)}, 268946389, -268946363, System.identityHashCode(abxVar))).longValue();
                if (jLongValue2 != -1) {
                    int i32 = f52357q0;
                    int i33 = (i32 ^ 113) + ((i32 & 113) << 1);
                    f52358r0 = i33 % 128;
                    if (i33 % 2 != 0) {
                        return (String) act.setDividerPadding(new Object[]{abxVar, Long.valueOf(jLongValue2)}, -854819362, 854819364, (int) System.currentTimeMillis());
                    }
                    int i34 = 44 / 0;
                    return (String) act.setDividerPadding(new Object[]{abxVar, Long.valueOf(jLongValue2)}, -854819362, 854819364, (int) System.currentTimeMillis());
                }
                if (j10 < ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue()) {
                    int i35 = f52358r0;
                    int i36 = i35 & 73;
                    int i37 = i36 + ((i35 ^ 73) | i36);
                    f52357q0 = i37 % 128;
                    int i38 = i37 % 2;
                    if (((Byte) setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(j10 - 1)}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() == 13) {
                        int i39 = f52357q0;
                        int i40 = (i39 & 27) + (i39 | 27);
                        f52358r0 = i40 % 128;
                        int i41 = i40 % 2;
                        if (((Byte) setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(j10)}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() == 10) {
                            int i42 = f52358r0;
                            int i43 = i42 & 3;
                            int i44 = (((i42 ^ 3) | i43) << 1) - ((i42 | 3) & (~i43));
                            f52357q0 = i44 % 128;
                            int i45 = i44 % 2;
                            String str = (String) act.setDividerPadding(new Object[]{abxVar, Long.valueOf(j10)}, -854819362, 854819364, (int) System.currentTimeMillis());
                            int i46 = f52358r0;
                            int i47 = (((i46 ^ 115) | (i46 & 115)) << 1) - (((~i46) & 115) | (i46 & (-116)));
                            f52357q0 = i47 % 128;
                            int i48 = i47 % 2;
                            return str;
                        }
                    }
                }
                abx abxVar2 = new abx();
                abxVar.setOnFocusChangeListener(abxVar2, 0L, Math.min(32L, ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue()));
                StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
                sb2.append(Math.min(abxVar.setCompoundDrawableTintBlendMode(), jLongValue));
                sb2.append(" content=");
                sb2.append(abxVar2.setIncludeFontPadding().setLayoutAnimation());
                sb2.append(Typography.ellipsis);
                throw new EOFException(sb2.toString());
            }
        } else {
            int i49 = ((i11 ^ 57) | (i11 & 57)) << 1;
            int i50 = -((i11 & (-58)) | ((~i11) & 57));
            int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
            f52357q0 = i51 % 128;
            int i52 = i51 % 2;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("limit < 0: ", Long.valueOf(jLongValue)).toString());
    }

    public static /* synthetic */ abx I(Object[] objArr) throws NoSuchAlgorithmException {
        abx abxVar = (abx) objArr[0];
        abw abwVar = (abw) objArr[1];
        int i10 = f52358r0 + 109;
        f52357q0 = i10 % 128;
        if (i10 % 2 != 0) {
            abxVar.setY(abwVar);
            throw null;
        }
        abx y7 = abxVar.setY(abwVar);
        int i11 = f52358r0;
        int i12 = i11 & 63;
        int i13 = i12 + ((i11 ^ 63) | i12);
        f52357q0 = i13 % 128;
        int i14 = i13 % 2;
        return y7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r0 = (r9 ^ 122) + ((r9 & 122) << 1);
        r9 = (r0 ^ (-1)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r1.f52359p0 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r1.f52359p0 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r9 = r6 | 45;
        r0 = (r9 << 1) - (r9 & (~(r6 & 45)));
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean J(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.mypinpad.tsdk.i.abx r1 = (com.mypinpad.tsdk.isolation.abx) r1
            r2 = 1
            r9 = r9[r2]
            java.lang.Number r9 = (java.lang.Number) r9
            long r3 = r9.longValue()
            int r9 = com.mypinpad.tsdk.isolation.abx.f52357q0
            r5 = r9 & 115(0x73, float:1.61E-43)
            r6 = r9 ^ 115(0x73, float:1.61E-43)
            r6 = r6 | r5
            int r5 = r5 + r6
            int r6 = r5 % 128
            com.mypinpad.tsdk.isolation.abx.f52358r0 = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L28
            long r7 = r1.f52359p0
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r3 = 83
            int r3 = r3 / r0
            if (r1 < 0) goto L40
            goto L2e
        L28:
            long r0 = r1.f52359p0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L40
        L2e:
            r9 = r6 | 45
            int r0 = r9 << 1
            r1 = r6 & 45
            int r1 = ~r1
            r9 = r9 & r1
            int r0 = r0 - r9
            int r9 = r0 % 128
            com.mypinpad.tsdk.isolation.abx.f52357q0 = r9
            int r0 = r0 % 2
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L40:
            r0 = r9 ^ 122(0x7a, float:1.71E-43)
            r9 = r9 & 122(0x7a, float:1.71E-43)
            int r9 = r9 << r2
            int r0 = r0 + r9
            r9 = r0 ^ (-1)
            int r0 = r0 << r2
            int r9 = r9 + r0
            int r0 = r9 % 128
            com.mypinpad.tsdk.isolation.abx.f52358r0 = r0
            int r9 = r9 % 2
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abx.J(java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0121  */
    /* JADX WARN: Code duplicated, block: B:13:0x012a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0127, code lost:
    
        if ((!(r3 instanceof com.mypinpad.tsdk.isolation.abx)) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x012c, code lost:
    
        if ((r3 instanceof com.mypinpad.tsdk.isolation.abx) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x012e, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.abx.f52357q0 + 91;
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r1;
        r0 = r0 % 2;
        r1 = r1 + 9;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0140, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0144, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0145, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0146, code lost:
    
        r7 = 1395393434;
        r8 = -1395393402;
        r3 = (com.mypinpad.tsdk.isolation.abx) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0174, code lost:
    
        if (((java.lang.Long) setOnFocusChangeListener(new java.lang.Object[]{r1}, 1395393434, -1395393402, java.lang.System.identityHashCode(r1))).longValue() == ((java.lang.Long) setOnFocusChangeListener(new java.lang.Object[]{r3}, 1395393434, -1395393402, java.lang.System.identityHashCode(r3))).longValue()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0176, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r1 = r0 & 1;
        r3 = r0 | 1;
        r4 = (r1 & r3) + (r1 | r3);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r4 % 128;
        r4 = r4 % 2;
        r1 = r0 & 37;
        r0 = -(-((r0 ^ 37) | r1));
        r3 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0198, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019c, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b4, code lost:
    
        if (((java.lang.Long) setOnFocusChangeListener(new java.lang.Object[]{r1}, 1395393434, -1395393402, java.lang.System.identityHashCode(r1))).longValue() == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b6, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r5 = ((r4 & 123) - (~(r4 | 123))) - 1;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r5 % 128;
        r5 = r5 % 2;
        r4 = r1.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r3 = r3.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
        r5 = r4.setCompoundDrawableTintBlendMode;
        r6 = r3.setCompoundDrawableTintBlendMode;
        r11 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r12 = ((r11 & 86) + (r11 | 86)) - 1;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r12 % 128;
        r12 = r12 % 2;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e2, code lost:
    
        r13 = new java.lang.Object[r2];
        r13[r0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f6, code lost:
    
        if (r11 >= ((java.lang.Long) setOnFocusChangeListener(r13, r7, r8, java.lang.System.identityHashCode(r1))).longValue()) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01f8, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.abx.f52357q0 + 29;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r13 % 128;
        r13 = r13 % 2;
        r13 = r4.setX;
        r14 = -r5;
        r15 = java.lang.System.identityHashCode(r1);
        r16 = r14 * (-112);
        r17 = r13 * (-112);
        r7 = r16 & r17;
        r8 = ((~r7) & (r16 | r17)) + (r7 << r2);
        r7 = ~r13;
        r0 = r7 & (r7 | r13);
        r9 = ~r15;
        r2 = ((~r0) & r9) | ((~r9) & r0);
        r0 = r0 & r9;
        r0 = ~((r0 & r2) | (r2 ^ r0));
        r2 = (~r0) & r14;
        r10 = ~r14;
        r2 = r2 | (r0 & r10);
        r0 = r0 & r14;
        r0 = ((r2 ^ r0) | (r0 & r2)) * 226;
        r2 = (r8 & r0) + (r0 | r8);
        r0 = r10 & r13;
        r8 = (~r0) & (r13 | r10);
        r0 = (r0 & r8) | (r8 ^ r0);
        r8 = ~r0;
        r0 = (r0 | r8) & r8;
        r8 = (r10 & r9) | ((~r10) & r15);
        r13 = r10 & r15;
        r8 = ~((r8 ^ r13) | (r8 & r13));
        r18 = r1;
        r1 = ((~r0) & r8) | ((~r8) & r0);
        r0 = r0 & r8;
        r0 = (r0 & r1) | (r1 ^ r0);
        r1 = (r9 | r15) & r9;
        r1 = (r1 & r7) | (r7 ^ r1);
        r1 = ~((r1 & r14) | ((r1 & r10) | ((~r1) & r14)));
        r8 = r0 & r1;
        r0 = (r0 | r1) & (~r8);
        r0 = -(-(((r0 & r8) | (r0 ^ r8)) * (-113)));
        r1 = r2 & r0;
        r0 = -(-((r0 ^ r2) | r1));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        r0 = r7 ^ r15;
        r1 = r7 & r15;
        r0 = ((~((r0 & r1) | (r0 ^ r1))) * 113) + r2;
        r1 = r3.setX;
        r2 = -r6;
        r7 = r1 ^ r2;
        r1 = ((r1 & r2) | r7) << 1;
        r7 = -r7;
        r0 = java.lang.Math.min(r0, ((r1 | r7) << 1) - (r1 ^ r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02ab, code lost:
    
        if (0 >= r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02ad, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02ae, code lost:
    
        r9 = r9 + 1;
        r13 = (r5 ^ 1) + ((r5 & 1) << 1);
        r14 = (-2) - (((r6 & 2) + (r6 | 2)) ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02c9, code lost:
    
        if (r4.setOnFocusChangeListener[r5] == r3.setOnFocusChangeListener[r6]) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02cb, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.abx.f52358r0 + 117;
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r1;
        r0 = r0 % 2;
        r1 = r1 + 57;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02df, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02e2, code lost:
    
        if (r9 < r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e4, code lost:
    
        r5 = r13;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e7, code lost:
    
        r5 = r13;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ec, code lost:
    
        if (r5 != r4.setX) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02ee, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r5 = r2 ^ 13;
        r2 = ((((r2 & 13) | r5) << 1) - (~(-r5))) - 1;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r2 % 128;
        r2 = r2 % 2;
        r2 = r4.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r4 = r2.setCompoundDrawableTintBlendMode;
        r5 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r9 = r5 ^ 15;
        r5 = ((((r5 & 15) | r9) << 1) - (~(-r9))) - 1;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r5 % 128;
        r5 = r5 % 2;
        r5 = r4;
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x031f, code lost:
    
        if (r6 != r3.setX) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0321, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r6 = ((r2 | 93) << 1) - (r2 ^ 93);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0330, code lost:
    
        if ((r6 % 2) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0332, code lost:
    
        r2 = r3.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r3 = r2.setCompoundDrawableTintBlendMode;
        r9 = 0;
        r6 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x033e, code lost:
    
        r9 = 0;
        r2 = r3.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r3 = r2.setCompoundDrawableTintBlendMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0346, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.abx.f52357q0 + 17;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r6 % 128;
        r6 = r6 % 2;
        r6 = r3;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0353, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0354, code lost:
    
        r11 = r11 + r0;
        r0 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r1 = (((r0 | 42) << 1) - (r0 ^ 42)) - 1;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r1 % 128;
        r1 = r1 % 2;
        r0 = r9;
        r1 = r18;
        r2 = 1;
        r7 = 1395393434;
        r8 = -1395393402;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r19) throws java.security.NoSuchAlgorithmException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abx.a(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Byte b(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52358r0;
        int i11 = ((i10 & 92) + (i10 | 92)) - 1;
        f52357q0 = i11 % 128;
        int i12 = i11 % 2;
        if (((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() == 0) {
            throw new EOFException();
        }
        acj acjVar = abxVar.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        int i13 = acjVar.setCompoundDrawableTintBlendMode;
        int i14 = acjVar.setX;
        byte[] bArr = acjVar.setOnFocusChangeListener;
        int iIdentityHashCode = System.identityHashCode(abxVar);
        int i15 = -(-(i13 * (-565)));
        int i16 = 567 ^ i15;
        int i17 = ((((i15 & 567) | i16) << 1) - (~(-i16))) - 1;
        int i18 = (-2) & i13;
        int i19 = (~i18) & ((-2) | i13);
        int i20 = ~i13;
        int i21 = i18 | i19;
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = (-2) & iIdentityHashCode;
        int i25 = (~i24) & ((-2) | iIdentityHashCode);
        int i26 = ~((i25 ^ i24) | (i24 & i25));
        int i27 = ((~i23) & i26) | ((~i26) & i23);
        int i28 = i23 & i26;
        int i29 = ((i27 & i28) | (i27 ^ i28)) * (-566);
        int i30 = i17 & i29;
        int i31 = ((i17 ^ i29) | i30) << 1;
        int i32 = -((i29 | i17) & (~i30));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = (~((i20 ^ 1) | (i20 & 1))) * 566;
        int i35 = i33 & i34;
        int i36 = (i34 ^ i33) | i35;
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        int i38 = (i20 | i13) & i20;
        int i39 = (-2) & i38;
        int i40 = (i38 | (-2)) & (~i39);
        int i41 = (i40 & i39) | (i40 ^ i39);
        int i42 = -(-((~((i41 & iIdentityHashCode) | (i41 ^ iIdentityHashCode))) * 566));
        int i43 = ((i37 | i42) << 1) - (i42 ^ i37);
        byte b10 = bArr[i13];
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - 1);
        if (i43 == i14) {
            int i44 = f52357q0;
            int i45 = ((i44 ^ 114) + ((i44 & 114) << 1)) - 1;
            f52358r0 = i45 % 128;
            if (i45 % 2 == 0) {
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                throw null;
            }
            abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
            ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
        } else {
            acjVar.setCompoundDrawableTintBlendMode = i43;
            int i46 = f52358r0 + 5;
            f52357q0 = i46 % 128;
            int i47 = i46 % 2;
        }
        int i48 = f52358r0 + 85;
        f52357q0 = i48 % 128;
        int i49 = i48 % 2;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Long c(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        int i10;
        abx abxVar;
        byte b10;
        byte[] bArr;
        int iMin;
        long j10;
        long jLongValue;
        abx abxVar2 = (abx) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i11 = 2;
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        int i12 = f52358r0 + 41;
        int i13 = i12 % 128;
        f52357q0 = i13;
        if (i12 % 2 == 0 ? 0 > jLongValue2 : 1 > jLongValue2) {
            int i14 = i13 + 82;
            i10 = 1;
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            f52358r0 = i15 % 128;
            int i16 = i15 % 2;
        } else {
            if (jLongValue2 <= jLongValue3) {
                int i17 = i13 ^ 77;
                int i18 = -(-((i13 & 77) << 1));
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                f52358r0 = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i13 & 117;
                int i22 = (i21 - (~(-(-((i13 ^ 117) | i21))))) - 1;
                f52358r0 = i22 % 128;
                int i23 = i22 % 2;
                if (jLongValue3 > ((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue()) {
                    int i24 = f52357q0;
                    int i25 = (i24 & 65) + (i24 | 65);
                    f52358r0 = i25 % 128;
                    int i26 = i25 % 2;
                    jLongValue3 = ((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue();
                    int i27 = f52358r0;
                    int i28 = (i27 ^ 33) + ((i27 & 33) << 1);
                    f52357q0 = i28 % 128;
                    int i29 = i28 % 2;
                }
                if (jLongValue2 != jLongValue3) {
                    int i30 = f52357q0;
                    int i31 = i30 & 117;
                    int i32 = -(-((i30 ^ 117) | i31));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f52358r0 = i33 % 128;
                    if (i33 % 2 == 0) {
                        acj acjVar = abxVar2.setDividerPadding;
                        throw null;
                    }
                    acj acjVar2 = abxVar2.setDividerPadding;
                    if (acjVar2 != null) {
                        if (((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() - jLongValue2 < jLongValue2) {
                            int i34 = f52357q0;
                            int i35 = i34 & 11;
                            int i36 = ((i34 | 11) & (~i35)) + (i35 << 1);
                            f52358r0 = i36 % 128;
                            if (i36 % 2 == 0) {
                                jLongValue = ((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue();
                                int i37 = 68 / 0;
                            } else {
                                jLongValue = ((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue();
                            }
                            int i38 = f52358r0;
                            int i39 = ((i38 & 38) + (i38 | 38)) - 1;
                            f52357q0 = i39 % 128;
                            int i40 = i39 % 2;
                            while (jLongValue > jLongValue2) {
                                int i41 = f52357q0;
                                int i42 = (i41 & 115) + (i41 | 115);
                                f52358r0 = i42 % 128;
                                int i43 = i42 % i11;
                                acj acjVar3 = acjVar2.setOnDragListener;
                                Intrinsics.checkNotNull(acjVar3);
                                int i44 = acjVar3.setX;
                                int i45 = -acjVar3.setCompoundDrawableTintBlendMode;
                                int iIdentityHashCode = System.identityHashCode(abxVar2);
                                int i46 = i45 * (-518);
                                int i47 = i44 * (-518);
                                int i48 = i46 & i47;
                                int i49 = (i48 - (~((i47 ^ i46) | i48))) - 1;
                                int i50 = ~i45;
                                int i51 = ~iIdentityHashCode;
                                int i52 = ~((i50 ^ i51) | (i50 & i51));
                                int i53 = i44 & i52;
                                int i54 = (i49 - (~(-(-((i53 | ((i52 | i44) & (~i53))) * 519))))) - 1;
                                int i55 = (i51 | iIdentityHashCode) & i51;
                                int i56 = (i55 & i50) | (i50 ^ i55);
                                int i57 = i56 ^ i44;
                                int i58 = i56 & i44;
                                int i59 = (i58 & i57) | (i57 ^ i58);
                                int i60 = ~i59;
                                int i61 = (i59 | i60) & i60;
                                int i62 = (i45 ^ i44) | (i45 & i44);
                                int i63 = ~((i62 & iIdentityHashCode) | (i62 ^ iIdentityHashCode));
                                int i64 = ((~i63) & i61) | ((~i61) & i63);
                                int i65 = i61 & i63;
                                int i66 = ((i65 & i64) | (i64 ^ i65)) * (-519);
                                int i67 = i54 | i66;
                                int i68 = (i67 << 1) - ((~(i54 & i66)) & i67);
                                int i69 = i44 & iIdentityHashCode;
                                int i70 = (~i69) & (i44 | iIdentityHashCode);
                                int i71 = (i69 & i70) | (i70 ^ i69);
                                int i72 = ~i71;
                                int i73 = (i71 | i72) & i72;
                                int i74 = (i50 & i73) | ((~i73) & i45);
                                int i75 = i73 & i45;
                                jLongValue -= (long) ((i68 - (~(((i74 & i75) | (i74 ^ i75)) * 519))) - 1);
                                acjVar2 = acjVar3;
                                i11 = 2;
                            }
                            int i76 = f52357q0;
                            int i77 = i76 & 63;
                            int i78 = i77 + ((i76 ^ 63) | i77);
                            f52358r0 = i78 % 128;
                            if (i78 % 2 == 0) {
                                throw null;
                            }
                            while (jLongValue < jLongValue3) {
                                int i79 = (-2) - ((f52357q0 + 14) ^ (-1));
                                f52358r0 = i79 % 128;
                                int i80 = i79 % 2;
                                byte[] bArr2 = acjVar2.setOnFocusChangeListener;
                                int iMin2 = (int) Math.min(acjVar2.setX, (((long) acjVar2.setCompoundDrawableTintBlendMode) + jLongValue3) - jLongValue);
                                int i81 = (int) ((((long) acjVar2.setCompoundDrawableTintBlendMode) + jLongValue2) - jLongValue);
                                int i82 = f52357q0;
                                int i83 = (i82 & 119) + (i82 | 119);
                                f52358r0 = i83 % 128;
                                int i84 = i83 % 2;
                                while (i81 < iMin2) {
                                    int i85 = f52358r0;
                                    int i86 = i85 & 7;
                                    int i87 = (i85 ^ 7) | i86;
                                    int i88 = (i86 & i87) + (i87 | i86);
                                    int i89 = i88 % 128;
                                    f52357q0 = i89;
                                    if (i88 % 2 != 0) {
                                        int i90 = 94 / 0;
                                        if (bArr2[i81] == bByteValue) {
                                            int i91 = i89 + 41;
                                            f52358r0 = i91 % 128;
                                            int i92 = i91 % 2;
                                            int i93 = -acjVar2.setCompoundDrawableTintBlendMode;
                                            System.identityHashCode(abxVar2);
                                            int i94 = i93 * (-623);
                                            int i95 = i81 * (-623);
                                            int i96 = ((i94 | i95) << 1) - (i94 ^ i95);
                                            int i97 = ~i93;
                                            int i98 = (i96 - (~(-(~(i97 * (-624)))))) - 2;
                                            int i99 = ((~i97) & i81) | ((~i81) & i97);
                                            int i100 = i97 & i81;
                                            int i101 = (((i100 & i99) | (i99 ^ i100)) * 624) + i98;
                                            int i102 = -(-(((i93 & i81) | (i93 ^ i81)) * 624));
                                            int i103 = i101 | i102;
                                            int i104 = i103 << 1;
                                            int i105 = -((~(i102 & i101)) & i103);
                                            long j11 = ((long) (((i104 | i105) << 1) - (i105 ^ i104))) + jLongValue;
                                            int i106 = f52357q0;
                                            int i107 = (i106 & 81) + (i106 | 81);
                                            f52358r0 = i107 % 128;
                                            int i108 = i107 % 2;
                                            return Long.valueOf(j11);
                                        }
                                        System.identityHashCode(abxVar2);
                                        int i109 = 629 - (~(i81 * (-628)));
                                        int i110 = ~i81;
                                        int i111 = i110 & (i110 | i81);
                                        int i112 = i111 * (-629);
                                        int i113 = (i109 & i112) + (i109 | i112);
                                        int i114 = -(~((~(((-2) ^ i111) | (i111 & (-2)))) * (-629)));
                                        int i115 = ((i113 ^ i114) + ((i114 & i113) << 1)) - 1;
                                        int i116 = -(-(((i81 & (-2)) | (i81 ^ (-2))) * 629));
                                        int i117 = i115 & i116;
                                        int i118 = (i116 ^ i115) | i117;
                                        i81 = (i118 | i117) + (i117 & i118);
                                        int i119 = f52357q0;
                                        int i120 = i119 ^ 113;
                                        int i121 = -(-((i119 & 113) << 1));
                                        int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                                        f52358r0 = i122 % 128;
                                        int i123 = i122 % 2;
                                    } else {
                                        if (bArr2[i81] == bByteValue) {
                                            int i910 = i89 + 41;
                                            f52358r0 = i910 % 128;
                                            int i911 = i910 % 2;
                                            int i912 = -acjVar2.setCompoundDrawableTintBlendMode;
                                            System.identityHashCode(abxVar2);
                                            int i913 = i912 * (-623);
                                            int i914 = i81 * (-623);
                                            int i915 = ((i913 | i914) << 1) - (i913 ^ i914);
                                            int i916 = ~i912;
                                            int i917 = (i915 - (~(-(~(i916 * (-624)))))) - 2;
                                            int i918 = ((~i916) & i81) | ((~i81) & i916);
                                            int i1010 = i916 & i81;
                                            int i1011 = (((i1010 & i918) | (i918 ^ i1010)) * 624) + i917;
                                            int i1012 = -(-(((i912 & i81) | (i912 ^ i81)) * 624));
                                            int i1013 = i1011 | i1012;
                                            int i1014 = i1013 << 1;
                                            int i1015 = -((~(i1012 & i1011)) & i1013);
                                            long j12 = ((long) (((i1014 | i1015) << 1) - (i1015 ^ i1014))) + jLongValue;
                                            int i1016 = f52357q0;
                                            int i1017 = (i1016 & 81) + (i1016 | 81);
                                            f52358r0 = i1017 % 128;
                                            int i1018 = i1017 % 2;
                                            return Long.valueOf(j12);
                                        }
                                        System.identityHashCode(abxVar2);
                                        int i1019 = 629 - (~(i81 * (-628)));
                                        int i1110 = ~i81;
                                        int i1111 = i1110 & (i1110 | i81);
                                        int i1112 = i1111 * (-629);
                                        int i1113 = (i1019 & i1112) + (i1019 | i1112);
                                        int i1114 = -(~((~(((-2) ^ i1111) | (i1111 & (-2)))) * (-629)));
                                        int i1115 = ((i1113 ^ i1114) + ((i1114 & i1113) << 1)) - 1;
                                        int i1116 = -(-(((i81 & (-2)) | (i81 ^ (-2))) * 629));
                                        int i1117 = i1115 & i1116;
                                        int i1118 = (i1116 ^ i1115) | i1117;
                                        i81 = (i1118 | i1117) + (i1117 & i1118);
                                        int i1119 = f52357q0;
                                        int i124 = i1119 ^ 113;
                                        int i125 = -(-((i1119 & 113) << 1));
                                        int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                                        f52358r0 = i126 % 128;
                                        int i127 = i126 % 2;
                                    }
                                }
                                int i128 = acjVar2.setX;
                                int i129 = -(~(-acjVar2.setCompoundDrawableTintBlendMode));
                                jLongValue += (long) (((i128 & i129) + (i128 | i129)) - 1);
                                acjVar2 = acjVar2.setDividerPadding;
                                Intrinsics.checkNotNull(acjVar2);
                                int i130 = f52357q0;
                                int i131 = ((i130 ^ 60) + ((i130 & 60) << 1)) - 1;
                                f52358r0 = i131 % 128;
                                int i132 = i131 % 2;
                                jLongValue2 = jLongValue;
                            }
                            int i133 = f52357q0;
                            int i134 = (-2) - (((i133 ^ 28) + ((i133 & 28) << 1)) ^ (-1));
                            f52358r0 = i134 % 128;
                            if (i134 % 2 != 0) {
                                return -1L;
                            }
                            throw null;
                        }
                        int i135 = f52357q0 + 77;
                        f52358r0 = i135 % 128;
                        int i136 = i135 % 2;
                        long j13 = 0;
                        while (true) {
                            int i137 = acjVar2.setX;
                            int i138 = -acjVar2.setCompoundDrawableTintBlendMode;
                            int iIdentityHashCode2 = System.identityHashCode(abxVar2);
                            int i139 = i138 * 765;
                            int i140 = i137 * (-1527);
                            int i141 = i139 & i140;
                            int i142 = ((i139 ^ i140) | i141) << 1;
                            int i143 = -((i139 | i140) & (~i141));
                            int i144 = (i142 ^ i143) + ((i143 & i142) << 1);
                            int i145 = ~iIdentityHashCode2;
                            int i146 = i145 & i138;
                            int i147 = (~i146) & (i145 | i138);
                            int i148 = ~i138;
                            int i149 = (i147 & i146) | (i147 ^ i146);
                            int i150 = ~i149;
                            int i151 = (i149 | i150) & i150;
                            int i152 = (~i151) & i137;
                            int i153 = ~i137;
                            int i154 = i152 | (i151 & i153);
                            int i155 = i151 & i137;
                            int i156 = ((i154 ^ i155) | (i155 & i154)) * 764;
                            abxVar = abxVar2;
                            int i157 = i144 & i156;
                            int i158 = ((i144 ^ i156) | i157) << 1;
                            int i159 = -((~i157) & (i144 | i156));
                            int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                            int i161 = (i148 | i138) & i148;
                            int i162 = (i161 & i153) | ((~i161) & i137);
                            int i163 = i161 & i137;
                            int i164 = ~((i163 & i162) | (i162 ^ i163));
                            int i165 = (i145 ^ i137) | (i145 & i137);
                            int i166 = ~i165;
                            int i167 = (i165 | i166) & i166;
                            int i168 = i164 & i167;
                            b10 = bByteValue;
                            int i169 = (i164 | i167) & (~i168);
                            int i170 = ((i169 & i168) | (i169 ^ i168)) * (-1528);
                            int i171 = i160 & i170;
                            int i172 = -(-(i170 | i160));
                            int i173 = (i171 & i172) + (i172 | i171);
                            int i174 = ~((i137 & i148) | (i148 ^ i137));
                            int i175 = (i153 & i148) | ((~i153) & i138);
                            int i176 = i153 & i138;
                            int i177 = (i175 & i176) | (i175 ^ i176);
                            int i178 = ~i177;
                            int i179 = (i177 | i178) & i178;
                            int i180 = i174 & i179;
                            int i181 = (i174 | i179) & (~i180);
                            int i182 = (i181 & i180) | (i181 ^ i180);
                            int i183 = i145 ^ i138;
                            int i184 = ~((i183 & i146) | (i183 ^ i146));
                            int i185 = i182 & i184;
                            int i186 = (i182 | i184) & (~i185);
                            int i187 = ((i186 & i185) | (i186 ^ i185)) * 764;
                            long j14 = j13 + ((long) ((((i173 ^ i187) | (i173 & i187)) << 1) - ((i187 & (~i173)) | ((~i187) & i173))));
                            if (j14 > jLongValue2) {
                                break;
                            }
                            int i188 = f52358r0;
                            int i189 = i188 & 1;
                            int i190 = ((i188 ^ 1) | i189) << 1;
                            int i191 = -((i188 | 1) & (~i189));
                            int i192 = (i190 ^ i191) + ((i191 & i190) << 1);
                            f52357q0 = i192 % 128;
                            int i193 = i192 % 2;
                            acjVar2 = acjVar2.setDividerPadding;
                            Intrinsics.checkNotNull(acjVar2);
                            int i194 = f52357q0;
                            int i195 = ((i194 & 42) + (i194 | 42)) - 1;
                            f52358r0 = i195 % 128;
                            int i196 = i195 % 2;
                            j13 = j14;
                            abxVar2 = abxVar;
                            bByteValue = b10;
                        }
                        int i197 = f52357q0 + 119;
                        f52358r0 = i197 % 128;
                        if (i197 % 2 == 0) {
                            throw null;
                        }
                        while (j13 < jLongValue3) {
                            int i198 = f52358r0;
                            int i199 = i198 & 105;
                            int i200 = (i198 ^ 105) | i199;
                            int i201 = (i199 & i200) + (i200 | i199);
                            f52357q0 = i201 % 128;
                            if (i201 % 2 != 0) {
                                bArr = acjVar2.setOnFocusChangeListener;
                                iMin = (int) Math.min(acjVar2.setX, (((long) acjVar2.setCompoundDrawableTintBlendMode) ^ jLongValue3) + j13);
                                j10 = (((long) acjVar2.setCompoundDrawableTintBlendMode) & jLongValue2) / j13;
                            } else {
                                bArr = acjVar2.setOnFocusChangeListener;
                                iMin = (int) Math.min(acjVar2.setX, (((long) acjVar2.setCompoundDrawableTintBlendMode) + jLongValue3) - j13);
                                j10 = (((long) acjVar2.setCompoundDrawableTintBlendMode) + jLongValue2) - j13;
                            }
                            int i202 = (int) j10;
                            while (i202 < iMin) {
                                int i203 = f52357q0;
                                int i204 = (i203 & (-12)) | ((~i203) & 11);
                                int i205 = -(-((i203 & 11) << 1));
                                int i206 = (i204 & i205) + (i205 | i204);
                                int i207 = i206 % 128;
                                f52358r0 = i207;
                                if (i206 % 2 == 0) {
                                    byte b11 = bArr[i202];
                                    throw null;
                                }
                                byte b12 = b10;
                                if (bArr[i202] == b12) {
                                    int i208 = i207 | 93;
                                    int i209 = i208 << 1;
                                    int i210 = -(i208 & (~(i207 & 93)));
                                    int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                                    f52357q0 = i211 % 128;
                                    int i212 = i211 % 2;
                                    int i213 = -acjVar2.setCompoundDrawableTintBlendMode;
                                    int iIdentityHashCode3 = System.identityHashCode(abxVar);
                                    int i214 = i213 * 471;
                                    int i215 = -(~(-(-(i202 * 471))));
                                    int i216 = ((i214 | i215) << 1) - (i214 ^ i215);
                                    int i217 = (i216 ^ (-1)) + (i216 << 1);
                                    int i218 = -(-(((i213 ^ i202) | (i213 & i202)) * (-470)));
                                    int i219 = i217 & i218;
                                    int i220 = -(-((i217 ^ i218) | i219));
                                    int i221 = (i219 & i220) + (i220 | i219);
                                    int i222 = ~i213;
                                    int i223 = i222 & (i222 | i213);
                                    int i224 = ~i202;
                                    int i225 = ((~i224) & i223) | ((~i223) & i224);
                                    int i226 = i223 & i224;
                                    int i227 = ~((i226 & i225) | (i225 ^ i226));
                                    int i228 = ~iIdentityHashCode3;
                                    int i229 = ~((i224 ^ iIdentityHashCode3) | (i224 & iIdentityHashCode3));
                                    int i230 = (i227 & i229) | ((~i229) & i227) | ((~i227) & i229);
                                    int i231 = (i228 | iIdentityHashCode3) & i228;
                                    int i232 = (i231 & i213) | (i231 ^ i213);
                                    int i233 = (i232 & i202) | (i232 ^ i202);
                                    int i234 = ~i233;
                                    int i235 = (i233 | i234) & i234;
                                    int i236 = i230 ^ i235;
                                    int i237 = i230 & i235;
                                    int i238 = -(~(((i237 & i236) | (i236 ^ i237)) * (-470)));
                                    int i239 = ((i221 & i238) + (i238 | i221)) - 1;
                                    int i240 = ((i224 | i202) & i224) | i213;
                                    int i241 = (iIdentityHashCode3 & i240) | (i240 & i228) | ((~i240) & iIdentityHashCode3);
                                    int i242 = ~i241;
                                    int i243 = (i241 | i242) & i242;
                                    int i244 = i228 ^ i213;
                                    int i245 = i213 & i228;
                                    int i246 = ~((i245 & i244) | (i244 ^ i245) | i202);
                                    int i247 = -(~(((i246 & i243) | (i243 ^ i246)) * 470));
                                    long j15 = ((long) (((i239 & i247) + (i247 | i239)) - 1)) + j13;
                                    int i248 = f52357q0;
                                    int i249 = (i248 ^ 78) + ((i248 & 78) << 1);
                                    int i250 = (i249 ^ (-1)) + (i249 << 1);
                                    f52358r0 = i250 % 128;
                                    int i251 = i250 % 2;
                                    return Long.valueOf(j15);
                                }
                                int i252 = i202 & 1;
                                i202 = ((i202 ^ 1) | i252) + i252;
                                int i253 = i207 & 39;
                                int i254 = (((i207 | 39) & (~i253)) - (~(i253 << 1))) - 1;
                                f52357q0 = i254 % 128;
                                int i255 = i254 % 2;
                                b10 = b12;
                            }
                            int i256 = acjVar2.setX;
                            int i257 = -acjVar2.setCompoundDrawableTintBlendMode;
                            int iIdentityHashCode4 = System.identityHashCode(abxVar);
                            int i258 = i257 * (-661);
                            int i259 = i256 * (-661);
                            int i260 = (i258 & i259) + (i258 | i259);
                            int i261 = ~iIdentityHashCode4;
                            int i262 = ~i257;
                            int i263 = ~i256;
                            int i264 = ~i263;
                            int i265 = i262 & i263;
                            int i266 = (i262 & i264) | ((~i262) & i263) | i265;
                            int i267 = ~i266;
                            int i268 = (i266 | i267) & i267;
                            int i269 = ((~i261) & i268) | ((~i268) & i261);
                            int i270 = i268 & i261;
                            int i271 = i260 - (~(-(-(((i269 & i270) | (i269 ^ i270)) * 1324))));
                            int i272 = (i271 ^ (-1)) + (i271 << 1);
                            int i273 = i257 & iIdentityHashCode4;
                            int i274 = (~i273) & (i257 | iIdentityHashCode4);
                            int i275 = ~((i273 & i274) | (i274 ^ i273));
                            int i276 = (i261 & i256) | (iIdentityHashCode4 & i263);
                            int i277 = iIdentityHashCode4 & i256;
                            int i278 = ~((i277 & i276) | (i276 ^ i277));
                            int i279 = i275 & i278;
                            int i280 = -(-((((i278 | i275) & (~i279)) | i279) * (-1324)));
                            int i281 = (((i272 ^ i280) | (i272 & i280)) << 1) - ((i280 & (~i272)) | ((~i280) & i272));
                            int i282 = (i262 | i257) & i262;
                            int i283 = (i282 & i263) | ((~i282) & i256);
                            int i284 = i256 & i282;
                            int i285 = ~((i284 & i283) | (i283 ^ i284));
                            int i286 = (i257 & i263) | (i257 & i264) | i265;
                            int i287 = ~i286;
                            int i288 = (i286 | i287) & i287;
                            int i289 = i285 & i288;
                            int i290 = (i285 | i288) & (~i289);
                            int i291 = -(-(((i290 & i289) | (i290 ^ i289)) * 662));
                            j13 += (long) (((i281 & i291) - (~(i291 | i281))) - 1);
                            acjVar2 = acjVar2.setDividerPadding;
                            Intrinsics.checkNotNull(acjVar2);
                            int i292 = f52358r0;
                            int i293 = (i292 ^ 64) + ((i292 & 64) << 1);
                            int i294 = (i293 ^ (-1)) + (i293 << 1);
                            f52357q0 = i294 % 128;
                            int i295 = i294 % 2;
                            b10 = b10;
                            jLongValue2 = j13;
                        }
                        abxVar2 = abxVar;
                    }
                }
                System.identityHashCode(abxVar2);
                System.identityHashCode(abxVar2);
                return -1L;
            }
            System.identityHashCode(abxVar2);
            System.identityHashCode(abxVar2);
            i10 = 1;
        }
        StringBuilder sb2 = new StringBuilder("size=");
        Object[] objArr2 = new Object[i10];
        objArr2[0] = abxVar2;
        sb2.append(((Long) setOnFocusChangeListener(objArr2, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue());
        sb2.append(" fromIndex=");
        sb2.append(jLongValue2);
        sb2.append(" toIndex=");
        sb2.append(jLongValue3);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ abx d(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52358r0 + 103;
        f52357q0 = i10 % 128;
        int i11 = i10 % 2;
        acj x4 = abxVar.setX(1);
        byte[] bArr = x4.setOnFocusChangeListener;
        int i12 = x4.setX;
        int i13 = i12 & 1;
        int i14 = (i12 ^ 1) | i13;
        x4.setX = (i13 ^ i14) + ((i13 & i14) << 1);
        bArr[i12] = (byte) iIntValue;
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + 1);
        int i15 = f52358r0;
        int i16 = ((i15 ^ 8) + ((i15 & 8) << 1)) - 1;
        f52357q0 = i16 % 128;
        if (i16 % 2 == 0) {
            return abxVar;
        }
        throw null;
    }

    public static /* synthetic */ String e(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52357q0 + 109;
        f52358r0 = i10 % 128;
        int i11 = i10 % 2;
        String string = abxVar.o().toString();
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        return string;
    }

    public static /* synthetic */ Long f(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        long jG;
        abx abxVar = (abx) objArr[0];
        abw abwVar = (abw) objArr[1];
        int i10 = f52357q0;
        int i11 = i10 | 11;
        int i12 = ((i11 << 1) - (~(-((~(i10 & 11)) & i11)))) - 1;
        f52358r0 = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abwVar, "");
            jG = abxVar.G(abwVar);
            int i13 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(abwVar, "");
            jG = abxVar.G(abwVar);
        }
        return Long.valueOf(jG);
    }

    public static /* synthetic */ void g(Object[] objArr) throws NoSuchAlgorithmException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52357q0;
        int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
        f52358r0 = i11 % 128;
        if (i11 % 2 != 0) {
            setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue())}, -1525846840, 1525846865, System.identityHashCode(abxVar));
        } else {
            setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue())}, -1525846840, 1525846865, System.identityHashCode(abxVar));
            throw null;
        }
    }

    public static /* synthetic */ abx h(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        String str = (String) objArr[1];
        int i10 = f52357q0;
        int i11 = ((i10 & (-106)) | ((~i10) & 105)) + ((i10 & 105) << 1);
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        abx abxVar2 = (abx) setOnFocusChangeListener(new Object[]{abxVar, str}, -2069576566, 2069576590, System.identityHashCode(abxVar));
        int i13 = f52358r0;
        int i14 = i13 & 37;
        int i15 = ((((i13 ^ 37) | i14) << 1) - (~(-((i13 | 37) & (~i14))))) - 1;
        f52357q0 = i15 % 128;
        if (i15 % 2 == 0) {
            return abxVar2;
        }
        throw null;
    }

    public static /* synthetic */ void i(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        boolean z10;
        abx abxVar = (abx) objArr[0];
        int i10 = 1;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i11 = f52357q0;
        int i12 = i11 + 61;
        f52358r0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 & 55;
        int i15 = ((i11 ^ 55) | i14) << 1;
        int i16 = -((i11 | 55) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f52358r0 = i17 % 128;
        int i18 = i17 % 2;
        while (jLongValue > 0) {
            int i19 = f52358r0;
            int i20 = i19 & 37;
            int i21 = (i20 - (~(-(-((i19 ^ 37) | i20))))) - i10;
            f52357q0 = i21 % 128;
            int i22 = i21 % 2;
            acj acjVar = abxVar.setDividerPadding;
            if (acjVar == null) {
                throw new EOFException();
            }
            int i23 = acjVar.setX;
            int i24 = -acjVar.setCompoundDrawableTintBlendMode;
            int iIdentityHashCode = System.identityHashCode(abxVar);
            int i25 = i24 * 398;
            int i26 = -(-(i23 * (-396)));
            int i27 = ((((~i26) & i25) | ((~i25) & i26)) - (~((i25 & i26) << i10))) - i10;
            int i28 = ~i24;
            int i29 = ~iIdentityHashCode;
            int i30 = (~i29) & i28;
            int i31 = ~i28;
            int i32 = i30 | (i29 & i31);
            int i33 = i28 & i29;
            int i34 = (i32 ^ i33) | (i32 & i33);
            int i35 = ~i34;
            int i36 = (i34 | i35) & i35;
            int i37 = (i28 | i24) & i28;
            int i38 = ~i23;
            int i39 = (i37 & i38) | ((~i37) & i23);
            int i40 = i37 & i23;
            int i41 = (~((i39 ^ i40) | (i39 & i40))) | i36;
            int i42 = i29 & (i29 | iIdentityHashCode);
            int i43 = ~((i42 & i23) | (i42 ^ i23));
            int i44 = i41 & i43;
            int i45 = (i27 - (~((((i41 | i43) & (~i44)) | i44) * (-397)))) - 1;
            int i46 = (~((i28 & i38) | (i23 & i31) | (i28 & i23))) * (-397);
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            int i48 = ~((i37 ^ i23) | i40);
            int i49 = (i48 & iIdentityHashCode) | (iIdentityHashCode ^ i48);
            int i50 = (i38 ^ i24) | (i38 & i24);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = ((~i52) & i49) | ((~i49) & i52);
            int i54 = i49 & i52;
            int i55 = -(-(((i54 & i53) | (i53 ^ i54)) * 397));
            int i56 = i47 & i55;
            int iMin = (int) Math.min(jLongValue, i56 + ((i55 ^ i47) | i56));
            long j10 = iMin;
            abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - j10);
            jLongValue -= j10;
            int i57 = acjVar.setCompoundDrawableTintBlendMode;
            int i58 = (i57 ^ iMin) + ((iMin & i57) << 1);
            acjVar.setCompoundDrawableTintBlendMode = i58;
            if (i58 == acjVar.setX) {
                int i59 = f52358r0;
                int i60 = (((i59 | 54) << 1) - (i59 ^ 54)) - 1;
                f52357q0 = i60 % 128;
                if (i60 % 2 != 0) {
                    abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                    ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                    throw null;
                }
                z10 = false;
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
            } else {
                z10 = false;
            }
            i10 = 1;
        }
        int i61 = f52357q0;
        int i62 = ((i61 | 11) << 1) - (i61 ^ 11);
        f52358r0 = i62 % 128;
        if (i62 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:20:0x00df  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f2  */
    public static /* synthetic */ void j(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        int i10;
        acj acjVar;
        int i11;
        Object onFocusChangeListener;
        abx abxVar = (abx) objArr[0];
        abx abxVar2 = (abx) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i12 = (-2) - ((f52357q0 + 96) ^ (-1));
        f52358r0 = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(abxVar2, "");
        if (abxVar2 != abxVar) {
            int i14 = f52358r0;
            int i15 = i14 ^ 17;
            int i16 = ((((i14 & 17) | i15) << 1) - (~(-i15))) - 1;
            f52357q0 = i16 % 128;
            if (i16 % 2 == 0) {
                acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue()), 0L, Long.valueOf(jLongValue)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
                int i17 = f52358r0 + 119;
                f52357q0 = i17 % 128;
                int i18 = i17 % 2;
                for (long j10 = 0; jLongValue > j10; j10 = 0) {
                    int i19 = f52358r0;
                    int i20 = i19 ^ 11;
                    int i21 = ((((i19 & 11) | i20) << 1) - (~(-i20))) - 1;
                    f52357q0 = i21 % 128;
                    int i22 = i21 % 2;
                    acj acjVar2 = abxVar2.setDividerPadding;
                    Intrinsics.checkNotNull(acjVar2);
                    int i23 = acjVar2.setX;
                    acj acjVar3 = abxVar2.setDividerPadding;
                    Intrinsics.checkNotNull(acjVar3);
                    int i24 = -acjVar3.setCompoundDrawableTintBlendMode;
                    if (jLongValue < (i23 & i24) + (i23 | i24)) {
                        int i25 = f52358r0;
                        int i26 = i25 & 105;
                        int i27 = ((i25 ^ 105) | i26) << 1;
                        int i28 = -((i25 | 105) & (~i26));
                        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                        int i30 = i29 % 128;
                        f52357q0 = i30;
                        if (i29 % 2 != 0) {
                            int i31 = 77 / 0;
                            if (abxVar.setDividerPadding != null) {
                                i10 = (i30 & 121) + (i30 | 121);
                                f52358r0 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    acj acjVar4 = abxVar.setDividerPadding;
                                    Intrinsics.checkNotNull(acjVar4);
                                    acjVar = acjVar4.setOnDragListener;
                                    int i32 = 85 / 0;
                                } else {
                                    acj acjVar5 = abxVar.setDividerPadding;
                                    Intrinsics.checkNotNull(acjVar5);
                                    acjVar = acjVar5.setOnDragListener;
                                }
                            } else {
                                int i33 = i30 & 75;
                                int i34 = i33 + ((i30 ^ 75) | i33);
                                f52358r0 = i34 % 128;
                                int i35 = i34 % 2;
                                acjVar = null;
                            }
                        } else if (abxVar.setDividerPadding != null) {
                            i10 = (i30 & 121) + (i30 | 121);
                            f52358r0 = i10 % 128;
                            if (i10 % 2 == 0) {
                                acj acjVar6 = abxVar.setDividerPadding;
                                Intrinsics.checkNotNull(acjVar6);
                                acjVar = acjVar6.setOnDragListener;
                                int i36 = 85 / 0;
                            } else {
                                acj acjVar7 = abxVar.setDividerPadding;
                                Intrinsics.checkNotNull(acjVar7);
                                acjVar = acjVar7.setOnDragListener;
                            }
                        } else {
                            int i37 = i30 & 75;
                            int i38 = i37 + ((i30 ^ 75) | i37);
                            f52358r0 = i38 % 128;
                            int i39 = i38 % 2;
                            acjVar = null;
                        }
                        if (acjVar != null) {
                            int i40 = f52357q0 + 51;
                            int i41 = i40 % 128;
                            f52358r0 = i41;
                            if (i40 % 2 == 0) {
                                throw null;
                            }
                            if (acjVar.setY) {
                                long j11 = ((long) acjVar.setX) + jLongValue;
                                if (acjVar.setLayoutAnimation) {
                                    int i42 = i41 + 33;
                                    f52357q0 = i42 % 128;
                                    int i43 = i42 % 2;
                                    int i44 = i41 & 29;
                                    int i45 = (((~i44) & (i41 | 29)) - (~(i44 << 1))) - 1;
                                    f52357q0 = i45 % 128;
                                    int i46 = i45 % 2;
                                    i11 = 0;
                                } else {
                                    i11 = acjVar.setCompoundDrawableTintBlendMode;
                                    int i47 = i41 + 119;
                                    f52357q0 = i47 % 128;
                                    int i48 = i47 % 2;
                                }
                                if (j11 - ((long) i11) <= SvgConstantsKt.SPECIFIED_FONT_FAMILY) {
                                    int i49 = i41 & 53;
                                    int i50 = (i41 ^ 53) | i49;
                                    int i51 = (i49 & i50) + (i49 | i50);
                                    f52357q0 = i51 % 128;
                                    if (i51 % 2 != 0) {
                                        acj acjVar8 = abxVar2.setDividerPadding;
                                        Intrinsics.checkNotNull(acjVar8);
                                        int i52 = (int) jLongValue;
                                        acj.setX(new Object[]{acjVar8, acjVar, Integer.valueOf(i52)}, 2001370252, -2001370251, i52);
                                        abxVar2.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() * jLongValue);
                                        onFocusChangeListener = setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar));
                                    } else {
                                        acj acjVar9 = abxVar2.setDividerPadding;
                                        Intrinsics.checkNotNull(acjVar9);
                                        int i53 = (int) jLongValue;
                                        acj.setX(new Object[]{acjVar9, acjVar, Integer.valueOf(i53)}, 2001370252, -2001370251, i53);
                                        abxVar2.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() - jLongValue);
                                        onFocusChangeListener = setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar));
                                    }
                                    abxVar.setX(((Long) onFocusChangeListener).longValue() + jLongValue);
                                    return;
                                }
                            }
                        }
                        acj acjVar10 = abxVar2.setDividerPadding;
                        Intrinsics.checkNotNull(acjVar10);
                        int i54 = (int) jLongValue;
                        abxVar2.setDividerPadding = (acj) acj.setX(new Object[]{acjVar10, Integer.valueOf(i54)}, 1479174834, -1479174829, i54);
                        int i55 = f52357q0;
                        int i56 = i55 & 47;
                        int i57 = -(-((i55 ^ 47) | i56));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        f52358r0 = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    acj acjVar11 = abxVar2.setDividerPadding;
                    Intrinsics.checkNotNull(acjVar11);
                    int i60 = acjVar11.setX;
                    int i61 = -acjVar11.setCompoundDrawableTintBlendMode;
                    int i62 = ((i60 ^ i61) | (i60 & i61)) << 1;
                    int i63 = -(((~i60) & i61) | ((~i61) & i60));
                    long j12 = (i62 & i63) + (i63 | i62);
                    abxVar2.setDividerPadding = (acj) acj.setX(new Object[]{acjVar11}, -1022523986, 1022523990, System.identityHashCode(acjVar11));
                    acj acjVar12 = abxVar.setDividerPadding;
                    if (acjVar12 == null) {
                        int i64 = f52357q0;
                        int i65 = i64 & 1;
                        int i66 = i64 | 1;
                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                        f52358r0 = i67 % 128;
                        if (i67 % 2 == 0) {
                            abxVar.setDividerPadding = acjVar11;
                            acjVar11.setOnDragListener = acjVar11;
                            acjVar11.setDividerPadding = acjVar11;
                            int i68 = 56 / 0;
                        } else {
                            abxVar.setDividerPadding = acjVar11;
                            acjVar11.setOnDragListener = acjVar11;
                            acjVar11.setDividerPadding = acjVar11;
                        }
                    } else {
                        Intrinsics.checkNotNull(acjVar12);
                        acj acjVar13 = acjVar12.setOnDragListener;
                        Intrinsics.checkNotNull(acjVar13);
                        acj acjVar14 = (acj) acj.setX(new Object[]{acjVar13, acjVar11}, -672690444, 672690446, System.identityHashCode(acjVar13));
                        acj.setX(new Object[]{acjVar14}, -424301312, 424301315, System.identityHashCode(acjVar14));
                        int i69 = f52358r0;
                        int i70 = i69 | 51;
                        int i71 = i70 << 1;
                        int i72 = -((~(i69 & 51)) & i70);
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        f52357q0 = i73 % 128;
                        int i74 = i73 % 2;
                    }
                    abxVar2.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() - j12);
                    abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j12);
                    jLongValue -= j12;
                    int i75 = f52358r0 + 114;
                    int i76 = (i75 ^ (-1)) + (i75 << 1);
                    f52357q0 = i76 % 128;
                    int i77 = i76 % 2;
                }
                int i78 = f52357q0;
                int i79 = i78 ^ 33;
                int i80 = ((((i78 & 33) | i79) << 1) - (~(-i79))) - 1;
                f52358r0 = i80 % 128;
                if (i80 % 2 == 0) {
                    throw null;
                }
                return;
            }
        } else {
            int i81 = f52357q0;
            int i82 = ((i81 ^ 45) - (~((i81 & 45) << 1))) - 1;
            f52358r0 = i82 % 128;
            int i83 = i82 % 2;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static /* synthetic */ Short k(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52357q0 + 99;
        f52358r0 = i10 % 128;
        int i11 = i10 % 2;
        if (((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() < 2) {
            throw new EOFException();
        }
        acj acjVar = abxVar.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        int i12 = acjVar.setCompoundDrawableTintBlendMode;
        int i13 = acjVar.setX;
        int i14 = -i12;
        int iIdentityHashCode = System.identityHashCode(abxVar);
        int i15 = i14 * 784;
        int i16 = i13 * (-782);
        int i17 = ((i15 ^ i16) | (i15 & i16)) << 1;
        int i18 = -(((~i16) & i15) | ((~i15) & i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        int i20 = ~i13;
        int i21 = i20 * (-783);
        int i22 = i19 & i21;
        int i23 = (i22 - (~((i19 ^ i21) | i22))) - 1;
        int i24 = ~i14;
        int i25 = (i14 | i24) & i24;
        int i26 = ~iIdentityHashCode;
        int i27 = i25 & i26;
        int i28 = (~i27) & (i25 | i26);
        int i29 = (i28 & i27) | (i28 ^ i27);
        int i30 = i29 & i13;
        int i31 = (i29 | i13) & (~i30);
        int i32 = (~((i31 & i30) | (i31 ^ i30))) * (-783);
        int i33 = ((i23 | i32) << 1) - (i32 ^ i23);
        int i34 = (i26 | iIdentityHashCode) & i26;
        int i35 = ~((i34 & i13) | (i20 & i34) | ((~i34) & i13));
        int i36 = ((~i35) & i24) | ((~i24) & i35);
        int i37 = i35 & i24;
        int i38 = ((i37 & i36) | (i36 ^ i37)) * 783;
        if ((((~i38) & i33) | ((~i33) & i38)) + ((i38 & i33) << 1) < 2) {
            int i39 = f52358r0;
            int i40 = ((((i39 ^ 39) | (i39 & 39)) << 1) - (~(-(((~i39) & 39) | (i39 & (-40)))))) - 1;
            f52357q0 = i40 % 128;
            int i41 = i40 % 2;
            int iByteValue = (((Byte) setOnFocusChangeListener(new Object[]{abxVar}, 33298663, -33298647, System.identityHashCode(abxVar))).byteValue() & 255) << 8;
            int iByteValue2 = ((Byte) setOnFocusChangeListener(new Object[]{abxVar}, 33298663, -33298647, System.identityHashCode(abxVar))).byteValue() & 255;
            int i42 = iByteValue ^ iByteValue2;
            int i43 = iByteValue2 & iByteValue;
            short s4 = (short) ((i43 & i42) | (i42 ^ i43));
            int i44 = f52358r0;
            int i45 = (i44 ^ 51) + ((i44 & 51) << 1);
            f52357q0 = i45 % 128;
            if (i45 % 2 == 0) {
                return Short.valueOf(s4);
            }
            int i46 = 5 / 0;
            return Short.valueOf(s4);
        }
        byte[] bArr = acjVar.setOnFocusChangeListener;
        int iIdentityHashCode2 = System.identityHashCode(abxVar);
        int i47 = i12 * (-68);
        int i48 = (((~i47) & 70) | (i47 & (-71))) + ((i47 & 70) << 1);
        int i49 = ~i12;
        int i50 = (i49 | i12) & i49;
        int i51 = (-2) & i50;
        int i52 = (i50 | (-2)) & (~i51);
        int i53 = (i52 & i51) | (i52 ^ i51);
        int i54 = ~iIdentityHashCode2;
        int i55 = ((~i53) & iIdentityHashCode2) | (i53 & i54);
        int i56 = i53 & iIdentityHashCode2;
        int i57 = ~((i55 & i56) | (i55 ^ i56));
        int i58 = i12 & 1;
        int i59 = i58 | ((~i58) & (i12 | 1));
        int i60 = i59 ^ iIdentityHashCode2;
        int i61 = i59 & iIdentityHashCode2;
        int i62 = ~((i60 ^ i61) | (i61 & i60));
        int i63 = ((i57 & i62) | ((~i57) & i62) | ((~i62) & i57)) * 69;
        int i64 = (i48 & i63) + (i63 | i48);
        int i65 = (-2) & i12;
        int i66 = (~i65) & ((-2) | i12);
        int i67 = (i65 & i66) | (i66 ^ i65);
        int i68 = ~i67;
        int i69 = (i67 | i68) & i68;
        int i70 = ((-2) & i54) | (iIdentityHashCode2 & 1);
        int i71 = (-2) & iIdentityHashCode2;
        int i72 = (i70 & i71) | (i70 ^ i71);
        int i73 = ~i72;
        int i74 = (i72 | i73) & i73;
        int i75 = (i69 & i74) | (i69 ^ i74);
        int i76 = ~((iIdentityHashCode2 & i12) | (i12 & i54) | (iIdentityHashCode2 & i49));
        int i77 = ((~i76) & i75) | ((~i75) & i76);
        int i78 = i75 & i76;
        int i79 = ((i78 & i77) | (i77 ^ i78)) * (-69);
        int i80 = i64 & i79;
        int i81 = (i79 ^ i64) | i80;
        int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
        int i83 = (i49 & (-2)) | ((~i49) & 1);
        int i84 = i49 & 1;
        int i85 = -(-((~((i83 & i84) | (i83 ^ i84))) * 69));
        int i86 = i82 & i85;
        int i87 = (i86 - (~((i85 ^ i82) | i86))) - 1;
        int i88 = (bArr[i12] & 255) << 8;
        int i89 = (i87 ^ 1) + ((i87 & 1) << 1);
        int i90 = bArr[i87] & 255;
        int i91 = i88 & i90;
        int i92 = (i88 | i90) & (~i91);
        int i93 = (i92 & i91) | (i92 ^ i91);
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - 2);
        if (i89 == i13) {
            int i94 = f52357q0;
            int i95 = i94 & 63;
            int i96 = -(-((i94 ^ 63) | i95));
            int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
            f52358r0 = i97 % 128;
            if (i97 % 2 == 0) {
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                throw null;
            }
            abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
            ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
        } else {
            acjVar.setCompoundDrawableTintBlendMode = i89;
            int i98 = f52358r0;
            int i99 = i98 | 19;
            int i100 = i99 << 1;
            int i101 = -((~(i98 & 19)) & i99);
            int i102 = (i100 & i101) + (i101 | i100);
            f52357q0 = i102 % 128;
            int i103 = i102 % 2;
        }
        short s7 = (short) i93;
        int i104 = f52357q0;
        int i105 = (i104 ^ 49) + ((i104 & 49) << 1);
        f52358r0 = i105 % 128;
        int i106 = i105 % 2;
        return Short.valueOf(s7);
    }

    public static /* synthetic */ abx l(Object[] objArr) {
        abx abxVar = (abx) objArr[0];
        int i10 = f52358r0;
        int i11 = (i10 & (-20)) | ((~i10) & 19);
        int i12 = -(-((i10 & 19) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f52357q0 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i15 = i14 & 27;
        int i16 = (i15 - (~(-(-((i14 ^ 27) | i15))))) - 1;
        f52358r0 = i16 % 128;
        int i17 = i16 % 2;
        return abxVar;
    }

    public static /* synthetic */ Short m(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52357q0;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        short sShortValue = ((Short) acv.setOnFocusChangeListener(new Object[]{Short.valueOf(((Short) setOnFocusChangeListener(new Object[]{abxVar}, -998075784, 998075787, System.identityHashCode(abxVar))).shortValue())}, 1644758047, -1644758041, (int) System.currentTimeMillis())).shortValue();
        int i13 = f52357q0;
        int i14 = (i13 & 67) + (i13 | 67);
        f52358r0 = i14 % 128;
        if (i14 % 2 != 0) {
            return Short.valueOf(sShortValue);
        }
        int i15 = 3 / 0;
        return Short.valueOf(sShortValue);
    }

    public static /* synthetic */ String p(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        Charset charset = (Charset) objArr[2];
        int i10 = f52358r0;
        int i11 = ((i10 ^ 69) - (~(-(-((i10 & 69) << 1))))) - 1;
        f52357q0 = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(charset, "");
        if (jLongValue >= 0) {
            int i13 = f52358r0;
            int i14 = i13 ^ 53;
            int i15 = ((i13 & 53) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f52357q0 = i17 % 128;
            int i18 = i17 % 2;
            if (jLongValue <= 2147483647L) {
                int i19 = ((i13 | 59) << 1) - (i13 ^ 59);
                f52357q0 = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i13 + 47;
                f52357q0 = i21 % 128;
                int i22 = i21 % 2;
                if (abxVar.f52359p0 < jLongValue) {
                    throw new EOFException();
                }
                if (jLongValue == 0) {
                    int i23 = ((i13 | 29) << 1) - (i13 ^ 29);
                    f52357q0 = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = (i13 ^ 21) + ((i13 & 21) << 1);
                    f52357q0 = i25 % 128;
                    int i26 = i25 % 2;
                    return "";
                }
                acj acjVar = abxVar.setDividerPadding;
                Intrinsics.checkNotNull(acjVar);
                int i27 = acjVar.setCompoundDrawableTintBlendMode;
                if (((long) i27) + jLongValue > acjVar.setX) {
                    String str = new String((byte[]) setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(jLongValue)}, 1697003307, -1697003267, System.identityHashCode(abxVar)), charset);
                    int i28 = f52358r0;
                    int i29 = ((i28 | 123) << 1) - (i28 ^ 123);
                    f52357q0 = i29 % 128;
                    int i30 = i29 % 2;
                    return str;
                }
                int i31 = (int) jLongValue;
                String str2 = new String(acjVar.setOnFocusChangeListener, i27, i31, charset);
                int i32 = acjVar.setCompoundDrawableTintBlendMode;
                int iIdentityHashCode = System.identityHashCode(abxVar);
                int i33 = i31 * (-55);
                int i34 = -(-(i32 * (-55)));
                int i35 = i33 | i34;
                int i36 = (i35 << 1) - ((~(i33 & i34)) & i35);
                int i37 = i31 ^ iIdentityHashCode;
                int i38 = i31 & iIdentityHashCode;
                int i39 = (i37 & i38) | (i37 ^ i38);
                int i40 = ~i39;
                int i41 = (i39 | i40) & i40;
                int i42 = -(-(((i41 & i32) | (i32 ^ i41)) * 56));
                int i43 = i36 & i42;
                int i44 = i43 + ((i42 ^ i36) | i43);
                int i45 = (~i32) & i31;
                int i46 = ~i31;
                int i47 = i45 | (i32 & i46);
                int i48 = i31 & i32;
                int i49 = (i47 & i48) | (i47 ^ i48);
                int i50 = ~i49;
                int i51 = (((i49 | i50) & i50) * (-56)) + i44;
                int i52 = ~iIdentityHashCode;
                int i53 = i52 ^ i32;
                int i54 = i32 & i52;
                int i55 = (i54 & i53) | (i53 ^ i54);
                int i56 = ~i55;
                int i57 = (i55 | i56) & i56;
                int i58 = ((~i57) & i31) | (i57 & i46);
                int i59 = i57 & i31;
                int i60 = -(~(-(-(((i59 & i58) | (i58 ^ i59)) * 56))));
                int i61 = (((i51 | i60) << 1) - (i60 ^ i51)) - 1;
                acjVar.setCompoundDrawableTintBlendMode = i61;
                abxVar.f52359p0 -= jLongValue;
                if (i61 == acjVar.setX) {
                    int i62 = f52358r0;
                    int i63 = (((i62 & (-62)) | ((~i62) & 61)) - (~(-(-((i62 & 61) << 1))))) - 1;
                    f52357q0 = i63 % 128;
                    if (i63 % 2 != 0) {
                        abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                        ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                        throw null;
                    }
                    abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                    ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                    int i64 = f52358r0 + 23;
                    f52357q0 = i64 % 128;
                    int i65 = i64 % 2;
                }
                System.identityHashCode(abxVar);
                System.identityHashCode(abxVar);
                return str2;
            }
        }
        int i66 = f52357q0 + 53;
        f52358r0 = i66 % 128;
        int i67 = i66 % 2;
        throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(jLongValue)).toString());
    }

    public static /* synthetic */ abw q(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52357q0;
        int i11 = (i10 & 65) + (i10 | 65);
        f52358r0 = i11 % 128;
        if (i11 % 2 == 0) {
            abxVar.setY(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue());
            throw null;
        }
        abw y7 = abxVar.setY(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue());
        int i12 = f52357q0 + 7;
        f52358r0 = i12 % 128;
        if (i12 % 2 != 0) {
            return y7;
        }
        throw null;
    }

    public static /* synthetic */ abx r(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f52357q0;
        int i11 = i10 & 101;
        int i12 = (i11 - (~((i10 ^ 101) | i11))) - 1;
        f52358r0 = i12 % 128;
        int i13 = i12 % 2;
        abx alwaysDrawnWithCacheEnabled = abxVar.setAlwaysDrawnWithCacheEnabled(jLongValue);
        int i14 = f52357q0;
        int i15 = i14 & 13;
        int i16 = (i15 - (~(-(-((i14 ^ 13) | i15))))) - 1;
        f52358r0 = i16 % 128;
        if (i16 % 2 != 0) {
            return alwaysDrawnWithCacheEnabled;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00db  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0127  */
    /* JADX WARN: Code duplicated, block: B:29:0x012b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0139  */
    /* JADX WARN: Code duplicated, block: B:35:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x013e A[SYNTHETIC] */
    public static /* synthetic */ Long s(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        abx abxVar = (abx) objArr[0];
        int i16 = f52358r0;
        int i17 = i16 & 21;
        int i18 = -(-((i16 ^ 21) | i17));
        int i19 = i17 ^ i18;
        int i20 = i18 & i17;
        int i21 = 1;
        int i22 = i19 + (i20 << 1);
        f52357q0 = i22 % 128;
        int i23 = 2;
        long j11 = 0;
        if (i22 % 2 == 0 ? ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() == 0 : ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() == 0) {
            throw new EOFException();
        }
        int i24 = f52357q0;
        int i25 = (((i24 ^ 99) | (i24 & 99)) << 1) - (((~i24) & 99) | (i24 & (-100)));
        f52358r0 = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 0;
        boolean z10 = false;
        long j12 = 0;
        while (true) {
            acj acjVar = abxVar.setDividerPadding;
            Intrinsics.checkNotNull(acjVar);
            byte[] bArr = acjVar.setOnFocusChangeListener;
            int i28 = acjVar.setCompoundDrawableTintBlendMode;
            int i29 = acjVar.setX;
            int i30 = f52357q0;
            int i31 = i30 & 35;
            int i32 = (~i31) & (i30 | 35);
            int i33 = -(-(i31 << i21));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f52358r0 = i34 % 128;
            int i35 = i34 % i23;
            while (true) {
                if (i28 < i29) {
                    System.identityHashCode(abxVar);
                    System.identityHashCode(abxVar);
                    byte b10 = bArr[i28];
                    if (b10 >= 48) {
                        int i36 = f52358r0;
                        int i37 = (i36 | 73) << 1;
                        int i38 = -(i36 ^ 73);
                        int i39 = (i37 & i38) + (i37 | i38);
                        f52357q0 = i39 % 128;
                        int i40 = i39 % i23;
                        if (b10 <= 57) {
                            int i41 = i36 & 87;
                            int i42 = (i36 ^ 87) | i41;
                            int i43 = (i41 ^ i42) + ((i41 & i42) << i21);
                            f52357q0 = i43 % 128;
                            int i44 = i43 % i23;
                            int i45 = b10 & (-48);
                            int i46 = ((b10 ^ (-48)) | i45) << i21;
                            int i47 = -((~i45) & (b10 | (-48)));
                            i12 = (i46 & i47) + (i46 | i47);
                            int i48 = i36 + 15;
                            f52357q0 = i48 % 128;
                            int i49 = i48 % i23;
                        } else if (b10 >= 97) {
                            i13 = f52357q0;
                            int i50 = i13 + 45;
                            f52358r0 = i50 % 128;
                            int i51 = i50 % i23;
                            if (b10 <= 102) {
                                int i52 = i13 & 81;
                                int i53 = (i13 | 81) & (~i52);
                                int i54 = i52 << i21;
                                i14 = (i53 ^ i54) + ((i53 & i54) << i21);
                                f52358r0 = i14 % 128;
                                if (i14 % i23 == 0) {
                                    int i55 = b10 ^ (-35);
                                    int i56 = -(-((b10 & (-35)) << i21));
                                    i15 = ((i55 ^ i56) + ((i55 & i56) << i21)) >>> 52;
                                } else {
                                    int i57 = b10 & (-97);
                                    int i58 = ((b10 ^ (-97)) | i57) << i21;
                                    int i59 = -((~i57) & (b10 | (-97)));
                                    int i60 = (i58 ^ i59) + ((i58 & i59) << i21);
                                    i15 = ((i60 & (-11)) | ((~i60) & 10)) + ((i60 & 10) << i21);
                                }
                                i12 = i15;
                            } else {
                                if (b10 >= 65) {
                                    int i61 = f52358r0;
                                    i10 = (i61 & 53) + (i61 | 53);
                                    i11 = i10 % 128;
                                    f52357q0 = i11;
                                    if (i10 % i23 != 0) {
                                        if (b10 > 12) {
                                        }
                                        int i62 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                        int i63 = i62 % 128;
                                        f52358r0 = i63;
                                        int i64 = i62 % i23;
                                        int i65 = b10 & (-65);
                                        int i66 = b10 | (-65);
                                        int i67 = (i65 ^ i66) + ((i65 & i66) << i21);
                                        int i68 = ((i67 | 11) << i21) - (i67 ^ 11);
                                        i12 = (i68 ^ (-1)) + (i68 << i21);
                                        int i69 = (i63 ^ 101) + ((i63 & 101) << i21);
                                        f52357q0 = i69 % 128;
                                        int i70 = i69 % i23;
                                    } else {
                                        if (b10 > 70) {
                                        }
                                        int i610 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                        int i611 = i610 % 128;
                                        f52358r0 = i611;
                                        int i612 = i610 % i23;
                                        int i613 = b10 & (-65);
                                        int i614 = b10 | (-65);
                                        int i615 = (i613 ^ i614) + ((i613 & i614) << i21);
                                        int i616 = ((i615 | 11) << i21) - (i615 ^ 11);
                                        i12 = (i616 ^ (-1)) + (i616 << i21);
                                        int i617 = (i611 ^ 101) + ((i611 & 101) << i21);
                                        f52357q0 = i617 % 128;
                                        int i71 = i617 % i23;
                                    }
                                }
                                j10 = 0;
                                if (i27 != 0) {
                                    throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", (String) acv.setOnFocusChangeListener(new Object[]{Byte.valueOf(b10)}, 178239610, -178239609, (int) System.currentTimeMillis())));
                                }
                                int i72 = f52357q0;
                                int i73 = i72 & 119;
                                int i74 = i73 + ((i72 ^ 119) | i73);
                                f52358r0 = i74 % 128;
                                int i75 = i74 % 2;
                                z10 = true;
                            }
                        } else {
                            if (b10 >= 65) {
                                int i618 = f52358r0;
                                i10 = (i618 & 53) + (i618 | 53);
                                i11 = i10 % 128;
                                f52357q0 = i11;
                                if (i10 % i23 != 0) {
                                    if (b10 > 12) {
                                    }
                                    int i619 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                    int i6110 = i619 % 128;
                                    f52358r0 = i6110;
                                    int i6111 = i619 % i23;
                                    int i6112 = b10 & (-65);
                                    int i6113 = b10 | (-65);
                                    int i6114 = (i6112 ^ i6113) + ((i6112 & i6113) << i21);
                                    int i6115 = ((i6114 | 11) << i21) - (i6114 ^ 11);
                                    i12 = (i6115 ^ (-1)) + (i6115 << i21);
                                    int i6116 = (i6110 ^ 101) + ((i6110 & 101) << i21);
                                    f52357q0 = i6116 % 128;
                                    int i76 = i6116 % i23;
                                } else {
                                    if (b10 > 70) {
                                    }
                                    int i6117 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                    int i6118 = i6117 % 128;
                                    f52358r0 = i6118;
                                    int i6119 = i6117 % i23;
                                    int i61110 = b10 & (-65);
                                    int i61111 = b10 | (-65);
                                    int i61112 = (i61110 ^ i61111) + ((i61110 & i61111) << i21);
                                    int i61113 = ((i61112 | 11) << i21) - (i61112 ^ 11);
                                    i12 = (i61113 ^ (-1)) + (i61113 << i21);
                                    int i61114 = (i6118 ^ 101) + ((i6118 & 101) << i21);
                                    f52357q0 = i61114 % 128;
                                    int i77 = i61114 % i23;
                                }
                            }
                            j10 = 0;
                            if (i27 != 0) {
                                throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", (String) acv.setOnFocusChangeListener(new Object[]{Byte.valueOf(b10)}, 178239610, -178239609, (int) System.currentTimeMillis())));
                            }
                            int i78 = f52357q0;
                            int i79 = i78 & 119;
                            int i710 = i79 + ((i78 ^ 119) | i79);
                            f52358r0 = i710 % 128;
                            int i711 = i710 % 2;
                            z10 = true;
                        }
                    } else if (b10 >= 97) {
                        i13 = f52357q0;
                        int i510 = i13 + 45;
                        f52358r0 = i510 % 128;
                        int i511 = i510 % i23;
                        if (b10 <= 102) {
                            int i512 = i13 & 81;
                            int i513 = (i13 | 81) & (~i512);
                            int i514 = i512 << i21;
                            i14 = (i513 ^ i514) + ((i513 & i514) << i21);
                            f52358r0 = i14 % 128;
                            if (i14 % i23 == 0) {
                                int i515 = b10 ^ (-35);
                                int i516 = -(-((b10 & (-35)) << i21));
                                i15 = ((i515 ^ i516) + ((i515 & i516) << i21)) >>> 52;
                            } else {
                                int i517 = b10 & (-97);
                                int i518 = ((b10 ^ (-97)) | i517) << i21;
                                int i519 = -((~i517) & (b10 | (-97)));
                                int i620 = (i518 ^ i519) + ((i518 & i519) << i21);
                                i15 = ((i620 & (-11)) | ((~i620) & 10)) + ((i620 & 10) << i21);
                            }
                            i12 = i15;
                        } else {
                            if (b10 >= 65) {
                                int i6120 = f52358r0;
                                i10 = (i6120 & 53) + (i6120 | 53);
                                i11 = i10 % 128;
                                f52357q0 = i11;
                                if (i10 % i23 != 0) {
                                    if (b10 > 12) {
                                    }
                                    int i61115 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                    int i61116 = i61115 % 128;
                                    f52358r0 = i61116;
                                    int i61117 = i61115 % i23;
                                    int i61118 = b10 & (-65);
                                    int i61119 = b10 | (-65);
                                    int i611110 = (i61118 ^ i61119) + ((i61118 & i61119) << i21);
                                    int i611111 = ((i611110 | 11) << i21) - (i611110 ^ 11);
                                    i12 = (i611111 ^ (-1)) + (i611111 << i21);
                                    int i611112 = (i61116 ^ 101) + ((i61116 & 101) << i21);
                                    f52357q0 = i611112 % 128;
                                    int i712 = i611112 % i23;
                                } else {
                                    if (b10 > 70) {
                                    }
                                    int i611113 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                    int i611114 = i611113 % 128;
                                    f52358r0 = i611114;
                                    int i611115 = i611113 % i23;
                                    int i611116 = b10 & (-65);
                                    int i611117 = b10 | (-65);
                                    int i611118 = (i611116 ^ i611117) + ((i611116 & i611117) << i21);
                                    int i611119 = ((i611118 | 11) << i21) - (i611118 ^ 11);
                                    i12 = (i611119 ^ (-1)) + (i611119 << i21);
                                    int i6111110 = (i611114 ^ 101) + ((i611114 & 101) << i21);
                                    f52357q0 = i6111110 % 128;
                                    int i713 = i6111110 % i23;
                                }
                            }
                            j10 = 0;
                            if (i27 != 0) {
                                throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", (String) acv.setOnFocusChangeListener(new Object[]{Byte.valueOf(b10)}, 178239610, -178239609, (int) System.currentTimeMillis())));
                            }
                            int i714 = f52357q0;
                            int i715 = i714 & 119;
                            int i716 = i715 + ((i714 ^ 119) | i715);
                            f52358r0 = i716 % 128;
                            int i717 = i716 % 2;
                            z10 = true;
                        }
                    } else {
                        if (b10 >= 65) {
                            int i6121 = f52358r0;
                            i10 = (i6121 & 53) + (i6121 | 53);
                            i11 = i10 % 128;
                            f52357q0 = i11;
                            if (i10 % i23 != 0) {
                                if (b10 > 12) {
                                }
                                int i6111111 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                int i6111112 = i6111111 % 128;
                                f52358r0 = i6111112;
                                int i6111113 = i6111111 % i23;
                                int i6111114 = b10 & (-65);
                                int i6111115 = b10 | (-65);
                                int i6111116 = (i6111114 ^ i6111115) + ((i6111114 & i6111115) << i21);
                                int i6111117 = ((i6111116 | 11) << i21) - (i6111116 ^ 11);
                                i12 = (i6111117 ^ (-1)) + (i6111117 << i21);
                                int i6111118 = (i6111112 ^ 101) + ((i6111112 & 101) << i21);
                                f52357q0 = i6111118 % 128;
                                int i718 = i6111118 % i23;
                            } else {
                                if (b10 > 70) {
                                }
                                int i6111119 = ((i11 ^ 64) + ((i11 & 64) << i21)) - 1;
                                int i61111110 = i6111119 % 128;
                                f52358r0 = i61111110;
                                int i61111111 = i6111119 % i23;
                                int i61111112 = b10 & (-65);
                                int i61111113 = b10 | (-65);
                                int i61111114 = (i61111112 ^ i61111113) + ((i61111112 & i61111113) << i21);
                                int i61111115 = ((i61111114 | 11) << i21) - (i61111114 ^ 11);
                                i12 = (i61111115 ^ (-1)) + (i61111115 << i21);
                                int i61111116 = (i61111110 ^ 101) + ((i61111110 & 101) << i21);
                                f52357q0 = i61111116 % 128;
                                int i719 = i61111116 % i23;
                            }
                        }
                        j10 = 0;
                        if (i27 != 0) {
                            throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", (String) acv.setOnFocusChangeListener(new Object[]{Byte.valueOf(b10)}, 178239610, -178239609, (int) System.currentTimeMillis())));
                        }
                        int i7110 = f52357q0;
                        int i7111 = i7110 & 119;
                        int i7112 = i7111 + ((i7110 ^ 119) | i7111);
                        f52358r0 = i7112 % 128;
                        int i7113 = i7112 % 2;
                        z10 = true;
                    }
                    if ((j12 & (-1152921504606846976L)) != 0) {
                        Object[] objArr2 = new Object[i23];
                        objArr2[0] = new abx().setAlwaysDrawnWithCacheEnabled(j12);
                        objArr2[1] = Integer.valueOf(b10);
                        throw new NumberFormatException(Intrinsics.stringPlus("Number too large: ", ((abx) setOnFocusChangeListener(objArr2, 1433477211, -1433477201, b10)).setTextAlignment()));
                    }
                    j12 = (j12 << 4) | ((long) i12);
                    int iIdentityHashCode = System.identityHashCode(abxVar);
                    int i80 = i28 * (-49);
                    int i81 = 51 & i80;
                    int i82 = ((51 ^ i80) | i81) << i21;
                    int i83 = -((i80 | 51) & (~i81));
                    int i84 = ((i82 | i83) << i21) - (i83 ^ i82);
                    int i85 = iIdentityHashCode ^ 1;
                    int i86 = iIdentityHashCode & 1;
                    int i87 = ((i85 & i86) | (i85 ^ i86)) * (-50);
                    int i88 = i84 | i87;
                    int i89 = (i88 << 1) - ((~(i87 & i84)) & i88);
                    int i90 = ~i28;
                    int i91 = (-2) & i90;
                    int i92 = i91 | ((~i91) & ((-2) | i90));
                    int i93 = ~iIdentityHashCode;
                    int i94 = ~((i92 & iIdentityHashCode) | (i92 ^ iIdentityHashCode));
                    int i95 = (iIdentityHashCode | i93) & i93;
                    int i96 = i90 | i95;
                    int i97 = i96 ^ 1;
                    int i98 = i96 & i21;
                    int i99 = ~((i97 ^ i98) | (i97 & i98));
                    int i100 = i94 & i99;
                    int i101 = (~i100) & (i94 | i99);
                    int i102 = ((i101 & i100) | (i101 ^ i100)) * 50;
                    int i103 = (i89 & i102) + (i102 | i89);
                    int i104 = i90 & i93;
                    int i105 = ~(((i93 | i90) & (~i104)) | i104);
                    int i106 = i90 & 1;
                    int i107 = (i90 | 1) & (~i106);
                    int i108 = ~((i106 & i107) | (i107 ^ i106));
                    int i109 = ((~i108) & i105) | ((~i105) & i108);
                    int i110 = i105 & i108;
                    int i111 = (i110 & i109) | (i109 ^ i110);
                    int i112 = i95 & 1;
                    int i113 = (i95 | 1) & (~i112);
                    int i114 = (i113 & i112) | (i113 ^ i112);
                    int i115 = ~i114;
                    int i116 = (i114 | i115) & i115;
                    int i117 = -(-(((i116 & i111) | ((~i116) & i111) | ((~i111) & i116)) * 50));
                    int i118 = i103 & i117;
                    i28 = i118 + ((i117 ^ i103) | i118);
                    int iIdentityHashCode2 = System.identityHashCode(abxVar);
                    int i119 = ~iIdentityHashCode2;
                    int i120 = ~((i119 ^ i27) | (i119 & i27));
                    int i121 = i120 & 1;
                    int i122 = (i120 | 1) & (~i121);
                    int i123 = (((i27 * (-163)) + 165) - (~(-(~(((i122 & i121) | (i122 ^ i121)) * (-328)))))) - 1;
                    int i124 = (i123 ^ (-1)) + (i123 << 1);
                    int i125 = -(-((iIdentityHashCode2 | 1) * 164));
                    int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                    int i127 = ~i27;
                    int i128 = ((~i127) & (-2)) | (i127 & 1);
                    int i129 = (-2) & i127;
                    int i130 = (i128 & i129) | (i128 ^ i129);
                    int i131 = ~i130;
                    int i132 = (i130 | i131) & i131;
                    int i133 = (i127 & iIdentityHashCode2) | (i127 ^ iIdentityHashCode2);
                    int i134 = ~i133;
                    int i135 = (i133 | i134) & i134;
                    int i136 = (i135 & i132) | ((~i135) & i132) | ((~i132) & i135);
                    int i137 = (iIdentityHashCode2 | i119) & i119;
                    int i138 = (i137 & (-2)) | ((~i137) & 1);
                    int i139 = i137 & 1;
                    int i140 = (i139 & i138) | (i138 ^ i139);
                    int i141 = i140 ^ i27;
                    int i142 = i140 & i27;
                    int i143 = -(-(((~((i142 & i141) | (i141 ^ i142))) | i136) * 164));
                    i27 = ((i126 ^ i143) - (~((i143 & i126) << 1))) - 1;
                    int i144 = f52358r0;
                    int i145 = (i144 ^ 43) + ((i144 & 43) << 1);
                    f52357q0 = i145 % 128;
                    int i146 = i145 % 2;
                    i23 = 2;
                    j11 = 0;
                    i21 = 1;
                } else {
                    j10 = j11;
                }
                if (i28 == i29) {
                    int i147 = f52358r0;
                    int i148 = i147 & 111;
                    int i149 = (i147 ^ 111) | i148;
                    int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                    f52357q0 = i150 % 128;
                    int i151 = i150 % 2;
                    abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                    ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                    int i152 = f52357q0;
                    int i153 = (i152 & 57) + (i152 | 57);
                    f52358r0 = i153 % 128;
                    int i154 = i153 % 2;
                } else {
                    acjVar.setCompoundDrawableTintBlendMode = i28;
                    int i155 = f52358r0;
                    int i156 = i155 & 13;
                    int i157 = -(-(i155 | 13));
                    int i158 = (i156 & i157) + (i157 | i156);
                    f52357q0 = i158 % 128;
                    int i159 = i158 % 2;
                }
                if (z10) {
                    break;
                }
                int i160 = f52357q0;
                int i161 = ((i160 ^ 88) + ((i160 & 88) << 1)) - 1;
                f52358r0 = i161 % 128;
                if (i161 % 2 == 0) {
                    throw null;
                }
                if (abxVar.setDividerPadding == null) {
                    break;
                }
                j11 = j10;
                i23 = 2;
                i21 = 1;
            }
        }
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - ((long) i27));
        int i162 = f52357q0;
        int i163 = i162 & 69;
        int i164 = (i163 - (~((i162 ^ 69) | i163))) - 1;
        f52358r0 = i164 % 128;
        int i165 = i164 % 2;
        return Long.valueOf(j12);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        int i13;
        Boolean bool;
        int i14;
        int iIntValue;
        Object onFocusChangeListener;
        long j10 = 0;
        int i15 = 4;
        int i16 = -1;
        int i17 = 2;
        int i18 = 1;
        switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
            case 1:
                abx abxVar = (abx) objArr[0];
                int i19 = f52357q0 + 87;
                f52358r0 = i19 % 128;
                int i20 = i19 % 2;
                abx abxVar2 = (abx) setOnFocusChangeListener(new Object[]{abxVar}, 660672707, -660672666, System.identityHashCode(abxVar));
                int i21 = f52358r0;
                int i22 = (((i21 & (-98)) | ((~i21) & 97)) - (~(-(-((i21 & 97) << 1))))) - 1;
                f52357q0 = i22 % 128;
                int i23 = i22 % 2;
                return abxVar2;
            case 2:
                abx abxVar3 = (abx) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i24 = f52357q0 + 101;
                f52358r0 = i24 % 128;
                int i25 = i24 % 2;
                acj x4 = abxVar3.setX(2);
                byte[] bArr = x4.setOnFocusChangeListener;
                int i26 = x4.setX;
                int i27 = ((i26 ^ 1) | (i26 & 1)) << 1;
                int i28 = -((i26 & (-2)) | ((~i26) & 1));
                int i29 = (i27 & i28) + (i27 | i28);
                bArr[i26] = (byte) (iIntValue2 >>> 8);
                int i30 = i29 | 1;
                int i31 = i30 << 1;
                int i32 = -(i30 & (~(i29 & 1)));
                bArr[i29] = (byte) iIntValue2;
                x4.setX = (i31 ^ i32) + ((i32 & i31) << 1);
                abxVar3.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar3}, 1395393434, -1395393402, System.identityHashCode(abxVar3))).longValue() + 2);
                int i33 = f52357q0 + 45;
                f52358r0 = i33 % 128;
                int i34 = i33 % 2;
                return abxVar3;
            case 3:
                return k(objArr);
            case 4:
                return H(objArr);
            case 5:
                return m(objArr);
            case 6:
                return z(objArr);
            case 7:
                return w(objArr);
            case 8:
                return r(objArr);
            case 9:
                return x(objArr);
            case 10:
                return d(objArr);
            case 11:
                return B(objArr);
            case 12:
                abx abxVar4 = (abx) objArr[0];
                int i35 = f52358r0;
                int i36 = i35 & 81;
                int i37 = (i35 ^ 81) | i36;
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f52357q0 = i38 % 128;
                int i39 = i38 % 2;
                abx abxVarU = abxVar4.u();
                int i40 = f52357q0;
                int i41 = (i40 & 101) + (i40 | 101);
                f52358r0 = i41 % 128;
                int i42 = i41 % 2;
                return abxVarU;
            case 13:
                return h(objArr);
            case 14:
                return q(objArr);
            case 15:
                return C(objArr);
            case 16:
                return b(objArr);
            case 17:
                return J(objArr);
            case 18:
                return D(objArr);
            case 19:
                abx abxVar5 = (abx) objArr[0];
                acp acpVar = (acp) objArr[1];
                int i43 = f52357q0;
                int i44 = (i43 | 115) << 1;
                int i45 = -((i43 & (-116)) | ((~i43) & 115));
                int i46 = (i44 & i45) + (i45 | i44);
                f52358r0 = i46 % 128;
                int i47 = i46 % 2;
                Intrinsics.checkNotNullParameter(acpVar, "");
                int i48 = f52358r0;
                int i49 = i48 | 109;
                int i50 = i49 << 1;
                int i51 = -((~(i48 & 109)) & i49);
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                f52357q0 = i52 % 128;
                int i53 = i52 % 2;
                while (true) {
                    long y7 = acpVar.setY(abxVar5, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
                    if (y7 == -1) {
                        int i54 = f52357q0;
                        int i55 = (i54 ^ 67) + ((i54 & 67) << 1);
                        f52358r0 = i55 % 128;
                        int i56 = i55 % 2;
                        return Long.valueOf(j10);
                    }
                    int i57 = f52358r0;
                    int i58 = ((i57 & (-22)) | ((~i57) & 21)) + ((i57 & 21) << 1);
                    f52357q0 = i58 % 128;
                    j10 = i58 % 2 != 0 ? j10 - y7 : j10 + y7;
                }
                break;
            case 20:
                return y(objArr);
            case 21:
                abx abxVar6 = (abx) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i59 = f52358r0;
                int i60 = (i59 & (-6)) | ((~i59) & 5);
                int i61 = -(-((i59 & 5) << 1));
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                f52357q0 = i62 % 128;
                int i63 = i62 % 2;
                String str = (String) setOnFocusChangeListener(new Object[]{abxVar6, Long.valueOf(jLongValue), Charsets.UTF_8}, -1421166445, 1421166479, System.identityHashCode(abxVar6));
                int i64 = f52358r0;
                int i65 = i64 ^ 89;
                int i66 = ((i64 & 89) | i65) << 1;
                int i67 = -i65;
                int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                f52357q0 = i68 % 128;
                int i69 = i68 % 2;
                return str;
            case 22:
                j(objArr);
                return null;
            case 23:
                abx abxVar7 = (abx) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int i70 = f52357q0;
                int i71 = i70 & 5;
                int i72 = -(-((i70 ^ 5) | i71));
                int i73 = (i71 & i72) + (i72 | i71);
                f52358r0 = i73 % 128;
                if (i73 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    acv.setOnFocusChangeListener(new Object[]{Long.valueOf(bArr2.length), Long.valueOf(iIntValue3), Long.valueOf(iIntValue4)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
                    i13 = iIntValue3 >> iIntValue4;
                } else {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    acv.setOnFocusChangeListener(new Object[]{Long.valueOf(bArr2.length), Long.valueOf(iIntValue3), Long.valueOf(iIntValue4)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
                    int i74 = -(-iIntValue4);
                    i13 = ((iIntValue3 | i74) << 1) - (i74 ^ iIntValue3);
                }
                int i75 = iIntValue3;
                while (i75 < i13) {
                    int i76 = f52357q0;
                    int i77 = (i76 & (-6)) | ((~i76) & 5);
                    int i78 = (i76 & 5) << i18;
                    int i79 = (i77 & i78) + (i78 | i77);
                    f52358r0 = i79 % 128;
                    int i80 = i79 % i17;
                    acj x6 = abxVar7.setX(i18);
                    int i81 = -i75;
                    int i82 = i81 * 989;
                    int i83 = i13 * (-987);
                    int i84 = i82 & i83;
                    int i85 = (((i82 | i83) & (~i84)) - (~(i84 << 1))) - i18;
                    int i86 = ~i13;
                    int i87 = ~iIntValue3;
                    int i88 = (i87 | iIntValue3) & i87;
                    int i89 = (i86 ^ i88) | (i86 & i88);
                    int i90 = ~i81;
                    int i91 = (i89 & i90) | ((~i89) & i81);
                    int i92 = i89 & i81;
                    int i93 = ~((i91 ^ i92) | (i91 & i92));
                    int i94 = (i81 ^ i13) | (i81 & i13);
                    int i95 = i94 & iIntValue3;
                    int i96 = iIntValue4;
                    int i97 = (~i95) & (i94 | iIntValue3);
                    int i98 = ~((i97 & i95) | (i97 ^ i95));
                    int i99 = -(-(((i98 & i93) | ((~i98) & i93) | ((~i93) & i98)) * 988));
                    int i100 = i85 & i99;
                    int i101 = -(-(i99 | i85));
                    int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                    int i103 = i81 & i86;
                    int i104 = (~i103) & (i81 | i86);
                    int i105 = -(-(((i103 & i104) | (i104 ^ i103)) * (-988)));
                    int i106 = i102 & i105;
                    int i107 = (i105 ^ i102) | i106;
                    int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                    int i109 = i90 ^ i86;
                    int i110 = ~i86;
                    int i111 = i90 & i86;
                    int i112 = ~((i109 & i111) | (i109 ^ i111));
                    int i113 = (i86 & i87) | (i110 & iIntValue3);
                    int i114 = i86 & iIntValue3;
                    int i115 = ~((i113 & i114) | (i113 ^ i114));
                    int i116 = ((~i115) & i112) | ((~i112) & i115);
                    int i117 = i112 & i115;
                    int i118 = (i117 & i116) | (i116 ^ i117);
                    int i119 = i88 ^ i81;
                    int i120 = i81 & i88;
                    int i121 = (i120 & i119) | (i119 ^ i120);
                    int i122 = (i121 & i86) | ((~i121) & i13);
                    int i123 = i121 & i13;
                    int i124 = ~((i123 & i122) | (i122 ^ i123));
                    int i125 = ((~i124) & i118) | ((~i118) & i124);
                    int i126 = i118 & i124;
                    int i127 = ((i126 & i125) | (i125 ^ i126)) * 988;
                    int i128 = i108 & i127;
                    int i129 = (i127 | i108) & (~i128);
                    int i130 = i128 << 1;
                    int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
                    int i132 = -x6.setX;
                    int i133 = i132 * 483;
                    int i134 = ((i133 & 1982465) + (i133 | 1982465)) - 1;
                    int i135 = ~i132;
                    int i136 = i135 ^ (-8193);
                    int i137 = i135 & (-8193);
                    int i138 = ~((i136 & i137) | (i136 ^ i137));
                    int i139 = (i135 | i132) & i135;
                    int i140 = i139 ^ i87;
                    int i141 = i139 & i87;
                    int i142 = ~((i140 & i141) | (i140 ^ i141));
                    int i143 = -(-(((i138 & i142) | (i138 ^ i142)) * (-241)));
                    int i144 = i134 ^ i143;
                    int i145 = (i143 & i134) << 1;
                    int i146 = (i144 & i145) + (i145 | i144);
                    int i147 = i132 & (-8193);
                    int i148 = (i135 & 8192) | i147;
                    int i149 = i132 & 8192;
                    int i150 = -(-(((i148 & i149) | (i148 ^ i149)) * (-482)));
                    int i151 = i146 & i150;
                    int i152 = (((i150 | i146) & (~i151)) - (~(i151 << 1))) - 1;
                    int i153 = (i132 ^ (-8193)) | i147;
                    int i154 = ~i153;
                    int i155 = (i153 | i154) & i154;
                    int i156 = (~i141) & (i139 | i87);
                    int i157 = (i156 & i141) | (i156 ^ i141);
                    int i158 = ~((i157 & 8192) | (i157 ^ 8192));
                    int i159 = i155 & i158;
                    int i160 = (i155 | i158) & (~i159);
                    int i161 = -(~(-(-(((i160 & i159) | (i160 ^ i159)) * 241))));
                    int iMin = Math.min(i131, (-2) - ((((i152 | i161) << 1) - (i161 ^ i152)) ^ (-1)));
                    byte[] bArr3 = x6.setOnFocusChangeListener;
                    int i162 = x6.setX;
                    int i163 = ~iMin;
                    int i164 = i75 & iMin;
                    ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr3, i162, i75, (i164 - (~(-(-((i75 ^ iMin) | i164))))) - 1);
                    int i165 = i75 - i163;
                    i75 = (i165 << 1) + (i165 ^ (-1));
                    int i166 = x6.setX;
                    int i167 = -(-iMin);
                    x6.setX = (((i166 ^ i167) | (i166 & i167)) << 1) - ((i167 & (~i166)) | ((~i167) & i166));
                    int i168 = f52357q0;
                    int i169 = (i168 ^ 115) + ((i168 & 115) << 1);
                    f52358r0 = i169 % 128;
                    int i170 = i169 % 2;
                    iIntValue4 = i96;
                    i18 = 1;
                    i17 = 2;
                }
                Object[] objArr2 = new Object[i18];
                objArr2[0] = abxVar7;
                abxVar7.setX(((Long) setOnFocusChangeListener(objArr2, 1395393434, -1395393402, System.identityHashCode(abxVar7))).longValue() + ((long) iIntValue4));
                int i171 = f52357q0;
                int i172 = (((i171 & (-26)) | ((~i171) & 25)) - (~(-(-((i171 & 25) << 1))))) - 1;
                f52358r0 = i172 % 128;
                int i173 = i172 % 2;
                return abxVar7;
            case 24:
                abx abxVar8 = (abx) objArr[0];
                String str2 = (String) objArr[1];
                int i174 = f52357q0 + 29;
                f52358r0 = i174 % 128;
                int i175 = i174 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                abx y10 = abxVar8.setY(str2, 0, str2.length());
                int i176 = f52357q0;
                int i177 = i176 ^ 9;
                int i178 = (((i176 & 9) | i177) << 1) - i177;
                f52358r0 = i178 % 128;
                int i179 = i178 % 2;
                return y10;
            case 25:
                i(objArr);
                return null;
            case 26:
                return c(objArr);
            case 27:
                return t(objArr);
            case 28:
                abx abxVar9 = (abx) objArr[0];
                int i180 = f52358r0;
                int i181 = i180 | 41;
                int i182 = ((i181 << 1) - (~(-((~(i180 & 41)) & i181)))) - 1;
                int i183 = i182 % 128;
                f52357q0 = i183;
                int i184 = i182 % 2;
                if (abxVar9.f52359p0 == 0) {
                    int i185 = ((i183 ^ 95) | (i183 & 95)) << 1;
                    int i186 = -((i183 & (-96)) | ((~i183) & 95));
                    int i187 = ((i185 | i186) << 1) - (i185 ^ i186);
                    f52358r0 = i187 % 128;
                    int i188 = i187 % 2;
                    int i189 = ((i183 | 117) << 1) - (i183 ^ 117);
                    f52358r0 = i189 % 128;
                    int i190 = i189 % 2;
                    bool = Boolean.TRUE;
                } else {
                    int i191 = i183 & 11;
                    int i192 = -(-((i183 ^ 11) | i191));
                    int i193 = ((i191 | i192) << 1) - (i191 ^ i192);
                    f52358r0 = i193 % 128;
                    int i194 = i193 % 2;
                    bool = Boolean.FALSE;
                }
                return bool;
            case 29:
                int i195 = f52358r0;
                int i196 = i195 & 57;
                int i197 = ((i195 ^ 57) | i196) << 1;
                int i198 = -((i195 | 57) & (~i196));
                int i199 = (i197 & i198) + (i198 | i197);
                f52357q0 = i199 % 128;
                int i200 = i199 % 2;
                return Boolean.TRUE;
            case 30:
                return s(objArr);
            case 31:
                return e(objArr);
            case 32:
                abx abxVar10 = (abx) objArr[0];
                int i201 = f52357q0;
                int i202 = ((i201 | 27) << 1) - (i201 ^ 27);
                int i203 = i202 % 128;
                f52358r0 = i203;
                int i204 = i202 % 2;
                long j11 = abxVar10.f52359p0;
                int i205 = (((i203 ^ 35) | (i203 & 35)) << 1) - (((~i203) & 35) | (i203 & (-36)));
                f52357q0 = i205 % 128;
                int i206 = i205 % 2;
                return Long.valueOf(j11);
            case 33:
                return v(objArr);
            case 34:
                return p(objArr);
            case 35:
                abx abxVar11 = (abx) objArr[0];
                int i207 = f52358r0 + 80;
                int i208 = (i207 ^ (-1)) + (i207 << 1);
                f52357q0 = i208 % 128;
                int i209 = i208 % 2;
                abx abxVar12 = (abx) setOnFocusChangeListener(new Object[]{abxVar11}, -1050909291, 1050909303, System.identityHashCode(abxVar11));
                int i210 = f52357q0 + 4;
                int i211 = (i210 ^ (-1)) + (i210 << 1);
                f52358r0 = i211 % 128;
                int i212 = i211 % 2;
                return abxVar12;
            case 36:
                return f(objArr);
            case 37:
                abx abxVar13 = (abx) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i213 = f52358r0 + 36;
                int i214 = (i213 ^ (-1)) + (i213 << 1);
                f52357q0 = i214 % 128;
                if (i214 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    i14 = 1;
                } else {
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    i14 = 0;
                }
                int i215 = f52358r0 + 31;
                f52357q0 = i215 % 128;
                int i216 = i215 % 2;
                while (i14 < bArr4.length) {
                    int i217 = f52357q0 + 5;
                    f52358r0 = i217 % 128;
                    if (i217 % 2 == 0) {
                        int length = bArr4.length * i14;
                        Object[] objArr3 = new Object[i15];
                        objArr3[0] = abxVar13;
                        objArr3[1] = bArr4;
                        objArr3[2] = Integer.valueOf(i14);
                        objArr3[3] = Integer.valueOf(length);
                        iIntValue = ((Integer) setOnFocusChangeListener(objArr3, 1877448265, -1877448226, i14)).intValue();
                        if (iIntValue == i16) {
                            throw new EOFException();
                        }
                        int iIdentityHashCode = System.identityHashCode(abxVar13);
                        int i218 = iIntValue * 367;
                        int i219 = -(-(i14 * 367));
                        int i220 = i218 ^ i219;
                        int i221 = -(-((i218 & i219) << 1));
                        int i222 = (i220 ^ i221) + ((i221 & i220) << 1);
                        int i223 = ((iIntValue ^ i14) | (iIntValue & i14)) * (-366);
                        int i224 = ((i222 ^ i223) | (i222 & i223)) << 1;
                        int i225 = -((i223 & (~i222)) | ((~i223) & i222));
                        int i226 = (i224 & i225) + (i225 | i224);
                        int i227 = ~i14;
                        int i228 = ~iIdentityHashCode;
                        int i229 = ((~i227) & iIdentityHashCode) | (i227 & i228);
                        int i230 = i227 & iIdentityHashCode;
                        int i231 = ~((i229 ^ i230) | (i229 & i230));
                        int i232 = iIntValue & i231;
                        int i233 = (i231 | iIntValue) & (~i232);
                        int i234 = ((i233 & i232) | (i233 ^ i232)) * (-366);
                        int i235 = i226 & i234;
                        int i236 = -(-((i234 ^ i226) | i235));
                        int i237 = ((i235 | i236) << 1) - (i236 ^ i235);
                        int i238 = ~iIntValue;
                        int i239 = ~((i238 & i14) | (i238 & i227) | ((~i238) & i14));
                        int i240 = (i14 | i227) & i227;
                        int i241 = (i240 & iIntValue) | (i240 ^ iIntValue);
                        int i242 = (i241 & i228) | ((~i241) & iIdentityHashCode);
                        int i243 = i241 & iIdentityHashCode;
                        int i244 = ~((i243 & i242) | (i242 ^ i243));
                        int i245 = i239 & i244;
                        int i246 = (i244 | i239) & (~i245);
                        int i247 = -(-(((i246 & i245) | (i246 ^ i245)) * 366));
                        i14 = ((i237 | i247) << 1) - (i247 ^ i237);
                        int i248 = f52358r0 + 51;
                        f52357q0 = i248 % 128;
                        int i249 = i248 % 2;
                        i15 = 4;
                        i16 = -1;
                    } else {
                        int length2 = bArr4.length;
                        int i250 = -i14;
                        int i251 = length2 & i250;
                        int i252 = (~i251) & (length2 | i250);
                        int i253 = i251 << 1;
                        int i254 = (i252 ^ i253) + ((i252 & i253) << 1);
                        Object[] objArr4 = new Object[i15];
                        objArr4[0] = abxVar13;
                        objArr4[1] = bArr4;
                        objArr4[2] = Integer.valueOf(i14);
                        objArr4[3] = Integer.valueOf(i254);
                        iIntValue = ((Integer) setOnFocusChangeListener(objArr4, 1877448265, -1877448226, i14)).intValue();
                        if (iIntValue == i16) {
                            throw new EOFException();
                        }
                        int iIdentityHashCode2 = System.identityHashCode(abxVar13);
                        int i2110 = iIntValue * 367;
                        int i2111 = -(-(i14 * 367));
                        int i2210 = i2110 ^ i2111;
                        int i2211 = -(-((i2110 & i2111) << 1));
                        int i2212 = (i2210 ^ i2211) + ((i2211 & i2210) << 1);
                        int i2213 = ((iIntValue ^ i14) | (iIntValue & i14)) * (-366);
                        int i2214 = ((i2212 ^ i2213) | (i2212 & i2213)) << 1;
                        int i2215 = -((i2213 & (~i2212)) | ((~i2213) & i2212));
                        int i2216 = (i2214 & i2215) + (i2215 | i2214);
                        int i2217 = ~i14;
                        int i2218 = ~iIdentityHashCode2;
                        int i2219 = ((~i2217) & iIdentityHashCode2) | (i2217 & i2218);
                        int i2310 = i2217 & iIdentityHashCode2;
                        int i2311 = ~((i2219 ^ i2310) | (i2219 & i2310));
                        int i2312 = iIntValue & i2311;
                        int i2313 = (i2311 | iIntValue) & (~i2312);
                        int i2314 = ((i2313 & i2312) | (i2313 ^ i2312)) * (-366);
                        int i2315 = i2216 & i2314;
                        int i2316 = -(-((i2314 ^ i2216) | i2315));
                        int i2317 = ((i2315 | i2316) << 1) - (i2316 ^ i2315);
                        int i2318 = ~iIntValue;
                        int i2319 = ~((i2318 & i14) | (i2318 & i2217) | ((~i2318) & i14));
                        int i2410 = (i14 | i2217) & i2217;
                        int i2411 = (i2410 & iIntValue) | (i2410 ^ iIntValue);
                        int i2412 = (i2411 & i2218) | ((~i2411) & iIdentityHashCode2);
                        int i2413 = i2411 & iIdentityHashCode2;
                        int i2414 = ~((i2413 & i2412) | (i2412 ^ i2413));
                        int i2415 = i2319 & i2414;
                        int i2416 = (i2414 | i2319) & (~i2415);
                        int i2417 = -(-(((i2416 & i2415) | (i2416 ^ i2415)) * 366));
                        i14 = ((i2317 | i2417) << 1) - (i2417 ^ i2317);
                        int i2418 = f52358r0 + 51;
                        f52357q0 = i2418 % 128;
                        int i2419 = i2418 % 2;
                        i15 = 4;
                        i16 = -1;
                    }
                }
                int i255 = f52357q0;
                int i256 = (i255 & (-36)) | ((~i255) & 35);
                int i257 = -(-((i255 & 35) << 1));
                int i258 = ((i256 | i257) << 1) - (i257 ^ i256);
                f52358r0 = i258 % 128;
                int i259 = i258 % 2;
                return null;
            case 38:
                return a(objArr);
            case 39:
                return E(objArr);
            case 40:
                return F(objArr);
            case 41:
                return l(objArr);
            case 42:
                g(objArr);
                return null;
            case 43:
                abx abxVar14 = (abx) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int i260 = f52358r0;
                int i261 = i260 & 93;
                int i262 = (i260 ^ 93) | i261;
                int i263 = (i261 ^ i262) + ((i262 & i261) << 1);
                f52357q0 = i263 % 128;
                if (i263 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{abxVar14, bArr5, 1, Integer.valueOf(bArr5.length)}, 1169071493, -1169071470, 1);
                } else {
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{abxVar14, bArr5, 0, Integer.valueOf(bArr5.length)}, 1169071493, -1169071470, 0);
                }
                abx abxVar15 = (abx) onFocusChangeListener;
                int i264 = f52358r0;
                int i265 = ((i264 ^ 70) + ((i264 & 70) << 1)) - 1;
                f52357q0 = i265 % 128;
                int i266 = i265 % 2;
                return abxVar15;
            default:
                return I(objArr);
        }
    }

    public static /* synthetic */ Long t(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        abx abxVar2 = (abx) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i10 = f52357q0;
        int i11 = i10 ^ 47;
        int i12 = ((i10 & 47) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f52358r0 = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(abxVar2, "");
        if (jLongValue < 0) {
            int i16 = f52357q0;
            int i17 = i16 & 1;
            int i18 = (i16 ^ 1) | i17;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f52358r0 = i19 % 128;
            int i20 = i19 % 2;
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
        }
        int i21 = f52357q0;
        int i22 = i21 & 71;
        int i23 = ((i21 | 71) & (~i22)) + (i22 << 1);
        int i24 = i23 % 128;
        f52358r0 = i24;
        int i25 = i23 % 2;
        int i26 = (i24 ^ 87) + ((i24 & 87) << 1);
        f52357q0 = i26 % 128;
        int i27 = i26 % 2;
        if (((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() == 0) {
            int i28 = f52358r0;
            int i29 = ((i28 & (-112)) | ((~i28) & 111)) + ((i28 & 111) << 1);
            f52357q0 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = (i28 ^ 81) + ((i28 & 81) << 1);
            f52357q0 = i31 % 128;
            if (i31 % 2 == 0) {
                return -1L;
            }
            throw null;
        }
        if (jLongValue > ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue()) {
            int i32 = f52357q0;
            int i33 = ((i32 & 124) + (i32 | 124)) - 1;
            f52358r0 = i33 % 128;
            if (i33 % 2 == 0) {
                jLongValue = ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
                int i34 = 4 / 0;
            } else {
                jLongValue = ((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
            }
        }
        setOnFocusChangeListener(new Object[]{abxVar2, abxVar, Long.valueOf(jLongValue)}, -2065855263, 2065855285, System.identityHashCode(abxVar2));
        int i35 = f52358r0;
        int i36 = i35 & 81;
        int i37 = -(-((i35 ^ 81) | i36));
        int i38 = (i36 & i37) + (i37 | i36);
        f52357q0 = i38 % 128;
        if (i38 % 2 == 0) {
            return Long.valueOf(jLongValue);
        }
        int i39 = 20 / 0;
        return Long.valueOf(jLongValue);
    }

    public static /* synthetic */ acq v(Object[] objArr) {
        int i10 = f52358r0;
        int i11 = i10 ^ 13;
        int i12 = (((i10 & 13) | i11) << 1) - i11;
        f52357q0 = i12 % 128;
        if (i12 % 2 != 0) {
            acq.Companion setcompounddrawabletintblendmode = acq.INSTANCE;
            throw null;
        }
        acq acqVar = acq.setDividerPadding;
        int i13 = f52357q0;
        int i14 = ((i13 | 101) << 1) - (((~i13) & 101) | (i13 & (-102)));
        f52358r0 = i14 % 128;
        if (i14 % 2 != 0) {
            return acqVar;
        }
        throw null;
    }

    public static /* synthetic */ Integer w(Object[] objArr) {
        abx abxVar = (abx) objArr[0];
        int i10 = 1;
        ByteBuffer byteBuffer = (ByteBuffer) objArr[1];
        int i11 = f52357q0;
        int i12 = ((i11 | 121) << 1) - (i11 ^ 121);
        f52358r0 = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int iRemaining = byteBuffer.remaining();
        int i14 = f52357q0;
        int i15 = ((i14 & 33) - (~(-(-(i14 | 33))))) - 1;
        f52358r0 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = iRemaining;
        while (i17 > 0) {
            int i18 = f52358r0;
            int i19 = i18 & 53;
            int i20 = i19 + ((i18 ^ 53) | i19);
            f52357q0 = i20 % 128;
            int i21 = i20 % 2;
            acj x4 = abxVar.setX(i10);
            int i22 = 8191 - (~(-(~(-x4.setX))));
            int iMin = Math.min(i17, (i22 ^ (-1)) + (i22 << i10));
            byteBuffer.get(x4.setOnFocusChangeListener, x4.setX, iMin);
            int i23 = -iMin;
            int iIdentityHashCode = System.identityHashCode(abxVar);
            int i24 = i23 * 50;
            int i25 = -(-(i17 * (-97)));
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = ~i17;
            int i28 = ~iIdentityHashCode;
            int i29 = i27 & i28;
            int i30 = (~i29) & (i27 | i28);
            int i31 = ~((i30 & i29) | (i30 ^ i29));
            int i32 = (i27 | i17) & i27;
            int i33 = i32 & i23;
            int i34 = (~i33) & (i32 | i23);
            ByteBuffer byteBuffer2 = byteBuffer;
            int i35 = ~i23;
            int i36 = ~(i34 | i33);
            int i37 = i31 & i36;
            int i38 = iRemaining;
            int i39 = (i36 | i31) & (~i37);
            int i40 = -(-(((i39 & i37) | (i39 ^ i37)) * 98));
            int i41 = (i26 ^ i40) + ((i40 & i26) << 1);
            int i42 = (i35 | i23) & i35;
            int i43 = (i28 | iIdentityHashCode) & i28;
            int i44 = i42 & i43;
            int i45 = ~(((i42 | i43) & (~i44)) | i44);
            int i46 = i32 & i45;
            int i47 = (i45 | i32) & (~i46);
            int i48 = (i47 & i46) | (i47 ^ i46);
            int i49 = i23 ^ iIdentityHashCode;
            int i50 = i23 & iIdentityHashCode;
            int i51 = ~((i49 & i50) | (i49 ^ i50));
            int i52 = ((~i51) & i48) | ((~i48) & i51);
            int i53 = i48 & i51;
            int i54 = -(~(((i53 & i52) | (i52 ^ i53)) * (-49)));
            int i55 = ((i41 & i54) + (i54 | i41)) - 1;
            int i56 = ((~i27) & iIdentityHashCode) | i29;
            int i57 = i27 & iIdentityHashCode;
            int i58 = ~((i56 & i57) | (i56 ^ i57));
            int i59 = ~((i23 ^ i17) | (i17 & i23));
            int i60 = -(-(((i58 & i59) | (i58 ^ i59)) * 49));
            i17 = ((i55 | i60) << 1) - ((i60 & (~i55)) | ((~i60) & i55));
            int i61 = x4.setX;
            int iIdentityHashCode2 = System.identityHashCode(abxVar);
            int i62 = iMin * 677;
            int i63 = i61 * (-675);
            int i64 = i62 ^ i63;
            int i65 = -(-((i62 & i63) << 1));
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            int i67 = ~iIdentityHashCode2;
            int i68 = iMin & i67;
            int i69 = ~iMin;
            int i70 = (iIdentityHashCode2 & i69) | i68;
            int i71 = iMin & iIdentityHashCode2;
            int i72 = (i70 & i71) | (i70 ^ i71);
            int i73 = ~i61;
            int i74 = ~i73;
            int i75 = (i72 & i74) | ((~i72) & i73);
            int i76 = i72 & i73;
            int i77 = ((i76 & i75) | (i75 ^ i76)) * (-676);
            int i78 = (i66 & i77) + (i66 | i77);
            int i79 = (i73 & i69) | (iMin & i74);
            int i80 = i73 & iMin;
            int i81 = (i79 & i80) | (i79 ^ i80);
            int i82 = ~i81;
            int i83 = (i81 | i82) & i82;
            int i84 = (~i68) & (i67 | iMin);
            int i85 = ~((i68 & i84) | (i84 ^ i68));
            int i86 = ((~i85) & i83) | ((~i83) & i85);
            int i87 = i85 & i83;
            int i88 = -(~(((i87 & i86) | (i86 ^ i87)) * 676));
            int i89 = ((i78 & i88) + (i88 | i78)) - 1;
            int i90 = (i73 | i61) & i73;
            int i91 = ((~i90) & i69) | ((~i69) & i90);
            int i92 = i69 & i90;
            int i93 = (i92 & i91) | (i91 ^ i92);
            int i94 = ~i93;
            int i95 = (i93 | i94) & i94;
            int i96 = i67 & (i67 | iIdentityHashCode2);
            int i97 = (i96 & i90) | (i90 ^ i96);
            int i98 = ~i97;
            int i99 = (i97 | i98) & i98;
            int i100 = i95 & i99;
            int i101 = (i99 | i95) & (~i100);
            int i102 = (i101 & i100) | (i101 ^ i100);
            int i103 = iMin ^ i61;
            int i104 = i61 & iMin;
            int i105 = (i104 & i103) | (i103 ^ i104);
            int i106 = (i105 & iIdentityHashCode2) | (i105 ^ iIdentityHashCode2);
            int i107 = ~i106;
            int i108 = (i106 | i107) & i107;
            int i109 = ((~i108) & i102) | ((~i102) & i108);
            int i110 = i108 & i102;
            int i111 = -(-(((i110 & i109) | (i109 ^ i110)) * 676));
            x4.setX = (i89 ^ i111) + ((i111 & i89) << 1);
            int i112 = f52357q0;
            int i113 = i112 ^ 31;
            int i114 = ((i112 & 31) | i113) << 1;
            int i115 = -i113;
            int i116 = (i114 & i115) + (i114 | i115);
            f52358r0 = i116 % 128;
            int i117 = i116 % 2;
            byteBuffer = byteBuffer2;
            iRemaining = i38;
            i10 = 1;
        }
        abxVar.f52359p0 += (long) iRemaining;
        int i118 = f52358r0;
        int i119 = i118 & 115;
        int i120 = (((i118 ^ 115) | i119) << 1) - ((i118 | 115) & (~i119));
        f52357q0 = i120 % 128;
        if (i120 % 2 == 0) {
            return Integer.valueOf(iRemaining);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r0 = (r3 & 18) + (r3 | 18);
        r3 = (r0 ^ (-1)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r3 % 128;
        r3 = r3 % 2;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r3 = r2.setCompoundDrawableTintBlendMode;
        r6 = r2.setX;
        r7 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r8 = (r7 ^ 53) + ((r7 & 53) << 1);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r3 >= r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r7 = (-2) - (((r7 ^ 64) + ((r7 & 64) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r7 % 128;
        r7 = r7 % 2;
        r7 = r0 * 31;
        r9 = r2.setOnFocusChangeListener[r3];
        r10 = java.lang.System.identityHashCode(r1);
        r11 = r9 * (-949);
        r0 = -(-(r0 * (-29419)));
        r12 = ((~r0) & r11) | ((~r11) & r0);
        r0 = -(-((r0 & r11) << 1));
        r11 = (r12 ^ r0) + ((r0 & r12) << 1);
        r0 = ~r7;
        r12 = (r0 | r7) & r0;
        r13 = ~r10;
        r14 = r12 & r13;
        r12 = (r12 | r13) & (~r14);
        r12 = ~((r12 & r14) | (r12 ^ r14));
        r14 = ~r9;
        r5 = ~((((~r14) & r10) | (r14 & r13)) | (r14 & r10));
        r14 = r12 & r5;
        r5 = (r5 | r12) & (~r14);
        r5 = -(-(((r5 & r14) | (r5 ^ r14)) * com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode.ERR_REPOSITORY));
        r12 = r11 | r5;
        r14 = r12 << 1;
        r5 = -((~(r5 & r11)) & r12);
        r11 = (r14 ^ r5) + ((r5 & r14) << 1);
        r5 = ~((r13 ^ r9) | (r13 & r9));
        r12 = ~((r7 ^ r10) | (r7 & r10));
        r14 = r5 & r12;
        r5 = (r5 | r12) & (~r14);
        r5 = -(~(-(-(((r5 & r14) | (r5 ^ r14)) * (-950)))));
        r12 = ((r11 | r5) << 1) - (r5 ^ r11);
        r5 = (r12 ^ (-1)) + (r12 << 1);
        r0 = (r0 & r13) | ((~r13) & r7);
        r7 = r7 & r13;
        r0 = (r0 & r7) | (r0 ^ r7);
        r7 = ~r0;
        r0 = (r0 | r7) & r7;
        r7 = (r9 ^ r10) | (r9 & r10);
        r9 = ~r7;
        r7 = (r7 | r9) & r9;
        r9 = r0 & r7;
        r0 = (r0 | r7) & (~r9);
        r0 = ((r0 & r9) | (r0 ^ r9)) * 950;
        r7 = r5 & r0;
        r0 = ((r0 | r5) & (~r7)) + (r7 << 1);
        r5 = java.lang.System.identityHashCode(r1);
        r7 = 44 - (~(-(~(r3 * 46))));
        r9 = ~r3;
        r10 = (r9 | r3) & r9;
        r11 = ~r5;
        r12 = r10 ^ r11;
        r10 = r10 & r11;
        r10 = (r10 & r12) | (r12 ^ r10);
        r12 = ~r10;
        r10 = (r10 | r12) & r12;
        r12 = ((~r10) & 1) | (r10 & (-2));
        r10 = r10 & 1;
        r10 = ((r10 & r12) | (r12 ^ r10)) * (-90);
        r12 = ((~r10) & r7) | ((~r7) & r10);
        r7 = (r7 & r10) << 1;
        r10 = ((r12 | r7) << 1) - (r7 ^ r12);
        r7 = r9 & r5;
        r12 = (~r7) & (r9 | r5);
        r3 = -(-(((~((r3 & 1) | (r3 ^ 1))) | (~((r7 & r12) | (r12 ^ r7)))) * (-45)));
        r7 = r10 & r3;
        r3 = (r3 | r10) & (~r7);
        r7 = r7 << 1;
        r10 = ((r3 | r7) << 1) - (r3 ^ r7);
        r3 = ((-2) & r11) | (r5 & 1);
        r7 = (-2) & r5;
        r3 = (r3 & r7) | (r3 ^ r7);
        r7 = ~r3;
        r3 = (r3 | r7) & r7;
        r7 = r9 & r3;
        r3 = (r3 | r9) & (~r7);
        r3 = (r3 & r7) | (r3 ^ r7);
        r5 = (r5 | r11) & r11;
        r7 = r5 & 1;
        r5 = (r5 | 1) & (~r7);
        r5 = (r5 & r7) | (r5 ^ r7);
        r7 = ~r5;
        r5 = (r5 | r7) & r7;
        r7 = ((~r5) & r3) | ((~r3) & r5);
        r3 = r3 & r5;
        r3 = (r10 - (~(-(-(((r3 & r7) | (r7 ^ r3)) * 45))))) - 1;
        r5 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r7 = ((r5 | 47) << 1) - (r5 ^ 47);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01a2, code lost:
    
        r2 = r2.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01a9, code lost:
    
        if (r2 != r1.setDividerPadding) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ab, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r3 = r1 & 21;
        r2 = ((r1 ^ 21) | r3) << 1;
        r1 = -((r1 | 21) & (~r3));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        r1 = r3 % 128;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r1;
        r3 = r3 % 2;
        r1 = r1 + 73;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cb, code lost:
    
        if ((r1 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01d1, code lost:
    
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = r3 & 3;
        r1 = (r1 - (~((r3 ^ 3) | r1))) - 1;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer x(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abx.x(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ String y(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
        abx abxVar = (abx) objArr[0];
        int i10 = f52358r0;
        int i11 = (i10 & 123) + (i10 | 123);
        f52357q0 = i11 % 128;
        int i12 = i11 % 2;
        String str = (String) setOnFocusChangeListener(new Object[]{abxVar, Long.MAX_VALUE}, -1612990947, 1612990951, System.identityHashCode(abxVar));
        int i13 = f52358r0;
        int i14 = (i13 ^ 3) + ((i13 & 3) << 1);
        f52357q0 = i14 % 128;
        if (i14 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x057d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x057e  */
    public static /* synthetic */ abx z(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar;
        int i10;
        abx abxVar2 = (abx) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i11 = f52358r0;
        int i12 = i11 ^ 61;
        int i13 = ((i11 & 61) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        f52357q0 = i16;
        int i17 = i15 % 2;
        if (iIntValue < 128) {
            int i18 = i11 & 45;
            int i19 = i11 | 45;
            int i20 = (i18 & i19) + (i19 | i18);
            f52357q0 = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            int i21 = f52358r0;
            int i22 = ((i21 | 39) << 1) - (i21 ^ 39);
            f52357q0 = i22 % 128;
            int i23 = i22 % 2;
        } else {
            if (iIntValue >= 2048) {
                if (55296 <= iIntValue) {
                    int i24 = (i16 & (-50)) | ((~i16) & 49);
                    int i25 = -(-((i16 & 49) << 1));
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    int i27 = i26 % 128;
                    f52358r0 = i27;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                    if (iIntValue <= 57343) {
                        int i28 = i27 + 87;
                        f52357q0 = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = (i27 | 39) << 1;
                        int i31 = -((i27 & (-40)) | ((~i27) & 39));
                        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                        f52357q0 = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = i27 & 37;
                        int i35 = ((((i27 ^ 37) | i34) << 1) - (~(-((~i34) & (i27 | 37))))) - 1;
                        f52357q0 = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = f52358r0;
                        int i38 = (i37 ^ 122) + ((i37 & 122) << 1);
                        int i39 = (i38 ^ (-1)) + (i38 << 1);
                        f52357q0 = i39 % 128;
                        int i40 = i39 % 2;
                    } else {
                        int i41 = i16 + 33;
                        f52358r0 = i41 % 128;
                        int i42 = i41 % 2;
                    }
                } else {
                    int i43 = (((i11 | 100) << 1) - (i11 ^ 100)) - 1;
                    f52357q0 = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (iIntValue < 65536) {
                    int i45 = f52358r0;
                    int i46 = i45 & 85;
                    int i47 = (i45 ^ 85) | i46;
                    int i48 = (i46 & i47) + (i47 | i46);
                    f52357q0 = i48 % 128;
                    int i49 = i48 % 2;
                    acj x4 = abxVar2.setX(3);
                    byte[] bArr = x4.setOnFocusChangeListener;
                    int i50 = x4.setX;
                    int i51 = iIntValue >> 12;
                    int i52 = i51 & 224;
                    bArr[i50] = (byte) (((i51 | 224) & (~i52)) | i52);
                    int i53 = ((i50 ^ 1) | (i50 & 1)) << 1;
                    int i54 = ~i50;
                    int i55 = -((i50 & (-2)) | (i54 & 1));
                    bArr[(i53 ^ i55) + ((i53 & i55) << 1)] = (byte) (((iIntValue >> 6) & 63) | 128);
                    int i56 = i50 * (-675);
                    int i57 = 1354 & i56;
                    int i58 = -(-((i56 ^ 1354) | i57));
                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                    int i60 = iIntValue | 2;
                    int i61 = i60 ^ i54;
                    int i62 = i60 & i54;
                    int i63 = -(-(((i61 ^ i62) | (i62 & i61)) * (-676)));
                    int i64 = i59 & i63;
                    int i65 = (i63 ^ i59) | i64;
                    int i66 = (i64 & i65) + (i65 | i64);
                    int i67 = i54 & (-3);
                    int i68 = ((~i54) & 2) | i67;
                    int i69 = i54 & 2;
                    int i70 = ~((i68 ^ i69) | (i68 & i69));
                    int i71 = ~iIntValue;
                    int i72 = ~i71;
                    int i73 = (i71 & (-3)) | (i72 & 2) | (i71 & 2);
                    int i74 = ~i73;
                    int i75 = (i73 | i74) & i74;
                    int i76 = i70 & i75;
                    int i77 = (i75 | i70) & (~i76);
                    int i78 = ((i77 & i76) | (i77 ^ i76)) * 676;
                    int i79 = i66 & i78;
                    int i80 = (i78 | i66) & (~i79);
                    int i81 = i79 << 1;
                    int i82 = ((i80 | i81) << 1) - (i80 ^ i81);
                    int i83 = (-3) ^ i54;
                    int i84 = ~((i83 & i67) | (i83 ^ i67));
                    int i85 = (i71 | iIntValue) & i71;
                    int i86 = i54 & i85;
                    int i87 = (i85 | i54) & (~i86);
                    int i88 = (i87 & i86) | (i87 ^ i86);
                    int i89 = ~i88;
                    int i90 = (i88 | i89) & i89;
                    int i91 = (i84 & i90) | (i84 ^ i90);
                    int i92 = (i50 ^ 2) | (i50 & 2);
                    int i93 = (i92 & i71) | ((~i92) & iIntValue);
                    int i94 = i92 & iIntValue;
                    int i95 = ~((i94 & i93) | (i93 ^ i94));
                    bArr[(i82 - (~(-(-(((i91 & i95) | (((~i95) & i91) | ((~i91) & i95))) * 676))))) - 1] = (byte) ((iIntValue & 63) ^ 128);
                    int i96 = i50 * (-756);
                    int i97 = 2274 & i96;
                    int i98 = i97 + ((i96 ^ 2274) | i97);
                    int i99 = i71 ^ 3;
                    int i100 = i71 & 3;
                    int i101 = ((i99 & i100) | (i99 ^ i100)) * (-757);
                    int i102 = ((i98 | i101) << 1) - (i101 ^ i98);
                    int i103 = i54 ^ 3;
                    int i104 = i54 & 3;
                    int i105 = (i103 & i104) | (i103 ^ i104);
                    int i106 = -(-((~((i105 & iIntValue) | (i105 ^ iIntValue))) * 1514));
                    int i107 = i102 & i106;
                    int i108 = (i106 | i102) & (~i107);
                    int i109 = -(-(i107 << 1));
                    int i110 = (i108 & i109) + (i108 | i109);
                    int i111 = ~(((-4) & i54) | ((-4) ^ i54));
                    int i112 = (i54 | i50) & i54;
                    int i113 = (i72 & i112) | ((~i112) & i71);
                    int i114 = i112 & i71;
                    int i115 = ~((i113 & i114) | (i113 ^ i114));
                    int i116 = i111 & i115;
                    int i117 = ((i115 | i111) & (~i116)) | i116;
                    int i118 = i50 ^ 3;
                    int i119 = i50 & 3;
                    int i120 = (i118 & i119) | (i118 ^ i119);
                    int i121 = ~((iIntValue & i120) | (i120 ^ iIntValue));
                    x4.setX = (i110 - (~(-(-(((i117 & i121) | (i117 ^ i121)) * 757))))) - 1;
                    abxVar2.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() + 3);
                    int i122 = f52358r0 + 3;
                    f52357q0 = i122 % 128;
                    int i123 = i122 % 2;
                } else {
                    if (iIntValue > 1114111) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected code point: 0x", (String) acv.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue)}, 444213623, -444213623, iIntValue)));
                    }
                    int i124 = f52358r0 + 113;
                    f52357q0 = i124 % 128;
                    int i125 = i124 % 2;
                    acj x6 = abxVar2.setX(4);
                    byte[] bArr2 = x6.setOnFocusChangeListener;
                    int i126 = x6.setX;
                    int i127 = iIntValue >> 18;
                    bArr2[i126] = (byte) ((i127 & 240) | (i127 ^ 240));
                    int i128 = -(~(-(-(i126 * 407))));
                    int i129 = (((-405) & i128) + (i128 | (-405))) - 1;
                    int i130 = ~i126;
                    int i131 = (i130 | i126) & i130;
                    int i132 = i131 ^ iIntValue;
                    int i133 = i131 & iIntValue;
                    int i134 = ~(i132 | i133);
                    int i135 = ~iIntValue;
                    int i136 = i135 & (i135 | iIntValue);
                    int i137 = i136 & 1;
                    int i138 = (~i137) & (i136 | 1);
                    int i139 = (i138 ^ i137) | (i137 & i138);
                    int i140 = i139 & i126;
                    int i141 = (i139 | i126) & (~i140);
                    int i142 = (i141 & i140) | (i141 ^ i140);
                    int i143 = ~i142;
                    int i144 = (i142 | i143) & i143;
                    int i145 = -(~(-(-(((i144 & i134) | (i134 ^ i144)) * (-406)))));
                    int i146 = ((i129 & i145) + (i145 | i129)) - 1;
                    int i147 = (i131 ^ i135) | (i131 & i135);
                    int i148 = (i147 & (-2)) | ((~i147) & 1);
                    int i149 = i147 & 1;
                    int i150 = (i146 - (~(-(~(-(-((~((i149 & i148) | (i148 ^ i149))) * (-406)))))))) - 2;
                    int i151 = (-2) ^ iIntValue;
                    int i152 = (-2) & iIntValue;
                    int i153 = (i151 ^ i152) | (i151 & i152);
                    int i154 = ~i153;
                    int i155 = (i153 | i154) & i154;
                    int i156 = (i135 ^ i126) | (i135 & i126);
                    int i157 = ~i156;
                    int i158 = (i156 | i157) & i157;
                    int i159 = -(~(((i155 & i158) | (i155 ^ i158)) * 406));
                    bArr2[((i150 ^ i159) + ((i159 & i150) << 1)) - 1] = (byte) (((iIntValue >> 12) & 63) ^ 128);
                    int i160 = (-784) - (~(-(~(-(-(i126 * (-195)))))));
                    int i161 = i130 & (-3);
                    int i162 = ((~i130) & 2) | i161;
                    int i163 = i130 & 2;
                    int i164 = (i162 ^ i163) | (i162 & i163);
                    int i165 = ~i164;
                    int i166 = (i164 | i165) & i165;
                    int i167 = i126 ^ iIntValue;
                    int i168 = i126 & iIntValue;
                    int i169 = ~(i167 | i168);
                    int i170 = i166 & i169;
                    int i171 = (i169 | i166) & (~i170);
                    int i172 = ((i170 & i171) | (i171 ^ i170)) * (-196);
                    int i173 = (i160 & i172) + (i160 | i172);
                    int i174 = ((i126 ^ 2) | (i126 & 2)) * 392;
                    int i175 = (((i173 ^ i174) | (i173 & i174)) << 1) - ((i174 & (~i173)) | ((~i174) & i173));
                    int i176 = ~(((-3) ^ i130) | i161);
                    int i177 = (i167 ^ i168) | (i167 & i168);
                    int i178 = ~i177;
                    int i179 = (i177 | i178) & i178;
                    int i180 = ((~i179) & i176) | ((~i176) & i179);
                    int i181 = i176 & i179;
                    int i182 = -(-(((i181 & i180) | (i180 ^ i181)) * 196));
                    int i183 = i175 & i182;
                    int i184 = (i182 | i175) & (~i183);
                    int i185 = -(-(i183 << 1));
                    bArr2[(i184 & i185) + (i184 | i185)] = (byte) (((iIntValue >> 6) & 63) ^ 128);
                    int i186 = -(~(i126 * (-97)));
                    int i187 = (-2) - ((((150 | i186) << 1) - (i186 ^ 150)) ^ (-1));
                    int i188 = ~((i131 ^ i136) | (i131 & i136));
                    int i189 = i130 & 3;
                    int i190 = (~i189) & (i130 | 3);
                    int i191 = ~((i190 & i189) | (i190 ^ i189));
                    int i192 = i188 & i191;
                    int i193 = (i188 | i191) & (~i192);
                    int i194 = -(-(((i193 & i192) | (i193 ^ i192)) * 98));
                    int i195 = i187 & i194;
                    int i196 = ((((i187 ^ i194) | i195) << 1) - (~(-((i194 | i187) & (~i195))))) - 1;
                    int i197 = (-4) & i135;
                    int i198 = ((-4) | i135) & (~i197);
                    int i199 = ~((i198 & i197) | (i198 ^ i197));
                    int i200 = (~i199) & i131;
                    int i201 = ~i131;
                    int i202 = (i199 & i131) | i200 | (i199 & i201);
                    int i203 = ~((i135 & 3) | (iIntValue & (-4)) | (iIntValue & 3));
                    int i204 = i202 & i203;
                    int i205 = (i202 | i203) & (~i204);
                    int i206 = (i196 - (~(-(-(((i205 & i204) | (i205 ^ i204)) * (-49)))))) - 1;
                    int i207 = ~((i132 ^ i133) | (i132 & i133));
                    int i208 = i189 | (i126 & (-4));
                    int i209 = i126 & 3;
                    int i210 = (i208 & i209) | (i208 ^ i209);
                    int i211 = ~i210;
                    int i212 = (i210 | i211) & i211;
                    int i213 = ((i207 & i212) | (i207 ^ i212)) * 49;
                    int i214 = ((i206 | i213) << 1) - (i213 ^ i206);
                    int i215 = 63 & iIntValue;
                    bArr2[i214] = (byte) (i215 | ((~i215) & 128));
                    int i216 = i126 * (-489);
                    int i217 = 1964 & i216;
                    int i218 = (i217 - (~((1964 ^ i216) | i217))) - 1;
                    int i219 = ((-5) & i201) | (i131 & 4);
                    int i220 = (-5) & i131;
                    int i221 = (i220 & i219) | (i219 ^ i220);
                    int i222 = i221 ^ i135;
                    int i223 = i221 & i135;
                    int i224 = -(-(((i223 & i222) | (i222 ^ i223)) * (-490)));
                    int i225 = (i218 & i224) + (i224 | i218);
                    int i226 = ~((i130 ^ 4) | (4 & i130));
                    int i227 = -(-(((i226 & i134) | (i226 ^ i134)) * 490));
                    int i228 = (i225 ^ i227) + ((i227 & i225) << 1);
                    int i229 = i228 & (-2450);
                    x6.setX = (i229 - (~(-(-((i228 ^ (-2450)) | i229))))) - 1;
                    abxVar = abxVar2;
                    abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() + 4);
                    int i230 = f52357q0;
                    int i231 = ((i230 ^ 67) | (i230 & 67)) << 1;
                    int i232 = -(((~i230) & 67) | (i230 & (-68)));
                    int i233 = (i231 & i232) + (i232 | i231);
                    f52358r0 = i233 % 128;
                    int i234 = i233 % 2;
                }
                int i235 = f52358r0;
                int i236 = i235 & 87;
                int i237 = ((i235 ^ 87) | i236) << 1;
                int i238 = -((i235 | 87) & (~i236));
                i10 = (i237 ^ i238) + ((i238 & i237) << 1);
                f52357q0 = i10 % 128;
                if (i10 % 2 == 0) {
                    return abxVar;
                }
                throw null;
            }
            int i239 = (-2) - ((i11 + 74) ^ (-1));
            f52357q0 = i239 % 128;
            int i240 = i239 % 2;
            acj x7 = abxVar2.setX(2);
            byte[] bArr3 = x7.setOnFocusChangeListener;
            int i241 = x7.setX;
            int i242 = iIntValue >> 6;
            int i243 = i242 & 192;
            int i244 = (i242 | 192) & (~i243);
            bArr3[i241] = (byte) ((i244 & i243) | (i244 ^ i243));
            int i245 = ~iIntValue;
            bArr3[((i241 | 1) << 1) - (i241 ^ 1)] = (byte) (128 ^ (iIntValue & 63));
            int i246 = i241 * 530;
            int i247 = 2118 & i246;
            int i248 = (i246 ^ 2118) | i247;
            int i249 = (i247 & i248) + (i248 | i247);
            int i250 = ~(i245 | 2);
            int i251 = ~i241;
            int i252 = (i251 & 2) | (i241 & (-3));
            int i253 = i241 & 2;
            int i254 = (i252 & i253) | (i252 ^ i253);
            int i255 = ~i254;
            int i256 = (i254 | i255) & i255;
            int i257 = ((~i256) & i250) | ((~i250) & i256);
            int i258 = i250 & i256;
            int i259 = -(-(((i258 & i257) | (i257 ^ i258)) * 529));
            int i260 = i249 & i259;
            int i261 = (i260 - (~(-(-((i259 ^ i249) | i260))))) - 1;
            int i262 = (i251 | i241) & i251;
            int i263 = iIntValue ^ 2;
            int i264 = iIntValue & 2;
            int i265 = ~((i264 & i263) | (i263 ^ i264));
            int i266 = i262 ^ i265;
            int i267 = i265 & i262;
            int i268 = ((i267 & i266) | (i266 ^ i267)) * 529;
            int i269 = i261 ^ i268;
            int i270 = (i268 & i261) << 1;
            x7.setX = ((i269 | i270) << 1) - (i270 ^ i269);
            abxVar2.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() + 2);
            int i271 = f52357q0;
            int i272 = i271 & 15;
            int i273 = (i271 ^ 15) | i272;
            int i274 = ((i272 | i273) << 1) - (i273 ^ i272);
            f52358r0 = i274 % 128;
            int i275 = i274 % 2;
        }
        abxVar = abxVar2;
        int i2310 = f52358r0;
        int i2311 = i2310 & 87;
        int i2312 = ((i2310 ^ 87) | i2311) << 1;
        int i2313 = -((i2310 | 87) & (~i2311));
        i10 = (i2312 ^ i2313) + ((i2313 & i2312) << 1);
        f52357q0 = i10 % 128;
        if (i10 % 2 == 0) {
            return abxVar;
        }
        throw null;
    }

    @NotNull
    public final abw A(int i10) throws NoSuchAlgorithmException, EOFException {
        int i11 = f52357q0;
        int i12 = 1;
        int i13 = ((i11 ^ 15) - (~(-(-((i11 & 15) << 1))))) - 1;
        int i14 = i13 % 128;
        f52358r0 = i14;
        int i15 = 2;
        int i16 = i13 % 2;
        int i17 = 0;
        if (i10 == 0) {
            int i18 = ((i14 ^ 17) | (i14 & 17)) << 1;
            int i19 = -(((~i14) & 17) | (i14 & (-18)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f52357q0 = i20 % 128;
            if (i20 % 2 != 0) {
                abw.Companion companion = abw.INSTANCE;
                throw null;
            }
            abw abwVar = abw.setOnFocusChangeListener;
            int i21 = (~i10) | (-1357622116);
            int i22 = (i21 & (-1990368704)) | (i21 ^ (-1990368704));
            int i23 = (i22 | (~i22)) & (~i22);
            int i24 = (-1995161600) ^ i23;
            int i25 = i23 & (-1995161600);
            int i26 = (-1582694933) - (~(-(-(((i25 & i24) | (i24 ^ i25)) * 220))));
            int i27 = ~i10;
            int i28 = -(~(((-1357622116) | (~(((-1990368704) & i27) | (i27 ^ (-1990368704))))) * (-440)));
            int i29 = ((-1) << 1) - ((((i26 | i28) << 1) - (i28 ^ i26)) ^ (-1));
            int i30 = (-1352829220) & i10;
            int i31 = -(-((((i10 | (-1352829220)) & (~i30)) | i30) * 220));
            int i32 = (((i29 ^ i31) | (i29 & i31)) << 1) - ((i31 & (~i29)) | ((~i31) & i29));
            int i33 = 43784883 & i27;
            int i34 = i33 | ((~i33) & (43784883 | i27));
            int i35 = (~((i34 & 379647787) | (i34 ^ 379647787))) * (-783);
            int i36 = 412037882 & i35;
            int i37 = -(-((i35 ^ 412037882) | i36));
            int i38 = (i36 & i37) + (i37 | i36);
            int i39 = (i27 & 379647787) | (i27 ^ 379647787);
            int i40 = (i39 | (~i39)) & (~i39);
            int i41 = 43784883 ^ i40;
            int i42 = 43784883 & i40;
            int i43 = -(-(((i42 & i41) | (i41 ^ i42)) * 783));
            int i44 = i38 & i43;
            if (i32 <= (((i43 | i38) & (~i44)) - (~(-(-(i44 << 1))))) - 1) {
                int i45 = 86 / 0;
            }
            return abwVar;
        }
        acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue()), 0L, Long.valueOf(i10)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
        acj acjVar = this.setDividerPadding;
        int i46 = f52357q0;
        int i47 = i46 & 3;
        int i48 = -(-((3 ^ i46) | i47));
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        f52358r0 = i49 % 128;
        int i50 = i49 % 2;
        int i51 = 0;
        int i52 = 0;
        while (i51 < i10) {
            int i53 = f52358r0;
            int i54 = i53 & 1;
            int i55 = (i53 ^ 1) | i54;
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            f52357q0 = i56 % 128;
            int i57 = i56 % 2;
            Intrinsics.checkNotNull(acjVar);
            int i58 = acjVar.setX;
            int i59 = acjVar.setCompoundDrawableTintBlendMode;
            if (i58 == i59) {
                throw new AssertionError("s.limit == s.pos");
            }
            int i60 = -i59;
            int i61 = i58 & i60;
            int i62 = (i58 ^ i60) | i61;
            int i63 = -(~(((i61 | i62) << 1) - (i62 ^ i61)));
            i51 = ((-1) << 1) - (((i51 & i63) + (i51 | i63)) ^ (-1));
            int i64 = 1587 - (~(-(-(i52 * 530))));
            int i65 = ~i10;
            int i66 = (i65 & (-2)) | ((~i65) & 1);
            int i67 = i65 & 1;
            int i68 = ~((i67 & i66) | (i66 ^ i67));
            int i69 = i52 & 1;
            int i70 = (~i69) & (i52 | 1);
            int i71 = (i69 & i70) | (i70 ^ i69);
            int i72 = (i71 | (~i71)) & (~i71);
            int i73 = i68 & i72;
            int i74 = (i68 | i72) & (~i73);
            int i75 = -(-(((i74 & i73) | (i74 ^ i73)) * 529));
            int i76 = ((((~i75) & i64) | ((~i64) & i75)) - (~((i64 & i75) << 1))) - 1;
            int i77 = ~i52;
            int i78 = ~((i10 ^ 1) | (i10 & 1));
            int i79 = ((~i78) & i77) | ((~i77) & i78);
            int i80 = i77 & i78;
            int i81 = ((i80 & i79) | (i79 ^ i80)) * 529;
            int i82 = i76 & i81;
            int i83 = ((i76 ^ i81) | i82) << 1;
            int i84 = -((i81 | i76) & (~i82));
            i52 = ((i83 | i84) << 1) - (i84 ^ i83);
            acjVar = acjVar.setDividerPadding;
            int i85 = f52358r0;
            int i86 = ((i85 ^ 2) + ((i85 & 2) << 1)) - 1;
            f52357q0 = i86 % 128;
            int i87 = i86 % 2;
        }
        byte[][] bArr = new byte[i52][];
        int[] iArr = new int[i52 << 1];
        acj acjVar2 = this.setDividerPadding;
        int i88 = f52357q0;
        int i89 = i88 & 29;
        int i90 = (i88 | 29) & (~i89);
        int i91 = i89 << 1;
        int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
        f52358r0 = i92 % 128;
        int i93 = i92 % 2;
        acj acjVar3 = acjVar2;
        int i94 = 0;
        while (i17 < i10) {
            int i95 = f52358r0;
            int i96 = i95 & 111;
            int i97 = ((i95 ^ 111) | i96) << i12;
            int i98 = -((i95 | 111) & (~i96));
            int i99 = (i97 ^ i98) + ((i98 & i97) << i12);
            f52357q0 = i99 % 128;
            int i100 = i99 % i15;
            Intrinsics.checkNotNull(acjVar3);
            bArr[i94] = acjVar3.setOnFocusChangeListener;
            int i101 = acjVar3.setX;
            int i102 = -acjVar3.setCompoundDrawableTintBlendMode;
            int i103 = i102 * (-405);
            int i104 = -(-(i101 * 407));
            int i105 = (i103 | i104) << i12;
            int i106 = -(((~i103) & i104) | ((~i104) & i103));
            int i107 = ((i105 | i106) << i12) - (i106 ^ i105);
            int i108 = (~i101) & ((~i101) | i101);
            int i109 = i108 ^ i10;
            int i110 = ~i10;
            int i111 = i108 & i10;
            int i112 = ~((i109 ^ i111) | (i111 & i109));
            int i113 = ~i10;
            int i114 = i110 | i10;
            int i115 = (i113 & i114) | i102;
            int i116 = i115 & i101;
            int i117 = (~i116) & (i115 | i101);
            int i118 = ~((i117 ^ i116) | (i117 & i116));
            int i119 = -(-(((i118 & i112) | (i112 ^ i118)) * (-406)));
            int i120 = i107 & i119;
            int i121 = (i120 - (~(-(-((i119 ^ i107) | i120))))) - 1;
            int i122 = ~i101;
            int i123 = i113 & i114;
            int i124 = (i122 & i123) | (i122 ^ i123);
            int i125 = i124 & i102;
            int i126 = (i124 | i102) & (~i125);
            int i127 = (i126 & i125) | (i126 ^ i125);
            int i128 = ((i127 | (~i127)) & (~i127)) * (-406);
            int i129 = ((i121 & i128) - (~(-(-(i128 | i121))))) - 1;
            int i130 = ~i102;
            int i131 = ~((i130 & i10) | (i130 ^ i10));
            int i132 = i110 ^ i101;
            int i133 = i101 & i110;
            int i134 = ~((i132 & i133) | (i132 ^ i133));
            int i135 = ((i131 & i134) | (i131 ^ i134)) * 406;
            int i136 = ((i129 ^ i135) | (i129 & i135)) << 1;
            int i137 = -((i135 & (~i129)) | ((~i135) & i129));
            int i138 = -(~((i136 & i137) + (i137 | i136)));
            int i139 = (i17 ^ i138) + ((i17 & i138) << 1);
            i17 = (i139 ^ (-1)) + (i139 << 1);
            iArr[i94] = Math.min(i17, i10);
            iArr[(i94 - (~(-(~i52)))) - 2] = acjVar3.setCompoundDrawableTintBlendMode;
            acjVar3.setLayoutAnimation = true;
            i94 = (i94 | 1) + (i94 & 1);
            acjVar3 = acjVar3.setDividerPadding;
            int i140 = f52358r0;
            int i141 = i140 & 73;
            int i142 = i141 + ((i140 ^ 73) | i141);
            f52357q0 = i142 % 128;
            int i143 = i142 % 2;
            i12 = 1;
            i15 = 2;
        }
        acr acrVar = new acr(bArr, iArr);
        int i144 = f52357q0;
        int i145 = i144 & 35;
        int i146 = -(-((i144 ^ 35) | i145));
        int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
        f52358r0 = i147 % 128;
        int i148 = i147 % 2;
        return acrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0626, code lost:
    
        r10 = r10 + 1;
        r12 = (r8 & 93) + (r8 | 93);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0633, code lost:
    
        r1 = -r6.setCompoundDrawableTintBlendMode;
        r6 = ((long) ((r10 & r1) + (r1 | r10))) + r3;
        r1 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r3 = r1 & 55;
        r1 = (r1 | 55) & (~r3);
        r3 = -(-(r3 << 1));
        r4 = ((r1 | r3) << 1) - (r1 ^ r3);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0651, code lost:
    
        if ((r4 % 2) != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0653, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0654, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0655, code lost:
    
        r8 = r6.setX;
        r9 = -r6.setCompoundDrawableTintBlendMode;
        r10 = ((r8 ^ r9) | (r8 & r9)) << 1;
        r8 = -(((~r8) & r9) | ((~r9) & r8));
        r21 = r3 + ((long) ((r10 ^ r8) + ((r8 & r10) << 1)));
        r6 = r6.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        r3 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r4 = (r3 & 87) + (r3 | 87);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r4 % 128;
        r4 = r4 % 2;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0687, code lost:
    
        r1 = r25.setAlwaysDrawnWithCacheEnabled();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x068d, code lost:
    
        r9 = new java.lang.Object[r5];
        r10 = 0;
        r9[0] = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x06a8, code lost:
    
        if (r3 >= ((java.lang.Long) setOnFocusChangeListener(r9, 1395393434, -1395393402, java.lang.System.identityHashCode(r24))).longValue()) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x06aa, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r14 = r9 & 41;
        r11 = ((r9 ^ 41) | r14) << r5;
        r14 = -((~r14) & (r9 | 41));
        r15 = (r11 ^ r14) + ((r11 & r14) << r5);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r15 % 128;
        r15 = r15 % r2;
        r11 = r6.setOnFocusChangeListener;
        r7 = (int) ((((long) r6.setCompoundDrawableTintBlendMode) + r7) - r3);
        r8 = r6.setX;
        r9 = r9 + 13;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r9 % 128;
        r9 = r9 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x06d2, code lost:
    
        if (r7 >= r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x06d4, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.abx.f52358r0 + 121;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x06dd, code lost:
    
        if ((r9 % r2) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x06df, code lost:
    
        r9 = r11[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x06e1, code lost:
    
        r14 = r1.length;
        r14 = r9;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x06e6, code lost:
    
        r9 = r11[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x06e9, code lost:
    
        if (r9 >= r14) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x06eb, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.abx.f52358r0 + 23;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x06f4, code lost:
    
        if ((r10 % r2) == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x06f6, code lost:
    
        r10 = r1[r9];
        r12 = r9 & 57;
        r9 = -(-((r9 ^ 57) | r12));
        r9 = (r12 ^ r9) + ((r9 & r12) << r5);
        r12 = r9 << 1;
        r9 = -r9;
        r9 = (r12 ^ r9) + ((r9 & r12) << r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x070e, code lost:
    
        if (r14 != r10) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0716, code lost:
    
        r10 = r1[r9];
        r9 = ((r9 & 1) << r5) + (r9 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x071e, code lost:
    
        if (r14 != r10) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0720, code lost:
    
        r1 = -r6.setCompoundDrawableTintBlendMode;
        r2 = r7 ^ r1;
        r1 = ((r1 & r7) | r2) << r5;
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0730, code lost:
    
        return ((long) ((r1 ^ r2) + ((r1 & r2) << r5))) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0731, code lost:
    
        r9 = java.lang.System.identityHashCode(r24);
        r10 = -(-(r7 * (-195)));
        r14 = (((-391) | r10) << r5) - (r10 ^ (-391));
        r10 = ~r7;
        r12 = r10 & (-2);
        r15 = ((~r10) & r5) | r12;
        r16 = r10 & 1;
        r15 = ~((r15 ^ r16) | (r15 & r16));
        r16 = r7 ^ r9;
        r9 = r9 & r7;
        r9 = (r16 ^ r9) | (r16 & r9);
        r13 = ~r9;
        r9 = (r9 | r13) & r13;
        r2 = r15 & r9;
        r5 = (~r2) & (r9 | r15);
        r2 = -(~(((r2 & r5) | (r5 ^ r2)) * (-196)));
        r14 = (-2) - (((r14 ^ r2) + ((r2 & r14) << 1)) ^ (-1));
        r2 = r7 ^ 1;
        r5 = r7 & 1;
        r2 = -(-(((r2 & r5) | (r2 ^ r5)) * 392));
        r5 = r14 & r2;
        r2 = -(-((r2 ^ r14) | r5));
        r7 = (r5 ^ r2) + ((r2 & r5) << 1);
        r5 = ~(((-2) ^ r10) | r12);
        r9 = r5 ^ r13;
        r5 = r5 & r13;
        r5 = ((r5 & r9) | (r9 ^ r5)) * 196;
        r9 = ((r7 ^ r5) | (r7 & r5)) << 1;
        r5 = -((r5 & (~r7)) | ((~r5) & r7));
        r7 = (r9 & r5) + (r5 | r9);
        r5 = com.mypinpad.tsdk.isolation.abx.f52357q0;
        r9 = ((r5 | 10) << 1) - (r5 ^ 10);
        r5 = (r9 ^ (-1)) + (r9 << 1);
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r5 % 128;
        r5 = r5 % 2;
        r2 = 2;
        r5 = 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x07c8, code lost:
    
        r5 = r6.setX;
        r7 = -r6.setCompoundDrawableTintBlendMode;
        r8 = (r5 & r7) - (~(r5 | r7));
        r5 = 1;
        r7 = ((long) (r8 - 1)) + r3;
        r6 = r6.setDividerPadding;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        r3 = r7;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0571, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.abw.setX(new java.lang.Object[]{r25}, -1716166708, 1716166712, java.lang.System.identityHashCode(r25))).intValue() == 3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x058d, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.abw.setX(new java.lang.Object[]{r25}, -1716166708, 1716166712, java.lang.System.identityHashCode(r25))).intValue() == 2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x058f, code lost:
    
        r7 = new java.lang.Object[2];
        r7[r8] = r25;
        r7[1] = java.lang.Integer.valueOf(r8);
        r7 = ((java.lang.Byte) com.mypinpad.tsdk.isolation.abw.setX(r7, 2055130869, -2055130861, r8)).byteValue();
        r11 = new java.lang.Object[2];
        r11[r8] = r25;
        r11[1] = 1;
        r1 = ((java.lang.Byte) com.mypinpad.tsdk.isolation.abw.setX(r11, 2055130869, -2055130861, 1)).byteValue();
        r8 = com.mypinpad.tsdk.isolation.abx.f52357q0 + 21;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r8 % 128;
        r8 = r8 % 2;
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x05e3, code lost:
    
        if (r3 >= ((java.lang.Long) setOnFocusChangeListener(new java.lang.Object[]{r24}, 1395393434, -1395393402, java.lang.System.identityHashCode(r24))).longValue()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x05e5, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r9 = (r8 & 111) + (r8 | 111);
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r9 % 128;
        r9 = r9 % 2;
        r9 = r6.setOnFocusChangeListener;
        r10 = (int) ((((long) r6.setCompoundDrawableTintBlendMode) + r21) - r3);
        r11 = r6.setX;
        r8 = r8 + 27;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0603, code lost:
    
        if (r10 >= r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0605, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.abx.f52358r0;
        r12 = (((r8 | 38) << 1) - (r8 ^ 38)) - 1;
        r8 = r12 % 128;
        com.mypinpad.tsdk.isolation.abx.f52357q0 = r8;
        r12 = r12 % 2;
        r12 = r9[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0615, code lost:
    
        if (r12 == r7) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0617, code lost:
    
        r13 = r8 ^ 43;
        r14 = (((r8 & 43) | r13) << 1) - r13;
        com.mypinpad.tsdk.isolation.abx.f52358r0 = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0623, code lost:
    
        if (r12 != r1) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long G(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.abw r25) throws java.security.NoSuchAlgorithmException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abx.G(com.mypinpad.tsdk.i.abw):long");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x023d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0252 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0256  */
    /* JADX WARN: Code duplicated, block: B:65:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0259  */
    /* JADX WARN: Code duplicated, block: B:68:0x0268  */
    /* JADX WARN: Code duplicated, block: B:71:0x0274 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0278  */
    /* JADX WARN: Code duplicated, block: B:74:0x0279  */
    public final int UiMessageCallbackKtWhenMappings() throws NoSuchAlgorithmException, IOException {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = f52357q0;
        int i20 = i19 & 59;
        int i21 = (i19 ^ 59) | i20;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f52358r0 = i22 % 128;
        if (i22 % 2 != 0 ? ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() == 0 : ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() == 0) {
            throw new EOFException();
        }
        byte bByteValue = ((Byte) setOnFocusChangeListener(new Object[]{this, 0L}, 630256048, -630256030, System.identityHashCode(this))).byteValue();
        if ((bByteValue & 128) == 0) {
            int i23 = f52357q0;
            int i24 = i23 & 27;
            int i25 = (i23 | 27) & (~i24);
            int i26 = i24 << 1;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            f52358r0 = i27 % 128;
            if (i27 % 2 == 0) {
                i12 = bByteValue & 25;
                i18 = 1;
            } else {
                i12 = bByteValue & 127;
                i18 = 0;
            }
            i10 = i18;
            i11 = 1;
        } else if ((bByteValue & 224) == 192) {
            int i28 = f52357q0;
            int i29 = i28 + 117;
            f52358r0 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = i28 + 57;
            f52358r0 = i31 % 128;
            int i32 = i31 % 2;
            i10 = 128;
            i12 = bByteValue & 31;
            i11 = 2;
        } else if ((bByteValue & Constants.CVR_B2b8765_1111_APP_DISABLED) == 224) {
            int i33 = f52357q0 + 9;
            int i34 = i33 % 128;
            f52358r0 = i34;
            int i35 = i33 % 2;
            i12 = bByteValue & 15;
            int i36 = (i34 ^ 81) + ((i34 & 81) << 1);
            f52357q0 = i36 % 128;
            int i37 = i36 % 2;
            i11 = 3;
            i10 = 2048;
        } else {
            if ((bByteValue & 248) != 240) {
                setOnFocusChangeListener(new Object[]{this, 1L}, -1525846840, 1525846865, System.identityHashCode(this));
                int i38 = f52357q0;
                int i39 = i38 ^ 43;
                int i40 = ((i38 & 43) | i39) << 1;
                int i41 = -i39;
                int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                f52358r0 = i42 % 128;
                int i43 = i42 % 2;
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int i44 = f52357q0;
            int i45 = i44 ^ 61;
            int i46 = ((i44 & 61) | i45) << 1;
            int i47 = -i45;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            f52358r0 = i48 % 128;
            int i49 = i48 % 2;
            int i50 = i44 & 75;
            int i51 = (i44 ^ 75) | i50;
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            f52358r0 = i52 % 128;
            int i53 = i52 % 2;
            i10 = 65536;
            i11 = 4;
            i12 = bByteValue & 7;
        }
        long j10 = i11;
        if (((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() < j10) {
            StringBuilder sbC = o1.c("size < ", i11, ": ");
            sbC.append(setCompoundDrawableTintBlendMode());
            sbC.append(" (to read code point prefixed 0x");
            sbC.append((String) acv.setOnFocusChangeListener(new Object[]{Byte.valueOf(bByteValue)}, 178239610, -178239609, (int) System.currentTimeMillis()));
            sbC.append(RootService.CLOSE_BRACKET);
            throw new EOFException(sbC.toString());
        }
        if (1 < i11) {
            int i54 = 1;
            while (true) {
                int i55 = (i54 & (-57)) + (i54 | (-57));
                int i56 = (i55 & 58) + (i55 | 58);
                long j11 = i54;
                byte bByteValue2 = ((Byte) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j11)}, 630256048, -630256030, System.identityHashCode(this))).byteValue();
                if ((bByteValue2 & Constants.CVR_B2b87_11_RFU) != 128) {
                    setOnFocusChangeListener(new Object[]{this, Long.valueOf(j11)}, -1525846840, 1525846865, System.identityHashCode(this));
                    int i57 = f52357q0;
                    int i58 = (i57 ^ 70) + ((i57 & 70) << 1);
                    int i59 = (i58 ^ (-1)) + (i58 << 1);
                    f52358r0 = i59 % 128;
                    if (i59 % 2 != 0) {
                        return Utf8.REPLACEMENT_CODE_POINT;
                    }
                    int i60 = 76 / 0;
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                int i61 = f52357q0;
                int i62 = (((i61 | 90) << 1) - (i61 ^ 90)) - 1;
                int i63 = i62 % 128;
                f52358r0 = i63;
                if (i62 % 2 == 0) {
                    int i64 = ((-1) << 1) - ((i12 - 96) ^ (-1));
                    int i65 = bByteValue2 & 64;
                    int i66 = i64 & i65;
                    int i67 = (i64 | i65) & (~i66);
                    i16 = i67 ^ i66;
                    i17 = i67 & i66;
                } else {
                    int i68 = i12 << 6;
                    int i69 = bByteValue2 & 63;
                    int i70 = i68 ^ i69;
                    int i71 = i68 & i69;
                    i16 = i70 ^ i71;
                    i17 = i71 & i70;
                }
                i12 = i17 | i16;
                int i72 = i63 & 47;
                int i73 = (i63 | 47) & (~i72);
                int i74 = -(-(i72 << 1));
                int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
                f52357q0 = i75 % 128;
                int i76 = i75 % 2;
                if (i56 >= i11) {
                    break;
                }
                i54 = i56;
            }
        }
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1525846840, 1525846865, System.identityHashCode(this));
        if (i12 > 1114111) {
            int i77 = f52358r0;
            int i78 = i77 & 45;
            int i79 = (i78 - (~(-(-((i77 ^ 45) | i78))))) - 1;
            f52357q0 = i79 % 128;
            int i80 = i79 % 2;
            int i81 = (i77 ^ 63) + ((i77 & 63) << 1);
            f52357q0 = i81 % 128;
            int i82 = i81 % 2;
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        if (55296 <= i12) {
            int i83 = f52358r0;
            int i84 = i83 & 27;
            int i85 = (i83 ^ 27) | i84;
            int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
            f52357q0 = i86 % 128;
            int i87 = i86 % 2;
            if (i12 <= 57343) {
                System.identityHashCode(this);
                System.identityHashCode(this);
                z10 = true;
            } else {
                int i88 = ((-1) << 1) - ((i83 + 46) ^ (-1));
                f52357q0 = i88 % 128;
                int i89 = i88 % 2;
            }
            if (z10) {
                int i90 = f52357q0;
                int i91 = i90 & 13;
                i15 = (((i90 ^ 13) | i91) << 1) - ((i90 | 13) & (~i91));
                f52358r0 = i15 % 128;
                if (i15 % 2 != 0) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                throw null;
            }
            if (i12 < i10) {
                int i92 = f52357q0;
                int i93 = i92 & 81;
                int i94 = -(-((i92 ^ 81) | i93));
                int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                f52358r0 = i95 % 128;
                int i96 = i95 % 2;
                return i12;
            }
            int i97 = f52357q0;
            i13 = (i97 ^ 53) + ((i97 & 53) << 1);
            int i98 = i13 % 128;
            f52358r0 = i98;
            if (i13 % 2 == 0) {
                int i99 = 49 / 0;
            }
            i14 = i98 + 121;
            f52357q0 = i14 % 128;
            if (i14 % 2 == 0) {
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            throw null;
        }
        int i100 = f52357q0;
        int i101 = i100 & 69;
        int i102 = (((i100 ^ 69) | i101) << 1) - ((i100 | 69) & (~i101));
        f52358r0 = i102 % 128;
        int i103 = i102 % 2;
        z10 = false;
        if (z10) {
            int i910 = f52357q0;
            int i911 = i910 & 13;
            i15 = (((i910 ^ 13) | i911) << 1) - ((i910 | 13) & (~i911));
            f52358r0 = i15 % 128;
            if (i15 % 2 != 0) {
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            throw null;
        }
        if (i12 < i10) {
            int i912 = f52357q0;
            int i913 = i912 & 81;
            int i914 = -(-((i912 ^ 81) | i913));
            int i915 = ((i913 | i914) << 1) - (i914 ^ i913);
            f52358r0 = i915 % 128;
            int i916 = i915 % 2;
            return i12;
        }
        int i917 = f52357q0;
        i13 = (i917 ^ 53) + ((i917 & 53) << 1);
        int i918 = i13 % 128;
        f52358r0 = i918;
        if (i13 % 2 == 0) {
            int i919 = 49 / 0;
        }
        i14 = i918 + 121;
        f52357q0 = i14 % 128;
        if (i14 % 2 == 0) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        throw null;
    }

    public final /* synthetic */ Object clone() {
        return setOnFocusChangeListener(new Object[]{this}, 1106469996, -1106469961, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = f52358r0;
        int i11 = (i10 & (-64)) | ((~i10) & 63);
        int i12 = (i10 & 63) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52357q0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, 2036490488, -2036490450, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abv, com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    public final void flush() {
        int i10 = f52358r0;
        int i11 = ((i10 & (-12)) | ((~i10) & 11)) + ((i10 & 11) << 1);
        f52357q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv getAmountFieldTextColor() {
        return (abv) setOnFocusChangeListener(new Object[]{this}, -1271658616, 1271658617, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv getNavBarTitleString(int i10) {
        int i11 = f52358r0 + 69;
        f52357q0 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        abx abxVar = (abx) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1617903421, 1617903423, i10);
        int i12 = f52357q0;
        int i13 = ((i12 & (-96)) | ((~i12) & 95)) + ((i12 & 95) << 1);
        f52358r0 = i13 % 128;
        int i14 = i13 % 2;
        return abxVar;
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -284443708, 284443717, System.identityHashCode(this))).intValue();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -975538592, 975538621, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final abw o() throws NoSuchAlgorithmException, EOFException {
        int i10 = f52358r0 + 41;
        f52357q0 = i10 % 128;
        if (i10 % 2 != 0) {
            ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue();
            throw null;
        }
        if (((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() > 2147483647L) {
            int i11 = f52357q0;
            int i12 = (-2) - (((i11 & 76) + (i11 | 76)) ^ (-1));
            f52358r0 = i12 % 128;
            int i13 = i12 % 2;
            throw new IllegalStateException(Intrinsics.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue())).toString());
        }
        int i14 = f52358r0;
        int i15 = (i14 & (-74)) | ((~i14) & 73);
        int i16 = (i14 & 73) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = i17 % 128;
        f52357q0 = i18;
        int i19 = i17 % 2;
        int i20 = ((i18 & (-86)) | ((~i18) & 85)) + ((i18 & 85) << 1);
        f52358r0 = i20 % 128;
        int i21 = i20 % 2;
        abw abwVarA = A((int) ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue());
        int i22 = f52358r0;
        int i23 = (i22 & (-70)) | ((~i22) & 69);
        int i24 = -(-((i22 & 69) << 1));
        int i25 = (i23 & i24) + (i24 | i23);
        f52357q0 = i25 % 128;
        int i26 = i25 % 2;
        return abwVarA;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        int i10 = f52357q0;
        int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        acj acjVar = this.setDividerPadding;
        if (acjVar == null) {
            int i13 = f52358r0;
            int i14 = i13 & 79;
            int i15 = i14 + ((i13 ^ 79) | i14);
            f52357q0 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((-1) << 1) - ((((i13 | 50) << 1) - (i13 ^ 50)) ^ (-1));
            f52357q0 = i17 % 128;
            int i18 = i17 % 2;
            return -1;
        }
        int iRemaining = byteBuffer.remaining();
        int i19 = acjVar.setX;
        int i20 = -acjVar.setCompoundDrawableTintBlendMode;
        int i21 = i19 & i20;
        int iMin = Math.min(iRemaining, ((i19 | i20) & (~i21)) + (i21 << 1));
        byteBuffer.put(acjVar.setOnFocusChangeListener, acjVar.setCompoundDrawableTintBlendMode, iMin);
        int i22 = acjVar.setCompoundDrawableTintBlendMode;
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = ((iMin * (-559)) - (~(i22 * 561))) - 1;
        int i24 = ~iIdentityHashCode;
        int i25 = ~iMin;
        int i26 = (i24 & i25) | ((~i24) & iMin);
        int i27 = i24 & iMin;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = -(-(((i28 | (~i28)) & (~i28)) * (-560)));
        int i30 = i23 & i29;
        int i31 = (i23 | i29) & (~i30);
        int i32 = i30 << 1;
        int i33 = (i31 & i32) + (i31 | i32);
        int i34 = ~i22;
        int i35 = (i34 & iMin) | (i34 & i25) | ((~i34) & iMin);
        int i36 = ~iIdentityHashCode;
        int i37 = (i35 & i36) | ((~i35) & iIdentityHashCode);
        int i38 = iIdentityHashCode & i35;
        int i39 = -(~((~((i38 & i37) | (i37 ^ i38))) * (-560)));
        int i40 = ((i33 & i39) + (i39 | i33)) - 1;
        int i41 = ((~i22) & i25) | ((~i25) & i22);
        int i42 = i25 & i22;
        int i43 = (i41 & i42) | (i41 ^ i42);
        int i44 = (i43 | (~i43)) & (~i43);
        int i45 = i36 ^ i22;
        int i46 = i22 & i36;
        int i47 = ~((i46 & i45) | (i45 ^ i46));
        int i48 = i44 & i47;
        int i49 = (i47 | i44) & (~i48);
        int i50 = ((i49 & i48) | (i49 ^ i48)) * 560;
        int i51 = (i40 & i50) + (i50 | i40);
        acjVar.setCompoundDrawableTintBlendMode = i51;
        this.f52359p0 -= (long) iMin;
        if (i51 == acjVar.setX) {
            int i52 = f52357q0;
            int i53 = i52 & 109;
            int i54 = (i52 ^ 109) | i53;
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            f52358r0 = i55 % 128;
            if (i55 % 2 == 0) {
                this.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                int i56 = 77 / 0;
            } else {
                this.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
            }
        }
        int i57 = f52357q0;
        int i58 = ((i57 ^ 4) + ((i57 & 4) << 1)) - 1;
        f52358r0 = i58 % 128;
        int i59 = i58 % 2;
        return iMin;
    }

    @NotNull
    public final abx setAlwaysDrawnWithCacheEnabled(long j10) throws NoSuchAlgorithmException, EOFException {
        int i10 = f52357q0;
        int i11 = 1;
        int i12 = ((-1) << 1) - (((i10 ^ 122) + ((i10 & 122) << 1)) ^ (-1));
        f52358r0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        int i15 = 0;
        if (j10 == 0) {
            int i16 = (((i10 | 75) << 1) - (~(-(((~i10) & 75) | (i10 & (-76)))))) - 1;
            f52358r0 = i16 % 128;
            int i17 = i16 % 2;
            abx abxVar = (abx) setOnFocusChangeListener(new Object[]{this, 48}, 1433477211, -1433477201, 48);
            int i18 = f52358r0;
            int i19 = i18 & 117;
            int i20 = (i18 ^ 117) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            f52357q0 = i21 % 128;
            int i22 = i21 % 2;
            return abxVar;
        }
        long j11 = j10 | (j10 >>> 1);
        long j12 = j11 | (j11 >>> 2);
        char c10 = 4;
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i23 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        acj x4 = setX(i23);
        byte[] bArr = x4.setOnFocusChangeListener;
        int i24 = x4.setX;
        int i25 = -(-i23);
        int i26 = i24 & i25;
        int i27 = (i26 - (~((i25 ^ i24) | i26))) - 1;
        int i28 = ~i27;
        int i29 = i27 << 1;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        int i31 = f52357q0;
        int i32 = i31 | 25;
        int i33 = i32 << 1;
        int i34 = -((~(i31 & 25)) & i32);
        int i35 = (i33 & i34) + (i34 | i33);
        f52358r0 = i35 % 128;
        int i36 = i35 % 2;
        long j22 = j10;
        while (i30 >= i24) {
            int i37 = f52358r0;
            int i38 = (((i37 | 84) << i11) - (i37 ^ 84)) - 1;
            f52357q0 = i38 % 128;
            int i39 = i38 % i13;
            bArr[i30] = ((byte[]) act.setDividerPadding(new Object[i15], 1872722051, -1872722050, (int) System.currentTimeMillis()))[(int) (15 & j22)];
            j22 >>>= c10;
            int iIdentityHashCode = System.identityHashCode(this);
            int i40 = -(-(i30 * 591));
            int i41 = (589 ^ i40) + ((i40 & 589) << i11);
            int i42 = ~i30;
            int i43 = ~iIdentityHashCode;
            int i44 = i42 & i43;
            int i45 = (~i44) & (i42 | i43);
            int i46 = ~((i45 ^ i44) | (i44 & i45));
            int i47 = ~i30;
            int i48 = i42 & (i47 | i30);
            int i49 = ~((~i48) | i48);
            int i50 = (i46 & i49) | (i46 ^ i49);
            int i51 = ~iIdentityHashCode;
            int i52 = (i43 | iIdentityHashCode) & i51;
            int i53 = ~((~i52) | i52);
            byte[] bArr2 = bArr;
            int i54 = i50 & i53;
            int i55 = ((i50 | i53) & (~i54)) | i54;
            int i56 = i30 & iIdentityHashCode;
            int i57 = (~i56) & (i30 | iIdentityHashCode);
            int i58 = ~((i56 & i57) | (i57 ^ i56));
            int i59 = i55 ^ i58;
            int i60 = i55 & i58;
            int i61 = ((i60 & i59) | (i59 ^ i60)) * 590;
            int i62 = i41 & i61;
            int i63 = ((i61 | i41) & (~i62)) + (i62 << 1);
            int i64 = ~(i47 | i43);
            int i65 = i47 | (~i47);
            int i66 = (i65 | (~i65)) & (~i65);
            int i67 = (i64 & i66) | ((~i66) & i64) | ((~i64) & i66);
            int i68 = i51 | (~i51);
            int i69 = (i68 | (~i68)) & (~i68);
            int i70 = i67 ^ i69;
            int i71 = i69 & i67;
            int i72 = ((i71 & i70) | (i70 ^ i71)) * (-1180);
            int i73 = i63 ^ i72;
            int i74 = -(-((i63 & i72) << 1));
            int i75 = (i73 & i74) + (i74 | i73);
            int i76 = ~i43;
            int i77 = ~((i52 ^ i30) | (i52 & i30));
            int i78 = -(-(((i76 & i77) | (i76 ^ i77)) * 590));
            int i79 = i75 & i78;
            int i80 = (i78 ^ i75) | i79;
            i30 = ((i79 | i80) << 1) - (i80 ^ i79);
            int i81 = f52357q0;
            int i82 = i81 & 23;
            int i83 = -(-((i81 ^ 23) | i82));
            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
            f52358r0 = i84 % 128;
            int i85 = i84 % 2;
            bArr = bArr2;
            i24 = i24;
            c10 = 4;
            i13 = 2;
            i11 = 1;
            i15 = 0;
        }
        int i86 = x4.setX;
        int i87 = i86 & i23;
        int i88 = ((i86 ^ i23) | i87) << 1;
        int i89 = -((i86 | i23) & (~i87));
        x4.setX = (i88 & i89) + (i89 | i88);
        setX(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + ((long) i23));
        int i90 = f52358r0;
        int i91 = (((i90 ^ 7) | (i90 & 7)) << 1) - (((~i90) & 7) | (i90 & (-8)));
        f52357q0 = i91 % 128;
        int i92 = i91 % 2;
        return this;
    }

    @NotNull
    public final abx setChildDivider() {
        return (abx) setOnFocusChangeListener(new Object[]{this}, -1050909291, 1050909303, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final void setCompoundDrawableTintBlendMode(long j10) throws EOFException {
        int i10 = f52357q0;
        int i11 = (i10 ^ 125) + ((i10 & 125) << 1);
        int i12 = i11 % 128;
        f52358r0 = i12;
        int i13 = i11 % 2;
        if (this.f52359p0 < j10) {
            throw new EOFException();
        }
        int i14 = i12 & 27;
        int i15 = -(-((i12 ^ 27) | i14));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        f52357q0 = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setDividerPadding(byte[] bArr) {
        int i10 = f52357q0;
        int i11 = (i10 ^ 91) + ((i10 & 91) << 1);
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        abx abxVar = (abx) setOnFocusChangeListener(new Object[]{this, bArr}, -808853030, 808853073, System.identityHashCode(this));
        int i13 = f52357q0;
        int i14 = ((i13 | 86) << 1) - (i13 ^ 86);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f52358r0 = i15 % 128;
        int i16 = i15 % 2;
        return abxVar;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setIncludeFontPadding(long j10) {
        return (abv) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -10092121, 10092129, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setLayoutAnimation(int i10) {
        int i11 = f52357q0;
        int i12 = (i11 & (-72)) | ((~i11) & 71);
        int i13 = (i11 & 71) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f52358r0 = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        abx abxVar = (abx) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 1433477211, -1433477201, i10);
        int i15 = f52357q0;
        int i16 = (((i15 | 4) << 1) - (i15 ^ 4)) - 1;
        f52358r0 = i16 % 128;
        if (i16 % 2 != 0) {
            return abxVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setNavigationOnClickListener(int i10) throws NoSuchAlgorithmException, IOException {
        int i11 = f52358r0;
        int i12 = (((i11 ^ 13) | (i11 & 13)) << 1) - (((~i11) & 13) | (i11 & (-14)));
        f52357q0 = i12 % 128;
        int i13 = i12 % 2;
        abx onFocusChangeListener = setOnFocusChangeListener(i10);
        int i14 = f52357q0;
        int i15 = (i14 & (-102)) | ((~i14) & 101);
        int i16 = -(-((i14 & 101) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f52358r0 = i17 % 128;
        if (i17 % 2 != 0) {
            return onFocusChangeListener;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final byte[] setOnDragListener(long j10) throws EOFException {
        return (byte[]) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 1697003307, -1697003267, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnEditorActionListener() {
        int i10 = f52357q0 + 21;
        f52358r0 = i10 % 128;
        if (i10 % 2 != 0) {
            return (byte[]) setOnFocusChangeListener(new Object[]{this, Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue())}, 1697003307, -1697003267, System.identityHashCode(this));
        }
        throw null;
    }

    public final int setOnLongClickListener() throws EOFException {
        int i10 = f52357q0;
        int i11 = (i10 & (-86)) | ((~i10) & 85);
        int i12 = (i10 & 85) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52358r0 = i13 % 128;
        int i14 = i13 % 2;
        int layoutAnimation = setLayoutAnimation();
        int iIntValue = ((Integer) acv.setOnFocusChangeListener(new Object[]{Integer.valueOf(layoutAnimation)}, 1109503243, -1109503240, layoutAnimation)).intValue();
        int i15 = f52357q0;
        int i16 = i15 ^ 1;
        int i17 = (i15 & 1) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f52358r0 = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 33 / 0;
        }
        return iIntValue;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setTextAlignment(long j10) {
        System.identityHashCode(this);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~(((-1852955586) & iIdentityHashCode) | ((-1852955586) ^ iIdentityHashCode));
        int i11 = 137386048 & i10;
        int i12 = (((i10 | 137386048) & (~i11)) | i11) * ReturnCode.ERR_CONN_IO;
        int i13 = 766429 & i12;
        int i14 = ((i13 + ((i12 ^ 766429) | i13)) - (~(-(~(-(-((~(iIdentityHashCode | (-1715569538))) * (-1504)))))))) - 2;
        int i15 = i14 & (-333697488);
        int i16 = -(-(((-333697488) ^ i14) | i15));
        Object[] objArr = new Object[2];
        if (437121286 > (i15 & i16) + (i16 | i15)) {
            objArr[0] = this;
            objArr[1] = Long.valueOf(j10);
            return (abx) setOnFocusChangeListener(objArr, -762518187, 762518202, System.identityHashCode(this));
        }
        objArr[0] = this;
        objArr[1] = Long.valueOf(j10);
        throw null;
    }

    public final void setTextScaleX() throws NoSuchAlgorithmException, IOException {
        setOnFocusChangeListener(new Object[]{this}, 502611487, -502611445, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setX(byte[] bArr, int i10, int i11) {
        int i12 = f52357q0;
        int i13 = (i12 | 101) << 1;
        int i14 = -(i12 ^ 101);
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        f52358r0 = i15 % 128;
        if (i15 % 2 != 0) {
            return (abx) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 1169071493, -1169071470, i10);
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final int setY(@NotNull aci aciVar) throws NoSuchAlgorithmException, IOException {
        int i10 = f52358r0;
        int i11 = ((i10 ^ 60) + ((i10 & 60) << 1)) - 1;
        f52357q0 = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(aciVar, "");
        int iIntValue = ((Integer) act.setDividerPadding(new Object[]{this, aciVar}, -366139388, 366139388, (int) System.currentTimeMillis())).intValue();
        if (iIntValue != -1) {
            abw abwVar = ((abw[]) aci.setOnFocusChangeListener(new Object[]{aciVar}, 642933220, -642933215, System.identityHashCode(aciVar)))[iIntValue];
            setOnFocusChangeListener(new Object[]{this, Long.valueOf(((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue())}, -1525846840, 1525846865, System.identityHashCode(this));
            int i13 = f52357q0;
            int i14 = (((i13 | 108) << 1) - (i13 ^ 108)) - 1;
            f52358r0 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 21 / 0;
            }
            return iIntValue;
        }
        int i16 = f52358r0;
        int i17 = ((i16 ^ 107) | (i16 & 107)) << 1;
        int i18 = -(((~i16) & 107) | (i16 & (-108)));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f52357q0 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = (~iIdentityHashCode) | iIdentityHashCode;
        int i22 = i20 & i21;
        int i23 = 945248987 & i22;
        int i24 = (i22 | 945248987) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = (i25 | (~i25)) & (~i25);
        int i27 = (i26 & (-2094488572)) | (i26 ^ (-2094488572));
        int i28 = i20 & i21;
        int i29 = i28 & 1691818939;
        int i30 = (i28 | 1691818939) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = (i31 | (~i31)) & (~i31);
        int i33 = i27 & i32;
        int i34 = (i32 | i27) & (~i33);
        int i35 = 1802623154 - (~(-(~(-(-(((i34 & i33) | (i34 ^ i33)) * (-397)))))));
        int i36 = i35 ^ (-1711692340);
        int i37 = ((-1711692340) & i35) << 1;
        int i38 = (i36 & i37) + (i37 | i36);
        int i39 = iIdentityHashCode ^ (-2094488572);
        int i40 = iIdentityHashCode & (-2094488572);
        int i41 = (i40 & i39) | (i39 ^ i40);
        int i42 = i41 & 542579355;
        int i43 = -(-((((i41 | 542579355) & (~i42)) | i42) * 397));
        int i44 = i38 & i43;
        int i45 = (i43 | i38) & (~i44);
        int i46 = -(-(i44 << 1));
        int i47 = (i45 & i46) + (i45 | i46);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i48 = ~iIdentityHashCode2;
        int i49 = ~((766810640 ^ i48) | (766810640 & i48));
        int i50 = 1020990587 & i49;
        int i51 = (i49 | 1020990587) & (~i50);
        int i52 = (i51 & i50) | (i51 ^ i50);
        int i53 = ~iIdentityHashCode2;
        int i54 = (766810640 & iIdentityHashCode2) | ((-766810641) & i53);
        int i55 = (-766810641) & iIdentityHashCode2;
        int i56 = (i54 & i55) | (i54 ^ i55);
        int i57 = (i56 | (~i56)) & (~i56);
        int i58 = i52 & i57;
        int i59 = -(-((((i57 | i52) & (~i58)) | i58) * (-564)));
        int i60 = (-164231889) & i59;
        int i61 = (i59 ^ (-164231889)) | i60;
        int i62 = (i60 & i61) + (i61 | i60);
        int i63 = (i53 & (-19171841)) | (19171840 & iIdentityHashCode2);
        int i64 = iIdentityHashCode2 & (-19171841);
        int i65 = (~((i64 & i63) | (i63 ^ i64))) * 1128;
        int i66 = (i62 & i65) + (i65 | i62);
        int i67 = ((~i48) & 1020990587) | ((-1020990588) & i48) | (i48 & 1020990587);
        int i68 = -(-((((i67 | (~i67)) & (~i67)) | 747638800) * 564));
        int i69 = i66 & i68;
        int i70 = -(-((i68 ^ i66) | i69));
        if (i47 > (i69 & i70) + (i70 | i69)) {
            return -1;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final long setZ() throws EOFException {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -1423871344, 1423871374, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1968137824, 1968137855, System.identityHashCode(this));
    }

    @NotNull
    public final abx u() throws NoSuchAlgorithmException, IOException {
        abx abxVar = new abx();
        if (((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() == 0) {
            int i10 = f52357q0;
            int i11 = i10 & 75;
            int i12 = (i10 | 75) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            int i15 = i14 % 128;
            f52358r0 = i15;
            int i16 = i14 % 2;
            int i17 = i15 & 109;
            int i18 = (((i15 ^ 109) | i17) << 1) - ((i15 | 109) & (~i17));
            f52357q0 = i18 % 128;
            int i19 = i18 % 2;
            return abxVar;
        }
        acj acjVar = this.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        acj acjVar2 = (acj) acj.setX(new Object[]{acjVar}, -1015520700, 1015520700, System.identityHashCode(acjVar));
        abxVar.setDividerPadding = acjVar2;
        acjVar2.setOnDragListener = acjVar2;
        acjVar2.setDividerPadding = acjVar2;
        acj acjVar3 = acjVar.setDividerPadding;
        int i20 = f52357q0;
        int i21 = i20 ^ 91;
        int i22 = ((i20 & 91) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 & i23) + (i22 | i23);
        f52358r0 = i24 % 128;
        int i25 = i24 % 2;
        while (acjVar3 != acjVar) {
            int i26 = f52357q0;
            int i27 = (i26 & (-8)) | ((~i26) & 7);
            int i28 = (i26 & 7) << 1;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f52358r0 = i29 % 128;
            int i30 = i29 % 2;
            acj acjVar4 = acjVar2.setOnDragListener;
            Intrinsics.checkNotNull(acjVar4);
            Intrinsics.checkNotNull(acjVar3);
            acjVar3 = acjVar3.setDividerPadding;
            int i31 = f52358r0;
            int i32 = i31 ^ 21;
            int i33 = (((i31 & 21) | i32) << 1) - i32;
            f52357q0 = i33 % 128;
            int i34 = i33 % 2;
        }
        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue());
        int i35 = f52358r0;
        int i36 = ((i35 ^ 32) + ((i35 & 32) << 1)) - 1;
        f52357q0 = i36 % 128;
        if (i36 % 2 == 0) {
            return abxVar;
        }
        throw null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, byteBuffer}, 936234497, -936234490, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String getNavBarTitleString(long j10) throws EOFException {
        return (String) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1247282902, 1247282923, System.identityHashCode(this));
    }

    public final long setDividerPadding() {
        int i10 = f52357q0;
        int i11 = i10 & 83;
        int i12 = (i10 ^ 83) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52358r0 = i13 % 128;
        int i14 = i13 % 2;
        long jLongValue = ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue();
        if (jLongValue == 0) {
            int i15 = f52358r0;
            int i16 = i15 ^ 53;
            int i17 = ((i15 & 53) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            f52357q0 = i19 % 128;
            int i20 = i19 % 2;
            return 0L;
        }
        acj acjVar = this.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        acj acjVar2 = acjVar.setOnDragListener;
        Intrinsics.checkNotNull(acjVar2);
        int i21 = acjVar2.setX;
        if (i21 < 8192) {
            int i22 = f52358r0;
            int i23 = i22 & 95;
            int i24 = (i22 ^ 95) | i23;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            f52357q0 = i25 % 128;
            int i26 = i25 % 2;
            if (acjVar2.setY) {
                int i27 = ((i22 | 47) << 1) - (i22 ^ 47);
                f52357q0 = i27 % 128;
                int i28 = i27 % 2;
                int i29 = -acjVar2.setCompoundDrawableTintBlendMode;
                int iIdentityHashCode = System.identityHashCode(this);
                int i30 = (-966) - (~(-(~(i29 * (-963)))));
                int i31 = -(-(i21 * 965));
                int i32 = ((i30 ^ i31) | (i30 & i31)) << 1;
                int i33 = -(((~i30) & i31) | ((~i31) & i30));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                int i35 = ~i29;
                int i36 = ~i21;
                int i37 = i36 & iIdentityHashCode;
                int i38 = (~i37) & (i36 | iIdentityHashCode);
                int i39 = ~iIdentityHashCode;
                int i40 = (i37 & i38) | (i38 ^ i37);
                int i41 = (i40 | (~i40)) & (~i40);
                int i42 = -(~(((i35 & i41) | ((~i41) & i35) | ((~i35) & i41)) * (-964)));
                int i43 = (((i34 | i42) << 1) - (i42 ^ i34)) - 1;
                int i44 = (iIdentityHashCode | i39) & (~iIdentityHashCode);
                int i45 = ((~i44) & i36) | ((~i36) & i44);
                int i46 = i44 & i36;
                int i47 = ~((i46 & i45) | (i45 ^ i46));
                int i48 = (i21 | (~i21)) & i36;
                int i49 = i48 & i29;
                int i50 = (i29 | i48) & (~i49);
                int i51 = ~((i50 & i49) | (i50 ^ i49));
                int i52 = ((~i51) & i47) | ((~i47) & i51);
                int i53 = i51 & i47;
                int i54 = ((i53 & i52) | (i52 ^ i53)) * (-964);
                jLongValue -= (long) (((((~i54) & i43) | ((~i43) & i54)) - (~(-(-((i54 & i43) << 1))))) - 1);
                int i55 = f52357q0 + 9;
                f52358r0 = i55 % 128;
                int i56 = i55 % 2;
            }
        }
        int i57 = f52357q0;
        int i58 = ((i57 ^ 101) | (i57 & 101)) << 1;
        int i59 = -(((~i57) & 101) | (i57 & (-102)));
        int i60 = (i58 & i59) + (i59 | i58);
        f52358r0 = i60 % 128;
        int i61 = i60 % 2;
        return jLongValue;
    }

    @NotNull
    public final abw setIncludeFontPadding() throws NoSuchAlgorithmException, IOException {
        return (abw) setOnFocusChangeListener(new Object[]{this}, -2117584587, 2117584601, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final int setLayoutAnimation() throws EOFException {
        int i10 = f52358r0;
        int i11 = (i10 | 87) << 1;
        int i12 = -(((~i10) & 87) | (i10 & (-88)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52357q0 = i13 % 128;
        int i14 = i13 % 2;
        if (((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() < 4) {
            throw new EOFException();
        }
        acj acjVar = this.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        int i15 = acjVar.setCompoundDrawableTintBlendMode;
        int i16 = acjVar.setX;
        int i17 = -i15;
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = i17 * 483;
        int i19 = -(-(i16 * 242));
        int i20 = i18 ^ i19;
        int i21 = (i18 & i19) << 1;
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = ~i17;
        int i24 = ~i17;
        int i25 = i23 & (i24 | i17);
        int i26 = ~i16;
        int i27 = i25 & i26;
        int i28 = (~i27) & (i26 | i25);
        int i29 = (i27 & i28) | (i28 ^ i27);
        int i30 = (i29 | (~i29)) & (~i29);
        int i31 = ~iIdentityHashCode;
        int i32 = i25 & i31;
        int i33 = (~i32) & (i31 | i25);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = -(~(-(-(((i34 & i30) | (i30 ^ i34)) * (-241)))));
        int i36 = ((-1) << 1) - (((i22 ^ i35) + ((i35 & i22) << 1)) ^ (-1));
        int i37 = i17 & i16;
        int i38 = (~i37) & (i17 | i16);
        int i39 = -(-(((i37 & i38) | (i38 ^ i37)) * (-482)));
        int i40 = (i36 & i39) + (i36 | i39);
        int i41 = ~i16;
        int i42 = (i41 & i17) | (i41 ^ i17);
        int i43 = (i42 | (~i42)) & (~i42);
        int i44 = ~iIdentityHashCode;
        int i45 = ((~i44) & i24) | ((~i24) & i44);
        int i46 = i44 & i24;
        int i47 = (i46 & i45) | (i45 ^ i46);
        int i48 = i47 & i16;
        int i49 = (i47 | i16) & (~i48);
        int i50 = ~((i49 & i48) | (i49 ^ i48));
        int i51 = -(~(((i43 & i50) | (i43 ^ i50)) * 241));
        if (((i40 & i51) + (i51 | i40)) - 1 < 4) {
            int i52 = f52357q0;
            int i53 = i52 ^ 21;
            int i54 = ((i52 & 21) | i53) << 1;
            int i55 = -i53;
            int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
            f52358r0 = i56 % 128;
            int i57 = i56 % 2;
            int iByteValue = (((Byte) setOnFocusChangeListener(new Object[]{this}, 33298663, -33298647, System.identityHashCode(this))).byteValue() & 255) << 24;
            int iByteValue2 = (((Byte) setOnFocusChangeListener(new Object[]{this}, 33298663, -33298647, System.identityHashCode(this))).byteValue() & 255) << 16;
            int i58 = iByteValue ^ iByteValue2;
            int i59 = iByteValue & iByteValue2;
            int iByteValue3 = (i59 & i58) | (i58 ^ i59) | ((((Byte) setOnFocusChangeListener(new Object[]{this}, 33298663, -33298647, System.identityHashCode(this))).byteValue() & 255) << 8);
            int iByteValue4 = ((Byte) setOnFocusChangeListener(new Object[]{this}, 33298663, -33298647, System.identityHashCode(this))).byteValue() & 255;
            int i60 = (iByteValue3 & iByteValue4) | (iByteValue3 ^ iByteValue4);
            int i61 = f52357q0 + 71;
            f52358r0 = i61 % 128;
            if (i61 % 2 != 0) {
                return i60;
            }
            throw null;
        }
        byte[] bArr = acjVar.setOnFocusChangeListener;
        int i62 = i15 & 1;
        int i63 = ((((i15 ^ 1) | i62) << 1) - (~(-((~i62) & (i15 | 1))))) - 1;
        int i64 = (bArr[i15] & 255) << 24;
        int i65 = (((i63 & (-2)) | ((~i63) & 1)) - (~((i63 & 1) << 1))) - 1;
        int i66 = (bArr[i63] & 255) << 16;
        int i67 = (i64 & i66) | (i64 ^ i66);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i68 = (-339) - (~(-(~(-(-(i65 * 339))))));
        int i69 = ~iIdentityHashCode2;
        int i70 = ~((i69 & (-2)) | ((~i69) & (-2)) | (i69 & 1));
        int i71 = ~i65;
        int i72 = ~i65;
        int i73 = i71 & (i72 | i65);
        int i74 = i73 & 1;
        int i75 = (~i74) & (i73 | 1);
        int i76 = ~((i74 & i75) | (i75 ^ i74));
        int i77 = i70 & i76;
        int i78 = (i76 | i70) & (~i77);
        int i79 = (i78 & i77) | (i78 ^ i77);
        int i80 = iIdentityHashCode2 & 1;
        int i81 = (~i80) & (iIdentityHashCode2 | 1);
        int i82 = ~((i80 & i81) | (i81 ^ i80));
        int i83 = ((~i82) & i79) | ((~i79) & i82);
        int i84 = i79 & i82;
        int i85 = -(-(((i84 & i83) | (i83 ^ i84)) * (-338)));
        int i86 = i68 & i85;
        int i87 = (i85 ^ i68) | i86;
        int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
        int i89 = (~((-2) | i65)) * 338;
        int i90 = (i88 & i89) + (i89 | i88);
        int i91 = ~iIdentityHashCode2;
        int i92 = (-2) & i91;
        int i93 = (i91 | (-2)) & (~i92);
        int i94 = ~((i93 & i92) | (i93 ^ i92));
        int i95 = (i72 & 1) | (i65 & (-2));
        int i96 = i65 & 1;
        int i97 = (i95 & i96) | (i95 ^ i96);
        int i98 = i97 & iIdentityHashCode2;
        int i99 = ~(((iIdentityHashCode2 | i97) & (~i98)) | i98);
        int i100 = i94 & i99;
        int i101 = (i94 | i99) & (~i100);
        int i102 = -(~(-(-(((i101 & i100) | (i101 ^ i100)) * 338))));
        int i103 = ((-1) << 1) - ((((i90 | i102) << 1) - (i102 ^ i90)) ^ (-1));
        int i104 = i67 | ((bArr[i65] & 255) << 8);
        int i105 = i103 & 1;
        int i106 = ((i103 ^ 1) | i105) << 1;
        int i107 = -((~i105) & (i103 | 1));
        int i108 = ((i106 | i107) << 1) - (i106 ^ i107);
        int i109 = bArr[i103] & 255;
        int i110 = (i109 & i104) | (i104 ^ i109);
        setX(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() - 4);
        if (i108 == i16) {
            int i111 = f52357q0;
            int i112 = i111 & 111;
            int i113 = -(-((i111 ^ 111) | i112));
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            f52358r0 = i114 % 128;
            if (i114 % 2 == 0) {
                this.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                int i115 = 91 / 0;
            } else {
                this.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
            }
            int i116 = f52357q0;
            int i117 = i116 & 11;
            int i118 = -(-((i116 ^ 11) | i117));
            int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
            f52358r0 = i119 % 128;
            int i120 = i119 % 2;
        } else {
            acjVar.setCompoundDrawableTintBlendMode = i108;
            int i121 = f52357q0;
            int i122 = (i121 ^ 49) + ((i121 & 49) << 1);
            f52358r0 = i122 % 128;
            int i123 = i122 % 2;
        }
        int i124 = f52357q0;
        int i125 = (i124 ^ 3) + ((i124 & 3) << 1);
        f52358r0 = i125 % 128;
        if (i125 % 2 != 0) {
            return i110;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final void setNavigationOnClickListener(long j10) throws NoSuchAlgorithmException, IOException {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1525846840, 1525846865, System.identityHashCode(this));
    }

    public final short setOnDragListener() throws EOFException {
        return ((Short) setOnFocusChangeListener(new Object[]{this}, 1821070445, -1821070440, System.identityHashCode(this))).shortValue();
    }

    @NotNull
    public final abx setOnLongClickListener(long j10) {
        return (abx) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -762518187, 762518202, System.identityHashCode(this));
    }

    @NotNull
    public final String setTextAlignment() throws NoSuchAlgorithmException, EOFException {
        String str;
        int i10 = f52358r0;
        int i11 = i10 ^ 15;
        int i12 = ((((i10 & 15) | i11) << 1) - (~(-i11))) - 1;
        f52357q0 = i12 % 128;
        int i13 = i12 % 2;
        long j10 = this.f52359p0;
        if (i13 != 0) {
            str = (String) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10), Charsets.UTF_8}, -1421166445, 1421166479, System.identityHashCode(this));
            int i14 = 64 / 0;
        } else {
            str = (String) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10), Charsets.UTF_8}, -1421166445, 1421166479, System.identityHashCode(this));
        }
        int i15 = f52357q0;
        int i16 = i15 & 31;
        int i17 = -(-((i15 ^ 31) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        f52358r0 = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 21 / 0;
        }
        return str;
    }

    public final void setX(long j10) {
        int i10 = f52357q0;
        int i11 = ((i10 ^ 13) | (i10 & 13)) << 1;
        int i12 = -(((~i10) & 13) | (i10 & (-14)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f52358r0 = i14;
        int i15 = i13 % 2;
        this.f52359p0 = j10;
        if (i15 == 0) {
            throw null;
        }
        int i16 = i14 & 57;
        int i17 = -(-((i14 ^ 57) | i16));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f52357q0 = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final byte getNavBarTitleString() throws EOFException {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, 33298663, -33298647, System.identityHashCode(this))).byteValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final short setNavigationOnClickListener() throws EOFException {
        return ((Short) setOnFocusChangeListener(new Object[]{this}, -998075784, 998075787, System.identityHashCode(this))).shortValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f3  */
    @NotNull
    public final acj setX(int i10) {
        acj acjVar;
        int i11 = f52358r0;
        int i12 = ((i11 ^ 26) + ((i11 & 26) << 1)) - 1;
        f52357q0 = i12 % 128;
        int i13 = i12 % 2;
        if (i10 > 0) {
            int i14 = (i11 & 125) + (i11 | 125);
            f52357q0 = i14 % 128;
            if (i14 % 2 == 0 ? i10 <= 8192 : i10 <= 19333) {
                int i15 = ((-1) << 1) - (((i11 ^ 28) + ((i11 & 28) << 1)) ^ (-1));
                int i16 = i15 % 128;
                f52357q0 = i16;
                int i17 = i15 % 2;
                acj acjVar2 = this.setDividerPadding;
                if (acjVar2 == null) {
                    int i18 = ((i16 | 35) << 1) - (i16 ^ 35);
                    f52358r0 = i18 % 128;
                    int i19 = i18 % 2;
                    acjVar = (acj) ack.setY(new Object[0], -504906881, 504906881, (int) System.currentTimeMillis());
                    this.setDividerPadding = acjVar;
                    acjVar.setOnDragListener = acjVar;
                    acjVar.setDividerPadding = acjVar;
                    int i20 = f52358r0;
                    int i21 = i20 ^ 43;
                    int i22 = ((((i20 & 43) | i21) << 1) - (~(-i21))) - 1;
                    f52357q0 = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    Intrinsics.checkNotNull(acjVar2);
                    acj acjVar3 = acjVar2.setOnDragListener;
                    Intrinsics.checkNotNull(acjVar3);
                    int i24 = acjVar3.setX;
                    int i25 = -(-(i10 * 530));
                    int i26 = ((~i25) & 1058) | (i25 & (-1059));
                    int i27 = (i25 & 1058) << 1;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    int i29 = i24 * 530;
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    int i31 = ~i10;
                    int i32 = i31 & i10;
                    int i33 = (i31 | i10) & (~i32);
                    int i34 = ~((i33 & i32) | (i33 ^ i32));
                    int i35 = i10 ^ i24;
                    int i36 = ~i24;
                    int i37 = i24 & i10;
                    int i38 = (i37 & i35) | (i35 ^ i37);
                    int i39 = (i38 | (~i38)) & (~i38);
                    int i40 = -(~(((i39 & i34) | (i34 ^ i39)) * 529));
                    int i41 = (i30 ^ i40) + ((i40 & i30) << 1);
                    int i42 = (i41 ^ (-1)) + (i41 << 1);
                    int i43 = i10 ^ i10;
                    int i44 = i10 & i10;
                    int i45 = ~((i44 & i43) | (i43 ^ i44));
                    int i46 = ((~i45) & i36) | ((~i36) & i45);
                    int i47 = i45 & i36;
                    int i48 = i42 - (~(-(-(((i47 & i46) | (i46 ^ i47)) * 529))));
                    if ((i48 ^ (-1)) + (i48 << 1) <= 8192) {
                        int i49 = f52358r0;
                        int i50 = ((i49 & (-44)) | ((~i49) & 43)) + ((i49 & 43) << 1);
                        f52357q0 = i50 % 128;
                        int i51 = i50 % 2;
                        if (acjVar3.setY) {
                            acjVar = acjVar3;
                        } else {
                            acjVar = (acj) acj.setX(new Object[]{acjVar3, (acj) ack.setY(new Object[0], -504906881, 504906881, (int) System.currentTimeMillis())}, -672690444, 672690446, System.identityHashCode(acjVar3));
                            int i52 = f52357q0;
                            int i53 = ((i52 | 125) << 1) - (i52 ^ 125);
                            f52358r0 = i53 % 128;
                            int i54 = i53 % 2;
                        }
                    } else {
                        acjVar = (acj) acj.setX(new Object[]{acjVar3, (acj) ack.setY(new Object[0], -504906881, 504906881, (int) System.currentTimeMillis())}, -672690444, 672690446, System.identityHashCode(acjVar3));
                        int i55 = f52357q0;
                        int i56 = ((i55 | 125) << 1) - (i55 ^ 125);
                        f52358r0 = i56 % 128;
                        int i57 = i56 % 2;
                    }
                }
                int i58 = f52357q0;
                int i59 = (i58 ^ 99) + ((i58 & 99) << 1);
                f52358r0 = i59 % 128;
                int i60 = i59 % 2;
                return acjVar;
            }
        }
        int i61 = (i11 & (-124)) | ((~i11) & 123);
        int i62 = (i11 & 123) << 1;
        int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
        f52357q0 = i63 % 128;
        int i64 = i63 % 2;
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull Charset charset) {
        int i10 = f52358r0;
        int i11 = i10 & 67;
        int i12 = ((i10 | 67) & (~i11)) + (i11 << 1);
        f52357q0 = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charset, "");
            return (String) setOnFocusChangeListener(new Object[]{this, Long.valueOf(this.f52359p0), charset}, -1421166445, 1421166479, System.identityHashCode(this));
        }
        Intrinsics.checkNotNullParameter(charset, "");
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setCompoundDrawableTintBlendMode(String str) {
        return (abv) setOnFocusChangeListener(new Object[]{this, str}, -634326896, 634326909, System.identityHashCode(this));
    }

    @NotNull
    public final abx setY(@NotNull abw abwVar) throws NoSuchAlgorithmException {
        int i10 = f52358r0 + 51;
        f52357q0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(abwVar, "");
            abwVar.setX(this, ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue());
            int i11 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(abwVar, "");
            abwVar.setX(this, ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue());
        }
        return this;
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    public final /* synthetic */ abv setCompoundDrawableTintBlendMode(abw abwVar) {
        return (abv) setOnFocusChangeListener(new Object[]{this, abwVar}, 1131455531, -1131455531, System.identityHashCode(this));
    }

    @NotNull
    public final abx setCompoundDrawableTintBlendMode(@NotNull String str, int i10, int i11, @NotNull Charset charset) {
        return (abx) setOnFocusChangeListener(new Object[]{this, str, Integer.valueOf(i10), Integer.valueOf(i11), charset}, 2109234094, -2109234083, i10);
    }

    @NotNull
    public final abx setCompoundDrawableTintBlendMode(int i10) {
        return (abx) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1734801403, 1734801409, i10);
    }

    @JvmName(name = "size")
    public final long setCompoundDrawableTintBlendMode() throws NoSuchAlgorithmException, IOException {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue();
    }

    public final long setDividerPadding(@NotNull abw abwVar) {
        return ((Long) setOnFocusChangeListener(new Object[]{this, abwVar}, 93173967, -93173931, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    public final void setDividerPadding(@NotNull abx abxVar, long j10) throws NoSuchAlgorithmException, IOException {
        setOnFocusChangeListener(new Object[]{this, abxVar, Long.valueOf(j10)}, -2065855263, 2065855285, System.identityHashCode(this));
    }

    @NotNull
    public final abx setDividerPadding(int i10) {
        return (abx) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1617903421, 1617903423, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setAlwaysDrawnWithCacheEnabled() throws EOFException {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1076989521, 1076989541, System.identityHashCode(this));
    }

    @NotNull
    public final abx setDividerPadding(@NotNull byte[] bArr, int i10, int i11) {
        return (abx) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 1169071493, -1169071470, i10);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x078d  */
    @NotNull
    public final abx setY(@NotNull String str, int i10, int i11) throws NoSuchAlgorithmException, EOFException {
        abx abxVar;
        char cCharAt;
        int i12;
        char c10;
        abx abxVar2 = this;
        String str2 = str;
        int i13 = f52357q0;
        int i14 = i13 ^ 17;
        int i15 = 1;
        int i16 = (((i13 & 17) | i14) << 1) - i14;
        f52358r0 = i16 % 128;
        int i17 = 2;
        if (i16 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (i10 >= 0) {
                int i18 = f52358r0;
                int i19 = 33;
                int i20 = ((i18 & (-34)) | ((~i18) & 33)) + ((i18 & 33) << 1);
                int i21 = i20 % 128;
                f52357q0 = i21;
                int i22 = i20 % 2;
                if (i11 >= i10) {
                    int i23 = i21 + 71;
                    f52358r0 = i23 % 128;
                    if (i23 % 2 != 0) {
                        if (i11 <= str.length()) {
                            int i24 = f52357q0;
                            int i25 = (i24 & 21) + (i24 | 21);
                            f52358r0 = i25 % 128;
                            if (i25 % 2 != 0) {
                                int i26 = i24 & 51;
                                int i27 = (((i24 | 51) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
                                f52358r0 = i27 % 128;
                                int i28 = i27 % 2;
                                int i29 = i10;
                                while (i29 < i11) {
                                    int i30 = f52358r0;
                                    int i31 = i30 & 89;
                                    int i32 = (((i30 ^ 89) | i31) << i15) - ((i30 | 89) & (~i31));
                                    f52357q0 = i32 % 128;
                                    int i33 = i32 % i17;
                                    char cCharAt2 = str2.charAt(i29);
                                    if (cCharAt2 < 128) {
                                        int i34 = f52357q0;
                                        int i35 = i34 & 33;
                                        int i36 = -(-((i34 ^ i19) | i35));
                                        int i37 = (i35 & i36) + (i36 | i35);
                                        f52358r0 = i37 % 128;
                                        int i38 = i37 % i17;
                                        acj x4 = abxVar2.setX(i15);
                                        byte[] bArr = x4.setOnFocusChangeListener;
                                        int i39 = -i29;
                                        int i40 = (x4.setX - (~(-(~i39)))) - i17;
                                        int i41 = -i40;
                                        int i42 = ((-1) << 1) - (((i41 * 483) - (-1982465)) ^ (-1));
                                        int i43 = ~i41;
                                        int i44 = ~((i43 ^ (-8193)) | (i43 & (-8193)));
                                        int i45 = ~i41;
                                        int i46 = i43 & (i45 | i41);
                                        int i47 = ~i10;
                                        int i48 = ~i10;
                                        int i49 = i48 | i10;
                                        int i50 = i47 & i49;
                                        int i51 = ~(((~i46) & i50) | ((~i50) & i46) | (i46 & i50));
                                        int i52 = ((~i51) & i44) | ((~i44) & i51);
                                        int i53 = i51 & i44;
                                        int i54 = ((i53 & i52) | (i52 ^ i53)) * (-241);
                                        int i55 = i42 ^ i54;
                                        int i56 = -(-((i42 & i54) << 1));
                                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                        int i58 = (i41 & (-8193)) | (i45 & 8192);
                                        int i59 = i41 & 8192;
                                        int i60 = ((i58 & i59) | (i58 ^ i59)) * (-482);
                                        int i61 = i57 & i60;
                                        int i62 = (i60 | i57) & (~i61);
                                        int i63 = i61 << 1;
                                        int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                                        int i65 = (-8193) & i41;
                                        int i66 = ~((((-8193) | i41) & (~i65)) | i65);
                                        int i67 = ~i10;
                                        int i68 = (i67 & i49) | i43;
                                        int i69 = (i68 & (-8193)) | ((~i68) & 8192);
                                        int i70 = i68 & 8192;
                                        int i71 = ~((i70 & i69) | (i69 ^ i70));
                                        int i72 = i66 ^ i71;
                                        int i73 = i66 & i71;
                                        int i74 = -(~(((i73 & i72) | (i72 ^ i73)) * 241));
                                        int iMin = Math.min(i11, ((-1) << 1) - (((i64 & i74) + (i74 | i64)) ^ (-1)));
                                        int i75 = i29 & 1;
                                        int i76 = (i29 | 1) & (~i75);
                                        int i77 = i75 << 1;
                                        int i78 = (i76 & i77) + (i76 | i77);
                                        int i79 = -i39;
                                        bArr[(i40 ^ i79) + ((i79 & i40) << 1)] = (byte) cCharAt2;
                                        int i80 = f52357q0;
                                        int i81 = i80 & 57;
                                        int i82 = (((i80 | 57) & (~i81)) - (~(i81 << 1))) - 1;
                                        f52358r0 = i82 % 128;
                                        int i83 = i82 % 2;
                                        while (true) {
                                            i29 = i78;
                                            if (i29 >= iMin || (cCharAt = str2.charAt(i29)) >= 128) {
                                                break;
                                            }
                                            int i84 = f52357q0;
                                            int i85 = ((i84 ^ 17) | (i84 & 17)) << 1;
                                            int i86 = -((i84 & (-18)) | ((~i84) & 17));
                                            int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                                            f52358r0 = i87 % 128;
                                            int i88 = i87 % 2;
                                            int i89 = i29 & 1;
                                            int i90 = (i29 ^ 1) | i89;
                                            i78 = (i89 ^ i90) + ((i89 & i90) << 1);
                                            int i91 = -(-i29);
                                            int i92 = ((i40 ^ i91) | (i40 & i91)) << 1;
                                            int i93 = -((i91 & (~i40)) | ((~i91) & i40));
                                            bArr[((i92 | i93) << 1) - (i93 ^ i92)] = (byte) cCharAt;
                                            int i94 = i84 & 53;
                                            int i95 = (~i94) & (i84 | 53);
                                            int i96 = -(-(i94 << 1));
                                            int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                            f52358r0 = i97 % 128;
                                            int i98 = i97 % 2;
                                        }
                                        int i99 = i40 * 370;
                                        int i100 = i29 * 370;
                                        int i101 = i99 ^ i100;
                                        int i102 = (i99 & i100) << 1;
                                        int i103 = (i101 & i102) + (i102 | i101);
                                        int i104 = i40 ^ i29;
                                        int i105 = i40 & i29;
                                        int i106 = (i104 & i105) | (i104 ^ i105);
                                        int i107 = i106 & i48;
                                        int i108 = (i106 | i48) & (~i107);
                                        int i109 = ((i108 & i107) | (i108 ^ i107)) * (-369);
                                        int i110 = ((i103 ^ i109) - (~((i109 & i103) << 1))) - 1;
                                        int i111 = ~i40;
                                        int i112 = ~(((~i48) & i111) | ((~i111) & i48) | (i111 & i48));
                                        int i113 = i29 & i112;
                                        int i114 = (((i112 | i29) & (~i113)) | i113) * (-369);
                                        int i115 = i110 | i114;
                                        int i116 = i115 << 1;
                                        int i117 = -((~(i110 & i114)) & i115);
                                        int i118 = (i116 & i117) + (i117 | i116);
                                        int i119 = ~i29;
                                        int i120 = i119 & i40;
                                        int i121 = (i119 | i40) & (~i120);
                                        int i122 = ~((i121 & i120) | (i121 ^ i120));
                                        int i123 = (i111 & i10) | (i48 & i40);
                                        int i124 = i40 & i10;
                                        int i125 = (i123 & i124) | (i123 ^ i124);
                                        int i126 = (i125 | (~i125)) & (~i125);
                                        int i127 = (i126 & i122) | (i122 ^ i126);
                                        int i128 = ~i40;
                                        int i129 = i128 ^ i67;
                                        int i130 = i67 & i128;
                                        int i131 = (i130 & i129) | (i129 ^ i130);
                                        int i132 = ~((i131 & i29) | (i131 ^ i29));
                                        int i133 = ((~i132) & i127) | ((~i127) & i132);
                                        int i134 = i127 & i132;
                                        int i135 = ((i134 & i133) | (i133 ^ i134)) * 369;
                                        int i136 = ((i118 ^ i135) | (i118 & i135)) << 1;
                                        int i137 = -((i135 & (~i118)) | ((~i135) & i118));
                                        int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                                        int i139 = x4.setX;
                                        int i140 = i138 - (~(-i139));
                                        int i141 = (i140 ^ (-1)) + (i140 << 1);
                                        int i142 = ((i141 * 1649) - (~(-(-(i139 * 825))))) - 1;
                                        int i143 = ~i139;
                                        int i144 = ((~i143) & i141) | ((~i141) & i143);
                                        int i145 = i143 & i141;
                                        int i146 = -(-(((i145 & i144) | (i144 ^ i145)) * (-824)));
                                        int i147 = ((i142 | i146) << 1) - (i146 ^ i142);
                                        int i148 = i141 ^ i139;
                                        int i149 = ~i139;
                                        int i150 = i141 & i139;
                                        int i151 = ((i148 & i150) | (i148 ^ i150)) * (-1648);
                                        int i152 = (i147 ^ i151) + ((i151 & i147) << 1);
                                        int i153 = ~i141;
                                        int i154 = (i139 | i149) & (~i139);
                                        int i155 = i153 ^ i154;
                                        int i156 = i154 & i153;
                                        int i157 = ((i156 & i155) | (i155 ^ i156)) * 824;
                                        int i158 = i152 & i157;
                                        x4.setX = ((i157 | i152) & (~i158)) + (i158 << 1);
                                        abxVar = this;
                                        abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + ((long) i141));
                                        int i159 = f52357q0;
                                        int i160 = i159 & 121;
                                        int i161 = (i159 | 121) & (~i160);
                                        int i162 = i160 << 1;
                                        int i163 = (i161 ^ i162) + ((i161 & i162) << 1);
                                        f52358r0 = i163 % 128;
                                        int i164 = i163 % 2;
                                    } else {
                                        abxVar = abxVar2;
                                        if (cCharAt2 < 2048) {
                                            int i165 = f52358r0;
                                            int i166 = i165 ^ 29;
                                            int i167 = -(-((i165 & 29) << 1));
                                            int i168 = (i166 & i167) + (i167 | i166);
                                            f52357q0 = i168 % 128;
                                            int i169 = i168 % 2;
                                            acj x6 = abxVar.setX(2);
                                            byte[] bArr2 = x6.setOnFocusChangeListener;
                                            int i170 = x6.setX;
                                            int i171 = cCharAt2 >> 6;
                                            int i172 = i171 ^ 192;
                                            int i173 = i171 & 192;
                                            bArr2[i170] = (byte) ((i173 & i172) | (i172 ^ i173));
                                            int i174 = (-301) - (~(i170 * 302));
                                            int i175 = ~i170;
                                            int i176 = (i175 & 1) | (i170 & (-2));
                                            int i177 = i170 & 1;
                                            int i178 = (i176 & i177) | (i176 ^ i177);
                                            int i179 = i178 & i10;
                                            int i180 = (i178 | i10) & (~i179);
                                            int i181 = ~i10;
                                            int i182 = (i180 & i179) | (i180 ^ i179);
                                            int i183 = -(-(((i182 | (~i182)) & (~i182)) * (-301)));
                                            int i184 = i174 & i183;
                                            int i185 = (i184 - (~(-(-((i174 ^ i183) | i184))))) - 1;
                                            int i186 = ~i170;
                                            int i187 = (i186 & i10) | (i186 & i181) | ((~i186) & i10);
                                            int i188 = (i187 | (~i187)) & (~i187);
                                            int i189 = i181 ^ 1;
                                            int i190 = i181 & 1;
                                            int i191 = ~((i189 ^ i190) | (i189 & i190));
                                            int i192 = ((i188 & i191) | (i188 ^ i191)) * (-301);
                                            int i193 = (i185 & i192) + (i192 | i185);
                                            int i194 = (~i170) & (i175 | i170);
                                            int i195 = ~(((-2) ^ i10) | ((-2) & i10));
                                            int i196 = i194 & i195;
                                            int i197 = (i194 | i195) & (~i196);
                                            int i198 = ((i197 & i196) | (i197 ^ i196)) * 301;
                                            int i199 = i193 & i198;
                                            int i200 = (i198 ^ i193) | i199;
                                            bArr2[(i199 ^ i200) + ((i200 & i199) << 1)] = (byte) (((cCharAt2 & '?') | 128) & (~0));
                                            int i201 = i170 ^ 2;
                                            int i202 = -(-((i170 & 2) << 1));
                                            x6.setX = (i201 ^ i202) + ((i201 & i202) << 1);
                                            abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + 2);
                                            int i203 = -(-(i29 * 339));
                                            int i204 = (((-337) ^ i203) | ((-337) & i203)) << 1;
                                            int i205 = -((i203 & 336) | ((-337) & (~i203)));
                                            int i206 = (i204 ^ i205) + ((i205 & i204) << 1);
                                            int i207 = ~i10;
                                            int i208 = (i181 | i10) & i207;
                                            int i209 = (-2) ^ i208;
                                            int i210 = i208 & (-2);
                                            int i211 = ~((i210 & i209) | (i209 ^ i210));
                                            int i212 = (~i29) & ((~i29) | i29);
                                            int i213 = i212 & 1;
                                            int i214 = (i212 | 1) & (~i213);
                                            int i215 = ~((i214 & i213) | (i214 ^ i213));
                                            int i216 = (i211 & i215) | (i211 ^ i215);
                                            int i217 = (i181 & 1) | (i10 & (-2));
                                            int i218 = i10 & 1;
                                            int i219 = ~((i217 & i218) | (i217 ^ i218));
                                            int i220 = i216 ^ i219;
                                            int i221 = i216 & i219;
                                            int i222 = -(-(((i221 & i220) | (i220 ^ i221)) * (-338)));
                                            int i223 = i206 & i222;
                                            int i224 = i223 + ((i206 ^ i222) | i223);
                                            int i225 = -(-((~(((-2) ^ i29) | ((-2) & i29))) * 338));
                                            int i226 = i224 & i225;
                                            int i227 = (i225 ^ i224) | i226;
                                            int i228 = ((i226 | i227) << 1) - (i227 ^ i226);
                                            int i229 = ((~i207) & (-2)) | (i207 & 1);
                                            int i230 = i207 & (-2);
                                            int i231 = (i230 & i229) | (i229 ^ i230);
                                            int i232 = (i231 | (~i231)) & (~i231);
                                            int i233 = i29 & 1;
                                            int i234 = (i29 | 1) & (~i233);
                                            int i235 = (i234 & i233) | (i234 ^ i233);
                                            int i236 = i235 ^ i10;
                                            int i237 = i235 & i10;
                                            int i238 = ~((i237 & i236) | (i236 ^ i237));
                                            int i239 = -(~(-(-(((i232 & i238) | ((~i238) & i232) | ((~i232) & i238)) * 338))));
                                            i29 = ((i228 & i239) + (i239 | i228)) - 1;
                                            int i240 = f52357q0;
                                            int i241 = (i240 ^ 115) + ((i240 & 115) << 1);
                                            f52358r0 = i241 % 128;
                                            int i242 = i241 % 2;
                                        } else {
                                            if (cCharAt2 >= 55296) {
                                                int i243 = f52358r0;
                                                int i244 = i243 + 17;
                                                f52357q0 = i244 % 128;
                                                int i245 = i244 % 2;
                                                if (cCharAt2 <= 57343) {
                                                    int i246 = i29 * (-628);
                                                    int i247 = ((630 ^ i246) | (630 & i246)) << 1;
                                                    int i248 = -((i246 & (-631)) | (630 & (~i246)));
                                                    int i249 = (i247 & i248) + (i248 | i247);
                                                    int i250 = ~i29;
                                                    int i251 = -(~(i250 * (-629)));
                                                    int i252 = (((i249 | i251) << 1) - (i249 ^ i251)) - 1;
                                                    int i253 = ~i29;
                                                    int i254 = -(-((~(((-2) ^ i253) | ((-2) & i253))) * (-629)));
                                                    int i255 = i252 & i254;
                                                    int i256 = ((i252 ^ i254) | i255) << 1;
                                                    int i257 = -((~i255) & (i254 | i252));
                                                    int i258 = (i256 ^ i257) + ((i257 & i256) << 1);
                                                    int i259 = (i29 & 1) | ((-2) & i253);
                                                    int i260 = i29 & (-2);
                                                    if (((-1) << 1) - ((i258 - (~(-(-(((i259 & i260) | (i259 ^ i260)) * 629))))) ^ (-1)) < i11) {
                                                        int i261 = ~i10;
                                                        int i262 = -(-(i29 * (-163)));
                                                        int i263 = 165 & i262;
                                                        int i264 = -(-((i262 ^ 165) | i263));
                                                        int i265 = (i263 ^ i264) + ((i264 & i263) << 1);
                                                        int i266 = ~((i261 ^ i29) | (i261 & i29));
                                                        int i267 = i266 & 1;
                                                        int i268 = (((i266 | 1) & (~i267)) | i267) * (-328);
                                                        int i269 = ((i265 ^ i268) | (i265 & i268)) << 1;
                                                        int i270 = -((i268 & (~i265)) | ((~i268) & i265));
                                                        int i271 = ((i269 | i270) << 1) - (i270 ^ i269);
                                                        int i272 = i10 ^ 1;
                                                        int i273 = i10 & 1;
                                                        int i274 = -(-(((i272 & i273) | (i272 ^ i273)) * 164));
                                                        int i275 = ((i271 ^ i274) | (i271 & i274)) << 1;
                                                        int i276 = -((i274 & (~i271)) | ((~i274) & i271));
                                                        int i277 = ((i275 | i276) << 1) - (i276 ^ i275);
                                                        int i278 = ((~i253) & (-2)) | (i253 & 1);
                                                        int i279 = (-2) & i253;
                                                        int i280 = ~((i278 & i279) | (i278 ^ i279));
                                                        int i281 = ~((i250 ^ i10) | (i250 & i10));
                                                        int i282 = ((~i281) & i280) | ((~i280) & i281);
                                                        int i283 = i280 & i281;
                                                        int i284 = (i283 & i282) | (i282 ^ i283);
                                                        int i285 = i261 & 1;
                                                        int i286 = (i261 | 1) & (~i285);
                                                        int i287 = (i286 & i285) | (i286 ^ i285);
                                                        int i288 = ~((i287 & i29) | (i287 & i253) | ((~i287) & i29));
                                                        int i289 = -(~(-(-(((i288 & i284) | (i284 ^ i288)) * 164))));
                                                        char cCharAt3 = str2.charAt((((i277 | i289) << 1) - (i289 ^ i277)) - 1);
                                                        int i290 = f52357q0;
                                                        int i291 = i290 & 5;
                                                        int i292 = i290 | 5;
                                                        int i293 = (i291 ^ i292) + ((i292 & i291) << 1);
                                                        f52358r0 = i293 % 128;
                                                        int i294 = i293 % 2;
                                                        c10 = cCharAt3;
                                                        i12 = 2;
                                                    } else {
                                                        int i295 = ((i243 ^ 105) | (i243 & 105)) << 1;
                                                        int i296 = -(((~i243) & 105) | (i243 & (-106)));
                                                        int i297 = (i295 & i296) + (i296 | i295);
                                                        f52357q0 = i297 % 128;
                                                        i12 = 2;
                                                        int i298 = i297 % 2;
                                                        c10 = 0;
                                                    }
                                                    if (cCharAt2 <= 56319) {
                                                        int i299 = f52358r0 + 83;
                                                        int i300 = i299 % 128;
                                                        f52357q0 = i300;
                                                        int i301 = i299 % i12;
                                                        if (56320 <= c10) {
                                                            int i302 = (((i300 ^ 45) | (i300 & 45)) << 1) - ((i300 & (-46)) | ((~i300) & 45));
                                                            f52358r0 = i302 % 128;
                                                            if (i302 % 2 == 0) {
                                                                int i303 = 72 / 0;
                                                                if (c10 <= 57343) {
                                                                    int i304 = ((i300 & 60) + (i300 | 60)) - 1;
                                                                    f52358r0 = i304 % 128;
                                                                    int i305 = i304 % 2;
                                                                    int i306 = (cCharAt2 & 1023) << 10;
                                                                    int i307 = c10 & 1023;
                                                                    int i308 = (i306 & i307) | (i306 ^ i307);
                                                                    int i309 = i308 & 65536;
                                                                    int i310 = (i308 ^ 65536) | i309;
                                                                    int i311 = (i309 & i310) + (i310 | i309);
                                                                    acj x7 = abxVar.setX(4);
                                                                    byte[] bArr3 = x7.setOnFocusChangeListener;
                                                                    int i312 = x7.setX;
                                                                    int i313 = i311 >> 18;
                                                                    int i314 = i313 & 240;
                                                                    int i315 = (i313 | 240) & (~i314);
                                                                    bArr3[i312] = (byte) ((i315 & i314) | (i315 ^ i314));
                                                                    int i316 = i312 * (-97);
                                                                    int i317 = (50 & i316) + (i316 | 50);
                                                                    int i318 = ~i312;
                                                                    int i319 = ~i10;
                                                                    int i320 = ~((i318 ^ i319) | (i318 & i319));
                                                                    int i321 = ~i312;
                                                                    int i322 = i318 & (i321 | i312);
                                                                    int i323 = (i322 & (-2)) | ((~i322) & 1);
                                                                    int i324 = i322 & 1;
                                                                    int i325 = ~((i323 ^ i324) | (i324 & i323));
                                                                    int i326 = i320 & i325;
                                                                    int i327 = (i325 | i320) & (~i326);
                                                                    int i328 = ((i327 & i326) | (i327 ^ i326)) * 98;
                                                                    int i329 = i317 & i328;
                                                                    int i330 = (i328 ^ i317) | i329;
                                                                    int i331 = (i329 & i330) + (i330 | i329);
                                                                    int i332 = (-2) | i319;
                                                                    int i333 = (i332 | (~i332)) & (~i332);
                                                                    int i334 = ((~i333) & i318) | ((~i318) & i333);
                                                                    int i335 = i333 & i318;
                                                                    int i336 = (i335 & i334) | (i334 ^ i335);
                                                                    int i337 = ~i10;
                                                                    int i338 = (i337 & 1) | (i10 & (-2)) | (i10 & 1);
                                                                    int i339 = (i338 | (~i338)) & (~i338);
                                                                    int i340 = i336 ^ i339;
                                                                    int i341 = i336 & i339;
                                                                    int i342 = -(~(-(-(((i341 & i340) | (i340 ^ i341)) * (-49)))));
                                                                    int i343 = ((i331 & i342) + (i342 | i331)) - 1;
                                                                    int i344 = i321 & i10;
                                                                    int i345 = (~i344) & (i321 | i10);
                                                                    int i346 = ~((i344 & i345) | (i345 ^ i344));
                                                                    int i347 = (i312 & (-2)) | (i321 & 1);
                                                                    int i348 = i312 & 1;
                                                                    int i349 = ~((i347 & i348) | (i347 ^ i348));
                                                                    int i350 = i346 ^ i349;
                                                                    int i351 = i349 & i346;
                                                                    int i352 = -(~(-(-(((i351 & i350) | (i350 ^ i351)) * 49))));
                                                                    int i353 = (i343 & i352) + (i352 | i343);
                                                                    bArr3[(i353 ^ (-1)) + (i353 << 1)] = (byte) (((i311 >> 12) & 63) ^ 128);
                                                                    bArr3[((-1) << 1) - (((i312 & 3) + (i312 | 3)) ^ (-1))] = (byte) (((i311 >> 6) & 63) | 128);
                                                                    int i354 = (i312 & (-4)) | ((~i312) & 3);
                                                                    int i355 = (i312 & 3) << 1;
                                                                    bArr3[((i354 | i355) << 1) - (i354 ^ i355)] = (byte) (((63 & i311) | 128) & (~0));
                                                                    int i356 = (i312 * (-574)) - 2296;
                                                                    int i357 = (-5) ^ i319;
                                                                    int i358 = (-5) & i319;
                                                                    int i359 = ~((i358 & i357) | (i357 ^ i358));
                                                                    int i360 = ~i312;
                                                                    int i361 = ~i312;
                                                                    int i362 = (i360 & (i361 | i312)) | i10;
                                                                    int i363 = -(-((i359 | ((i362 | (~i362)) & (~i362))) * 1150));
                                                                    int i364 = i356 & i363;
                                                                    int i365 = i364 + ((i356 ^ i363) | i364);
                                                                    int i366 = i361 & i10;
                                                                    int i367 = (~i366) & (i361 | i10);
                                                                    int i368 = (i366 & i367) | (i367 ^ i366);
                                                                    int i369 = -(-((((i368 | (~i368)) & (~i368)) | (~((i337 ^ i312) | (i337 & i312)))) * (-575)));
                                                                    int i370 = i365 & i369;
                                                                    int i371 = -(-((i369 ^ i365) | i370));
                                                                    int i372 = ((i370 | i371) << 1) - (i371 ^ i370);
                                                                    int i373 = ((-5) & i337) | (i10 & 4);
                                                                    int i374 = (-5) & i10;
                                                                    int i375 = ~((i374 & i373) | (i373 ^ i374));
                                                                    int i376 = (i337 | i10) & i319;
                                                                    int i377 = i376 ^ 4;
                                                                    int i378 = i376 & 4;
                                                                    int i379 = (i378 & i377) | (i377 ^ i378);
                                                                    int i380 = (i379 | (~i379)) & (~i379);
                                                                    int i381 = ((~i380) & i375) | ((~i375) & i380);
                                                                    int i382 = i375 & i380;
                                                                    int i383 = ((i382 & i381) | (i381 ^ i382)) * 575;
                                                                    x7.setX = ((i372 | i383) << 1) - ((i383 & (~i372)) | ((~i383) & i372));
                                                                    abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + 4);
                                                                    int i384 = i29 ^ 93;
                                                                    int i385 = ((((i29 & 93) | i384) << 1) - (~(-i384))) - 1;
                                                                    int i386 = i385 & (-91);
                                                                    int i387 = ((((i385 ^ (-91)) | i386) << 1) - (~(-((i385 | (-91)) & (~i386))))) - 1;
                                                                    int i388 = f52358r0;
                                                                    int i389 = i388 ^ 117;
                                                                    int i390 = ((i388 & 117) | i389) << 1;
                                                                    int i391 = -i389;
                                                                    int i392 = (i390 & i391) + (i390 | i391);
                                                                    f52357q0 = i392 % 128;
                                                                    int i393 = i392 % 2;
                                                                    str2 = str;
                                                                    i29 = i387;
                                                                } else {
                                                                    int i394 = i300 & 49;
                                                                    int i395 = -(-((i300 ^ 49) | i394));
                                                                    int i396 = (i394 ^ i395) + ((i394 & i395) << 1);
                                                                    f52358r0 = i396 % 128;
                                                                    i12 = 2;
                                                                    int i397 = i396 % 2;
                                                                }
                                                            } else if (c10 <= 57343) {
                                                                int i3010 = ((i300 & 60) + (i300 | 60)) - 1;
                                                                f52358r0 = i3010 % 128;
                                                                int i3011 = i3010 % 2;
                                                                int i3012 = (cCharAt2 & 1023) << 10;
                                                                int i3013 = c10 & 1023;
                                                                int i3014 = (i3012 & i3013) | (i3012 ^ i3013);
                                                                int i3015 = i3014 & 65536;
                                                                int i3110 = (i3014 ^ 65536) | i3015;
                                                                int i3111 = (i3015 & i3110) + (i3110 | i3015);
                                                                acj x10 = abxVar.setX(4);
                                                                byte[] bArr4 = x10.setOnFocusChangeListener;
                                                                int i3112 = x10.setX;
                                                                int i3113 = i3111 >> 18;
                                                                int i3114 = i3113 & 240;
                                                                int i3115 = (i3113 | 240) & (~i3114);
                                                                bArr4[i3112] = (byte) ((i3115 & i3114) | (i3115 ^ i3114));
                                                                int i3116 = i3112 * (-97);
                                                                int i3117 = (50 & i3116) + (i3116 | 50);
                                                                int i3118 = ~i3112;
                                                                int i3119 = ~i10;
                                                                int i3210 = ~((i3118 ^ i3119) | (i3118 & i3119));
                                                                int i3211 = ~i3112;
                                                                int i3212 = i3118 & (i3211 | i3112);
                                                                int i3213 = (i3212 & (-2)) | ((~i3212) & 1);
                                                                int i3214 = i3212 & 1;
                                                                int i3215 = ~((i3213 ^ i3214) | (i3214 & i3213));
                                                                int i3216 = i3210 & i3215;
                                                                int i3217 = (i3215 | i3210) & (~i3216);
                                                                int i3218 = ((i3217 & i3216) | (i3217 ^ i3216)) * 98;
                                                                int i3219 = i3117 & i3218;
                                                                int i3310 = (i3218 ^ i3117) | i3219;
                                                                int i3311 = (i3219 & i3310) + (i3310 | i3219);
                                                                int i3312 = (-2) | i3119;
                                                                int i3313 = (i3312 | (~i3312)) & (~i3312);
                                                                int i3314 = ((~i3313) & i3118) | ((~i3118) & i3313);
                                                                int i3315 = i3313 & i3118;
                                                                int i3316 = (i3315 & i3314) | (i3314 ^ i3315);
                                                                int i3317 = ~i10;
                                                                int i3318 = (i3317 & 1) | (i10 & (-2)) | (i10 & 1);
                                                                int i3319 = (i3318 | (~i3318)) & (~i3318);
                                                                int i3410 = i3316 ^ i3319;
                                                                int i3411 = i3316 & i3319;
                                                                int i3412 = -(~(-(-(((i3411 & i3410) | (i3410 ^ i3411)) * (-49)))));
                                                                int i3413 = ((i3311 & i3412) + (i3412 | i3311)) - 1;
                                                                int i3414 = i3211 & i10;
                                                                int i3415 = (~i3414) & (i3211 | i10);
                                                                int i3416 = ~((i3414 & i3415) | (i3415 ^ i3414));
                                                                int i3417 = (i3112 & (-2)) | (i3211 & 1);
                                                                int i3418 = i3112 & 1;
                                                                int i3419 = ~((i3417 & i3418) | (i3417 ^ i3418));
                                                                int i3510 = i3416 ^ i3419;
                                                                int i3511 = i3419 & i3416;
                                                                int i3512 = -(~(-(-(((i3511 & i3510) | (i3510 ^ i3511)) * 49))));
                                                                int i3513 = (i3413 & i3512) + (i3512 | i3413);
                                                                bArr4[(i3513 ^ (-1)) + (i3513 << 1)] = (byte) (((i3111 >> 12) & 63) ^ 128);
                                                                bArr4[((-1) << 1) - (((i3112 & 3) + (i3112 | 3)) ^ (-1))] = (byte) (((i3111 >> 6) & 63) | 128);
                                                                int i3514 = (i3112 & (-4)) | ((~i3112) & 3);
                                                                int i3515 = (i3112 & 3) << 1;
                                                                bArr4[((i3514 | i3515) << 1) - (i3514 ^ i3515)] = (byte) (((63 & i3111) | 128) & (~0));
                                                                int i3516 = (i3112 * (-574)) - 2296;
                                                                int i3517 = (-5) ^ i3119;
                                                                int i3518 = (-5) & i3119;
                                                                int i3519 = ~((i3518 & i3517) | (i3517 ^ i3518));
                                                                int i3610 = ~i3112;
                                                                int i3611 = ~i3112;
                                                                int i3612 = (i3610 & (i3611 | i3112)) | i10;
                                                                int i3613 = -(-((i3519 | ((i3612 | (~i3612)) & (~i3612))) * 1150));
                                                                int i3614 = i3516 & i3613;
                                                                int i3615 = i3614 + ((i3516 ^ i3613) | i3614);
                                                                int i3616 = i3611 & i10;
                                                                int i3617 = (~i3616) & (i3611 | i10);
                                                                int i3618 = (i3616 & i3617) | (i3617 ^ i3616);
                                                                int i3619 = -(-((((i3618 | (~i3618)) & (~i3618)) | (~((i3317 ^ i3112) | (i3317 & i3112)))) * (-575)));
                                                                int i3710 = i3615 & i3619;
                                                                int i3711 = -(-((i3619 ^ i3615) | i3710));
                                                                int i3712 = ((i3710 | i3711) << 1) - (i3711 ^ i3710);
                                                                int i3713 = ((-5) & i3317) | (i10 & 4);
                                                                int i3714 = (-5) & i10;
                                                                int i3715 = ~((i3714 & i3713) | (i3713 ^ i3714));
                                                                int i3716 = (i3317 | i10) & i3119;
                                                                int i3717 = i3716 ^ 4;
                                                                int i3718 = i3716 & 4;
                                                                int i3719 = (i3718 & i3717) | (i3717 ^ i3718);
                                                                int i3810 = (i3719 | (~i3719)) & (~i3719);
                                                                int i3811 = ((~i3810) & i3715) | ((~i3715) & i3810);
                                                                int i3812 = i3715 & i3810;
                                                                int i3813 = ((i3812 & i3811) | (i3811 ^ i3812)) * 575;
                                                                x10.setX = ((i3712 | i3813) << 1) - ((i3813 & (~i3712)) | ((~i3813) & i3712));
                                                                abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + 4);
                                                                int i3814 = i29 ^ 93;
                                                                int i3815 = ((((i29 & 93) | i3814) << 1) - (~(-i3814))) - 1;
                                                                int i3816 = i3815 & (-91);
                                                                int i3817 = ((((i3815 ^ (-91)) | i3816) << 1) - (~(-((i3815 | (-91)) & (~i3816))))) - 1;
                                                                int i3818 = f52358r0;
                                                                int i3819 = i3818 ^ 117;
                                                                int i398 = ((i3818 & 117) | i3819) << 1;
                                                                int i399 = -i3819;
                                                                int i3910 = (i398 & i399) + (i398 | i399);
                                                                f52357q0 = i3910 % 128;
                                                                int i3911 = i3910 % 2;
                                                                str2 = str;
                                                                i29 = i3817;
                                                            } else {
                                                                int i3912 = i300 & 49;
                                                                int i3913 = -(-((i300 ^ 49) | i3912));
                                                                int i3914 = (i3912 ^ i3913) + ((i3912 & i3913) << 1);
                                                                f52358r0 = i3914 % 128;
                                                                i12 = 2;
                                                                int i3915 = i3914 % 2;
                                                            }
                                                        } else {
                                                            i12 = 2;
                                                        }
                                                        Object[] objArr = new Object[i12];
                                                        objArr[0] = abxVar;
                                                        objArr[1] = 63;
                                                        i29 = (i29 ^ 1) + ((i29 & 1) << 1);
                                                        str2 = str;
                                                    } else {
                                                        Object[] objArr2 = new Object[i12];
                                                        objArr2[0] = abxVar;
                                                        objArr2[1] = 63;
                                                        i29 = (i29 ^ 1) + ((i29 & 1) << 1);
                                                        str2 = str;
                                                    }
                                                }
                                            }
                                            acj x11 = abxVar.setX(3);
                                            byte[] bArr5 = x11.setOnFocusChangeListener;
                                            int i400 = x11.setX;
                                            int i401 = cCharAt2 >> '\f';
                                            int i402 = i401 & 224;
                                            int i403 = (i401 | 224) & (~i402);
                                            bArr5[i400] = (byte) ((i403 & i402) | (i403 ^ i402));
                                            bArr5[(i400 & 1) + (i400 | 1)] = (byte) (((cCharAt2 >> 6) & 63) ^ 128);
                                            int i404 = i400 * (-661);
                                            int i405 = ((-1322) & i404) + (i404 | (-1322));
                                            int i406 = ~i10;
                                            int i407 = ~i400;
                                            int i408 = ~(((-3) & i407) | ((-3) ^ i407));
                                            int i409 = -(-(((i408 & i406) | ((~i408) & i406) | ((~i406) & i408)) * 1324));
                                            int i410 = i405 ^ i409;
                                            int i411 = -(-((i405 & i409) << 1));
                                            int i412 = (i410 ^ i411) + ((i411 & i410) << 1);
                                            int i413 = i10 ^ 2;
                                            int i414 = i10 & 2;
                                            int i415 = ~((i413 & i414) | (i413 ^ i414));
                                            int i416 = ~((i400 ^ i10) | (i400 & i10));
                                            int i417 = ((i415 & i416) | (i415 ^ i416)) * (-1324);
                                            int i418 = ((i412 ^ i417) | (i412 & i417)) << 1;
                                            int i419 = -((i417 & (~i412)) | ((~i417) & i412));
                                            int i420 = (i418 & i419) + (i419 | i418);
                                            int i421 = (-3) & i400;
                                            int i422 = ((-3) | i400) & (~i421);
                                            int i423 = ~((i422 & i421) | (i422 ^ i421));
                                            int i424 = i407 ^ 2;
                                            int i425 = i407 & 2;
                                            int i426 = ~((i425 & i424) | (i424 ^ i425));
                                            int i427 = ((i426 & i423) | (i423 ^ i426)) * 662;
                                            int i428 = i420 & i427;
                                            bArr5[((i427 | i420) & (~i428)) + (i428 << 1)] = (byte) (((cCharAt2 & '?') | 128) & (~0));
                                            int i429 = -(-(i400 * 517));
                                            int i430 = (-1545) & i429;
                                            int i431 = (i429 ^ (-1545)) | i430;
                                            int i432 = (i430 & i431) + (i431 | i430);
                                            int i433 = ~i400;
                                            int i434 = i433 & i10;
                                            int i435 = (i433 | i10) & (~i434);
                                            int i436 = ~((i435 & i434) | (i435 ^ i434));
                                            int i437 = ~i10;
                                            int i438 = (i437 & (-4)) | ((~i437) & 3);
                                            int i439 = i437 & 3;
                                            int i440 = ~((i438 & i439) | (i438 ^ i439));
                                            int i441 = i436 & i440;
                                            int i442 = (i436 | i440) & (~i441);
                                            int i443 = (i442 & i441) | (i442 ^ i441);
                                            int i444 = i406 | i10;
                                            int i445 = (~i10) & i444;
                                            int i446 = ~i400;
                                            int i447 = (i445 & i446) | ((~i445) & i400);
                                            int i448 = i445 & i400;
                                            int i449 = (i448 & i447) | (i447 ^ i448);
                                            int i450 = (i449 | (~i449)) & (~i449);
                                            int i451 = ((i443 & i450) | (i443 ^ i450)) * (-516);
                                            int i452 = (i432 ^ i451) + ((i451 & i432) << 1);
                                            int i453 = (-4) ^ i446;
                                            int i454 = (-4) & i446;
                                            int i455 = (i453 & i454) | (i453 ^ i454);
                                            int i456 = i455 & i10;
                                            int i457 = (i455 | i10) & (~i456);
                                            int i458 = ~((i457 & i456) | (i457 ^ i456));
                                            int i459 = i444 & i437;
                                            int i460 = (i459 & (-4)) | ((-4) ^ i459);
                                            int i461 = i460 & i400;
                                            int i462 = (i460 | i400) & (~i461);
                                            int i463 = (i462 & i461) | (i462 ^ i461);
                                            int i464 = (i463 | (~i463)) & (~i463);
                                            int i465 = ((~i464) & i458) | ((~i458) & i464);
                                            int i466 = i458 & i464;
                                            int i467 = (i452 - (~(-(~(-(-(((i466 & i465) | (i465 ^ i466)) * LibMCryptConstants.IND_HEX_SEGMENTO2))))))) - 1;
                                            int i468 = (i467 ^ (-1)) + (i467 << 1);
                                            int i469 = ((-4) & i400) | ((-4) & i446) | (i400 & 3);
                                            int i470 = (i469 | (~i469)) & (~i469);
                                            int i471 = i437 & i400;
                                            int i472 = ((i400 | i437) & (~i471)) | i471;
                                            int i473 = (i472 | (~i472)) & (~i472);
                                            int i474 = -(-(((i470 & i473) | (i470 ^ i473)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                                            int i475 = i468 & i474;
                                            int i476 = -(-((i474 ^ i468) | i475));
                                            x11.setX = (i475 & i476) + (i476 | i475);
                                            abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + 3);
                                            int i477 = -(~(-(-(i29 * (-919)))));
                                            int i478 = (((-919) ^ i477) + ((i477 & (-919)) << 1)) - 1;
                                            int i479 = ~i29;
                                            int i480 = ~i29;
                                            int i481 = i480 | i29;
                                            int i482 = i479 & i481;
                                            int i483 = ((~i482) & (-2)) | (i482 & 1);
                                            int i484 = i482 & (-2);
                                            int i485 = (i484 & i483) | (i483 ^ i484);
                                            int i486 = (i485 & i406) | ((~i485) & i10);
                                            int i487 = i485 & i10;
                                            int i488 = (i487 & i486) | (i486 ^ i487);
                                            int i489 = (i488 | (~i488)) & (~i488);
                                            int i490 = i479 | i406;
                                            int i491 = i490 & 1;
                                            int i492 = (i490 | 1) & (~i491);
                                            int i493 = (i492 & i491) | (i492 ^ i491);
                                            int i494 = (i493 | (~i493)) & (~i493);
                                            int i495 = i489 ^ i494;
                                            int i496 = i489 & i494;
                                            int i497 = -(-(((i496 & i495) | (i495 ^ i496)) * 920));
                                            int i498 = ((i478 | i497) << 1) - (i478 ^ i497);
                                            int i499 = ((~i479) & (-2)) | (i479 & 1);
                                            int i500 = (-2) & i479;
                                            int i501 = ~((i499 & i500) | (i499 ^ i500));
                                            int i502 = (-2) & i406;
                                            int i503 = (~i502) & ((-2) | i406);
                                            int i504 = ~((i503 & i502) | (i503 ^ i502));
                                            int i505 = (i498 - (~(((i501 & i504) | (((~i504) & i501) | ((~i501) & i504))) * 920))) - 1;
                                            int i506 = (-2) & i479;
                                            int i507 = (i479 | (-2)) & (~i506);
                                            int i508 = (i507 & i506) | (i507 ^ i506);
                                            int i509 = i508 ^ i406;
                                            int i510 = i508 & i406;
                                            int i511 = ~((i510 & i509) | (i509 ^ i510));
                                            int i512 = (i480 & (-2)) | (i29 & 1);
                                            int i513 = (-2) & i29;
                                            int i514 = (i512 & i513) | (i512 ^ i513);
                                            int i515 = i514 & i10;
                                            int i516 = ((i514 | i10) & (~i515)) | i515;
                                            int i517 = (i516 | (~i516)) & (~i516);
                                            int i518 = i511 & i517;
                                            int i519 = (i511 | i517) & (~i518);
                                            int i520 = (i519 & i518) | (i519 ^ i518);
                                            int i521 = (~i29) & i481;
                                            int i522 = i521 & 1;
                                            int i523 = (i521 | 1) & (~i522);
                                            int i524 = (i523 & i522) | (i523 ^ i522);
                                            int i525 = (i524 & i10) | (i524 ^ i10);
                                            int i526 = (i525 | (~i525)) & (~i525);
                                            int i527 = i520 & i526;
                                            int i528 = (i520 | i526) & (~i527);
                                            int i529 = -(-(((i528 & i527) | (i528 ^ i527)) * 920));
                                            int i530 = i505 ^ i529;
                                            int i531 = (i529 & i505) << 1;
                                            i29 = ((i530 | i531) << 1) - (i531 ^ i530);
                                            int i532 = f52358r0;
                                            int i533 = (i532 & 75) + (i532 | 75);
                                            f52357q0 = i533 % 128;
                                            int i534 = i533 % 2;
                                            abxVar2 = abxVar;
                                            i15 = 1;
                                            i19 = 33;
                                            i17 = 2;
                                            str2 = str;
                                        }
                                    }
                                    abxVar2 = abxVar;
                                    i17 = 2;
                                    i15 = 1;
                                    i19 = 33;
                                }
                                int i535 = i17;
                                abx abxVar3 = abxVar2;
                                int i536 = f52357q0 + 95;
                                f52358r0 = i536 % 128;
                                int i537 = i536 % i535;
                                return abxVar3;
                            }
                        }
                        StringBuilder sbC = o1.c("endIndex > string.length: ", i11, " > ");
                        sbC.append(str.length());
                        throw new IllegalArgumentException(sbC.toString().toString());
                    }
                } else {
                    int i538 = i21 + 95;
                    f52358r0 = i538 % 128;
                    int i539 = i538 % 2;
                }
                StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
                sb2.append(i11);
                sb2.append(" < ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            int i540 = f52358r0;
            int i541 = (i540 | 93) << 1;
            int i542 = -(((~i540) & 93) | (i540 & (-94)));
            int i543 = (i541 ^ i542) + ((i542 & i541) << 1);
            f52357q0 = i543 % 128;
            int i544 = i543 % 2;
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(i10)).toString());
        }
        Intrinsics.checkNotNullParameter(str2, "");
        throw null;
    }

    @JvmName(name = "getByte")
    public final byte setDividerPadding(long j10) {
        return ((Byte) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 630256048, -630256030, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final abx setX(@NotNull String str) {
        return (abx) setOnFocusChangeListener(new Object[]{this, str}, -2069576566, 2069576590, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1474615858, 1474615886, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setLayoutAnimation(long j10) throws EOFException {
        return (String) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1612990947, 1612990951, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv, com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final abx setOnFocusChangeListener() {
        int i10 = f52357q0;
        int i11 = i10 + 7;
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 27;
        int i14 = ((i10 ^ 27) | i13) << 1;
        int i15 = -((i10 | 27) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f52358r0 = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 20 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00da  */
    /* JADX WARN: Code duplicated, block: B:14:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:16:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:20:0x0110  */
    /* JADX WARN: Code duplicated, block: B:22:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:27:0x020d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0109 A[EDGE_INSN: B:33:0x0109->B:17:0x0109 BREAK  A[LOOP:0: B:10:0x00be->B:15:0x00f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0094  */
    @NotNull
    public final abx setOnFocusChangeListener(@NotNull abx abxVar, long j10, long j11) throws NoSuchAlgorithmException, IOException {
        acj acjVar;
        long j12;
        int i10;
        int i11;
        int i12;
        long j13;
        long j14;
        acj acjVar2;
        acj acjVar3;
        int i13;
        int i14;
        int i15;
        int i16 = f52357q0;
        int i17 = 1;
        int i18 = (i16 ^ 21) + ((i16 & 21) << 1);
        f52358r0 = i18 % 128;
        int i19 = 2;
        long j15 = 0;
        char c10 = 0;
        if (i18 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abxVar, "");
            acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue()), Long.valueOf(j10), Long.valueOf(j11)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
            if (j11 != 1) {
                abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j11);
                acjVar = this.setDividerPadding;
                int i20 = f52358r0;
                int i21 = ((i20 ^ 8) + ((i20 & 8) << 1)) - 1;
                f52357q0 = i21 % 128;
                int i22 = i21 % 2;
                j12 = j10;
                while (true) {
                    Intrinsics.checkNotNull(acjVar);
                    i10 = acjVar.setX;
                    i11 = acjVar.setCompoundDrawableTintBlendMode;
                    i12 = -i11;
                    if (j12 >= ((((i10 ^ i12) | (i10 & i12)) << 1) - (~(-((i12 & (~i10)) | ((~i12) & i10))))) - 1) {
                        break;
                    }
                    int i23 = f52357q0;
                    int i24 = (i23 & (-92)) | ((~i23) & 91);
                    int i25 = (i23 & 91) << 1;
                    i15 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f52358r0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        j12 |= (long) (i10 % i11);
                    } else {
                        int i26 = -i11;
                        int i27 = i10 & i26;
                        int i28 = ((i10 ^ i26) | i27) << 1;
                        int i29 = -((i10 | i26) & (~i27));
                        j12 -= (long) ((i28 & i29) + (i29 | i28));
                    }
                    acjVar = acjVar.setDividerPadding;
                }
                j13 = j12;
                j14 = j11;
                while (j14 > j15) {
                    int i30 = f52357q0;
                    int i31 = (i30 | 117) << i17;
                    int i32 = -(((~i30) & 117) | (i30 & (-118)));
                    int i33 = (i31 & i32) + (i32 | i31);
                    f52358r0 = i33 % 128;
                    int i34 = i33 % i19;
                    Intrinsics.checkNotNull(acjVar);
                    Object[] objArr = new Object[i17];
                    objArr[c10] = acjVar;
                    acjVar2 = (acj) acj.setX(objArr, -1015520700, 1015520700, System.identityHashCode(acjVar));
                    int i35 = acjVar2.setCompoundDrawableTintBlendMode;
                    int i36 = (int) j13;
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i37 = i36 * 624;
                    int i38 = i35 * (-622);
                    int i39 = ((~i38) & i37) | ((~i37) & i38);
                    int i40 = (i37 & i38) << i17;
                    int i41 = (i39 & i40) + (i39 | i40);
                    int i42 = ~i35;
                    int i43 = i42 & i36;
                    int i44 = i42 | i36;
                    int i45 = (~i43) & i44;
                    int i46 = ~i36;
                    int i47 = i43 | i45;
                    int i48 = ~iIdentityHashCode;
                    int i49 = (~((i47 & i48) | ((~i47) & iIdentityHashCode) | (i47 & iIdentityHashCode))) * 623;
                    int i50 = i41 & i49;
                    int i51 = i49 | i41;
                    int i52 = ((i50 | i51) << i17) - (i51 ^ i50);
                    int i53 = ~iIdentityHashCode;
                    int i54 = i46 ^ i35;
                    int i55 = i46 & i35;
                    int i56 = ~((i54 ^ i55) | (i54 & i55));
                    int i57 = ((~i53) & i56) | ((~i56) & i53);
                    int i58 = i53 & i56;
                    int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * (-623)));
                    int i60 = i52 & i59;
                    int i61 = i60 + ((i59 ^ i52) | i60);
                    int i62 = (~i44) & (i44 | (~i44));
                    int i63 = ~i35;
                    int i64 = ~((i63 & iIdentityHashCode) | (i63 & i48) | ((~i63) & iIdentityHashCode));
                    int i65 = ((~i64) & i62) | ((~i62) & i64);
                    int i66 = i62 & i64;
                    int i67 = (i66 & i65) | (i65 ^ i66);
                    int i68 = i36 ^ iIdentityHashCode;
                    int i69 = i36 & iIdentityHashCode;
                    int i70 = ~((i69 & i68) | (i68 ^ i69));
                    int i71 = i67 & i70;
                    int i72 = (i67 | i70) & (~i71);
                    int i73 = ((i72 & i71) | (i72 ^ i71)) * 623;
                    int i74 = i61 & i73;
                    int i75 = (i74 - (~((i73 ^ i61) | i74))) - 1;
                    acjVar2.setCompoundDrawableTintBlendMode = i75;
                    int i76 = -(-((int) j14));
                    int i77 = ((~i76) & i75) | ((~i75) & i76);
                    int i78 = -(-((i76 & i75) << 1));
                    acjVar2.setX = Math.min((i77 & i78) + (i78 | i77), acjVar2.setX);
                    acjVar3 = abxVar.setDividerPadding;
                    if (acjVar3 == null) {
                        i13 = f52358r0;
                        int i79 = i13 & 69;
                        i14 = i79 + ((i13 ^ 69) | i79);
                        f52357q0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            acjVar2.setOnDragListener = acjVar2;
                            acjVar2.setDividerPadding = acjVar2;
                            abxVar.setDividerPadding = acjVar2;
                            int i80 = i13 & 41;
                            int i81 = (((i13 ^ 41) | i80) << 1) - ((i13 | 41) & (~i80));
                            f52357q0 = i81 % 128;
                            int i82 = i81 % 2;
                        } else {
                            acjVar2.setOnDragListener = acjVar2;
                            acjVar2.setDividerPadding = acjVar2;
                            abxVar.setDividerPadding = acjVar2;
                            throw null;
                        }
                    } else {
                        Intrinsics.checkNotNull(acjVar3);
                        acj acjVar4 = acjVar3.setOnDragListener;
                        Intrinsics.checkNotNull(acjVar4);
                        int i83 = f52358r0;
                        int i84 = i83 & 59;
                        int i85 = ((i83 ^ 59) | i84) << 1;
                        int i86 = -((i83 | 59) & (~i84));
                        int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                        f52357q0 = i87 % 128;
                        int i88 = i87 % 2;
                    }
                    int i89 = acjVar2.setX;
                    int i90 = -acjVar2.setCompoundDrawableTintBlendMode;
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i91 = i90 * 85;
                    int i92 = i89 * 85;
                    int i93 = (i91 & i92) + (i91 | i92);
                    int i94 = ~i90;
                    int i95 = ~i89;
                    int i96 = ~i89;
                    int i97 = (i96 | i89) & i95;
                    int i98 = (i97 & i94) | (i94 ^ i97);
                    int i99 = (i98 | (~i98)) & (~i98);
                    int i100 = (i94 | i90) & (~i90);
                    int i101 = ~iIdentityHashCode2;
                    int i102 = (i100 & i101) | (i100 ^ i101);
                    int i103 = (i102 | (~i102)) & (~i102);
                    int i104 = (i103 & i99) | ((~i103) & i99) | ((~i99) & i103);
                    int i105 = ~iIdentityHashCode2;
                    int i106 = i101 & (i105 | iIdentityHashCode2);
                    int i107 = i96 ^ i106;
                    int i108 = i96 & i106;
                    int i109 = ~((i108 & i107) | (i107 ^ i108));
                    int i110 = i104 & i109;
                    int i111 = ((i104 | i109) & (~i110)) | i110;
                    int i112 = ~((i90 ^ i89) | (i90 & i89) | iIdentityHashCode2);
                    int i113 = ((~i112) & i111) | ((~i111) & i112);
                    int i114 = i111 & i112;
                    int i115 = (i93 - (~(((i114 & i113) | (i113 ^ i114)) * (-84)))) - 1;
                    int i116 = (i95 & i105) | ((~i95) & iIdentityHashCode2);
                    int i117 = iIdentityHashCode2 & i95;
                    int i118 = ~((i117 & i116) | (i116 ^ i117));
                    int i119 = i90 & i118;
                    int i120 = ((i118 | i90) & (~i119)) | i119;
                    int i121 = i105 ^ i89;
                    int i122 = i105 & i89;
                    int i123 = (i120 | (~((i121 & i122) | (i121 ^ i122)))) * (-84);
                    int i124 = (((i115 ^ i123) | (i115 & i123)) << 1) - ((i123 & (~i115)) | ((~i123) & i115));
                    int i125 = ~((i106 ^ i89) | (i106 & i89));
                    int i126 = i89 | i90;
                    int i127 = (i126 | (~i126)) & (~i126);
                    int i128 = ((~i127) & i125) | ((~i125) & i127);
                    int i129 = i127 & i125;
                    int i130 = -(-(((i129 & i128) | (i128 ^ i129)) * 84));
                    j14 -= (long) ((i124 ^ i130) + ((i130 & i124) << 1));
                    acjVar = acjVar.setDividerPadding;
                    int i131 = f52358r0;
                    int i132 = i131 & 85;
                    int i133 = -(-((i131 ^ 85) | i132));
                    int i134 = i132 ^ i133;
                    int i135 = i133 & i132;
                    i17 = 1;
                    int i136 = i134 + (i135 << 1);
                    f52357q0 = i136 % 128;
                    int i137 = i136 % 2;
                    i19 = 2;
                    j13 = 0;
                    j15 = 0;
                    c10 = 0;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(abxVar, "");
            acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue()), Long.valueOf(j10), Long.valueOf(j11)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
            if (j11 != 0) {
                abxVar.setX(((Long) setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j11);
                acjVar = this.setDividerPadding;
                int i210 = f52358r0;
                int i211 = ((i210 ^ 8) + ((i210 & 8) << 1)) - 1;
                f52357q0 = i211 % 128;
                int i212 = i211 % 2;
                j12 = j10;
                while (true) {
                    Intrinsics.checkNotNull(acjVar);
                    i10 = acjVar.setX;
                    i11 = acjVar.setCompoundDrawableTintBlendMode;
                    i12 = -i11;
                    if (j12 >= ((((i10 ^ i12) | (i10 & i12)) << 1) - (~(-((i12 & (~i10)) | ((~i12) & i10))))) - 1) {
                        break;
                        break;
                    }
                    int i213 = f52357q0;
                    int i214 = (i213 & (-92)) | ((~i213) & 91);
                    int i215 = (i213 & 91) << 1;
                    i15 = ((i214 | i215) << 1) - (i215 ^ i214);
                    f52358r0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        j12 |= (long) (i10 % i11);
                    } else {
                        int i216 = -i11;
                        int i217 = i10 & i216;
                        int i218 = ((i10 ^ i216) | i217) << 1;
                        int i219 = -((i10 | i216) & (~i217));
                        j12 -= (long) ((i218 & i219) + (i219 | i218));
                    }
                    acjVar = acjVar.setDividerPadding;
                }
                j13 = j12;
                j14 = j11;
                while (j14 > j15) {
                    int i310 = f52357q0;
                    int i311 = (i310 | 117) << i17;
                    int i312 = -(((~i310) & 117) | (i310 & (-118)));
                    int i313 = (i311 & i312) + (i312 | i311);
                    f52358r0 = i313 % 128;
                    int i314 = i313 % i19;
                    Intrinsics.checkNotNull(acjVar);
                    Object[] objArr2 = new Object[i17];
                    objArr2[c10] = acjVar;
                    acjVar2 = (acj) acj.setX(objArr2, -1015520700, 1015520700, System.identityHashCode(acjVar));
                    int i315 = acjVar2.setCompoundDrawableTintBlendMode;
                    int i316 = (int) j13;
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i317 = i316 * 624;
                    int i318 = i315 * (-622);
                    int i319 = ((~i318) & i317) | ((~i317) & i318);
                    int i410 = (i317 & i318) << i17;
                    int i411 = (i319 & i410) + (i319 | i410);
                    int i412 = ~i315;
                    int i413 = i412 & i316;
                    int i414 = i412 | i316;
                    int i415 = (~i413) & i414;
                    int i416 = ~i316;
                    int i417 = i413 | i415;
                    int i418 = ~iIdentityHashCode3;
                    int i419 = (~((i417 & i418) | ((~i417) & iIdentityHashCode3) | (i417 & iIdentityHashCode3))) * 623;
                    int i510 = i411 & i419;
                    int i511 = i419 | i411;
                    int i512 = ((i510 | i511) << i17) - (i511 ^ i510);
                    int i513 = ~iIdentityHashCode3;
                    int i514 = i416 ^ i315;
                    int i515 = i416 & i315;
                    int i516 = ~((i514 ^ i515) | (i514 & i515));
                    int i517 = ((~i513) & i516) | ((~i516) & i513);
                    int i518 = i513 & i516;
                    int i519 = -(-(((i518 & i517) | (i517 ^ i518)) * (-623)));
                    int i610 = i512 & i519;
                    int i611 = i610 + ((i519 ^ i512) | i610);
                    int i612 = (~i414) & (i414 | (~i414));
                    int i613 = ~i315;
                    int i614 = ~((i613 & iIdentityHashCode3) | (i613 & i418) | ((~i613) & iIdentityHashCode3));
                    int i615 = ((~i614) & i612) | ((~i612) & i614);
                    int i616 = i612 & i614;
                    int i617 = (i616 & i615) | (i615 ^ i616);
                    int i618 = i316 ^ iIdentityHashCode3;
                    int i619 = i316 & iIdentityHashCode3;
                    int i710 = ~((i619 & i618) | (i618 ^ i619));
                    int i711 = i617 & i710;
                    int i712 = (i617 | i710) & (~i711);
                    int i713 = ((i712 & i711) | (i712 ^ i711)) * 623;
                    int i714 = i611 & i713;
                    int i715 = (i714 - (~((i713 ^ i611) | i714))) - 1;
                    acjVar2.setCompoundDrawableTintBlendMode = i715;
                    int i716 = -(-((int) j14));
                    int i717 = ((~i716) & i715) | ((~i715) & i716);
                    int i718 = -(-((i716 & i715) << 1));
                    acjVar2.setX = Math.min((i717 & i718) + (i718 | i717), acjVar2.setX);
                    acjVar3 = abxVar.setDividerPadding;
                    if (acjVar3 == null) {
                        i13 = f52358r0;
                        int i719 = i13 & 69;
                        i14 = i719 + ((i13 ^ 69) | i719);
                        f52357q0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            acjVar2.setOnDragListener = acjVar2;
                            acjVar2.setDividerPadding = acjVar2;
                            abxVar.setDividerPadding = acjVar2;
                            int i810 = i13 & 41;
                            int i811 = (((i13 ^ 41) | i810) << 1) - ((i13 | 41) & (~i810));
                            f52357q0 = i811 % 128;
                            int i812 = i811 % 2;
                        } else {
                            acjVar2.setOnDragListener = acjVar2;
                            acjVar2.setDividerPadding = acjVar2;
                            abxVar.setDividerPadding = acjVar2;
                            throw null;
                        }
                    } else {
                        Intrinsics.checkNotNull(acjVar3);
                        acj acjVar5 = acjVar3.setOnDragListener;
                        Intrinsics.checkNotNull(acjVar5);
                        int i813 = f52358r0;
                        int i814 = i813 & 59;
                        int i815 = ((i813 ^ 59) | i814) << 1;
                        int i816 = -((i813 | 59) & (~i814));
                        int i817 = ((i815 | i816) << 1) - (i816 ^ i815);
                        f52357q0 = i817 % 128;
                        int i818 = i817 % 2;
                    }
                    int i819 = acjVar2.setX;
                    int i910 = -acjVar2.setCompoundDrawableTintBlendMode;
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i911 = i910 * 85;
                    int i912 = i819 * 85;
                    int i913 = (i911 & i912) + (i911 | i912);
                    int i914 = ~i910;
                    int i915 = ~i819;
                    int i916 = ~i819;
                    int i917 = (i916 | i819) & i915;
                    int i918 = (i917 & i914) | (i914 ^ i917);
                    int i919 = (i918 | (~i918)) & (~i918);
                    int i1010 = (i914 | i910) & (~i910);
                    int i1011 = ~iIdentityHashCode4;
                    int i1012 = (i1010 & i1011) | (i1010 ^ i1011);
                    int i1013 = (i1012 | (~i1012)) & (~i1012);
                    int i1014 = (i1013 & i919) | ((~i1013) & i919) | ((~i919) & i1013);
                    int i1015 = ~iIdentityHashCode4;
                    int i1016 = i1011 & (i1015 | iIdentityHashCode4);
                    int i1017 = i916 ^ i1016;
                    int i1018 = i916 & i1016;
                    int i1019 = ~((i1018 & i1017) | (i1017 ^ i1018));
                    int i1110 = i1014 & i1019;
                    int i1111 = ((i1014 | i1019) & (~i1110)) | i1110;
                    int i1112 = ~((i910 ^ i819) | (i910 & i819) | iIdentityHashCode4);
                    int i1113 = ((~i1112) & i1111) | ((~i1111) & i1112);
                    int i1114 = i1111 & i1112;
                    int i1115 = (i913 - (~(((i1114 & i1113) | (i1113 ^ i1114)) * (-84)))) - 1;
                    int i1116 = (i915 & i1015) | ((~i915) & iIdentityHashCode4);
                    int i1117 = iIdentityHashCode4 & i915;
                    int i1118 = ~((i1117 & i1116) | (i1116 ^ i1117));
                    int i1119 = i910 & i1118;
                    int i1210 = ((i1118 | i910) & (~i1119)) | i1119;
                    int i1211 = i1015 ^ i819;
                    int i1212 = i1015 & i819;
                    int i1213 = (i1210 | (~((i1211 & i1212) | (i1211 ^ i1212)))) * (-84);
                    int i1214 = (((i1115 ^ i1213) | (i1115 & i1213)) << 1) - ((i1213 & (~i1115)) | ((~i1213) & i1115));
                    int i1215 = ~((i1016 ^ i819) | (i1016 & i819));
                    int i1216 = i819 | i910;
                    int i1217 = (i1216 | (~i1216)) & (~i1216);
                    int i1218 = ((~i1217) & i1215) | ((~i1215) & i1217);
                    int i1219 = i1217 & i1215;
                    int i138 = -(-(((i1219 & i1218) | (i1218 ^ i1219)) * 84));
                    j14 -= (long) ((i1214 ^ i138) + ((i138 & i1214) << 1));
                    acjVar = acjVar.setDividerPadding;
                    int i139 = f52358r0;
                    int i1310 = i139 & 85;
                    int i1311 = -(-((i139 ^ 85) | i1310));
                    int i1312 = i1310 ^ i1311;
                    int i1313 = i1311 & i1310;
                    i17 = 1;
                    int i1314 = i1312 + (i1313 << 1);
                    f52357q0 = i1314 % 128;
                    int i1315 = i1314 % 2;
                    i19 = 2;
                    j13 = 0;
                    j15 = 0;
                    c10 = 0;
                }
            }
        }
        int i140 = f52358r0;
        int i141 = (i140 & 75) + (i140 | 75);
        f52357q0 = i141 % 128;
        if (i141 % 2 != 0) {
            int i142 = 44 / 0;
        }
        return this;
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final abw setY(long j10) throws NoSuchAlgorithmException, IOException {
        int i10 = f52357q0;
        int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        if (j10 >= 0) {
            int i13 = i10 + 65;
            f52358r0 = i13 % 128;
            int i14 = i13 % 2;
            if (j10 <= 2147483647L) {
                int i15 = ((((i10 ^ 3) | (i10 & 3)) << 1) - (~(-((i10 & (-4)) | ((~i10) & 3))))) - 1;
                f52358r0 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = (i10 | 3) << 1;
                int i18 = -(i10 ^ 3);
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f52358r0 = i19 % 128;
                int i20 = i19 % 2;
                if (((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() < j10) {
                    throw new EOFException();
                }
                if (j10 >= SvgConstantsKt.SPECIFIED_COLOR) {
                    int i21 = f52358r0;
                    int i22 = i21 & 109;
                    int i23 = -(-((i21 ^ 109) | i22));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    f52357q0 = i24 % 128;
                    if (i24 % 2 == 0) {
                        abw abwVarA = A((int) j10);
                        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1525846840, 1525846865, System.identityHashCode(this));
                        return abwVarA;
                    }
                    abw abwVarA2 = A((int) j10);
                    setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1525846840, 1525846865, System.identityHashCode(this));
                    int i25 = 54 / 0;
                    return abwVarA2;
                }
                abw abwVar = new abw((byte[]) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 1697003307, -1697003267, System.identityHashCode(this)));
                int i26 = f52357q0;
                int i27 = (i26 ^ 9) + ((i26 & 9) << 1);
                f52358r0 = i27 % 128;
                int i28 = i27 % 2;
                return abwVar;
            }
        }
        int i29 = ((-1) << 1) - ((i10 + 124) ^ (-1));
        f52358r0 = i29 % 128;
        int i30 = i29 % 2;
        throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j10)).toString());
    }

    @NotNull
    public final abx setOnFocusChangeListener(int i10) throws NoSuchAlgorithmException, IOException {
        int i11 = f52357q0 + 99;
        f52358r0 = i11 % 128;
        int i12 = i11 % 2;
        acj x4 = setX(4);
        byte[] bArr = x4.setOnFocusChangeListener;
        int i13 = x4.setX;
        int i14 = -(-(i13 * 246));
        int i15 = ((-244) & i14) + (i14 | (-244));
        int i16 = ~i13;
        int i17 = ~i10;
        int i18 = ((~i17) & i16) | ((~i16) & i17);
        int i19 = i16 & i17;
        int i20 = ~((i18 & i19) | (i18 ^ i19));
        int i21 = (~i13) & (i16 | i13);
        int i22 = (i21 & (-2)) | ((~i21) & 1);
        int i23 = i21 & 1;
        int i24 = (i23 & i22) | (i22 ^ i23);
        int i25 = (i24 | (~i24)) & (~i24);
        int i26 = ((~i25) & i20) | ((~i20) & i25);
        int i27 = i20 & i25;
        int i28 = ((i27 & i26) | (i26 ^ i27)) * (-245);
        int i29 = (i15 ^ i28) + ((i15 & i28) << 1);
        int i30 = i16 & i10;
        int i31 = (i29 - (~(-(-((~(i30 | ((~i30) & (i16 | i10)))) * (-245)))))) - 1;
        int i32 = i16 & i10;
        int i33 = ((i16 | i10) & (~i32)) | i32;
        int i34 = (i33 | (~i33)) & (~i33);
        int i35 = ((~i34) & 1) | (i34 & (-2));
        int i36 = i34 & 1;
        int i37 = ((i36 & i35) | (i35 ^ i36)) * 245;
        int i38 = (i31 & i37) + (i37 | i31);
        bArr[i13] = (byte) (i10 >>> 24);
        int i39 = i38 * (-782);
        int i40 = (784 & i39) + (i39 | 784);
        int i41 = -(-((~i38) * (-783)));
        int i42 = i40 & i41;
        int i43 = (i41 ^ i40) | i42;
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        int i45 = i17 | i10;
        int i46 = (~i10) & i45;
        int i47 = (i46 & (-2)) | ((-2) ^ i46);
        int i48 = ((~i38) & i47) | ((~i47) & i38);
        int i49 = i47 & i38;
        int i50 = (~((i49 & i48) | (i48 ^ i49))) * (-783);
        int i51 = (i44 ^ i50) + ((i50 & i44) << 1);
        int i52 = ~((i17 ^ i38) | (i17 & i38));
        int i53 = (-2) & i52;
        int i54 = (i52 | (-2)) & (~i53);
        int i55 = ((i54 & i53) | (i54 ^ i53)) * 783;
        int i56 = i51 & i55;
        int i57 = (i56 - (~(-(-((i55 ^ i51) | i56))))) - 1;
        bArr[i38] = (byte) (i10 >>> 16);
        int i58 = i57 * 185;
        int i59 = ((-1) << 1) - ((((((-183) & i58) - (~(-(-(i58 | (-183)))))) - 1) - (~(((i57 ^ (-2)) | (i57 & (-2))) * (-368)))) ^ (-1));
        int i60 = ~i57;
        int i61 = (i60 & 1) | (i60 ^ 1);
        int i62 = ~i10;
        int i63 = i61 & i62;
        int i64 = (i61 | i62) & (~i63);
        int i65 = ((i64 & i63) | (i64 ^ i63)) * 184;
        int i66 = i59 & i65;
        int i67 = (((i59 | i65) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
        int i68 = ~i57;
        int i69 = (-2) & i68;
        int i70 = ~(((i68 | (-2)) & (~i69)) | i69);
        int i71 = i45 & i62;
        int i72 = (i71 & (-2)) | ((~i71) & 1);
        int i73 = i71 & 1;
        int i74 = ~((i73 & i72) | (i72 ^ i73));
        int i75 = i70 ^ i74;
        int i76 = i74 & i70;
        int i77 = (i76 & i75) | (i75 ^ i76);
        int i78 = (i57 ^ 1) | (i57 & 1);
        int i79 = (i78 | (~i78)) & (~i78);
        int i80 = (((i77 & i79) | (i77 ^ i79)) * 184) + i67;
        bArr[i57] = (byte) (i10 >>> 8);
        int i81 = i80 & 1;
        int i82 = ((i80 ^ 1) | i81) << 1;
        int i83 = -((~i81) & (i80 | 1));
        bArr[i80] = (byte) i10;
        x4.setX = (i82 & i83) + (i82 | i83);
        setX(((Long) setOnFocusChangeListener(new Object[]{this}, 1395393434, -1395393402, System.identityHashCode(this))).longValue() + 4);
        int i84 = f52357q0;
        int i85 = (((i84 | 60) << 1) - (i84 ^ 60)) - 1;
        f52358r0 = i85 % 128;
        int i86 = i85 % 2;
        return this;
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    @NotNull
    public final acq setY() {
        return (acq) setOnFocusChangeListener(new Object[]{this}, -1100261013, 1100261046, System.identityHashCode(this));
    }

    public final long setY(byte b10, long j10, long j11) {
        return ((Long) setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10), Long.valueOf(j10), Long.valueOf(j11)}, 268946389, -268946363, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final boolean setOnFocusChangeListener(long j10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -233144656, 233144673, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public final long setY(@NotNull abx abxVar, long j10) {
        return ((Long) setOnFocusChangeListener(new Object[]{this, abxVar, Long.valueOf(j10)}, -1652089489, 1652089516, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final abx setY(int i10) {
        return (abx) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 1433477211, -1433477201, i10);
    }

    public final long setY(@NotNull acp acpVar) throws IOException {
        return ((Long) setOnFocusChangeListener(new Object[]{this, acpVar}, -1844326734, 1844326753, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final abx setY(@NotNull byte[] bArr) {
        return (abx) setOnFocusChangeListener(new Object[]{this, bArr}, -808853030, 808853073, System.identityHashCode(this));
    }
}
