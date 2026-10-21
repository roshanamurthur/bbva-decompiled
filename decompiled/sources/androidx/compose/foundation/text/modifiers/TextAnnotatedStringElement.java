package androidx.compose.foundation.text.modifiers;

import ad.e;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B²\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d\u0012\u001e\b\u0002\u0010\"\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001d\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "create", "node", "", "update", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnnotatedString f6235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextStyle f6236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FontFamily.Resolver f6237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<TextLayoutResult, Unit> f6238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<AnnotatedString.Range<Placeholder>> f6243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Function1<List<Rect>, Unit> f6244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final SelectionController f6245l;

    @Nullable
    public final ColorProducer m;

    public TextAnnotatedStringElement() {
        throw null;
    }

    public TextAnnotatedStringElement(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6235b = text;
        this.f6236c = style;
        this.f6237d = fontFamilyResolver;
        this.f6238e = function1;
        this.f6239f = i10;
        this.f6240g = z10;
        this.f6241h = i11;
        this.f6242i = i12;
        this.f6243j = list;
        this.f6244k = function2;
        this.f6245l = selectionController;
        this.m = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return Intrinsics.areEqual(this.m, textAnnotatedStringElement.m) && Intrinsics.areEqual(this.f6235b, textAnnotatedStringElement.f6235b) && Intrinsics.areEqual(this.f6236c, textAnnotatedStringElement.f6236c) && Intrinsics.areEqual(this.f6243j, textAnnotatedStringElement.f6243j) && Intrinsics.areEqual(this.f6237d, textAnnotatedStringElement.f6237d) && Intrinsics.areEqual(this.f6238e, textAnnotatedStringElement.f6238e) && TextOverflow.m4336equalsimpl0(this.f6239f, textAnnotatedStringElement.f6239f) && this.f6240g == textAnnotatedStringElement.f6240g && this.f6241h == textAnnotatedStringElement.f6241h && this.f6242i == textAnnotatedStringElement.f6242i && Intrinsics.areEqual(this.f6244k, textAnnotatedStringElement.f6244k) && Intrinsics.areEqual(this.f6245l, textAnnotatedStringElement.f6245l);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (this.f6237d.hashCode() + e.b(this.f6236c, this.f6235b.hashCode() * 31, 31)) * 31;
        Function1<TextLayoutResult, Unit> function1 = this.f6238e;
        int iM4337hashCodeimpl = (((((((TextOverflow.m4337hashCodeimpl(this.f6239f) + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31)) * 31) + (this.f6240g ? 1231 : 1237)) * 31) + this.f6241h) * 31) + this.f6242i) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.f6243j;
        int iHashCode2 = (iM4337hashCodeimpl + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<Rect>, Unit> function2 = this.f6244k;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.f6245l;
        int iHashCode4 = (iHashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.m;
        return iHashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.f6235b, this.f6236c, this.f6237d, this.f6238e, this.f6239f, this.f6240g, this.f6241h, this.f6242i, this.f6243j, this.f6244k, this.f6245l, this.m, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull TextAnnotatedStringNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.doInvalidations(node.updateDraw(this.m, this.f6236c), node.updateText(this.f6235b), node.m594updateLayoutRelatedArgsMPT68mk(this.f6236c, this.f6243j, this.f6242i, this.f6241h, this.f6240g, this.f6237d, this.f6239f), node.updateCallbacks(this.f6238e, this.f6244k, this.f6245l));
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, null);
    }
}
