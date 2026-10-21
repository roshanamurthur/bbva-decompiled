package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzd extends zza {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    public final void zzc(CreatePushProvisionSessionRequest createPushProvisionSessionRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, createPushProvisionSessionRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(67, parcelZza);
    }

    public final void zzd(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(29, parcelZza);
    }

    public final void zze(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(21, parcelZza);
    }

    public final void zzf(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(31, parcelZza);
    }

    public final void zzg(String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(61, parcelZza);
    }

    public final void zzh(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(30, parcelZza);
    }

    public final void zzi(int i10, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(22, parcelZza);
    }

    public final void zzj(IsTokenizedRequest isTokenizedRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, isTokenizedRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(75, parcelZza);
    }

    public final void zzk(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(74, parcelZza);
    }

    public final void zzl(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pushTokenizeRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(28, parcelZza);
    }

    public final void zzm(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(10, parcelZza);
    }

    public final void zzn(int i10, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(25, parcelZza);
    }

    public final void zzo(int i10, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(24, parcelZza);
    }

    public final void zzp(ServerPushProvisionRequest serverPushProvisionRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, serverPushProvisionRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(68, parcelZza);
    }

    public final void zzq(int i10, String str, String str2, int i11, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i11);
        zzc.zzd(parcelZza, zzfVar);
        zzb(23, parcelZza);
    }

    public final void zzr(ViewTokenRequest viewTokenRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, viewTokenRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(79, parcelZza);
    }
}
