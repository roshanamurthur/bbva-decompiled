package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzbk extends zzb implements zzbl {
    public zzbk() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            zzd();
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            List listZzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbu) zzc.zza(parcel, zzbu.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzb);
        }
        return true;
    }
}
