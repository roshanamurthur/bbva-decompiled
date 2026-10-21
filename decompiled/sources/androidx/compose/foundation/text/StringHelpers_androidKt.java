package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringHelpers.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"", "", FirebaseAnalytics.Param.INDEX, "findPrecedingBreak", "findFollowingBreak", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class StringHelpers_androidKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final int findFollowingBreak(@NotNull String str, int i10) {
        EmojiCompat emojiCompat;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer num = null;
        if (EmojiCompat.isConfigured()) {
            emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() != 1) {
                emojiCompat = null;
            }
        } else {
            emojiCompat = null;
        }
        if (emojiCompat != null) {
            Integer numValueOf = Integer.valueOf(emojiCompat.getEmojiEnd(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final int findPrecedingBreak(@NotNull String str, int i10) {
        EmojiCompat emojiCompat;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer num = null;
        if (EmojiCompat.isConfigured()) {
            emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() != 1) {
                emojiCompat = null;
            }
        } else {
            emojiCompat = null;
        }
        if (emojiCompat != null) {
            Integer numValueOf = Integer.valueOf(emojiCompat.getEmojiStart(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }
}
