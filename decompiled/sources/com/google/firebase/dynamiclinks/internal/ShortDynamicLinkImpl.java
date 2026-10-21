package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@SafeParcelable.Class(creator = "ShortDynamicLinkImplCreator")
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable implements ShortDynamicLink {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new ShortDynamicLinkImplCreator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getShortLink", id = 1)
    public final Uri f48354p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getPreviewLink", id = 2)
    public final Uri f48355q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWarnings", id = 3)
    public final List<WarningImpl> f48356r0;

    @SafeParcelable.Class(creator = "WarningImplCreator")
    public static class WarningImpl extends AbstractSafeParcelable implements ShortDynamicLink.Warning {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new WarningImplCreator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getMessage", id = 2)
        @SafeParcelable.Reserved({1})
        public final String f48357p0;

        @SafeParcelable.Constructor
        public WarningImpl(@SafeParcelable.Param(id = 2) String str) {
            this.f48357p0 = str;
        }

        @Override // com.google.firebase.dynamiclinks.ShortDynamicLink.Warning
        @Nullable
        public String getCode() {
            return null;
        }

        @Override // com.google.firebase.dynamiclinks.ShortDynamicLink.Warning
        public String getMessage() {
            return this.f48357p0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, getMessage(), false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public ShortDynamicLinkImpl(@Nullable @SafeParcelable.Param(id = 1) Uri uri, @Nullable @SafeParcelable.Param(id = 2) Uri uri2, @Nullable @SafeParcelable.Param(id = 3) List<WarningImpl> list) {
        this.f48354p0 = uri;
        this.f48355q0 = uri2;
        this.f48356r0 = list == null ? new ArrayList<>() : list;
    }

    @Override // com.google.firebase.dynamiclinks.ShortDynamicLink
    @Nullable
    public Uri getPreviewLink() {
        return this.f48355q0;
    }

    @Override // com.google.firebase.dynamiclinks.ShortDynamicLink
    @Nullable
    public Uri getShortLink() {
        return this.f48354p0;
    }

    @Override // com.google.firebase.dynamiclinks.ShortDynamicLink
    public List<WarningImpl> getWarnings() {
        return this.f48356r0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getShortLink(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getPreviewLink(), i10, false);
        SafeParcelWriter.writeTypedList(parcel, 3, getWarnings(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
