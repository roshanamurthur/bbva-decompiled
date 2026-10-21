package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f46059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46060f = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public zza(IBinder iBinder, String str) {
        this.f46059e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46059e;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46060f);
        return parcelObtain;
    }

    public final void zzb(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f46059e.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
