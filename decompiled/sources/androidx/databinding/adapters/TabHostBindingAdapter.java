package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TabHostBindingAdapter {

    public class a implements TabHost.OnTabChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TabHost.OnTabChangeListener f20601p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20602q0;

        public a(TabHost.OnTabChangeListener onTabChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20601p0 = onTabChangeListener;
            this.f20602q0 = inverseBindingListener;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public final void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f20601p0;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f20602q0.onChange();
        }
    }

    @InverseBindingAdapter(attribute = "android:currentTab")
    public static int getCurrentTab(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @InverseBindingAdapter(attribute = "android:currentTab")
    public static String getCurrentTabTag(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @BindingAdapter({"android:currentTab"})
    public static void setCurrentTab(TabHost tabHost, int i10) {
        if (tabHost.getCurrentTab() != i10) {
            tabHost.setCurrentTab(i10);
        }
    }

    @BindingAdapter({"android:currentTab"})
    public static void setCurrentTabTag(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    @BindingAdapter(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void setListeners(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, inverseBindingListener));
        }
    }
}
