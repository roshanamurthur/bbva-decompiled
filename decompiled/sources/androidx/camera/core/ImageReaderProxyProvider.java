package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ImageReaderProxyProvider {
    @NonNull
    ImageReaderProxy newInstance(int i10, int i11, int i12, int i13, long j10);
}
