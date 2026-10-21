package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.m;

/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/snapshots/ReaderKind;", "reader", "", "recordReadIn-h_f27i8$runtime_release", "(I)V", "recordReadIn", "", "isReadIn-h_f27i8$runtime_release", "(I)Z", "isReadIn", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,56:1\n48#2:57\n46#2:58\n48#2:59\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n33#1:57\n35#1:58\n40#1:59\n*E\n"})
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AtomicInt f15348p0 = new AtomicInt(0);

    /* JADX INFO: renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m2182isReadInh_f27i8$runtime_release(int reader) {
        return (reader & ReaderKind.m2170constructorimpl(this.f15348p0.get())) != 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return m.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    /* JADX INFO: renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m2183recordReadInh_f27i8$runtime_release(int reader) {
        AtomicInt atomicInt;
        int iM2170constructorimpl;
        do {
            atomicInt = this.f15348p0;
            iM2170constructorimpl = ReaderKind.m2170constructorimpl(atomicInt.get());
            if ((iM2170constructorimpl & reader) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(iM2170constructorimpl, ReaderKind.m2170constructorimpl(iM2170constructorimpl | reader)));
    }
}
