package androidx.compose.animation.core;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b\u0088\u0001\u0016\u0092\u0001\u00020\u0017ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getOffsetMillis-impl", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "getOffsetType-Eo1U57Q", "offsetType", "constructor-impl", "(II)J", "value", "", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class StartOffset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3054a;

    public /* synthetic */ StartOffset(long j10) {
        this.f3054a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m95boximpl(long j10) {
        return new StartOffset(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m96constructorimpl(int i10, int i11) {
        return i10 * i11;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m97constructorimpl$default(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 2) != 0) {
            i11 = StartOffsetType.INSTANCE.m111getDelayEo1U57Q();
        }
        return m96constructorimpl(i10, i11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m98equalsimpl(long j10, Object obj) {
        return (obj instanceof StartOffset) && j10 == ((StartOffset) obj).getF3054a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m99equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m100getOffsetMillisimpl(long j10) {
        return Math.abs((int) j10);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m101getOffsetTypeEo1U57Q(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return StartOffsetType.INSTANCE.m112getFastForwardEo1U57Q();
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.INSTANCE.m111getDelayEo1U57Q();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m102hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m103toStringimpl(long j10) {
        return "StartOffset(value=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m98equalsimpl(this.f3054a, obj);
    }

    public int hashCode() {
        return m102hashCodeimpl(this.f3054a);
    }

    public String toString() {
        return m103toStringimpl(this.f3054a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF3054a() {
        return this.f3054a;
    }
}
