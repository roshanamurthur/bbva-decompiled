package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class g4 extends Lambda implements Function1<af, Unit> {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f55617y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ex f55618p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ activateSession f55619q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ValueQualifier f55620r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55621s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f55622t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55623u0;
    public final /* synthetic */ byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ setSelector f55624w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55625x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(ex exVar, activateSession activatesession, ValueQualifier valueQualifier, byte[] bArr, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, byte[] bArr2, byte[] bArr3, setSelector setselector, byte[] bArr4) {
        super(1);
        this.f55618p0 = exVar;
        this.f55619q0 = activatesession;
        this.f55620r0 = valueQualifier;
        this.f55621s0 = bArr;
        this.f55622t0 = setscrollbardefaultdelaybeforefade;
        this.f55623u0 = bArr2;
        this.v0 = bArr3;
        this.f55624w0 = setselector;
        this.f55625x0 = bArr4;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        if ((((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13 != 1) {
            g4 g4Var = (g4) objArr[0];
            af afVar = (af) objArr[1];
            int i16 = E0;
            int i17 = (i16 & 97) + (i16 | 97);
            f55617y0 = i17 % 128;
            if (i17 % 2 == 0) {
                Intrinsics.checkNotNullParameter(afVar, "");
                ex exVar = g4Var.f55618p0;
                ex.setCompoundDrawableTintBlendMode(new Object[]{afVar, g4Var.f55619q0, g4Var.f55620r0, g4Var.f55621s0, g4Var.f55622t0, g4Var.f55623u0, g4Var.v0, g4Var.f55624w0, g4Var.f55625x0}, 1821125843, -1821125825, (int) System.currentTimeMillis());
                return null;
            }
            Intrinsics.checkNotNullParameter(afVar, "");
            ex exVar2 = g4Var.f55618p0;
            ex.setCompoundDrawableTintBlendMode(new Object[]{afVar, g4Var.f55619q0, g4Var.f55620r0, g4Var.f55621s0, g4Var.f55622t0, g4Var.f55623u0, g4Var.v0, g4Var.f55624w0, g4Var.f55625x0}, 1821125843, -1821125825, (int) System.currentTimeMillis());
            throw null;
        }
        g4 g4Var2 = (g4) objArr[0];
        Object obj = objArr[1];
        int i18 = E0;
        int i19 = i18 ^ 95;
        int i20 = (i18 & 95) << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        f55617y0 = i21 % 128;
        int i22 = i21 % 2;
        a(new Object[]{g4Var2, (af) obj}, -34069548, 34069548, System.identityHashCode(g4Var2));
        Unit unit = Unit.INSTANCE;
        int i23 = f55617y0;
        int i24 = i23 | 101;
        int i25 = (i24 << 1) - ((~(i23 & 101)) & i24);
        E0 = i25 % 128;
        int i26 = i25 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(af afVar) {
        return a(new Object[]{this, afVar}, 724906124, -724906123, System.identityHashCode(this));
    }
}
