package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ParcelableCompat {

    public static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableCompatCreatorCallbacks<T> f20003a;

        public a(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
            this.f20003a = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public final T createFromParcel(Parcel parcel) {
            return this.f20003a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final T[] newArray(int i10) {
            return this.f20003a.newArray(i10);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f20003a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new a(parcelableCompatCreatorCallbacks);
    }
}
