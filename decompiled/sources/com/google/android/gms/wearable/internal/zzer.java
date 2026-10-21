package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class zzer<T> {
    private final Map<T, zzhk<T>> zzeb = new HashMap();

    public final void zza(IBinder iBinder) {
        zzep zzeqVar;
        synchronized (this.zzeb) {
            if (iBinder == null) {
                zzeqVar = null;
            } else {
                try {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzeqVar = iInterfaceQueryLocalInterface instanceof zzep ? (zzep) iInterfaceQueryLocalInterface : new zzeq(iBinder);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzgz zzgzVar = new zzgz();
            for (Map.Entry<T, zzhk<T>> entry : this.zzeb.entrySet()) {
                zzhk<T> value = entry.getValue();
                try {
                    zzeqVar.zza(zzgzVar, new zzd(value));
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(entry.getKey()).length() + 27 + String.valueOf(value).length());
                    }
                } catch (RemoteException unused) {
                    String strValueOf = String.valueOf(entry.getKey());
                    String strValueOf2 = String.valueOf(value);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32 + strValueOf2.length());
                    sb2.append("onPostInitHandler: Didn't add: ");
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(strValueOf2);
                    Log.w("WearableClient", sb2.toString());
                }
            }
        }
    }

    public final void zza(zzhg zzhgVar, BaseImplementation.ResultHolder<Status> resultHolder, T t10, zzhk<T> zzhkVar) throws RemoteException {
        synchronized (this.zzeb) {
            try {
                if (this.zzeb.get(t10) != null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        new StringBuilder(String.valueOf(t10).length() + 20);
                    }
                    resultHolder.setResult(new Status(WearableStatusCodes.DUPLICATE_LISTENER));
                    return;
                }
                if (Log.isLoggable("WearableClient", 2)) {
                    new StringBuilder(String.valueOf(t10).length() + 14);
                }
                this.zzeb.put(t10, zzhkVar);
                try {
                    ((zzep) zzhgVar.getService()).zza(new zzes(this.zzeb, t10, resultHolder), new zzd(zzhkVar));
                } catch (RemoteException e5) {
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(t10).length() + 39);
                    }
                    this.zzeb.remove(t10);
                    throw e5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(zzhg zzhgVar, BaseImplementation.ResultHolder<Status> resultHolder, T t10) throws RemoteException {
        synchronized (this.zzeb) {
            try {
                zzhk<T> zzhkVarRemove = this.zzeb.remove(t10);
                if (zzhkVarRemove == null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        new StringBuilder(String.valueOf(t10).length() + 25);
                    }
                    resultHolder.setResult(new Status(WearableStatusCodes.UNKNOWN_LISTENER));
                } else {
                    zzhkVarRemove.clear();
                    if (Log.isLoggable("WearableClient", 2)) {
                        new StringBuilder(String.valueOf(t10).length() + 24);
                    }
                    ((zzep) zzhgVar.getService()).zza(new zzet(this.zzeb, t10, resultHolder), new zzfw(zzhkVarRemove));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
