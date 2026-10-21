package hl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeSubstitutor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements Function1<FqName, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(@NotNull FqName fqName) {
        if (fqName != null) {
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
