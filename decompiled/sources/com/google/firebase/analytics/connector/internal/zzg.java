package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;
import qf.b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzg implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f47592a;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f47592a = analyticsConnectorListener;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f47592a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
    }
}
