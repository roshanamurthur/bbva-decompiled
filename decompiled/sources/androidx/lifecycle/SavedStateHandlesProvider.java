package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroid/os/Bundle;", "saveState", "", "performRestore", "", "key", "consumeRestoredStateForKey", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistry f21992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f21994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f21995d;

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class a extends Lambda implements Function0<SavedStateHandlesVM> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelStoreOwner f21996p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner) {
            super(0);
            this.f21996p0 = viewModelStoreOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SavedStateHandlesVM invoke() {
            return SavedStateHandleSupport.getSavedStateHandlesVM(this.f21996p0);
        }
    }

    public SavedStateHandlesProvider(@NotNull SavedStateRegistry savedStateRegistry, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f21992a = savedStateRegistry;
        this.f21995d = LazyKt__LazyJVMKt.lazy(new a(viewModelStoreOwner));
    }

    @Nullable
    public final Bundle consumeRestoredStateForKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        performRestore();
        Bundle bundle = this.f21994c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f21994c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f21994c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f21994c = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.f21993b) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.f21992a.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21994c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            bundle.putAll(bundleConsumeRestoredStateForKey);
        }
        this.f21994c = bundle;
        this.f21993b = true;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @NotNull
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21994c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : ((SavedStateHandlesVM) this.f21995d.getValue()).getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().getF21985e().saveState();
            if (!Intrinsics.areEqual(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.f21993b = false;
        return bundle;
    }
}
