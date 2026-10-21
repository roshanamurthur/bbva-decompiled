package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentHostCallback<?> f21519a;

    public FragmentController(FragmentHostCallback<?> fragmentHostCallback) {
        this.f21519a = fragmentHostCallback;
    }

    @NonNull
    public static FragmentController createController(@NonNull FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    public void attachHost(@Nullable Fragment fragment) {
        FragmentHostCallback<?> fragmentHostCallback = this.f21519a;
        fragmentHostCallback.f21525t0.b(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void dispatchActivityCreated() {
        s sVar = this.f21519a.f21525t0;
        sVar.C = false;
        sVar.D = false;
        sVar.J.v0 = false;
        sVar.p(4);
    }

    public void dispatchConfigurationChanged(@NonNull Configuration configuration) {
        for (Fragment fragment : this.f21519a.f21525t0.f21528c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        return this.f21519a.f21525t0.h(menuItem);
    }

    public void dispatchCreate() {
        s sVar = this.f21519a.f21525t0;
        sVar.C = false;
        sVar.D = false;
        sVar.J.v0 = false;
        sVar.p(1);
    }

    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f21519a.f21525t0.i(menu, menuInflater);
    }

    public void dispatchDestroy() {
        this.f21519a.f21525t0.j();
    }

    public void dispatchDestroyView() {
        this.f21519a.f21525t0.p(1);
    }

    public void dispatchLowMemory() {
        for (Fragment fragment : this.f21519a.f21525t0.f21528c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z10) {
        for (Fragment fragment : this.f21519a.f21525t0.f21528c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        return this.f21519a.f21525t0.l(menuItem);
    }

    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        this.f21519a.f21525t0.m(menu);
    }

    public void dispatchPause() {
        this.f21519a.f21525t0.p(5);
    }

    public void dispatchPictureInPictureModeChanged(boolean z10) {
        for (Fragment fragment : this.f21519a.f21525t0.f21528c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        return this.f21519a.f21525t0.o(menu);
    }

    public void dispatchResume() {
        s sVar = this.f21519a.f21525t0;
        sVar.C = false;
        sVar.D = false;
        sVar.J.v0 = false;
        sVar.p(7);
    }

    public void dispatchStart() {
        s sVar = this.f21519a.f21525t0;
        sVar.C = false;
        sVar.D = false;
        sVar.J.v0 = false;
        sVar.p(5);
    }

    public void dispatchStop() {
        s sVar = this.f21519a.f21525t0;
        sVar.D = true;
        sVar.J.v0 = true;
        sVar.p(4);
    }

    public boolean execPendingActions() {
        return this.f21519a.f21525t0.s(true);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return this.f21519a.f21525t0.f21528c.c(str);
    }

    @NonNull
    public List<Fragment> getActiveFragments(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f21519a.f21525t0.f21528c.e();
    }

    public int getActiveFragmentsCount() {
        return this.f21519a.f21525t0.f21528c.f21777b.size();
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.f21519a.f21525t0;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.f21519a.f21525t0.C();
    }

    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f21519a.f21525t0.f21531f.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable List<Fragment> list) {
        s sVar = this.f21519a.f21525t0;
        FragmentManagerNonConfig fragmentManagerNonConfig = new FragmentManagerNonConfig(list, null, null);
        if (sVar.f21541q instanceof ViewModelStoreOwner) {
            sVar.Q(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
        sVar.J.e(fragmentManagerNonConfig);
        sVar.J(parcelable);
    }

    @Deprecated
    public void restoreSaveState(@Nullable Parcelable parcelable) {
        FragmentHostCallback<?> fragmentHostCallback = this.f21519a;
        if (!(fragmentHostCallback instanceof ViewModelStoreOwner)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        s sVar = fragmentHostCallback.f21525t0;
        if (sVar.f21541q instanceof SavedStateRegistryOwner) {
            sVar.Q(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        sVar.J(parcelable);
    }

    @Nullable
    @Deprecated
    public SimpleArrayMap<String, LoaderManager> retainLoaderNonConfig() {
        return null;
    }

    @Nullable
    @Deprecated
    public FragmentManagerNonConfig retainNestedNonConfig() {
        s sVar = this.f21519a.f21525t0;
        if (!(sVar.f21541q instanceof ViewModelStoreOwner)) {
            return sVar.J.c();
        }
        sVar.Q(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    @Nullable
    @Deprecated
    public List<Fragment> retainNonConfig() {
        Collection<Fragment> collection;
        s sVar = this.f21519a.f21525t0;
        if (sVar.f21541q instanceof ViewModelStoreOwner) {
            sVar.Q(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
            throw null;
        }
        FragmentManagerNonConfig fragmentManagerNonConfigC = sVar.J.c();
        if (fragmentManagerNonConfigC == null || (collection = fragmentManagerNonConfigC.f21577a) == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    @Nullable
    @Deprecated
    public Parcelable saveAllState() {
        s sVar = this.f21519a.f21525t0;
        if (!(sVar.f21541q instanceof SavedStateRegistryOwner)) {
            return sVar.K();
        }
        sVar.Q(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        throw null;
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig) {
        s sVar = this.f21519a.f21525t0;
        if (!(sVar.f21541q instanceof ViewModelStoreOwner)) {
            sVar.J.e(fragmentManagerNonConfig);
            sVar.J(parcelable);
        } else {
            sVar.Q(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    @Deprecated
    public void doLoaderDestroy() {
    }

    @Deprecated
    public void doLoaderRetain() {
    }

    @Deprecated
    public void doLoaderStart() {
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void doLoaderStop(boolean z10) {
    }

    @Deprecated
    public void restoreLoaderNonConfig(@SuppressLint({"UnknownNullness"}) SimpleArrayMap<String, LoaderManager> simpleArrayMap) {
    }

    @Deprecated
    public void dumpLoaders(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
