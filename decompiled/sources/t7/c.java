package t7;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: App.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f93471p0 = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Log.w("Undeliverable exception received, not sure what to do", th2.getCause());
        return Unit.INSTANCE;
    }
}
