package xj;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: completable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0 f94673p0;

    public a(Function0 function0) {
        this.f94673p0 = function0;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f94673p0.invoke();
    }
}
