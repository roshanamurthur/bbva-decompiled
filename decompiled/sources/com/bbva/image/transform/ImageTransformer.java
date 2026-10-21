package com.bbva.image.transform;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bbva/image/transform/ImageTransformer;", "", "id", "", "getId", "()Ljava/lang/String;", "performResize", "", "getPerformResize", "()Z", "transform", "Landroid/graphics/Bitmap;", "bitmap", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public interface ImageTransformer {
    @NotNull
    String getId();

    boolean getPerformResize();

    @NotNull
    Bitmap transform(@NotNull Bitmap bitmap);
}
