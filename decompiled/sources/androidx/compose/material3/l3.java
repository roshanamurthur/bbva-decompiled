package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends Lambda implements Function1<l0.w1<SnackbarData>, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f12979p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(SnackbarData snackbarData) {
        super(1);
        this.f12979p0 = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(l0.w1<SnackbarData> w1Var) {
        l0.w1<SnackbarData> it = w1Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.f83019a, this.f12979p0));
    }
}
