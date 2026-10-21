package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/hg;", "", "setX", "(Lcom/mypinpad/tsdk/i/hg;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class n5 extends Lambda implements Function1<hg, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57199q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57200r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ gv f57201p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(gv gvVar) {
        super(1);
        this.f57201p0 = gvVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        if ((((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13 != 1) {
            n5 n5Var = (n5) objArr[0];
            Object obj = objArr[1];
            int i15 = f57199q0;
            int i16 = ((i15 & (-2)) | ((~i15) & 1)) + ((i15 & 1) << 1);
            f57200r0 = i16 % 128;
            int i17 = i16 % 2;
            a(new Object[]{n5Var, (hg) obj}, 1747206938, -1747206937, System.identityHashCode(n5Var));
            Unit unit = Unit.INSTANCE;
            int i18 = f57199q0;
            int i19 = (i18 ^ 109) + ((i18 & 109) << 1);
            f57200r0 = i19 % 128;
            if (i19 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        n5 n5Var2 = (n5) objArr[0];
        hg hgVar = (hg) objArr[1];
        int i20 = f57200r0;
        int i21 = (i20 & 119) + (i20 | 119);
        f57199q0 = i21 % 128;
        if (i21 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hgVar, "");
            gv gvVar = n5Var2.f57201p0;
            hg.setDividerPadding(new Object[]{hgVar, (setFitsSystemWindows) gv.setOnFocusChangeListener(new Object[]{gvVar}, 326807100, -326807083, System.identityHashCode(gvVar))}, 1090718025, -1090718022, System.identityHashCode(hgVar));
            return null;
        }
        Intrinsics.checkNotNullParameter(hgVar, "");
        gv gvVar2 = n5Var2.f57201p0;
        hg.setDividerPadding(new Object[]{hgVar, (setFitsSystemWindows) gv.setOnFocusChangeListener(new Object[]{gvVar2}, 326807100, -326807083, System.identityHashCode(gvVar2))}, 1090718025, -1090718022, System.identityHashCode(hgVar));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(hg hgVar) {
        return a(new Object[]{this, hgVar}, 2107620836, -2107620836, System.identityHashCode(this));
    }
}
