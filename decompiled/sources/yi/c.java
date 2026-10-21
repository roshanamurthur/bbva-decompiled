package yi;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f94846p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CancellationSignal cancellationSignal) {
        super(1);
        this.f94846p0 = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f94846p0.cancel();
        return Unit.INSTANCE;
    }
}
