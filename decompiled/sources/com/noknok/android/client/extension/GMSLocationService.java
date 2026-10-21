package com.noknok.android.client.extension;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes11.dex */
public class GMSLocationService implements OnSuccessListener<Location>, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ILocationServiceListener f63309a;

    @SuppressLint({"MissingPermission"})
    public void instantiate(ILocationServiceListener iLocationServiceListener, Context context) {
        this.f63309a = iLocationServiceListener;
        LocationServices.getFusedLocationProviderClient(context).getLastLocation().addOnSuccessListener(this).addOnFailureListener(this);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(@NonNull Exception exc) {
        this.f63309a.onFailure(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f63309a.onSuccess(location);
    }
}
