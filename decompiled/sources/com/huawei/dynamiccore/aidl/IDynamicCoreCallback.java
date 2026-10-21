package com.huawei.dynamiccore.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IDynamicCoreCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.dynamiccore.aidl.IDynamicCoreCallback";

    void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException;

    void onDelayedInstallFeature(Bundle bundle) throws RemoteException;

    void onDelayedUninstallFeature(Bundle bundle) throws RemoteException;

    void onGetAllInstallStates(Bundle bundle) throws RemoteException;

    void onGetInstallState(int i10, Bundle bundle) throws RemoteException;

    void onInstallFeature(int i10, Bundle bundle) throws RemoteException;

    public static abstract class Stub extends Binder implements IDynamicCoreCallback {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f50141e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f50142f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f50143g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f50144h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f50145i = 5;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f50146j = 6;

        public static class a implements IDynamicCoreCallback {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static IDynamicCoreCallback f50147e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50148f;

            public a(IBinder iBinder) {
                this.f50148f = iBinder;
            }

            public String a() {
                return IDynamicCoreCallback.DESCRIPTOR;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50148f;
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAbortInstallFeature(i10, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDelayedInstallFeature(bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDelayedUninstallFeature(bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onGetAllInstallStates(bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onGetInstallState(i10, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCoreCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f50148f.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onInstallFeature(i10, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDynamicCoreCallback.DESCRIPTOR);
        }

        public static IDynamicCoreCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDynamicCoreCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDynamicCoreCallback)) ? new a(iBinder) : (IDynamicCoreCallback) iInterfaceQueryLocalInterface;
        }

        public static IDynamicCoreCallback getDefaultImpl() {
            return a.f50147e;
        }

        public static boolean setDefaultImpl(IDynamicCoreCallback iDynamicCoreCallback) {
            if (a.f50147e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDynamicCoreCallback == null) {
                return false;
            }
            a.f50147e = iDynamicCoreCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(IDynamicCoreCallback.DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onInstallFeature(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onAbortInstallFeature(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onDelayedInstallFeature(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onDelayedUninstallFeature(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onGetInstallState(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface(IDynamicCoreCallback.DESCRIPTOR);
                    onGetAllInstallStates(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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

    public static class Default implements IDynamicCoreCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
        public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
        }
    }
}
