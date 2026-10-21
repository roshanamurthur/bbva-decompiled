package i1;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function1<Modifier.Element, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableVector<Modifier.Element> f69496p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MutableVector<Modifier.Element> mutableVector) {
        super(1);
        this.f69496p0 = mutableVector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Modifier.Element element) {
        Modifier.Element it = element;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f69496p0.add(it);
        return Boolean.TRUE;
    }
}
