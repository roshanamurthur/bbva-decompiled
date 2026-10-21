package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public interface zzdx extends IInterface {
    @Nullable
    String zzd(zzp zzpVar) throws RemoteException;

    @Nullable
    List zze(zzp zzpVar, boolean z10) throws RemoteException;

    List zzf(@Nullable String str, @Nullable String str2, zzp zzpVar) throws RemoteException;

    List zzg(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    List zzh(@Nullable String str, @Nullable String str2, boolean z10, zzp zzpVar) throws RemoteException;

    List zzi(String str, @Nullable String str2, @Nullable String str3, boolean z10) throws RemoteException;

    void zzj(zzp zzpVar) throws RemoteException;

    void zzk(zzau zzauVar, zzp zzpVar) throws RemoteException;

    void zzl(zzau zzauVar, String str, @Nullable String str2) throws RemoteException;

    void zzm(zzp zzpVar) throws RemoteException;

    void zzn(zzab zzabVar, zzp zzpVar) throws RemoteException;

    void zzo(zzab zzabVar) throws RemoteException;

    void zzp(zzp zzpVar) throws RemoteException;

    void zzq(long j10, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    void zzr(Bundle bundle, zzp zzpVar) throws RemoteException;

    void zzs(zzp zzpVar) throws RemoteException;

    void zzt(zzks zzksVar, zzp zzpVar) throws RemoteException;

    @Nullable
    byte[] zzu(zzau zzauVar, String str) throws RemoteException;
}
