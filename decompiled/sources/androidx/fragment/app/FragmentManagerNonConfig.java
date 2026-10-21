package androidx.fragment.app;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelStore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FragmentManagerNonConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Collection<Fragment> f21577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Map<String, FragmentManagerNonConfig> f21578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, ViewModelStore> f21579c;

    public FragmentManagerNonConfig(@Nullable Collection collection, @Nullable HashMap map, @Nullable HashMap map2) {
        this.f21577a = collection;
        this.f21578b = map;
        this.f21579c = map2;
    }
}
