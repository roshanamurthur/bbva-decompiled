package com.huawei.hms.feature;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.dynamiccore.aidl.IDynamicCoreCallback;
import com.huawei.hms.feature.model.InstallState;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface d extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f50222c = "com.huawei.hms.feature.IRemoteDynamicInstall";

    void abortInstallFeature(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void create(com.huawei.hms.feature.b bVar) throws RemoteException;

    void delayedInstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void delayedUninstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void getAllInstallStates(IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    Map getAllInstalledModules() throws RemoteException;

    void getInstallState(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void installFeature(Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException;

    void registerInstallListener(e eVar) throws RemoteException;

    boolean triggerUserConfirm(InstallState installState, com.huawei.hms.feature.b bVar, int i10) throws RemoteException;

    void unregisterInstallListener(e eVar) throws RemoteException;

    public static abstract class b extends Binder implements d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f50223e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f50224f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f50225g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f50226h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f50227i = 5;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f50228j = 6;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f50229k = 7;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f50230l = 8;
        static final int m = 9;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f50231n = 10;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f50232o = 11;

        public static class a implements d {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static d f50233e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private IBinder f50234f;

            public a(IBinder iBinder) {
                this.f50234f = iBinder;
            }

            public String a() {
                return d.f50222c;
            }

            @Override // com.huawei.hms.feature.d
            public void abortInstallFeature(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(8, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().abortInstallFeature(i10, iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f50234f;
            }

            @Override // com.huawei.hms.feature.d
            public void create(com.huawei.hms.feature.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f50234f.transact(1, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().create(bVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void delayedInstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(9, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().delayedInstallFeature(list, iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void delayedUninstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(10, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().delayedUninstallFeature(list, iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void getAllInstallStates(IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(7, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().getAllInstallStates(iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public Map getAllInstalledModules() throws RemoteException {
                Map hashMap;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    if (this.f50234f.transact(5, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        hashMap = parcelObtain2.readHashMap(getClass().getClassLoader());
                    } else {
                        hashMap = b.getDefaultImpl().getAllInstalledModules();
                    }
                    return hashMap;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void getInstallState(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(6, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().getInstallState(i10, iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void installFeature(Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDynamicCoreCallback != null ? iDynamicCoreCallback.asBinder() : null);
                    if (this.f50234f.transact(2, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().installFeature(bundle, iDynamicCoreCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void registerInstallListener(e eVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (this.f50234f.transact(3, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().registerInstallListener(eVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public boolean triggerUserConfirm(InstallState installState, com.huawei.hms.feature.b bVar, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    if (installState != null) {
                        parcelObtain.writeInt(1);
                        installState.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    parcelObtain.writeInt(i10);
                    if (!this.f50234f.transact(11, parcelObtain, parcelObtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().triggerUserConfirm(installState, bVar, i10);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.feature.d
            public void unregisterInstallListener(e eVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f50222c);
                    parcelObtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (this.f50234f.transact(4, parcelObtain, parcelObtain2, 0) || b.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.getDefaultImpl().unregisterInstallListener(eVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d.f50222c);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.f50222c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        public static d getDefaultImpl() {
            return a.f50233e;
        }

        public static boolean setDefaultImpl(d dVar) {
            if (a.f50233e != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (dVar == null) {
                return false;
            }
            a.f50233e = dVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(d.f50222c);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(d.f50222c);
                    create(com.huawei.hms.feature.b.AbstractBinderC0221b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(d.f50222c);
                    installFeature(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(d.f50222c);
                    registerInstallListener(e.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(d.f50222c);
                    unregisterInstallListener(e.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(d.f50222c);
                    Map allInstalledModules = getAllInstalledModules();
                    parcel2.writeNoException();
                    parcel2.writeMap(allInstalledModules);
                    return true;
                case 6:
                    parcel.enforceInterface(d.f50222c);
                    getInstallState(parcel.readInt(), IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(d.f50222c);
                    getAllInstallStates(IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(d.f50222c);
                    abortInstallFeature(parcel.readInt(), IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(d.f50222c);
                    delayedInstallFeature(parcel.createStringArrayList(), IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(d.f50222c);
                    delayedUninstallFeature(parcel.createStringArrayList(), IDynamicCoreCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(d.f50222c);
                    boolean zTriggerUserConfirm = triggerUserConfirm(parcel.readInt() != 0 ? InstallState.CREATOR.createFromParcel(parcel) : null, com.huawei.hms.feature.b.AbstractBinderC0221b.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zTriggerUserConfirm ? 1 : 0);
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

    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.d
        public Map getAllInstalledModules() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.feature.d
        public boolean triggerUserConfirm(InstallState installState, com.huawei.hms.feature.b bVar, int i10) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hms.feature.d
        public void create(com.huawei.hms.feature.b bVar) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void getAllInstallStates(IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void registerInstallListener(e eVar) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void unregisterInstallListener(e eVar) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void abortInstallFeature(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void delayedInstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void delayedUninstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void getInstallState(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.feature.d
        public void installFeature(Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        }
    }
}
