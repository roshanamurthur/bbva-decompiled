package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f46378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46379f = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    public a(IBinder iBinder, String str) {
        this.f46378e = iBinder;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46379f);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46378e;
    }

    public final void b(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f46378e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
