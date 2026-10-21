package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultBuiltIns.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy<DefaultBuiltIns> f80088f = LazyKt__LazyJVMKt.lazy(a.f80089p0);

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.f80088f.getValue();
        }
    }

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class a extends Lambda implements Function0<DefaultBuiltIns> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80089p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DefaultBuiltIns invoke() {
            return new DefaultBuiltIns(false, 1, null);
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z10) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z10) {
            createBuiltInsModule(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
