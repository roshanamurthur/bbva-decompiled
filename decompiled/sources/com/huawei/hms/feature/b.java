package com.huawei.hms.feature;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50156a = "com.huawei.hms.feature.IObjectWrapper";

    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0221b extends Binder implements b {

        /* JADX INFO: renamed from: com.huawei.hms.feature.b$b$a */
        public static class a implements b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static b f50157e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50158f;

            public a(IBinder iBinder) {
                this.f50158f = iBinder;
            }

            public String a() {
                return b.f50156a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50158f;
            }
        }

        public AbstractBinderC0221b() {
            attachInterface(this, b.f50156a);
        }

        public static b a() {
            return a.f50157e;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(b.f50156a);
            return true;
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f50156a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static boolean a(b bVar) {
            if (a.f50157e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            a.f50157e = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
