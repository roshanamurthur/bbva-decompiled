package com.veridas.detect;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001LB\u008b\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0002\u0010\u001cJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\t\u0010:\u001a\u00020\u0016HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\r\u0010=\u001a\u00060\u001aj\u0002`\u001bHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\u00ad\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\f\b\u0002\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bHÆ\u0001J\u0013\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006M"}, d2 = {"Lcom/veridas/detect/Request;", "", "actualDetection", "Lcom/veridas/math/geometry/Rectangle;", "analyze", "", "detectionMode", "Lcom/veridas/detect/DetectionMode;", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/graphics/Frame;", "imageAnalysis", "Lcom/veridas/detect/ImageAnalysis;", "maxBoundary", "minBoundary", "mirrored", "objectIdentifierCollection", "Lcom/veridas/detect/ObjectIdentifierCollection;", "rectangleHelp", "referenceObject", ImageScaleTypeHandler.ID, "", "tightness", "", "useCropAlgorithm", "viewport", "viewportFocusPoint", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "(Lcom/veridas/math/geometry/Rectangle;ZLcom/veridas/detect/DetectionMode;Lcom/veridas/graphics/Frame;Lcom/veridas/detect/ImageAnalysis;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;ZLcom/veridas/detect/ObjectIdentifierCollection;ZLcom/veridas/math/geometry/Rectangle;DLjava/lang/String;ZLcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Vector2;)V", "getActualDetection", "()Lcom/veridas/math/geometry/Rectangle;", "getAnalyze", "()Z", "getDetectionMode", "()Lcom/veridas/detect/DetectionMode;", "getFrame", "()Lcom/veridas/graphics/Frame;", "getImageAnalysis", "()Lcom/veridas/detect/ImageAnalysis;", "getMaxBoundary", "getMinBoundary", "getMirrored", "getObjectIdentifierCollection", "()Lcom/veridas/detect/ObjectIdentifierCollection;", "getRectangleHelp", "getReferenceObject", "getScale", "()D", "getTightness", "()Ljava/lang/String;", "getUseCropAlgorithm", "getViewport", "getViewportFocusPoint", "()Lcom/veridas/math/geometry/Vector2;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Request {

    @NotNull
    private final Rectangle actualDetection;
    private final boolean analyze;

    @NotNull
    private final DetectionMode detectionMode;

    @NotNull
    private final Frame frame;

    @NotNull
    private final ImageAnalysis imageAnalysis;

    @NotNull
    private final Rectangle maxBoundary;

    @NotNull
    private final Rectangle minBoundary;
    private final boolean mirrored;

    @NotNull
    private final ObjectIdentifierCollection objectIdentifierCollection;
    private final boolean rectangleHelp;

    @NotNull
    private final Rectangle referenceObject;
    private final double scale;

    @NotNull
    private final String tightness;
    private final boolean useCropAlgorithm;

    @NotNull
    private final Rectangle viewport;

    @NotNull
    private final Vector2 viewportFocusPoint;

    /* JADX INFO: compiled from: Request.kt */
    @Keep
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\b\b\u0002\u0010#\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020\u0005¢\u0006\u0002\u0010+J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020.J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\t\u0010/\u001a\u00020\u0003HÂ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00101\u001a\u00020\u0013HÂ\u0003J\t\u00102\u001a\u00020\u0015HÂ\u0003J\t\u00103\u001a\u00020\u0005HÂ\u0003J\t\u00104\u001a\u00020\u0018HÂ\u0003J\t\u00105\u001a\u00020\u0005HÂ\u0003J\t\u00106\u001a\u00020\u0018HÂ\u0003J\t\u00107\u001a\u00020\u0005HÂ\u0003J\t\u00108\u001a\u00020\u0013HÂ\u0003J\t\u00109\u001a\u00020\u0005HÂ\u0003J\t\u0010:\u001a\u00020\u0005HÂ\u0003J\t\u0010;\u001a\u00020\u0013HÂ\u0003J\t\u0010<\u001a\u00020\u0013HÂ\u0003J\t\u0010=\u001a\u00020\u0013HÂ\u0003J\t\u0010>\u001a\u00020\u0005HÂ\u0003J\t\u0010?\u001a\u00020\u0013HÂ\u0003J\t\u0010@\u001a\u00020\u0013HÂ\u0003J\t\u0010A\u001a\u00020\u0013HÂ\u0003J\t\u0010B\u001a\u00020\u0005HÂ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010'HÂ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010)HÂ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010F\u001a\u00020\u0005HÂ\u0003J\t\u0010G\u001a\u00020\tHÂ\u0003J\t\u0010H\u001a\u00020\u0003HÂ\u0003J\t\u0010I\u001a\u00020\u0003HÂ\u0003J\t\u0010J\u001a\u00020\u0005HÂ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010L\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÂ\u0003JÍ\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020\u0005HÆ\u0001J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020.J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\tJ\u0013\u0010P\u001a\u00020\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0007J\t\u0010R\u001a\u00020\u0018HÖ\u0001J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010,\u001a\u00020'J\u0014\u0010(\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150)J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015J\t\u0010S\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0018J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00002\u000e\u0010,\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/veridas/detect/Request$Builder;", "", "actualDetection", "Lcom/veridas/math/geometry/Rectangle;", "analyze", "", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/graphics/Frame;", "detectionMode", "Lcom/veridas/detect/DetectionMode;", "maxBoundary", "minBoundary", "mirrored", "viewport", "viewportFocusPoint", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "referenceObject", ImageScaleTypeHandler.ID, "", "tightness", "", "underExposureDetectionEnabled", "underExposureThreshold", "", "overExposureDetectionEnabled", "overExposureThreshold", "outOfFocusDetectionEnabled", "outOfFocusThreshold", "detectLightBlobs", "lightBlobMinArea", "lightBlobMaxArea", "lightBlobIntensity", "detectCameraFlash", "cameraFlashMinArea", "cameraFlashMaxArea", "cameraFlashIntensity", "rectangleHelp", "objectIdentifierCollection", "Lcom/veridas/detect/ObjectIdentifierCollection;", "objectIdentifiers", "", "useCropAlgorithm", "(Lcom/veridas/math/geometry/Rectangle;ZLcom/veridas/graphics/Frame;Lcom/veridas/detect/DetectionMode;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;ZLcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Vector2;Lcom/veridas/math/geometry/Rectangle;DLjava/lang/String;ZIZIZDZDDDZDDDZLcom/veridas/detect/ObjectIdentifierCollection;Ljava/util/List;Z)V", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/detect/Request;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyFrom", "request", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/veridas/detect/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
    public static final /* data */ class Builder {

        @NotNull
        private Rectangle actualDetection;
        private boolean analyze;
        private double cameraFlashIntensity;
        private double cameraFlashMaxArea;
        private double cameraFlashMinArea;
        private boolean detectCameraFlash;
        private boolean detectLightBlobs;

        @NotNull
        private DetectionMode detectionMode;

        @Nullable
        private Frame frame;
        private double lightBlobIntensity;
        private double lightBlobMaxArea;
        private double lightBlobMinArea;

        @NotNull
        private Rectangle maxBoundary;

        @NotNull
        private Rectangle minBoundary;
        private boolean mirrored;

        @Nullable
        private ObjectIdentifierCollection objectIdentifierCollection;

        @Nullable
        private List<String> objectIdentifiers;
        private boolean outOfFocusDetectionEnabled;
        private double outOfFocusThreshold;
        private boolean overExposureDetectionEnabled;
        private int overExposureThreshold;
        private boolean rectangleHelp;

        @Nullable
        private Rectangle referenceObject;
        private double scale;

        @NotNull
        private String tightness;
        private boolean underExposureDetectionEnabled;
        private int underExposureThreshold;
        private boolean useCropAlgorithm;

        @Nullable
        private Rectangle viewport;

        @Nullable
        private Vector2 viewportFocusPoint;

        public Builder() {
            this(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Rectangle getActualDetection() {
            return this.actualDetection;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        private final Rectangle getReferenceObject() {
            return this.referenceObject;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        private final double getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        private final String getTightness() {
            return this.tightness;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        private final boolean getUnderExposureDetectionEnabled() {
            return this.underExposureDetectionEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        private final int getUnderExposureThreshold() {
            return this.underExposureThreshold;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        private final boolean getOverExposureDetectionEnabled() {
            return this.overExposureDetectionEnabled;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        private final int getOverExposureThreshold() {
            return this.overExposureThreshold;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        private final boolean getOutOfFocusDetectionEnabled() {
            return this.outOfFocusDetectionEnabled;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        private final double getOutOfFocusThreshold() {
            return this.outOfFocusThreshold;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        private final boolean getDetectLightBlobs() {
            return this.detectLightBlobs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final boolean getAnalyze() {
            return this.analyze;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        private final double getLightBlobMinArea() {
            return this.lightBlobMinArea;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        private final double getLightBlobMaxArea() {
            return this.lightBlobMaxArea;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        private final double getLightBlobIntensity() {
            return this.lightBlobIntensity;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        private final boolean getDetectCameraFlash() {
            return this.detectCameraFlash;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        private final double getCameraFlashMinArea() {
            return this.cameraFlashMinArea;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        private final double getCameraFlashMaxArea() {
            return this.cameraFlashMaxArea;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        private final double getCameraFlashIntensity() {
            return this.cameraFlashIntensity;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        private final boolean getRectangleHelp() {
            return this.rectangleHelp;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        private final ObjectIdentifierCollection getObjectIdentifierCollection() {
            return this.objectIdentifierCollection;
        }

        private final List<String> component29() {
            return this.objectIdentifiers;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        private final Frame getFrame() {
            return this.frame;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        private final boolean getUseCropAlgorithm() {
            return this.useCropAlgorithm;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        private final DetectionMode getDetectionMode() {
            return this.detectionMode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        private final Rectangle getMaxBoundary() {
            return this.maxBoundary;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        private final Rectangle getMinBoundary() {
            return this.minBoundary;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        private final boolean getMirrored() {
            return this.mirrored;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        private final Rectangle getViewport() {
            return this.viewport;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        private final Vector2 getViewportFocusPoint() {
            return this.viewportFocusPoint;
        }

        @NotNull
        public final Builder actualDetection(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.actualDetection = value;
            return this;
        }

        @NotNull
        public final Builder analyze(boolean value) {
            this.analyze = value;
            return this;
        }

        @NotNull
        public final Request build() {
            Rectangle rectangle;
            Frame frame = this.frame;
            Rectangle empty = this.referenceObject;
            Rectangle rectangle2 = this.viewport;
            Vector2 vector2Div = this.viewportFocusPoint;
            if (frame == null) {
                throw new IllegalArgumentException("A request cannot be filed without a frame to scrutinize.".toString());
            }
            if (rectangle2 == null) {
                Dimension dimensions = frame.getDimensions();
                rectangle = new Rectangle(0.0d, 0.0d, dimensions.getWidth(), dimensions.getHeight());
            } else {
                rectangle = rectangle2;
            }
            Vector2 dimensions2 = rectangle.getDimensions();
            if (vector2Div == null) {
                vector2Div = dimensions2.div(2);
            }
            Vector2 vector2 = vector2Div;
            if (vector2.getX() > dimensions2.getX() || vector2.getY() > dimensions2.getY()) {
                double x4 = vector2.getX();
                double y7 = vector2.getY();
                double x6 = dimensions2.getX();
                double y10 = dimensions2.getY();
                StringBuilder sb2 = new StringBuilder("The viewport focus point (");
                sb2.append(x4);
                sb2.append(" x ");
                sb2.append(y7);
                v.f(sb2, ") can not lie outside of the viewport (", x6, " x ");
                sb2.append(y10);
                sb2.append(").");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            boolean z10 = this.detectLightBlobs;
            boolean z11 = this.detectCameraFlash;
            double d2 = this.cameraFlashIntensity;
            double d3 = this.cameraFlashMaxArea;
            double d7 = this.cameraFlashMinArea;
            double d10 = this.lightBlobIntensity;
            double d11 = this.lightBlobMaxArea;
            double d12 = this.lightBlobMinArea;
            ImageAnalysis imageAnalysis = new ImageAnalysis(this.underExposureDetectionEnabled, this.underExposureThreshold, this.overExposureDetectionEnabled, this.overExposureThreshold, this.outOfFocusDetectionEnabled, this.outOfFocusThreshold, z10, d12, d11, d10, z11, d7, d3, d2);
            if (empty == null) {
                empty = Rectangle.INSTANCE.getEMPTY();
            }
            Rectangle rectangle3 = empty;
            List<String> list = this.objectIdentifiers;
            ObjectIdentifierCollection objectIdentifierCollection = this.objectIdentifierCollection;
            if (list != null) {
                objectIdentifierCollection = new ObjectIdentifierCollection(list);
            }
            ObjectIdentifierCollection objectIdentifierCollection2 = objectIdentifierCollection;
            if (objectIdentifierCollection2 == null) {
                throw new IllegalArgumentException("No object identifiers given.".toString());
            }
            return new Request(this.actualDetection, this.analyze, this.detectionMode, frame, imageAnalysis, this.maxBoundary, this.minBoundary, this.mirrored, objectIdentifierCollection2, this.rectangleHelp, rectangle3, this.scale, this.tightness, this.useCropAlgorithm, rectangle, vector2, null);
        }

        @NotNull
        public final Builder cameraFlashIntensity(double value) {
            this.cameraFlashIntensity = value;
            return this;
        }

        @NotNull
        public final Builder cameraFlashMaxArea(double value) {
            this.cameraFlashMaxArea = value;
            return this;
        }

        @NotNull
        public final Builder cameraFlashMinArea(double value) {
            this.cameraFlashMinArea = value;
            return this;
        }

        @NotNull
        public final Builder copy(@NotNull Rectangle actualDetection, boolean analyze, @Nullable Frame frame, @NotNull DetectionMode detectionMode, @NotNull Rectangle maxBoundary, @NotNull Rectangle minBoundary, boolean mirrored, @Nullable Rectangle viewport, @Nullable Vector2 viewportFocusPoint, @Nullable Rectangle referenceObject, double scale, @NotNull String tightness, boolean underExposureDetectionEnabled, int underExposureThreshold, boolean overExposureDetectionEnabled, int overExposureThreshold, boolean outOfFocusDetectionEnabled, double outOfFocusThreshold, boolean detectLightBlobs, double lightBlobMinArea, double lightBlobMaxArea, double lightBlobIntensity, boolean detectCameraFlash, double cameraFlashMinArea, double cameraFlashMaxArea, double cameraFlashIntensity, boolean rectangleHelp, @Nullable ObjectIdentifierCollection objectIdentifierCollection, @Nullable List<String> objectIdentifiers, boolean useCropAlgorithm) {
            Intrinsics.checkNotNullParameter(actualDetection, "actualDetection");
            Intrinsics.checkNotNullParameter(detectionMode, "detectionMode");
            Intrinsics.checkNotNullParameter(maxBoundary, "maxBoundary");
            Intrinsics.checkNotNullParameter(minBoundary, "minBoundary");
            Intrinsics.checkNotNullParameter(tightness, "tightness");
            return new Builder(actualDetection, analyze, frame, detectionMode, maxBoundary, minBoundary, mirrored, viewport, viewportFocusPoint, referenceObject, scale, tightness, underExposureDetectionEnabled, underExposureThreshold, overExposureDetectionEnabled, overExposureThreshold, outOfFocusDetectionEnabled, outOfFocusThreshold, detectLightBlobs, lightBlobMinArea, lightBlobMaxArea, lightBlobIntensity, detectCameraFlash, cameraFlashMinArea, cameraFlashMaxArea, cameraFlashIntensity, rectangleHelp, objectIdentifierCollection, objectIdentifiers, useCropAlgorithm);
        }

        @NotNull
        public final Builder copyFrom(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            actualDetection(request.getActualDetection());
            cameraFlashMinArea(request.getImageAnalysis().getCameraFlashMinArea());
            cameraFlashMaxArea(request.getImageAnalysis().getCameraFlashMaxArea());
            cameraFlashIntensity(request.getImageAnalysis().getCameraFlashIntensity());
            detectionMode(request.getDetectionMode());
            detectCameraFlash(request.getImageAnalysis().getDetectCameraFlash());
            detectLightBlobs(request.getImageAnalysis().getDetectLightBlobs());
            frame(request.getFrame());
            lightBlobIntensity(request.getImageAnalysis().getLightBlobIntensity());
            lightBlobMaxArea(request.getImageAnalysis().getLightBlobMaxArea());
            lightBlobMinArea(request.getImageAnalysis().getLightBlobMinArea());
            maxBoundary(request.getMaxBoundary());
            minBoundary(request.getMinBoundary());
            mirrored(request.getMirrored());
            objectIdentifierCollection(request.getObjectIdentifierCollection());
            outOfFocusDetectionEnabled(request.getImageAnalysis().getOutOfFocusDetectionEnabled());
            outOfFocusThreshold(request.getImageAnalysis().getOutOfFocusThreshold());
            overExposureDetectionEnabled(request.getImageAnalysis().getOverExposureDetectionEnabled());
            overExposureThreshold(request.getImageAnalysis().getOverExposureThreshold());
            rectangleHelp(request.getRectangleHelp());
            referenceObject(request.getReferenceObject());
            scale(request.getScale());
            tightness(request.getTightness());
            underExposureDetectionEnabled(request.getImageAnalysis().getUnderExposureDetectionEnabled());
            underExposureThreshold(request.getImageAnalysis().getUnderExposureThreshold());
            viewport(request.getViewport());
            viewportFocusPoint(request.getViewportFocusPoint());
            useCropAlgorithm(request.getUseCropAlgorithm());
            return this;
        }

        @NotNull
        public final Builder detectCameraFlash(boolean value) {
            this.detectCameraFlash = value;
            return this;
        }

        @NotNull
        public final Builder detectLightBlobs(boolean value) {
            this.detectLightBlobs = value;
            return this;
        }

        @NotNull
        public final Builder detectionMode(@NotNull DetectionMode value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.detectionMode = value;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.actualDetection, builder.actualDetection) && this.analyze == builder.analyze && Intrinsics.areEqual(this.frame, builder.frame) && this.detectionMode == builder.detectionMode && Intrinsics.areEqual(this.maxBoundary, builder.maxBoundary) && Intrinsics.areEqual(this.minBoundary, builder.minBoundary) && this.mirrored == builder.mirrored && Intrinsics.areEqual(this.viewport, builder.viewport) && Intrinsics.areEqual(this.viewportFocusPoint, builder.viewportFocusPoint) && Intrinsics.areEqual(this.referenceObject, builder.referenceObject) && Double.compare(this.scale, builder.scale) == 0 && Intrinsics.areEqual(this.tightness, builder.tightness) && this.underExposureDetectionEnabled == builder.underExposureDetectionEnabled && this.underExposureThreshold == builder.underExposureThreshold && this.overExposureDetectionEnabled == builder.overExposureDetectionEnabled && this.overExposureThreshold == builder.overExposureThreshold && this.outOfFocusDetectionEnabled == builder.outOfFocusDetectionEnabled && Double.compare(this.outOfFocusThreshold, builder.outOfFocusThreshold) == 0 && this.detectLightBlobs == builder.detectLightBlobs && Double.compare(this.lightBlobMinArea, builder.lightBlobMinArea) == 0 && Double.compare(this.lightBlobMaxArea, builder.lightBlobMaxArea) == 0 && Double.compare(this.lightBlobIntensity, builder.lightBlobIntensity) == 0 && this.detectCameraFlash == builder.detectCameraFlash && Double.compare(this.cameraFlashMinArea, builder.cameraFlashMinArea) == 0 && Double.compare(this.cameraFlashMaxArea, builder.cameraFlashMaxArea) == 0 && Double.compare(this.cameraFlashIntensity, builder.cameraFlashIntensity) == 0 && this.rectangleHelp == builder.rectangleHelp && Intrinsics.areEqual(this.objectIdentifierCollection, builder.objectIdentifierCollection) && Intrinsics.areEqual(this.objectIdentifiers, builder.objectIdentifiers) && this.useCropAlgorithm == builder.useCropAlgorithm;
        }

        @NotNull
        public final Builder frame(@NotNull Frame value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.frame = value;
            return this;
        }

        public int hashCode() {
            int iHashCode = ((this.actualDetection.hashCode() * 31) + (this.analyze ? 1231 : 1237)) * 31;
            Frame frame = this.frame;
            int iHashCode2 = (((this.minBoundary.hashCode() + ((this.maxBoundary.hashCode() + ((this.detectionMode.hashCode() + ((iHashCode + (frame == null ? 0 : frame.hashCode())) * 31)) * 31)) * 31)) * 31) + (this.mirrored ? 1231 : 1237)) * 31;
            Rectangle rectangle = this.viewport;
            int iHashCode3 = (iHashCode2 + (rectangle == null ? 0 : rectangle.hashCode())) * 31;
            Vector2 vector2 = this.viewportFocusPoint;
            int iHashCode4 = (iHashCode3 + (vector2 == null ? 0 : vector2.hashCode())) * 31;
            Rectangle rectangle2 = this.referenceObject;
            int iHashCode5 = rectangle2 == null ? 0 : rectangle2.hashCode();
            long jDoubleToLongBits = Double.doubleToLongBits(this.scale);
            int iC = (((((((((n1.c(this.tightness, (((iHashCode4 + iHashCode5) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31) + (this.underExposureDetectionEnabled ? 1231 : 1237)) * 31) + this.underExposureThreshold) * 31) + (this.overExposureDetectionEnabled ? 1231 : 1237)) * 31) + this.overExposureThreshold) * 31) + (this.outOfFocusDetectionEnabled ? 1231 : 1237)) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.outOfFocusThreshold);
            int i10 = (((iC + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + (this.detectLightBlobs ? 1231 : 1237)) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.lightBlobMinArea);
            int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
            long jDoubleToLongBits4 = Double.doubleToLongBits(this.lightBlobMaxArea);
            int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
            long jDoubleToLongBits5 = Double.doubleToLongBits(this.lightBlobIntensity);
            int i13 = (((i12 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31) + (this.detectCameraFlash ? 1231 : 1237)) * 31;
            long jDoubleToLongBits6 = Double.doubleToLongBits(this.cameraFlashMinArea);
            int i14 = (i13 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
            long jDoubleToLongBits7 = Double.doubleToLongBits(this.cameraFlashMaxArea);
            int i15 = (i14 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31;
            long jDoubleToLongBits8 = Double.doubleToLongBits(this.cameraFlashIntensity);
            int i16 = (((i15 + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + (this.rectangleHelp ? 1231 : 1237)) * 31;
            ObjectIdentifierCollection objectIdentifierCollection = this.objectIdentifierCollection;
            int iHashCode6 = (i16 + (objectIdentifierCollection == null ? 0 : objectIdentifierCollection.hashCode())) * 31;
            List<String> list = this.objectIdentifiers;
            return ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + (this.useCropAlgorithm ? 1231 : 1237);
        }

        @NotNull
        public final Builder lightBlobIntensity(double value) {
            this.lightBlobIntensity = value;
            return this;
        }

        @NotNull
        public final Builder lightBlobMaxArea(double value) {
            this.lightBlobMaxArea = value;
            return this;
        }

        @NotNull
        public final Builder lightBlobMinArea(double value) {
            this.lightBlobMinArea = value;
            return this;
        }

        @NotNull
        public final Builder maxBoundary(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.maxBoundary = value;
            return this;
        }

        @NotNull
        public final Builder minBoundary(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.minBoundary = value;
            return this;
        }

        @NotNull
        public final Builder mirrored(boolean value) {
            this.mirrored = value;
            return this;
        }

        @NotNull
        public final Builder objectIdentifierCollection(@NotNull ObjectIdentifierCollection value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.objectIdentifierCollection = value;
            return this;
        }

        @NotNull
        public final Builder objectIdentifiers(@NotNull List<String> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.objectIdentifiers = value;
            return this;
        }

        @NotNull
        public final Builder outOfFocusDetectionEnabled(boolean value) {
            this.outOfFocusDetectionEnabled = value;
            return this;
        }

        @NotNull
        public final Builder outOfFocusThreshold(double value) {
            this.outOfFocusThreshold = value;
            return this;
        }

        @NotNull
        public final Builder overExposureDetectionEnabled(boolean value) {
            this.overExposureDetectionEnabled = value;
            return this;
        }

        @NotNull
        public final Builder overExposureThreshold(int value) {
            this.overExposureThreshold = value;
            return this;
        }

        @NotNull
        public final Builder rectangleHelp(boolean value) {
            this.rectangleHelp = value;
            return this;
        }

        @NotNull
        public final Builder referenceObject(@Nullable Rectangle value) {
            this.referenceObject = value;
            return this;
        }

        @NotNull
        public final Builder scale(double value) {
            this.scale = value;
            return this;
        }

        @NotNull
        public final Builder tightness(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.tightness = value;
            return this;
        }

        @NotNull
        public String toString() {
            Rectangle rectangle = this.actualDetection;
            boolean z10 = this.analyze;
            Frame frame = this.frame;
            DetectionMode detectionMode = this.detectionMode;
            Rectangle rectangle2 = this.maxBoundary;
            Rectangle rectangle3 = this.minBoundary;
            boolean z11 = this.mirrored;
            Rectangle rectangle4 = this.viewport;
            Vector2 vector2 = this.viewportFocusPoint;
            Rectangle rectangle5 = this.referenceObject;
            double d2 = this.scale;
            String str = this.tightness;
            boolean z12 = this.underExposureDetectionEnabled;
            int i10 = this.underExposureThreshold;
            boolean z13 = this.overExposureDetectionEnabled;
            int i11 = this.overExposureThreshold;
            boolean z14 = this.outOfFocusDetectionEnabled;
            double d3 = this.outOfFocusThreshold;
            boolean z15 = this.detectLightBlobs;
            double d7 = this.lightBlobMinArea;
            double d10 = this.lightBlobMaxArea;
            double d11 = this.lightBlobIntensity;
            boolean z16 = this.detectCameraFlash;
            double d12 = this.cameraFlashMinArea;
            double d13 = this.cameraFlashMaxArea;
            double d14 = this.cameraFlashIntensity;
            boolean z17 = this.rectangleHelp;
            ObjectIdentifierCollection objectIdentifierCollection = this.objectIdentifierCollection;
            List<String> list = this.objectIdentifiers;
            boolean z18 = this.useCropAlgorithm;
            StringBuilder sb2 = new StringBuilder("Builder(actualDetection=");
            sb2.append(rectangle);
            sb2.append(", analyze=");
            sb2.append(z10);
            sb2.append(", frame=");
            sb2.append(frame);
            sb2.append(", detectionMode=");
            sb2.append(detectionMode);
            sb2.append(", maxBoundary=");
            sb2.append(rectangle2);
            sb2.append(", minBoundary=");
            sb2.append(rectangle3);
            sb2.append(", mirrored=");
            sb2.append(z11);
            sb2.append(", viewport=");
            sb2.append(rectangle4);
            sb2.append(", viewportFocusPoint=");
            sb2.append(vector2);
            sb2.append(", referenceObject=");
            sb2.append(rectangle5);
            sb2.append(", scale=");
            sb2.append(d2);
            sb2.append(", tightness=");
            sb2.append(str);
            sb2.append(", underExposureDetectionEnabled=");
            sb2.append(z12);
            sb2.append(", underExposureThreshold=");
            sb2.append(i10);
            sb2.append(", overExposureDetectionEnabled=");
            sb2.append(z13);
            sb2.append(", overExposureThreshold=");
            sb2.append(i11);
            sb2.append(", outOfFocusDetectionEnabled=");
            sb2.append(z14);
            sb2.append(", outOfFocusThreshold=");
            sb2.append(d3);
            sb2.append(", detectLightBlobs=");
            sb2.append(z15);
            v.f(sb2, ", lightBlobMinArea=", d7, ", lightBlobMaxArea=");
            sb2.append(d10);
            v.f(sb2, ", lightBlobIntensity=", d11, ", detectCameraFlash=");
            sb2.append(z16);
            sb2.append(", cameraFlashMinArea=");
            sb2.append(d12);
            v.f(sb2, ", cameraFlashMaxArea=", d13, ", cameraFlashIntensity=");
            sb2.append(d14);
            sb2.append(", rectangleHelp=");
            sb2.append(z17);
            sb2.append(", objectIdentifierCollection=");
            sb2.append(objectIdentifierCollection);
            sb2.append(", objectIdentifiers=");
            sb2.append(list);
            sb2.append(", useCropAlgorithm=");
            sb2.append(z18);
            sb2.append(")");
            return sb2.toString();
        }

        @NotNull
        public final Builder underExposureDetectionEnabled(boolean value) {
            this.underExposureDetectionEnabled = value;
            return this;
        }

        @NotNull
        public final Builder underExposureThreshold(int value) {
            this.underExposureThreshold = value;
            return this;
        }

        @NotNull
        public final Builder useCropAlgorithm(boolean value) {
            this.useCropAlgorithm = value;
            return this;
        }

        @NotNull
        public final Builder viewport(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.viewport = value;
            return this;
        }

        @NotNull
        public final Builder viewportFocusPoint(@Nullable Vector2 value) {
            this.viewportFocusPoint = value;
            return this;
        }

        public Builder(@NotNull Rectangle actualDetection, boolean z10, @Nullable Frame frame, @NotNull DetectionMode detectionMode, @NotNull Rectangle maxBoundary, @NotNull Rectangle minBoundary, boolean z11, @Nullable Rectangle rectangle, @Nullable Vector2 vector2, @Nullable Rectangle rectangle2, double d2, @NotNull String tightness, boolean z12, int i10, boolean z13, int i11, boolean z14, double d3, boolean z15, double d7, double d10, double d11, boolean z16, double d12, double d13, double d14, boolean z17, @Nullable ObjectIdentifierCollection objectIdentifierCollection, @Nullable List<String> list, boolean z18) {
            Intrinsics.checkNotNullParameter(actualDetection, "actualDetection");
            Intrinsics.checkNotNullParameter(detectionMode, "detectionMode");
            Intrinsics.checkNotNullParameter(maxBoundary, "maxBoundary");
            Intrinsics.checkNotNullParameter(minBoundary, "minBoundary");
            Intrinsics.checkNotNullParameter(tightness, "tightness");
            this.actualDetection = actualDetection;
            this.analyze = z10;
            this.frame = frame;
            this.detectionMode = detectionMode;
            this.maxBoundary = maxBoundary;
            this.minBoundary = minBoundary;
            this.mirrored = z11;
            this.viewport = rectangle;
            this.viewportFocusPoint = vector2;
            this.referenceObject = rectangle2;
            this.scale = d2;
            this.tightness = tightness;
            this.underExposureDetectionEnabled = z12;
            this.underExposureThreshold = i10;
            this.overExposureDetectionEnabled = z13;
            this.overExposureThreshold = i11;
            this.outOfFocusDetectionEnabled = z14;
            this.outOfFocusThreshold = d3;
            this.detectLightBlobs = z15;
            this.lightBlobMinArea = d7;
            this.lightBlobMaxArea = d10;
            this.lightBlobIntensity = d11;
            this.detectCameraFlash = z16;
            this.cameraFlashMinArea = d12;
            this.cameraFlashMaxArea = d13;
            this.cameraFlashIntensity = d14;
            this.rectangleHelp = z17;
            this.objectIdentifierCollection = objectIdentifierCollection;
            this.objectIdentifiers = list;
            this.useCropAlgorithm = z18;
        }

        public /* synthetic */ Builder(Rectangle rectangle, boolean z10, Frame frame, DetectionMode detectionMode, Rectangle rectangle2, Rectangle rectangle3, boolean z11, Rectangle rectangle4, Vector2 vector2, Rectangle rectangle5, double d2, String str, boolean z12, int i10, boolean z13, int i11, boolean z14, double d3, boolean z15, double d7, double d10, double d11, boolean z16, double d12, double d13, double d14, boolean z17, ObjectIdentifierCollection objectIdentifierCollection, List list, boolean z18, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? Rectangle.INSTANCE.getEMPTY() : rectangle, (i12 & 2) != 0 ? true : z10, (i12 & 4) != 0 ? null : frame, (i12 & 8) != 0 ? DetectionMode.NONE : detectionMode, (i12 & 16) != 0 ? Rectangle.INSTANCE.getEMPTY() : rectangle2, (i12 & 32) != 0 ? Rectangle.INSTANCE.getEMPTY() : rectangle3, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? null : rectangle4, (i12 & 256) != 0 ? null : vector2, (i12 & 512) != 0 ? null : rectangle5, (i12 & 1024) != 0 ? 1.1d : d2, (i12 & 2048) != 0 ? VDPhotoSelfieConfiguration.LOOSE : str, (i12 & 4096) != 0 ? false : z12, (i12 & 8192) != 0 ? 35 : i10, (i12 & 16384) != 0 ? false : z13, (i12 & 32768) != 0 ? ImageAnalysisKt.OVER_EXPOSED_THRESHOLD : i11, (i12 & 65536) != 0 ? false : z14, (i12 & 131072) != 0 ? 600.0d : d3, (i12 & 262144) != 0 ? false : z15, (i12 & 524288) != 0 ? 2500.0d : d7, (i12 & 1048576) != 0 ? 250000.0d : d10, (i12 & 2097152) != 0 ? 245.0d : d11, (i12 & 4194304) != 0 ? false : z16, (i12 & 8388608) != 0 ? 225.0d : d12, (i12 & 16777216) != 0 ? 90000.0d : d13, (i12 & 33554432) == 0 ? d14 : 245.0d, (i12 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? false : z17, (i12 & 134217728) != 0 ? null : objectIdentifierCollection, (i12 & 268435456) != 0 ? null : list, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z18);
        }
    }

    public /* synthetic */ Request(Rectangle rectangle, boolean z10, DetectionMode detectionMode, Frame frame, ImageAnalysis imageAnalysis, Rectangle rectangle2, Rectangle rectangle3, boolean z11, ObjectIdentifierCollection objectIdentifierCollection, boolean z12, Rectangle rectangle4, double d2, String str, boolean z13, Rectangle rectangle5, Vector2 vector2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangle, z10, detectionMode, frame, imageAnalysis, rectangle2, rectangle3, z11, objectIdentifierCollection, z12, rectangle4, d2, str, z13, rectangle5, vector2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Rectangle getActualDetection() {
        return this.actualDetection;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getRectangleHelp() {
        return this.rectangleHelp;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Rectangle getReferenceObject() {
        return this.referenceObject;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTightness() {
        return this.tightness;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getUseCropAlgorithm() {
        return this.useCropAlgorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Rectangle getViewport() {
        return this.viewport;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Vector2 getViewportFocusPoint() {
        return this.viewportFocusPoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAnalyze() {
        return this.analyze;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DetectionMode getDetectionMode() {
        return this.detectionMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Frame getFrame() {
        return this.frame;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImageAnalysis getImageAnalysis() {
        return this.imageAnalysis;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Rectangle getMaxBoundary() {
        return this.maxBoundary;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Rectangle getMinBoundary() {
        return this.minBoundary;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getMirrored() {
        return this.mirrored;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ObjectIdentifierCollection getObjectIdentifierCollection() {
        return this.objectIdentifierCollection;
    }

    @NotNull
    public final Request copy(@NotNull Rectangle actualDetection, boolean analyze, @NotNull DetectionMode detectionMode, @NotNull Frame frame, @NotNull ImageAnalysis imageAnalysis, @NotNull Rectangle maxBoundary, @NotNull Rectangle minBoundary, boolean mirrored, @NotNull ObjectIdentifierCollection objectIdentifierCollection, boolean rectangleHelp, @NotNull Rectangle referenceObject, double scale, @NotNull String tightness, boolean useCropAlgorithm, @NotNull Rectangle viewport, @NotNull Vector2 viewportFocusPoint) {
        Intrinsics.checkNotNullParameter(actualDetection, "actualDetection");
        Intrinsics.checkNotNullParameter(detectionMode, "detectionMode");
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(imageAnalysis, "imageAnalysis");
        Intrinsics.checkNotNullParameter(maxBoundary, "maxBoundary");
        Intrinsics.checkNotNullParameter(minBoundary, "minBoundary");
        Intrinsics.checkNotNullParameter(objectIdentifierCollection, "objectIdentifierCollection");
        Intrinsics.checkNotNullParameter(referenceObject, "referenceObject");
        Intrinsics.checkNotNullParameter(tightness, "tightness");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(viewportFocusPoint, "viewportFocusPoint");
        return new Request(actualDetection, analyze, detectionMode, frame, imageAnalysis, maxBoundary, minBoundary, mirrored, objectIdentifierCollection, rectangleHelp, referenceObject, scale, tightness, useCropAlgorithm, viewport, viewportFocusPoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return Intrinsics.areEqual(this.actualDetection, request.actualDetection) && this.analyze == request.analyze && this.detectionMode == request.detectionMode && Intrinsics.areEqual(this.frame, request.frame) && Intrinsics.areEqual(this.imageAnalysis, request.imageAnalysis) && Intrinsics.areEqual(this.maxBoundary, request.maxBoundary) && Intrinsics.areEqual(this.minBoundary, request.minBoundary) && this.mirrored == request.mirrored && Intrinsics.areEqual(this.objectIdentifierCollection, request.objectIdentifierCollection) && this.rectangleHelp == request.rectangleHelp && Intrinsics.areEqual(this.referenceObject, request.referenceObject) && Double.compare(this.scale, request.scale) == 0 && Intrinsics.areEqual(this.tightness, request.tightness) && this.useCropAlgorithm == request.useCropAlgorithm && Intrinsics.areEqual(this.viewport, request.viewport) && Intrinsics.areEqual(this.viewportFocusPoint, request.viewportFocusPoint);
    }

    @NotNull
    public final Rectangle getActualDetection() {
        return this.actualDetection;
    }

    public final boolean getAnalyze() {
        return this.analyze;
    }

    @NotNull
    public final DetectionMode getDetectionMode() {
        return this.detectionMode;
    }

    @NotNull
    public final Frame getFrame() {
        return this.frame;
    }

    @NotNull
    public final ImageAnalysis getImageAnalysis() {
        return this.imageAnalysis;
    }

    @NotNull
    public final Rectangle getMaxBoundary() {
        return this.maxBoundary;
    }

    @NotNull
    public final Rectangle getMinBoundary() {
        return this.minBoundary;
    }

    public final boolean getMirrored() {
        return this.mirrored;
    }

    @NotNull
    public final ObjectIdentifierCollection getObjectIdentifierCollection() {
        return this.objectIdentifierCollection;
    }

    public final boolean getRectangleHelp() {
        return this.rectangleHelp;
    }

    @NotNull
    public final Rectangle getReferenceObject() {
        return this.referenceObject;
    }

    public final double getScale() {
        return this.scale;
    }

    @NotNull
    public final String getTightness() {
        return this.tightness;
    }

    public final boolean getUseCropAlgorithm() {
        return this.useCropAlgorithm;
    }

    @NotNull
    public final Rectangle getViewport() {
        return this.viewport;
    }

    @NotNull
    public final Vector2 getViewportFocusPoint() {
        return this.viewportFocusPoint;
    }

    public int hashCode() {
        int iHashCode = (this.referenceObject.hashCode() + ((((this.objectIdentifierCollection.hashCode() + ((((this.minBoundary.hashCode() + ((this.maxBoundary.hashCode() + ((this.imageAnalysis.hashCode() + ((this.frame.hashCode() + ((this.detectionMode.hashCode() + (((this.actualDetection.hashCode() * 31) + (this.analyze ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.mirrored ? 1231 : 1237)) * 31)) * 31) + (this.rectangleHelp ? 1231 : 1237)) * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.scale);
        return this.viewportFocusPoint.hashCode() + ((this.viewport.hashCode() + ((n1.c(this.tightness, (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31) + (this.useCropAlgorithm ? 1231 : 1237)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Request(actualDetection=" + this.actualDetection + ", analyze=" + this.analyze + ", detectionMode=" + this.detectionMode + ", frame=" + this.frame + ", imageAnalysis=" + this.imageAnalysis + ", maxBoundary=" + this.maxBoundary + ", minBoundary=" + this.minBoundary + ", mirrored=" + this.mirrored + ", objectIdentifierCollection=" + this.objectIdentifierCollection + ", rectangleHelp=" + this.rectangleHelp + ", referenceObject=" + this.referenceObject + ", scale=" + this.scale + ", tightness=" + this.tightness + ", useCropAlgorithm=" + this.useCropAlgorithm + ", viewport=" + this.viewport + ", viewportFocusPoint=" + this.viewportFocusPoint + ")";
    }

    private Request(Rectangle rectangle, boolean z10, DetectionMode detectionMode, Frame frame, ImageAnalysis imageAnalysis, Rectangle rectangle2, Rectangle rectangle3, boolean z11, ObjectIdentifierCollection objectIdentifierCollection, boolean z12, Rectangle rectangle4, double d2, String str, boolean z13, Rectangle rectangle5, Vector2 vector2) {
        this.actualDetection = rectangle;
        this.analyze = z10;
        this.detectionMode = detectionMode;
        this.frame = frame;
        this.imageAnalysis = imageAnalysis;
        this.maxBoundary = rectangle2;
        this.minBoundary = rectangle3;
        this.mirrored = z11;
        this.objectIdentifierCollection = objectIdentifierCollection;
        this.rectangleHelp = z12;
        this.referenceObject = rectangle4;
        this.scale = d2;
        this.tightness = str;
        this.useCropAlgorithm = z13;
        this.viewport = rectangle5;
        this.viewportFocusPoint = vector2;
    }
}
