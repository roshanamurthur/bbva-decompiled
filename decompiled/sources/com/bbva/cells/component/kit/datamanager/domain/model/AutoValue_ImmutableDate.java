package com.bbva.cells.component.kit.datamanager.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.cells.component.kit.datamanager.domain.adapter.DateTypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ImmutableDate extends C$AutoValue_ImmutableDate {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final DateTypeAdapter f26680r0 = new DateTypeAdapter();
    public static final Parcelable.Creator<AutoValue_ImmutableDate> CREATOR = new a();

    public static class a implements Parcelable.Creator<AutoValue_ImmutableDate> {
        @Override // android.os.Parcelable.Creator
        public final AutoValue_ImmutableDate createFromParcel(Parcel parcel) {
            return new AutoValue_ImmutableDate(parcel.readString(), AutoValue_ImmutableDate.f26680r0.fromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoValue_ImmutableDate[] newArray(int i10) {
            return new AutoValue_ImmutableDate[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26678p0);
        f26680r0.toParcel(this.f26679q0, parcel);
    }
}
