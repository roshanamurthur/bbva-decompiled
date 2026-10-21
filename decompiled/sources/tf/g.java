package tf;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.Intrinsics;
import uf.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93568p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f93569q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f93570r0;

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f93568p0 = i10;
        this.f93569q0 = obj;
        this.f93570r0 = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Deferred.DeferredHandler<T> deferredHandler;
        switch (this.f93568p0) {
            case 0:
                m mVar = (m) this.f93569q0;
                Provider<T> provider = (Provider) this.f93570r0;
                if (mVar.f93586b != m.f93584d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (mVar) {
                    deferredHandler = mVar.f93585a;
                    mVar.f93585a = null;
                    mVar.f93586b = provider;
                    break;
                }
                deferredHandler.handle(provider);
                return;
            case 1:
                r rVar = (r) this.f93569q0;
                Runnable runnable = (Runnable) this.f93570r0;
                Semaphore semaphore = rVar.f93833q0;
                try {
                    runnable.run();
                    return;
                } finally {
                    semaphore.release();
                    rVar.a();
                }
            default:
                String tag = (String) this.f93569q0;
                String msg = (String) this.f93570r0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(msg, "$msg");
                return;
        }
    }
}
