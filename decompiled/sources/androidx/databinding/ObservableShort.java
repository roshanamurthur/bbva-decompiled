package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableShort extends androidx.databinding.a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public short f20542q0;

    public class a implements Parcelable.Creator<ObservableShort> {
        @Override // android.os.Parcelable.Creator
        public final ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableShort[] newArray(int i10) {
            return new ObservableShort[i10];
        }
    }

    public ObservableShort(short s4) {
        this.f20542q0 = s4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short get() {
        return this.f20542q0;
    }

    public void set(short s4) {
        if (s4 != this.f20542q0) {
            this.f20542q0 = s4;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20542q0);
    }

    public ObservableShort() {
    }

    public ObservableShort(Observable... observableArr) {
        super(observableArr);
    }
}
