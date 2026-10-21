package com.bbva.image.extractor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageScaler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/image/extractor/NoScale;", "Lcom/bbva/image/extractor/ImageScaler;", "()V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class NoScale implements ImageScaler {

    @NotNull
    public static final NoScale INSTANCE = new NoScale();

    @Override // com.bbva.image.extractor.ImageScaler
    @NotNull
    public Bitmap postResize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return ImageScaler.DefaultImpls.postResize(this, bitmap);
    }

    @Override // com.bbva.image.extractor.ImageScaler
    public void preResize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        ImageScaler.DefaultImpls.preResize(this, options);
    }
}
