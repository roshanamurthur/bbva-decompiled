package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "", "paragraphIndex", "Ljava/text/Bidi;", "analyzeBidi", TypedValues.CycleType.S_WAVE_OFFSET, "", "upstream", "getParagraphForOffset", "getParagraphStart", "getParagraphEnd", "isRtlParagraph", "usePrimaryDirection", "", "getHorizontalPosition", "", "c", "isLineEndSpace", "Landroid/text/Layout;", "a", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", PluginUtils.IDENTIFIER_LAYOUT, "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getParagraphCount", "()I", "paragraphCount", "<init>", "(Landroid/text/Layout;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
public final class LayoutHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Layout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f17782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f17783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final boolean[] f17784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public char[] f17785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int paragraphCount;

    /* JADX INFO: compiled from: LayoutHelper.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17789c;

        public a(int i10, int i11, boolean z10) {
            this.f17787a = i10;
            this.f17788b = i11;
            this.f17789c = z10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17787a == aVar.f17787a && this.f17788b == aVar.f17788b && this.f17789c == aVar.f17789c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int i10 = ((this.f17787a * 31) + this.f17788b) * 31;
            boolean z10 = this.f17789c;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return i10 + r1;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BidiRun(start=");
            sb2.append(this.f17787a);
            sb2.append(", end=");
            sb2.append(this.f17788b);
            sb2.append(", isRtl=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f17789c, RootService.CLOSE_BRACKET);
        }
    }

    public LayoutHelper(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.layout.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.f17782b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f17783c = arrayList2;
        this.f17784d = new boolean[this.f17782b.size()];
        this.paragraphCount = this.f17782b.size();
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return layoutHelper.getParagraphForOffset(i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    @Nullable
    public final Bidi analyzeBidi(int paragraphIndex) {
        Bidi bidi;
        boolean[] zArr = this.f17784d;
        boolean z10 = zArr[paragraphIndex];
        ArrayList arrayList = this.f17783c;
        if (z10) {
            return (Bidi) arrayList.get(paragraphIndex);
        }
        ArrayList arrayList2 = this.f17782b;
        int iIntValue = paragraphIndex == 0 ? 0 : ((Number) arrayList2.get(paragraphIndex - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(paragraphIndex)).intValue();
        int i10 = iIntValue2 - iIntValue;
        char[] cArr = this.f17785e;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i10)) {
            bidi = new Bidi(cArr2, 0, null, 0, i10, isRtlParagraph(paragraphIndex) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(paragraphIndex, bidi);
        zArr[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.f17785e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f17785e = cArr2;
        return bidi;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection, boolean upstream) {
        int i10 = offset;
        Layout layout = this.layout;
        if (!upstream) {
            return usePrimaryDirection ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, i10, upstream);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (i10 != lineStart && i10 != lineEnd) {
            return usePrimaryDirection ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        if (i10 == 0 || i10 == layout.getText().length()) {
            return usePrimaryDirection ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        int paragraphForOffset = getParagraphForOffset(i10, upstream);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        while (lineEnd > 0 && isLineEndSpace(layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i11 = lineStart - paragraphStart;
        int i12 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i11, i12) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            return (i10 != lineStart ? zIsRtlParagraph : !zIsRtlParagraph) ? layout.getLineRight(lineForOffset) : layout.getLineLeft(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (i10 == lineStart) {
            for (int i16 = 0; i16 < runCount; i16++) {
                if (aVarArr[i16].f17787a == i10) {
                    i15 = i16;
                    break;
                }
            }
            a aVar = aVarArr[i15];
            if (usePrimaryDirection || zIsRtlParagraph == aVar.f17789c) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (i15 == 0 && zIsRtlParagraph) {
                return layout.getLineLeft(lineForOffset);
            }
            if (i15 != ArraysKt___ArraysKt.getLastIndex(aVarArr) || zIsRtlParagraph) {
                return zIsRtlParagraph ? layout.getPrimaryHorizontal(aVarArr[i15 - 1].f17787a) : layout.getPrimaryHorizontal(aVarArr[i15 + 1].f17787a);
            }
            return layout.getLineRight(lineForOffset);
        }
        if (i10 > lineEnd) {
            while (i10 > 0 && isLineEndSpace(layout.getText().charAt(i10 - 1))) {
                i10--;
            }
        }
        for (int i17 = 0; i17 < runCount; i17++) {
            if (aVarArr[i17].f17788b == i10) {
                i15 = i17;
                break;
            }
        }
        a aVar2 = aVarArr[i15];
        if (!usePrimaryDirection && zIsRtlParagraph != aVar2.f17789c) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        if (i15 == 0 && zIsRtlParagraph) {
            return layout.getLineLeft(lineForOffset);
        }
        if (i15 != ArraysKt___ArraysKt.getLastIndex(aVarArr) || zIsRtlParagraph) {
            return zIsRtlParagraph ? layout.getPrimaryHorizontal(aVarArr[i15 - 1].f17788b) : layout.getPrimaryHorizontal(aVarArr[i15 + 1].f17788b);
        }
        return layout.getLineRight(lineForOffset);
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int paragraphIndex) {
        return ((Number) this.f17782b.get(paragraphIndex)).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int offset, boolean upstream) {
        ArrayList arrayList = this.f17782b;
        int iBinarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(arrayList, Integer.valueOf(offset), 0, 0, 6, (Object) null);
        int i10 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (upstream && i10 > 0) {
            int i11 = i10 - 1;
            if (offset == ((Number) arrayList.get(i11)).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public final int getParagraphStart(@IntRange(from = 0) int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return ((Number) this.f17782b.get(paragraphIndex - 1)).intValue();
    }

    public final boolean isLineEndSpace(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == 5760 || (8192 <= c10 && c10 < 8203 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int paragraphIndex) {
        int paragraphStart = getParagraphStart(paragraphIndex);
        Layout layout = this.layout;
        return layout.getParagraphDirection(layout.getLineForOffset(paragraphStart)) == -1;
    }
}
