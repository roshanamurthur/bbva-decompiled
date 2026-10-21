package xj;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.FlowableKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements BiFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2 f94674p0;

    public b(FlowableKt.a aVar) {
        this.f94674p0 = aVar;
    }

    @Override // io.reactivex.functions.BiFunction
    @NonNull
    public final /* synthetic */ Object apply(@NonNull Object obj, @NonNull Object obj2) {
        return this.f94674p0.invoke(obj, obj2);
    }
}
