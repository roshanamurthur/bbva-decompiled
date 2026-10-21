package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57789a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57790b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        qh qhVar = (qh) objArr[0];
        qs qsVar = (qs) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i13 = f57790b;
        int i14 = i13 & 81;
        int i15 = (i14 - (~(-(-((i13 ^ 81) | i14))))) - 1;
        f57789a = i15 % 128;
        if (i15 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qhVar, "");
            Intrinsics.checkNotNullParameter(qsVar, "");
            Intrinsics.checkNotNullParameter(function0, "");
            boolean z10 = qhVar instanceof qd;
            throw null;
        }
        Intrinsics.checkNotNullParameter(qhVar, "");
        Intrinsics.checkNotNullParameter(qsVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (qhVar instanceof qd) {
            int i16 = f57790b;
            int i17 = (i16 & 1) + (i16 | 1);
            f57789a = i17 % 128;
            int i18 = i17 % 2;
            if (qsVar == qs.setCompoundDrawableTintBlendMode) {
                int i19 = f57789a;
                int i20 = i19 & 51;
                int i21 = -(-((i19 ^ 51) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = i22 % 128;
                f57790b = i23;
                int i24 = i22 % 2;
                int i25 = (((i23 | 47) << 1) - (~(-(((~i23) & 47) | (i23 & (-48)))))) - 1;
                f57789a = i25 % 128;
                int i26 = i25 % 2;
            } else {
                qhVar = (qh) function0.invoke();
                int i27 = f57790b;
                int i28 = i27 & 69;
                int i29 = ((i27 ^ 69) | i28) << 1;
                int i30 = -((i27 | 69) & (~i28));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f57789a = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 27 / 0;
                }
            }
        } else {
            if (!(qhVar instanceof qf)) {
                throw new NoWhenBranchMatchedException();
            }
            int i33 = f57790b;
            int i34 = i33 & 53;
            int i35 = ((i33 ^ 53) | i34) << 1;
            int i36 = -((i33 | 53) & (~i34));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            f57789a = i37 % 128;
            int i38 = i37 % 2;
            if (qsVar == qs.setY) {
                int i39 = f57790b;
                int i40 = i39 & 91;
                int i41 = (i40 - (~(-(-((i39 ^ 91) | i40))))) - 1;
                f57789a = i41 % 128;
                int i42 = i41 % 2;
                mu.setCompoundDrawableTintBlendMode(new Object[]{170004, null, null, 6}, -1968587119, 1968587120, 170004);
                qhVar = (qh) function0.invoke();
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i43 = ~iCurrentTimeMillis;
                int i44 = i43 & (-1320649402);
                int i45 = (~i44) & (i43 | (-1320649402));
                int i46 = (i44 & i45) | (i45 ^ i44);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = ((~i48) & (-69313197)) | (i48 & 69313196);
                int i50 = i48 & (-69313197);
                int i51 = 2016138509 - (~(((i50 & i49) | (i49 ^ i50)) * (-1042)));
                int i52 = (-1320649402) ^ iCurrentTimeMillis;
                int i53 = (-1320649402) & iCurrentTimeMillis;
                int i54 = ((i52 & i53) | (i52 ^ i53)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i55 = i51 ^ i54;
                int i56 = (((i54 & i51) | i55) << 1) - i55;
                int i57 = ~((iCurrentTimeMillis & 69313196) | (69313196 ^ iCurrentTimeMillis));
                int i58 = (-1320657598) ^ i57;
                int i59 = i57 & (-1320657598);
                int i60 = (i59 & i58) | (i58 ^ i59);
                int i61 = i43 ^ (-69313197);
                int i62 = i43 & (-69313197);
                int i63 = (i62 & i61) | (i61 ^ i62);
                int i64 = (i63 & (-1320649402)) | (i63 ^ (-1320649402));
                int i65 = ~i64;
                int i66 = (i64 | i65) & i65;
                int i67 = ((~i66) & i60) | ((~i60) & i66);
                int i68 = i60 & i66;
                int i69 = -(-(((i68 & i67) | (i67 ^ i68)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i70 = ((i56 | i69) << 1) - ((i69 & (~i56)) | ((~i69) & i56));
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i71 = (-1870991448) ^ iCurrentTimeMillis2;
                int i72 = ~iCurrentTimeMillis2;
                int i73 = (-1870991448) & iCurrentTimeMillis2;
                int i74 = ((~((i73 & i71) | (i71 ^ i73))) | 1077701131) * (-366);
                int i75 = 897154732 & i74;
                int i76 = -(-((i74 ^ 897154732) | i75));
                int i77 = (i75 & i76) + (i76 | i75);
                int i78 = (i72 & (-796987477)) | (796987476 & iCurrentTimeMillis2);
                int i79 = iCurrentTimeMillis2 & (-796987477);
                int i80 = ~((i79 & i78) | (i78 ^ i79));
                int i81 = 3697160 & i80;
                int i82 = (i80 | 3697160) & (~i81);
                if (i70 > (i77 - (~(((i82 & i81) | (i82 ^ i81)) * 366))) - 1) {
                    throw null;
                }
            } else {
                int i83 = f57790b;
                int i84 = i83 ^ 3;
                int i85 = (((i83 & 3) | i84) << 1) - i84;
                f57789a = i85 % 128;
                int i86 = i85 % 2;
            }
        }
        return qhVar;
    }

    @NotNull
    public static final qh setY(@NotNull qh qhVar, @NotNull qs qsVar, @NotNull Function0<? extends qh> function0) {
        return (qh) setCompoundDrawableTintBlendMode(new Object[]{qhVar, qsVar, function0}, -247485112, 247485112, (int) System.currentTimeMillis());
    }
}
