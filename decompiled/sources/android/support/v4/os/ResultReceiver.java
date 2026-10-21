package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f276p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Handler f277q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public IResultReceiver f278r0;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    public class b extends IResultReceiver.Stub {
        public b() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public final void send(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f277q0;
            if (handler != null) {
                handler.post(resultReceiver.new c(i10, bundle));
            } else {
                resultReceiver.onReceiveResult(i10, bundle);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f280p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Bundle f281q0;

        public c(int i10, Bundle bundle) {
            this.f280p0 = i10;
            this.f281q0 = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ResultReceiver.this.onReceiveResult(this.f280p0, this.f281q0);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f276p0 = true;
        this.f277q0 = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void send(int i10, Bundle bundle) {
        if (this.f276p0) {
            Handler handler = this.f277q0;
            if (handler != null) {
                handler.post(new c(i10, bundle));
                return;
            } else {
                onReceiveResult(i10, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.f278r0;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f278r0 == null) {
                    this.f278r0 = new b();
                }
                parcel.writeStrongBinder(this.f278r0.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f276p0 = false;
        this.f277q0 = null;
        this.f278r0 = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    public void onReceiveResult(int i10, Bundle bundle) {
    }
}
