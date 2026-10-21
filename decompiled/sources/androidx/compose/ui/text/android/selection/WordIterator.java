package androidx.compose.ui.text.android.selection;

import androidx.activity.a;
import androidx.collection.h;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WordIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "nextBoundary", "prevBoundary", "getPrevWordBeginningOnTwoWordsBoundary", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "", "isAfterPunctuation", "isOnPunctuation", "", "charSequence", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class WordIterator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f17829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BreakIterator f17832d;

    /* JADX INFO: compiled from: WordIterator.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int cp) {
            int type = Character.getType(cp);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(@NotNull CharSequence charSequence, int i10, int i11, @Nullable Locale locale) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f17829a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f17832d = wordInstance;
        this.f17830b = Math.max(0, i10 - 50);
        this.f17831c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i10, i11));
    }

    public final void a(int i10) {
        int i11 = this.f17830b;
        int i12 = this.f17831c;
        if (i10 > i12 || i11 > i10) {
            throw new IllegalArgumentException(a.d(h.e("Invalid offset: ", i10, ". Valid range is [", i11, " , "), i12, AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    public final boolean b(int i10) {
        return i10 <= this.f17831c && this.f17830b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f17829a, i10));
    }

    public final boolean c(int i10) {
        return i10 < this.f17831c && this.f17830b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f17829a, i10));
    }

    public final int getNextWordEndOnTwoWordBoundary(int offset) {
        a(offset);
        boolean zB = b(offset);
        BreakIterator breakIterator = this.f17832d;
        if (zB) {
            return (!breakIterator.isBoundary(offset) || c(offset)) ? breakIterator.following(offset) : offset;
        }
        if (c(offset)) {
            return breakIterator.following(offset);
        }
        return -1;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int offset) {
        a(offset);
        boolean zC = c(offset);
        BreakIterator breakIterator = this.f17832d;
        if (zC) {
            return (!breakIterator.isBoundary(offset) || b(offset)) ? breakIterator.preceding(offset) : offset;
        }
        if (b(offset)) {
            return breakIterator.preceding(offset);
        }
        return -1;
    }

    public final int getPunctuationBeginning(int offset) {
        a(offset);
        while (offset != -1 && (!isOnPunctuation(offset) || isAfterPunctuation(offset))) {
            offset = prevBoundary(offset);
        }
        return offset;
    }

    public final int getPunctuationEnd(int offset) {
        a(offset);
        while (offset != -1 && (isOnPunctuation(offset) || !isAfterPunctuation(offset))) {
            offset = nextBoundary(offset);
        }
        return offset;
    }

    public final boolean isAfterPunctuation(int offset) {
        int i10 = this.f17830b + 1;
        if (offset > this.f17831c || i10 > offset) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text_release(Character.codePointBefore(this.f17829a, offset));
    }

    public final boolean isOnPunctuation(int offset) {
        if (offset >= this.f17831c || this.f17830b > offset) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text_release(Character.codePointAt(this.f17829a, offset));
    }

    public final int nextBoundary(int offset) {
        a(offset);
        return this.f17832d.following(offset);
    }

    public final int prevBoundary(int offset) {
        a(offset);
        return this.f17832d.preceding(offset);
    }
}
