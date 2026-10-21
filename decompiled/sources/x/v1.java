package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v1 f94463p0 = new v1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Throwable it = th2;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
