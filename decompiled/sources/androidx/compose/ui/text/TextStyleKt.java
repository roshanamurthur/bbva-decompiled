package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveDefaults", "layoutDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "resolveTextDirection", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class TextStyleKt {

    /* JADX INFO: compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PlatformTextStyle access$createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle start, @NotNull TextStyle stop, float f6) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextStyle(SpanStyleKt.lerp(start.toSpanStyle(), stop.toSpanStyle(), f6), ParagraphStyleKt.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), f6));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle style, @NotNull LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(style.getSpanStyle()), ParagraphStyleKt.resolveParagraphStyleDefaults(style.getParagraphStyle(), direction), style.getPlatformStyle());
    }

    /* JADX INFO: renamed from: resolveTextDirection-Yj3eThk, reason: not valid java name */
    public static final int m3999resolveTextDirectionYj3eThk(@NotNull LayoutDirection layoutDirection, @Nullable TextDirection textDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        TextDirection.Companion companion = TextDirection.INSTANCE;
        int iM4309getContents_7Xco = companion.m4309getContents_7Xco();
        if (textDirection != null && TextDirection.m4305equalsimpl0(textDirection.getF18268a(), iM4309getContents_7Xco)) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i10 == 1) {
                return companion.m4310getContentOrLtrs_7Xco();
            }
            if (i10 == 2) {
                return companion.m4311getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (textDirection != null) {
            return textDirection.getF18268a();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i11 == 1) {
            return companion.m4312getLtrs_7Xco();
        }
        if (i11 == 2) {
            return companion.m4313getRtls_7Xco();
        }
        throw new NoWhenBranchMatchedException();
    }
}
