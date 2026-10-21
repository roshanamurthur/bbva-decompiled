package com.veridas.detect;

import android.graphics.Bitmap;
import androidx.camera.core.processing.f;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DetectableObjectConfiguration.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u007f\b\u0086\b\u0018\u0000 \u0090\u00012\u00020\u0001:\u0002\u0090\u0001B\u009f\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u0010.\u001a\u00020\u0012\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0012\u0012\b\b\u0002\u00101\u001a\u00020\u0012\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00103\u001a\u00020\u0010\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0012\u0012\b\b\u0002\u00106\u001a\u00020\u0012\u0012\b\b\u0002\u00107\u001a\u00020\u0012\u0012\b\b\u0002\u00108\u001a\u00020\u0012\u0012\b\b\u0002\u00109\u001a\u00020\u0012\u0012\b\b\u0002\u0010:\u001a\u00020\u0010\u0012\b\b\u0002\u0010;\u001a\u00020\u0012\u0012\b\b\u0002\u0010<\u001a\u00020\u0012\u0012\b\b\u0002\u0010=\u001a\u00020\u0012\u0012\b\b\u0002\u0010>\u001a\u00020\u0012\u0012\b\b\u0002\u0010?\u001a\u00020\u0012\u0012\b\b\u0002\u0010@\u001a\u00020\u0012\u0012\b\b\u0002\u0010A\u001a\u00020\u0012\u0012\b\b\u0002\u0010B\u001a\u00020\u0012\u0012\b\b\u0002\u0010C\u001a\u00020\u0012¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0012HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0012HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0012HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0012HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0012HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0010HÆ\u0003J\t\u0010 \u001a\u00020\u0012HÆ\u0003J\t\u0010!\u001a\u00020\u0012HÆ\u0003J\t\u0010\"\u001a\u00020\u0012HÆ\u0003J\t\u0010#\u001a\u00020\u0012HÆ\u0003J\t\u0010$\u001a\u00020\u0012HÆ\u0003J\t\u0010%\u001a\u00020\u0012HÆ\u0003J\t\u0010&\u001a\u00020\u0012HÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0012HÆ\u0003J\u009f\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00102\b\b\u0002\u0010;\u001a\u00020\u00122\b\b\u0002\u0010<\u001a\u00020\u00122\b\b\u0002\u0010=\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u00122\b\b\u0002\u0010B\u001a\u00020\u00122\b\b\u0002\u0010C\u001a\u00020\u0012HÆ\u0001J\t\u0010E\u001a\u00020\u0010HÖ\u0001J\u0013\u0010G\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010)\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010*\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010+\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u0019\u0010,\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010KR\u0017\u0010-\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010.\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b/\u0010^R\u0017\u00100\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[R\u0017\u00101\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\ba\u0010Y\u001a\u0004\bb\u0010[R\u0017\u00102\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bd\u0010WR\u0017\u00103\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\be\u0010U\u001a\u0004\bf\u0010WR\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bh\u0010^R\u0017\u00105\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bi\u0010Y\u001a\u0004\bj\u0010[R\u0017\u00106\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010[R\u0017\u00107\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bm\u0010Y\u001a\u0004\bn\u0010[R\u0017\u00108\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bo\u0010Y\u001a\u0004\bp\u0010[R\u0017\u00109\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bq\u0010Y\u001a\u0004\br\u0010[R\u0017\u0010:\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bs\u0010U\u001a\u0004\bt\u0010WR\u0017\u0010;\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bu\u0010Y\u001a\u0004\bv\u0010[R\u0017\u0010<\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bw\u0010Y\u001a\u0004\bx\u0010[R\u0017\u0010=\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\by\u0010Y\u001a\u0004\bz\u0010[R\u0017\u0010>\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b{\u0010Y\u001a\u0004\b|\u0010[R\u0017\u0010?\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b}\u0010Y\u001a\u0004\b~\u0010[R\u0018\u0010@\u001a\u00020\u00128\u0006¢\u0006\r\n\u0004\b\u007f\u0010Y\u001a\u0005\b\u0080\u0001\u0010[R\u0019\u0010A\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010Y\u001a\u0005\b\u0082\u0001\u0010[R\u0019\u0010B\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010Y\u001a\u0005\b\u0084\u0001\u0010[R\u0019\u0010C\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010Y\u001a\u0005\b\u0086\u0001\u0010[R\u001a\u0010\u0089\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010]\u001a\u0005\b\u0088\u0001\u0010^R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010]\u001a\u0005\b\u008b\u0001\u0010^R\u0019\u0010\u008d\u0001\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bY\u0010]\u001a\u0005\b\u008c\u0001\u0010^¨\u0006\u0091\u0001"}, d2 = {"Lcom/veridas/detect/DetectableObjectConfiguration;", "", "", "rectangleDetectionCapable", "", "Lcom/veridas/detect/DetectionMode;", "getAvailableDetectionModes", "isIntelligent", "isNotIntelligent", "", "toString", "component1", "Landroid/graphics/Bitmap;", "component2", "component3", "component4", "", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "documentId", "template", "cascadeFile", "cascadePath", "pyramidRange", "pyramidFactor", "isGray", "roiFactor", "minimumFactor", "thresholdArea", "previousMargin", "rectangles", ImageScaleTypeHandler.ID, "minDivisorHeight", "minDivisorWidth", "maxDivisorHeight", "maxDivisorWidth", "neighbours", "minScore", "xTransformationFactor", "yTransformationFactor", "widthTransformationFactor", "heightTransformationFactor", "xTemplateTransformationFactor", "yTemplateTransformationFactor", "widthTemplateTransformationFactor", "heightTemplateTransformationFactor", "copy", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getDocumentId", "()Ljava/lang/String;", "b", "Landroid/graphics/Bitmap;", "getTemplate", "()Landroid/graphics/Bitmap;", "c", "getCascadeFile", "d", "getCascadePath", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPyramidRange", "()I", "f", "D", "getPyramidFactor", "()D", "g", "Z", "()Z", "h", "getRoiFactor", "i", "getMinimumFactor", "j", "getThresholdArea", "k", "getPreviousMargin", "l", "getRectangles", "m", "getScale", "n", "getMinDivisorHeight", "o", "getMinDivisorWidth", "p", "getMaxDivisorHeight", "q", "getMaxDivisorWidth", "r", "getNeighbours", "s", "getMinScore", "t", "getXTransformationFactor", "u", "getYTransformationFactor", SharedPrefsStorage.VERSION_KEY, "getWidthTransformationFactor", "w", "getHeightTransformationFactor", "x", "getXTemplateTransformationFactor", "y", "getYTemplateTransformationFactor", "z", "getWidthTemplateTransformationFactor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getHeightTemplateTransformationFactor", "B", "getCascadeDetectionCapable", "cascadeDetectionCapable", "C", "getRectangleDetectionCapable", "getTemplateDetectionCapable", "templateDetectionCapable", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;IDZDDIIZDDDDDIDDDDDDDDD)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DetectableObjectConfiguration {
    public static final double HEIGHT_TRANSFORMATION_FACTOR_MIN = 1.0d;
    public static final double MINIMUM_DIVISOR_VALUE = 1.0d;
    public static final int MINIMUM_NEIGHBOURS_NUMBER = 0;
    public static final double MINIMUM_SCALE = 1.0d;
    public static final int MINIMUM_SCORE_VALUE = 0;
    public static final double WIDTH_TRANSFORMATION_FACTOR_MIN = 1.0d;
    public static final double X_TRANSFORMATION_FACTOR_MIN = 0.0d;
    public static final double Y_TRANSFORMATION_FACTOR_MIN = 0.0d;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final double heightTemplateTransformationFactor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final boolean cascadeDetectionCapable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean rectangleDetectionCapable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final boolean templateDetectionCapable;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap template;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cascadeFile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cascadePath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int pyramidRange;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final double pyramidFactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isGray;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final double roiFactor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final double minimumFactor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int thresholdArea;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int previousMargin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean rectangles;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final double scale;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorHeight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final double maxDivisorHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final double maxDivisorWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int neighbours;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final double minScore;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final double xTransformationFactor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final double yTransformationFactor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final double widthTransformationFactor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final double heightTransformationFactor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final double xTemplateTransformationFactor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final double yTemplateTransformationFactor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final double widthTemplateTransformationFactor;

    public DetectableObjectConfiguration() {
        this(null, null, null, null, 0, 0.0d, false, 0.0d, 0.0d, 0, 0, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 134217727, null);
    }

    public static /* synthetic */ List getAvailableDetectionModes$default(DetectableObjectConfiguration detectableObjectConfiguration, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return detectableObjectConfiguration.getAvailableDetectionModes(z10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getThresholdArea() {
        return this.thresholdArea;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPreviousMargin() {
        return this.previousMargin;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getRectangles() {
        return this.rectangles;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getMinDivisorHeight() {
        return this.minDivisorHeight;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getMinDivisorWidth() {
        return this.minDivisorWidth;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getMaxDivisorHeight() {
        return this.maxDivisorHeight;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getMaxDivisorWidth() {
        return this.maxDivisorWidth;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getNeighbours() {
        return this.neighbours;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getMinScore() {
        return this.minScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getTemplate() {
        return this.template;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getXTransformationFactor() {
        return this.xTransformationFactor;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final double getYTransformationFactor() {
        return this.yTransformationFactor;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getWidthTransformationFactor() {
        return this.widthTransformationFactor;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getHeightTransformationFactor() {
        return this.heightTransformationFactor;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final double getXTemplateTransformationFactor() {
        return this.xTemplateTransformationFactor;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final double getYTemplateTransformationFactor() {
        return this.yTemplateTransformationFactor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final double getWidthTemplateTransformationFactor() {
        return this.widthTemplateTransformationFactor;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final double getHeightTemplateTransformationFactor() {
        return this.heightTemplateTransformationFactor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCascadeFile() {
        return this.cascadeFile;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCascadePath() {
        return this.cascadePath;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPyramidRange() {
        return this.pyramidRange;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getPyramidFactor() {
        return this.pyramidFactor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsGray() {
        return this.isGray;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getRoiFactor() {
        return this.roiFactor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getMinimumFactor() {
        return this.minimumFactor;
    }

    @NotNull
    public final DetectableObjectConfiguration copy(@Nullable String documentId, @Nullable Bitmap template, @Nullable String cascadeFile, @Nullable String cascadePath, int pyramidRange, double pyramidFactor, boolean isGray, double roiFactor, double minimumFactor, int thresholdArea, int previousMargin, boolean rectangles, double scale, double minDivisorHeight, double minDivisorWidth, double maxDivisorHeight, double maxDivisorWidth, int neighbours, double minScore, double xTransformationFactor, double yTransformationFactor, double widthTransformationFactor, double heightTransformationFactor, double xTemplateTransformationFactor, double yTemplateTransformationFactor, double widthTemplateTransformationFactor, double heightTemplateTransformationFactor) {
        return new DetectableObjectConfiguration(documentId, template, cascadeFile, cascadePath, pyramidRange, pyramidFactor, isGray, roiFactor, minimumFactor, thresholdArea, previousMargin, rectangles, scale, minDivisorHeight, minDivisorWidth, maxDivisorHeight, maxDivisorWidth, neighbours, minScore, xTransformationFactor, yTransformationFactor, widthTransformationFactor, heightTransformationFactor, xTemplateTransformationFactor, yTemplateTransformationFactor, widthTemplateTransformationFactor, heightTemplateTransformationFactor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectableObjectConfiguration)) {
            return false;
        }
        DetectableObjectConfiguration detectableObjectConfiguration = (DetectableObjectConfiguration) other;
        return Intrinsics.areEqual(this.documentId, detectableObjectConfiguration.documentId) && Intrinsics.areEqual(this.template, detectableObjectConfiguration.template) && Intrinsics.areEqual(this.cascadeFile, detectableObjectConfiguration.cascadeFile) && Intrinsics.areEqual(this.cascadePath, detectableObjectConfiguration.cascadePath) && this.pyramidRange == detectableObjectConfiguration.pyramidRange && Double.compare(this.pyramidFactor, detectableObjectConfiguration.pyramidFactor) == 0 && this.isGray == detectableObjectConfiguration.isGray && Double.compare(this.roiFactor, detectableObjectConfiguration.roiFactor) == 0 && Double.compare(this.minimumFactor, detectableObjectConfiguration.minimumFactor) == 0 && this.thresholdArea == detectableObjectConfiguration.thresholdArea && this.previousMargin == detectableObjectConfiguration.previousMargin && this.rectangles == detectableObjectConfiguration.rectangles && Double.compare(this.scale, detectableObjectConfiguration.scale) == 0 && Double.compare(this.minDivisorHeight, detectableObjectConfiguration.minDivisorHeight) == 0 && Double.compare(this.minDivisorWidth, detectableObjectConfiguration.minDivisorWidth) == 0 && Double.compare(this.maxDivisorHeight, detectableObjectConfiguration.maxDivisorHeight) == 0 && Double.compare(this.maxDivisorWidth, detectableObjectConfiguration.maxDivisorWidth) == 0 && this.neighbours == detectableObjectConfiguration.neighbours && Double.compare(this.minScore, detectableObjectConfiguration.minScore) == 0 && Double.compare(this.xTransformationFactor, detectableObjectConfiguration.xTransformationFactor) == 0 && Double.compare(this.yTransformationFactor, detectableObjectConfiguration.yTransformationFactor) == 0 && Double.compare(this.widthTransformationFactor, detectableObjectConfiguration.widthTransformationFactor) == 0 && Double.compare(this.heightTransformationFactor, detectableObjectConfiguration.heightTransformationFactor) == 0 && Double.compare(this.xTemplateTransformationFactor, detectableObjectConfiguration.xTemplateTransformationFactor) == 0 && Double.compare(this.yTemplateTransformationFactor, detectableObjectConfiguration.yTemplateTransformationFactor) == 0 && Double.compare(this.widthTemplateTransformationFactor, detectableObjectConfiguration.widthTemplateTransformationFactor) == 0 && Double.compare(this.heightTemplateTransformationFactor, detectableObjectConfiguration.heightTemplateTransformationFactor) == 0;
    }

    @NotNull
    public final List<DetectionMode> getAvailableDetectionModes(boolean rectangleDetectionCapable) {
        ArrayList arrayList = new ArrayList();
        if (this.cascadeDetectionCapable) {
            arrayList.add(DetectionMode.XML);
        }
        if (this.templateDetectionCapable) {
            arrayList.add(DetectionMode.TEMPLATE);
        }
        if (rectangleDetectionCapable) {
            arrayList.add(DetectionMode.RECTANGLE);
        }
        return arrayList;
    }

    public final boolean getCascadeDetectionCapable() {
        return this.cascadeDetectionCapable;
    }

    @Nullable
    public final String getCascadeFile() {
        return this.cascadeFile;
    }

    @Nullable
    public final String getCascadePath() {
        return this.cascadePath;
    }

    @Nullable
    public final String getDocumentId() {
        return this.documentId;
    }

    public final double getHeightTemplateTransformationFactor() {
        return this.heightTemplateTransformationFactor;
    }

    public final double getHeightTransformationFactor() {
        return this.heightTransformationFactor;
    }

    public final double getMaxDivisorHeight() {
        return this.maxDivisorHeight;
    }

    public final double getMaxDivisorWidth() {
        return this.maxDivisorWidth;
    }

    public final double getMinDivisorHeight() {
        return this.minDivisorHeight;
    }

    public final double getMinDivisorWidth() {
        return this.minDivisorWidth;
    }

    public final double getMinScore() {
        return this.minScore;
    }

    public final double getMinimumFactor() {
        return this.minimumFactor;
    }

    public final int getNeighbours() {
        return this.neighbours;
    }

    public final int getPreviousMargin() {
        return this.previousMargin;
    }

    public final double getPyramidFactor() {
        return this.pyramidFactor;
    }

    public final int getPyramidRange() {
        return this.pyramidRange;
    }

    public final boolean getRectangleDetectionCapable() {
        return this.rectangleDetectionCapable;
    }

    public final boolean getRectangles() {
        return this.rectangles;
    }

    public final double getRoiFactor() {
        return this.roiFactor;
    }

    public final double getScale() {
        return this.scale;
    }

    @Nullable
    public final Bitmap getTemplate() {
        return this.template;
    }

    public final boolean getTemplateDetectionCapable() {
        return this.templateDetectionCapable;
    }

    public final int getThresholdArea() {
        return this.thresholdArea;
    }

    public final double getWidthTemplateTransformationFactor() {
        return this.widthTemplateTransformationFactor;
    }

    public final double getWidthTransformationFactor() {
        return this.widthTransformationFactor;
    }

    public final double getXTemplateTransformationFactor() {
        return this.xTemplateTransformationFactor;
    }

    public final double getXTransformationFactor() {
        return this.xTransformationFactor;
    }

    public final double getYTemplateTransformationFactor() {
        return this.yTemplateTransformationFactor;
    }

    public final double getYTransformationFactor() {
        return this.yTransformationFactor;
    }

    public int hashCode() {
        String str = this.documentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.template;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str2 = this.cascadeFile;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cascadePath;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.pyramidRange) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.pyramidFactor);
        int i10 = (((iHashCode4 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.isGray ? 1231 : 1237)) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.roiFactor);
        int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.minimumFactor);
        int i12 = (((((((i11 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31) + this.thresholdArea) * 31) + this.previousMargin) * 31) + (this.rectangles ? 1231 : 1237)) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.scale);
        int i13 = (i12 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.minDivisorHeight);
        int i14 = (i13 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.minDivisorWidth);
        int i15 = (i14 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.maxDivisorHeight);
        int i16 = (i15 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31;
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.maxDivisorWidth);
        int i17 = (((i16 + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + this.neighbours) * 31;
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.minScore);
        int i18 = (i17 + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)))) * 31;
        long jDoubleToLongBits10 = Double.doubleToLongBits(this.xTransformationFactor);
        int i19 = (i18 + ((int) (jDoubleToLongBits10 ^ (jDoubleToLongBits10 >>> 32)))) * 31;
        long jDoubleToLongBits11 = Double.doubleToLongBits(this.yTransformationFactor);
        int i20 = (i19 + ((int) (jDoubleToLongBits11 ^ (jDoubleToLongBits11 >>> 32)))) * 31;
        long jDoubleToLongBits12 = Double.doubleToLongBits(this.widthTransformationFactor);
        int i21 = (i20 + ((int) (jDoubleToLongBits12 ^ (jDoubleToLongBits12 >>> 32)))) * 31;
        long jDoubleToLongBits13 = Double.doubleToLongBits(this.heightTransformationFactor);
        int i22 = (i21 + ((int) (jDoubleToLongBits13 ^ (jDoubleToLongBits13 >>> 32)))) * 31;
        long jDoubleToLongBits14 = Double.doubleToLongBits(this.xTemplateTransformationFactor);
        int i23 = (i22 + ((int) (jDoubleToLongBits14 ^ (jDoubleToLongBits14 >>> 32)))) * 31;
        long jDoubleToLongBits15 = Double.doubleToLongBits(this.yTemplateTransformationFactor);
        int i24 = (i23 + ((int) (jDoubleToLongBits15 ^ (jDoubleToLongBits15 >>> 32)))) * 31;
        long jDoubleToLongBits16 = Double.doubleToLongBits(this.widthTemplateTransformationFactor);
        int i25 = (i24 + ((int) (jDoubleToLongBits16 ^ (jDoubleToLongBits16 >>> 32)))) * 31;
        long jDoubleToLongBits17 = Double.doubleToLongBits(this.heightTemplateTransformationFactor);
        return i25 + ((int) (jDoubleToLongBits17 ^ (jDoubleToLongBits17 >>> 32)));
    }

    public final boolean isGray() {
        return this.isGray;
    }

    public final boolean isIntelligent() {
        return !isNotIntelligent();
    }

    public final boolean isNotIntelligent() {
        return this.rectangles;
    }

    @NotNull
    public String toString() {
        StringBuilder sbE = f.e(Reflection.getOrCreateKotlinClass(DetectableObjectConfiguration.class).getQualifiedName(), "[documentId=");
        sbE.append(this.documentId);
        sbE.append(", template=");
        sbE.append(this.template);
        sbE.append(", cascadeFile=");
        sbE.append(this.cascadeFile);
        sbE.append(", cascadePath=");
        sbE.append(this.cascadePath);
        sbE.append(", pyramidRange=");
        sbE.append(this.pyramidRange);
        sbE.append(", pyramidFactor=");
        sbE.append(this.pyramidFactor);
        sbE.append(", isGray=");
        sbE.append(this.isGray);
        sbE.append(", roiFactor=");
        sbE.append(this.roiFactor);
        sbE.append(", minimumFactor=");
        sbE.append(this.minimumFactor);
        sbE.append(", thresholdArea=");
        sbE.append(this.thresholdArea);
        sbE.append(", previousMargin=");
        sbE.append(this.previousMargin);
        sbE.append(", rectangles=");
        sbE.append(this.rectangles);
        sbE.append(", scale=");
        sbE.append(this.scale);
        sbE.append(", minDivisorHeight=");
        sbE.append(this.minDivisorHeight);
        sbE.append(", minDivisorWidth=");
        sbE.append(this.minDivisorWidth);
        sbE.append(", maxDivisorHeight=");
        sbE.append(this.maxDivisorHeight);
        sbE.append(", maxDivisorWidth=");
        sbE.append(this.maxDivisorWidth);
        sbE.append(", neighbours=");
        sbE.append(this.neighbours);
        sbE.append(", minScore=");
        sbE.append(this.minScore);
        sbE.append(", xTransformationFactor=");
        sbE.append(this.xTransformationFactor);
        sbE.append(", yTransformationFactor=");
        sbE.append(this.yTransformationFactor);
        sbE.append(", widthTransformationFactor=");
        sbE.append(this.widthTransformationFactor);
        sbE.append(", heightTransformationFactor=");
        sbE.append(this.heightTransformationFactor);
        sbE.append(", xTemplateTransformationFactor=");
        sbE.append(this.xTemplateTransformationFactor);
        sbE.append(", yTemplateTransformationFactor=");
        sbE.append(this.yTemplateTransformationFactor);
        sbE.append(", widthTemplateTransformationFactor=");
        sbE.append(this.widthTemplateTransformationFactor);
        sbE.append(", heightTemplateTransformationFactor=");
        sbE.append(this.heightTemplateTransformationFactor);
        sbE.append(Constant.BRACKET_CLOSE);
        return sbE.toString();
    }

    public DetectableObjectConfiguration(@Nullable String str, @Nullable Bitmap bitmap, @Nullable String str2, @Nullable String str3, int i10, double d2, boolean z10, double d3, double d7, int i11, int i12, boolean z11, double d10, double d11, double d12, double d13, double d14, int i13, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23) {
        this.documentId = str;
        this.template = bitmap;
        this.cascadeFile = str2;
        this.cascadePath = str3;
        this.pyramidRange = i10;
        this.pyramidFactor = d2;
        this.isGray = z10;
        this.roiFactor = d3;
        this.minimumFactor = d7;
        this.thresholdArea = i11;
        this.previousMargin = i12;
        this.rectangles = z11;
        this.scale = d10;
        this.minDivisorHeight = d11;
        this.minDivisorWidth = d12;
        this.maxDivisorHeight = d13;
        this.maxDivisorWidth = d14;
        this.neighbours = i13;
        this.minScore = d15;
        this.xTransformationFactor = d16;
        this.yTransformationFactor = d17;
        this.widthTransformationFactor = d18;
        this.heightTransformationFactor = d19;
        this.xTemplateTransformationFactor = d20;
        this.yTemplateTransformationFactor = d21;
        this.widthTemplateTransformationFactor = d22;
        this.heightTemplateTransformationFactor = d23;
        this.cascadeDetectionCapable = str3 != null;
        this.rectangleDetectionCapable = z11;
        this.templateDetectionCapable = bitmap != null;
        if (d10 < 1.0d) {
            throw new IllegalArgumentException("The scale must not be lower than: 1.0".toString());
        }
        if (d11 < 1.0d) {
            throw new IllegalArgumentException("The divisor must not be lower than: + 1.0".toString());
        }
        if (d12 < 1.0d) {
            throw new IllegalArgumentException("The divisor must not be lower than: + 1.0".toString());
        }
        if (d13 < 1.0d) {
            throw new IllegalArgumentException("The divisor must not be lower than: + 1.0".toString());
        }
        if (d14 < 1.0d) {
            throw new IllegalArgumentException("The divisor must not be lower than: + 1.0".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("The number of neighbours must not be lower than: 0".toString());
        }
        if (d15 < 0.0d) {
            throw new IllegalArgumentException("The minimum score must not be lower than: 0".toString());
        }
        if (d16 < 0.0d) {
            throw new IllegalArgumentException("X transformation factor must not be lower than 0.0".toString());
        }
        if (d17 < 0.0d) {
            throw new IllegalArgumentException("Y transformation factor must not be lower than 0.0".toString());
        }
        if (d18 < 1.0d) {
            throw new IllegalArgumentException("Width transformation factor must not be lower than 1.0".toString());
        }
        if (d19 < 1.0d) {
            throw new IllegalArgumentException("Height transformation factor must not be lower than 1.0".toString());
        }
        if (d20 < 0.0d) {
            throw new IllegalArgumentException("X transformation factor must not be lower than 0.0".toString());
        }
        if (d21 < 0.0d) {
            throw new IllegalArgumentException("Y transformation factor must not be lower than 0.0".toString());
        }
        if (d22 < 1.0d) {
            throw new IllegalArgumentException("Width transformation factor must not be lower than 1.0".toString());
        }
        if (d23 < 1.0d) {
            throw new IllegalArgumentException("Height transformation factor must not be lower than 1.0".toString());
        }
    }

    public /* synthetic */ DetectableObjectConfiguration(String str, Bitmap bitmap, String str2, String str3, int i10, double d2, boolean z10, double d3, double d7, int i11, int i12, boolean z11, double d10, double d11, double d12, double d13, double d14, int i13, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bitmap, (i14 & 4) != 0 ? null : str2, (i14 & 8) == 0 ? str3 : null, (i14 & 16) != 0 ? 12 : i10, (i14 & 32) != 0 ? 0.95d : d2, (i14 & 64) != 0 ? false : z10, (i14 & 128) != 0 ? 0.15d : d3, (i14 & 256) != 0 ? 2.0d : d7, (i14 & 512) != 0 ? 35 : i11, (i14 & 1024) != 0 ? 2 : i12, (i14 & 2048) != 0 ? true : z11, (i14 & 4096) != 0 ? 1.05d : d10, (i14 & 8192) != 0 ? 3.5d : d11, (i14 & 16384) == 0 ? d12 : 3.5d, (32768 & i14) != 0 ? 1.0d : d13, (i14 & 65536) != 0 ? 1.0d : d14, (i14 & 131072) != 0 ? 4 : i13, (i14 & 262144) != 0 ? 0.43d : d15, (i14 & 524288) != 0 ? 0.0d : d16, (i14 & 1048576) != 0 ? 0.0d : d17, (i14 & 2097152) != 0 ? 1.0d : d18, (i14 & 4194304) != 0 ? 1.0d : d19, (i14 & 8388608) != 0 ? 0.0d : d20, (i14 & 16777216) == 0 ? d21 : 0.0d, (i14 & 33554432) != 0 ? 1.0d : d22, (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0 ? d23 : 1.0d);
    }
}
