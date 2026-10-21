package com.huawei.hms.feature;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50218b = "com.huawei.hms.feature.IRemoteDynamicCompat";

    void install(com.huawei.hms.feature.b bVar) throws RemoteException;

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f50219e = 1;

        public static class a implements c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static c f50220e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50221f;

            public a(IBinder iBinder) {
                this.f50221f = iBinder;
            }

            public String a() {
                return c.f50218b;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50221f;
            }

            @Override // com.huawei.hms.feature.c
            public void install(com.huawei.hms.feature.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f50218b);
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f50221f.transact(1, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().install(bVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.f50218b);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f50218b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        public static c getDefaultImpl() {
            return a.f50220e;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (a.f50220e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (cVar == null) {
                return false;
            }
            a.f50220e = cVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(c.f50218b);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface(c.f50218b);
            install(com.huawei.hms.feature.b.AbstractBinderC0221b.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.c
        public void install(com.huawei.hms.feature.b bVar) throws RemoteException {
        }
    }
}
