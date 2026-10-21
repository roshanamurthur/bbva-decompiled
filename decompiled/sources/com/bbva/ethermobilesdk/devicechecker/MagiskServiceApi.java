package com.bbva.ethermobilesdk.devicechecker;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface MagiskServiceApi extends IInterface {
    public static final String DESCRIPTOR = "com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi";

    public static class Default implements MagiskServiceApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi
        public int isMagiskPresent() throws RemoteException {
            return 0;
        }
    }

    int isMagiskPresent() throws RemoteException;

    public static abstract class Stub extends Binder implements MagiskServiceApi {

        public static class a implements MagiskServiceApi {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f29400e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f29400e;
            }

            @Override // com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi
            public final int isMagiskPresent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(MagiskServiceApi.DESCRIPTOR);
                    this.f29400e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, MagiskServiceApi.DESCRIPTOR);
        }

        public static MagiskServiceApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(MagiskServiceApi.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MagiskServiceApi)) {
                return (MagiskServiceApi) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f29400e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(MagiskServiceApi.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(MagiskServiceApi.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int iIsMagiskPresent = isMagiskPresent();
            parcel2.writeNoException();
            parcel2.writeInt(iIsMagiskPresent);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
