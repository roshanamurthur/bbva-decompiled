package com.bbva.component.ui.carousel.view.compose.theme;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "default", DynamicLink.Builder.KEY_LINK, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/TextStyle;", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "b", "getLink", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Typography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle link;

    /* JADX WARN: Multi-variable type inference failed */
    public Typography() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textStyle = typography.default;
        }
        if ((i10 & 2) != 0) {
            textStyle2 = typography.link;
        }
        return typography.copy(textStyle, textStyle2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextStyle getDefault() {
        return this.default;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getLink() {
        return this.link;
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle textStyle, @NotNull TextStyle link) {
        Intrinsics.checkNotNullParameter(textStyle, "default");
        Intrinsics.checkNotNullParameter(link, "link");
        return new Typography(textStyle, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.default, typography.default) && Intrinsics.areEqual(this.link, typography.link);
    }

    @NotNull
    public final TextStyle getDefault() {
        return this.default;
    }

    @NotNull
    public final TextStyle getLink() {
        return this.link;
    }

    public int hashCode() {
        return this.link.hashCode() + (this.default.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Typography(default=" + this.default + ", link=" + this.link + ")";
    }

    public Typography(@NotNull TextStyle textStyle, @NotNull TextStyle link) {
        Intrinsics.checkNotNullParameter(textStyle, "default");
        Intrinsics.checkNotNullParameter(link, "link");
        this.default = textStyle;
        this.link = link;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (i10 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2);
    }
}
