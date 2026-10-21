package com.bbva.image.extractor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageScaler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/image/extractor/ImageScaler;", "", "postResize", "Landroid/graphics/Bitmap;", "bitmap", "preResize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public interface ImageScaler {

    /* JADX INFO: compiled from: ImageScaler.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static final class DefaultImpls {
        @NotNull
        public static Bitmap postResize(@NotNull ImageScaler imageScaler, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return bitmap;
        }

        public static void preResize(@NotNull ImageScaler imageScaler, @NotNull BitmapFactory.Options options) {
            Intrinsics.checkNotNullParameter(options, "options");
        }
    }

    @NotNull
    Bitmap postResize(@NotNull Bitmap bitmap);

    void preResize(@NotNull BitmapFactory.Options options);
}
