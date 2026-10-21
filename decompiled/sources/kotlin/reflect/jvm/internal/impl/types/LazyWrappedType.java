package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final StorageManager f81944q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Function0<KotlinType> f81945r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<KotlinType> f81946s0;

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class a extends Lambda implements Function0<KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KotlinTypeRefiner f81947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyWrappedType f81948q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
            super(0);
            this.f81947p0 = kotlinTypeRefiner;
            this.f81948q0 = lazyWrappedType;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final KotlinType invoke() {
            return this.f81947p0.refineType((KotlinTypeMarker) this.f81948q0.f81945r0.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f81944q0 = storageManager;
        this.f81945r0 = computation;
        this.f81946s0 = storageManager.createLazyValue(computation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return this.f81946s0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.f81946s0.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f81944q0, new a(kotlinTypeRefiner, this));
    }
}
