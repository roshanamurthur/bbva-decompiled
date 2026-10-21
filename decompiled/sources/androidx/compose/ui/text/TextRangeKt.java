package androidx.compose.ui.text;

import androidx.collection.g;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\n\u0010\r\u001a'\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "TextRange", "(II)J", FirebaseAnalytics.Param.INDEX, "(I)J", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "coerceIn", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
public final class TextRangeKt {
    public static final long TextRange(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g.b("start cannot be negative. [start: ", i10, ", end: ", i11, AbstractJsonLexerKt.END_LIST).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(g.b("end cannot be negative. [start: ", i10, ", end: ", i11, AbstractJsonLexerKt.END_LIST).toString());
        }
        return TextRange.m3956constructorimpl((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m3973coerceIn8ffj60Q(long j10, int i10, int i11) {
        int iCoerceIn = c.coerceIn(TextRange.m3967getStartimpl(j10), i10, i11);
        int iCoerceIn2 = c.coerceIn(TextRange.m3962getEndimpl(j10), i10, i11);
        return (iCoerceIn == TextRange.m3967getStartimpl(j10) && iCoerceIn2 == TextRange.m3962getEndimpl(j10)) ? j10 : TextRange(iCoerceIn, iCoerceIn2);
    }

    @NotNull
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m3974substringFDrldGo(@NotNull CharSequence substring, long j10) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(TextRange.m3965getMinimpl(j10), TextRange.m3964getMaximpl(j10)).toString();
    }

    public static final long TextRange(int i10) {
        return TextRange(i10, i10);
    }
}
