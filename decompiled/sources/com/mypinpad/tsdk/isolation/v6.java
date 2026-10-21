package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setX", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class v6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v6 f61461p0 = new v6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61462q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61463r0 = 1;

    static {
        int i10 = f61462q0;
        int i11 = i10 ^ 81;
        int i12 = (((i10 & 81) | i11) << 1) - i11;
        f61463r0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public v6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 399) + (i10 * 399);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        if ((((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + i13 != 1) {
            dc dcVar = (dc) objArr[1];
            int i17 = f61462q0;
            int i18 = (i17 & 21) + (i17 | 21);
            f61463r0 = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
                return null;
            }
            Intrinsics.checkNotNullParameter(dcVar, "");
            dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
            throw null;
        }
        v6 v6Var = (v6) objArr[0];
        Object obj = objArr[1];
        int i19 = f61463r0;
        int i20 = i19 & 21;
        int i21 = (i19 ^ 21) | i20;
        int i22 = (i20 & i21) + (i21 | i20);
        f61462q0 = i22 % 128;
        dc dcVar2 = (dc) obj;
        if (i22 % 2 != 0) {
            a(new Object[]{v6Var, dcVar2}, -241068305, 241068305, System.identityHashCode(v6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{v6Var, dcVar2}, -241068305, 241068305, System.identityHashCode(v6Var));
        Unit unit2 = Unit.INSTANCE;
        int i23 = f61463r0;
        int i24 = (i23 ^ 25) + ((i23 & 25) << 1);
        f61462q0 = i24 % 128;
        if (i24 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, -1649877263, 1649877264, System.identityHashCode(this));
    }
}
