package com.huawei.hms.feature;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface e extends IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f50259d = "com.huawei.hms.feature.IRemoteStateUpdate";

    public static abstract class b extends Binder implements e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f50260e = 1;

        public static class a implements e {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static e f50261e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50262f;

            public a(IBinder iBinder) {
                this.f50262f = iBinder;
            }

            public String a() {
                return e.f50259d;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50262f;
            }

            @Override // com.huawei.hms.feature.e
            public void a(Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f50259d);
                    if (intent != null) {
                        parcelObtain.writeInt(1);
                        intent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50262f.transact(1, parcelObtain, parcelObtain2, 0) || b.a() == null) {
                        parcelObtain2.readException();
                        if (parcelObtain2.readInt() != 0) {
                            intent.readFromParcel(parcelObtain2);
                        }
                    } else {
                        b.a().a(intent);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e.f50259d);
        }

        public static e a() {
            return a.f50261e;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(e.f50259d);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface(e.f50259d);
            Intent intent = parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null;
            a(intent);
            parcel2.writeNoException();
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e.f50259d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        public static boolean a(e eVar) {
            if (a.f50261e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (eVar == null) {
                return false;
            }
            a.f50261e = eVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void a(Intent intent) throws RemoteException;

    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.e
        public void a(Intent intent) throws RemoteException {
        }
    }
}
