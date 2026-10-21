package com.dasnano.vddocumentcapture.persist;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.ImageUtils;
import com.veridas.math.geometry.Rectangle;
import com.veridas.metadata.entities.ArtifactClass;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SavePassportCropTask.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u001d"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SavePassportCropTask;", "Lcom/dasnano/vddocumentcapture/persist/SaveDocumentTask;", "context", "Landroid/content/Context;", "detection", "Lcom/veridas/math/geometry/Rectangle;", "maximumMegapixels", "", "picture", "Lcom/veridas/camera/picture/Picture;", "artifactClass", "Lcom/veridas/metadata/entities/ArtifactClass;", "captureType", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "delegate", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "bidiCodes", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "(Landroid/content/Context;Lcom/veridas/math/geometry/Rectangle;DLcom/veridas/camera/picture/Picture;Lcom/veridas/metadata/entities/ArtifactClass;Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;Ljava/util/List;)V", "process", "", AuthConstants.IMAGE, "Ljava/nio/ByteBuffer;", "compressed", "", "resolution", "Lcom/veridas/camera/resolution/Resolution;", "Companion", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SavePassportCropTask extends SaveDocumentTask {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavePassportCropTask(@NotNull Context context, @NotNull Rectangle detection, double d2, @NotNull Picture picture, @NotNull ArtifactClass artifactClass, @NotNull VDEnums.VDCaptureType captureType, @NotNull SaveImageTask.Delegate delegate, @NotNull List<BidiCodeInfo> bidiCodes) {
        super(context, detection, d2, picture, artifactClass, captureType, delegate, bidiCodes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detection, "detection");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(bidiCodes, "bidiCodes");
    }

    @Override // com.dasnano.vddocumentcapture.persist.SaveDocumentTask, com.dasnano.vddocumentcapture.persist.SaveImageTask
    public void process(@NotNull ByteBuffer image, @NotNull byte[] compressed, @NotNull Resolution resolution, @NotNull Rectangle detection) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(detection, "detection");
        int iRoundToInt = c.roundToInt(((double) resolution.height) * 0.05d);
        int iRoundToInt2 = c.roundToInt(detection.getPosition().getX()) - iRoundToInt;
        int i10 = iRoundToInt2 < 0 ? 0 : iRoundToInt2;
        int iRoundToInt3 = c.roundToInt(detection.getPosition().getY()) - iRoundToInt;
        int i11 = iRoundToInt3 < 0 ? 0 : iRoundToInt3;
        int iB = u.b(iRoundToInt, i10 != 0 ? 2 : 1, i10, c.roundToInt(detection.getDimensions().getX()));
        int i12 = resolution.width;
        if (iB > i12) {
            iB = i12 - i10;
        }
        int i13 = iB;
        int iB2 = u.b(iRoundToInt, i11 != 0 ? 2 : 1, i11, c.roundToInt(detection.getDimensions().getY()));
        int i14 = resolution.height;
        if (iB2 > i14) {
            iB2 = i14 - i11;
        }
        int iCalculateBufferSizeForRgba = ImageUtils.INSTANCE.calculateBufferSizeForRgba(i13, iB2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCalculateBufferSizeForRgba);
        ImageUtils imageUtils = getImageUtils();
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        imageUtils.crop(image, byteBufferAllocateDirect, resolution.width, resolution.height, i10, i11, i13, iB2);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iCalculateBufferSizeForRgba);
        ImageUtils imageUtils2 = getImageUtils();
        Intrinsics.checkNotNull(byteBufferAllocateDirect2);
        byte[] bArr = new byte[imageUtils2.compressJpeg(byteBufferAllocateDirect, byteBufferAllocateDirect2, i13, iB2)];
        byteBufferAllocateDirect2.get(bArr);
        getDelegate().processed(bArr, false);
        super.process(image, compressed, resolution, detection);
    }
}
