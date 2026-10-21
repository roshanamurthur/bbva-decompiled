package com.dasnano.vddocumentcapture.persist;

import android.content.Context;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.detect.spatial.bridge.DefaultSpatialObjectDetectorFactory;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageUtils;
import com.veridas.math.geometry.Rectangle;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.obj.CropRequest;
import com.veridas.obj.DocumentCropProviderFactory;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SaveDocumentCropTask.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u001c"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SaveDocumentCropTask;", "Lcom/dasnano/vddocumentcapture/persist/SaveDocumentTask;", "context", "Landroid/content/Context;", "detection", "Lcom/veridas/math/geometry/Rectangle;", "maximumMegapixels", "", "picture", "Lcom/veridas/camera/picture/Picture;", "artifactClass", "Lcom/veridas/metadata/entities/ArtifactClass;", "captureType", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "delegate", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "bidiCodes", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "(Landroid/content/Context;Lcom/veridas/math/geometry/Rectangle;DLcom/veridas/camera/picture/Picture;Lcom/veridas/metadata/entities/ArtifactClass;Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;Ljava/util/List;)V", "process", "", AuthConstants.IMAGE, "Ljava/nio/ByteBuffer;", "compressed", "", "resolution", "Lcom/veridas/camera/resolution/Resolution;", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SaveDocumentCropTask extends SaveDocumentTask {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveDocumentCropTask(@NotNull Context context, @NotNull Rectangle detection, double d2, @NotNull Picture picture, @NotNull ArtifactClass artifactClass, @NotNull VDEnums.VDCaptureType captureType, @NotNull SaveImageTask.Delegate delegate, @NotNull List<BidiCodeInfo> bidiCodes) {
        super(context, detection, d2, picture, artifactClass, captureType, delegate, bidiCodes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detection, "detection");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(bidiCodes, "bidiCodes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dasnano.vddocumentcapture.persist.SaveDocumentTask, com.dasnano.vddocumentcapture.persist.SaveImageTask
    public void process(@NotNull ByteBuffer image, @NotNull byte[] compressed, @NotNull Resolution resolution, @NotNull Rectangle detection) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(detection, "detection");
        Frame crop = new DocumentCropProviderFactory(getImageUtils(), new DefaultSpatialObjectDetectorFactory(null, 1, 0 == true ? 1 : 0)).create(getContext()).request(new CropRequest.Builder(null, null, null, null, 15, null).frame(Frame.INSTANCE.createBgra(image, resolution.width, resolution.height, 0)).detectedObject(detection).build()).getCrop();
        if (crop == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ByteBuffer data = crop.getData();
        Dimension dimensions = crop.getDimensions();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(ImageUtils.INSTANCE.calculateBufferSizeForRgba(dimensions));
        ImageUtils imageUtils = getImageUtils();
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        int iCompressJpeg = imageUtils.compressJpeg(data, byteBufferAllocateDirect, dimensions.getWidth(), dimensions.getHeight());
        if (byteBufferAllocateDirect.position() != 0) {
            byteBufferAllocateDirect.flip();
        }
        byte[] bArr = new byte[iCompressJpeg];
        byteBufferAllocateDirect.get(bArr);
        getDelegate().processed(bArr, true);
        super.process(image, compressed, resolution, detection);
    }
}
