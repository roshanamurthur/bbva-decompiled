package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/IntSize;", "computeSizeForDefaultText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;I)J", "DefaultWidthCharCount", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "a", "Ljava/lang/String;", "getEmptyTextReplacement", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f5989a = kotlin.text.l.repeat("H", 10);

    public static final long computeSizeForDefaultText(@NotNull TextStyle style, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull String text, int i10) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(text, "text");
        Paragraph paragraphM3876ParagraphUdtVg6A = ParagraphKt.m3876ParagraphUdtVg6A(text, style, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, fontFamilyResolver, (96 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsKt.emptyList(), (96 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : i10, (96 & 256) != 0 ? false : false);
        return IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraphM3876ParagraphUdtVg6A.getMinIntrinsicWidth()), TextDelegateKt.ceilToIntPx(paragraphM3876ParagraphUdtVg6A.getHeight()));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f5989a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i10);
    }

    @NotNull
    public static final String getEmptyTextReplacement() {
        return f5989a;
    }
}
