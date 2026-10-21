package uc;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: LruPoolStrategy.java */
/* JADX INFO: loaded from: classes9.dex */
public interface d {
    @Nullable
    Bitmap get(int i10, int i11, Bitmap.Config config);

    int getSize(Bitmap bitmap);

    String logBitmap(int i10, int i11, Bitmap.Config config);

    String logBitmap(Bitmap bitmap);

    void put(Bitmap bitmap);

    @Nullable
    Bitmap removeLast();
}
