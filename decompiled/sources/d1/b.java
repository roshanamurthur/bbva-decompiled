package d1;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0<CoroutineScope> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NestedScrollNode f68122p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NestedScrollNode nestedScrollNode) {
        super(0);
        this.f68122p0 = nestedScrollNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineScope invoke() {
        return this.f68122p0.a();
    }
}
