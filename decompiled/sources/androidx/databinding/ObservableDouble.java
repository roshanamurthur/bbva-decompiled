package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableDouble extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public double f20537q0;

    public class a implements Parcelable.Creator<ObservableDouble> {
        @Override // android.os.Parcelable.Creator
        public final ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableDouble[] newArray(int i10) {
            return new ObservableDouble[i10];
        }
    }

    public ObservableDouble(double d2) {
        this.f20537q0 = d2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double get() {
        return this.f20537q0;
    }

    public void set(double d2) {
        if (d2 != this.f20537q0) {
            this.f20537q0 = d2;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(this.f20537q0);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(Observable... observableArr) {
        super(observableArr);
    }
}
