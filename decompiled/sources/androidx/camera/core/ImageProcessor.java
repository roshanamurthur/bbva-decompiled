package androidx.camera.core;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ImageProcessor {

    public interface Request {
        @NonNull
        @AnyThread
        List<ImageProxy> getInputImages();

        @AnyThread
        int getOutputFormat();
    }

    public interface Response {
        @Nullable
        @AnyThread
        ImageProxy getOutputImage();
    }

    @NonNull
    Response process(@NonNull Request request);
}
