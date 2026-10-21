package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdv extends com.google.android.gms.internal.measurement.zzbm implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final String zzd(zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(11, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zze(zzp zzpVar, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcelZza, z10);
        Parcel parcelZzb = zzb(7, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzks.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzf(String str, String str2, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(16, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzab.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzg(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzb = zzb(17, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzab.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcelZza, z10);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(14, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzks.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzi(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcelZza, z10);
        Parcel parcelZzb = zzb(15, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzks.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzj(zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzk(zzau zzauVar, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzauVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzl(zzau zzauVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzm(zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzn(zzab zzabVar, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzabVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzo(zzab zzabVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzp(zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzq(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzr(Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzs(zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzt(zzks zzksVar, zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzksVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpVar);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final byte[] zzu(zzau zzauVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzauVar);
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzb.createByteArray();
        parcelZzb.recycle();
        return bArrCreateByteArray;
    }
}
