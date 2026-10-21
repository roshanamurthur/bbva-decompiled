package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModelOwner.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "Replaced by ViewModelStoreOwner")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "Landroidx/lifecycle/ViewModelStoreOwner;", "getStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;", "storeOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "b", "Landroidx/savedstate/SavedStateRegistryOwner;", "getStateRegistry", "()Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistry", "<init>", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "Companion", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class ViewModelOwner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelStoreOwner storeOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SavedStateRegistryOwner stateRegistry;

    /* JADX INFO: compiled from: ViewModelOwner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0007¨\u0006\u000b"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner$Companion;", "", "()V", "from", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "storeOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "stateRegistry", "Landroidx/savedstate/SavedStateRegistryOwner;", "fromAny", "owner", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStoreOwner, savedStateRegistryOwner);
        }

        @Deprecated(message = "Replaced by ViewModelStoreOwner")
        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner storeOwner, @Nullable SavedStateRegistryOwner stateRegistry) {
            Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
            return new ViewModelOwner(storeOwner, stateRegistry);
        }

        @Deprecated(message = "Replaced by ViewModelStoreOwner")
        @NotNull
        public final ViewModelOwner fromAny(@NotNull Object owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new ViewModelOwner((ViewModelStoreOwner) owner, owner instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) owner : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(message = "Replaced by ViewModelStoreOwner")
        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner storeOwner) {
            Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
            return new ViewModelOwner(storeOwner, null, 2, 0 == true ? 1 : 0);
        }
    }

    public ViewModelOwner(@NotNull ViewModelStoreOwner storeOwner, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
        this.storeOwner = storeOwner;
        this.stateRegistry = savedStateRegistryOwner;
    }

    @Nullable
    public final SavedStateRegistryOwner getStateRegistry() {
        return this.stateRegistry;
    }

    @NotNull
    public final ViewModelStoreOwner getStoreOwner() {
        return this.storeOwner;
    }

    public /* synthetic */ ViewModelOwner(ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStoreOwner, (i10 & 2) != 0 ? null : savedStateRegistryOwner);
    }
}
