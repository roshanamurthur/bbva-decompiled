package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class i6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i6 f56343p0 = new i6();

    static {
        int i10 = (0 - (-94)) - 1;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            int i12 = 9 / 0;
        }
    }

    public i6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) != 1) {
            i6 i6Var = (i6) objArr[0];
            a(new Object[]{i6Var, (dc) objArr[1]}, 2061170030, -2061170029, System.identityHashCode(i6Var));
            return Unit.INSTANCE;
        }
        dc dcVar = (dc) objArr[1];
        Intrinsics.checkNotNullParameter(dcVar, "");
        dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, -1646848719, 1646848719, System.identityHashCode(this));
    }
}
