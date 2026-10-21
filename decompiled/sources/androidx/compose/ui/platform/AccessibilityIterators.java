package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessibilityIterators {

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "text", "", "initialize", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "getRange", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final int[] f16969a = new int[2];
        protected String text;

        @Nullable
        public final int[] getRange(int start, int end) {
            if (start < 0 || end < 0 || start == end) {
                return null;
            }
            int[] iArr = this.f16969a;
            iArr[0] = start;
            iArr[1] = end;
            return iArr;
        }

        @NotNull
        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            setText(text);
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0017\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "", "initialize", "", "current", "", "following", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static CharacterTextSegmentIterator f16970c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BreakIterator f16971b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CharacterTextSegmentIterator getInstance(@NotNull Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (CharacterTextSegmentIterator.f16970c == null) {
                    CharacterTextSegmentIterator.f16970c = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.f16970c;
                Intrinsics.checkNotNull(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }
        }

        public CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
            Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
            this.f16971b = characterInstance;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int current) {
            int length = getText().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            do {
                BreakIterator breakIterator = this.f16971b;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.f16971b;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(current);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return getRange(current, iFollowing);
                }
                BreakIterator breakIterator3 = this.f16971b;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.following(current);
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            super.initialize(text);
            BreakIterator breakIterator = this.f16971b;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            do {
                BreakIterator breakIterator = this.f16971b;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.f16971b;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(current);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return getRange(iPreceding, current);
                }
                BreakIterator breakIterator3 = this.f16971b;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.preceding(current);
            } while (current != -1);
            return null;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "initialize", "", "current", "", "following", "preceding", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static LineTextSegmentIterator f16972c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextLayoutResult f16975b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final ResolvedTextDirection f16973d = ResolvedTextDirection.Rtl;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final ResolvedTextDirection f16974e = ResolvedTextDirection.Ltr;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.f16972c == null) {
                    LineTextSegmentIterator.f16972c = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.f16972c;
                Intrinsics.checkNotNull(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }
        }

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f16975b;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i10);
            TextLayoutResult textLayoutResult3 = this.f16975b;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.f16975b;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i10);
            }
            TextLayoutResult textLayoutResult5 = this.f16975b;
            if (textLayoutResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int current) {
            int lineForOffset;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            ResolvedTextDirection resolvedTextDirection = f16973d;
            if (current < 0) {
                TextLayoutResult textLayoutResult = this.f16975b;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.f16975b;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset2 = textLayoutResult2.getLineForOffset(current);
                lineForOffset = a(lineForOffset2, resolvedTextDirection) == current ? lineForOffset2 : lineForOffset2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.f16975b;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (lineForOffset >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(a(lineForOffset, resolvedTextDirection), a(lineForOffset, f16974e) + 1);
        }

        public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
            setText(text);
            this.f16975b = layoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int current) {
            int lineForOffset;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            int length = getText().length();
            ResolvedTextDirection resolvedTextDirection = f16974e;
            if (current > length) {
                TextLayoutResult textLayoutResult = this.f16975b;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.f16975b;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset2 = textLayoutResult2.getLineForOffset(current);
                lineForOffset = a(lineForOffset2, resolvedTextDirection) + 1 == current ? lineForOffset2 : lineForOffset2 - 1;
            }
            if (lineForOffset < 0) {
                return null;
            }
            return getRange(a(lineForOffset, f16973d), a(lineForOffset, resolvedTextDirection) + 1);
        }

        public LineTextSegmentIterator() {
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "initialize", "", "current", "", "following", "preceding", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public static PageTextSegmentIterator f16976d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextLayoutResult f16979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SemanticsNode f16980c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final ResolvedTextDirection f16977e = ResolvedTextDirection.Rtl;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final ResolvedTextDirection f16978f = ResolvedTextDirection.Ltr;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.f16976d == null) {
                    PageTextSegmentIterator.f16976d = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.f16976d;
                Intrinsics.checkNotNull(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f16979b;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i10);
            TextLayoutResult textLayoutResult3 = this.f16979b;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.f16979b;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i10);
            }
            TextLayoutResult textLayoutResult5 = this.f16979b;
            if (textLayoutResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int current) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f16980c;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int iRoundToInt = mk.c.roundToInt(semanticsNode.getBoundsInRoot().getHeight());
                int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(0, current);
                TextLayoutResult textLayoutResult2 = this.f16979b;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iCoerceAtLeast);
                TextLayoutResult textLayoutResult3 = this.f16979b;
                if (textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + iRoundToInt;
                TextLayoutResult textLayoutResult4 = this.f16979b;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.f16979b;
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.f16979b;
                    if (textLayoutResult6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.f16979b;
                    if (textLayoutResult7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(iCoerceAtLeast, a(lineCount - 1, f16978f) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult, @NotNull SemanticsNode node) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
            Intrinsics.checkNotNullParameter(node, "node");
            setText(text);
            this.f16979b = layoutResult;
            this.f16980c = node;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int current) {
            int lineForVerticalPosition;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f16980c;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int iRoundToInt = mk.c.roundToInt(semanticsNode.getBoundsInRoot().getHeight());
                int iCoerceAtMost = kotlin.ranges.c.coerceAtMost(getText().length(), current);
                TextLayoutResult textLayoutResult2 = this.f16979b;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iCoerceAtMost);
                TextLayoutResult textLayoutResult3 = this.f16979b;
                if (textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - iRoundToInt;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.f16979b;
                    if (textLayoutResult4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    lineForVerticalPosition = 0;
                }
                if (iCoerceAtMost == getText().length() && lineForVerticalPosition < lineForOffset) {
                    lineForVerticalPosition++;
                }
                return getRange(a(lineForVerticalPosition, f16977e), iCoerceAtMost);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public PageTextSegmentIterator() {
            new Rect();
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "current", "", "following", "preceding", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static ParagraphTextSegmentIterator f16981b;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.f16981b == null) {
                    ParagraphTextSegmentIterator.f16981b = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.f16981b;
                Intrinsics.checkNotNull(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            return i10 > 0 && getText().charAt(i10 + (-1)) != '\n' && (i10 == getText().length() || getText().charAt(i10) == '\n');
        }

        public final boolean b(int i10) {
            return getText().charAt(i10) != '\n' && (i10 == 0 || getText().charAt(i10 - 1) == '\n');
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int current) {
            int length = getText().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (current < length && getText().charAt(current) == '\n' && !b(current)) {
                current++;
            }
            if (current >= length) {
                return null;
            }
            int i10 = current + 1;
            while (i10 < length && !a(i10)) {
                i10++;
            }
            return getRange(current, i10);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && getText().charAt(current - 1) == '\n' && !a(current)) {
                current--;
            }
            if (current <= 0) {
                return null;
            }
            int i10 = current - 1;
            while (i10 > 0 && !b(i10)) {
                i10--;
            }
            return getRange(i10, current);
        }

        public ParagraphTextSegmentIterator() {
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TextSegmentIterator {
        @Nullable
        int[] following(int current);

        @Nullable
        int[] preceding(int current);
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "", "initialize", "", "current", "", "following", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static WordTextSegmentIterator f16982c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BreakIterator f16983b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final WordTextSegmentIterator getInstance(@NotNull Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (WordTextSegmentIterator.f16982c == null) {
                    WordTextSegmentIterator.f16982c = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.f16982c;
                Intrinsics.checkNotNull(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }
        }

        public WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
            this.f16983b = wordInstance;
        }

        public final boolean a(int i10) {
            return i10 > 0 && b(i10 + (-1)) && (i10 == getText().length() || !b(i10));
        }

        public final boolean b(int i10) {
            if (i10 < 0 || i10 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i10));
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int current) {
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (!b(current) && (!b(current) || (current != 0 && b(current - 1)))) {
                BreakIterator breakIterator = this.f16983b;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                current = breakIterator.following(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f16983b;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(current);
            if (iFollowing == -1 || !a(iFollowing)) {
                return null;
            }
            return getRange(current, iFollowing);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            super.initialize(text);
            BreakIterator breakIterator = this.f16983b;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && !b(current - 1) && !a(current)) {
                BreakIterator breakIterator = this.f16983b;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                current = breakIterator.preceding(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f16983b;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(current);
            if (iPreceding == -1 || !b(iPreceding) || (iPreceding != 0 && b(iPreceding - 1))) {
                return null;
            }
            return getRange(iPreceding, current);
        }
    }
}
