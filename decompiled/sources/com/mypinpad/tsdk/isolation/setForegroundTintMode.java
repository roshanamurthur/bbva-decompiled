package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setForegroundTintMode;", "", "", "setY", "()V", "", "p0", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)V", "<init>"}, k = 1, mv = {1, 5, 1})
public final class setForegroundTintMode {

    @NotNull
    public static final setForegroundTintMode INSTANCE = new setForegroundTintMode();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f59748a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59749b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59750c = 1;

    static {
        int i10 = f59749b;
        int i11 = i10 & 81;
        int i12 = (i10 | 81) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f59750c = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull String p4) {
        setX(new Object[]{p4}, 1819518050, -1819518048, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13;
        if (i18 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis() - f59748a);
            sb2.append("ms");
            String string = sb2.toString();
            int i19 = f59749b + 69;
            f59750c = i19 % 128;
            int i20 = i19 % 2;
            return string;
        }
        if (i18 == 2) {
            String str = (String) objArr[0];
            Intrinsics.checkNotNullParameter(str, "");
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            StringBuilder sb3 = new StringBuilder("Transaction timing: (");
            sb3.append((String) setX(new Object[0], 1086044370, -1086044369, (int) System.currentTimeMillis()));
            sb3.append(") ");
            sb3.append(str);
            sb3.append(' ');
            SouthPacificEndpoint.setX(new Object[]{sb3.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
            int i21 = f59749b;
            int i22 = (i21 & (-40)) | ((~i21) & 39);
            int i23 = -(-((i21 & 39) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            f59750c = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        int i26 = f59749b;
        int i27 = i26 & 29;
        int i28 = (i26 | 29) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        f59750c = i30 % 128;
        int i31 = i30 % 2;
        f59748a = System.currentTimeMillis();
        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{"Transaction timing: start transaction"}, 818541572, -818541572, (int) System.currentTimeMillis());
        int i32 = f59750c;
        int i33 = i32 | 65;
        int i34 = i33 << 1;
        int i35 = -((~(i32 & 65)) & i33);
        int i36 = (i34 & i35) + (i35 | i34);
        f59749b = i36 % 128;
        int i37 = i36 % 2;
        return null;
    }

    public static void setY() {
        setX(new Object[0], -1574302358, 1574302358, (int) System.currentTimeMillis());
    }
}
