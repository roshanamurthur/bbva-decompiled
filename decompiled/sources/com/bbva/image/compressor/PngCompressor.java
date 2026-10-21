package com.bbva.image.compressor;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PngCompressor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/image/compressor/PngCompressor;", "Lcom/bbva/image/compressor/ImageCompressor;", "Landroid/graphics/Bitmap;", "bitmap", "Ljava/io/File;", "target", "", "compress", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class PngCompressor extends ImageCompressor {

    @NotNull
    public static final String ID = "png";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id = ID;

    @Override // com.bbva.image.compressor.ImageCompressor
    public void compress(@NotNull Bitmap bitmap, @NotNull File target) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(target, "target");
        ImageCompressor.internalCompress$default(this, Bitmap.CompressFormat.PNG, bitmap, target, 0, 8, null);
    }

    @Override // com.bbva.image.compressor.ImageCompressor
    @NotNull
    public String getId() {
        return this.id;
    }
}
