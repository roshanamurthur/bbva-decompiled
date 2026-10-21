package yi;

import android.location.Location;
import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.location.GeoPointKt;
import java.util.function.Consumer;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b<T> implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<GeoPoint> f94845p0;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f94845p0 = cancellableContinuationImpl;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Location location = (Location) obj;
        CancellableContinuation<GeoPoint> cancellableContinuation = this.f94845p0;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m5535constructorimpl(location != null ? GeoPointKt.mapToGeoPoint(location) : null));
    }
}
