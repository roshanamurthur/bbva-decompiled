package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u0011\u0012\u0006\u0010.\u001a\u00020)¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J.\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001aH\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\fH\u0016R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u000e\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0004\"\u0004\b2\u00103R\"\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0004\"\u0004\b6\u00103R\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00100\u001a\u0004\b8\u0010\u0004\"\u0004\b9\u00103R\"\u0010\u0011\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u00100\u001a\u0004\b;\u0010\u0004\"\u0004\b<\u00103R$\u0010D\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010K\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0004R$\u0010Y\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR$\u0010_\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR$\u0010b\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010V\"\u0004\ba\u0010XR$\u0010e\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR$\u0010h\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010\u0004\"\u0004\bg\u00103R$\u0010k\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010\u0004\"\u0004\bj\u00103R$\u0010n\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR$\u0010q\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR$\u0010t\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010V\"\u0004\bs\u0010XR$\u0010w\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010V\"\u0004\bv\u0010XR$\u0010z\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010V\"\u0004\by\u0010XR$\u0010}\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR%\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b~\u0010\b\"\u0004\b\u007f\u0010JR'\u0010\u0083\u0001\u001a\u00020T2\u0006\u0010E\u001a\u00020T8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010V\"\u0005\b\u0082\u0001\u0010XR2\u0010\u0087\u0001\u001a\u00030\u0084\u00012\u0007\u0010E\u001a\u00030\u0084\u00018V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010\u0004\"\u0005\b\u0086\u0001\u00103R\u0016\u0010\u0089\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "getLayerType$ui_release", "()I", "getLayerType", "", "hasOverlappingRendering$ui_release", "()Z", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "", "setOutline", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "setPosition", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "setLeft", "(I)V", "e", "getTop", "setTop", "f", "getRight", "setRight", "g", "getBottom", "setBottom", "Landroidx/compose/ui/graphics/RenderEffect;", "h", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "value", "i", "Z", "getClipToBounds", "setClipToBounds", "(Z)V", "clipToBounds", "", "getUniqueId", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "clipToOutline", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
public final class RenderNodeApi23 implements DeviceRenderNode {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f17272j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RenderNode f17275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int left;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int top;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int right;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int bottom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RenderEffect renderEffect;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f17273k = true;

    /* JADX INFO: compiled from: RenderNodeApi23.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "()V", "needToValidateAccess", "", "testFailCreateRenderNode", "getTestFailCreateRenderNode$ui_release", "()Z", "setTestFailCreateRenderNode$ui_release", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.f17272j;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z10) {
            RenderNodeApi23.f17272j = z10;
        }
    }

    public RenderNodeApi23(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.ownerView = ownerView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", ownerView);
        Intrinsics.checkNotNullExpressionValue(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f17275b = renderNodeCreate;
        this.f17276c = CompositingStrategy.INSTANCE.m2589getAutoNrFUSI();
        if (f17273k) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                a1 a1Var = a1.f17375a;
                a1Var.c(renderNodeCreate, a1Var.a(renderNodeCreate));
                a1Var.d(renderNodeCreate, a1Var.b(renderNodeCreate));
            }
            if (i10 >= 24) {
                z0.f17457a.a(renderNodeCreate);
            } else {
                y0.f17456a.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f17273k = false;
        }
        if (f17272j) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        int i10 = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.f17275b;
        if (i10 >= 24) {
            z0.f17457a.a(renderNode);
        } else {
            y0.f17456a.a(renderNode);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f17275b);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        RenderNode renderNode = this.f17275b;
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, renderNode.getScaleX(), renderNode.getScaleY(), renderNode.getTranslationX(), renderNode.getTranslationY(), renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), renderNode.getRotation(), renderNode.getRotationX(), renderNode.getRotationY(), renderNode.getCameraDistance(), renderNode.getPivotX(), renderNode.getPivotY(), renderNode.getClipToOutline(), getClipToBounds(), renderNode.getAlpha(), getRenderEffect(), this.f17276c, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.f17275b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return Build.VERSION.SDK_INT >= 28 ? a1.f17375a.a(this.f17275b) : ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.f17275b.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.f17275b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public int getF17276c() {
        return this.f17276c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.f17275b.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.f17275b.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f17275b.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        return CompositingStrategy.m2585equalsimpl0(this.f17276c, CompositingStrategy.INSTANCE.m2591getOffscreenNrFUSI()) ? 2 : 0;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f17275b.getMatrix(matrix);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.f17275b.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.f17275b.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.f17275b.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.f17275b.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.f17275b.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.f17275b.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.f17275b.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return Build.VERSION.SDK_INT >= 28 ? a1.f17375a.b(this.f17275b) : ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.f17275b.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.f17275b.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.f17275b.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int offset) {
        setLeft(getLeft() + offset);
        setRight(getRight() + offset);
        this.f17275b.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int offset) {
        setTop(getTop() + offset);
        setBottom(getBottom() + offset);
        this.f17275b.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder, @Nullable Path clipPath, @NotNull Function1<? super androidx.compose.ui.graphics.Canvas, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        int width = getWidth();
        int height = getHeight();
        RenderNode renderNode = this.f17275b;
        DisplayListCanvas displayListCanvasStart = renderNode.start(width, height);
        Intrinsics.checkNotNullExpressionValue(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) displayListCanvasStart);
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
        renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f6) {
        this.f17275b.setAlpha(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            a1.f17375a.c(this.f17275b, i10);
        }
    }

    public void setBottom(int i10) {
        this.bottom = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f6) {
        this.f17275b.setCameraDistance(-f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z10) {
        this.clipToBounds = z10;
        this.f17275b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z10) {
        this.f17275b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo3792setCompositingStrategyaDBOjCE(int i10) {
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        boolean zM2585equalsimpl0 = CompositingStrategy.m2585equalsimpl0(i10, companion.m2591getOffscreenNrFUSI());
        RenderNode renderNode = this.f17275b;
        if (zM2585equalsimpl0) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m2585equalsimpl0(i10, companion.m2590getModulateAlphaNrFUSI())) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f17276c = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f6) {
        this.f17275b.setElevation(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean hasOverlappingRendering) {
        return this.f17275b.setHasOverlappingRendering(hasOverlappingRendering);
    }

    public void setLeft(int i10) {
        this.left = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline) {
        this.f17275b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f6) {
        this.f17275b.setPivotX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f6) {
        this.f17275b.setPivotY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int left, int top, int right, int bottom) {
        setLeft(left);
        setTop(top);
        setRight(right);
        setBottom(bottom);
        return this.f17275b.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public void setRight(int i10) {
        this.right = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f6) {
        this.f17275b.setRotationX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f6) {
        this.f17275b.setRotationY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f6) {
        this.f17275b.setRotation(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f6) {
        this.f17275b.setScaleX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f6) {
        this.f17275b.setScaleY(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            a1.f17375a.d(this.f17275b, i10);
        }
    }

    public void setTop(int i10) {
        this.top = i10;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f6) {
        this.f17275b.setTranslationX(f6);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f6) {
        this.f17275b.setTranslationY(f6);
    }
}
