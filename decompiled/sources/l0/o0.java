package l0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Lambda implements Function0<MutableState<Boolean>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o0 f82749p0 = new o0(0);

    @Override // kotlin.jvm.functions.Function0
    public final MutableState<Boolean> invoke() {
        return SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }
}
