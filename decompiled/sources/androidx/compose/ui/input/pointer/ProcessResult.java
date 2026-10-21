package androidx.compose.ui.input.pointer;

import androidx.collection.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u0014\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "getDispatchedToAPointerInputModifier-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getAnyMovementConsumed-impl", "anyMovementConsumed", "value", "constructor-impl", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class ProcessResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16461a;

    public /* synthetic */ ProcessResult(int i10) {
        this.f16461a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m3543boximpl(int i10) {
        return new ProcessResult(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3545equalsimpl(int i10, Object obj) {
        return (obj instanceof ProcessResult) && i10 == ((ProcessResult) obj).getF16461a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3546equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m3547getAnyMovementConsumedimpl(int i10) {
        return (i10 & 2) != 0;
    }

    /* JADX INFO: renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m3548getDispatchedToAPointerInputModifierimpl(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3550toStringimpl(int i10) {
        return g.a("ProcessResult(value=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m3545equalsimpl(this.f16461a, obj);
    }

    public int hashCode() {
        return m3549hashCodeimpl(this.f16461a);
    }

    public String toString() {
        return m3550toStringimpl(this.f16461a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16461a() {
        return this.f16461a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3544constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3549hashCodeimpl(int i10) {
        return i10;
    }
}
