package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentManager f21603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FragmentTransaction f21605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<Fragment.SavedState> f21606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<Fragment> f21607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f21608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21609i;

    @Deprecated
    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        ArrayList<Fragment.SavedState> arrayList;
        Fragment fragment = (Fragment) obj;
        FragmentTransaction fragmentTransaction = this.f21605e;
        FragmentManager fragmentManager = this.f21603c;
        if (fragmentTransaction == null) {
            this.f21605e = fragmentManager.beginTransaction();
        }
        while (true) {
            arrayList = this.f21606f;
            if (arrayList.size() > i10) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i10, fragment.isAdded() ? fragmentManager.saveFragmentInstanceState(fragment) : null);
        this.f21607g.set(i10, null);
        this.f21605e.remove(fragment);
        if (fragment.equals(this.f21608h)) {
            this.f21608h = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f21605e;
        if (fragmentTransaction != null) {
            if (!this.f21609i) {
                try {
                    this.f21609i = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                    this.f21609i = false;
                } catch (Throwable th2) {
                    this.f21609i = false;
                    throw th2;
                }
            }
            this.f21605e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i10);

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.f21607g;
        if (arrayList.size() > i10 && (fragment = arrayList.get(i10)) != null) {
            return fragment;
        }
        if (this.f21605e == null) {
            this.f21605e = this.f21603c.beginTransaction();
        }
        Fragment item = getItem(i10);
        ArrayList<Fragment.SavedState> arrayList2 = this.f21606f;
        if (arrayList2.size() > i10 && (savedState = arrayList2.get(i10)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i10) {
            arrayList.add(null);
        }
        item.setMenuVisibility(false);
        int i11 = this.f21604d;
        if (i11 == 0) {
            item.setUserVisibleHint(false);
        }
        arrayList.set(i10, item);
        this.f21605e.add(viewGroup.getId(), item);
        if (i11 == 1) {
            this.f21605e.setMaxLifecycle(item, Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray(com.huawei.hms.feature.model.b.f50432b);
            ArrayList<Fragment.SavedState> arrayList = this.f21606f;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.f21607g;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f21603c.getFragment(bundle, str);
                    if (fragment != null) {
                        while (arrayList2.size() <= i10) {
                            arrayList2.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        arrayList2.set(i10, fragment);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        Bundle bundle;
        ArrayList<Fragment.SavedState> arrayList = this.f21606f;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray(com.huawei.hms.feature.model.b.f50432b, savedStateArr);
        } else {
            bundle = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.f21607g;
            if (i10 >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = arrayList2.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f21603c.putFragment(bundle, g0.c("f", i10), fragment);
            }
            i10++;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f21608h;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f21603c;
            int i11 = this.f21604d;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i11 == 1) {
                    if (this.f21605e == null) {
                        this.f21605e = fragmentManager.beginTransaction();
                    }
                    this.f21605e.setMaxLifecycle(this.f21608h, Lifecycle.State.STARTED);
                } else {
                    this.f21608h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i11 == 1) {
                if (this.f21605e == null) {
                    this.f21605e = fragmentManager.beginTransaction();
                }
                this.f21605e.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f21608h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager, int i10) {
        this.f21605e = null;
        this.f21606f = new ArrayList<>();
        this.f21607g = new ArrayList<>();
        this.f21608h = null;
        this.f21603c = fragmentManager;
        this.f21604d = i10;
    }
}
