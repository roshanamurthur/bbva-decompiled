package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
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

/* JADX INFO: compiled from: SingleInstanceFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0013"}, d2 = {"Lorg/koin/core/instance/SingleInstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceFactory;", "Lorg/koin/core/instance/InstanceContext;", "context", "", "isCreated", "Lorg/koin/core/scope/Scope;", "scope", "", "drop", "dropAll", "create", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "get", "Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f92346b;

    /* JADX INFO: compiled from: SingleInstanceFactory.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SingleInstanceFactory<T> f92347p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InstanceContext f92348q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SingleInstanceFactory<T> singleInstanceFactory, InstanceContext instanceContext) {
            super(0);
            this.f92347p0 = singleInstanceFactory;
            this.f92348q0 = instanceContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SingleInstanceFactory<T> singleInstanceFactory = this.f92347p0;
            InstanceContext instanceContext = this.f92348q0;
            if (!singleInstanceFactory.isCreated(instanceContext)) {
                singleInstanceFactory.f92346b = singleInstanceFactory.create(instanceContext);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(@NotNull InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        T t10 = this.f92346b;
        if (t10 == null) {
            return (T) super.create(context);
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(this.f92346b);
        }
        this.f92346b = null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        InstanceFactory.drop$default(this, null, 1, null);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        KoinPlatformTools.INSTANCE.m6249synchronized(this, new a(this, context));
        T t10 = this.f92346b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext context) {
        return this.f92346b != null;
    }
}
