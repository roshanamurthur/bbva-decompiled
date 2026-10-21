package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzdw extends com.google.android.gms.internal.measurement.zzbn implements zzdx {
    public zzdw() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzk((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzt((zzks) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzks.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzj((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zzl((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzs((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List listZze = zze((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR), com.google.android.gms.internal.measurement.zzbo.zzf(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZze);
                return true;
            case 9:
                byte[] bArrZzu = zzu((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZzu);
                return true;
            case 10:
                zzq(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strZzd = zzd((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strZzd);
                return true;
            case 12:
                zzn((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzo((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List listZzh = zzh(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzf(parcel), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzh);
                return true;
            case 15:
                List listZzi = zzi(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzf(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzi);
                return true;
            case 16:
                List listZzf = zzf(parcel.readString(), parcel.readString(), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzf);
                return true;
            case 17:
                List listZzg = zzg(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 18:
                zzm((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzr((Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, Bundle.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzp((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
