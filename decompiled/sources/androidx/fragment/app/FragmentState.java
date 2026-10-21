package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final boolean E0;
    public final int F0;
    public Bundle G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f21594p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f21595q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f21596r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f21597s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f21598t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f21599u0;
    public final boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f21600w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f21601x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Bundle f21602y0;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f21594p0 = fragment.getClass().getName();
        this.f21595q0 = fragment.mWho;
        this.f21596r0 = fragment.mFromLayout;
        this.f21597s0 = fragment.mFragmentId;
        this.f21598t0 = fragment.mContainerId;
        this.f21599u0 = fragment.mTag;
        this.v0 = fragment.mRetainInstance;
        this.f21600w0 = fragment.mRemoving;
        this.f21601x0 = fragment.mDetached;
        this.f21602y0 = fragment.mArguments;
        this.E0 = fragment.mHidden;
        this.F0 = fragment.mMaxState.ordinal();
    }

    @NonNull
    public final Fragment a(@NonNull FragmentFactory fragmentFactory, @NonNull ClassLoader classLoader) {
        Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, this.f21594p0);
        Bundle bundle = this.f21602y0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle);
        fragmentInstantiate.mWho = this.f21595q0;
        fragmentInstantiate.mFromLayout = this.f21596r0;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f21597s0;
        fragmentInstantiate.mContainerId = this.f21598t0;
        fragmentInstantiate.mTag = this.f21599u0;
        fragmentInstantiate.mRetainInstance = this.v0;
        fragmentInstantiate.mRemoving = this.f21600w0;
        fragmentInstantiate.mDetached = this.f21601x0;
        fragmentInstantiate.mHidden = this.E0;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[this.F0];
        Bundle bundle2 = this.G0;
        if (bundle2 != null) {
            fragmentInstantiate.mSavedFragmentState = bundle2;
        } else {
            fragmentInstantiate.mSavedFragmentState = new Bundle();
        }
        return fragmentInstantiate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sbA = androidx.fragment.app.a.a(128, "FragmentState{");
        sbA.append(this.f21594p0);
        sbA.append(" (");
        sbA.append(this.f21595q0);
        sbA.append(")}:");
        if (this.f21596r0) {
            sbA.append(" fromLayout");
        }
        int i10 = this.f21598t0;
        if (i10 != 0) {
            sbA.append(" id=0x");
            sbA.append(Integer.toHexString(i10));
        }
        String str = this.f21599u0;
        if (str != null && !str.isEmpty()) {
            sbA.append(" tag=");
            sbA.append(str);
        }
        if (this.v0) {
            sbA.append(" retainInstance");
        }
        if (this.f21600w0) {
            sbA.append(" removing");
        }
        if (this.f21601x0) {
            sbA.append(" detached");
        }
        if (this.E0) {
            sbA.append(" hidden");
        }
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21594p0);
        parcel.writeString(this.f21595q0);
        parcel.writeInt(this.f21596r0 ? 1 : 0);
        parcel.writeInt(this.f21597s0);
        parcel.writeInt(this.f21598t0);
        parcel.writeString(this.f21599u0);
        parcel.writeInt(this.v0 ? 1 : 0);
        parcel.writeInt(this.f21600w0 ? 1 : 0);
        parcel.writeInt(this.f21601x0 ? 1 : 0);
        parcel.writeBundle(this.f21602y0);
        parcel.writeInt(this.E0 ? 1 : 0);
        parcel.writeBundle(this.G0);
        parcel.writeInt(this.F0);
    }

    public FragmentState(Parcel parcel) {
        this.f21594p0 = parcel.readString();
        this.f21595q0 = parcel.readString();
        this.f21596r0 = parcel.readInt() != 0;
        this.f21597s0 = parcel.readInt();
        this.f21598t0 = parcel.readInt();
        this.f21599u0 = parcel.readString();
        this.v0 = parcel.readInt() != 0;
        this.f21600w0 = parcel.readInt() != 0;
        this.f21601x0 = parcel.readInt() != 0;
        this.f21602y0 = parcel.readBundle();
        this.E0 = parcel.readInt() != 0;
        this.G0 = parcel.readBundle();
        this.F0 = parcel.readInt();
    }
}
