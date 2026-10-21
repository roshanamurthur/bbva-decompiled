package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\br\u0010sJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR+\u0010'\u001a\u00020 8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010+\u001a\u00020 8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\"\u00107\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR\"\u0010;\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR+\u0010@\u001a\u00020<8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\"\u0010H\u001a\u00020A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010X\u001a\u00020Q8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010]\u001a\u00020Y8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\"\u0010e\u001a\u00020^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u0004\u0018\u00010f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\bR\u0014\u0010q\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "reset", "", "p0", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "q0", "getScaleY", "setScaleY", "scaleY", "r0", "getAlpha", "setAlpha", "alpha", "s0", "getTranslationX", "setTranslationX", "translationX", "t0", "getTranslationY", "setTranslationY", "translationY", "u0", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "v0", "J", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "ambientShadowColor", "w0", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "x0", "getRotationX", "setRotationX", "rotationX", "y0", "getRotationY", "setRotationY", "rotationY", "E0", "getRotationZ", "setRotationZ", "rotationZ", "F0", "getCameraDistance", "setCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "G0", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "H0", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "", "I0", "Z", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/CompositingStrategy;", "J0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "compositingStrategy", "Landroidx/compose/ui/geometry/Size;", "K0", "getSize-NH-jbRc", "setSize-uvyYCjk", "size", "Landroidx/compose/ui/unit/Density;", "L0", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "graphicsDensity", "Landroidx/compose/ui/graphics/RenderEffect;", "M0", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getDensity", "density", "getFontScale", "fontScale", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public boolean clip;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @Nullable
    public RenderEffect renderEffect;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public float scaleX = 1.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public float scaleY = 1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public float alpha = 1.0f;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public long transformOrigin = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Shape shape = RectangleShapeKt.getRectangleShape();

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public int compositingStrategy = CompositingStrategy.INSTANCE.m2589getAutoNrFUSI();

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public long size = Size.INSTANCE.m2352getUnspecifiedNHjbRc();

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @NotNull
    /* JADX INFO: renamed from: getGraphicsDensity$ui_release, reason: from getter */
    public final Density getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @NotNull
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo2661setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo2663setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo2664setTransformOrigin__ExYCQ(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo2662setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m2589getAutoNrFUSI());
        m2775setSizeuvyYCjk(Size.INSTANCE.m2352getUnspecifiedNHjbRc());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
        return x1.a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
        return x1.a.b(this, f6);
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f6) {
        this.alpha = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo2661setAmbientShadowColor8_81llA(long j10) {
        this.ambientShadowColor = j10;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f6) {
        this.cameraDistance = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z10) {
        this.clip = z10;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo2662setCompositingStrategyaDBOjCE(int i10) {
        this.compositingStrategy = i10;
    }

    public final void setGraphicsDensity$ui_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.graphicsDensity = density;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f6) {
        this.rotationX = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f6) {
        this.rotationY = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f6) {
        this.rotationZ = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f6) {
        this.scaleX = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f6) {
        this.scaleY = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f6) {
        this.shadowElevation = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(@NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.shape = shape;
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m2775setSizeuvyYCjk(long j10) {
        this.size = j10;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo2663setSpotShadowColor8_81llA(long j10) {
        this.spotShadowColor = j10;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ */
    public void mo2664setTransformOrigin__ExYCQ(long j10) {
        this.transformOrigin = j10;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f6) {
        this.translationX = f6;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f6) {
        this.translationY = f6;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
        return x1.a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
        return x1.a.d(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
        return x1.a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
        return x1.a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final /* synthetic */ float mo415toPx0680j_4(float f6) {
        return x1.a.h(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    public final /* synthetic */ Rect toRect(DpRect dpRect) {
        return x1.a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
        return x1.a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
        return x1.a.k(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
        return x1.a.l(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
        return x1.a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
        return x1.a.m(this, i10);
    }
}
