package androidx.compose.ui.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¨\u0006\u000b"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", FirebaseAnalytics.Param.INDEX, "findParagraphByIndex", "", "y", "findParagraphByY", "lineIndex", "findParagraphByLineIndex", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,982:1\n852#1,16:983\n852#1,16:999\n852#1,16:1015\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n802#1:983,16\n822#1:999,16\n842#1:1015,16\n*E\n"})
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(@NotNull List<ParagraphInfo> paragraphInfoList, int i10) {
        byte b10;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i12);
            if (paragraphInfo.getStartIndex() > i10) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.getEndIndex() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByLineIndex(@NotNull List<ParagraphInfo> paragraphInfoList, int i10) {
        byte b10;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i12);
            if (paragraphInfo.getStartLineIndex() > i10) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.getEndLineIndex() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByY(@NotNull List<ParagraphInfo> paragraphInfoList, float f6) {
        byte b10;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i11);
            if (paragraphInfo.getTop() > f6) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.getBottom() <= f6 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }
}
