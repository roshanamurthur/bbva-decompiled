package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c f45753p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final c f45754q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f45755r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f45756s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f45757t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f45758u0;
    public int v0;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.f45755r0 == 1) {
            return this.f45756s0 % 24;
        }
        int i10 = this.f45756s0;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.v0 == 1 ? i10 - 12 : i10;
    }

    public final void c(int i10) {
        if (this.f45755r0 == 1) {
            this.f45756s0 = i10;
        } else {
            this.f45756s0 = (i10 % 12) + (this.v0 != 1 ? 0 : 12);
        }
    }

    public final void d(@IntRange(from = 0, to = 59) int i10) {
        this.f45757t0 = i10 % 60;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i10) {
        if (i10 != this.v0) {
            this.v0 = i10;
            int i11 = this.f45756s0;
            if (i11 < 12 && i10 == 1) {
                this.f45756s0 = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f45756s0 = i11 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f45756s0 == timeModel.f45756s0 && this.f45757t0 == timeModel.f45757t0 && this.f45755r0 == timeModel.f45755r0 && this.f45758u0 == timeModel.f45758u0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45755r0), Integer.valueOf(this.f45756s0), Integer.valueOf(this.f45757t0), Integer.valueOf(this.f45758u0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45756s0);
        parcel.writeInt(this.f45757t0);
        parcel.writeInt(this.f45758u0);
        parcel.writeInt(this.f45755r0);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f45756s0 = i10;
        this.f45757t0 = i11;
        this.f45758u0 = i12;
        this.f45755r0 = i13;
        this.v0 = i10 >= 12 ? 1 : 0;
        this.f45753p0 = new c(59);
        this.f45754q0 = new c(i13 == 1 ? 23 : 12);
    }
}
