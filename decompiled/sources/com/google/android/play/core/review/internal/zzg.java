package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
        zzc.zzb(parcel);
        zzb(bundle);
        return true;
    }
}
