package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/aa;", "", "setX", "(Lcom/mypinpad/tsdk/i/aa;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class f4 extends Lambda implements Function1<aa, Unit> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55481u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ activateSession f55482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ setItemChecked f55483q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ setContentCaptureSession f55484r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ setDrawSelectorOnTop f55485s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55486t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(activateSession activatesession, setItemChecked setitemchecked, setContentCaptureSession setcontentcapturesession, setDrawSelectorOnTop setdrawselectorontop, byte[] bArr) {
        super(1);
        this.f55482p0 = activatesession;
        this.f55483q0 = setitemchecked;
        this.f55484r0 = setcontentcapturesession;
        this.f55485s0 = setdrawselectorontop;
        this.f55486t0 = bArr;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 != 1) {
            f4 f4Var = (f4) objArr[0];
            Object obj = objArr[1];
            int i20 = f55481u0;
            int i21 = ((i20 ^ 97) | (i20 & 97)) << 1;
            int i22 = -(((~i20) & 97) | (i20 & (-98)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            v0 = i23 % 128;
            aa aaVar = (aa) obj;
            Object[] objArr2 = new Object[2];
            if (i23 % 2 != 0) {
                objArr2[0] = f4Var;
                objArr2[1] = aaVar;
                a(objArr2, -1365517462, 1365517463, System.identityHashCode(f4Var));
                return Unit.INSTANCE;
            }
            objArr2[0] = f4Var;
            objArr2[1] = aaVar;
            a(objArr2, -1365517462, 1365517463, System.identityHashCode(f4Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        f4 f4Var2 = (f4) objArr[0];
        aa aaVar2 = (aa) objArr[1];
        int i24 = f55481u0;
        int i25 = i24 ^ 25;
        int i26 = (((i24 & 25) | i25) << 1) - i25;
        v0 = i26 % 128;
        int i27 = i26 % 2;
        Intrinsics.checkNotNullParameter(aaVar2, "");
        aaVar2.setY(f4Var2.f55482p0);
        aaVar2.setY(f4Var2.f55483q0);
        aaVar2.setY(f4Var2.f55484r0);
        aaVar2.setOnFocusChangeListener(f4Var2.f55485s0);
        byte[] bArr = f4Var2.f55486t0;
        if (bArr != null) {
            int i28 = f55481u0;
            int i29 = i28 & 39;
            int i30 = ((i28 ^ 39) | i29) << 1;
            int i31 = -((i28 | 39) & (~i29));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            v0 = i32 % 128;
            if (i32 % 2 == 0) {
                aaVar2.setDividerPadding(bArr);
                throw null;
            }
            aaVar2.setDividerPadding(bArr);
            int i33 = v0 + 109;
            f55481u0 = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = v0;
        int i36 = i35 & 117;
        int i37 = (i36 - (~(-(-((i35 ^ 117) | i36))))) - 1;
        f55481u0 = i37 % 128;
        int i38 = i37 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(aa aaVar) {
        return a(new Object[]{this, aaVar}, 1153536640, -1153536640, System.identityHashCode(this));
    }
}
