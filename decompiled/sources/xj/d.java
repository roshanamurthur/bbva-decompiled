package xj;

import io.reactivex.functions.Action;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements Action {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0 f94676p0;

    public d(Function0 function0) {
        this.f94676p0 = function0;
    }

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.f94676p0.invoke(), "invoke(...)");
    }
}
