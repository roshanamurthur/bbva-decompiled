package com.bbva.plugin.media.capture.media.image.resizer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Resizer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/resizer/NonResize;", "Lcom/bbva/plugin/media/capture/media/image/resizer/Resizer;", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class NonResize implements Resizer {

    @NotNull
    public static final NonResize INSTANCE = new NonResize();

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    @NotNull
    public Bitmap postResize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return Resizer.DefaultImpls.postResize(this, bitmap);
    }

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    public void preResize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Resizer.DefaultImpls.preResize(this, options);
    }
}
