package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableFloat extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f20539q0;

    public class a implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        public final ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableFloat[] newArray(int i10) {
            return new ObservableFloat[i10];
        }
    }

    public ObservableFloat(float f6) {
        this.f20539q0 = f6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float get() {
        return this.f20539q0;
    }

    public void set(float f6) {
        if (f6 != this.f20539q0) {
            this.f20539q0 = f6;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f20539q0);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(Observable... observableArr) {
        super(observableArr);
    }
}
