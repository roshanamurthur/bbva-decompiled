package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: ScopedInstanceFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u001a\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012¨\u0006\u0019"}, d2 = {"Lorg/koin/core/instance/ScopedInstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceFactory;", "Lorg/koin/core/instance/InstanceContext;", "context", "", "isCreated", "Lorg/koin/core/scope/Scope;", "scope", "", "drop", "create", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "get", "dropAll", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "", "instance", "refreshInstance", "Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, T> f92343b;

    /* JADX INFO: compiled from: ScopedInstanceFactory.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ScopedInstanceFactory<T> f92344p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InstanceContext f92345q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScopedInstanceFactory<T> scopedInstanceFactory, InstanceContext instanceContext) {
            super(0);
            this.f92344p0 = scopedInstanceFactory;
            this.f92345q0 = instanceContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ScopedInstanceFactory<T> scopedInstanceFactory = this.f92344p0;
            InstanceContext instanceContext = this.f92345q0;
            if (!scopedInstanceFactory.isCreated(instanceContext)) {
                scopedInstanceFactory.f92343b.put(instanceContext.getScope().getId(), scopedInstanceFactory.create(instanceContext));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.f92343b = new HashMap<>();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(@NotNull InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap<String, T> map = this.f92343b;
        if (map.get(context.getScope().getId()) == null) {
            return (T) super.create(context);
        }
        T t10 = map.get(context.getScope().getId());
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        if (scope != null) {
            Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
            HashMap<String, T> map = this.f92343b;
            if (onClose != null) {
                onClose.invoke(map.get(scope.getId()));
            }
            map.remove(scope.getId());
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        this.f92343b.clear();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(context.getScope().getScopeQualifier(), getBeanDefinition().getScopeQualifier())) {
            throw new IllegalStateException(("Wrong Scope: trying to open instance for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
        }
        KoinPlatformTools.INSTANCE.m6249synchronized(this, new a(this, context));
        T t10 = this.f92343b.get(context.getScope().getId());
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext context) {
        Scope scope;
        return this.f92343b.get((context == null || (scope = context.getScope()) == null) ? null : scope.getId()) != null;
    }

    public final void refreshInstance(@NotNull String scopeID, @NotNull Object instance) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f92343b.put(scopeID, instance);
    }
}
