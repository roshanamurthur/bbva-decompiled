package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: InstanceRegistry.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nInstanceRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry$declareScopedInstance$def$1\n*L\n1#1,204:1\n*E\n"})
public final class InstanceRegistry$declareScopedInstance$def$1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ T f92457p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceRegistry$declareScopedInstance$def$1(T t10) {
        super(2);
        this.f92457p0 = t10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final T invoke(@NotNull Scope _createDefinition, @NotNull ParametersHolder it) {
        Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f92457p0;
    }
}
