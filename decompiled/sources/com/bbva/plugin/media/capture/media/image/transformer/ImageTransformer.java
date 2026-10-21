package com.bbva.plugin.media.capture.media.image.transformer;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageTransformer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/transformer/ImageTransformer;", "", "transform", "Landroid/graphics/Bitmap;", "bitmap", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public interface ImageTransformer {
    @NotNull
    Bitmap transform(@NotNull Bitmap bitmap);
}
