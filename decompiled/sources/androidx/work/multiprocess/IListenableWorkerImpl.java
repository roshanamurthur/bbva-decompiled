package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IListenableWorkerImpl extends IInterface {
    void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        public static class a implements IListenableWorkerImpl {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static IListenableWorkerImpl f24720f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f24721e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f24721e;
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public final void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24721e.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().interrupt(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public final void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24721e.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().startWork(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.work.multiprocess.IListenableWorkerImpl");
        }

        public static IListenableWorkerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IListenableWorkerImpl)) {
                return (IListenableWorkerImpl) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f24721e = iBinder;
            return aVar;
        }

        public static IListenableWorkerImpl getDefaultImpl() {
            return a.f24720f;
        }

        public static boolean setDefaultImpl(IListenableWorkerImpl iListenableWorkerImpl) {
            if (a.f24720f != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iListenableWorkerImpl == null) {
                return false;
            }
            a.f24720f = iListenableWorkerImpl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                startWork(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                interrupt(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }
    }
}
