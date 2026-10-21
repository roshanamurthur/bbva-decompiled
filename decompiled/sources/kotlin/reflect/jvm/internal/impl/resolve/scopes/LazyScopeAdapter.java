package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyScopeAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<MemberScope> f81595a;

    /* JADX INFO: compiled from: LazyScopeAdapter.kt */
    public static final class a extends Lambda implements Function0<MemberScope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<MemberScope> f81596p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends MemberScope> function0) {
            super(0);
            this.f81596p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MemberScope invoke() {
            MemberScope memberScopeInvoke = this.f81596p0.invoke();
            return memberScopeInvoke instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScopeInvoke).getActualScope() : memberScopeInvoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LazyScopeAdapter(@NotNull Function0<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return this.f81595a.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(StorageManager NO_LOCKS, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
            Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, function0);
    }

    @JvmOverloads
    public LazyScopeAdapter(@NotNull StorageManager storageManager, @NotNull Function0<? extends MemberScope> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.f81595a = storageManager.createLazyValue(new a(getScope));
    }
}
