package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlaceholderExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "", "setPlaceholders", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
public final class PlaceholderExtensions_androidKt {
    public static final void setPlaceholders(@NotNull Spannable spannable, @NotNull List<AnnotatedString.Range<Placeholder>> list, @NotNull Density density) {
        int i10;
        int i11;
        int i12;
        int i13;
        List<AnnotatedString.Range<Placeholder>> placeholders = list;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            AnnotatedString.Range<Placeholder> range = placeholders.get(i14);
            Placeholder placeholderComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            Object[] spans = spannable.getSpans(start, end, EmojiSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, EmojiSpan::class.java)");
            for (Object obj : spans) {
                spannable.removeSpan((EmojiSpan) obj);
            }
            float fM4570getValueimpl = TextUnit.m4570getValueimpl(placeholderComponent1.getWidth());
            long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(placeholderComponent1.getWidth());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
                i10 = i14;
                i11 = 0;
            } else {
                i10 = i14;
                i11 = TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA()) ? 1 : 2;
            }
            float fM4570getValueimpl2 = TextUnit.m4570getValueimpl(placeholderComponent1.getHeight());
            long jM4569getTypeUIouoOA2 = TextUnit.m4569getTypeUIouoOA(placeholderComponent1.getHeight());
            int i15 = size;
            int i16 = TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion.m4603getSpUIouoOA()) ? 0 : TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion.m4602getEmUIouoOA()) ? 1 : 2;
            float density2 = density.getDensity() * density.getFontScale();
            int placeholderVerticalAlign = placeholderComponent1.getPlaceholderVerticalAlign();
            PlaceholderVerticalAlign.Companion companion2 = PlaceholderVerticalAlign.INSTANCE;
            if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3909getAboveBaselineJ6kI3mc())) {
                i13 = 0;
            } else if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3915getTopJ6kI3mc())) {
                i13 = 1;
            } else if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3910getBottomJ6kI3mc())) {
                i13 = 2;
            } else {
                if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3911getCenterJ6kI3mc())) {
                    i12 = 3;
                } else if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3914getTextTopJ6kI3mc())) {
                    i12 = 4;
                } else if (PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3912getTextBottomJ6kI3mc())) {
                    i12 = 5;
                } else {
                    if (!PlaceholderVerticalAlign.m3905equalsimpl0(placeholderVerticalAlign, companion2.m3913getTextCenterJ6kI3mc())) {
                        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
                    }
                    i12 = 6;
                }
                i13 = i12;
            }
            SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(fM4570getValueimpl, i11, fM4570getValueimpl2, i16, density2, i13), start, end);
            size = i15;
            i14 = i10 + 1;
            placeholders = list;
        }
    }
}
