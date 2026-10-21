package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InstanceContext.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "Lorg/koin/core/logger/Logger;", "a", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "logger", "Lorg/koin/core/scope/Scope;", "b", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/core/parameter/ParametersHolder;", "c", "Lorg/koin/core/parameter/ParametersHolder;", "getParameters", "()Lorg/koin/core/parameter/ParametersHolder;", "parameters", "<init>", "(Lorg/koin/core/logger/Logger;Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class InstanceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Logger logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ParametersHolder parameters;

    public InstanceContext(@NotNull Logger logger, @NotNull Scope scope, @Nullable ParametersHolder parametersHolder) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.logger = logger;
        this.scope = scope;
        this.parameters = parametersHolder;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    public final ParametersHolder getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    public /* synthetic */ InstanceContext(Logger logger, Scope scope, ParametersHolder parametersHolder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, scope, (i10 & 4) != 0 ? null : parametersHolder);
    }
}
