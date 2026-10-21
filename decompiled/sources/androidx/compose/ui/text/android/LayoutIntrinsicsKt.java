package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o1.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "minIntrinsicWidth", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
public final class LayoutIntrinsicsKt {
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final boolean access$shouldIncreaseMaxIntrinsic(float f6, CharSequence charSequence, TextPaint textPaint) {
        if (f6 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanPx.class) && !SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                    if (textPaint.getLetterSpacing() == 0.0f) {
                    }
                }
            } else if (textPaint.getLetterSpacing() == 0.0f) {
            }
            return true;
        }
        return false;
    }

    public static final float minIntrinsicWidth(@NotNull CharSequence text, @NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(text, 0, text.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new d());
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (Pair pair2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(text, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), paint));
        }
        return fMax;
    }
}
