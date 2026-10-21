package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Landroidx/compose/ui/text/TextLayoutInput;", "a", "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class CacheTextLayoutInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(@NotNull TextLayoutInput textLayoutInput) {
        Intrinsics.checkNotNullParameter(textLayoutInput, "textLayoutInput");
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) other;
        return Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m4336equalsimpl0(textLayoutInput.getOverflow(), cacheTextLayoutInput.textLayoutInput.getOverflow()) && Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m4357getMaxWidthimpl(textLayoutInput.getConstraints()) == Constraints.m4357getMaxWidthimpl(cacheTextLayoutInput.textLayoutInput.getConstraints()) && Constraints.m4356getMaxHeightimpl(textLayoutInput.getConstraints()) == Constraints.m4356getMaxHeightimpl(cacheTextLayoutInput.textLayoutInput.getConstraints());
    }

    @NotNull
    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return Constraints.m4356getMaxHeightimpl(textLayoutInput.getConstraints()) + ((Constraints.m4357getMaxWidthimpl(textLayoutInput.getConstraints()) + ((textLayoutInput.getFontFamilyResolver().hashCode() + ((textLayoutInput.getLayoutDirection().hashCode() + ((textLayoutInput.getDensity().hashCode() + ((TextOverflow.m4337hashCodeimpl(textLayoutInput.getOverflow()) + ((((textLayoutInput.getMaxLines() + ((textLayoutInput.getPlaceholders().hashCode() + ((textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release() + (textLayoutInput.getText().hashCode() * 31)) * 31)) * 31)) * 31) + (textLayoutInput.getSoftWrap() ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
