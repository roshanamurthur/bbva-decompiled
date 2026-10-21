package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.util.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class LocationReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64396a = "com.salesforce.marketingcloud.LOCATION_UPDATE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f64397b = "com.salesforce.marketingcloud.GEOFENCE_TRIGGERED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f64398c = com.salesforce.marketingcloud.g.a("LocationReceiver");

    private static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 4;
            if (i10 != 4) {
                com.salesforce.marketingcloud.g.d(f64398c, "Unknown geofence transition %d", Integer.valueOf(i10));
                return -1;
            }
        }
        return i11;
    }

    public static PendingIntent b(Context context) {
        return PendingIntent.getBroadcast(context, 1, new Intent(context, (Class<?>) LocationReceiver.class).setAction(f64397b), l.b(134217728));
    }

    public static PendingIntent c(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) LocationReceiver.class).setAction(f64396a), l.b(134217728));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String str = f64398c;
        com.salesforce.marketingcloud.g.d(str, "onReceive - %s", intent.getAction());
        if (!l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
            com.salesforce.marketingcloud.g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
            return;
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals(f64397b)) {
            a(context, GeofencingEvent.fromIntent(intent));
        } else if (action.equals(f64396a)) {
            a(context, LocationResult.extractResult(intent));
        }
    }

    private static void a(Context context, GeofencingEvent geofencingEvent) {
        LocalBroadcastManager localBroadcastManager;
        Intent intentA;
        if (geofencingEvent == null) {
            com.salesforce.marketingcloud.g.d(f64398c, "Geofencing event was null.", new Object[0]);
            return;
        }
        if (geofencingEvent.hasError()) {
            String statusCodeString = GeofenceStatusCodes.getStatusCodeString(geofencingEvent.getErrorCode());
            com.salesforce.marketingcloud.g.a(f64398c, "Geofencing event contained error: %s", statusCodeString);
            localBroadcastManager = LocalBroadcastManager.getInstance(context);
            intentA = f.a(geofencingEvent.getErrorCode(), statusCodeString);
        } else {
            if (geofencingEvent.getTriggeringGeofences() == null || geofencingEvent.getTriggeringGeofences().isEmpty()) {
                com.salesforce.marketingcloud.g.a(f64398c, "GeofencingEvent without triggering geofences.", new Object[0]);
                return;
            }
            int geofenceTransition = geofencingEvent.getGeofenceTransition();
            com.salesforce.marketingcloud.g.d(f64398c, "Geofencing event transition: %d", Integer.valueOf(geofenceTransition));
            ArrayList arrayList = new ArrayList();
            for (Geofence geofence : geofencingEvent.getTriggeringGeofences()) {
                com.salesforce.marketingcloud.g.d(f64398c, "Triggered fence id: %s", geofence.getRequestId());
                arrayList.add(geofence.getRequestId());
            }
            localBroadcastManager = LocalBroadcastManager.getInstance(context);
            intentA = f.a(a(geofenceTransition), arrayList, geofencingEvent.getTriggeringLocation());
        }
        localBroadcastManager.sendBroadcast(intentA);
    }

    private static void a(Context context, LocationResult locationResult) {
        if (locationResult == null) {
            com.salesforce.marketingcloud.g.d(f64398c, "LocationResult was null.", new Object[0]);
            return;
        }
        Location lastLocation = locationResult.getLastLocation();
        if (lastLocation == null) {
            com.salesforce.marketingcloud.g.d(f64398c, "LastLocation was null.", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(f.a(lastLocation));
        }
    }

    public static boolean a(Context context) {
        return com.salesforce.marketingcloud.util.h.a(context.getPackageManager(), new Intent(context, (Class<?>) LocationReceiver.class));
    }
}
