package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes10.dex */
public interface IDynamicLinksCallbacks extends IInterface {
    void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) throws RemoteException;

    void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) throws RemoteException;

    public static abstract class Stub extends Binder implements IDynamicLinksCallbacks {

        public static class a implements IDynamicLinksCallbacks {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f48352e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f48352e;
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
            public final void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    if (status != null) {
                        parcelObtain.writeInt(1);
                        status.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (shortDynamicLinkImpl != null) {
                        parcelObtain.writeInt(1);
                        shortDynamicLinkImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f48352e.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
            public final void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    if (status != null) {
                        parcelObtain.writeInt(1);
                        status.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (dynamicLinkData != null) {
                        parcelObtain.writeInt(1);
                        dynamicLinkData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f48352e.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        public static IDynamicLinksCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDynamicLinksCallbacks)) {
                return (IDynamicLinksCallbacks) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f48352e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                onGetDynamicLink(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DynamicLinkData.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                onCreateShortDynamicLink(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ShortDynamicLinkImpl.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
