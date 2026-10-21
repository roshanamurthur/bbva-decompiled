package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface NewTypeVariableConstructor extends TypeConstructor {
    @Nullable
    TypeParameterDescriptor getOriginalTypeParameter();
}
