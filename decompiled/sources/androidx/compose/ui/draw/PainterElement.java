package androidx.compose.ui.draw;

import androidx.activity.a;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.g;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lw0/g;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class PainterElement extends ModifierNodeElement<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Painter f15448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Alignment f15450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ContentScale f15451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ColorFilter f15453g;

    public PainterElement(@NotNull Painter painter, boolean z10, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f6, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f15448b = painter;
        this.f15449c = z10;
        this.f15450d = alignment;
        this.f15451e = contentScale;
        this.f15452f = f6;
        this.f15453g = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Painter painter = this.f15448b;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Alignment alignment = this.f15450d;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        ContentScale contentScale = this.f15451e;
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        g gVar = new g();
        gVar.H0 = painter;
        gVar.I0 = this.f15449c;
        gVar.J0 = alignment;
        gVar.K0 = contentScale;
        gVar.L0 = this.f15452f;
        gVar.M0 = this.f15453g;
        return gVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.areEqual(this.f15448b, painterElement.f15448b) && this.f15449c == painterElement.f15449c && Intrinsics.areEqual(this.f15450d, painterElement.f15450d) && Intrinsics.areEqual(this.f15451e, painterElement.f15451e) && Float.compare(this.f15452f, painterElement.f15452f) == 0 && Intrinsics.areEqual(this.f15453g, painterElement.f15453g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.f15448b.hashCode() * 31;
        boolean z10 = this.f15449c;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA = z1.a(this.f15452f, (this.f15451e.hashCode() + ((this.f15450d.hashCode() + ((iHashCode + r3) * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.f15453g;
        return iA + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "paint").set("painter", this.f15448b);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f15449c, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "sizeToIntrinsics", inspectorInfo).set("alignment", this.f15450d);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("contentScale", this.f15451e);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("alpha", Float.valueOf(this.f15452f));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("colorFilter", this.f15453g);
    }

    @NotNull
    public final String toString() {
        return "PainterElement(painter=" + this.f15448b + ", sizeToIntrinsics=" + this.f15449c + ", alignment=" + this.f15450d + ", contentScale=" + this.f15451e + ", alpha=" + this.f15452f + ", colorFilter=" + this.f15453g + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        g node2 = (g) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        boolean z10 = node2.I0;
        Painter painter = this.f15448b;
        boolean z11 = this.f15449c;
        boolean z12 = z10 != z11 || (z11 && !Size.m2340equalsimpl0(node2.H0.mo3001getIntrinsicSizeNHjbRc(), painter.mo3001getIntrinsicSizeNHjbRc()));
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        node2.H0 = painter;
        node2.I0 = z11;
        Alignment alignment = this.f15450d;
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        node2.J0 = alignment;
        ContentScale contentScale = this.f15451e;
        Intrinsics.checkNotNullParameter(contentScale, "<set-?>");
        node2.K0 = contentScale;
        node2.L0 = this.f15452f;
        node2.M0 = this.f15453g;
        if (z12) {
            LayoutModifierNodeKt.invalidateMeasurement(node2);
        }
        DrawModifierNodeKt.invalidateDraw(node2);
    }
}
