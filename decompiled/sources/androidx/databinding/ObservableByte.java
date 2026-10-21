package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableByte extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte f20535q0;

    public class a implements Parcelable.Creator<ObservableByte> {
        @Override // android.os.Parcelable.Creator
        public final ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableByte[] newArray(int i10) {
            return new ObservableByte[i10];
        }
    }

    public ObservableByte(byte b10) {
        this.f20535q0 = b10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte get() {
        return this.f20535q0;
    }

    public void set(byte b10) {
        if (b10 != this.f20535q0) {
            this.f20535q0 = b10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f20535q0);
    }

    public ObservableByte() {
    }

    public ObservableByte(Observable... observableArr) {
        super(observableArr);
    }
}
