package uj;

import io.reactivex.rxjava3.functions.Action;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements Action {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0 f93872p0;

    public d(Function0 function0) {
        this.f93872p0 = function0;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.f93872p0.invoke(), "invoke(...)");
    }
}
