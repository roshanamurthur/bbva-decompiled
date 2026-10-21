package j7;

import com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionStorageActivity;
import com.google.android.gms.location.LocationAvailability;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f78796p0;

    public /* synthetic */ a(int i10) {
        this.f78796p0 = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78796p0) {
            case 0:
                LocationGooglePlayServicesProvider.Companion companion = LocationGooglePlayServicesProvider.Companion;
                LoggerKt.log("Is Location Available ?? " + ((LocationAvailability) obj).isLocationAvailable());
                return Unit.INSTANCE;
            default:
                return PermissionStorageActivity.onRequestPermissionsResult$lambda$0(((Boolean) obj).booleanValue());
        }
    }
}
