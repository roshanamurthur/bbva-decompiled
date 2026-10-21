package org.fidoalliance.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface IUAFResponseListener extends IInterface {
    public static final String DESCRIPTOR = "org.fidoalliance.aidl.IUAFResponseListener";

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

    void onResult(Intent intent) throws RemoteException;

    public static abstract class Stub extends Binder implements IUAFResponseListener {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IUAFResponseListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUAFResponseListener.DESCRIPTOR;
            }

            @Override // org.fidoalliance.aidl.IUAFResponseListener
            public void onResult(Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUAFResponseListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, intent, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUAFResponseListener.DESCRIPTOR);
        }

        public static IUAFResponseListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUAFResponseListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUAFResponseListener)) ? new Proxy(iBinder) : (IUAFResponseListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IUAFResponseListener.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IUAFResponseListener.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            onResult((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IUAFResponseListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.fidoalliance.aidl.IUAFResponseListener
        public void onResult(Intent intent) throws RemoteException {
        }
    }
}
