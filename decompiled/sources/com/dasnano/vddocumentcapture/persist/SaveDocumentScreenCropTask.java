package com.dasnano.vddocumentcapture.persist;

import android.content.Context;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.ImageUtils;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import com.veridas.metadata.entities.ArtifactClass;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SaveDocumentScreenCropTask.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\n\u0010\u0012\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\"\u0010#J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014R\u001b\u0010\u0012\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SaveDocumentScreenCropTask;", "Lcom/dasnano/vddocumentcapture/persist/SaveDocumentTask;", "Ljava/nio/ByteBuffer;", AuthConstants.IMAGE, "", "compressed", "Lcom/veridas/camera/resolution/Resolution;", "resolution", "Lcom/veridas/math/geometry/Rectangle;", "detection", "", "process", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "y0", "Lcom/veridas/math/geometry/Vector2;", "getDisplaySize", "()Lcom/veridas/math/geometry/Vector2;", "displaySize", "Landroid/content/Context;", "context", "", "maximumMegapixels", "Lcom/veridas/camera/picture/Picture;", "picture", "Lcom/veridas/metadata/entities/ArtifactClass;", "artifactClass", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "captureType", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "delegate", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "bidiCodes", "<init>", "(Landroid/content/Context;Lcom/veridas/math/geometry/Rectangle;DLcom/veridas/camera/picture/Picture;Lcom/veridas/metadata/entities/ArtifactClass;Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;Ljava/util/List;Lcom/veridas/math/geometry/Vector2;)V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class SaveDocumentScreenCropTask extends SaveDocumentTask {

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Vector2 displaySize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveDocumentScreenCropTask(@NotNull Context context, @NotNull Rectangle detection, double d2, @NotNull Picture picture, @NotNull ArtifactClass artifactClass, @NotNull VDEnums.VDCaptureType captureType, @NotNull SaveImageTask.Delegate delegate, @NotNull List<BidiCodeInfo> bidiCodes, @NotNull Vector2 displaySize) {
        super(context, detection, d2, picture, artifactClass, captureType, delegate, bidiCodes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detection, "detection");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(bidiCodes, "bidiCodes");
        Intrinsics.checkNotNullParameter(displaySize, "displaySize");
        this.displaySize = displaySize;
    }

    @NotNull
    public final Vector2 getDisplaySize() {
        return this.displaySize;
    }

    @Override // com.dasnano.vddocumentcapture.persist.SaveDocumentTask, com.dasnano.vddocumentcapture.persist.SaveImageTask
    public void process(@NotNull ByteBuffer image, @NotNull byte[] compressed, @NotNull Resolution resolution, @NotNull Rectangle detection) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(detection, "detection");
        double d2 = resolution.width;
        Vector2 vector2 = this.displaySize;
        int iRoundToInt = c.roundToInt(vector2.getY() * (d2 / vector2.getX()));
        int iRoundToInt2 = c.roundToInt(((double) (resolution.height - iRoundToInt)) / 2.0d);
        int i10 = resolution.width;
        int iCalculateBufferSizeForRgba = ImageUtils.INSTANCE.calculateBufferSizeForRgba(i10, iRoundToInt);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCalculateBufferSizeForRgba);
        ImageUtils imageUtils = getImageUtils();
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        imageUtils.crop(image, byteBufferAllocateDirect, resolution.width, resolution.height, 0, iRoundToInt2, i10, iRoundToInt);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iCalculateBufferSizeForRgba);
        ImageUtils imageUtils2 = getImageUtils();
        Intrinsics.checkNotNull(byteBufferAllocateDirect2);
        byte[] bArr = new byte[imageUtils2.compressJpeg(byteBufferAllocateDirect, byteBufferAllocateDirect2, i10, iRoundToInt)];
        byteBufferAllocateDirect2.get(bArr);
        getDelegate().processed(bArr, true);
        super.process(image, compressed, resolution, detection);
    }
}
