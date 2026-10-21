package org.koin.core.definition;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: KoinDefinition.kt */
/* JADX INFO: loaded from: classes13.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lorg/koin/core/definition/KoinDefinition;", "R", "", "Lorg/koin/core/module/Module;", "component1", "Lorg/koin/core/instance/InstanceFactory;", "component2", "module", "factory", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lorg/koin/core/module/Module;", "getModule", "()Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/instance/InstanceFactory;", "getFactory", "()Lorg/koin/core/instance/InstanceFactory;", "<init>", "(Lorg/koin/core/module/Module;Lorg/koin/core/instance/InstanceFactory;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final /* data */ class KoinDefinition<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Module module;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InstanceFactory<R> factory;

    public KoinDefinition(@NotNull Module module, @NotNull InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.module = module;
        this.factory = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KoinDefinition copy$default(KoinDefinition koinDefinition, Module module, InstanceFactory instanceFactory, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            module = koinDefinition.module;
        }
        if ((i10 & 2) != 0) {
            instanceFactory = koinDefinition.factory;
        }
        return koinDefinition.copy(module, instanceFactory);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Module getModule() {
        return this.module;
    }

    @NotNull
    public final InstanceFactory<R> component2() {
        return this.factory;
    }

    @NotNull
    public final KoinDefinition<R> copy(@NotNull Module module, @NotNull InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new KoinDefinition<>(module, factory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KoinDefinition)) {
            return false;
        }
        KoinDefinition koinDefinition = (KoinDefinition) other;
        return Intrinsics.areEqual(this.module, koinDefinition.module) && Intrinsics.areEqual(this.factory, koinDefinition.factory);
    }

    @NotNull
    public final InstanceFactory<R> getFactory() {
        return this.factory;
    }

    @NotNull
    public final Module getModule() {
        return this.module;
    }

    public int hashCode() {
        return this.factory.hashCode() + (this.module.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "KoinDefinition(module=" + this.module + ", factory=" + this.factory + RootService.CLOSE_BRACKET;
    }
}
