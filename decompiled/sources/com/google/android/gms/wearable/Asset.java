package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "AssetCreator")
@SafeParcelable.Reserved({1})
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getData", id = 2)
    private byte[] data;

    @SafeParcelable.Field(id = 5)
    private Uri uri;

    @SafeParcelable.Field(getter = "getDigest", id = 3)
    private String zze;

    @SafeParcelable.Field(id = 4)
    private ParcelFileDescriptor zzf;

    @SafeParcelable.Constructor
    public Asset(@SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) Uri uri) {
        this.data = bArr;
        this.zze = str;
        this.zzf = parcelFileDescriptor;
        this.uri = uri;
    }

    @VisibleForTesting
    public static Asset createFromBytes(@NonNull byte[] bArr) {
        Asserts.checkNotNull(bArr);
        return new Asset(bArr, null, null, null);
    }

    @VisibleForTesting
    public static Asset createFromFd(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        Asserts.checkNotNull(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public static Asset createFromRef(@NonNull String str) {
        Asserts.checkNotNull(str);
        return new Asset(null, str, null, null);
    }

    @VisibleForTesting
    public static Asset createFromUri(@NonNull Uri uri) {
        Asserts.checkNotNull(uri);
        return new Asset(null, null, null, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.data, asset.data) && Objects.equal(this.zze, asset.zze) && Objects.equal(this.zzf, asset.zzf) && Objects.equal(this.uri, asset.uri);
    }

    public final byte[] getData() {
        return this.data;
    }

    public String getDigest() {
        return this.zze;
    }

    public ParcelFileDescriptor getFd() {
        return this.zzf;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.data, this.zze, this.zzf, this.uri});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Asset[@");
        sb2.append(Integer.toHexString(hashCode()));
        if (this.zze == null) {
            sb2.append(", nodigest");
        } else {
            sb2.append(", ");
            sb2.append(this.zze);
        }
        if (this.data != null) {
            sb2.append(", size=");
            sb2.append(this.data.length);
        }
        if (this.zzf != null) {
            sb2.append(", fd=");
            sb2.append(this.zzf);
        }
        if (this.uri != null) {
            sb2.append(", uri=");
            sb2.append(this.uri);
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Asserts.checkNotNull(parcel);
        int i11 = i10 | 1;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.data, false);
        SafeParcelWriter.writeString(parcel, 3, getDigest(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.uri, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
