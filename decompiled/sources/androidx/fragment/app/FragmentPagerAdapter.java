package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentManager f21589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FragmentTransaction f21591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Fragment f21592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21593g;

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f21591e == null) {
            this.f21591e = this.f21589c.beginTransaction();
        }
        this.f21591e.detach(fragment);
        if (fragment.equals(this.f21592f)) {
            this.f21592f = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f21591e;
        if (fragmentTransaction != null) {
            if (!this.f21593g) {
                try {
                    this.f21593g = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                    this.f21593g = false;
                } catch (Throwable th2) {
                    this.f21593g = false;
                    throw th2;
                }
            }
            this.f21591e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i10);

    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        FragmentTransaction fragmentTransaction = this.f21591e;
        FragmentManager fragmentManager = this.f21589c;
        if (fragmentTransaction == null) {
            this.f21591e = fragmentManager.beginTransaction();
        }
        long itemId = getItemId(i10);
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("android:switcher:" + viewGroup.getId() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + itemId);
        if (fragmentFindFragmentByTag != null) {
            this.f21591e.attach(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = getItem(i10);
            this.f21591e.add(viewGroup.getId(), fragmentFindFragmentByTag, "android:switcher:" + viewGroup.getId() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + itemId);
        }
        if (fragmentFindFragmentByTag != this.f21592f) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.f21590d == 1) {
                this.f21591e.setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.STARTED);
            } else {
                fragmentFindFragmentByTag.setUserVisibleHint(false);
            }
        }
        return fragmentFindFragmentByTag;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f21592f;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f21589c;
            int i11 = this.f21590d;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i11 == 1) {
                    if (this.f21591e == null) {
                        this.f21591e = fragmentManager.beginTransaction();
                    }
                    this.f21591e.setMaxLifecycle(this.f21592f, Lifecycle.State.STARTED);
                } else {
                    this.f21592f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i11 == 1) {
                if (this.f21591e == null) {
                    this.f21591e = fragmentManager.beginTransaction();
                }
                this.f21591e.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f21592f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager, int i10) {
        this.f21591e = null;
        this.f21592f = null;
        this.f21589c = fragmentManager;
        this.f21590d = i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }
}
