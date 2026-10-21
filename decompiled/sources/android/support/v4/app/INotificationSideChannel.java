package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface INotificationSideChannel extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace(Typography.dollar, '.');

    public static class _Parcel {
    }

    void cancel(String str, int i10, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i10, String str2, Notification notification) throws RemoteException;

    public static abstract class Stub extends Binder implements INotificationSideChannel {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        public static class a implements INotificationSideChannel {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public IBinder f273e;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f273e;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void cancel(String str, int i10, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    this.f273e.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void cancelAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f273e.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void notify(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f273e.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationSideChannel.DESCRIPTOR);
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) {
                return (INotificationSideChannel) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f273e = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = INotificationSideChannel.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
            } else if (i10 == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                cancelAll(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements INotificationSideChannel {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i10, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i10, String str2, Notification notification) throws RemoteException {
        }
    }
}
