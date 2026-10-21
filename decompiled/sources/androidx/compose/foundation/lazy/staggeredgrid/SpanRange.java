package androidx.compose.foundation.lazy.staggeredgrid;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0081@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0012\u0010\u0018\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0012\u0010\u001a\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\b\u0088\u0001\u0014\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "a", "J", "getPackedValue", "()J", "packedValue", "getStart-impl", EventDataKeys.Lifecycle.LIFECYCLE_START, "getEnd-impl", "end", "getSize-impl", "size", "lane", "span", "constructor-impl", "(II)J", "foundation_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n907#1:1162\n906#1:1164\n48#2:1159\n55#2:1160\n62#2:1161\n62#2:1163\n55#2:1165\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n908#1:1162\n908#1:1164\n904#1:1159\n906#1:1160\n907#1:1161\n908#1:1163\n908#1:1165\n*E\n"})
public final class SpanRange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    public /* synthetic */ SpanRange(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m432boximpl(long j10) {
        return new SpanRange(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m433constructorimpl(int i10, int i11) {
        return (((long) (i11 + i10)) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m434equalsimpl(long j10, Object obj) {
        return (obj instanceof SpanRange) && j10 == ((SpanRange) obj).m441unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m435equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m436getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m437getSizeimpl(long j10) {
        return ((int) (4294967295L & j10)) - ((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m438getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m439hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m440toStringimpl(long j10) {
        return "SpanRange(packedValue=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m434equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m439hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m440toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m441unboximpl() {
        return this.packedValue;
    }
}
