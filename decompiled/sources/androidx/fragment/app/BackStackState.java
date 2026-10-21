package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<String> f21471p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final List<BackStackRecordState> f21472q0;

    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f21471p0 = arrayList;
        this.f21472q0 = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeStringList(this.f21471p0);
        parcel.writeTypedList(this.f21472q0);
    }

    public BackStackState(@NonNull Parcel parcel) {
        this.f21471p0 = parcel.createStringArrayList();
        this.f21472q0 = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
