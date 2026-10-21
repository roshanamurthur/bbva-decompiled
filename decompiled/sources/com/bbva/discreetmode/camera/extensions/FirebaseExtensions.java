package com.bbva.discreetmode.camera.extensions;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.common.InputImage;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, d2 = {"toInputImage", "Lcom/google/mlkit/vision/common/InputImage;", "Landroidx/camera/core/ImageProxy;", "discreetmode_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "FirebaseExtensions")
public final class FirebaseExtensions {
    @SuppressLint({"UnsafeOptInUsageError"})
    @Nullable
    public static final InputImage toInputImage(@NotNull ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        Image image = imageProxy.getImage();
        if (image == null) {
            return null;
        }
        return InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
    }
}
