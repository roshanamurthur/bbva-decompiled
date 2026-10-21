package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.b;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(@NonNull ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    @NonNull
    public static Image dequeueInputImage(@NonNull ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i10, i11);
        }
        if (i12 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i10, i11);
        }
        throw new RuntimeException(b.a("Unable to call newInstance(Surface, int, int) on API ", i12, ". Version 26 or higher required."));
    }

    public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i10) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i10);
    }
}
