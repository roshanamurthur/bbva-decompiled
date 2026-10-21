package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FallbackBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Companion f80134f = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final FallbackBuiltIns f80135g;

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.f80135g;
        }
    }

    static {
        FallbackBuiltIns fallbackBuiltIns = new FallbackBuiltIns(new LockBasedStorageManager("FallbackBuiltIns"));
        fallbackBuiltIns.createBuiltInsModule(true);
        f80135g = fallbackBuiltIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
