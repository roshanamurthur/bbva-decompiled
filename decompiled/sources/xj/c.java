package xj;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.FlowableKt;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function3 f94675a;

    public c(FlowableKt.b bVar) {
        this.f94675a = bVar;
    }

    @Override // io.reactivex.functions.Function3
    @NonNull
    public final /* synthetic */ Object apply(@NonNull Object obj, @NonNull Object obj2, @NonNull Object obj3) {
        return this.f94675a.invoke(obj, obj2, obj3);
    }
}
