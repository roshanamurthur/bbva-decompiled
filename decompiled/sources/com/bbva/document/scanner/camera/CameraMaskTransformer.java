package com.bbva.document.scanner.camera;

import android.graphics.Bitmap;
import com.bbva.image.transform.ImageTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CameraMaskTransformer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/bbva/document/scanner/camera/CameraMaskTransformer;", "Lcom/bbva/image/transform/ImageTransformer;", "Landroid/graphics/Bitmap;", "bitmap", "transform", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "d", "Z", "getPerformResize", "()Z", "performResize", "Lcom/bbva/document/scanner/camera/Dimensions;", "previewDimensions", "Lcom/bbva/document/scanner/camera/FramePosition;", "maskDimensions", "<init>", "(Lcom/bbva/document/scanner/camera/Dimensions;Lcom/bbva/document/scanner/camera/FramePosition;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final class CameraMaskTransformer implements ImageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Dimensions f29126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FramePosition f29127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean performResize;

    public CameraMaskTransformer(@NotNull Dimensions previewDimensions, @NotNull FramePosition maskDimensions) {
        Intrinsics.checkNotNullParameter(previewDimensions, "previewDimensions");
        Intrinsics.checkNotNullParameter(maskDimensions, "maskDimensions");
        this.f29126a = previewDimensions;
        this.f29127b = maskDimensions;
        this.id = "camera-image-transformer";
        this.performResize = true;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    public boolean getPerformResize() {
        return this.performResize;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public Bitmap transform(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        FramePosition framePosition = this.f29127b;
        int left = framePosition.getLeft() * width;
        Dimensions dimensions = this.f29126a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, left / dimensions.getWidth(), (framePosition.getTop() * height) / dimensions.getHeight(), (framePosition.getWidth() * width) / dimensions.getWidth(), (framePosition.getHeight() * height) / dimensions.getHeight());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …dth, cropHeight\n        )");
        return bitmapCreateBitmap;
    }
}
