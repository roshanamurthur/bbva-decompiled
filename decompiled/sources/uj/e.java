package uj;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1 f93873p0;

    public e(Function1 function1) {
        this.f93873p0 = function1;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkNotNullExpressionValue(this.f93873p0.invoke(obj), "invoke(...)");
    }
}
