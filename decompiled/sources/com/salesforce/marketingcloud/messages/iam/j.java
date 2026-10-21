package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class j implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final String f64667e = "buttonClicked";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final String f64668f = "dismissed";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final String f64669g = "autoDismissed";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f64670h = "unknown";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final String f64671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final InAppMessage.Button f64672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f64673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final Date f64674d;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public j(@NonNull Parcel parcel) {
        this.f64671a = parcel.readString();
        this.f64672b = (InAppMessage.Button) parcel.readParcelable(InAppMessage.Button.class.getClassLoader());
        this.f64673c = parcel.readLong();
        this.f64674d = new Date(parcel.readLong());
    }

    public static j e() {
        return new j("unknown", new Date(), -1L, null);
    }

    @Nullable
    public InAppMessage.Button a() {
        return this.f64672b;
    }

    public long b() {
        return this.f64673c;
    }

    @NonNull
    public Date c() {
        return this.f64674d;
    }

    @NonNull
    public String d() {
        return this.f64671a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f64671a);
        parcel.writeParcelable(this.f64672b, i10);
        parcel.writeLong(this.f64673c);
        parcel.writeLong(this.f64674d.getTime());
    }

    private j(@NonNull String str, @NonNull Date date, long j10, @Nullable InAppMessage.Button button) {
        this.f64671a = str;
        this.f64673c = j10;
        this.f64672b = button;
        this.f64674d = date;
    }

    public static j a(Date date, long j10) {
        return new j(f64669g, date, j10, null);
    }

    public static j b(Date date, long j10) {
        return new j(f64668f, date, j10, null);
    }

    public static j a(Date date, long j10, InAppMessage.Button button) {
        return new j(f64667e, date, j10, button);
    }
}
