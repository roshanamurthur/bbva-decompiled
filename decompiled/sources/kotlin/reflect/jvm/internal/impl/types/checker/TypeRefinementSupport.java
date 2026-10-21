package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class TypeRefinementSupport {

    /* JADX INFO: compiled from: KotlinTypeRefiner.kt */
    public static final class Enabled extends TypeRefinementSupport {
        @NotNull
        public final KotlinTypeRefiner getTypeRefiner() {
            return null;
        }
    }

    public final boolean isEnabled() {
        return false;
    }
}
