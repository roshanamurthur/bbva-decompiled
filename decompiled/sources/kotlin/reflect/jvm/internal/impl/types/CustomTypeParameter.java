package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface CustomTypeParameter {
    boolean isTypeParameter();

    @NotNull
    KotlinType substitutionResult(@NotNull KotlinType kotlinType);
}
