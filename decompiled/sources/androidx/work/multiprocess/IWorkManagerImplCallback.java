package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IWorkManagerImplCallback extends IInterface {
    void onFailure(String str) throws RemoteException;

    void onSuccess(byte[] bArr) throws RemoteException;

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        public static class a implements IWorkManagerImplCallback {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static IWorkManagerImplCallback f24724f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f24725e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f24725e;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public final void onFailure(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcelObtain.writeString(str);
                    if (this.f24725e.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onFailure(str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public final void onSuccess(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcelObtain.writeByteArray(bArr);
                    if (this.f24725e.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.work.multiprocess.IWorkManagerImplCallback");
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f24725e = iBinder;
            return aVar;
        }

        public static IWorkManagerImplCallback getDefaultImpl() {
            return a.f24724f;
        }

        public static boolean setDefaultImpl(IWorkManagerImplCallback iWorkManagerImplCallback) {
            if (a.f24724f != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWorkManagerImplCallback == null) {
                return false;
            }
            a.f24724f = iWorkManagerImplCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                onSuccess(parcel.createByteArray());
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                onFailure(parcel.readString());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(String str) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] bArr) throws RemoteException {
        }
    }
}
