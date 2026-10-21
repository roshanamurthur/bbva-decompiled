package com.bbva.image.compressor;

import android.graphics.Bitmap;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageCompressor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J*\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/image/compressor/ImageCompressor;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "compress", "", "bitmap", "Landroid/graphics/Bitmap;", "target", "Ljava/io/File;", "internalCompress", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "file", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public abstract class ImageCompressor {
    public static /* synthetic */ void internalCompress$default(ImageCompressor imageCompressor, Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: internalCompress");
        }
        if ((i11 & 8) != 0) {
            i10 = 100;
        }
        imageCompressor.internalCompress(compressFormat, bitmap, file, i10);
    }

    public abstract void compress(@NotNull Bitmap bitmap, @NotNull File target);

    @NotNull
    public abstract String getId();

    public final void internalCompress(@NotNull Bitmap.CompressFormat compressFormat, @NotNull Bitmap bitmap, @NotNull File file, int quality) {
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(compressFormat, quality, fileOutputStream);
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
