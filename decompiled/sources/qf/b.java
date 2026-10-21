package qf;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzg f92863a;

    public b(zzg zzgVar) {
        this.f92863a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN) || !zzc.zzk(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f92863a.f47592a.onMessageTriggered(3, bundle2);
    }
}
