package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/hg;", "", "setY", "(Lcom/mypinpad/tsdk/i/hg;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class m5 extends Lambda implements Function1<hg, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ gv f57046p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(gv gvVar) {
        super(1);
        this.f57046p0 = gvVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) == 1) {
            m5 m5Var = (m5) objArr[0];
            a(new Object[]{m5Var, (hg) objArr[1]}, 1873850647, -1873850647, System.identityHashCode(m5Var));
            return Unit.INSTANCE;
        }
        m5 m5Var2 = (m5) objArr[0];
        hg hgVar = (hg) objArr[1];
        Intrinsics.checkNotNullParameter(hgVar, "");
        gv gvVar = m5Var2.f57046p0;
        hg.setDividerPadding(new Object[]{hgVar, (setFitsSystemWindows) gv.setOnFocusChangeListener(new Object[]{gvVar}, 326807100, -326807083, System.identityHashCode(gvVar))}, 1090718025, -1090718022, System.identityHashCode(hgVar));
        hg.setDividerPadding(new Object[]{hgVar}, 54164532, -54164532, System.identityHashCode(hgVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(hg hgVar) {
        return a(new Object[]{this, hgVar}, -455881908, 455881909, System.identityHashCode(this));
    }
}
