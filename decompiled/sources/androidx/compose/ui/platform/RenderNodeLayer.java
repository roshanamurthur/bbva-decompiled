package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002XYB1\u0012\u0006\u0010O\u001a\u00020J\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001f0>\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0@¢\u0006\u0004\bV\u0010WJ¯\u0001\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010+J\b\u00100\u001a\u00020\u001fH\u0016J\u0010\u00103\u001a\u00020\u001f2\u0006\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0016J%\u0010:\u001a\u00020#2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010=\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020\u0012H\u0016J*\u0010B\u001a\u00020\u001f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001f0>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0@H\u0016J\u001d\u0010G\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010FR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawLayer", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Companion", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    @NotNull
    public static final a G0 = a.f17296p0;
    public long E0;

    @NotNull
    public final DeviceRenderNode F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Function1<? super Canvas, Unit> f17288q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f17289r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f17290s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final OutlineResolver f17291t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f17292u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Paint f17293w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final LayerMatrixCache<DeviceRenderNode> f17294x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final CanvasHolder f17295y0;

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    public static final class a extends Lambda implements Function2<DeviceRenderNode, Matrix, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17296p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            DeviceRenderNode rn2 = deviceRenderNode;
            Matrix matrix2 = matrix;
            Intrinsics.checkNotNullParameter(rn2, "rn");
            Intrinsics.checkNotNullParameter(matrix2, "matrix");
            rn2.getMatrix(matrix2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @RequiresApi(29)
    public static final class b {
        @JvmStatic
        @DoNotInline
        public static final long a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(@NotNull AndroidComposeView ownerView, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.f17288q0 = drawBlock;
        this.f17289r0 = invalidateParentLayer;
        this.f17291t0 = new OutlineResolver(ownerView.getDensity());
        this.f17294x0 = new LayerMatrixCache<>(G0);
        this.f17295y0 = new CanvasHolder();
        this.E0 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(ownerView) : new RenderNodeApi23(ownerView);
        renderNodeApi29.setHasOverlappingRendering(true);
        this.F0 = renderNodeApi29;
    }

    public final void a(boolean z10) {
        if (z10 != this.f17290s0) {
            this.f17290s0 = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        DeviceRenderNode deviceRenderNode = this.F0;
        if (deviceRenderNode.getHasDisplayList()) {
            deviceRenderNode.discardDisplayList();
        }
        this.f17288q0 = null;
        this.f17289r0 = null;
        this.f17292u0 = true;
        a(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.requestClearInvalidObservations();
        androidComposeView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        DeviceRenderNode deviceRenderNode = this.F0;
        if (zIsHardwareAccelerated) {
            updateDisplayList();
            boolean z10 = deviceRenderNode.getElevation() > 0.0f;
            this.v0 = z10;
            if (z10) {
                canvas.enableZ();
            }
            deviceRenderNode.drawInto(nativeCanvas);
            if (this.v0) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = deviceRenderNode.getLeft();
        float top = deviceRenderNode.getTop();
        float right = deviceRenderNode.getRight();
        float bottom = deviceRenderNode.getBottom();
        if (deviceRenderNode.getAlpha() < 1.0f) {
            Paint Paint = this.f17293w0;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.f17293w0 = Paint;
            }
            Paint.setAlpha(deviceRenderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, Paint.getF15557a());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo2372concat58bKbWc(this.f17294x0.m3807calculateMatrixGrdbGEg(deviceRenderNode));
        if (deviceRenderNode.getClipToOutline() || deviceRenderNode.getClipToBounds()) {
            this.f17291t0.clipToOutline(canvas);
        }
        Function1<? super Canvas, Unit> function1 = this.f17288q0;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        a(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.F0.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.f17290s0 || this.f17292u0) {
            return;
        }
        this.ownerView.invalidate();
        a(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo3770inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArrM3806calculateInverseMatrixbWbORWo = this.f17294x0.m3806calculateInverseMatrixbWbORWo(this.F0);
        if (fArrM3806calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2717timesAssign58bKbWc(matrix, fArrM3806calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo3771isInLayerk4lQ0M(long position) {
        float fM2275getXimpl = Offset.m2275getXimpl(position);
        float fM2276getYimpl = Offset.m2276getYimpl(position);
        DeviceRenderNode deviceRenderNode = this.F0;
        if (deviceRenderNode.getClipToBounds()) {
            return 0.0f <= fM2275getXimpl && fM2275getXimpl < ((float) deviceRenderNode.getWidth()) && 0.0f <= fM2276getYimpl && fM2276getYimpl < ((float) deviceRenderNode.getHeight());
        }
        if (deviceRenderNode.getClipToOutline()) {
            return this.f17291t0.m3811isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        DeviceRenderNode deviceRenderNode = this.F0;
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.f17294x0;
        if (!inverse) {
            androidx.compose.ui.graphics.Matrix.m2708mapimpl(layerMatrixCache.m3807calculateMatrixGrdbGEg(deviceRenderNode), rect);
            return;
        }
        float[] fArrM3806calculateInverseMatrixbWbORWo = layerMatrixCache.m3806calculateInverseMatrixbWbORWo(deviceRenderNode);
        if (fArrM3806calculateInverseMatrixbWbORWo == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.Matrix.m2708mapimpl(fArrM3806calculateInverseMatrixbWbORWo, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo3772mapOffset8S9VItk(long point, boolean inverse) {
        DeviceRenderNode deviceRenderNode = this.F0;
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.f17294x0;
        if (!inverse) {
            return androidx.compose.ui.graphics.Matrix.m2706mapMKHz9U(layerMatrixCache.m3807calculateMatrixGrdbGEg(deviceRenderNode), point);
        }
        float[] fArrM3806calculateInverseMatrixbWbORWo = layerMatrixCache.m3806calculateInverseMatrixbWbORWo(deviceRenderNode);
        return fArrM3806calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m2706mapMKHz9U(fArrM3806calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m2289getInfiniteF1C5BW0();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo3773movegyyYBs(long position) {
        DeviceRenderNode deviceRenderNode = this.F0;
        int left = deviceRenderNode.getLeft();
        int top = deviceRenderNode.getTop();
        int iM4507getXimpl = IntOffset.m4507getXimpl(position);
        int iM4508getYimpl = IntOffset.m4508getYimpl(position);
        if (left == iM4507getXimpl && top == iM4508getYimpl) {
            return;
        }
        if (left != iM4507getXimpl) {
            deviceRenderNode.offsetLeftAndRight(iM4507getXimpl - left);
        }
        if (top != iM4508getYimpl) {
            deviceRenderNode.offsetTopAndBottom(iM4508getYimpl - top);
        }
        int i10 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.ownerView;
        if (i10 >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.f17294x0.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo3774resizeozmzZPI(long size) {
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(size);
        int iM4548getHeightimpl = IntSize.m4548getHeightimpl(size);
        float fM2840getPivotFractionXimpl = TransformOrigin.m2840getPivotFractionXimpl(this.E0);
        float f6 = iM4549getWidthimpl;
        DeviceRenderNode deviceRenderNode = this.F0;
        deviceRenderNode.setPivotX(fM2840getPivotFractionXimpl * f6);
        float f10 = iM4548getHeightimpl;
        deviceRenderNode.setPivotY(TransformOrigin.m2841getPivotFractionYimpl(this.E0) * f10);
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), deviceRenderNode.getTop(), deviceRenderNode.getLeft() + iM4549getWidthimpl, deviceRenderNode.getTop() + iM4548getHeightimpl)) {
            long jSize = SizeKt.Size(f6, f10);
            OutlineResolver outlineResolver = this.f17291t0;
            outlineResolver.m3812updateuvyYCjk(jSize);
            deviceRenderNode.setOutline(outlineResolver.getOutline());
            invalidate();
            this.f17294x0.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        a(false);
        this.f17292u0 = false;
        this.v0 = false;
        this.E0 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        this.f17288q0 = drawBlock;
        this.f17289r0 = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo3775transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        androidx.compose.ui.graphics.Matrix.m2717timesAssign58bKbWc(matrix, this.f17294x0.m3807calculateMatrixGrdbGEg(this.F0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        Path clipPath;
        boolean z10 = this.f17290s0;
        DeviceRenderNode deviceRenderNode = this.F0;
        if (z10 || !deviceRenderNode.getHasDisplayList()) {
            a(false);
            if (deviceRenderNode.getClipToOutline()) {
                OutlineResolver outlineResolver = this.f17291t0;
                if (outlineResolver.getOutlineClipSupported()) {
                    clipPath = null;
                } else {
                    clipPath = outlineResolver.getClipPath();
                }
            } else {
                clipPath = null;
            }
            Function1<? super Canvas, Unit> function1 = this.f17288q0;
            if (function1 != null) {
                deviceRenderNode.record(this.f17295y0, clipPath, function1);
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: updateLayerProperties-dDxr-wY */
    public void mo3776updateLayerPropertiesdDxrwY(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.E0 = transformOrigin;
        DeviceRenderNode deviceRenderNode = this.F0;
        boolean clipToOutline = deviceRenderNode.getClipToOutline();
        OutlineResolver outlineResolver = this.f17291t0;
        boolean z10 = false;
        boolean z11 = clipToOutline && !outlineResolver.getOutlineClipSupported();
        deviceRenderNode.setScaleX(scaleX);
        deviceRenderNode.setScaleY(scaleY);
        deviceRenderNode.setAlpha(alpha);
        deviceRenderNode.setTranslationX(translationX);
        deviceRenderNode.setTranslationY(translationY);
        deviceRenderNode.setElevation(shadowElevation);
        deviceRenderNode.setAmbientShadowColor(ColorKt.m2561toArgb8_81llA(ambientShadowColor));
        deviceRenderNode.setSpotShadowColor(ColorKt.m2561toArgb8_81llA(spotShadowColor));
        deviceRenderNode.setRotationZ(rotationZ);
        deviceRenderNode.setRotationX(rotationX);
        deviceRenderNode.setRotationY(rotationY);
        deviceRenderNode.setCameraDistance(cameraDistance);
        deviceRenderNode.setPivotX(TransformOrigin.m2840getPivotFractionXimpl(transformOrigin) * deviceRenderNode.getWidth());
        deviceRenderNode.setPivotY(TransformOrigin.m2841getPivotFractionYimpl(transformOrigin) * deviceRenderNode.getHeight());
        deviceRenderNode.setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        deviceRenderNode.setClipToBounds(clip && shape == RectangleShapeKt.getRectangleShape());
        deviceRenderNode.setRenderEffect(renderEffect);
        deviceRenderNode.mo3792setCompositingStrategyaDBOjCE(compositingStrategy);
        boolean zUpdate = this.f17291t0.update(shape, deviceRenderNode.getAlpha(), deviceRenderNode.getClipToOutline(), deviceRenderNode.getElevation(), layoutDirection, density);
        deviceRenderNode.setOutline(outlineResolver.getOutline());
        if (deviceRenderNode.getClipToOutline() && !outlineResolver.getOutlineClipSupported()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zUpdate)) {
            invalidate();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.ownerView;
            if (i10 >= 26) {
                WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
        }
        if (!this.v0 && deviceRenderNode.getElevation() > 0.0f && (function0 = this.f17289r0) != null) {
            function0.invoke();
        }
        this.f17294x0.invalidate();
    }
}
