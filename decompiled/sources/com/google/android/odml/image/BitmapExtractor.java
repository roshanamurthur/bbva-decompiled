package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import re.d;
import re.f;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final class BitmapExtractor {
    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        f fVar = mlImage.f46005p0;
        if (fVar.zzb().f92995b == 1) {
            return ((d) fVar).f92997a;
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
