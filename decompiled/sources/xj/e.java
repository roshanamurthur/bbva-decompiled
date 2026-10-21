package xj;

import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1 f94677p0;

    public e(Function1 function1) {
        this.f94677p0 = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f94677p0.invoke(obj), "invoke(...)");
    }
}
