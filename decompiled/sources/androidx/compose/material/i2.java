package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8506p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(SnackbarData snackbarData) {
        super(0);
        this.f8506p0 = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f8506p0.dismiss();
        return Boolean.TRUE;
    }
}
