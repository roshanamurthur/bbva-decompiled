package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IDynamicLinksService extends IInterface {
    void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) throws RemoteException;

    void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IDynamicLinksService {

        public static class a implements IDynamicLinksService {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f48353e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f48353e;
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public final void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DynamicLinksClient.SERVICE_DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iDynamicLinksCallbacks != null ? iDynamicLinksCallbacks.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f48353e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public final void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DynamicLinksClient.SERVICE_DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iDynamicLinksCallbacks != null ? iDynamicLinksCallbacks.asBinder() : null);
                    parcelObtain.writeString(str);
                    this.f48353e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DynamicLinksClient.SERVICE_DESCRIPTOR);
        }

        public static IDynamicLinksService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DynamicLinksClient.SERVICE_DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDynamicLinksService)) {
                return (IDynamicLinksService) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f48353e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(DynamicLinksClient.SERVICE_DESCRIPTOR);
                getDynamicLink(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DynamicLinksClient.SERVICE_DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DynamicLinksClient.SERVICE_DESCRIPTOR);
            createShortDynamicLink(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
