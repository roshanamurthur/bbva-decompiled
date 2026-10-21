package r0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<MutableState<Object>, MutableState<Object>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Saver<Object, Object> f92902p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Saver<Object, Object> saver) {
        super(1);
        this.f92902p0 = saver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableState<Object> invoke(MutableState<Object> mutableState) {
        Object objRestore;
        MutableState<Object> mutableState2 = mutableState;
        if (!(mutableState2 instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (mutableState2.getValue() != null) {
            Object value = mutableState2.getValue();
            Intrinsics.checkNotNull(value);
            objRestore = this.f92902p0.restore(value);
        } else {
            objRestore = null;
        }
        SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState2).getPolicy();
        Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
        MutableState<Object> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
        Intrinsics.checkNotNull(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
        return mutableStateMutableStateOf;
    }
}
