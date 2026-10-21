package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Fragment f21799p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ViewModelStore f21800q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ViewModelProvider.Factory f21801r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LifecycleRegistry f21802s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SavedStateRegistryController f21803t0 = null;

    public z(@NonNull Fragment fragment, @NonNull ViewModelStore viewModelStore) {
        this.f21799p0 = fragment;
        this.f21800q0 = viewModelStore;
    }

    public final void a(@NonNull Lifecycle.Event event) {
        this.f21802s0.handleLifecycleEvent(event);
    }

    public final void b() {
        if (this.f21802s0 == null) {
            this.f21802s0 = new LifecycleRegistry(this);
            this.f21803t0 = SavedStateRegistryController.create(this);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ CreationExtras getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.f.a(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f21799p0;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f21801r0 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f21801r0 == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f21801r0 = new SavedStateViewModelFactory(application, this, fragment.getArguments());
        }
        return this.f21801r0;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public final Lifecycle getLifecycle() {
        b();
        return this.f21802s0;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f21803t0.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f21800q0;
    }
}
