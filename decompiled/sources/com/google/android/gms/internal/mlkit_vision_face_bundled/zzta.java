package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzta extends zzb implements zztb {
    public zzta() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    public static zztb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof zztb ? (zztb) iInterfaceQueryLocalInterface : new zzsz(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        zzst zzstVar = (zzst) zzc.zza(parcel, zzst.CREATOR);
        zzc.zzb(parcel);
        zzsy zzsyVarNewFaceDetector = newFaceDetector(iObjectWrapperAsInterface, zzstVar);
        parcel2.writeNoException();
        if (zzsyVarNewFaceDetector == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(zzsyVarNewFaceDetector.asBinder());
        }
        return true;
    }
}
