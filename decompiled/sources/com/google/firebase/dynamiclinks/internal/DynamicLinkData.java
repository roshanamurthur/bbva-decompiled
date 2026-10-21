package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes10.dex */
@SafeParcelable.Class(creator = "DynamicLinkDataCreator")
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new DynamicLinkDataCreator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getDynamicLink", id = 1)
    public String f48335p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getDeepLink", id = 2)
    public String f48336q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinVersion", id = 3)
    public int f48337r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClickTimestamp", id = 4)
    public long f48338s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getExtensionBundle", id = 5)
    public Bundle f48339t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getRedirectUrl", id = 6)
    public Uri f48340u0;

    @SafeParcelable.Constructor
    public DynamicLinkData(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) long j10, @Nullable @SafeParcelable.Param(id = 5) Bundle bundle, @Nullable @SafeParcelable.Param(id = 6) Uri uri) {
        this.f48335p0 = str;
        this.f48336q0 = str2;
        this.f48337r0 = i10;
        this.f48338s0 = j10;
        this.f48339t0 = bundle;
        this.f48340u0 = uri;
    }

    public long getClickTimestamp() {
        return this.f48338s0;
    }

    @Nullable
    public String getDeepLink() {
        return this.f48336q0;
    }

    @Nullable
    public String getDynamicLink() {
        return this.f48335p0;
    }

    public Bundle getExtensionBundle() {
        Bundle bundle = this.f48339t0;
        return bundle == null ? new Bundle() : bundle;
    }

    public int getMinVersion() {
        return this.f48337r0;
    }

    @Nullable
    public Uri getRedirectUrl() {
        return this.f48340u0;
    }

    public void setClickTimestamp(long j10) {
        this.f48338s0 = j10;
    }

    public void setDeepLink(String str) {
        this.f48336q0 = str;
    }

    public void setDynamicLink(String str) {
        this.f48335p0 = str;
    }

    public void setExtensionData(Bundle bundle) {
        this.f48339t0 = bundle;
    }

    public void setMinVersion(int i10) {
        this.f48337r0 = i10;
    }

    public void setRedirectUrl(Uri uri) {
        this.f48340u0 = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getDynamicLink(), false);
        SafeParcelWriter.writeString(parcel, 2, getDeepLink(), false);
        SafeParcelWriter.writeInt(parcel, 3, getMinVersion());
        SafeParcelWriter.writeLong(parcel, 4, getClickTimestamp());
        SafeParcelWriter.writeBundle(parcel, 5, getExtensionBundle(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getRedirectUrl(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
