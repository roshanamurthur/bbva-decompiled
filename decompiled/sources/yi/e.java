package yi;

import android.location.Location;
import android.location.LocationListener;
import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.location.GeoPointKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements LocationListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<GeoPoint> f94849p0;

    public e(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f94849p0 = cancellableContinuationImpl;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Result.Companion companion = Result.INSTANCE;
        this.f94849p0.resumeWith(Result.m5535constructorimpl(GeoPointKt.mapToGeoPoint(location)));
    }
}
