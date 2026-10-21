package com.mypinpad.tsdk.isolation;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "setDividerPadding", "()Ljava/util/List;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class h10 extends Lambda implements Function0<List<? extends Certificate>> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56125s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56126t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xn f56127p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ yf f56128q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ xh f56129r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(xn xnVar, yf yfVar, xh xhVar) {
        super(0);
        this.f56127p0 = xnVar;
        this.f56128q0 = yfVar;
        this.f56129r0 = xhVar;
    }

    public static /* synthetic */ List a(Object[] objArr, int i10, int i11, int i12) throws SSLPeerUnverifiedException {
        List<Certificate> dividerPadding;
        int i13 = (i11 * 399) + (i10 * 399);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        if ((((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + i13 != 1) {
            h10 h10Var = (h10) objArr[0];
            int i17 = f56126t0;
            int i18 = i17 & 69;
            int i19 = i18 + ((i17 ^ 69) | i18);
            f56125s0 = i19 % 128;
            int i20 = i19 % 2;
            dividerPadding = a(new Object[]{h10Var}, 271972071, -271972070, System.identityHashCode(h10Var));
            int i21 = f56125s0;
            int i22 = i21 & 77;
            int i23 = (i21 ^ 77) | i22;
            int i24 = (i22 & i23) + (i23 | i22);
            f56126t0 = i24 % 128;
            int i25 = i24 % 2;
        } else {
            h10 h10Var2 = (h10) objArr[0];
            int i26 = f56126t0;
            int i27 = i26 & 11;
            int i28 = (i26 | 11) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f56125s0 = i30 % 128;
            if (i30 % 2 != 0) {
                xn xnVar = h10Var2.f56127p0;
                abo aboVar = (abo) xn.setDividerPadding(new Object[]{xnVar}, 2007120285, -2007120282, System.identityHashCode(xnVar));
                Intrinsics.checkNotNull(aboVar);
                yf yfVar = h10Var2.f56128q0;
                List<? extends Certificate> list = (List) yf.setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar));
                xh xhVar = h10Var2.f56129r0;
                yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
                dividerPadding = aboVar.setDividerPadding(list, (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)));
                int i31 = 45 / 0;
            } else {
                xn xnVar2 = h10Var2.f56127p0;
                abo aboVar2 = (abo) xn.setDividerPadding(new Object[]{xnVar2}, 2007120285, -2007120282, System.identityHashCode(xnVar2));
                Intrinsics.checkNotNull(aboVar2);
                yf yfVar2 = h10Var2.f56128q0;
                List<? extends Certificate> list2 = (List) yf.setX(new Object[]{yfVar2}, 937432037, -937432031, System.identityHashCode(yfVar2));
                xh xhVar2 = h10Var2.f56129r0;
                yg ygVar2 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                dividerPadding = aboVar2.setDividerPadding(list2, (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2)));
            }
            int i32 = f56126t0;
            int i33 = (i32 & (-54)) | ((~i32) & 53);
            int i34 = (i32 & 53) << 1;
            int i35 = (i33 & i34) + (i34 | i33);
            f56125s0 = i35 % 128;
            int i36 = i35 % 2;
        }
        return dividerPadding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends Certificate> invoke() {
        return a(new Object[]{this}, 648180366, -648180366, System.identityHashCode(this));
    }
}
