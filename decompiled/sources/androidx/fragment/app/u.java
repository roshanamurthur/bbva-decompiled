package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f21769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f21770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Fragment f21771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21772d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21773e = -1;

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21775a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f21775a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21775a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21775a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21775a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public u(@NonNull q qVar, @NonNull v vVar, @NonNull Fragment fragment) {
        this.f21769a = qVar;
        this.f21770b = vVar;
        this.f21771c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        v vVar = this.f21770b;
        vVar.getClass();
        Fragment fragment = this.f21771c;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = vVar.f21776a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                Fragment fragment2 = arrayList.get(i10);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f21771c;
        if (zIsLoggingEnabled) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        u uVar = null;
        v vVar = this.f21770b;
        if (fragment2 != null) {
            u uVar2 = vVar.f21777b.get(fragment2.mWho);
            if (uVar2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            uVar = uVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (uVar = vVar.f21777b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(ad.d.f(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (uVar != null) {
            uVar.i();
        }
        fragment.mHost = fragment.mFragmentManager.getHost();
        fragment.mParentFragment = fragment.mFragmentManager.f21543s;
        q qVar = this.f21769a;
        qVar.g(fragment, false);
        fragment.performAttach();
        qVar.b(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.f21771c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f21773e;
        int i10 = b.f21775a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f21773e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f21773e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        b0.e.b bVar = null;
        b0.e eVar = null;
        if (viewGroup != null) {
            b0 b0VarF = b0.f(viewGroup, fragment.getParentFragmentManager());
            b0VarF.getClass();
            b0.e eVarD = b0VarF.d(fragment);
            b0.e.b bVar2 = eVarD != null ? eVarD.f21686b : null;
            for (b0.e eVar2 : b0VarF.f21675c) {
                if (eVar2.f21687c.equals(fragment) && !eVar2.f21690f) {
                    eVar = eVar2;
                    break;
                }
            }
            bVar = (eVar == null || !(bVar2 == null || bVar2 == b0.e.b.NONE)) ? bVar2 : eVar.f21686b;
        }
        if (bVar == b0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVar == b0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() {
        String resourceName;
        Fragment fragment = this.f21771c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(fragment);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i10 = fragment.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(androidx.collection.a.c("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f21542r.onFindViewById(i10);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.onWrongFragmentContainer(fragment, viewGroup);
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (ViewCompat.isAttachedToWindow(fragment.mView)) {
                ViewCompat.requestApplyInsets(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.f21769a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f21771c;
        if (zIsLoggingEnabled) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        v vVar = this.f21770b;
        if (z10 && !fragment.mBeingSaved) {
            vVar.i(fragment.mWho, null);
        }
        if (!z10) {
            t tVar = vVar.f21779d;
            if (tVar.f21763p0.containsKey(fragment.mWho)) {
                if (!(tVar.f21766s0 ? tVar.f21767t0 : !tVar.f21768u0)) {
                    String str = fragment.mTargetWho;
                    if (str != null && (fragmentB = vVar.b(str)) != null && fragmentB.mRetainInstance) {
                        fragment.mTarget = fragmentB;
                    }
                    fragment.mState = 0;
                    return;
                }
            }
        }
        FragmentHostCallback<?> fragmentHostCallback = fragment.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = vVar.f21779d.f21767t0;
        } else {
            Context context = fragmentHostCallback.f21522q0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z10 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            t tVar2 = vVar.f21779d;
            tVar2.getClass();
            if (FragmentManager.isLoggingEnabled(3)) {
                Objects.toString(fragment);
            }
            tVar2.b(fragment.mWho);
        }
        fragment.performDestroy();
        this.f21769a.d(fragment, false);
        for (u uVar : vVar.d()) {
            if (uVar != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = uVar.f21771c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = vVar.b(str3);
        }
        vVar.h(this);
    }

    public final void f() {
        View view;
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f21771c;
        if (zIsLoggingEnabled) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f21769a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f21771c;
        if (zIsLoggingEnabled) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f21769a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            t tVar = this.f21770b.f21779d;
            if (tVar.f21763p0.containsKey(fragment.mWho)) {
                if (!(tVar.f21766s0 ? tVar.f21767t0 : !tVar.f21768u0)) {
                    return;
                }
            }
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.f21771c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Objects.toString(fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f21769a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f21772d;
        Fragment fragment = this.f21771c;
        if (z10) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f21772d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i10 = fragment.mState;
                v vVar = this.f21770b;
                if (iC == i10) {
                    if (!z11 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Objects.toString(fragment);
                        }
                        t tVar = vVar.f21779d;
                        tVar.getClass();
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Objects.toString(fragment);
                        }
                        tVar.b(fragment.mWho);
                        vVar.h(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            b0 b0VarF = b0.f(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                b0VarF.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment);
                                }
                                b0VarF.a(b0.e.c.GONE, b0.e.b.NONE, this);
                            } else {
                                b0VarF.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment);
                                }
                                b0VarF.a(b0.e.c.VISIBLE, b0.e.b.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.z(fragment)) {
                            fragmentManager.B = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.k();
                    }
                    return;
                }
                q qVar = this.f21769a;
                if (iC > i10) {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            if (!fragment.mIsCreated) {
                                qVar.h(fragment, fragment.mSavedFragmentState, false);
                                fragment.performCreate(fragment.mSavedFragmentState);
                                qVar.c(fragment, fragment.mSavedFragmentState, false);
                            } else {
                                fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
                                fragment.mState = 1;
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performActivityCreated(fragment.mSavedFragmentState);
                            qVar.a(fragment, fragment.mSavedFragmentState, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                b0 b0VarF2 = b0.f(viewGroup3, fragment.getParentFragmentManager());
                                b0.e.c cVarB = b0.e.c.b(fragment.mView.getVisibility());
                                b0VarF2.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment);
                                }
                                b0VarF2.a(cVarB, b0.e.b.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            qVar.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (vVar.f21778c.get(fragment.mWho) == null) {
                                    m();
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                m();
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                n();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                b0 b0VarF3 = b0.f(viewGroup2, fragment.getParentFragmentManager());
                                b0VarF3.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment);
                                }
                                b0VarF3.a(b0.e.c.REMOVED, b0.e.b.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            qVar.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            qVar.f(fragment, false);
                            break;
                    }
                }
                z11 = true;
            }
        } finally {
            this.f21772d = false;
        }
    }

    public final void j(@NonNull ClassLoader classLoader) {
        Fragment fragment = this.f21771c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void k() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f21771c;
        if (zIsLoggingEnabled) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                focusedView.requestFocus();
                if (FragmentManager.isLoggingEnabled(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (FragmentManager.isLoggingEnabled(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f21769a.i(fragment, false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f21771c;
        fragment.performSaveInstanceState(bundle);
        this.f21769a.j(fragment, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            n();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void m() {
        Fragment fragment = this.f21771c;
        FragmentState fragmentState = new FragmentState(fragment);
        if (fragment.mState <= -1 || fragmentState.G0 != null) {
            fragmentState.G0 = fragment.mSavedFragmentState;
        } else {
            Bundle bundleL = l();
            fragmentState.G0 = bundleL;
            if (fragment.mTargetWho != null) {
                if (bundleL == null) {
                    fragmentState.G0 = new Bundle();
                }
                fragmentState.G0.putString("android:target_state", fragment.mTargetWho);
                int i10 = fragment.mTargetRequestCode;
                if (i10 != 0) {
                    fragmentState.G0.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f21770b.i(fragment.mWho, fragmentState);
    }

    public final void n() {
        Fragment fragment = this.f21771c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f21803t0.performSave(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public u(@NonNull q qVar, @NonNull v vVar, @NonNull ClassLoader classLoader, @NonNull FragmentFactory fragmentFactory, @NonNull FragmentState fragmentState) {
        this.f21769a = qVar;
        this.f21770b = vVar;
        Fragment fragmentA = fragmentState.a(fragmentFactory, classLoader);
        this.f21771c = fragmentA;
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragmentA);
        }
    }

    public u(@NonNull q qVar, @NonNull v vVar, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.f21769a = qVar;
        this.f21770b = vVar;
        this.f21771c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.G0;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f21774p0;

        public a(View view) {
            this.f21774p0 = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f21774p0;
            view2.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
