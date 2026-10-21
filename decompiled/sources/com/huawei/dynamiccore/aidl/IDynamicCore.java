package com.huawei.dynamiccore.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IDynamicCore extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.dynamiccore.aidl.IDynamicCore";

    void abortInstallFeature(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void delayedInstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void delayedUninstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void getAllInstallStates(String str, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void getInstallState(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void installFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IDynamicCore {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f50133e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f50134f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f50135g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f50136h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f50137i = 5;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f50138j = 6;

        public static class a implements IDynamicCore {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static IDynamicCore f50139e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50140f;

            public a(IBinder iBinder) {
                this.f50140f = iBinder;
            }

            public String a() {
                return IDynamicCore.DESCRIPTOR;
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void abortInstallFeature(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().abortInstallFeature(str, i10, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50140f;
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void delayedInstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().delayedInstallFeature(str, list, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void delayedUninstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().delayedUninstallFeature(str, list, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void getAllInstallStates(String str, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getAllInstallStates(str, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void getInstallState(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getInstallState(str, i10, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.dynamiccore.aidl.IDynamicCore
            public void installFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicCore.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50140f.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().installFeature(str, list, bundle, iDynamicCoreCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDynamicCore.DESCRIPTOR);
        }

        public static IDynamicCore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDynamicCore.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDynamicCore)) ? new a(iBinder) : (IDynamicCore) iInterfaceQueryLocalInterface;
        }

        public static IDynamicCore getDefaultImpl() {
            return a.f50139e;
        }

        public static boolean setDefaultImpl(IDynamicCore iDynamicCore) {
            if (a.f50139e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDynamicCore == null) {
                return false;
            }
            a.f50139e = iDynamicCore;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(IDynamicCore.DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    String string = parcel.readString();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    installFeature(string, parcel.createTypedArrayList(creator), parcel.readInt() != 0 ? (Bundle) creator.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    abortInstallFeature(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    String string2 = parcel.readString();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    delayedInstallFeature(string2, parcel.createTypedArrayList(creator2), parcel.readInt() != 0 ? (Bundle) creator2.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    String string3 = parcel.readString();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    delayedUninstallFeature(string3, parcel.createTypedArrayList(creator3), parcel.readInt() != 0 ? (Bundle) creator3.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    getInstallState(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface(IDynamicCore.DESCRIPTOR);
                    getAllInstallStates(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
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

    public static class Default implements IDynamicCore {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void getAllInstallStates(String str, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void abortInstallFeature(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void delayedInstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void delayedUninstallFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void getInstallState(String str, int i10, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.dynamiccore.aidl.IDynamicCore
        public void installFeature(String str, List<Bundle> list, Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }
    }
}
