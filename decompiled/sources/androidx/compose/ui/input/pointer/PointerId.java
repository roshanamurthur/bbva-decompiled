package androidx.compose.ui.input.pointer;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "a", "J", "getValue", "()J", "value", "constructor-impl", "(J)J", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class PointerId {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long value;

    public /* synthetic */ PointerId(long j10) {
        this.value = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m3458boximpl(long j10) {
        return new PointerId(j10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3460equalsimpl(long j10, Object obj) {
        return (obj instanceof PointerId) && j10 == ((PointerId) obj).m3464unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3461equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3462hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3463toStringimpl(long j10) {
        return "PointerId(value=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m3460equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3462hashCodeimpl(this.value);
    }

    public String toString() {
        return m3463toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3464unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3459constructorimpl(long j10) {
        return j10;
    }
}
