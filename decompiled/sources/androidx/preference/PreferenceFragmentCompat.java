package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.camera.camera2.internal.h0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PreferenceManager f22350q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f22351r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f22352s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f22353t0;
    public androidx.preference.d v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c f22349p0 = new c();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f22354u0 = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f22355w0 = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final b f22356x0 = new b();

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull PreferenceScreen preferenceScreen);
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat preferenceFragmentCompat = PreferenceFragmentCompat.this;
            PreferenceScreen preferenceScreen = preferenceFragmentCompat.getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceFragmentCompat.getListView().setAdapter(preferenceFragmentCompat.onCreateAdapter(preferenceScreen));
                preferenceScreen.onAttached();
            }
            preferenceFragmentCompat.onBindPreferences();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f22351r0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f22359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22361c = true;

        public c() {
        }

        public final boolean a(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z10 = false;
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z11 = this.f22361c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z11;
            }
            RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof PreferenceViewHolder) && ((PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove()) {
                z10 = true;
            }
            return z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (a(view, recyclerView)) {
                rect.bottom = this.f22360b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (this.f22359a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (a(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f22359a.setBounds(0, height, width, this.f22360b + height);
                    this.f22359a.draw(canvas);
                }
            }
        }
    }

    public static class d extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.Adapter<?> f22363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f22364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Preference f22365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f22366d;

        public d(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f22363a = adapter;
            this.f22364b = recyclerView;
            this.f22365c = preference;
            this.f22366d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            RecyclerView.Adapter<?> adapter = this.f22363a;
            adapter.unregisterAdapterDataObserver(this);
            Preference preference = this.f22365c;
            int preferenceAdapterPosition = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(this.f22366d);
            if (preferenceAdapterPosition != -1) {
                this.f22364b.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            a();
        }
    }

    public void addPreferencesFromResource(@XmlRes int i10) {
        PreferenceManager preferenceManager = this.f22350q0;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        setPreferenceScreen(preferenceManager.inflateFromResource(requireContext(), i10, getPreferenceScreen()));
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceManager preferenceManager = this.f22350q0;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.f22351r0;
    }

    public PreferenceManager getPreferenceManager() {
        return this.f22350q0;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.f22350q0.getPreferenceScreen();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i10, false);
        PreferenceManager preferenceManager = new PreferenceManager(requireContext());
        this.f22350q0 = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @NonNull
    public RecyclerView.Adapter onCreateAdapter(@NonNull PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    @NonNull
    public RecyclerView.LayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(@Nullable Bundle bundle, @Nullable String str);

    @NonNull
    public RecyclerView onCreateRecyclerView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, R.styleable.PreferenceFragmentCompat, R.attr.preferenceFragmentCompatStyle, 0);
        this.f22354u0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PreferenceFragmentCompat_android_layout, this.f22354u0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f22354u0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f22351r0 = recyclerViewOnCreateRecyclerView;
        c cVar = this.f22349p0;
        recyclerViewOnCreateRecyclerView.addItemDecoration(cVar);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        cVar.f22361c = z10;
        if (this.f22351r0.getParent() == null) {
            viewGroup2.addView(this.f22351r0);
        }
        this.f22355w0.post(this.f22356x0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        b bVar = this.f22356x0;
        a aVar = this.f22355w0;
        aVar.removeCallbacks(bVar);
        aVar.removeMessages(1);
        if (this.f22352s0) {
            getListView().setAdapter(null);
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceScreen.onDetached();
            }
            onUnbindPreferences();
        }
        this.f22351r0 = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(@NonNull Preference preference) {
        DialogFragment dialogFragmentNewInstance;
        boolean zOnPreferenceDisplayDialog = getCallbackFragment() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        for (Fragment parentFragment = this; !zOnPreferenceDisplayDialog && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceDisplayDialogCallback) {
                zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) parentFragment).onPreferenceDisplayDialog(this, preference);
            }
        }
        if (!zOnPreferenceDisplayDialog && (getContext() instanceof OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getContext()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && getParentFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentNewInstance = EditTextPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            } else if (preference instanceof ListPreference) {
                dialogFragmentNewInstance = ListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dialogFragmentNewInstance = MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            }
            dialogFragmentNewInstance.setTargetFragment(this, 0);
            dialogFragmentNewInstance.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen) {
        boolean zOnPreferenceStartScreen = getCallbackFragment() instanceof OnPreferenceStartScreenCallback ? ((OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen) : false;
        for (Fragment parentFragment = this; !zOnPreferenceStartScreen && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartScreenCallback) {
                zOnPreferenceStartScreen = ((OnPreferenceStartScreenCallback) parentFragment).onPreferenceStartScreen(this, preferenceScreen);
            }
        }
        if (!zOnPreferenceStartScreen && (getContext() instanceof OnPreferenceStartScreenCallback)) {
            zOnPreferenceStartScreen = ((OnPreferenceStartScreenCallback) getContext()).onPreferenceStartScreen(this, preferenceScreen);
        }
        if (zOnPreferenceStartScreen || !(getActivity() instanceof OnPreferenceStartScreenCallback)) {
            return;
        }
        ((OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean onPreferenceTreeClick(@NonNull Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zOnPreferenceStartFragment = getCallbackFragment() instanceof OnPreferenceStartFragmentCallback ? ((OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        for (Fragment parentFragment = this; !zOnPreferenceStartFragment && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartFragmentCallback) {
                zOnPreferenceStartFragment = ((OnPreferenceStartFragmentCallback) parentFragment).onPreferenceStartFragment(this, preference);
            }
        }
        if (!zOnPreferenceStartFragment && (getContext() instanceof OnPreferenceStartFragmentCallback)) {
            zOnPreferenceStartFragment = ((OnPreferenceStartFragmentCallback) getContext()).onPreferenceStartFragment(this, preference);
        }
        if (!zOnPreferenceStartFragment && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            zOnPreferenceStartFragment = ((OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
        }
        if (zOnPreferenceStartFragment) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle extras = preference.getExtras();
        Fragment fragmentInstantiate = parentFragmentManager.getFragmentFactory().instantiate(requireActivity().getClassLoader(), preference.getFragment());
        fragmentInstantiate.setArguments(extras);
        fragmentInstantiate.setTargetFragment(this, 0);
        parentFragmentManager.beginTransaction().replace(((View) requireView().getParent()).getId(), fragmentInstantiate).addToBackStack(null).commit();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f22350q0.setOnPreferenceTreeClickListener(this);
        this.f22350q0.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f22350q0.setOnPreferenceTreeClickListener(null);
        this.f22350q0.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.f22352s0) {
            PreferenceScreen preferenceScreen2 = getPreferenceScreen();
            if (preferenceScreen2 != null) {
                getListView().setAdapter(onCreateAdapter(preferenceScreen2));
                preferenceScreen2.onAttached();
            }
            onBindPreferences();
            androidx.preference.d dVar = this.v0;
            if (dVar != null) {
                dVar.run();
                this.v0 = null;
            }
        }
        this.f22353t0 = true;
    }

    public void scrollToPreference(@NonNull Preference preference) {
        androidx.preference.d dVar = new androidx.preference.d(this, preference, null);
        if (this.f22351r0 == null) {
            this.v0 = dVar;
        } else {
            dVar.run();
        }
    }

    public void setDivider(@Nullable Drawable drawable) {
        c cVar = this.f22349p0;
        if (drawable != null) {
            cVar.getClass();
            cVar.f22360b = drawable.getIntrinsicHeight();
        } else {
            cVar.f22360b = 0;
        }
        cVar.f22359a = drawable;
        PreferenceFragmentCompat.this.f22351r0.invalidateItemDecorations();
    }

    public void setDividerHeight(int i10) {
        c cVar = this.f22349p0;
        cVar.f22360b = i10;
        PreferenceFragmentCompat.this.f22351r0.invalidateItemDecorations();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.f22350q0.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.f22352s0 = true;
        if (this.f22353t0) {
            a aVar = this.f22355w0;
            if (aVar.hasMessages(1)) {
                return;
            }
            aVar.obtainMessage(1).sendToTarget();
        }
    }

    public void setPreferencesFromResource(@XmlRes int i10, @Nullable String str) {
        Preference preference;
        Preference preferenceFindPreference;
        PreferenceManager preferenceManager = this.f22350q0;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        PreferenceScreen preferenceScreenInflateFromResource = preferenceManager.inflateFromResource(requireContext(), i10, null);
        if (str != null) {
            preferenceFindPreference = preferenceScreenInflateFromResource.findPreference(str);
            if (!(preferenceFindPreference instanceof PreferenceScreen)) {
                preference = preferenceScreenInflateFromResource;
                preference = preferenceFindPreference;
                throw new IllegalArgumentException(h0.b("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        preference = preferenceScreenInflateFromResource;
        preference = preferenceFindPreference;
        preference = preferenceScreenInflateFromResource;
        setPreferenceScreen((PreferenceScreen) preference);
    }

    public void scrollToPreference(@NonNull String str) {
        androidx.preference.d dVar = new androidx.preference.d(this, null, str);
        if (this.f22351r0 == null) {
            this.v0 = dVar;
        } else {
            dVar.run();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onBindPreferences() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onUnbindPreferences() {
    }
}
