package com.bbva.plugin.media.capture.media.image.compress;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JpegCompressor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/compress/JpegCompressor;", "Lcom/bbva/plugin/media/capture/media/image/compress/ImageCompressor;", "Landroid/graphics/Bitmap;", "bitmap", "", "compress", "", "compression", "Ljava/io/File;", "file", "<init>", "(ILjava/io/File;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class JpegCompressor implements ImageCompressor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f35849b;

    public JpegCompressor(int i10, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f35848a = i10;
        this.f35849b = file;
    }

    @Override // com.bbva.plugin.media.capture.media.image.compress.ImageCompressor
    @Nullable
    public String compress(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream[] outputStreamArr = {byteArrayOutputStream, new FileOutputStream(this.f35849b)};
        for (int i10 = 0; i10 < 2; i10++) {
            OutputStream outputStream = outputStreamArr[i10];
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.f35848a, outputStream);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(outputStream, th2);
                    throw th3;
                }
            }
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
