package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "PutDataRequestCreator")
@SafeParcelable.Reserved({1})
public class PutDataRequest extends AbstractSafeParcelable {
    public static final String WEAR_URI_SCHEME = "wear";

    @SafeParcelable.Field(getter = "getData", id = 5)
    private byte[] data;

    @SafeParcelable.Field(getter = "getUri", id = 2)
    private final Uri uri;

    @SafeParcelable.Field(getter = "getAssetsInternal", id = 4)
    private final Bundle zzv;

    @SafeParcelable.Field(getter = "getSyncDeadline", id = 6)
    private long zzw;
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new zzh();
    private static final long zzt = TimeUnit.MINUTES.toMillis(30);
    private static final Random zzu = new SecureRandom();

    @SafeParcelable.Constructor
    public PutDataRequest(@SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr, @SafeParcelable.Param(id = 6) long j10) {
        this.uri = uri;
        this.zzv = bundle;
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.data = bArr;
        this.zzw = j10;
    }

    public static PutDataRequest create(@NonNull String str) {
        Asserts.checkNotNull(str, "path must not be null");
        return zza(zza(str));
    }

    public static PutDataRequest createFromDataItem(@NonNull DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "source must not be null");
        PutDataRequest putDataRequestZza = zza(dataItem.getUri());
        for (Map.Entry<String, DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getValue().getId() == null) {
                String strValueOf = String.valueOf(entry.getKey());
                throw new IllegalStateException(strValueOf.length() != 0 ? "Cannot create an asset for a put request without a digest: ".concat(strValueOf) : new String("Cannot create an asset for a put request without a digest: "));
            }
            putDataRequestZza.putAsset(entry.getKey(), Asset.createFromRef(entry.getValue().getId()));
        }
        putDataRequestZza.setData(dataItem.getData());
        return putDataRequestZza;
    }

    public static PutDataRequest createWithAutoAppendedId(@NonNull String str) {
        Asserts.checkNotNull(str, "pathPrefix must not be null");
        StringBuilder sb2 = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb2.append("/");
        }
        sb2.append("PN");
        sb2.append(zzu.nextLong());
        return new PutDataRequest(zza(sb2.toString()));
    }

    public static PutDataRequest zza(@NonNull Uri uri) {
        Asserts.checkNotNull(uri, "uri must not be null");
        return new PutDataRequest(uri);
    }

    @VisibleForTesting
    public Asset getAsset(@NonNull String str) {
        Asserts.checkNotNull(str, "key must not be null");
        return (Asset) this.zzv.getParcelable(str);
    }

    public Map<String, Asset> getAssets() {
        HashMap map = new HashMap();
        for (String str : this.zzv.keySet()) {
            map.put(str, (Asset) this.zzv.getParcelable(str));
        }
        return Collections.unmodifiableMap(map);
    }

    @VisibleForTesting
    public byte[] getData() {
        return this.data;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean hasAsset(@NonNull String str) {
        Asserts.checkNotNull(str, "key must not be null");
        return this.zzv.containsKey(str);
    }

    public boolean isUrgent() {
        return this.zzw == 0;
    }

    public PutDataRequest putAsset(@NonNull String str, @NonNull Asset asset) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(asset);
        this.zzv.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest removeAsset(@NonNull String str) {
        Asserts.checkNotNull(str, "key must not be null");
        this.zzv.remove(str);
        return this;
    }

    public PutDataRequest setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public PutDataRequest setUrgent() {
        this.zzw = 0L;
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable(DataMap.TAG, 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Asserts.checkNotNull(parcel, "dest must not be null");
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i10, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzv, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public String toString(boolean z10) {
        StringBuilder sb2 = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.data;
        String strValueOf = String.valueOf(bArr == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(bArr.length));
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 7);
        sb3.append("dataSz=");
        sb3.append(strValueOf);
        sb2.append(sb3.toString());
        int size = this.zzv.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb2.append(sb4.toString());
        String strValueOf2 = String.valueOf(this.uri);
        StringBuilder sb5 = new StringBuilder(strValueOf2.length() + 6);
        sb5.append(", uri=");
        sb5.append(strValueOf2);
        sb2.append(sb5.toString());
        long j10 = this.zzw;
        StringBuilder sb6 = new StringBuilder(35);
        sb6.append(", syncDeadline=");
        sb6.append(j10);
        sb2.append(sb6.toString());
        if (!z10) {
            sb2.append(Constant.BRACKET_CLOSE);
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : this.zzv.keySet()) {
            String strValueOf3 = String.valueOf(this.zzv.getParcelable(str));
            StringBuilder sb7 = new StringBuilder(strValueOf3.length() + n1.b(str, 7));
            sb7.append("\n    ");
            sb7.append(str);
            sb7.append(": ");
            sb7.append(strValueOf3);
            sb2.append(sb7.toString());
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    private static Uri zza(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("/")) {
                if (!str.startsWith("//")) {
                    return new Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
                }
                throw new IllegalArgumentException("A path must start with a single / .");
            }
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        throw new IllegalArgumentException("An empty path was supplied.");
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), null, zzt);
    }
}
