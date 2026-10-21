package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import bk.d;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SegmentBreaker.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroidx/compose/ui/text/android/animation/SegmentType;", "segmentType", "", "", "breakOffsets", "", "dropSpaces", "Landroidx/compose/ui/text/android/animation/Segment;", "breakSegments", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
public final class SegmentBreaker {

    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* JADX INFO: compiled from: SegmentBreaker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static List a(CharSequence charSequence, BreakIterator breakIterator) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breakIterator.current()));
        }
        return listMutableListOf;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String();
        CharSequence text = layout.getText();
        int i10 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i10 == 2) {
            List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i11 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i11)));
                i11++;
            }
            return listMutableListOf;
        }
        if (i10 == 3) {
            List<Integer> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
            int lineCount = layout.getLineCount();
            while (i11 < lineCount) {
                listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i11)));
                i11++;
            }
            return listMutableListOf2;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(text, "text");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
            Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
            return a(text, characterInstance);
        }
        CharSequence text2 = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List listA = a(text2, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = listA.size();
        for (int i12 = 0; i12 < size; i12++) {
            treeSet.add(Integer.valueOf(((Number) listA.get(i12)).intValue()));
        }
        int paragraphCount2 = layoutHelper.getParagraphCount();
        for (int i13 = 0; i13 < paragraphCount2; i13++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i13);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i13);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i14 = 0; i14 < runCount; i14++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i14) + paragraphStart));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(treeSet);
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean dropSpaces) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            return d.listOf(new Segment(0, layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String().getText().length(), 0, 0, layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String().getWidth(), layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String().getHeight()));
        }
        boolean z11 = false;
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Layout layout = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String();
            int paragraphCount = layoutHelper.getParagraphCount();
            for (int i11 = 0; i11 < paragraphCount; i11++) {
                int paragraphStart = layoutHelper.getParagraphStart(i11);
                int paragraphEnd = layoutHelper.getParagraphEnd(i11);
                arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
            }
            return arrayList;
        }
        if (i10 == 3) {
            ArrayList arrayList2 = new ArrayList();
            Layout layout2 = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String();
            int lineCount = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String().getLineCount();
            for (int i12 = 0; i12 < lineCount; i12++) {
                arrayList2.add(new Segment(layout2.getLineStart(i12), layout2.getLineEnd(i12), dropSpaces ? (int) Math.ceil(layout2.getLineLeft(i12)) : 0, layout2.getLineTop(i12), dropSpaces ? (int) Math.ceil(layout2.getLineRight(i12)) : layout2.getWidth(), layout2.getLineBottom(i12)));
            }
            return arrayList2;
        }
        int i13 = -1;
        if (i10 != 4) {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList3 = new ArrayList();
            List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
            if (listBreakOffsets.size() == 0 || listBreakOffsets.size() == 1) {
                CollectionsKt__CollectionsKt.emptyList();
                return arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            Integer num = listBreakOffsets.get(0);
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
            int i14 = 0;
            while (i14 < lastIndex) {
                i14++;
                Integer num2 = listBreakOffsets.get(i14);
                int iIntValue = num2.intValue();
                int iIntValue2 = num.intValue();
                Layout layout3 = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String();
                if (!dropSpaces || iIntValue != iIntValue2 + 1 || !layoutHelper.isLineEndSpace(layout3.getText().charAt(iIntValue2))) {
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout3, iIntValue2, z11);
                    boolean z12 = layout3.getParagraphDirection(lineForOffset) == i13 ? z10 : z11;
                    boolean zIsRtlCharAt = layout3.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z12) {
                        z10 = z11;
                    }
                    int iCeil = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z10, z11));
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z12, true));
                    arrayList3.add(new Segment(iIntValue2, iIntValue, Math.min(iCeil, iCeil2), layout3.getLineTop(lineForOffset), Math.max(iCeil, iCeil2), layout3.getLineBottom(lineForOffset)));
                }
                arrayList4.add(Unit.INSTANCE);
                num = num2;
                z10 = true;
                z11 = false;
                i13 = -1;
            }
            return arrayList3;
        }
        Layout layout4 = layoutHelper.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String();
        int iCeil3 = (int) Math.ceil(layout4.getPaint().measureText(" "));
        List<Integer> listBreakOffsets2 = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets2.size() == 0 || listBreakOffsets2.size() == 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList5 = new ArrayList();
        boolean z13 = false;
        Integer num3 = listBreakOffsets2.get(0);
        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets2);
        int i15 = 0;
        while (i15 < lastIndex2) {
            int i16 = i15 + 1;
            Integer num4 = listBreakOffsets2.get(i16);
            int iIntValue3 = num4.intValue();
            int iIntValue4 = num3.intValue();
            int lineForOffset2 = LayoutCompatKt.getLineForOffset(layout4, iIntValue4, z13);
            boolean z14 = layout4.getParagraphDirection(lineForOffset2) == -1 ? true : z13;
            boolean zIsRtlCharAt2 = layout4.isRtlCharAt(iIntValue4);
            float horizontalPosition = layoutHelper.getHorizontalPosition(iIntValue4, zIsRtlCharAt2 == z14 ? true : z13, z13);
            int i17 = lastIndex2;
            int iCeil4 = (int) Math.ceil(horizontalPosition);
            int iCeil5 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue3, zIsRtlCharAt2 == z14, true));
            int iMin = Math.min(iCeil4, iCeil5);
            int iMax = Math.max(iCeil4, iCeil5);
            if (dropSpaces && iIntValue3 != 0 && layout4.getText().charAt(iIntValue3 - 1) == ' ' && layout4.getLineEnd(lineForOffset2) != iIntValue3) {
                if (zIsRtlCharAt2) {
                    iMin += iCeil3;
                } else {
                    iMax -= iCeil3;
                }
            }
            arrayList5.add(new Segment(iIntValue4, iIntValue3, iMin, layout4.getLineTop(lineForOffset2), iMax, layout4.getLineBottom(lineForOffset2)));
            lastIndex2 = i17;
            num3 = num4;
            i15 = i16;
            z13 = false;
        }
        return arrayList5;
    }
}
