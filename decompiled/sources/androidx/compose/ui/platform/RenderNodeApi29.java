package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\b}\u0010~J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\nH\u0016R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00103R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u0010\u0010\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00103R\u0014\u00108\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00103R\u0014\u0010:\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00103R$\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R$\u0010G\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R$\u0010J\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010>\"\u0004\bI\u0010@R$\u0010M\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R$\u0010Q\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u00103\"\u0004\bO\u0010PR$\u0010T\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u00103\"\u0004\bS\u0010PR$\u0010W\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R$\u0010Z\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010>\"\u0004\bY\u0010@R$\u0010]\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010@R$\u0010`\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010>\"\u0004\b_\u0010@R$\u0010c\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010>\"\u0004\bb\u0010@R$\u0010f\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010>\"\u0004\be\u0010@R$\u0010j\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010\u0004\"\u0004\bh\u0010iR$\u0010m\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010\u0004\"\u0004\bl\u0010iR$\u0010p\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010>\"\u0004\bo\u0010@R(\u0010v\u001a\u0004\u0018\u00010q2\b\u0010<\u001a\u0004\u0018\u00010q8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR-\u0010z\u001a\u00020w2\u0006\u0010<\u001a\u00020w8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bx\u00103\"\u0004\by\u0010PR\u0014\u0010|\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "isUsingCompositingLayer$ui_release", "()Z", "isUsingCompositingLayer", "hasOverlappingRendering$ui_release", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "", "setOutline", "", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "setPosition", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RenderNode f17284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RenderEffect f17285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17286d;

    public RenderNodeApi29(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.ownerView = ownerView;
        this.f17284b = androidx.appcompat.widget.j0.d();
        this.f17286d = CompositingStrategy.INSTANCE.m2589getAutoNrFUSI();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.f17284b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f17284b);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        RenderNode renderNode = this.f17284b;
        return new DeviceRenderNodeData(renderNode.getUniqueId(), renderNode.getLeft(), renderNode.getTop(), renderNode.getRight(), renderNode.getBottom(), renderNode.getWidth(), renderNode.getHeight(), renderNode.getScaleX(), renderNode.getScaleY(), renderNode.getTranslationX(), renderNode.getTranslationY(), renderNode.getElevation(), renderNode.getAmbientShadowColor(), renderNode.getSpotShadowColor(), renderNode.getRotationZ(), renderNode.getRotationX(), renderNode.getRotationY(), renderNode.getCameraDistance(), renderNode.getPivotX(), renderNode.getPivotY(), renderNode.getClipToOutline(), renderNode.getClipToBounds(), renderNode.getAlpha(), this.f17285c, this.f17286d, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.f17284b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return this.f17284b.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.f17284b.getBottom();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return this.f17284b.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.f17284b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.f17284b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public int getF17286d() {
        return this.f17286d;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.f17284b.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.f17284b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.f17284b.getHeight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f17284b.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.f17284b.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f17284b.getMatrix(matrix);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.f17284b.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.f17284b.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @Nullable
    /* JADX INFO: renamed from: getRenderEffect, reason: from getter */
    public RenderEffect getF17285c() {
        return this.f17285c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.f17284b.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.f17284b.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.f17284b.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.f17284b.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.f17284b.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.f17284b.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return this.f17284b.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.f17284b.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.f17284b.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.f17284b.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return this.f17284b.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.f17284b.getWidth();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.f17284b.hasOverlappingRendering();
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.f17284b.getUseCompositingLayer();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int offset) {
        this.f17284b.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int offset) {
        this.f17284b.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder, @Nullable Path clipPath, @NotNull Function1<? super androidx.compose.ui.graphics.Canvas, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        RenderNode renderNode = this.f17284b;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.save();
            y0.c.m(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f6) {
        this.f17284b.setAlpha(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i10) {
        this.f17284b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f6) {
        this.f17284b.setCameraDistance(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z10) {
        this.f17284b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z10) {
        this.f17284b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo3792setCompositingStrategyaDBOjCE(int i10) {
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        boolean zM2585equalsimpl0 = CompositingStrategy.m2585equalsimpl0(i10, companion.m2591getOffscreenNrFUSI());
        RenderNode renderNode = this.f17284b;
        if (zM2585equalsimpl0) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m2585equalsimpl0(i10, companion.m2590getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f17286d = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f6) {
        this.f17284b.setElevation(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean hasOverlappingRendering) {
        return this.f17284b.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline) {
        this.f17284b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f6) {
        this.f17284b.setPivotX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f6) {
        this.f17284b.setPivotY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int left, int top, int right, int bottom) {
        return this.f17284b.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.f17285c = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            x0.f17455a.a(this.f17284b, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f6) {
        this.f17284b.setRotationX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f6) {
        this.f17284b.setRotationY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f6) {
        this.f17284b.setRotationZ(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f6) {
        this.f17284b.setScaleX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f6) {
        this.f17284b.setScaleY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i10) {
        this.f17284b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f6) {
        this.f17284b.setTranslationX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f6) {
        this.f17284b.setTranslationY(f6);
    }
}
