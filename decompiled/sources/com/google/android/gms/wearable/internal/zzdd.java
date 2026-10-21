package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "DataItemParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzdd extends AbstractSafeParcelable implements DataItem {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    @SafeParcelable.Field(getter = "getData", id = 5)
    private byte[] data;

    @SafeParcelable.Field(getter = "getUri", id = 2)
    private final Uri uri;

    @SafeParcelable.Field(getter = "getAssetsInternal", id = 4, type = "android.os.Bundle")
    private final Map<String, DataItemAsset> zzdo;

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr) {
        this.uri = uri;
        HashMap map = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            map.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.zzdo = map;
        this.data = bArr;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        return this.zzdo;
    }

    @Override // com.google.android.gms.wearable.DataItem
    @VisibleForTesting
    public final byte[] getData() {
        return this.data;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final /* synthetic */ DataItem setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.data;
        String strValueOf = String.valueOf(bArr == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(bArr.length));
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 8);
        sb3.append(",dataSz=");
        sb3.append(strValueOf);
        sb2.append(sb3.toString());
        int size = this.zzdo.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb2.append(sb4.toString());
        String strValueOf2 = String.valueOf(this.uri);
        StringBuilder sb5 = new StringBuilder(strValueOf2.length() + 6);
        sb5.append(", uri=");
        sb5.append(strValueOf2);
        sb2.append(sb5.toString());
        if (!zIsLoggable) {
            sb2.append(Constant.BRACKET_CLOSE);
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : this.zzdo.keySet()) {
            String strValueOf3 = String.valueOf(this.zzdo.get(str));
            StringBuilder sb6 = new StringBuilder(strValueOf3.length() + n1.b(str, 7));
            sb6.append("\n    ");
            sb6.append(str);
            sb6.append(": ");
            sb6.append(strValueOf3);
            sb2.append(sb6.toString());
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i10, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry<String, DataItemAsset> entry : this.zzdo.entrySet()) {
            bundle.putParcelable(entry.getKey(), new DataItemAssetParcelable(entry.getValue()));
        }
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItem freeze() {
        return this;
    }
}
