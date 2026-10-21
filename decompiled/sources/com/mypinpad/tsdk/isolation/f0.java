package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements acp {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55455r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55456s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InputStream f55457p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final acq f55458q0;

    public f0(@NotNull InputStream inputStream, @NotNull acq acqVar) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(acqVar, "");
        this.f55457p0 = inputStream;
        this.f55458q0 = acqVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f5 A[Catch: AssertionError -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {AssertionError -> 0x0117, blocks: (B:22:0x009f, B:25:0x00da, B:29:0x00f5, B:31:0x0113, B:37:0x011a, B:43:0x0157), top: B:63:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x011a A[Catch: AssertionError -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {AssertionError -> 0x0117, blocks: (B:22:0x009f, B:25:0x00da, B:29:0x00f5, B:31:0x0113, B:37:0x011a, B:43:0x0157), top: B:63:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x014e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0156  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157 A[Catch: AssertionError -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {AssertionError -> 0x0117, blocks: (B:22:0x009f, B:25:0x00da, B:29:0x00f5, B:31:0x0113, B:37:0x011a, B:43:0x0157), top: B:63:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fc  */
    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        long jValueOf;
        acj x4;
        int i14;
        long j10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = ~(i19 | i20);
        int i22 = (~i12) | i19;
        int i23 = (((~(i10 | i20)) | (~(i11 | i22))) * 241) + ((i10 | i11) * (-482)) + (((~i22) | i21) * (-241)) + (i11 * 242) + (i10 * 483);
        if (i23 == 1) {
            f0 f0Var = (f0) objArr[0];
            int i24 = f55455r0;
            int i25 = i24 + 102;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            f55456s0 = i26 % 128;
            int i27 = i26 % 2;
            acq acqVar = f0Var.f55458q0;
            int i28 = (((i24 ^ 5) | (i24 & 5)) << 1) - (((~i24) & 5) | (i24 & (-6)));
            f55456s0 = i28 % 128;
            if (i28 % 2 != 0) {
                return acqVar;
            }
            int i29 = 53 / 0;
            return acqVar;
        }
        if (i23 == 2) {
            f0 f0Var2 = (f0) objArr[0];
            StringBuilder sb2 = new StringBuilder("source(");
            sb2.append(f0Var2.f55457p0);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i30 = f55455r0;
            int i31 = i30 & 111;
            int i32 = i30 | 111;
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f55456s0 = i33 % 128;
            int i34 = i33 % 2;
            return string;
        }
        if (i23 == 3) {
            f0 f0Var3 = (f0) objArr[0];
            int i35 = f55455r0 + 79;
            f55456s0 = i35 % 128;
            int i36 = i35 % 2;
            f0Var3.f55457p0.close();
            System.identityHashCode(f0Var3);
            System.identityHashCode(f0Var3);
            return null;
        }
        f0 f0Var4 = (f0) objArr[0];
        abx abxVar = (abx) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i37 = f55455r0;
        int i38 = (i37 & 68) + (i37 | 68);
        int i39 = (i38 ^ (-1)) + (i38 << 1);
        f55456s0 = i39 % 128;
        if (i39 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abxVar, "");
            if (jLongValue == 0) {
                int i40 = f55456s0;
                int i41 = (i40 ^ 5) + ((i40 & 5) << 1);
                f55455r0 = i41 % 128;
                int i42 = i41 % 2;
                i13 = (((i40 | 10) << 1) - (i40 ^ 10)) - 1;
                f55455r0 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i43 = 50 / 0;
                    jValueOf = 0L;
                } else {
                    jValueOf = 0L;
                }
            } else {
                if (jLongValue >= 0) {
                    int i44 = f55456s0;
                    int i45 = i44 ^ 69;
                    int i46 = ((i44 & 69) | i45) << 1;
                    int i47 = -i45;
                    int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                    f55455r0 = i48 % 128;
                    int i49 = i48 % 2;
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
                }
                int i50 = f55456s0;
                int i51 = i50 & 21;
                int i52 = -(-(i50 | 21));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                f55455r0 = i53 % 128;
                int i54 = i53 % 2;
                try {
                    f0Var4.f55458q0.getNavBarTitleString();
                    x4 = abxVar.setX(1);
                    int i55 = -x4.setX;
                    int i56 = i55 & 8192;
                    int i57 = -(-((i55 ^ 8192) | i56));
                    i14 = f0Var4.f55457p0.read(x4.setOnFocusChangeListener, x4.setX, (int) Math.min(jLongValue, (i56 & i57) + (i57 | i56)));
                    if (i14 == -1) {
                        int i58 = f55456s0;
                        int i59 = i58 ^ 113;
                        int i60 = -(-((i58 & 113) << 1));
                        int i61 = (i59 & i60) + (i60 | i59);
                        i16 = i61 % 128;
                        f55455r0 = i16;
                        int i62 = i61 % 2;
                        if (x4.setCompoundDrawableTintBlendMode == x4.setX) {
                            i18 = i16 + 83;
                            f55456s0 = i18 % 128;
                            if (i18 % 2 == 0) {
                                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                                ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                                int i63 = 74 / 0;
                            } else {
                                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                                ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                            }
                            int i64 = f55455r0;
                            int i65 = ((i64 | 23) << 1) - (i64 ^ 23);
                            f55456s0 = i65 % 128;
                            int i66 = i65 % 2;
                        }
                        i17 = f55455r0 + 33;
                        f55456s0 = i17 % 128;
                        if (i17 % 2 != 0) {
                            throw null;
                        }
                        jValueOf = -1L;
                    } else {
                        int i67 = x4.setX;
                        System.identityHashCode(f0Var4);
                        int i68 = i14 * 678;
                        int i69 = -(-(i67 * (-676)));
                        int i70 = i68 & i69;
                        int i71 = ((i68 ^ i69) | i70) << 1;
                        int i72 = -((i68 | i69) & (~i70));
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        int i74 = ~i14;
                        int i75 = i74 * 677;
                        int i76 = ((~i75) & i73) | ((~i73) & i75);
                        int i77 = (i73 & i75) << 1;
                        int i78 = (i76 & i77) + (i77 | i76);
                        int i79 = ~i67;
                        int i80 = ((i74 & i79) | (i74 ^ i79)) * (-677);
                        int i81 = i78 & i80;
                        int i82 = ((i78 ^ i80) | i81) << 1;
                        int i83 = -((i80 | i78) & (~i81));
                        int i84 = (i82 & i83) + (i83 | i82);
                        int i85 = i79 & i14;
                        int i86 = (i79 | i14) & (~i85);
                        x4.setX = (i84 - (~(-(-((~((i85 & i86) | (i86 ^ i85))) * 677))))) - 1;
                        j10 = i14;
                        abxVar.setX(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j10);
                        int i87 = f55455r0;
                        i15 = (i87 ^ 57) + ((i87 & 57) << 1);
                        f55456s0 = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        jValueOf = Long.valueOf(j10);
                    }
                } catch (AssertionError e5) {
                    if (((Boolean) ach.setOnFocusChangeListener(new Object[]{e5}, -1623690444, 1623690450, (int) System.currentTimeMillis())).booleanValue()) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(abxVar, "");
            if (jLongValue == 0) {
                int i410 = f55456s0;
                int i411 = (i410 ^ 5) + ((i410 & 5) << 1);
                f55455r0 = i411 % 128;
                int i412 = i411 % 2;
                i13 = (((i410 | 10) << 1) - (i410 ^ 10)) - 1;
                f55455r0 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i413 = 50 / 0;
                    jValueOf = 0L;
                } else {
                    jValueOf = 0L;
                }
            } else {
                if (jLongValue >= 0) {
                    int i414 = f55456s0;
                    int i415 = i414 ^ 69;
                    int i416 = ((i414 & 69) | i415) << 1;
                    int i417 = -i415;
                    int i418 = (i416 ^ i417) + ((i416 & i417) << 1);
                    f55455r0 = i418 % 128;
                    int i419 = i418 % 2;
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
                }
                int i510 = f55456s0;
                int i511 = i510 & 21;
                int i512 = -(-(i510 | 21));
                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                f55455r0 = i513 % 128;
                int i514 = i513 % 2;
                f0Var4.f55458q0.getNavBarTitleString();
                x4 = abxVar.setX(1);
                int i515 = -x4.setX;
                int i516 = i515 & 8192;
                int i517 = -(-((i515 ^ 8192) | i516));
                i14 = f0Var4.f55457p0.read(x4.setOnFocusChangeListener, x4.setX, (int) Math.min(jLongValue, (i516 & i517) + (i517 | i516)));
                if (i14 == -1) {
                    int i518 = f55456s0;
                    int i519 = i518 ^ 113;
                    int i610 = -(-((i518 & 113) << 1));
                    int i611 = (i519 & i610) + (i610 | i519);
                    i16 = i611 % 128;
                    f55455r0 = i16;
                    int i612 = i611 % 2;
                    if (x4.setCompoundDrawableTintBlendMode == x4.setX) {
                        i18 = i16 + 83;
                        f55456s0 = i18 % 128;
                        if (i18 % 2 == 0) {
                            abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                            ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                            int i613 = 74 / 0;
                        } else {
                            abxVar.setDividerPadding = (acj) acj.setX(new Object[]{x4}, -1022523986, 1022523990, System.identityHashCode(x4));
                            ack.setY(new Object[]{x4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                        }
                        int i614 = f55455r0;
                        int i615 = ((i614 | 23) << 1) - (i614 ^ 23);
                        f55456s0 = i615 % 128;
                        int i616 = i615 % 2;
                    }
                    i17 = f55455r0 + 33;
                    f55456s0 = i17 % 128;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                    jValueOf = -1L;
                } else {
                    int i617 = x4.setX;
                    System.identityHashCode(f0Var4);
                    int i618 = i14 * 678;
                    int i619 = -(-(i617 * (-676)));
                    int i710 = i618 & i619;
                    int i711 = ((i618 ^ i619) | i710) << 1;
                    int i712 = -((i618 | i619) & (~i710));
                    int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
                    int i714 = ~i14;
                    int i715 = i714 * 677;
                    int i716 = ((~i715) & i713) | ((~i713) & i715);
                    int i717 = (i713 & i715) << 1;
                    int i718 = (i716 & i717) + (i717 | i716);
                    int i719 = ~i617;
                    int i88 = ((i714 & i719) | (i714 ^ i719)) * (-677);
                    int i89 = i718 & i88;
                    int i810 = ((i718 ^ i88) | i89) << 1;
                    int i811 = -((i88 | i718) & (~i89));
                    int i812 = (i810 & i811) + (i811 | i810);
                    int i813 = i719 & i14;
                    int i814 = (i719 | i14) & (~i813);
                    x4.setX = (i812 - (~(-(-((~((i813 & i814) | (i814 ^ i813))) * 677))))) - 1;
                    j10 = i14;
                    abxVar.setX(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + j10);
                    int i815 = f55455r0;
                    i15 = (i815 ^ 57) + ((i815 & 57) << 1);
                    f55456s0 = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    jValueOf = Long.valueOf(j10);
                }
            }
        }
        return jValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(new Object[]{this}, 1709907817, -1709907814, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    @NotNull
    public final acq setY() {
        return (acq) a(new Object[]{this}, 1791854471, -1791854470, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) a(new Object[]{this}, -712149398, 712149400, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public final long setY(@NotNull abx abxVar, long j10) {
        return ((Long) a(new Object[]{this, abxVar, Long.valueOf(j10)}, 1041446399, -1041446399, System.identityHashCode(this))).longValue();
    }
}
