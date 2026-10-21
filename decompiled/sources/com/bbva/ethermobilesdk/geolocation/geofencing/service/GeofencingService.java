package com.bbva.ethermobilesdk.geolocation.geofencing.service;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeofencingService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/service/GeofencingService;", "Landroidx/core/app/JobIntentService;", "<init>", "()V", "onHandleWork", "", "intent", "Landroid/content/Intent;", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UnsafeImplicitIntentLaunch"})
@SourceDebugExtension({"SMAP\nGeofencingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeofencingService.kt\ncom/bbva/ethermobilesdk/geolocation/geofencing/service/GeofencingService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1863#2,2:38\n1#3:40\n*S KotlinDebug\n*F\n+ 1 GeofencingService.kt\ncom/bbva/ethermobilesdk/geolocation/geofencing/service/GeofencingService\n*L\n25#1:38,2\n*E\n"})
public final class GeofencingService extends JobIntentService {
    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(intent);
        if (geofencingEventFromIntent == null || geofencingEventFromIntent.hasError()) {
            return;
        }
        int geofenceTransition = geofencingEventFromIntent.getGeofenceTransition();
        ArrayList arrayList = new ArrayList();
        List<Geofence> triggeringGeofences = geofencingEventFromIntent.getTriggeringGeofences();
        if (triggeringGeofences != null) {
            Iterator<T> it = triggeringGeofences.iterator();
            while (it.hasNext()) {
                arrayList.add(((Geofence) it.next()).getRequestId());
            }
        }
        Intent intent2 = new Intent(ConstantsKt.getGEOFENCE_BROADCAST_INTENT_ACTION());
        intent2.putExtra(ConstantsKt.TRANSITION_EXTRA_ID, geofenceTransition);
        intent2.putExtra("location", geofencingEventFromIntent.getTriggeringLocation());
        intent2.putExtra(ConstantsKt.GEOFENCES_EXTRA_ID, arrayList);
        sendBroadcast(intent2);
    }
}
