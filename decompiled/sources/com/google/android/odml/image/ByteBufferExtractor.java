package com.google.android.odml.image;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import re.e;
import re.f;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public class ByteBufferExtractor {
    @NonNull
    public static ByteBuffer extract(@NonNull MlImage mlImage) {
        f fVar = mlImage.f46005p0;
        if (fVar.zzb().f92995b == 2) {
            return ((e) fVar).f92999a.asReadOnlyBuffer();
        }
        throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }
}
