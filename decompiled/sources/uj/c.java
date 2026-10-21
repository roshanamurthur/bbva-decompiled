package uj;

import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.kotlin.FlowableKt;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function3 f93871a;

    public c(FlowableKt.b bVar) {
        this.f93871a = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
        return this.f93871a.invoke(obj, obj2, obj3);
    }
}
