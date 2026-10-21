package j7;

import com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocationGooglePlayServicesProvider.Companion companion = LocationGooglePlayServicesProvider.INSTANCE;
        LoggerKt.log("Request location updates success!");
        return Unit.INSTANCE;
    }
}
