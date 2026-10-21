package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzj extends zza {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zzd() throws RemoteException {
        zzc(3, zza());
    }

    public final zzf[] zze(IObjectWrapper iObjectWrapper, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, iObjectWrapper);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i10, int i11, int i12, int i13, int i14, int i15, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, iObjectWrapper);
        zzc.zzb(parcelZza, iObjectWrapper2);
        zzc.zzb(parcelZza, iObjectWrapper3);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        parcelZza.writeInt(i12);
        parcelZza.writeInt(i13);
        parcelZza.writeInt(i14);
        parcelZza.writeInt(i15);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(4, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }
}
