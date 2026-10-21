package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setX", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class i4 extends Lambda implements Function1<af, Unit> {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f56331y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ex f56332p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ activateSession f56333q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ValueQualifier f56334r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ byte[] f56335s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f56336t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ byte[] f56337u0;
    public final /* synthetic */ byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ setSelector f56338w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ byte[] f56339x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(ex exVar, activateSession activatesession, ValueQualifier valueQualifier, byte[] bArr, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, byte[] bArr2, byte[] bArr3, setSelector setselector, byte[] bArr4) {
        super(1);
        this.f56332p0 = exVar;
        this.f56333q0 = activatesession;
        this.f56334r0 = valueQualifier;
        this.f56335s0 = bArr;
        this.f56336t0 = setscrollbardefaultdelaybeforefade;
        this.f56337u0 = bArr2;
        this.v0 = bArr3;
        this.f56338w0 = setselector;
        this.f56339x0 = bArr4;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        if ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14 != 1) {
            i4 i4Var = (i4) objArr[0];
            af afVar = (af) objArr[1];
            int i18 = f56331y0;
            int i19 = (i18 ^ 3) + ((i18 & 3) << 1);
            E0 = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(afVar, "");
            ex exVar = i4Var.f56332p0;
            ex.setCompoundDrawableTintBlendMode(new Object[]{afVar, i4Var.f56333q0, i4Var.f56334r0, i4Var.f56335s0, i4Var.f56336t0, i4Var.f56337u0, i4Var.v0, i4Var.f56338w0, i4Var.f56339x0}, 1821125843, -1821125825, (int) System.currentTimeMillis());
            int i21 = f56331y0;
            int i22 = (i21 ^ 97) + ((i21 & 97) << 1);
            E0 = i22 % 128;
            if (i22 % 2 != 0) {
                return null;
            }
            throw null;
        }
        i4 i4Var2 = (i4) objArr[0];
        Object obj = objArr[1];
        int i23 = f56331y0 + 23;
        E0 = i23 % 128;
        int i24 = i23 % 2;
        a(new Object[]{i4Var2, (af) obj}, -465045938, 465045938, System.identityHashCode(i4Var2));
        Unit unit = Unit.INSTANCE;
        int i25 = E0;
        int i26 = (i25 & (-122)) | ((~i25) & 121);
        int i27 = -(-((i25 & 121) << 1));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        f56331y0 = i28 % 128;
        if (i28 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(af afVar) {
        return a(new Object[]{this, afVar}, 1238720888, -1238720887, System.identityHashCode(this));
    }
}
