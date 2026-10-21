package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8854p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(SnackbarData snackbarData) {
        super(0);
        this.f8854p0 = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f8854p0.performAction();
        return Unit.INSTANCE;
    }
}
