package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\"\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000fø\u0001\u0002¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0019\u0010\f\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J4\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R \u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "Landroidx/compose/ui/graphics/Brush;", "component2", "Landroidx/compose/ui/graphics/Shape;", "component3", "width", "brush", "shape", "copy-8Feqmps", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/foundation/BorderModifierNodeElement;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "F", "getWidth-D9Ej5fM", "c", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "d", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Brush brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Shape shape;

    public BorderModifierNodeElement(float f6, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.width = f6;
        this.brush = brush;
        this.shape = shape;
    }

    /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m135copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f6, Brush brush, Shape shape, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = borderModifierNodeElement.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i10 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m137copy8Feqmps(f6, brush, shape);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m137copy8Feqmps(float width, @NotNull Brush brush, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new BorderModifierNodeElement(width, brush, shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return Dp.m4394equalsimpl0(this.width, borderModifierNodeElement.width) && Intrinsics.areEqual(this.brush, borderModifierNodeElement.brush) && Intrinsics.areEqual(this.shape, borderModifierNodeElement.shape);
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m138getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shape.hashCode() + ((this.brush.hashCode() + (Dp.m4395hashCodeimpl(this.width) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", OutlinedTextFieldKt.BorderId).set("width", Dp.m4387boximpl(this.width));
        Brush brush = this.brush;
        if (brush instanceof SolidColor) {
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("color", Color.m2498boximpl(((SolidColor) brush).getValue()));
            inspectorInfo.setValue(Color.m2498boximpl(((SolidColor) brush).getValue()));
        } else {
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("brush", brush);
        }
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("shape", this.shape);
    }

    @NotNull
    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.m4400toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull BorderModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m134setWidth0680j_4(this.width);
        node.setBrush(this.brush);
        node.setShape(this.shape);
    }
}
