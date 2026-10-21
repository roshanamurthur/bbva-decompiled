package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableInt extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f20540q0;

    public class a implements Parcelable.Creator<ObservableInt> {
        @Override // android.os.Parcelable.Creator
        public final ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableInt[] newArray(int i10) {
            return new ObservableInt[i10];
        }
    }

    public ObservableInt(int i10) {
        this.f20540q0 = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int get() {
        return this.f20540q0;
    }

    public void set(int i10) {
        if (i10 != this.f20540q0) {
            this.f20540q0 = i10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20540q0);
    }

    public ObservableInt() {
    }

    public ObservableInt(Observable... observableArr) {
        super(observableArr);
    }
}
