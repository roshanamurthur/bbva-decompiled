package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: InstanceFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0014\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0014\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u000f\u001a\u00020\rH&J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/mp/Lockable;", "Lorg/koin/core/instance/InstanceContext;", "context", "get", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "create", "", "isCreated", "Lorg/koin/core/scope/Scope;", "scope", "", "drop", "dropAll", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Lorg/koin/core/definition/BeanDefinition;", "a", "Lorg/koin/core/definition/BeanDefinition;", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "Companion", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInstanceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceFactory.kt\norg/koin/core/instance/InstanceFactory\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,86:1\n28#2:87\n46#2,2:88\n29#2:90\n40#2,8:91\n*S KotlinDebug\n*F\n+ 1 InstanceFactory.kt\norg/koin/core/instance/InstanceFactory\n*L\n48#1:87\n48#1:88,2\n48#1:90\n57#1:91,8\n*E\n"})
public abstract class InstanceFactory<T> {

    @NotNull
    public static final String ERROR_SEPARATOR = "\n\t";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BeanDefinition<T> beanDefinition;

    public InstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i10 & 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, InstanceContext instanceContext, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i10 & 1) != 0) {
            instanceContext = null;
        }
        return instanceFactory.isCreated(instanceContext);
    }

    public T create(@NotNull InstanceContext context) throws InstanceCreationException {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger logger = context.getLogger();
        StringBuilder sb2 = new StringBuilder("| (+) '");
        BeanDefinition<T> beanDefinition = this.beanDefinition;
        sb2.append(beanDefinition);
        sb2.append('\'');
        String string = sb2.toString();
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, string);
        }
        try {
            ParametersHolder parameters = context.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return beanDefinition.getDefinition().invoke(context.getScope(), parameters);
        } catch (Exception e5) {
            String stackTrace = KoinPlatformTools.INSTANCE.getStackTrace(e5);
            Logger logger2 = context.getLogger();
            String str = "* Instance creation error : could not create instance for '" + beanDefinition + "': " + stackTrace;
            Level level2 = Level.ERROR;
            if (logger2.isAt(level2)) {
                logger2.display(level2, str);
            }
            throw new InstanceCreationException("Could not create instance for '" + beanDefinition + '\'', e5);
        }
    }

    public abstract void drop(@Nullable Scope scope);

    public abstract void dropAll();

    public boolean equals(@Nullable Object other) {
        InstanceFactory instanceFactory = other instanceof InstanceFactory ? (InstanceFactory) other : null;
        return Intrinsics.areEqual(this.beanDefinition, instanceFactory != null ? instanceFactory.beanDefinition : null);
    }

    public abstract T get(@NotNull InstanceContext context);

    @NotNull
    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public int hashCode() {
        return this.beanDefinition.hashCode();
    }

    public abstract boolean isCreated(@Nullable InstanceContext context);
}
