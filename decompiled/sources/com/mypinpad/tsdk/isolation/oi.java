package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class oi implements nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f57514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sd f57515b;

    public oi(@NotNull Context context, @NotNull sd sdVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sdVar, "");
        this.f57514a = context;
        this.f57515b = sdVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i19 = i10 | i17;
        if ((((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18 != 1) {
            oi oiVar = (oi) objArr[0];
            return (tl) setDividerPadding(new Object[]{oiVar, (tp) objArr[1], (tt) objArr[2]}, -1432628721, 1432628722, System.identityHashCode(oiVar));
        }
        oi oiVar2 = (oi) objArr[0];
        tp tpVar = (tp) objArr[1];
        tt ttVar = (tt) objArr[2];
        Intrinsics.checkNotNullParameter(tpVar, "");
        Intrinsics.checkNotNullParameter(ttVar, "");
        return new tl(oiVar2.f57514a, oiVar2.f57515b, tpVar, ttVar);
    }

    @Override // com.mypinpad.tsdk.isolation.nv
    public final /* synthetic */ tn setOnFocusChangeListener(tp tpVar, tt ttVar) {
        return (tn) setDividerPadding(new Object[]{this, tpVar, ttVar}, -969695734, 969695734, System.identityHashCode(this));
    }
}
