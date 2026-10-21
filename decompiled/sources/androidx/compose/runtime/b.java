package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n1#3:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n*L\n266#1:1647\n*E\n"})
public final class b extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Recomposer f14819p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Throwable f14820q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Recomposer recomposer, Throwable th2) {
        super(1);
        this.f14819p0 = recomposer;
        this.f14820q0 = th2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Throwable th3 = th2;
        Object obj = this.f14819p0.f14657c;
        Recomposer recomposer = this.f14819p0;
        Throwable th4 = this.f14820q0;
        synchronized (obj) {
            if (th4 == null) {
                th4 = null;
            } else if (th3 != null) {
                try {
                    if (!(!(th3 instanceof CancellationException))) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        ak.b.addSuppressed(th4, th3);
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            recomposer.f14659e = th4;
            recomposer.f14674u.setValue(Recomposer.State.ShutDown);
        }
        return Unit.INSTANCE;
    }
}
