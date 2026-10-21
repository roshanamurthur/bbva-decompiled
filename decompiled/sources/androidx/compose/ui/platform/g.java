package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f17403p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0 f17404q0;

    public /* synthetic */ g(int i10, Function0 function0) {
        this.f17403p0 = i10;
        this.f17404q0 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17403p0;
        Function0 tmp0 = this.f17404q0;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
        }
    }
}
