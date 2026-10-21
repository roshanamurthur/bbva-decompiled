package androidx.compose.foundation.text.modifiers;

import ad.e;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextStringSimpleElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BV\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "create", "node", "", "update", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f6248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextStyle f6249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FontFamily.Resolver f6250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ColorProducer f6255i;

    public TextStringSimpleElement(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6248b = text;
        this.f6249c = style;
        this.f6250d = fontFamilyResolver;
        this.f6251e = i10;
        this.f6252f = z10;
        this.f6253g = i11;
        this.f6254h = i12;
        this.f6255i = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return Intrinsics.areEqual(this.f6255i, textStringSimpleElement.f6255i) && Intrinsics.areEqual(this.f6248b, textStringSimpleElement.f6248b) && Intrinsics.areEqual(this.f6249c, textStringSimpleElement.f6249c) && Intrinsics.areEqual(this.f6250d, textStringSimpleElement.f6250d) && TextOverflow.m4336equalsimpl0(this.f6251e, textStringSimpleElement.f6251e) && this.f6252f == textStringSimpleElement.f6252f && this.f6253g == textStringSimpleElement.f6253g && this.f6254h == textStringSimpleElement.f6254h;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM4337hashCodeimpl = (((((((TextOverflow.m4337hashCodeimpl(this.f6251e) + ((this.f6250d.hashCode() + e.b(this.f6249c, this.f6248b.hashCode() * 31, 31)) * 31)) * 31) + (this.f6252f ? 1231 : 1237)) * 31) + this.f6253g) * 31) + this.f6254h) * 31;
        ColorProducer colorProducer = this.f6255i;
        return iM4337hashCodeimpl + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.f6248b, this.f6249c, this.f6250d, this.f6251e, this.f6252f, this.f6253g, this.f6254h, this.f6255i, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull TextStringSimpleNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.doInvalidations(node.updateDraw(this.f6255i, this.f6249c), node.updateText(this.f6248b), node.m595updateLayoutRelatedArgsHuAbxIM(this.f6249c, this.f6254h, this.f6253g, this.f6252f, this.f6250d, this.f6251e));
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : colorProducer, null);
    }
}
