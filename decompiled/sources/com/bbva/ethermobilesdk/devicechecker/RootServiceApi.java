package com.bbva.ethermobilesdk.devicechecker;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface RootServiceApi extends IInterface {
    public static final String DESCRIPTOR = "com.bbva.ethermobilesdk.devicechecker.RootServiceApi";

    public static class Default implements RootServiceApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bbva.ethermobilesdk.devicechecker.RootServiceApi
        public int isRootPresent() throws RemoteException {
            return 0;
        }
    }

    int isRootPresent() throws RemoteException;

    public static abstract class Stub extends Binder implements RootServiceApi {

        public static class a implements RootServiceApi {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f29401e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f29401e;
            }

            @Override // com.bbva.ethermobilesdk.devicechecker.RootServiceApi
            public final int isRootPresent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(RootServiceApi.DESCRIPTOR);
                    this.f29401e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, RootServiceApi.DESCRIPTOR);
        }

        public static RootServiceApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(RootServiceApi.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof RootServiceApi)) {
                return (RootServiceApi) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f29401e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(RootServiceApi.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(RootServiceApi.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int iIsRootPresent = isRootPresent();
            parcel2.writeNoException();
            parcel2.writeInt(iIsRootPresent);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
