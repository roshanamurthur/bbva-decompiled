package kotlin.reflect.jvm.internal.impl.load.java;

import bk.q;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.f80542a;

    /* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80542a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final NullabilityAnnotationStatesImpl f80543b = new NullabilityAnnotationStatesImpl(q.emptyMap());

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return f80543b;
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
