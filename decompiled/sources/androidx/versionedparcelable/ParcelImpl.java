package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final VersionedParcelable f23845p0;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(VersionedParcelable versionedParcelable) {
        this.f23845p0 = versionedParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends VersionedParcelable> T getVersionedParcel() {
        return (T) this.f23845p0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        new androidx.versionedparcelable.a(parcel).writeVersionedParcelable(this.f23845p0);
    }

    public ParcelImpl(Parcel parcel) {
        this.f23845p0 = new androidx.versionedparcelable.a(parcel).readVersionedParcelable();
    }
}
