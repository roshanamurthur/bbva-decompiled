package androidx.compose.ui.graphics;

import androidx.collection.j;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.s;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class GraphicsLayerElement extends ModifierNodeElement<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f15651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f15652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15653l;

    @NotNull
    public final Shape m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final RenderEffect f15655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f15656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f15657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15658r;

    public GraphicsLayerElement(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f15643b = f6;
        this.f15644c = f10;
        this.f15645d = f11;
        this.f15646e = f12;
        this.f15647f = f13;
        this.f15648g = f14;
        this.f15649h = f15;
        this.f15650i = f16;
        this.f15651j = f17;
        this.f15652k = f18;
        this.f15653l = j10;
        this.m = shape;
        this.f15654n = z10;
        this.f15655o = renderEffect;
        this.f15656p = j11;
        this.f15657q = j12;
        this.f15658r = i10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Shape shape = this.m;
        Intrinsics.checkNotNullParameter(shape, "shape");
        a aVar = new a();
        aVar.H0 = this.f15643b;
        aVar.I0 = this.f15644c;
        aVar.J0 = this.f15645d;
        aVar.K0 = this.f15646e;
        aVar.L0 = this.f15647f;
        aVar.M0 = this.f15648g;
        aVar.N0 = this.f15649h;
        aVar.O0 = this.f15650i;
        aVar.P0 = this.f15651j;
        aVar.Q0 = this.f15652k;
        aVar.R0 = this.f15653l;
        aVar.S0 = shape;
        aVar.T0 = this.f15654n;
        aVar.U0 = this.f15655o;
        aVar.V0 = this.f15656p;
        aVar.W0 = this.f15657q;
        aVar.X0 = this.f15658r;
        aVar.Y0 = new s(aVar);
        return aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f15643b, graphicsLayerElement.f15643b) == 0 && Float.compare(this.f15644c, graphicsLayerElement.f15644c) == 0 && Float.compare(this.f15645d, graphicsLayerElement.f15645d) == 0 && Float.compare(this.f15646e, graphicsLayerElement.f15646e) == 0 && Float.compare(this.f15647f, graphicsLayerElement.f15647f) == 0 && Float.compare(this.f15648g, graphicsLayerElement.f15648g) == 0 && Float.compare(this.f15649h, graphicsLayerElement.f15649h) == 0 && Float.compare(this.f15650i, graphicsLayerElement.f15650i) == 0 && Float.compare(this.f15651j, graphicsLayerElement.f15651j) == 0 && Float.compare(this.f15652k, graphicsLayerElement.f15652k) == 0 && TransformOrigin.m2839equalsimpl0(this.f15653l, graphicsLayerElement.f15653l) && Intrinsics.areEqual(this.m, graphicsLayerElement.m) && this.f15654n == graphicsLayerElement.f15654n && Intrinsics.areEqual(this.f15655o, graphicsLayerElement.f15655o) && Color.m2509equalsimpl0(this.f15656p, graphicsLayerElement.f15656p) && Color.m2509equalsimpl0(this.f15657q, graphicsLayerElement.f15657q) && CompositingStrategy.m2585equalsimpl0(this.f15658r, graphicsLayerElement.f15658r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((TransformOrigin.m2842hashCodeimpl(this.f15653l) + z1.a(this.f15652k, z1.a(this.f15651j, z1.a(this.f15650i, z1.a(this.f15649h, z1.a(this.f15648g, z1.a(this.f15647f, z1.a(this.f15646e, z1.a(this.f15645d, z1.a(this.f15644c, Float.floatToIntBits(this.f15643b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31;
        boolean z10 = this.f15654n;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        RenderEffect renderEffect = this.f15655o;
        return CompositingStrategy.m2586hashCodeimpl(this.f15658r) + j.a(this.f15657q, j.a(this.f15656p, (i10 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31, 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "graphicsLayer").set("scaleX", Float.valueOf(this.f15643b));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("scaleY", Float.valueOf(this.f15644c));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("alpha", Float.valueOf(this.f15645d));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("translationX", Float.valueOf(this.f15646e));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("translationY", Float.valueOf(this.f15647f));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("shadowElevation", Float.valueOf(this.f15648g));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("rotationX", Float.valueOf(this.f15649h));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("rotationY", Float.valueOf(this.f15650i));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("rotationZ", Float.valueOf(this.f15651j));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("cameraDistance", Float.valueOf(this.f15652k));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("transformOrigin", TransformOrigin.m2832boximpl(this.f15653l));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("shape", this.m);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f15654n, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "clip", inspectorInfo).set("renderEffect", this.f15655o);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("ambientShadowColor", Color.m2498boximpl(this.f15656p));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("spotShadowColor", Color.m2498boximpl(this.f15657q));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("compositingStrategy", CompositingStrategy.m2582boximpl(this.f15658r));
    }

    @NotNull
    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f15643b + ", scaleY=" + this.f15644c + ", alpha=" + this.f15645d + ", translationX=" + this.f15646e + ", translationY=" + this.f15647f + ", shadowElevation=" + this.f15648g + ", rotationX=" + this.f15649h + ", rotationY=" + this.f15650i + ", rotationZ=" + this.f15651j + ", cameraDistance=" + this.f15652k + ", transformOrigin=" + ((Object) TransformOrigin.m2843toStringimpl(this.f15653l)) + ", shape=" + this.m + ", clip=" + this.f15654n + ", renderEffect=" + this.f15655o + ", ambientShadowColor=" + ((Object) Color.m2516toStringimpl(this.f15656p)) + ", spotShadowColor=" + ((Object) Color.m2516toStringimpl(this.f15657q)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m2587toStringimpl(this.f15658r)) + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        a node2 = (a) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f15643b;
        node2.I0 = this.f15644c;
        node2.J0 = this.f15645d;
        node2.K0 = this.f15646e;
        node2.L0 = this.f15647f;
        node2.M0 = this.f15648g;
        node2.N0 = this.f15649h;
        node2.O0 = this.f15650i;
        node2.P0 = this.f15651j;
        node2.Q0 = this.f15652k;
        node2.R0 = this.f15653l;
        Shape shape = this.m;
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        node2.S0 = shape;
        node2.T0 = this.f15654n;
        node2.U0 = this.f15655o;
        node2.V0 = this.f15656p;
        node2.W0 = this.f15657q;
        node2.X0 = this.f15658r;
        NodeCoordinator wrapped = DelegatableNodeKt.m3653requireCoordinator64DMado(node2, NodeKind.m3725constructorimpl(2)).getWrapped();
        if (wrapped != null) {
            wrapped.updateLayerBlock(node2.Y0, true);
        }
    }
}
