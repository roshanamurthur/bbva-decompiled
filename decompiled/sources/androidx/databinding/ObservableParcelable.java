package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableParcelable<T extends Parcelable> extends ObservableField<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new a();

    public class a implements Parcelable.Creator<ObservableParcelable> {
        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable[] newArray(int i10) {
            return new ObservableParcelable[i10];
        }
    }

    public ObservableParcelable(T t10) {
        super(t10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(get(), 0);
    }

    public ObservableParcelable() {
    }
}
