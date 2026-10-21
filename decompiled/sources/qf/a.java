package qf;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zze f92862a;

    public a(zze zzeVar) {
        this.f92862a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        zze zzeVar = this.f92862a;
        if (zzeVar.f47590a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.zzc(str2));
            zzeVar.f47591b.onMessageTriggered(2, bundle2);
        }
    }
}
