package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class u00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61223s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61224t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xc f61225p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<TransactionResult, Unit> f61226q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ rs f61227r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u00(xc xcVar, Function1<? super TransactionResult, Unit> function1, rs rsVar) {
        super(0);
        this.f61225p0 = xcVar;
        this.f61226q0 = function1;
        this.f61227r0 = rsVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        if ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13 == 1) {
            u00 u00Var = (u00) objArr[0];
            int i20 = f61223s0;
            int i21 = i20 & 1;
            int i22 = -(-((i20 ^ 1) | i21));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f61224t0 = i23 % 128;
            int i24 = i23 % 2;
            a(new Object[]{u00Var}, -821429237, 821429237, System.identityHashCode(u00Var));
            Unit unit = Unit.INSTANCE;
            int i25 = f61224t0;
            int i26 = ((((i25 ^ 115) | (i25 & 115)) << 1) - (~(-(((~i25) & 115) | (i25 & (-116)))))) - 1;
            f61223s0 = i26 % 128;
            int i27 = i26 % 2;
            return unit;
        }
        u00 u00Var2 = (u00) objArr[0];
        int i28 = f61223s0;
        int i29 = i28 & 57;
        int i30 = (i28 | 57) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        f61224t0 = i32 % 128;
        int i33 = i32 % 2;
        boolean z10 = !((AtomicBoolean) xc.setX(new Object[]{u00Var2.f61225p0}, -1122694538, 1122694545, (int) System.currentTimeMillis())).getAndSet(true);
        rs rsVar = u00Var2.f61227r0;
        if (z10) {
            int i34 = f61223s0;
            int i35 = i34 & 21;
            int i36 = (i34 ^ 21) | i35;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f61224t0 = i37 % 128;
            int i38 = i37 % 2;
            u00Var2.f61226q0.invoke(rx.setDividerPadding(rsVar));
            int i39 = f61223s0;
            int i40 = (i39 & (-74)) | ((~i39) & 73);
            int i41 = (i39 & 73) << 1;
            int i42 = (i40 & i41) + (i41 | i40);
            f61224t0 = i42 % 128;
            int i43 = i42 % 2;
        }
        if (!(!((Boolean) mi.setX(new Object[]{rsVar}, 1163131396, -1163131394, (int) System.currentTimeMillis())).booleanValue())) {
            int i44 = f61223s0;
            int i45 = i44 & 1;
            int i46 = (i44 | 1) & (~i45);
            int i47 = i45 << 1;
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            f61224t0 = i48 % 128;
            int i49 = i48 % 2;
            MainProcessManager mainProcessManager = MainProcessManager.setX;
            MainProcessManager.setX(new Object[]{mainProcessManager}, 1296257365, -1296257351, System.identityHashCode(mainProcessManager));
            int i50 = f61224t0;
            int i51 = i50 & 9;
            int i52 = (((i50 ^ 9) | i51) << 1) - ((i50 | 9) & (~i51));
            f61223s0 = i52 % 128;
            int i53 = i52 % 2;
        }
        int i54 = f61223s0;
        int i55 = i54 & 19;
        int i56 = (i54 ^ 19) | i55;
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        f61224t0 = i57 % 128;
        if (i57 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 306203997, -306203996, System.identityHashCode(this));
    }
}
