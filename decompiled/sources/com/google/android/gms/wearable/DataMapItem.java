package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public class DataMapItem {
    private final Uri uri;
    private final DataMap zzr;

    private DataMapItem(DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.zzr = zza(dataItem.freeze());
    }

    public static DataMapItem fromDataItem(@NonNull DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "dataItem must not be null");
        return new DataMapItem(dataItem);
    }

    private static DataMap zza(DataItem dataItem) {
        if (dataItem.getData() == null && dataItem.getAssets().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (dataItem.getData() == null) {
            return new DataMap();
        }
        try {
            ArrayList arrayList = new ArrayList();
            int size = dataItem.getAssets().size();
            for (int i10 = 0; i10 < size; i10++) {
                DataItemAsset dataItemAsset = dataItem.getAssets().get(Integer.toString(i10));
                if (dataItemAsset == null) {
                    String strValueOf = String.valueOf(dataItem);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 64);
                    sb2.append("Cannot find DataItemAsset referenced in data at ");
                    sb2.append(i10);
                    sb2.append(" for ");
                    sb2.append(strValueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
            }
            return com.google.android.gms.internal.wearable.zze.zza(new com.google.android.gms.internal.wearable.zzf(com.google.android.gms.internal.wearable.zzg.zza(dataItem.getData()), arrayList));
        } catch (com.google.android.gms.internal.wearable.zzs e5) {
            e = e5;
            String strValueOf2 = String.valueOf(dataItem.getUri());
            String strEncodeToString = Base64.encodeToString(dataItem.getData(), 0);
            StringBuilder sb3 = new StringBuilder(n1.b(strEncodeToString, strValueOf2.length() + 50));
            sb3.append("Unable to parse datamap from dataItem. uri=");
            sb3.append(strValueOf2);
            sb3.append(", data=");
            sb3.append(strEncodeToString);
            Log.w("DataItem", sb3.toString());
            String strValueOf3 = String.valueOf(dataItem.getUri());
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 44);
            sb4.append("Unable to parse datamap from dataItem.  uri=");
            sb4.append(strValueOf3);
            throw new IllegalStateException(sb4.toString(), e);
        } catch (NullPointerException e7) {
            e = e7;
            String strValueOf4 = String.valueOf(dataItem.getUri());
            String strEncodeToString2 = Base64.encodeToString(dataItem.getData(), 0);
            StringBuilder sb5 = new StringBuilder(n1.b(strEncodeToString2, strValueOf4.length() + 50));
            sb5.append("Unable to parse datamap from dataItem. uri=");
            sb5.append(strValueOf4);
            sb5.append(", data=");
            sb5.append(strEncodeToString2);
            Log.w("DataItem", sb5.toString());
            String strValueOf5 = String.valueOf(dataItem.getUri());
            StringBuilder sb6 = new StringBuilder(strValueOf5.length() + 44);
            sb6.append("Unable to parse datamap from dataItem.  uri=");
            sb6.append(strValueOf5);
            throw new IllegalStateException(sb6.toString(), e);
        }
    }

    public DataMap getDataMap() {
        return this.zzr;
    }

    public Uri getUri() {
        return this.uri;
    }
}
