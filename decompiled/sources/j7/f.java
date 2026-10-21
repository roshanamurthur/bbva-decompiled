package j7;

import android.location.Location;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider;
import com.bbva.plugin.geolocation.common.ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f78802p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f78803q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f78802p0 = i10;
        this.f78803q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f78802p0;
        Object obj2 = this.f78803q0;
        switch (i10) {
            case 0:
                LocationManagerProvider locationManagerProvider = (LocationManagerProvider) obj2;
                Location location = (Location) obj;
                if (location != null) {
                    locationManagerProvider.f29858q0.tryEmit(new Result.Success(location));
                } else {
                    locationManagerProvider.f29858q0.tryEmit(new Result.Error(new Throwable("Failed to get location")));
                }
                break;
            default:
                ((CommandCallback) obj2).sendEvent(ExtensionsKt.toJson((Location) obj));
                break;
        }
        return Unit.INSTANCE;
    }
}
