package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.hardware.Camera;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return b.a.a((Camera.Size) obj, (Camera.Size) obj2);
    }
}
