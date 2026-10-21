package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassDescriptor f80749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<Object> f80750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1<MemberScope, Collection<Object>> f80751c;

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(JavaClassDescriptor javaClassDescriptor, Set set, Function1 function1) {
        this.f80749a = javaClassDescriptor;
        this.f80750b = set;
        this.f80751c = function1;
    }

    /* JADX INFO: renamed from: result, reason: collision with other method in class */
    public void m5775result() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public boolean beforeChildren(@NotNull ClassDescriptor current) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == this.f80749a) {
            return true;
        }
        MemberScope staticScope = current.getStaticScope();
        Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
        if (!(staticScope instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.f80750b.addAll(this.f80751c.invoke(staticScope));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public /* bridge */ /* synthetic */ Object result() {
        m5775result();
        return Unit.INSTANCE;
    }
}
