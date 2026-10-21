package uj;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.kotlin.FlowableKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements BiFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2 f93870p0;

    public b(FlowableKt.a aVar) {
        this.f93870p0 = aVar;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f93870p0.invoke(obj, obj2);
    }
}
