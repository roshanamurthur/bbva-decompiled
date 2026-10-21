package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f81542a;

    public ConstantValue(T t10) {
        this.f81542a = t10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            T value = getValue();
            ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
            if (!Intrinsics.areEqual(value, constantValue != null ? constantValue.getValue() : null)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return this.f81542a;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
