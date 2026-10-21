package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f46212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46213f = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public zza(IBinder iBinder, String str) {
        this.f46212e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46212e;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46213f);
        return parcelObtain;
    }

    public final void zzb(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f46212e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
