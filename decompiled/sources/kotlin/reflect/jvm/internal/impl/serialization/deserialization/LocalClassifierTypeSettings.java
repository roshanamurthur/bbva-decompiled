package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface LocalClassifierTypeSettings {

    /* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
    public static final class Default implements LocalClassifierTypeSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        @Nullable
        public SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }
    }

    @Nullable
    SimpleType getReplacementTypeForLocalClassifiers();
}
