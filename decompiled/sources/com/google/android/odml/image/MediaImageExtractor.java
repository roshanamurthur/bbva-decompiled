package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import re.f;
import re.g;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(19)
public class MediaImageExtractor {
    @NonNull
    public static Image extract(@NonNull MlImage mlImage) {
        f fVar = mlImage.f46005p0;
        if (fVar.zzb().f92995b == 3) {
            return ((g) fVar).f93001a;
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
