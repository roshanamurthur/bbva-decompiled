package com.mypinpad.tsdk.isolation;

import ai.a;
import androidx.compose.animation.core.AnimationKt;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62297a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62298b = 1;

    @NotNull
    public static final String setDividerPadding(long j10) {
        return (String) setX(new Object[]{Long.valueOf(j10)}, 2036943663, -2036943663, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006d  */
    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:18:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:24:0x0114  */
    /* JADX WARN: Code duplicated, block: B:26:0x011b  */
    /* JADX WARN: Code duplicated, block: B:27:0x013d  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String strI;
        String string;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ((~(i10 | i16)) * 69) + (((~(i11 | i12)) | (~(i15 | i12)) | (~(i15 | i11))) * (-69)) + (((~(i15 | i16 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i17 == 1) {
            strI = null;
            zb zbVar = (zb) objArr[0];
            ze zeVar = (ze) objArr[1];
            String str = (String) objArr[2];
            zd.Companion companion = zd.INSTANCE;
            Logger logger = (Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis());
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) ze.setY(new Object[]{zeVar}, 1886544987, -1886544985, System.identityHashCode(zeVar)));
            sb2.append(' ');
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append((String) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar}, -144211769, 144211772, System.identityHashCode(zbVar)));
            logger.fine(sb2.toString());
            int i18 = f62298b;
            int i19 = ((i18 & 25) - (~(i18 | 25))) - 1;
            f62297a = i19 % 128;
            int i20 = i19 % 2;
        } else if (i17 != 2) {
            long jLongValue = ((Number) objArr[0]).longValue();
            int i21 = f62298b;
            int i22 = i21 & 67;
            int i23 = ((i21 ^ 67) | i22) << 1;
            int i24 = -((i21 | 67) & (~i22));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f62297a = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 85 / 0;
                if (jLongValue <= -999500000) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((jLongValue - 500000000) / 1000000000);
                    sb3.append(" s ");
                    string = sb3.toString();
                    int i27 = f62298b;
                    int i28 = (((i27 | 16) << 1) - (i27 ^ 16)) - 1;
                    f62297a = i28 % 128;
                    int i29 = i28 % 2;
                } else if (jLongValue <= -999500) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append((jLongValue - 500000) / AnimationKt.MillisToNanos);
                    sb4.append(" ms");
                    string = sb4.toString();
                    int i30 = f62298b;
                    int i31 = i30 & 121;
                    int i32 = -(-(i30 | 121));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f62297a = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    if (jLongValue <= 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append((jLongValue - 500) / 1000);
                        sb5.append(" µs");
                        string = sb5.toString();
                        int i35 = f62298b;
                        i13 = (i35 & 68) + (i35 | 68);
                    } else if (jLongValue < 999500) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append((jLongValue + 500) / 1000);
                        sb6.append(" µs");
                        string = sb6.toString();
                        int i36 = f62298b;
                        i14 = ((i36 | 31) << 1) - (i36 ^ 31);
                        f62297a = i14 % 128;
                        int i37 = i14 % 2;
                    } else if (jLongValue < 999500000) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append((jLongValue + 500000) / AnimationKt.MillisToNanos);
                        sb7.append(" ms");
                        string = sb7.toString();
                        int i38 = f62297a;
                        int i39 = i38 & 105;
                        int i40 = ((i38 | 105) & (~i39)) + (i39 << 1);
                        f62298b = i40 % 128;
                        int i41 = i40 % 2;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append((jLongValue + 500000000) / 1000000000);
                        sb8.append(" s ");
                        string = sb8.toString();
                        int i42 = f62298b;
                        int i43 = i42 & 93;
                        i13 = (((i42 ^ 93) | i43) << 1) - (~(-((i42 | 93) & (~i43))));
                    }
                    i14 = i13 - 1;
                    f62297a = i14 % 128;
                    int i310 = i14 % 2;
                }
            } else if (jLongValue <= -999500000) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append((jLongValue - 500000000) / 1000000000);
                sb9.append(" s ");
                string = sb9.toString();
                int i210 = f62298b;
                int i211 = (((i210 | 16) << 1) - (i210 ^ 16)) - 1;
                f62297a = i211 % 128;
                int i212 = i211 % 2;
            } else if (jLongValue <= -999500) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append((jLongValue - 500000) / AnimationKt.MillisToNanos);
                sb10.append(" ms");
                string = sb10.toString();
                int i311 = f62298b;
                int i312 = i311 & 121;
                int i313 = -(-(i311 | 121));
                int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
                f62297a = i314 % 128;
                int i315 = i314 % 2;
            } else {
                if (jLongValue <= 0) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append((jLongValue - 500) / 1000);
                    sb11.append(" µs");
                    string = sb11.toString();
                    int i316 = f62298b;
                    i13 = (i316 & 68) + (i316 | 68);
                } else if (jLongValue < 999500) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append((jLongValue + 500) / 1000);
                    sb12.append(" µs");
                    string = sb12.toString();
                    int i317 = f62298b;
                    i14 = ((i317 | 31) << 1) - (i317 ^ 31);
                    f62297a = i14 % 128;
                    int i318 = i14 % 2;
                } else if (jLongValue < 999500000) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append((jLongValue + 500000) / AnimationKt.MillisToNanos);
                    sb13.append(" ms");
                    string = sb13.toString();
                    int i319 = f62297a;
                    int i320 = i319 & 105;
                    int i44 = ((i319 | 105) & (~i320)) + (i320 << 1);
                    f62298b = i44 % 128;
                    int i45 = i44 % 2;
                } else {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append((jLongValue + 500000000) / 1000000000);
                    sb14.append(" s ");
                    string = sb14.toString();
                    int i46 = f62298b;
                    int i47 = i46 & 93;
                    i13 = (((i46 ^ 93) | i47) << 1) - (~(-((i46 | 93) & (~i47))));
                }
                i14 = i13 - 1;
                f62297a = i14 % 128;
                int i3110 = i14 % 2;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strI = a.i(new Object[]{string}, 1, "%6s", "");
            int i48 = f62297a + 109;
            f62298b = i48 % 128;
            if (i48 % 2 == 0) {
                throw null;
            }
        } else {
            strI = null;
            zb zbVar2 = (zb) objArr[0];
            ze zeVar2 = (ze) objArr[1];
            String str3 = (String) objArr[2];
            int i49 = f62298b;
            int i50 = i49 & 23;
            int i51 = -(-((i49 ^ 23) | i50));
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            f62297a = i52 % 128;
            int i53 = i52 % 2;
            setX(new Object[]{zbVar2, zeVar2, str3}, 318475628, -318475627, (int) System.currentTimeMillis());
            int i54 = f62298b + 79;
            f62297a = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 63 / 0;
            }
        }
        return strI;
    }
}
