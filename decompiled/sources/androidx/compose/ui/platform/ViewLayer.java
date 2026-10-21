package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002|=B9\u0012\u0006\u0010[\u001a\u00020V\u0012\u0006\u0010a\u001a\u00020\\\u0012\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020 0J\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020 0L¢\u0006\u0004\bz\u0010{J¯\u0001\u0010#\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\b\u0010$\u001a\u00020\u0013H\u0016J\u001d\u0010)\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010.\u001a\u00020 2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020 2\u0006\u0010&\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010-J\u0010\u00104\u001a\u00020 2\u0006\u00103\u001a\u000202H\u0016J\u0010\u00106\u001a\u00020 2\u0006\u00103\u001a\u000205H\u0014J\b\u00107\u001a\u00020 H\u0016J0\u0010>\u001a\u00020 2\u0006\u00108\u001a\u00020\u00132\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u0002092\u0006\u0010=\u001a\u000209H\u0014J\b\u0010?\u001a\u00020 H\u0016J\b\u0010@\u001a\u00020 H\u0016J\b\u0010A\u001a\u00020 H\u0016J%\u0010F\u001a\u00020%2\u0006\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u0018\u0010I\u001a\u00020 2\u0006\u0010H\u001a\u00020G2\u0006\u0010C\u001a\u00020\u0013H\u0016J*\u0010N\u001a\u00020 2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020 0J2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020 0LH\u0016J\u001d\u0010S\u001a\u00020 2\u0006\u0010P\u001a\u00020OH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020 2\u0006\u0010P\u001a\u00020OH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010RR\u0017\u0010[\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010a\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R*\u0010e\u001a\u00020\u00132\u0006\u0010b\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010mR$\u0010u\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006}"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "hasOverlappingRendering", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawLayer", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", "t", "r", "b", "onLayout", "destroy", "updateDisplayList", "forceLayout", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "q0", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "value", "w0", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "H0", "J", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final a I0 = a.f17333p0;

    @NotNull
    public static final ViewLayer$Companion$OutlineProvider$1 J0 = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Outline outline2 = ((ViewLayer) view).f17328t0.getOutline();
            Intrinsics.checkNotNull(outline2);
            outline.set(outline2);
        }
    };

    @Nullable
    public static Method K0;

    @Nullable
    public static Field L0;
    public static boolean M0;
    public static boolean N0;

    @NotNull
    public final LayerMatrixCache<View> E0;
    public long F0;
    public boolean G0;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawChildContainer container;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Function1<? super Canvas, Unit> f17326r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f17327s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final OutlineResolver f17328t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f17329u0;

    @Nullable
    public Rect v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f17331x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final CanvasHolder f17332y0;

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "getMatrix", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", "view", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.M0;
        }

        @NotNull
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.J0;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.N0;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z10) {
            ViewLayer.N0 = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.M0 = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.K0 = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.L0 = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.K0 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.L0 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.K0;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.L0;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.L0;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.K0;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    public static final class a extends Lambda implements Function2<View, Matrix, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17333p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(View view, Matrix matrix) {
            View view2 = view;
            Matrix matrix2 = matrix;
            Intrinsics.checkNotNullParameter(view2, "view");
            Intrinsics.checkNotNullParameter(matrix2, "matrix");
            matrix2.set(view2.getMatrix());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @RequiresApi(29)
    public static final class b {
        @JvmStatic
        @DoNotInline
        public static final long a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(@NotNull AndroidComposeView ownerView, @NotNull DrawChildContainer container, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.f17326r0 = drawBlock;
        this.f17327s0 = invalidateParentLayer;
        this.f17328t0 = new OutlineResolver(ownerView.getDensity());
        this.f17332y0 = new CanvasHolder();
        this.E0 = new LayerMatrixCache<>(I0);
        this.F0 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        this.G0 = true;
        setWillNotDraw(false);
        container.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            OutlineResolver outlineResolver = this.f17328t0;
            if (!outlineResolver.getOutlineClipSupported()) {
                return outlineResolver.getClipPath();
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    public final void a() {
        Rect rect;
        if (this.f17329u0) {
            Rect rect2 = this.v0;
            if (rect2 == null) {
                this.v0 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.v0;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.requestClearInvalidObservations();
        this.f17326r0 = null;
        this.f17327s0 = null;
        androidComposeView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        CanvasHolder canvasHolder = this.f17332y0;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.f17328t0.clipToOutline(androidCanvas);
            z10 = true;
        }
        Function1<? super Canvas, Unit> function1 = this.f17326r0;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z10) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.f17331x0 = z10;
        if (z10) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.f17331x0) {
            canvas.disableZ();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.G0;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo3770inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArrM3806calculateInverseMatrixbWbORWo = this.E0.m3806calculateInverseMatrixbWbORWo(this);
        if (fArrM3806calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2717timesAssign58bKbWc(matrix, fArrM3806calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo3771isInLayerk4lQ0M(long position) {
        float fM2275getXimpl = Offset.m2275getXimpl(position);
        float fM2276getYimpl = Offset.m2276getYimpl(position);
        if (this.f17329u0) {
            return 0.0f <= fM2275getXimpl && fM2275getXimpl < ((float) getWidth()) && 0.0f <= fM2276getYimpl && fM2276getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f17328t0.m3811isInOutlinek4lQ0M(position);
        }
        return true;
    }

    /* JADX INFO: renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        LayerMatrixCache<View> layerMatrixCache = this.E0;
        if (!inverse) {
            androidx.compose.ui.graphics.Matrix.m2708mapimpl(layerMatrixCache.m3807calculateMatrixGrdbGEg(this), rect);
            return;
        }
        float[] fArrM3806calculateInverseMatrixbWbORWo = layerMatrixCache.m3806calculateInverseMatrixbWbORWo(this);
        if (fArrM3806calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2708mapimpl(fArrM3806calculateInverseMatrixbWbORWo, rect);
        } else {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo3772mapOffset8S9VItk(long point, boolean inverse) {
        LayerMatrixCache<View> layerMatrixCache = this.E0;
        if (!inverse) {
            return androidx.compose.ui.graphics.Matrix.m2706mapMKHz9U(layerMatrixCache.m3807calculateMatrixGrdbGEg(this), point);
        }
        float[] fArrM3806calculateInverseMatrixbWbORWo = layerMatrixCache.m3806calculateInverseMatrixbWbORWo(this);
        return fArrM3806calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m2706mapMKHz9U(fArrM3806calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m2289getInfiniteF1C5BW0();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo3773movegyyYBs(long position) {
        int iM4507getXimpl = IntOffset.m4507getXimpl(position);
        int left = getLeft();
        LayerMatrixCache<View> layerMatrixCache = this.E0;
        if (iM4507getXimpl != left) {
            offsetLeftAndRight(iM4507getXimpl - getLeft());
            layerMatrixCache.invalidate();
        }
        int iM4508getYimpl = IntOffset.m4508getYimpl(position);
        if (iM4508getYimpl != getTop()) {
            offsetTopAndBottom(iM4508getYimpl - getTop());
            layerMatrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo3774resizeozmzZPI(long size) {
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(size);
        int iM4548getHeightimpl = IntSize.m4548getHeightimpl(size);
        if (iM4549getWidthimpl == getWidth() && iM4548getHeightimpl == getHeight()) {
            return;
        }
        float f6 = iM4549getWidthimpl;
        setPivotX(TransformOrigin.m2840getPivotFractionXimpl(this.F0) * f6);
        float f10 = iM4548getHeightimpl;
        setPivotY(TransformOrigin.m2841getPivotFractionYimpl(this.F0) * f10);
        long jSize = SizeKt.Size(f6, f10);
        OutlineResolver outlineResolver = this.f17328t0;
        outlineResolver.m3812updateuvyYCjk(jSize);
        setOutlineProvider(outlineResolver.getOutline() != null ? J0 : null);
        layout(getLeft(), getTop(), getLeft() + iM4549getWidthimpl, getTop() + iM4548getHeightimpl);
        a();
        this.E0.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.container.addView(this);
        this.f17329u0 = false;
        this.f17331x0 = false;
        this.F0 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        this.f17326r0 = drawBlock;
        this.f17327s0 = invalidateParentLayer;
    }

    public final void setCameraDistancePx(float f6) {
        setCameraDistance(f6 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo3775transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        androidx.compose.ui.graphics.Matrix.m2717timesAssign58bKbWc(matrix, this.E0.m3807calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || N0) {
            return;
        }
        setInvalidated(false);
        INSTANCE.updateDisplayList(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: updateLayerProperties-dDxr-wY */
    public void mo3776updateLayerPropertiesdDxrwY(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.F0 = transformOrigin;
        setScaleX(scaleX);
        setScaleY(scaleY);
        setAlpha(alpha);
        setTranslationX(translationX);
        setTranslationY(translationY);
        setElevation(shadowElevation);
        setRotation(rotationZ);
        setRotationX(rotationX);
        setRotationY(rotationY);
        setPivotX(TransformOrigin.m2840getPivotFractionXimpl(this.F0) * getWidth());
        setPivotY(TransformOrigin.m2841getPivotFractionYimpl(this.F0) * getHeight());
        setCameraDistancePx(cameraDistance);
        boolean z10 = true;
        this.f17329u0 = clip && shape == RectangleShapeKt.getRectangleShape();
        a();
        boolean z11 = getManualClipPath() != null;
        setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        boolean zUpdate = this.f17328t0.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f17328t0.getOutline() != null ? J0 : null);
        boolean z12 = getManualClipPath() != null;
        if (z11 != z12 || (z12 && zUpdate)) {
            invalidate();
        }
        if (!this.f17331x0 && getElevation() > 0.0f && (function0 = this.f17327s0) != null) {
            function0.invoke();
        }
        this.E0.invalidate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            i1 i1Var = i1.f17408a;
            i1Var.a(this, ColorKt.m2561toArgb8_81llA(ambientShadowColor));
            i1Var.b(this, ColorKt.m2561toArgb8_81llA(spotShadowColor));
        }
        if (i10 >= 31) {
            k1.f17414a.a(this, renderEffect);
        }
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.m2585equalsimpl0(compositingStrategy, companion.m2591getOffscreenNrFUSI())) {
            setLayerType(2, null);
        } else if (CompositingStrategy.m2585equalsimpl0(compositingStrategy, companion.m2590getModulateAlphaNrFUSI())) {
            setLayerType(0, null);
            z10 = false;
        } else {
            setLayerType(0, null);
        }
        this.G0 = z10;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
    }
}
