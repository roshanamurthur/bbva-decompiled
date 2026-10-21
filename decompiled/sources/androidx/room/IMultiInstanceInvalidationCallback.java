package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$room$IMultiInstanceInvalidationCallback".replace(Typography.dollar, '.');

    void onInvalidation(String[] strArr) throws RemoteException;

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        public static class a implements IMultiInstanceInvalidationCallback {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f23200e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f23200e;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public final void onInvalidation(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    this.f23200e.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMultiInstanceInvalidationCallback.DESCRIPTOR);
        }

        public static IMultiInstanceInvalidationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                return (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f23200e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = IMultiInstanceInvalidationCallback.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            onInvalidation(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(String[] strArr) throws RemoteException {
        }
    }
}
