package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData<Object> f22187p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MediatorLiveData<Object> mediatorLiveData) {
        super(1);
        this.f22187p0 = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f22187p0.setValue(obj);
        return Unit.INSTANCE;
    }
}
