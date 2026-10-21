package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableBoolean extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f20534q0;

    public class a implements Parcelable.Creator<ObservableBoolean> {
        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean[] newArray(int i10) {
            return new ObservableBoolean[i10];
        }
    }

    public ObservableBoolean(boolean z10) {
        this.f20534q0 = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean get() {
        return this.f20534q0;
    }

    public void set(boolean z10) {
        if (z10 != this.f20534q0) {
            this.f20534q0 = z10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20534q0 ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(Observable... observableArr) {
        super(observableArr);
    }
}
