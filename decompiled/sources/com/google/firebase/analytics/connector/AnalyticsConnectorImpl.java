package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile AnalyticsConnectorImpl f47579c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final AppMeasurementSdk f47580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final ConcurrentHashMap f47581b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public class a implements AnalyticsConnector.AnalyticsConnectorHandle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47582a;

        public a(String str) {
            this.f47582a = str;
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        @KeepForSdk
        public final void registerEventNames(Set<String> set) {
            AnalyticsConnectorImpl analyticsConnectorImpl = AnalyticsConnectorImpl.this;
            String str = this.f47582a;
            if (!analyticsConnectorImpl.a(str) || !str.equals(AppMeasurement.FIAM_ORIGIN) || set == null || set.isEmpty()) {
                return;
            }
            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.f47581b.get(str)).zzb(set);
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public final void unregister() {
            AnalyticsConnectorImpl analyticsConnectorImpl = AnalyticsConnectorImpl.this;
            String str = this.f47582a;
            if (analyticsConnectorImpl.a(str)) {
                ConcurrentHashMap concurrentHashMap = analyticsConnectorImpl.f47581b;
                AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = ((com.google.firebase.analytics.connector.internal.zza) concurrentHashMap.get(str)).zza();
                if (analyticsConnectorListenerZza != null) {
                    analyticsConnectorListenerZza.onMessageTriggered(0, null);
                }
                concurrentHashMap.remove(str);
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        @KeepForSdk
        public final void unregisterEventNames() {
            AnalyticsConnectorImpl analyticsConnectorImpl = AnalyticsConnectorImpl.this;
            String str = this.f47582a;
            if (analyticsConnectorImpl.a(str) && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.f47581b.get(str)).zzc();
            }
        }
    }

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f47580a = appMeasurementSdk;
        this.f47581b = new ConcurrentHashMap();
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public final boolean a(@NonNull String str) {
        if (str.isEmpty()) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.f47581b;
        return concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || zzc.zzj(str2, bundle)) {
            this.f47580a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f47580a.getConditionalUserProperties(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(zzc.zzb(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f47580a.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public Map<String, Object> getUserProperties(boolean z10) {
        return this.f47580a.getUserProperties(null, null, z10);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.zzl(str) && zzc.zzj(str2, bundle) && zzc.zzh(str, str2, bundle)) {
            zzc.zze(str, str2, bundle);
            this.f47580a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzc.zzl(str) || a(str)) {
            return null;
        }
        boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f47580a;
        if (zEquals) {
            zzgVar = new zze(appMeasurementSdk, analyticsConnectorListener);
        } else {
            zzgVar = (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
        }
        if (zzgVar == null) {
            return null;
        }
        this.f47581b.put(str, zzgVar);
        return new a(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzc.zzi(conditionalUserProperty)) {
            this.f47580a.setConditionalUserProperty(zzc.zza(conditionalUserProperty));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (zzc.zzl(str) && zzc.zzm(str, str2)) {
            this.f47580a.setUserProperty(str, str2, obj);
        }
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    @NonNull
    @RequiresPermission(allOf = {MagiskApp.INTERNET, MagiskApp.ACCESS_NETWORK_STATE, MagiskApp.WAKE_LOCK})
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp, @NonNull Context context, @NonNull Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f47579c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (f47579c == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, new Executor() { // from class: com.google.firebase.analytics.connector.zzb
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new EventHandler() { // from class: com.google.firebase.analytics.connector.zza
                                @Override // com.google.firebase.events.EventHandler
                                public final void handle(Event event) {
                                    boolean z10 = ((DataCollectionDefaultChange) event.getPayload()).enabled;
                                    synchronized (AnalyticsConnectorImpl.class) {
                                        ((AnalyticsConnectorImpl) Preconditions.checkNotNull(AnalyticsConnectorImpl.f47579c)).f47580a.zza(z10);
                                    }
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        f47579c = new AnalyticsConnectorImpl(zzee.zzg(context, null, null, null, bundle).zzd());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47579c;
    }
}
