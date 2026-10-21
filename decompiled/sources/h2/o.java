package h2;

import android.content.Context;
import android.location.GnssStatus;
import android.util.Log;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import com.facetec.sdk.bz;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.t;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69289p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69290q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69291r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f69292s0;

    public /* synthetic */ o(Object obj, Object obj2, int i10, Object obj3) {
        this.f69289p0 = i10;
        this.f69290q0 = obj;
        this.f69291r0 = obj2;
        this.f69292s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f69289p0) {
            case 0:
                LocationManagerCompat.n nVar = (LocationManagerCompat.n) this.f69290q0;
                Executor executor = (Executor) this.f69291r0;
                GnssStatus gnssStatus = (GnssStatus) this.f69292s0;
                if (nVar.f19970b == executor) {
                    nVar.f19969a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
                    break;
                }
                break;
            case 1:
                ((bz) this.f69290q0).a((Context) this.f69291r0, (JSONObject) this.f69292s0);
                break;
            case 2:
                t tVar = (t) this.f69290q0;
                tVar.f49195e.a(this.f69291r0, (StorageTask.ProvideError) this.f69292s0);
                break;
            default:
                String tag = (String) this.f69290q0;
                String format = (String) this.f69291r0;
                Object[] arg = (Object[]) this.f69292s0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(format, "$format");
                Intrinsics.checkNotNullParameter(arg, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Log.w(tag, str);
                break;
        }
    }
}
