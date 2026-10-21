package org.fidoalliance.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface IUAFOperation extends IInterface {
    public static final String DESCRIPTOR = "org.fidoalliance.aidl.IUAFOperation";

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void process(Intent intent, IUAFResponseListener iUAFResponseListener) throws RemoteException;

    public static abstract class Stub extends Binder implements IUAFOperation {
        static final int TRANSACTION_process = 1;

        public static class Proxy implements IUAFOperation {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUAFOperation.DESCRIPTOR;
            }

            @Override // org.fidoalliance.aidl.IUAFOperation
            public void process(Intent intent, IUAFResponseListener iUAFResponseListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUAFOperation.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, intent, 0);
                    parcelObtain.writeStrongInterface(iUAFResponseListener);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUAFOperation.DESCRIPTOR);
        }

        public static IUAFOperation asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUAFOperation.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUAFOperation)) ? new Proxy(iBinder) : (IUAFOperation) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IUAFOperation.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IUAFOperation.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            process((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), IUAFResponseListener.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IUAFOperation {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.fidoalliance.aidl.IUAFOperation
        public void process(Intent intent, IUAFResponseListener iUAFResponseListener) throws RemoteException {
        }
    }
}
