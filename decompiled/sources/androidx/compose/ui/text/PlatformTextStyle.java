package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0018B\u0014\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "", "toString", "Landroidx/compose/ui/text/PlatformSpanStyle;", "a", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "b", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "<init>", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "includeFontPadding", "(Z)V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformTextStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PlatformSpanStyle spanStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PlatformParagraphStyle paragraphStyle;

    public PlatformTextStyle(@Nullable PlatformSpanStyle platformSpanStyle, @Nullable PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return Intrinsics.areEqual(this.paragraphStyle, platformTextStyle.paragraphStyle) && Intrinsics.areEqual(this.spanStyle, platformTextStyle.spanStyle);
    }

    @Nullable
    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @Nullable
    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ PlatformTextStyle(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public PlatformTextStyle(boolean z10) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z10));
    }

    public PlatformTextStyle(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i10, null));
    }
}
