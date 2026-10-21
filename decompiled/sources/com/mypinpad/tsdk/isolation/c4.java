package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/aa;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/aa;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class c4 extends Lambda implements Function1<aa, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54769q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54770r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ f f54771p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(f fVar) {
        super(1);
        this.f54771p0 = fVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        if ((((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661)) == 1) {
            c4 c4Var = (c4) objArr[0];
            Object obj = objArr[1];
            int i16 = f54769q0;
            int i17 = (i16 & 3) + (i16 | 3);
            f54770r0 = i17 % 128;
            int i18 = i17 % 2;
            a(new Object[]{c4Var, (aa) obj}, -1578755614, 1578755614, System.identityHashCode(c4Var));
            Unit unit = Unit.INSTANCE;
            int i19 = f54770r0;
            int i20 = ((i19 | 57) << 1) - (((~i19) & 57) | (i19 & (-58)));
            f54769q0 = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        c4 c4Var2 = (c4) objArr[0];
        aa aaVar = (aa) objArr[1];
        System.identityHashCode(c4Var2);
        System.identityHashCode(c4Var2);
        Intrinsics.checkNotNullParameter(aaVar, "");
        f fVar = c4Var2.f54771p0;
        aaVar.setY((setItemChecked) f.setOnFocusChangeListener(new Object[]{fVar}, -507364128, 507364135, System.identityHashCode(fVar)));
        f fVar2 = c4Var2.f54771p0;
        aaVar.setY((setContentCaptureSession) f.setOnFocusChangeListener(new Object[]{fVar2}, 1210785074, -1210785072, System.identityHashCode(fVar2)));
        aaVar.setOnFocusChangeListener((setDrawSelectorOnTop) f.setOnFocusChangeListener(new Object[]{fVar2}, -1978094169, 1978094175, System.identityHashCode(fVar2)));
        aaVar.setDividerPadding((byte[]) f.setOnFocusChangeListener(new Object[]{fVar2}, -78406851, 78406855, System.identityHashCode(fVar2)));
        aaVar.setY((activateSession) f.setOnFocusChangeListener(new Object[]{fVar2}, -637740939, 637740939, System.identityHashCode(fVar2)));
        int i22 = f54770r0;
        int i23 = i22 & 65;
        int i24 = ((i22 | 65) & (~i23)) + (i23 << 1);
        f54769q0 = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(aa aaVar) {
        return a(new Object[]{this, aaVar}, 2058492209, -2058492208, System.identityHashCode(this));
    }
}
