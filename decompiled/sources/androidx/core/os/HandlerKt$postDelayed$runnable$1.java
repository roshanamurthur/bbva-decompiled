package androidx.core.os;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f19999p0;

    public HandlerKt$postDelayed$runnable$1(Function0<Unit> function0) {
        this.f19999p0 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19999p0.invoke();
    }
}
