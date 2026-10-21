package com.veridas.detect.spatial.bridge;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.veridas.detect.DetectionRequestException;
import com.veridas.detect.FinishDetectorException;
import com.veridas.detect.ImageAnalysis;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.GeometricAnalysisBuilder;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageEncoding;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.KClassesJvm;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractSpatialObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u00016B)\u0012\u0018\b\u0002\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00130/j\b\u0012\u0004\u0012\u00020\u0013`0\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J3\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H$¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H$¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0004J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0004J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0004J\u0016\u0010\u001d\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0004J\u0016\u0010\u001e\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0004J\u0016\u0010\u001f\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0004J\u0016\u0010 \u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0004J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0004¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0004J\u0014\u0010'\u001a\u00020\u00052\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0004J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\u0010\u0010\r\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "", "reference", "", "", "classTypes", "memberNames", "bridgeFinish", "(J[Ljava/lang/String;[Ljava/lang/String;)J", "bridgeInitialize", "([Ljava/lang/String;[Ljava/lang/String;)J", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "result", "", "bridgeRequest", "([Ljava/lang/String;[Ljava/lang/String;JLcom/veridas/detect/Request;Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;)V", "Lcom/veridas/math/geometry/Rectangle;", "rectangle", "boundary", "", "isWithinBoundary", "isLargerThanBoundary", "createClassTypeList", "()[Ljava/lang/String;", "", "createFrameMemberNameList", "createImageAnalysisMemberNameList", "createIntermediateDetectionResultMemberNameList", "createRectangleMemberNameList", "createRequestMemberNameList", "createMemberNameList", "intermediateResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "prepareResult", "Lkotlin/reflect/KClass;", "c", "toJniClassName", "finish", "initialize", "J", "getReference", "()J", "setReference", "(J)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "bestResultComparator", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "geometricAnalysisBuilder", "<init>", "(Ljava/util/Comparator;Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;)V", "BestResultComparator", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractSpatialObjectDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,297:1\n37#2,2:298\n*S KotlinDebug\n*F\n+ 1 AbstractSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector\n*L\n178#1:298,2\n*E\n"})
public abstract class AbstractSpatialObjectDetector implements SpatialObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Comparator<Rectangle> f67009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeometricAnalysisBuilder f67010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long reference;

    /* JADX INFO: compiled from: AbstractSpatialObjectDetector.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector$BestResultComparator;", "Ljava/util/Comparator;", "Lcom/veridas/math/geometry/Rectangle;", "Lkotlin/Comparator;", "()V", "compare", "", "o1", "o2", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BestResultComparator implements Comparator<Rectangle> {
        @Override // java.util.Comparator
        public int compare(@Nullable Rectangle o2, @Nullable Rectangle o10) {
            return Double.compare(o2 == null ? 0.0d : o2.area(), o10 != null ? o10.area() : 0.0d);
        }
    }

    public AbstractSpatialObjectDetector(@NotNull Comparator<Rectangle> bestResultComparator, @NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
        Intrinsics.checkNotNullParameter(bestResultComparator, "bestResultComparator");
        Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
        this.f67009a = bestResultComparator;
        this.f67010b = geometricAnalysisBuilder;
    }

    public abstract long bridgeFinish(long reference, @NotNull String[] classTypes, @NotNull String[] memberNames);

    public abstract long bridgeInitialize(@NotNull String[] classTypes, @NotNull String[] memberNames);

    public abstract void bridgeRequest(@NotNull String[] classTypes, @NotNull String[] memberNames, long reference, @NotNull Request request, @NotNull IntermediateDetectionResult result);

    @NotNull
    public final String[] createClassTypeList() {
        String jniClassName = toJniClassName(Reflection.getOrCreateKotlinClass(String.class));
        String jniClassName2 = toJniClassName(Reflection.getOrCreateKotlinClass(Frame.class));
        String jniClassName3 = toJniClassName(Reflection.getOrCreateKotlinClass(ImageAnalysis.class));
        String jniClassName4 = toJniClassName(Reflection.getOrCreateKotlinClass(ImageEncoding.class));
        String jniClassName5 = toJniClassName(Reflection.getOrCreateKotlinClass(ByteBuffer.class));
        return new String[]{jniClassName, toJniClassName(Reflection.getOrCreateKotlinClass(Vector2.class)), toJniClassName(Reflection.getOrCreateKotlinClass(Rectangle.class)), toJniClassName(Reflection.getOrCreateKotlinClass(Dimension.class)), jniClassName5, jniClassName2, jniClassName4, jniClassName3, toJniClassName(Reflection.getOrCreateKotlinClass(Request.class)), toJniClassName(Reflection.getOrCreateKotlinClass(IntermediateDetectionResult.class))};
    }

    public final void createFrameMemberNameList(@NotNull List<String> memberNames) {
        Intrinsics.checkNotNullParameter(memberNames, "memberNames");
        memberNames.add("encoding");
        memberNames.add("code");
        memberNames.add("data");
        memberNames.add("dimensions");
        memberNames.add("width");
        memberNames.add("height");
        memberNames.add("orientation");
    }

    public final void createImageAnalysisMemberNameList(@NotNull List<String> memberNames) {
        Intrinsics.checkNotNullParameter(memberNames, "memberNames");
        memberNames.add("underExposureDetectionEnabled");
        memberNames.add("underExposureThreshold");
        memberNames.add("overExposureDetectionEnabled");
        memberNames.add("overExposureThreshold");
        memberNames.add("outOfFocusDetectionEnabled");
        memberNames.add("detectLightBlobs");
        memberNames.add("lightBlobMinArea");
        memberNames.add("lightBlobMaxArea");
        memberNames.add("lightBlobIntensity");
        memberNames.add("detectCameraFlash");
        memberNames.add("cameraFlashMinArea");
        memberNames.add("cameraFlashMaxArea");
        memberNames.add("cameraFlashIntensity");
        memberNames.add("isImageAnalysisEnabled");
    }

    public final void createIntermediateDetectionResultMemberNameList(@NotNull List<String> memberNames) {
        Intrinsics.checkNotNullParameter(memberNames, "memberNames");
        memberNames.add("putUnderExposureValue");
        memberNames.add("putOverExposureValue");
        memberNames.add("putOutOfFocusValue");
        memberNames.add("setCameraFlashes");
        memberNames.add("setCandidates");
        memberNames.add("setLightBlobs");
    }

    @NotNull
    public final String[] createMemberNameList() {
        ArrayList arrayList = new ArrayList();
        createRequestMemberNameList(arrayList);
        createIntermediateDetectionResultMemberNameList(arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void createRectangleMemberNameList(@NotNull List<String> memberNames) {
        Intrinsics.checkNotNullParameter(memberNames, "memberNames");
        memberNames.add("position");
        memberNames.add("x");
        memberNames.add("y");
        memberNames.add("dimensions");
        memberNames.add("x");
        memberNames.add("y");
    }

    public final void createRequestMemberNameList(@NotNull List<String> memberNames) {
        Intrinsics.checkNotNullParameter(memberNames, "memberNames");
        memberNames.add(ImageScaleTypeHandler.ID);
        memberNames.add("mirrored");
        memberNames.add(TypedValues.AttributesType.S_FRAME);
        createFrameMemberNameList(memberNames);
        memberNames.add("viewport");
        createRectangleMemberNameList(memberNames);
        memberNames.add("referenceObject");
        createRectangleMemberNameList(memberNames);
        memberNames.add("maxBoundary");
        createRectangleMemberNameList(memberNames);
        memberNames.add("imageAnalysis");
        createImageAnalysisMemberNameList(memberNames);
        memberNames.add("actualDetection");
        createRectangleMemberNameList(memberNames);
        memberNames.add("useCropAlgorithm");
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean finish() throws FinishDetectorException {
        long j10 = this.reference;
        if (j10 == 0) {
            throw new IllegalStateException("This objectDetector was not initialized.".toString());
        }
        try {
            this.reference = bridgeFinish(j10, new String[0], new String[0]);
            return true;
        } catch (Exception e5) {
            throw new FinishDetectorException(e5);
        }
    }

    public final long getReference() {
        return this.reference;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean initialize() throws InitializeDetectorException {
        if (this.reference != 0) {
            throw new IllegalStateException("This objectDetector has already been initialized.".toString());
        }
        try {
            this.reference = bridgeInitialize(createClassTypeList(), createMemberNameList());
            return true;
        } catch (Exception e5) {
            throw new InitializeDetectorException(e5);
        }
    }

    public final boolean isLargerThanBoundary(@NotNull Rectangle rectangle, @NotNull Rectangle boundary) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        if (boundary.isEmpty()) {
            return true;
        }
        return rectangle.envelops(boundary);
    }

    public final boolean isWithinBoundary(@NotNull Rectangle rectangle, @NotNull Rectangle boundary) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        if (boundary.isEmpty()) {
            return true;
        }
        return rectangle.within(boundary);
    }

    @NotNull
    public final SpatialDetectionResult prepareResult(@NotNull Request request, @NotNull IntermediateDetectionResult intermediateResult) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(intermediateResult, "intermediateResult");
        List<Rectangle> candidates = intermediateResult.getCandidates();
        Rectangle empty = Rectangle.INSTANCE.getEMPTY();
        if (!candidates.isEmpty()) {
            Rectangle maxBoundary = request.getMaxBoundary();
            Rectangle minBoundary = request.getMinBoundary();
            Rectangle rectangle = (Rectangle) CollectionsKt___CollectionsKt.first(CollectionsKt___CollectionsKt.sortedWith(candidates, this.f67009a));
            if (isLargerThanBoundary(rectangle, minBoundary) && isWithinBoundary(rectangle, maxBoundary)) {
                empty = rectangle;
            }
        }
        return new SpatialDetectionResult.Builder(null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 511, null).geometricAnalysis(this.f67010b.referenceObject(request.getReferenceObject()).result(empty).viewport(request.getViewport()).build()).intermediateDetectionResult(intermediateResult).request(request).candidate(empty).candidates(candidates).build();
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    @NotNull
    public SpatialDetectionResult request(@NotNull Request request) throws DetectionRequestException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.reference == 0) {
            throw new IllegalStateException("This objectDetector was not initialized.".toString());
        }
        if (!request.getFrame().getData().isDirect()) {
            throw new IllegalArgumentException("The frame data must be a direct buffer.".toString());
        }
        if (request.getFrame().getData().capacity() <= 0) {
            throw new IllegalArgumentException("The frame data was empty.".toString());
        }
        try {
            IntermediateDetectionResult intermediateDetectionResult = new IntermediateDetectionResult();
            bridgeRequest(new String[0], new String[0], this.reference, request, intermediateDetectionResult);
            return prepareResult(request, intermediateDetectionResult);
        } catch (Exception e5) {
            throw new DetectionRequestException(e5);
        }
    }

    public final void setReference(long j10) {
        this.reference = j10;
    }

    @NotNull
    public final String toJniClassName(@NotNull KClass<?> c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        return String.valueOf(l.replace$default(KClassesJvm.getJvmName(c10), Constant.DOT_STRING, "/", false, 4, (Object) null));
    }

    public /* synthetic */ AbstractSpatialObjectDetector(Comparator comparator, GeometricAnalysisBuilder geometricAnalysisBuilder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new BestResultComparator() : comparator, geometricAnalysisBuilder);
    }
}
