package yi;

import android.location.LocationListener;
import android.location.LocationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LocationManager f94847p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LocationListener f94848q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LocationManager locationManager, e eVar) {
        super(1);
        this.f94847p0 = locationManager;
        this.f94848q0 = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f94847p0.removeUpdates(this.f94848q0);
        return Unit.INSTANCE;
    }
}
