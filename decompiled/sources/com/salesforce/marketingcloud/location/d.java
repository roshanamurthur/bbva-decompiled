package com.salesforce.marketingcloud.location;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class d implements OnFailureListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f64413e = com.salesforce.marketingcloud.g.a("GmsLocationProvider");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f64415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f64416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f64417d;

    public class a implements OnCompleteListener<Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Void> task) {
            com.salesforce.marketingcloud.g.d(d.f64413e, "Location request completed.", new Object[0]);
            d.this.f64415b = false;
        }
    }

    public class b implements OnCompleteListener<Void> {
        public b() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Void> task) {
            com.salesforce.marketingcloud.g.d(d.f64413e, "Add Geofences request completed.", new Object[0]);
        }
    }

    public d(Context context) throws IllegalStateException {
        this.f64414a = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        this.f64416c = iIsGooglePlayServicesAvailable;
        this.f64417d = googleApiAvailability.getErrorString(iIsGooglePlayServicesAvailable);
        int i10 = this.f64416c;
        if (i10 == 0 || googleApiAvailability.isUserResolvableError(i10)) {
            return;
        }
        int i11 = this.f64416c;
        throw new g(i11, googleApiAvailability.getErrorString(i11));
    }

    private static Geofence a(@NonNull com.salesforce.marketingcloud.location.b bVar) {
        int i10 = (bVar.j() & 1) != 1 ? 0 : 1;
        if ((bVar.j() & 2) == 2) {
            i10 |= 2;
        }
        if ((bVar.j() & 4) == 4) {
            i10 |= 4;
        }
        return new Geofence.Builder().setRequestId(bVar.f()).setCircularRegion(bVar.g(), bVar.h(), bVar.i()).setTransitionTypes(i10).setExpirationDuration(-1L).build();
    }

    public String b() {
        return this.f64417d;
    }

    public int c() {
        return this.f64416c;
    }

    public boolean d() {
        return this.f64416c == 0;
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void e() throws SecurityException {
        synchronized (this) {
            try {
                if (this.f64415b) {
                    com.salesforce.marketingcloud.g.d(f64413e, "Location request already being made.", new Object[0]);
                    return;
                }
                this.f64415b = true;
                try {
                    LocationServices.getFusedLocationProviderClient(this.f64414a).requestLocationUpdates(LocationRequest.create().setNumUpdates(1).setPriority(100), LocationReceiver.c(this.f64414a)).addOnFailureListener(this).addOnCompleteListener(new a());
                } catch (SecurityException e5) {
                    com.salesforce.marketingcloud.g.b(f64413e, e5, "ACCESS_FINE_LOCATION needed to request location.", new Object[0]);
                    this.f64415b = false;
                    throw e5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(@NonNull Exception exc) {
        com.salesforce.marketingcloud.g.b(f64413e, exc, "LocationServices failure", new Object[0]);
    }

    public void a() {
        LocationServices.getGeofencingClient(this.f64414a).removeGeofences(LocationReceiver.b(this.f64414a)).addOnFailureListener(this);
    }

    public void a(List<String> list) {
        if (list == null || list.size() == 0) {
            com.salesforce.marketingcloud.g.d(f64413e, "No GeofenceRegions provided", new Object[0]);
        } else {
            LocationServices.getGeofencingClient(this.f64414a).removeGeofences(list).addOnFailureListener(this);
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void a(com.salesforce.marketingcloud.location.b... bVarArr) throws SecurityException {
        if (bVarArr == null || bVarArr.length == 0) {
            com.salesforce.marketingcloud.g.d(f64413e, "No GeofenceRegions provided", new Object[0]);
            return;
        }
        PendingIntent pendingIntentB = LocationReceiver.b(this.f64414a);
        GeofencingRequest.Builder initialTrigger = new GeofencingRequest.Builder().setInitialTrigger(1);
        for (com.salesforce.marketingcloud.location.b bVar : bVarArr) {
            com.salesforce.marketingcloud.g.d(f64413e, "Adding %s to geofence request", bVar.f());
            initialTrigger.addGeofence(a(bVar));
        }
        try {
            LocationServices.getGeofencingClient(this.f64414a).addGeofences(initialTrigger.build(), pendingIntentB).addOnFailureListener(this).addOnCompleteListener(new b());
        } catch (SecurityException e5) {
            com.salesforce.marketingcloud.g.b(f64413e, e5, "ACCESS_FINE_LOCATION needed to request location.", new Object[0]);
            throw e5;
        }
    }
}
