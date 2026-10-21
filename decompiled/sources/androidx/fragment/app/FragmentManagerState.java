package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentManager.LaunchedFragmentInfo> E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList<FragmentState> f21580p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList<String> f21581q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList<String> f21582r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BackStackRecordState[] f21583s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f21584t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f21585u0 = null;
    public ArrayList<String> v0 = new ArrayList<>();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList<BackStackState> f21586w0 = new ArrayList<>();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList<String> f21587x0 = new ArrayList<>();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList<Bundle> f21588y0 = new ArrayList<>();

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f21585u0 = null;
            fragmentManagerState.v0 = new ArrayList<>();
            fragmentManagerState.f21586w0 = new ArrayList<>();
            fragmentManagerState.f21587x0 = new ArrayList<>();
            fragmentManagerState.f21588y0 = new ArrayList<>();
            fragmentManagerState.f21580p0 = parcel.createTypedArrayList(FragmentState.CREATOR);
            fragmentManagerState.f21581q0 = parcel.createStringArrayList();
            fragmentManagerState.f21582r0 = parcel.createStringArrayList();
            fragmentManagerState.f21583s0 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.f21584t0 = parcel.readInt();
            fragmentManagerState.f21585u0 = parcel.readString();
            fragmentManagerState.v0 = parcel.createStringArrayList();
            fragmentManagerState.f21586w0 = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.f21587x0 = parcel.createStringArrayList();
            fragmentManagerState.f21588y0 = parcel.createTypedArrayList(Bundle.CREATOR);
            fragmentManagerState.E0 = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f21580p0);
        parcel.writeStringList(this.f21581q0);
        parcel.writeStringList(this.f21582r0);
        parcel.writeTypedArray(this.f21583s0, i10);
        parcel.writeInt(this.f21584t0);
        parcel.writeString(this.f21585u0);
        parcel.writeStringList(this.v0);
        parcel.writeTypedList(this.f21586w0);
        parcel.writeStringList(this.f21587x0);
        parcel.writeTypedList(this.f21588y0);
        parcel.writeTypedList(this.E0);
    }
}
