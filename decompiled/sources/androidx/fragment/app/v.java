package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f21776a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, u> f21777b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, FragmentState> f21778c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f21779d;

    public final void a(@NonNull Fragment fragment) {
        if (this.f21776a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f21776a) {
            this.f21776a.add(fragment);
        }
        fragment.mAdded = true;
    }

    @Nullable
    public final Fragment b(@NonNull String str) {
        u uVar = this.f21777b.get(str);
        if (uVar != null) {
            return uVar.f21771c;
        }
        return null;
    }

    @Nullable
    public final Fragment c(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (u uVar : this.f21777b.values()) {
            if (uVar != null && (fragmentFindFragmentByWho = uVar.f21771c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f21777b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f21777b.values()) {
            if (uVar != null) {
                arrayList.add(uVar.f21771c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f21776a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f21776a) {
            arrayList = new ArrayList(this.f21776a);
        }
        return arrayList;
    }

    public final void g(@NonNull u uVar) {
        Fragment fragment = uVar.f21771c;
        String str = fragment.mWho;
        HashMap<String, u> map = this.f21777b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, uVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f21779d.a(fragment);
            } else {
                this.f21779d.d(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public final void h(@NonNull u uVar) {
        Fragment fragment = uVar.f21771c;
        if (fragment.mRetainInstance) {
            this.f21779d.d(fragment);
        }
        if (this.f21777b.put(fragment.mWho, null) != null && FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    @Nullable
    public final FragmentState i(@NonNull String str, @Nullable FragmentState fragmentState) {
        HashMap<String, FragmentState> map = this.f21778c;
        return fragmentState != null ? map.put(str, fragmentState) : map.remove(str);
    }
}
