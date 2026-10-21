package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzk implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f46315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46316f = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public zzk(IBinder iBinder, String str) {
        this.f46315e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46315e;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46316f);
        return parcelObtain;
    }

    public final void zzb(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f46315e.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
