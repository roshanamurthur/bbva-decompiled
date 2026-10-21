package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.kryo.serializers.e;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57341a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57342b = 1;

    @NotNull
    public static final Throwable setCompoundDrawableTintBlendMode(@NotNull Throwable th2) {
        return (Throwable) setY(new Object[]{th2}, -889189031, 889189032, (int) System.currentTimeMillis());
    }

    @Nullable
    public static final Integer setX(@NotNull Throwable th2) {
        return (Integer) setY(new Object[]{th2}, -768558198, 768558198, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0107  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        TerminalException terminalException;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
            Throwable th2 = (Throwable) objArr[0];
            int i18 = f57341a;
            int i19 = ((i18 | 35) << 1) - (i18 ^ 35);
            f57342b = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(th2, "");
            if (th2 instanceof TerminalException) {
                int i21 = f57341a;
                int i22 = ((i21 | 91) << 1) - (i21 ^ 91);
                int i23 = i22 % 128;
                f57342b = i23;
                int i24 = i22 % 2;
                terminalException = (TerminalException) th2;
                int i25 = i23 + 39;
                f57341a = i25 % 128;
                int i26 = i25 % 2;
            } else {
                int i27 = f57341a;
                int i28 = ((i27 | 125) << 1) - (i27 ^ 125);
                f57342b = i28 % 128;
                int i29 = i28 % 2;
                terminalException = null;
            }
            if (terminalException == null) {
                int i30 = f57342b;
                int i31 = ((i30 & (-74)) | ((~i30) & 73)) + ((i30 & 73) << 1);
                f57341a = i31 % 128;
                if (i31 % 2 == 0) {
                    return null;
                }
                int i32 = 79 / 0;
                return null;
            }
            int i33 = f57341a;
            int i34 = i33 & 115;
            int i35 = -(-((i33 ^ 115) | i34));
            int i36 = (i34 & i35) + (i35 | i34);
            f57342b = i36 % 128;
            if (i36 % 2 == 0) {
                terminalException.getErrorCode();
                throw null;
            }
            Integer numValueOf = Integer.valueOf(terminalException.getErrorCode());
            int i37 = f57341a + 73;
            f57342b = i37 % 128;
            int i38 = i37 % 2;
            return numValueOf;
        }
        Throwable th3 = (Throwable) objArr[0];
        while (true) {
            Intrinsics.checkNotNullParameter(th3, "");
            Throwable cause = th3.getCause();
            if (e.c(th3)) {
                int i39 = f57342b;
                int i40 = (i39 ^ 19) + ((i39 & 19) << 1);
                f57341a = i40 % 128;
                int i41 = i40 % 2;
                z10 = true;
            } else {
                int i42 = f57342b;
                int i43 = (i42 ^ 111) + ((i42 & 111) << 1);
                int i44 = i43 % 128;
                f57341a = i44;
                int i45 = i43 % 2;
                if (!(th3 instanceof SecurityException)) {
                    int i46 = ((((i44 ^ 77) | (i44 & 77)) << 1) - (~(-(((~i44) & 77) | (i44 & (-78)))))) - 1;
                    int i47 = i46 % 128;
                    f57342b = i47;
                    int i48 = i46 % 2;
                    if (!(th3 instanceof ExecutionException)) {
                        int i49 = i47 & 93;
                        int i50 = -(-(i47 | 93));
                        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                        f57341a = i51 % 128;
                        int i52 = i51 % 2;
                        z10 = false;
                    } else {
                        int i310 = f57342b;
                        int i410 = (i310 ^ 19) + ((i310 & 19) << 1);
                        f57341a = i410 % 128;
                        int i411 = i410 % 2;
                        z10 = true;
                    }
                } else {
                    int i311 = f57342b;
                    int i412 = (i311 ^ 19) + ((i311 & 19) << 1);
                    f57341a = i412 % 128;
                    int i413 = i412 % 2;
                    z10 = true;
                }
            }
            if (!z10) {
                break;
            }
            int i53 = f57341a;
            int i54 = (i53 & 63) + (i53 | 63);
            int i55 = i54 % 128;
            f57342b = i55;
            int i56 = i54 % 2;
            if (cause == null) {
                break;
            }
            int i57 = i55 & 93;
            int i58 = (~i57) & (i55 | 93);
            int i59 = -(-(i57 << 1));
            int i60 = (i58 & i59) + (i59 | i58);
            f57341a = i60 % 128;
            if (i60 % 2 != 0) {
                throw null;
            }
            int i61 = i55 ^ 51;
            int i62 = -(-((i55 & 51) << 1));
            int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
            f57341a = i63 % 128;
            int i64 = i63 % 2;
            th3 = cause;
        }
        int i65 = f57342b;
        int i66 = ((i65 | 105) << 1) - (i65 ^ 105);
        f57341a = i66 % 128;
        if (i66 % 2 != 0) {
            int i67 = 43 / 0;
        }
        return th3;
    }
}
