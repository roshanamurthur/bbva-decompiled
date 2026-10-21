package com.noknok.android.uaf.asm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IUafAsmService extends IInterface {
    public static final String DESCRIPTOR = "com.noknok.android.uaf.asm.service.IUafAsmService";

    public static class Default implements IUafAsmService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.noknok.android.uaf.asm.service.IUafAsmService
        public String sendRequest(String str) throws RemoteException {
            return null;
        }
    }

    String sendRequest(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IUafAsmService {
        static final int TRANSACTION_sendRequest = 1;

        public static class Proxy implements IUafAsmService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUafAsmService.DESCRIPTOR;
            }

            @Override // com.noknok.android.uaf.asm.service.IUafAsmService
            public String sendRequest(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUafAsmService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUafAsmService.DESCRIPTOR);
        }

        public static IUafAsmService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUafAsmService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUafAsmService)) ? new Proxy(iBinder) : (IUafAsmService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IUafAsmService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IUafAsmService.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            String strSendRequest = sendRequest(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strSendRequest);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
