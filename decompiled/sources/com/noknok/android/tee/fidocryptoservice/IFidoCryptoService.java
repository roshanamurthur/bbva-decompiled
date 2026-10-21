package com.noknok.android.tee.fidocryptoservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IFidoCryptoService extends IInterface {
    public static final String DESCRIPTOR = "com.noknok.android.tee.fidocryptoservice.IFidoCryptoService";

    public static class Default implements IFidoCryptoService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.noknok.android.tee.fidocryptoservice.IFidoCryptoService
        public String process(String str) throws RemoteException {
            return null;
        }

        @Override // com.noknok.android.tee.fidocryptoservice.IFidoCryptoService
        public String processMatcher(byte b10, byte[] bArr) throws RemoteException {
            return null;
        }
    }

    String process(String str) throws RemoteException;

    String processMatcher(byte b10, byte[] bArr) throws RemoteException;

    public static abstract class Stub extends Binder implements IFidoCryptoService {
        static final int TRANSACTION_process = 1;
        static final int TRANSACTION_processMatcher = 2;

        public static class Proxy implements IFidoCryptoService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFidoCryptoService.DESCRIPTOR;
            }

            @Override // com.noknok.android.tee.fidocryptoservice.IFidoCryptoService
            public String process(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFidoCryptoService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.noknok.android.tee.fidocryptoservice.IFidoCryptoService
            public String processMatcher(byte b10, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFidoCryptoService.DESCRIPTOR);
                    parcelObtain.writeByte(b10);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFidoCryptoService.DESCRIPTOR);
        }

        public static IFidoCryptoService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IFidoCryptoService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFidoCryptoService)) ? new Proxy(iBinder) : (IFidoCryptoService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IFidoCryptoService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IFidoCryptoService.DESCRIPTOR);
                return true;
            }
            if (i10 == 1) {
                String strProcess = process(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strProcess);
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                String strProcessMatcher = processMatcher(parcel.readByte(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strProcessMatcher);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
