package r0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function2<SaverScope, MutableState<Object>, MutableState<Object>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Saver<Object, Object> f92901p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Saver<Object, Object> saver) {
        super(2);
        this.f92901p0 = saver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MutableState<Object> invoke(SaverScope saverScope, MutableState<Object> mutableState) {
        SaverScope saverScope2 = saverScope;
        MutableState<Object> mutableState2 = mutableState;
        if (!(mutableState2 instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
        }
        Object objSave = this.f92901p0.save(saverScope2, mutableState2.getValue());
        if (objSave == null) {
            return null;
        }
        SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState2).getPolicy();
        Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }
}
