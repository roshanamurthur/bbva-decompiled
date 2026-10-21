package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "resolveTextDirectionHeuristics-9GRLPo0", "(Landroidx/compose/ui/text/style/TextDirection;Landroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    public static final boolean access$getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        EmojiSupportMatch emojiSupportMatchM3858boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m3858boximpl(paragraphStyle.getEmojiSupportMatch());
        return !(emojiSupportMatchM3858boximpl == null ? false : EmojiSupportMatch.m3860equalsimpl0(emojiSupportMatchM3858boximpl.getF17608a(), EmojiSupportMatch.INSTANCE.m3865getNone_3YsG6Y()));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    public static final int m4180resolveTextDirectionHeuristics9GRLPo0(@Nullable TextDirection textDirection, @Nullable LocaleList localeList) {
        Locale javaLocale;
        int f18268a = textDirection != null ? textDirection.getF18268a() : TextDirection.INSTANCE.m4309getContents_7Xco();
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (TextDirection.m4305equalsimpl0(f18268a, companion.m4310getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!TextDirection.m4305equalsimpl0(f18268a, companion.m4311getContentOrRtls_7Xco())) {
            if (TextDirection.m4305equalsimpl0(f18268a, companion.m4312getLtrs_7Xco())) {
                return 0;
            }
            if (TextDirection.m4305equalsimpl0(f18268a, companion.m4313getRtls_7Xco())) {
                return 1;
            }
            if (!TextDirection.m4305equalsimpl0(f18268a, companion.m4309getContents_7Xco())) {
                throw new IllegalStateException("Invalid TextDirection.".toString());
            }
            if (localeList != null) {
                PlatformLocale platformLocale = localeList.get(0).getPlatformLocale();
                Intrinsics.checkNotNull(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                javaLocale = ((AndroidLocale) platformLocale).getJavaLocale();
                if (javaLocale == null) {
                    javaLocale = Locale.getDefault();
                }
            } else {
                javaLocale = Locale.getDefault();
            }
            int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(javaLocale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                return 2;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m4181resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textDirection = null;
        }
        if ((i10 & 2) != 0) {
            localeList = null;
        }
        return m4180resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
