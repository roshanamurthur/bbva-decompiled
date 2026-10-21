package com.bbva.qrcreator.creator;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Creator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/bbva/qrcreator/creator/SystemBitmap;", "", "()V", "createBitmapObject", "Landroid/graphics/Bitmap;", "colors", "", "width", "", "height", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SystemBitmap {

    @NotNull
    public static final SystemBitmap INSTANCE = new SystemBitmap();

    @NotNull
    public final Bitmap createBitmapObject(@NotNull int[] colors, int width, int height, @NotNull Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(colors, width, height, bitmapConfig);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(colors, width, height, bitmapConfig)");
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return Bitmap.Config.ARGB_8888;
    }
}
