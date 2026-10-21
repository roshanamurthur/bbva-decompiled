package com.bbva.qr.scanner.camera;

import android.hardware.Camera;
import com.bbva.plugin.media.capture.util.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Preview.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/qr/scanner/camera/Preview;", "", "Lcom/bbva/qr/scanner/camera/FrameSize;", "size", "Lcom/bbva/qr/scanner/camera/Picture;", "selectPictureSize", "", "requestedFps", "", "selectFpsRange", "Landroid/hardware/Camera;", Constants.CAMERA_SRC, "", "aspectTolerance", "<init>", "(Landroid/hardware/Camera;D)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class Preview {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Camera f36314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f36315b;

    public Preview(@NotNull Camera camera, double d2) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f36314a = camera;
        this.f36315b = d2;
    }

    public final Camera.Size a(List<? extends Camera.Size> list, FrameSize frameSize) {
        double width = ((double) frameSize.getWidth()) / ((double) frameSize.getHeight());
        int width2 = frameSize.getWidth();
        Camera.Size size = null;
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.height) / ((double) size2.width)) - width) <= this.f36315b && Math.abs(size2.height - width2) < dAbs2) {
                dAbs2 = Math.abs(size2.height - width2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - width2) < dAbs) {
                    dAbs = Math.abs(size3.height - width2);
                    size = size3;
                }
            }
        }
        return size;
    }

    @Nullable
    public final int[] selectFpsRange(float requestedFps) {
        int i10 = (int) (requestedFps * 1000.0f);
        int[] iArr = null;
        int i11 = Integer.MAX_VALUE;
        for (int[] iArr2 : this.f36314a.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs = Math.abs(i10 - iArr2[0]) + Math.abs(i10 - iArr2[1]);
            if (iAbs < i11) {
                iArr = iArr2;
                i11 = iAbs;
            }
        }
        return iArr;
    }

    @Nullable
    public final Picture selectPictureSize(@NotNull FrameSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        Camera.Parameters parameters = this.f36314a.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Picture picture = null;
        Camera.Size sizeA = supportedPreviewSizes != null ? a(supportedPreviewSizes, size) : null;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Camera.Size sizeA2 = supportedPictureSizes != null ? a(supportedPictureSizes, size) : null;
        ArrayList<Picture> arrayList = new ArrayList();
        if (sizeA != null && sizeA2 != null) {
            arrayList.add(new Picture(sizeA, sizeA2));
        }
        if (parameters.getSupportedPreviewSizes() != null && arrayList.isEmpty()) {
            for (Camera.Size preview : parameters.getSupportedPreviewSizes()) {
                Intrinsics.checkNotNullExpressionValue(preview, "preview");
                arrayList.add(new Picture(preview, null, 2, null));
            }
        }
        int i10 = Integer.MAX_VALUE;
        for (Picture picture2 : arrayList) {
            Camera.Size preview2 = picture2.getPreview();
            int iAbs = Math.abs(preview2.height - size.getHeight()) + Math.abs(preview2.width - size.getWidth());
            if (iAbs < i10) {
                picture = picture2;
                i10 = iAbs;
            }
        }
        return picture;
    }

    public /* synthetic */ Preview(Camera camera, double d2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(camera, (i10 & 2) != 0 ? 0.1d : d2);
    }
}
