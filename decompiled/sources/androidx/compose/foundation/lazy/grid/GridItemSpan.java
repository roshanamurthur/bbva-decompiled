package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: LazyGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\b\u0088\u0001\u0014\u0092\u0001\u00020\u0013ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getCurrentLineSpan-impl", "getCurrentLineSpan$annotations", "()V", "currentLineSpan", "", "packedValue", "constructor-impl", "(J)J", "foundation_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class GridItemSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4697a;

    public /* synthetic */ GridItemSpan(long j10) {
        this.f4697a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m374boximpl(long j10) {
        return new GridItemSpan(j10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m376equalsimpl(long j10, Object obj) {
        return (obj instanceof GridItemSpan) && j10 == ((GridItemSpan) obj).getF4697a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m377equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m378getCurrentLineSpanimpl(long j10) {
        return (int) j10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m379hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m380toStringimpl(long j10) {
        return "GridItemSpan(packedValue=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m376equalsimpl(this.f4697a, obj);
    }

    public int hashCode() {
        return m379hashCodeimpl(this.f4697a);
    }

    public String toString() {
        return m380toStringimpl(this.f4697a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF4697a() {
        return this.f4697a;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getCurrentLineSpan$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m375constructorimpl(long j10) {
        return j10;
    }
}
