package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class zzdc implements DataItem {
    private byte[] data;
    private Uri uri;
    private Map<String, DataItemAsset> zzdo;

    public zzdc(DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.data = dataItem.getData();
        HashMap map = new HashMap();
        for (Map.Entry<String, DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getKey() != null) {
                map.put(entry.getKey(), entry.getValue().freeze());
            }
        }
        this.zzdo = Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        return this.zzdo;
    }

    @Override // com.google.android.gms.wearable.DataItem
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
    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemEntity{ ");
        String strValueOf = String.valueOf(this.uri);
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 4);
        sb3.append("uri=");
        sb3.append(strValueOf);
        sb2.append(sb3.toString());
        byte[] bArr = this.data;
        String strValueOf2 = String.valueOf(bArr == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(bArr.length));
        StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 9);
        sb4.append(", dataSz=");
        sb4.append(strValueOf2);
        sb2.append(sb4.toString());
        int size = this.zzdo.size();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(", numAssets=");
        sb5.append(size);
        sb2.append(sb5.toString());
        if (zIsLoggable && !this.zzdo.isEmpty()) {
            sb2.append(", assets=[");
            String str = "";
            for (Map.Entry<String, DataItemAsset> entry : this.zzdo.entrySet()) {
                String key = entry.getKey();
                String id = entry.getValue().getId();
                StringBuilder sb6 = new StringBuilder(n1.b(id, n1.b(key, str.length() + 2)));
                sb6.append(str);
                sb6.append(key);
                sb6.append(": ");
                sb6.append(id);
                sb2.append(sb6.toString());
                str = ", ";
            }
            sb2.append(Constant.BRACKET_CLOSE);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItem freeze() {
        return this;
    }
}
