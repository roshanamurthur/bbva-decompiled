package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface TypeWithEnhancement {
    @NotNull
    KotlinType getEnhancement();

    @NotNull
    UnwrappedType getOrigin();
}
