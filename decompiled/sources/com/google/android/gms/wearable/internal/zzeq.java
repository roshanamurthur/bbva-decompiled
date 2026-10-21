package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class zzeq extends com.google.android.gms.internal.wearable.zza implements zzep {
    public zzeq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, PutDataRequest putDataRequest) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, putDataRequest);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(zzek zzekVar, Uri uri, int i10) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, uri);
        parcelObtainAndWriteInterfaceToken.writeInt(i10);
        transactAndReadExceptionReturnVoid(41, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzc(zzek zzekVar) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzc(zzek zzekVar, String str) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(32, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, Uri uri) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, uri);
        transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(zzek zzekVar) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(zzek zzekVar, String str) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(47, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, Uri uri, int i10) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, uri);
        parcelObtainAndWriteInterfaceToken.writeInt(i10);
        transactAndReadExceptionReturnVoid(40, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(zzek zzekVar, String str, int i10) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i10);
        transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(zzek zzekVar, zzei zzeiVar, String str) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzeiVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(35, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, Asset asset) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, asset);
        transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str, int i10) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i10);
        transactAndReadExceptionReturnVoid(42, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, int i10) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeInt(i10);
        transactAndReadExceptionReturnVoid(43, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(46, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, zzd zzdVar) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzdVar);
        transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, zzfw zzfwVar) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzfwVar);
        transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str, String str2) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, zzei zzeiVar, String str) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzeiVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(34, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
        transactAndReadExceptionReturnVoid(38, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(zzek zzekVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j10, long j11) throws RemoteException {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, zzekVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zza(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
        parcelObtainAndWriteInterfaceToken.writeLong(j10);
        parcelObtainAndWriteInterfaceToken.writeLong(j11);
        transactAndReadExceptionReturnVoid(39, parcelObtainAndWriteInterfaceToken);
    }
}
