package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableLong extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f20541q0;

    public class a implements Parcelable.Creator<ObservableLong> {
        @Override // android.os.Parcelable.Creator
        public final ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableLong[] newArray(int i10) {
            return new ObservableLong[i10];
        }
    }

    public ObservableLong(long j10) {
        this.f20541q0 = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long get() {
        return this.f20541q0;
    }

    public void set(long j10) {
        if (j10 != this.f20541q0) {
            this.f20541q0 = j10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20541q0);
    }

    public ObservableLong() {
    }

    public ObservableLong(Observable... observableArr) {
        super(observableArr);
    }
}
