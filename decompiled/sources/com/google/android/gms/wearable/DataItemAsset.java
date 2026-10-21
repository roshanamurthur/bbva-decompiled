package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public interface DataItemAsset extends Freezable<DataItemAsset> {
    String getDataItemKey();

    String getId();
}
