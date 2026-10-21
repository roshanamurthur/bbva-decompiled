package androidx.compose.ui.text.input;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u001a\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010>\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bD\u0010EB\u001c\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0014\u0012\u0006\u0010>\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bD\u0010FJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u001eJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u000f\u0010%\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010$R*\u0010,\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b'\u0010+R*\u00100\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010+R$\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*R$\u00107\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u001f\u0010;\u001a\u0004\u0018\u0001088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001d\u0010>\u001a\u0002088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b@\u0010*\"\u0004\bA\u0010+R\u0014\u0010C\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", FirebaseAnalytics.Param.INDEX, "", "get$ui_text_release", "(I)C", "get", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/text/AnnotatedString;", "text", "", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "value", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSelectionStart$ui_text_release", "()I", "(I)V", "selectionStart", "c", "getSelectionEnd$ui_text_release", "a", "selectionEnd", "<set-?>", "d", "getCompositionStart$ui_text_release", "compositionStart", "e", "getCompositionEnd$ui_text_release", "compositionEnd", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "selection", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", "length", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
public final class EditingBuffer {
    public static final int NOWHERE = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PartialGapBuffer f18057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int selectionStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int selectionEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int compositionStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int compositionEnd;
    public static final int $stable = 8;

    public EditingBuffer(AnnotatedString text, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f18057a = new PartialGapBuffer(text.getText());
        this.selectionStart = TextRange.m3965getMinimpl(j10);
        this.selectionEnd = TextRange.m3964getMaximpl(j10);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM3965getMinimpl = TextRange.m3965getMinimpl(j10);
        int iM3964getMaximpl = TextRange.m3964getMaximpl(j10);
        if (iM3965getMinimpl < 0 || iM3965getMinimpl > text.length()) {
            StringBuilder sbC = o1.c("start (", iM3965getMinimpl, ") offset is outside of text region ");
            sbC.append(text.length());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (iM3964getMaximpl < 0 || iM3964getMaximpl > text.length()) {
            StringBuilder sbC2 = o1.c("end (", iM3964getMaximpl, ") offset is outside of text region ");
            sbC2.append(text.length());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (iM3965getMinimpl > iM3964getMaximpl) {
            throw new IllegalArgumentException(n1.e("Do not set reversed range: ", iM3965getMinimpl, " > ", iM3964getMaximpl));
        }
    }

    public final void a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("Cannot set selectionEnd to a negative value: ", i10).toString());
        }
        this.selectionEnd = i10;
    }

    public final void b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("Cannot set selectionStart to a negative value: ", i10).toString());
        }
        this.selectionStart = i10;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int start, int end) {
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.f18057a.replace(start, end, "");
        long jM4100updateRangeAfterDeletepWDy79M = EditingBufferKt.m4100updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        b(TextRange.m3965getMinimpl(jM4100updateRangeAfterDeletepWDy79M));
        a(TextRange.m3964getMaximpl(jM4100updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM4100updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m4100updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m3961getCollapsedimpl(jM4100updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m3965getMinimpl(jM4100updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m3964getMaximpl(jM4100updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int index) {
        return this.f18057a.get(index);
    }

    @Nullable
    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m4098getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m3955boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i10 = this.selectionStart;
        int i11 = this.selectionEnd;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.f18057a.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m4099getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int start, int end, @NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replace$ui_text_release(start, end, text.getText());
    }

    public final void setComposition$ui_text_release(int start, int end) {
        PartialGapBuffer partialGapBuffer = this.f18057a;
        if (start < 0 || start > partialGapBuffer.getLength()) {
            StringBuilder sbC = o1.c("start (", start, ") offset is outside of text region ");
            sbC.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (end < 0 || end > partialGapBuffer.getLength()) {
            StringBuilder sbC2 = o1.c("end (", end, ") offset is outside of text region ");
            sbC2.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(n1.e("Do not set reversed or empty range: ", start, " > ", end));
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void setCursor$ui_text_release(int i10) {
        setSelection$ui_text_release(i10, i10);
    }

    public final void setSelection$ui_text_release(int start, int end) {
        PartialGapBuffer partialGapBuffer = this.f18057a;
        if (start < 0 || start > partialGapBuffer.getLength()) {
            StringBuilder sbC = o1.c("start (", start, ") offset is outside of text region ");
            sbC.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (end < 0 || end > partialGapBuffer.getLength()) {
            StringBuilder sbC2 = o1.c("end (", end, ") offset is outside of text region ");
            sbC2.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(n1.e("Do not set reversed range: ", start, " > ", end));
        }
        b(start);
        a(end);
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return this.f18057a.toString();
    }

    public final void replace$ui_text_release(int start, int end, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        PartialGapBuffer partialGapBuffer = this.f18057a;
        if (start < 0 || start > partialGapBuffer.getLength()) {
            StringBuilder sbC = o1.c("start (", start, ") offset is outside of text region ");
            sbC.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (end < 0 || end > partialGapBuffer.getLength()) {
            StringBuilder sbC2 = o1.c("end (", end, ") offset is outside of text region ");
            sbC2.append(partialGapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(n1.e("Do not set reversed range: ", start, " > ", end));
        }
        partialGapBuffer.replace(start, end, text);
        b(text.length() + start);
        a(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditingBuffer(String text, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(new AnnotatedString(text, null, null, 6, null), j10, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
