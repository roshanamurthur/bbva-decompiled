package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0015\u001a\u00020\u0003H&J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "Landroidx/preference/Preference;", "pref", "", "onPreferenceStartFragment", "Landroid/content/Context;", "context", "", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onCreatePreferenceHeader", "view", "onViewCreated", "onViewStateRestored", "onCreateInitialDetailFragment", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "<init>", "()V", "a", "preference_release"}, k = 1, mv = {1, 6, 0})
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f22390q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public a f22391p0;

    /* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
    public static final class a extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final PreferenceHeaderFragmentCompat f22392d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull PreferenceHeaderFragmentCompat caller) {
            super(true);
            Intrinsics.checkNotNullParameter(caller, "caller");
            this.f22392d = caller;
            caller.getSlidingPaneLayout().addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            this.f22392d.getSlidingPaneLayout().closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void onPanelClosed(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void onPanelOpened(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void onPanelSlide(@NotNull View panel, float f6) {
            Intrinsics.checkNotNullParameter(panel, "panel");
        }
    }

    @NotNull
    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(this);
        fragmentTransactionBeginTransaction.commit();
    }

    @Nullable
    public Fragment onCreateInitialDetailFragment() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.preferences_header);
        if (fragmentFindFragmentById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) fragmentFindFragmentById;
        Fragment fragmentInstantiate = null;
        if (preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount() <= 0) {
            return null;
        }
        int preferenceCount = preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount();
        int i10 = 0;
        while (i10 < preferenceCount) {
            int i11 = i10 + 1;
            Preference preference = preferenceFragmentCompat.getPreferenceScreen().getPreference(i10);
            Intrinsics.checkNotNullExpressionValue(preference, "headerFragment.preferenc…reen.getPreference(index)");
            if (preference.getFragment() != null) {
                String fragment = preference.getFragment();
                fragmentInstantiate = fragment != null ? getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment) : null;
                if (fragmentInstantiate == null) {
                    break;
                }
                fragmentInstantiate.setArguments(preference.getExtras());
                break;
            }
            i10 = i11;
        }
        return fragmentInstantiate;
    }

    @NotNull
    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        int i10 = R.id.preferences_header;
        fragmentContainerView.setId(i10);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.preferences_header_width), -1);
        layoutParams.weight = getResources().getInteger(R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(R.id.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.preferences_detail_width), -1);
        layoutParams2.weight = getResources().getInteger(R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        if (getChildFragmentManager().findFragmentById(i10) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatOnCreatePreferenceHeader = onCreatePreferenceHeader();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.add(i10, preferenceFragmentCompatOnCreatePreferenceHeader);
            fragmentTransactionBeginTransaction.commit();
        }
        slidingPaneLayout.setLockMode(3);
        return slidingPaneLayout;
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    @CallSuper
    public boolean onPreferenceStartFragment(@NotNull PreferenceFragmentCompat caller, @NotNull Preference pref) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (caller.getId() != R.id.preferences_header) {
            int id = caller.getId();
            int i10 = R.id.preferences_detail;
            if (id != i10) {
                return false;
            }
            FragmentFactory fragmentFactory = getChildFragmentManager().getFragmentFactory();
            ClassLoader classLoader = requireContext().getClassLoader();
            String fragment = pref.getFragment();
            Intrinsics.checkNotNull(fragment);
            Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, fragment);
            Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "childFragmentManager.fra….fragment!!\n            )");
            fragmentInstantiate.setArguments(pref.getExtras());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.replace(i10, fragmentInstantiate);
            fragmentTransactionBeginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransactionBeginTransaction.addToBackStack(null);
            fragmentTransactionBeginTransaction.commit();
            return true;
        }
        if (pref.getFragment() == null) {
            Intent intent = pref.getIntent();
            if (intent != null) {
                startActivity(intent);
            }
        } else {
            String fragment2 = pref.getFragment();
            Fragment fragmentInstantiate2 = fragment2 != null ? getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment2) : null;
            if (fragmentInstantiate2 != null) {
                fragmentInstantiate2.setArguments(pref.getExtras());
            }
            if (getChildFragmentManager().getBackStackEntryCount() > 0) {
                FragmentManager.BackStackEntry backStackEntryAt = getChildFragmentManager().getBackStackEntryAt(0);
                Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().popBackStack(backStackEntryAt.getId(), 1);
            }
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
            FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "beginTransaction()");
            fragmentTransactionBeginTransaction2.setReorderingAllowed(true);
            int i11 = R.id.preferences_detail;
            Intrinsics.checkNotNull(fragmentInstantiate2);
            fragmentTransactionBeginTransaction2.replace(i11, fragmentInstantiate2);
            if (getSlidingPaneLayout().isOpen()) {
                fragmentTransactionBeginTransaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            }
            getSlidingPaneLayout().openPane();
            fragmentTransactionBeginTransaction2.commit();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f22391p0 = new a(this);
        SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        if (!ViewCompat.isLaidOut(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat = this.f22393a;
                    OnBackPressedCallback onBackPressedCallback = preferenceHeaderFragmentCompat.f22391p0;
                    Intrinsics.checkNotNull(onBackPressedCallback);
                    onBackPressedCallback.setEnabled(preferenceHeaderFragmentCompat.getSlidingPaneLayout().isSlideable() && preferenceHeaderFragmentCompat.getSlidingPaneLayout().isOpen());
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.f22391p0;
            Intrinsics.checkNotNull(onBackPressedCallback);
            onBackPressedCallback.setEnabled(getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen());
        }
        getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.f
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                int i10 = PreferenceHeaderFragmentCompat.f22390q0;
                PreferenceHeaderFragmentCompat this$0 = this.f22453a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PreferenceHeaderFragmentCompat.a aVar = this$0.f22391p0;
                Intrinsics.checkNotNull(aVar);
                aVar.setEnabled(this$0.getChildFragmentManager().getBackStackEntryCount() == 0);
            }
        });
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(view);
        if (onBackPressedDispatcherOwner == null || (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        a aVar = this.f22391p0;
        Intrinsics.checkNotNull(aVar);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Fragment fragmentOnCreateInitialDetailFragment;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (fragmentOnCreateInitialDetailFragment = onCreateInitialDetailFragment()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(R.id.preferences_detail, fragmentOnCreateInitialDetailFragment);
        fragmentTransactionBeginTransaction.commit();
    }
}
