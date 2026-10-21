package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class zzdf extends DataBufferRef implements DataItem {
    private final int zzdl;

    public zzdf(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.zzdl = i11;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataItem freeze() {
        return new zzdc(this);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        HashMap map = new HashMap(this.zzdl);
        for (int i10 = 0; i10 < this.zzdl; i10++) {
            zzdb zzdbVar = new zzdb(this.mDataHolder, this.mDataRow + i10);
            if (zzdbVar.getDataItemKey() != null) {
                map.put(zzdbVar.getDataItemKey(), zzdbVar);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return getByteArray("data");
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        return Uri.parse(getString("path"));
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        byte[] data = getData();
        Map<String, DataItemAsset> assets = getAssets();
        StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
        String strValueOf = String.valueOf(getUri());
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 4);
        sb3.append("uri=");
        sb3.append(strValueOf);
        sb2.append(sb3.toString());
        String strValueOf2 = String.valueOf(data == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(data.length));
        StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 9);
        sb4.append(", dataSz=");
        sb4.append(strValueOf2);
        sb2.append(sb4.toString());
        int size = assets.size();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(", numAssets=");
        sb5.append(size);
        sb2.append(sb5.toString());
        if (zIsLoggable && !assets.isEmpty()) {
            sb2.append(", assets=[");
            String str = "";
            for (Map.Entry<String, DataItemAsset> entry : assets.entrySet()) {
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
}
