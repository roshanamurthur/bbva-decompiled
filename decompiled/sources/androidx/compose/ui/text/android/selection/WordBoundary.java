package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WordBoundary.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "getWordEnd", "Ljava/util/Locale;", "locale", "", "text", "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class WordBoundary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WordIterator f17828a;

    public WordBoundary(@NotNull Locale locale, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f17828a = new WordIterator(text, 0, text.length(), locale);
    }

    public final int getWordEnd(int offset) {
        WordIterator wordIterator = this.f17828a;
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(offset)) ? wordIterator.getPunctuationEnd(offset) : wordIterator.getNextWordEndOnTwoWordBoundary(offset);
        return punctuationEnd == -1 ? offset : punctuationEnd;
    }

    public final int getWordStart(int offset) {
        WordIterator wordIterator = this.f17828a;
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(offset)) ? wordIterator.getPunctuationBeginning(offset) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(offset);
        return punctuationBeginning == -1 ? offset : punctuationBeginning;
    }
}
