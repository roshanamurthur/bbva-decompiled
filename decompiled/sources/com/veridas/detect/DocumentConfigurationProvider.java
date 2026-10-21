package com.veridas.detect;

import android.graphics.Bitmap;
import androidx.camera.core.processing.f;
import com.veridas.lib.entities.resources.DetectionParameters;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.DocumentFace;
import com.veridas.lib.entities.resources.Side;
import com.veridas.resource.AndroidResourcesUtil;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentConfigurationProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0003\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/veridas/detect/DocumentConfigurationProvider;", "Lcom/veridas/detect/ObjectConfigurationProvider;", "Lcom/veridas/detect/DetectableObjectConfiguration;", "get", "", "identifier", "", "identifiers", "Lcom/veridas/detect/ObjectConfigurationCollection;", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "a", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "getType", "()Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "type", "Lcom/veridas/lib/entities/resources/Side;", "b", "Lcom/veridas/lib/entities/resources/Side;", "getSide", "()Lcom/veridas/lib/entities/resources/Side;", "side", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "c", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "getResourcesDatabase", "()Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "resourcesDatabase", "<init>", "(Lcom/veridas/vdlibraryimageprocessing/CaptureType;Lcom/veridas/lib/entities/resources/Side;Lcom/veridas/resource/database/IBlockingResourcesDatabase;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDocumentConfigurationProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentConfigurationProvider.kt\ncom/veridas/detect/DocumentConfigurationProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1271#2,2:107\n1285#2,4:109\n*S KotlinDebug\n*F\n+ 1 DocumentConfigurationProvider.kt\ncom/veridas/detect/DocumentConfigurationProvider\n*L\n30#1:107,2\n30#1:109,4\n*E\n"})
public final class DocumentConfigurationProvider implements ObjectConfigurationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CaptureType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Side side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IBlockingResourcesDatabase resourcesDatabase;

    /* JADX INFO: compiled from: DocumentConfigurationProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.OBVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocumentConfigurationProvider(@NotNull CaptureType type, @NotNull Side side, @NotNull IBlockingResourcesDatabase resourcesDatabase) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        this.type = type;
        this.side = side;
        this.resourcesDatabase = resourcesDatabase;
    }

    public final DetectableObjectConfiguration a(String str, Side side) {
        DocumentFace obverse;
        IBlockingResourcesDatabase iBlockingResourcesDatabase = this.resourcesDatabase;
        Document documentById = iBlockingResourcesDatabase.getDocumentById(str);
        if (documentById == null) {
            return new DetectableObjectConfiguration(str, null, null, null, 0, 0.0d, false, 0.0d, 0.0d, 0, 0, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 134217726, null);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i10 == 1) {
            obverse = documentById.getObverse();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obverse = documentById.getReverse();
        }
        if (obverse == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        DetectionParameters detectionParameters = obverse.getDetectionParameters();
        if (detectionParameters == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String templateName = detectionParameters.getTemplateName();
        Bitmap bitmapBytesToBitmap = templateName != null ? AndroidResourcesUtil.bytesToBitmap(iBlockingResourcesDatabase.getTemplateBytes(templateName)) : null;
        String cascadeName = detectionParameters.getCascadeName();
        String strBytesToString = cascadeName != null ? AndroidResourcesUtil.bytesToString(iBlockingResourcesDatabase.getCascadeBytes(cascadeName)) : null;
        String id = documentById.getId();
        String cascadeName2 = detectionParameters.getCascadeName();
        int pyramidRange = detectionParameters.getPyramidRange();
        double pyramidFactor = detectionParameters.getPyramidFactor();
        boolean zIsGray = detectionParameters.isGray();
        double roiFactor = detectionParameters.getRoiFactor();
        double minFactorImgTemplate = detectionParameters.getMinFactorImgTemplate();
        int thresholdArea = detectionParameters.getThresholdArea();
        int prevMargin = detectionParameters.getPrevMargin();
        boolean rectangles = detectionParameters.getRectangles();
        double scale = detectionParameters.getScale();
        CaptureType captureType = CaptureType.VIDEO;
        CaptureType captureType2 = this.type;
        return new DetectableObjectConfiguration(id, bitmapBytesToBitmap, strBytesToString, cascadeName2, pyramidRange, pyramidFactor, zIsGray, roiFactor, minFactorImgTemplate, thresholdArea, prevMargin, rectangles, scale, captureType2 == captureType ? detectionParameters.getMinDivisorHeightVideo() : detectionParameters.getMinDivisorHeight(), captureType2 == captureType ? detectionParameters.getMinDivisorWidthVideo() : detectionParameters.getMinDivisorWidth(), 1.0d, 1.0d, detectionParameters.getNeighbours(), detectionParameters.getMinScore(), detectionParameters.getXTransformFactorXml(), detectionParameters.getYTransformFactorXml(), detectionParameters.getWidthTransformFactorXml(), detectionParameters.getHeightTransformFactorXml(), detectionParameters.getXTransformFactorTemplate(), detectionParameters.getYTransformFactorTemplate(), detectionParameters.getWidthTransformFactorTemplate(), detectionParameters.getHeightTransformFactorTemplate());
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public DetectableObjectConfiguration get() {
        throw new NotImplementedError(null, 1, null);
    }

    @NotNull
    public final IBlockingResourcesDatabase getResourcesDatabase() {
        return this.resourcesDatabase;
    }

    @NotNull
    public final Side getSide() {
        return this.side;
    }

    @NotNull
    public final CaptureType getType() {
        return this.type;
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public DetectableObjectConfiguration get(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(identifier, this.side);
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public ObjectConfigurationCollection get(@NotNull List<String> identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        List<String> list = identifiers;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(list, 10, 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, a((String) obj, this.side));
        }
        return new ObjectConfigurationCollection(linkedHashMap);
    }
}
