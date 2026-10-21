package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends Lambda implements Function1<h0.e1<SnackbarData>, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8812p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(SnackbarData snackbarData) {
        super(1);
        this.f8812p0 = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(h0.e1<SnackbarData> e1Var) {
        h0.e1<SnackbarData> it = e1Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.f68729a, this.f8812p0));
    }
}
