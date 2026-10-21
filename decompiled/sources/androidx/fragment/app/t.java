package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends ViewModel {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final a f21762w0 = new a();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f21766s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashMap<String, Fragment> f21763p0 = new HashMap<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap<String, t> f21764q0 = new HashMap<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final HashMap<String, ViewModelStore> f21765r0 = new HashMap<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f21767t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f21768u0 = false;
    public boolean v0 = false;

    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    public class a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.p.b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
            return androidx.lifecycle.p.c(this, kClass, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new t(true);
        }
    }

    public t(boolean z10) {
        this.f21766s0 = z10;
    }

    public final void a(@NonNull Fragment fragment) {
        if (this.v0) {
            FragmentManager.isLoggingEnabled(2);
            return;
        }
        HashMap<String, Fragment> map = this.f21763p0;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public final void b(@NonNull String str) {
        HashMap<String, t> map = this.f21764q0;
        t tVar = map.get(str);
        if (tVar != null) {
            tVar.onCleared();
            map.remove(str);
        }
        HashMap<String, ViewModelStore> map2 = this.f21765r0;
        ViewModelStore viewModelStore = map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            map2.remove(str);
        }
    }

    @Nullable
    @Deprecated
    public final FragmentManagerNonConfig c() {
        HashMap<String, Fragment> map = this.f21763p0;
        boolean zIsEmpty = map.isEmpty();
        HashMap<String, t> map2 = this.f21764q0;
        HashMap<String, ViewModelStore> map3 = this.f21765r0;
        if (zIsEmpty && map2.isEmpty() && map3.isEmpty()) {
            return null;
        }
        HashMap map4 = new HashMap();
        for (Map.Entry<String, t> entry : map2.entrySet()) {
            FragmentManagerNonConfig fragmentManagerNonConfigC = entry.getValue().c();
            if (fragmentManagerNonConfigC != null) {
                map4.put(entry.getKey(), fragmentManagerNonConfigC);
            }
        }
        this.f21768u0 = true;
        if (map.isEmpty() && map4.isEmpty() && map3.isEmpty()) {
            return null;
        }
        return new FragmentManagerNonConfig(new ArrayList(map.values()), map4, new HashMap(map3));
    }

    public final void d(@NonNull Fragment fragment) {
        if (this.v0) {
            FragmentManager.isLoggingEnabled(2);
        } else {
            if (this.f21763p0.remove(fragment.mWho) == null || !FragmentManager.isLoggingEnabled(2)) {
                return;
            }
            fragment.toString();
        }
    }

    @Deprecated
    public final void e(@Nullable FragmentManagerNonConfig fragmentManagerNonConfig) {
        HashMap<String, Fragment> map = this.f21763p0;
        map.clear();
        HashMap<String, t> map2 = this.f21764q0;
        map2.clear();
        HashMap<String, ViewModelStore> map3 = this.f21765r0;
        map3.clear();
        if (fragmentManagerNonConfig != null) {
            Collection<Fragment> collection = fragmentManagerNonConfig.f21577a;
            if (collection != null) {
                for (Fragment fragment : collection) {
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, FragmentManagerNonConfig> map4 = fragmentManagerNonConfig.f21578b;
            if (map4 != null) {
                for (Map.Entry<String, FragmentManagerNonConfig> entry : map4.entrySet()) {
                    t tVar = new t(this.f21766s0);
                    tVar.e(entry.getValue());
                    map2.put(entry.getKey(), tVar);
                }
            }
            Map<String, ViewModelStore> map5 = fragmentManagerNonConfig.f21579c;
            if (map5 != null) {
                map3.putAll(map5);
            }
        }
        this.f21768u0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f21763p0.equals(tVar.f21763p0) && this.f21764q0.equals(tVar.f21764q0) && this.f21765r0.equals(tVar.f21765r0);
    }

    public final int hashCode() {
        return this.f21765r0.hashCode() + ((this.f21764q0.hashCode() + (this.f21763p0.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        this.f21767t0 = true;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f21763p0.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f21764q0.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f21765r0.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }
}
