package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableChar extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public char f20536q0;

    public class a implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        public final ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableChar[] newArray(int i10) {
            return new ObservableChar[i10];
        }
    }

    public ObservableChar(char c10) {
        this.f20536q0 = c10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char get() {
        return this.f20536q0;
    }

    public void set(char c10) {
        if (c10 != this.f20536q0) {
            this.f20536q0 = c10;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20536q0);
    }

    public ObservableChar() {
    }

    public ObservableChar(Observable... observableArr) {
        super(observableArr);
    }
}
