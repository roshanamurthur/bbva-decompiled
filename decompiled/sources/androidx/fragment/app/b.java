package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FragmentManager f21669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21672w;

    public b(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f21522q0.getClassLoader() : null);
        this.f21671v = -1;
        this.f21672w = false;
        this.f21669t = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final boolean a(@NonNull ArrayList<b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f21631i) {
            return true;
        }
        FragmentManager fragmentManager = this.f21669t;
        if (fragmentManager.f21529d == null) {
            fragmentManager.f21529d = new ArrayList<>();
        }
        fragmentManager.f21529d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commit() {
        return f(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commitAllowingStateLoss() {
        return f(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNow() {
        disallowAddToBackStack();
        this.f21669t.t(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f21669t.t(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void d(int i10, Fragment fragment, @Nullable String str, int i11) {
        super.d(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f21669t;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction detach(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f21669t) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void e(int i10) {
        if (this.f21631i) {
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            ArrayList<FragmentTransaction.a> arrayList = this.f21625c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                FragmentTransaction.a aVar = arrayList.get(i11);
                Fragment fragment = aVar.f21642b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(aVar.f21642b);
                        int i12 = aVar.f21642b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final int f(boolean z10) {
        if (this.f21670u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new a0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f21670u = true;
        boolean z11 = this.f21631i;
        FragmentManager fragmentManager = this.f21669t;
        if (z11) {
            this.f21671v = fragmentManager.f21534i.getAndIncrement();
        } else {
            this.f21671v = -1;
        }
        fragmentManager.q(this, z10);
        return this.f21671v;
    }

    public final void g(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f21633k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f21671v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f21670u);
            if (this.f21630h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f21630h));
            }
            if (this.f21626d != 0 || this.f21627e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21626d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21627e));
            }
            if (this.f21628f != 0 || this.f21629g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21628f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21629g));
            }
            if (this.f21634l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21634l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.f21635n != 0 || this.f21636o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21635n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f21636o);
            }
        }
        ArrayList<FragmentTransaction.a> arrayList = this.f21625c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            FragmentTransaction.a aVar = arrayList.get(i10);
            switch (aVar.f21641a) {
                case 0:
                    str2 = VDVideoSelfieConfiguration.NULL;
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f21641a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f21642b);
            if (z10) {
                if (aVar.f21644d != 0 || aVar.f21645e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f21644d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f21645e));
                }
                if (aVar.f21646f != 0 || aVar.f21647g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f21646f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f21647g));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public final CharSequence getBreadCrumbShortTitle() {
        return this.f21635n != 0 ? this.f21669t.getHost().f21522q0.getText(this.f21635n) : this.f21636o;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getBreadCrumbShortTitleRes() {
        return this.f21635n;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public final CharSequence getBreadCrumbTitle() {
        return this.f21634l != 0 ? this.f21669t.getHost().f21522q0.getText(this.f21634l) : this.m;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getBreadCrumbTitleRes() {
        return this.f21634l;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getId() {
        return this.f21671v;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public final String getName() {
        return this.f21633k;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction hide(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f21669t) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final boolean isEmpty() {
        return this.f21625c.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction remove(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f21669t) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f21669t;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.setMaxLifecycle(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f21669t) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public final FragmentTransaction show(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f21669t) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sbA = a.a(128, "BackStackEntry{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f21671v >= 0) {
            sbA.append(" #");
            sbA.append(this.f21671v);
        }
        if (this.f21633k != null) {
            sbA.append(" ");
            sbA.append(this.f21633k);
        }
        sbA.append("}");
        return sbA.toString();
    }

    public b(@NonNull b bVar) {
        super(bVar.f21669t.getFragmentFactory(), bVar.f21669t.getHost() != null ? bVar.f21669t.getHost().f21522q0.getClassLoader() : null);
        for (FragmentTransaction.a aVar : bVar.f21625c) {
            ArrayList<FragmentTransaction.a> arrayList = this.f21625c;
            FragmentTransaction.a aVar2 = new FragmentTransaction.a();
            aVar2.f21641a = aVar.f21641a;
            aVar2.f21642b = aVar.f21642b;
            aVar2.f21643c = aVar.f21643c;
            aVar2.f21644d = aVar.f21644d;
            aVar2.f21645e = aVar.f21645e;
            aVar2.f21646f = aVar.f21646f;
            aVar2.f21647g = aVar.f21647g;
            aVar2.f21648h = aVar.f21648h;
            aVar2.f21649i = aVar.f21649i;
            arrayList.add(aVar2);
        }
        this.f21626d = bVar.f21626d;
        this.f21627e = bVar.f21627e;
        this.f21628f = bVar.f21628f;
        this.f21629g = bVar.f21629g;
        this.f21630h = bVar.f21630h;
        this.f21631i = bVar.f21631i;
        this.f21632j = bVar.f21632j;
        this.f21633k = bVar.f21633k;
        this.f21635n = bVar.f21635n;
        this.f21636o = bVar.f21636o;
        this.f21634l = bVar.f21634l;
        this.m = bVar.m;
        if (bVar.f21637p != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f21637p = arrayList2;
            arrayList2.addAll(bVar.f21637p);
        }
        if (bVar.f21638q != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f21638q = arrayList3;
            arrayList3.addAll(bVar.f21638q);
        }
        this.f21639r = bVar.f21639r;
        this.f21671v = -1;
        this.f21672w = false;
        this.f21669t = bVar.f21669t;
        this.f21670u = bVar.f21670u;
        this.f21671v = bVar.f21671v;
        this.f21672w = bVar.f21672w;
    }
}
