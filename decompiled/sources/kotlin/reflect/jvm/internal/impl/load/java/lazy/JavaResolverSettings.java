package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaResolverSettings {

    @NotNull
    public static final Companion Companion = Companion.f80623a;

    /* JADX INFO: compiled from: context.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80623a = new Companion();
    }

    /* JADX INFO: compiled from: context.kt */
    public static final class Default implements JavaResolverSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getEnhancePrimitiveArrays() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getIgnoreNullabilityForErasedValueParameters() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getTypeEnhancementImprovementsInStrictMode() {
            return false;
        }
    }

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getEnhancePrimitiveArrays();

    boolean getIgnoreNullabilityForErasedValueParameters();

    boolean getTypeEnhancementImprovementsInStrictMode();
}
