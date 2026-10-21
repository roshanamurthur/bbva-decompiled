package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import qf.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zze implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f47590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f47591b;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f47591b = analyticsConnectorListener;
        appMeasurementSdk.registerOnMeasurementEventListener(new a(this));
        this.f47590a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f47591b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
        HashSet hashSet = this.f47590a;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            if (zzc.zzf(str) && zzc.zzg(str)) {
                String strZzd = zzc.zzd(str);
                Preconditions.checkNotNull(strZzd);
                hashSet2.add(strZzd);
            }
        }
        hashSet.addAll(hashSet2);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.f47590a.clear();
    }
}
