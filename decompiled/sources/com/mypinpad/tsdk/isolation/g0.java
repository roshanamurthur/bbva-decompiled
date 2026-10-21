package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements aco {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55588r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55589s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final OutputStream f55590p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final acq f55591q0;

    public g0(@NotNull OutputStream outputStream, @NotNull h0 h0Var) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(h0Var, "");
        this.f55590p0 = outputStream;
        this.f55591q0 = h0Var;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11) throws IOException {
        int i12 = ~i11;
        int i13 = (((~i10) | i12) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i12) * (-824)) + (i11 * 825) + (i10 * 1649);
        int i14 = 2;
        if (i13 != 1) {
            if (i13 == 2) {
                g0 g0Var = (g0) objArr[0];
                int i15 = f55588r0;
                int i16 = ((i15 & 21) - (~(-(-(i15 | 21))))) - 1;
                f55589s0 = i16 % 128;
                if (i16 % 2 != 0) {
                    return g0Var.f55591q0;
                }
                acq acqVar = g0Var.f55591q0;
                throw null;
            }
            if (i13 == 3) {
                g0 g0Var2 = (g0) objArr[0];
                int i17 = f55589s0 + 49;
                f55588r0 = i17 % 128;
                int i18 = i17 % 2;
                g0Var2.f55590p0.flush();
                int i19 = f55588r0;
                int i20 = i19 & 43;
                int i21 = (i19 ^ 43) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f55589s0 = i22 % 128;
                if (i22 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (i13 != 4) {
                g0 g0Var3 = (g0) objArr[0];
                StringBuilder sb2 = new StringBuilder("sink(");
                sb2.append(g0Var3.f55590p0);
                sb2.append(RootService.CLOSE_BRACKET);
                String string = sb2.toString();
                int i23 = f55588r0;
                int i24 = ((i23 & (-48)) | ((~i23) & 47)) + ((i23 & 47) << 1);
                f55589s0 = i24 % 128;
                int i25 = i24 % 2;
                return string;
            }
            g0 g0Var4 = (g0) objArr[0];
            int i26 = f55588r0;
            int i27 = i26 & 81;
            int i28 = (((i26 | 81) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
            f55589s0 = i28 % 128;
            int i29 = i28 % 2;
            g0Var4.f55590p0.close();
            int i30 = f55588r0;
            int i31 = i30 & 43;
            int i32 = ((i30 ^ 43) | i31) << 1;
            int i33 = -((i30 | 43) & (~i31));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f55589s0 = i34 % 128;
            int i35 = i34 % 2;
            return null;
        }
        g0 g0Var5 = (g0) objArr[0];
        abx abxVar = (abx) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i36 = f55588r0;
        int i37 = i36 & 65;
        int i38 = (((i36 ^ 65) | i37) << 1) - ((i36 | 65) & (~i37));
        f55589s0 = i38 % 128;
        int i39 = i38 % 2;
        Intrinsics.checkNotNullParameter(abxVar, "");
        acv.setOnFocusChangeListener(new Object[]{Long.valueOf(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue()), 0L, Long.valueOf(jLongValue)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
        int i40 = f55588r0;
        int i41 = i40 & 59;
        int i42 = (((i40 | 59) & (~i41)) - (~(-(-(i41 << 1))))) - 1;
        f55589s0 = i42 % 128;
        int i43 = i42 % 2;
        for (long j10 = 0; jLongValue > j10; j10 = 0) {
            int i44 = f55588r0 + 43;
            f55589s0 = i44 % 128;
            int i45 = i44 % i14;
            g0Var5.f55591q0.getNavBarTitleString();
            acj acjVar = abxVar.setDividerPadding;
            Intrinsics.checkNotNull(acjVar);
            int iMin = (int) Math.min(jLongValue, (acjVar.setX - (~(-acjVar.setCompoundDrawableTintBlendMode))) - 1);
            g0Var5.f55590p0.write(acjVar.setOnFocusChangeListener, acjVar.setCompoundDrawableTintBlendMode, iMin);
            int i46 = acjVar.setCompoundDrawableTintBlendMode;
            int iIdentityHashCode = System.identityHashCode(g0Var5);
            int i47 = iMin * 483;
            int i48 = -(~(-(-(i46 * 242))));
            int i49 = ((i47 & i48) + (i47 | i48)) - 1;
            int i50 = ~iMin;
            int i51 = ~i46;
            int i52 = i51 & (i51 | i46);
            int i53 = ((~i52) & i50) | ((~i50) & i52);
            int i54 = i52 & i50;
            int i55 = ~((i54 & i53) | (i53 ^ i54));
            int i56 = (i50 | iMin) & i50;
            int i57 = ~iIdentityHashCode;
            int i58 = ((~i57) & i56) | ((~i56) & i57);
            int i59 = i56 & i57;
            int i60 = ~((i59 & i58) | (i58 ^ i59));
            int i61 = ((~i60) & i55) | ((~i55) & i60);
            int i62 = i55 & i60;
            int i63 = -(-(((i62 & i61) | (i61 ^ i62)) * (-241)));
            int i64 = i49 & i63;
            int i65 = (i49 ^ i63) | i64;
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            int i67 = iMin & i46;
            int i68 = (~i67) & (iMin | i46);
            int i69 = -(-(((i67 & i68) | (i68 ^ i67)) * (-482)));
            int i70 = i66 & i69;
            int i71 = (((i69 | i66) & (~i70)) - (~(-(-(i70 << 1))))) - 1;
            int i72 = ~((i51 ^ iMin) | (i51 & iMin));
            int i73 = i50 & i57;
            int i74 = ((i57 | i50) & (~i73)) | i73;
            int i75 = (i74 & i51) | ((~i74) & i46);
            int i76 = i46 & i74;
            int i77 = ~((i76 & i75) | (i75 ^ i76));
            int i78 = i72 & i77;
            int i79 = (i72 | i77) & (~i78);
            int i80 = -(-(((i79 & i78) | (i79 ^ i78)) * 241));
            acjVar.setCompoundDrawableTintBlendMode = ((i71 | i80) << 1) - (i71 ^ i80);
            long j11 = iMin;
            jLongValue -= j11;
            abxVar.setX(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - j11);
            if (acjVar.setCompoundDrawableTintBlendMode == acjVar.setX) {
                int i81 = f55588r0;
                int i82 = ((i81 | 113) << 1) - (((~i81) & 113) | (i81 & (-114)));
                f55589s0 = i82 % 128;
                int i83 = i82 % 2;
                abxVar.setDividerPadding = (acj) acj.setX(new Object[]{acjVar}, -1022523986, 1022523990, System.identityHashCode(acjVar));
                ack.setY(new Object[]{acjVar}, -2008837629, 2008837630, (int) System.currentTimeMillis());
                int i84 = f55588r0;
                int i85 = (((i84 | 60) << 1) - (i84 ^ 60)) - 1;
                f55589s0 = i85 % 128;
                int i86 = i85 % 2;
            }
            i14 = 2;
        }
        int i87 = f55589s0;
        int i88 = i87 & 63;
        int i89 = ((((i87 ^ 63) | i88) << 1) - (~(-((i87 | 63) & (~i88))))) - 1;
        f55588r0 = i89 % 128;
        if (i89 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        System.identityHashCode(this);
        a(new Object[]{this}, -2131465009, 2131465013);
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    public final void flush() throws IOException {
        System.identityHashCode(this);
        a(new Object[]{this}, 393947385, -393947382);
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    public final void setDividerPadding(@NotNull abx abxVar, long j10) throws IOException {
        Object[] objArr = {this, abxVar, Long.valueOf(j10)};
        System.identityHashCode(this);
        a(objArr, 1835902745, -1835902744);
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    @NotNull
    public final acq setY() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return (acq) a(objArr, -502858829, 502858831);
    }

    @NotNull
    public final String toString() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return (String) a(objArr, -911297157, 911297157);
    }
}
