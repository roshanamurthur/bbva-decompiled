package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.camera.camera2.internal.h0;
import androidx.core.content.res.TypedArrayUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {

    @Deprecated
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PreferenceManager f22331q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f22332r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f22333s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f22334t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ContextThemeWrapper f22335u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public androidx.preference.c f22336w0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c f22330p0 = new c();
    public int v0 = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a f22337x0 = new a();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final b f22338y0 = new b();

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(@NonNull PreferenceFragment preferenceFragment, @NonNull PreferenceScreen preferenceScreen);
    }

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragment preferenceFragment = PreferenceFragment.this;
            PreferenceScreen preferenceScreen = preferenceFragment.getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceFragment.getListView().setAdapter(preferenceFragment.onCreateAdapter(preferenceScreen));
                preferenceScreen.onAttached();
            }
            preferenceFragment.onBindPreferences();
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
            RecyclerView recyclerView = PreferenceFragment.this.f22332r0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f22341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22343c = true;

        public c() {
        }

        public final boolean a(@NonNull View view, @NonNull RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z10 = false;
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z11 = this.f22343c;
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
                rect.bottom = this.f22342b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (this.f22341a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (a(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f22341a.setBounds(0, height, width, this.f22342b + height);
                    this.f22341a.draw(canvas);
                }
            }
        }
    }

    public static class d extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.Adapter<?> f22345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f22346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Preference f22347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f22348d;

        public d(@NonNull RecyclerView.Adapter<?> adapter, @NonNull RecyclerView recyclerView, Preference preference, String str) {
            this.f22345a = adapter;
            this.f22346b = recyclerView;
            this.f22347c = preference;
            this.f22348d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            RecyclerView.Adapter<?> adapter = this.f22345a;
            adapter.unregisterAdapterDataObserver(this);
            Preference preference = this.f22347c;
            int preferenceAdapterPosition = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(this.f22348d);
            if (preferenceAdapterPosition != -1) {
                this.f22346b.scrollToPosition(preferenceAdapterPosition);
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

    @Deprecated
    public void addPreferencesFromResource(@XmlRes int i10) {
        PreferenceManager preferenceManager = this.f22331q0;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        setPreferenceScreen(preferenceManager.inflateFromResource(this.f22335u0, i10, getPreferenceScreen()));
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @Deprecated
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceManager preferenceManager = this.f22331q0;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Fragment getCallbackFragment() {
        return null;
    }

    @Deprecated
    public final RecyclerView getListView() {
        return this.f22332r0;
    }

    @Deprecated
    public PreferenceManager getPreferenceManager() {
        return this.f22331q0;
    }

    @Deprecated
    public PreferenceScreen getPreferenceScreen() {
        return this.f22331q0.getPreferenceScreen();
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i10);
        this.f22335u0 = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.f22331q0 = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @NonNull
    @Deprecated
    public RecyclerView.Adapter onCreateAdapter(@NonNull PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    @NonNull
    @Deprecated
    public RecyclerView.LayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public abstract void onCreatePreferences(@Nullable Bundle bundle, String str);

    @NonNull
    @Deprecated
    public RecyclerView onCreateRecyclerView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f22335u0.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @Override // android.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = this.f22335u0;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, R.styleable.PreferenceFragment, TypedArrayUtils.getAttr(contextThemeWrapper, R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.v0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PreferenceFragment_android_layout, this.v0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f22335u0);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.v0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f22332r0 = recyclerViewOnCreateRecyclerView;
        c cVar = this.f22330p0;
        recyclerViewOnCreateRecyclerView.addItemDecoration(cVar);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        cVar.f22343c = z10;
        if (this.f22332r0.getParent() == null) {
            viewGroup2.addView(this.f22332r0);
        }
        this.f22337x0.post(this.f22338y0);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        b bVar = this.f22338y0;
        a aVar = this.f22337x0;
        aVar.removeCallbacks(bVar);
        aVar.removeMessages(1);
        if (this.f22333s0) {
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceScreen.onDetached();
            }
            onUnbindPreferences();
        }
        this.f22332r0 = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    @Deprecated
    public void onDisplayPreferenceDialog(@NonNull Preference preference) {
        DialogFragment dialogFragmentNewInstance;
        boolean zOnPreferenceDisplayDialog = getCallbackFragment() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        if (!zOnPreferenceDisplayDialog && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentNewInstance = EditTextPreferenceDialogFragment.newInstance(preference.getKey());
            } else if (preference instanceof ListPreference) {
                dialogFragmentNewInstance = ListPreferenceDialogFragment.newInstance(preference.getKey());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                dialogFragmentNewInstance = MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey());
            }
            dialogFragmentNewInstance.setTargetFragment(this, 0);
            dialogFragmentNewInstance.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    @Deprecated
    public void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen) {
        if (!((getCallbackFragment() instanceof OnPreferenceStartScreenCallback) && ((OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen)) && (getActivity() instanceof OnPreferenceStartScreenCallback)) {
            ((OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    @Deprecated
    public boolean onPreferenceTreeClick(@NonNull Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zOnPreferenceStartFragment = getCallbackFragment() instanceof OnPreferenceStartFragmentCallback ? ((OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        return (zOnPreferenceStartFragment || !(getActivity() instanceof OnPreferenceStartFragmentCallback)) ? zOnPreferenceStartFragment : ((OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f22331q0.setOnPreferenceTreeClickListener(this);
        this.f22331q0.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f22331q0.setOnPreferenceTreeClickListener(null);
        this.f22331q0.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.f22333s0) {
            PreferenceScreen preferenceScreen2 = getPreferenceScreen();
            if (preferenceScreen2 != null) {
                getListView().setAdapter(onCreateAdapter(preferenceScreen2));
                preferenceScreen2.onAttached();
            }
            onBindPreferences();
            androidx.preference.c cVar = this.f22336w0;
            if (cVar != null) {
                cVar.run();
                this.f22336w0 = null;
            }
        }
        this.f22334t0 = true;
    }

    @Deprecated
    public void scrollToPreference(@NonNull Preference preference) {
        androidx.preference.c cVar = new androidx.preference.c(this, preference, null);
        if (this.f22332r0 == null) {
            this.f22336w0 = cVar;
        } else {
            cVar.run();
        }
    }

    @Deprecated
    public void setDivider(@Nullable Drawable drawable) {
        c cVar = this.f22330p0;
        if (drawable != null) {
            cVar.getClass();
            cVar.f22342b = drawable.getIntrinsicHeight();
        } else {
            cVar.f22342b = 0;
        }
        cVar.f22341a = drawable;
        PreferenceFragment.this.f22332r0.invalidateItemDecorations();
    }

    @Deprecated
    public void setDividerHeight(int i10) {
        c cVar = this.f22330p0;
        cVar.f22342b = i10;
        PreferenceFragment.this.f22332r0.invalidateItemDecorations();
    }

    @Deprecated
    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.f22331q0.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.f22333s0 = true;
        if (this.f22334t0) {
            a aVar = this.f22337x0;
            if (aVar.hasMessages(1)) {
                return;
            }
            aVar.obtainMessage(1).sendToTarget();
        }
    }

    @Deprecated
    public void setPreferencesFromResource(@XmlRes int i10, @Nullable String str) {
        Preference preference;
        Preference preferenceFindPreference;
        PreferenceManager preferenceManager = this.f22331q0;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        PreferenceScreen preferenceScreenInflateFromResource = preferenceManager.inflateFromResource(this.f22335u0, i10, null);
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

    @Deprecated
    public void scrollToPreference(@NonNull String str) {
        androidx.preference.c cVar = new androidx.preference.c(this, null, str);
        if (this.f22332r0 == null) {
            this.f22336w0 = cVar;
        } else {
            cVar.run();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onBindPreferences() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onUnbindPreferences() {
    }
}
