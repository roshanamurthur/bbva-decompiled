package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IWorkManagerImpl extends IInterface {
    void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        public static class a implements IWorkManagerImpl {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static IWorkManagerImpl f24722f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f24723e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f24723e;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().cancelAllWork(iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().cancelAllWorkByTag(str, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().cancelUniqueWork(str, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().cancelWorkById(str, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().enqueueContinuation(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().enqueueWorkRequests(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().queryWorkInfo(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public final void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f24723e.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setProgress(bArr, iWorkManagerImplCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
        }

        public static IWorkManagerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWorkManagerImpl)) {
                return (IWorkManagerImpl) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f24723e = iBinder;
            return aVar;
        }

        public static IWorkManagerImpl getDefaultImpl() {
            return a.f24722f;
        }

        public static boolean setDefaultImpl(IWorkManagerImpl iWorkManagerImpl) {
            if (a.f24722f != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWorkManagerImpl == null) {
                return false;
            }
            a.f24722f = iWorkManagerImpl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    enqueueWorkRequests(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    enqueueContinuation(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    cancelWorkById(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    cancelAllWorkByTag(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    cancelUniqueWork(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    cancelAllWork(IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    queryWorkInfo(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    setProgress(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }
    }
}
