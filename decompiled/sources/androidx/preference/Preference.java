package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    public CharSequence E0;
    public int F0;
    public Drawable G0;
    public String H0;
    public Intent I0;
    public String J0;
    public Bundle K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public String P0;
    public Object Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public final boolean U0;
    public final boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f22294a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f22295b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f22296c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public b f22297d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ArrayList f22298e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public PreferenceGroup f22299f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f22300g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f22301h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public c f22302i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public SummaryProvider f22303j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final a f22304k1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Context f22305p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public PreferenceManager f22306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public PreferenceDataStore f22307r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f22308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f22309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public OnPreferenceChangeListener f22310u0;
    public OnPreferenceClickListener v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f22311w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f22312x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f22313y0;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public final BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BaseSavedState[] newArray(int i10) {
                return new BaseSavedState[i10];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(@NonNull Preference preference, Object obj);
    }

    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(@NonNull Preference preference);
    }

    public interface SummaryProvider<T extends Preference> {
        @Nullable
        CharSequence provideSummary(@NonNull T t10);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.performClick(view);
        }
    }

    public interface b {
        void onPreferenceChange(@NonNull Preference preference);

        void onPreferenceHierarchyChange(@NonNull Preference preference);

        void onPreferenceVisibilityChange(@NonNull Preference preference);
    }

    public static class c implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Preference f22315p0;

        public c(@NonNull Preference preference) {
            this.f22315p0 = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.f22315p0;
            CharSequence summary = preference.getSummary();
            if (!preference.isCopyingEnabled() || TextUtils.isEmpty(summary)) {
                return;
            }
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.f22315p0;
            ClipboardManager clipboardManager = (ClipboardManager) preference.getContext().getSystemService("clipboard");
            CharSequence summary = preference.getSummary();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", summary));
            Toast.makeText(preference.getContext(), preference.getContext().getString(R.string.preference_copied, summary), 0).show();
            return true;
        }
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this.f22311w0 = Integer.MAX_VALUE;
        this.f22312x0 = 0;
        this.L0 = true;
        this.M0 = true;
        this.O0 = true;
        this.R0 = true;
        this.S0 = true;
        this.T0 = true;
        this.U0 = true;
        this.V0 = true;
        this.X0 = true;
        this.f22294a1 = true;
        int i12 = R.layout.preference;
        this.f22295b1 = i12;
        this.f22304k1 = new a();
        this.f22305p0 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i10, i11);
        this.F0 = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
        this.H0 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.Preference_key, R.styleable.Preference_android_key);
        this.f22313y0 = TypedArrayUtils.getText(typedArrayObtainStyledAttributes, R.styleable.Preference_title, R.styleable.Preference_android_title);
        this.E0 = TypedArrayUtils.getText(typedArrayObtainStyledAttributes, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        this.f22311w0 = TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, R.styleable.Preference_order, R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.J0 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
        this.f22295b1 = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, R.styleable.Preference_layout, R.styleable.Preference_android_layout, i12);
        this.f22296c1 = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        this.L0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
        this.M0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
        this.O0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
        this.P0 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
        int i13 = R.styleable.Preference_allowDividerAbove;
        this.U0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i13, i13, this.M0);
        int i14 = R.styleable.Preference_allowDividerBelow;
        this.V0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i14, i14, this.M0);
        int i15 = R.styleable.Preference_defaultValue;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.Q0 = onGetDefaultValue(typedArrayObtainStyledAttributes, i15);
        } else {
            int i16 = R.styleable.Preference_android_defaultValue;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                this.Q0 = onGetDefaultValue(typedArrayObtainStyledAttributes, i16);
            }
        }
        this.f22294a1 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
        int i17 = R.styleable.Preference_singleLineTitle;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i17);
        this.W0 = zHasValue;
        if (zHasValue) {
            this.X0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i17, R.styleable.Preference_android_singleLineTitle, true);
        }
        this.Y0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.Preference_iconSpaceReserved, R.styleable.Preference_android_iconSpaceReserved, false);
        int i18 = R.styleable.Preference_isPreferenceVisible;
        this.T0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i18, i18, true);
        int i19 = R.styleable.Preference_enableCopying;
        this.Z0 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i19, i19, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(@NonNull View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                c(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public long a() {
        return this.f22308s0;
    }

    public final void b() {
        if (TextUtils.isEmpty(this.P0)) {
            return;
        }
        Preference preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(this.P0);
        if (preferenceFindPreferenceInHierarchy != null) {
            if (preferenceFindPreferenceInHierarchy.f22298e1 == null) {
                preferenceFindPreferenceInHierarchy.f22298e1 = new ArrayList();
            }
            preferenceFindPreferenceInHierarchy.f22298e1.add(this);
            onDependencyChanged(preferenceFindPreferenceInHierarchy, preferenceFindPreferenceInHierarchy.shouldDisableDependents());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.P0 + "\" not found for preference \"" + this.H0 + "\" (title: \"" + ((Object) this.f22313y0) + "\"");
    }

    public boolean callChangeListener(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.f22310u0;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.onPreferenceChange(this, obj);
    }

    public final void d(@NonNull SharedPreferences.Editor editor) {
        if (!this.f22306q0.f22399f) {
            editor.apply();
        }
    }

    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.H0)) == null) {
            return;
        }
        this.f22301h1 = false;
        onRestoreInstanceState(parcelable);
        if (!this.f22301h1) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        if (hasKey()) {
            this.f22301h1 = false;
            Parcelable parcelableOnSaveInstanceState = onSaveInstanceState();
            if (!this.f22301h1) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableOnSaveInstanceState != null) {
                bundle.putParcelable(this.H0, parcelableOnSaveInstanceState);
            }
        }
    }

    public final void e() {
        Preference preferenceFindPreferenceInHierarchy;
        ArrayList arrayList;
        String str = this.P0;
        if (str == null || (preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null || (arrayList = preferenceFindPreferenceInHierarchy.f22298e1) == null) {
            return;
        }
        arrayList.remove(this);
    }

    @Nullable
    public <T extends Preference> T findPreferenceInHierarchy(@NonNull String str) {
        PreferenceManager preferenceManager = this.f22306q0;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(str);
    }

    @NonNull
    public Context getContext() {
        return this.f22305p0;
    }

    @Nullable
    public String getDependency() {
        return this.P0;
    }

    @NonNull
    public Bundle getExtras() {
        if (this.K0 == null) {
            this.K0 = new Bundle();
        }
        return this.K0;
    }

    @Nullable
    public String getFragment() {
        return this.J0;
    }

    @Nullable
    public Drawable getIcon() {
        int i10;
        if (this.G0 == null && (i10 = this.F0) != 0) {
            this.G0 = AppCompatResources.getDrawable(this.f22305p0, i10);
        }
        return this.G0;
    }

    @Nullable
    public Intent getIntent() {
        return this.I0;
    }

    public String getKey() {
        return this.H0;
    }

    public final int getLayoutResource() {
        return this.f22295b1;
    }

    @Nullable
    public OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.f22310u0;
    }

    @Nullable
    public OnPreferenceClickListener getOnPreferenceClickListener() {
        return this.v0;
    }

    public int getOrder() {
        return this.f22311w0;
    }

    @Nullable
    public PreferenceGroup getParent() {
        return this.f22299f1;
    }

    public boolean getPersistedBoolean(boolean z10) {
        if (!shouldPersist()) {
            return z10;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getBoolean(this.H0, z10) : this.f22306q0.getSharedPreferences().getBoolean(this.H0, z10);
    }

    public float getPersistedFloat(float f6) {
        if (!shouldPersist()) {
            return f6;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getFloat(this.H0, f6) : this.f22306q0.getSharedPreferences().getFloat(this.H0, f6);
    }

    public int getPersistedInt(int i10) {
        if (!shouldPersist()) {
            return i10;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getInt(this.H0, i10) : this.f22306q0.getSharedPreferences().getInt(this.H0, i10);
    }

    public long getPersistedLong(long j10) {
        if (!shouldPersist()) {
            return j10;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getLong(this.H0, j10) : this.f22306q0.getSharedPreferences().getLong(this.H0, j10);
    }

    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getString(this.H0, str) : this.f22306q0.getSharedPreferences().getString(this.H0, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        return preferenceDataStore != null ? preferenceDataStore.getStringSet(this.H0, set) : this.f22306q0.getSharedPreferences().getStringSet(this.H0, set);
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        PreferenceDataStore preferenceDataStore = this.f22307r0;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        PreferenceManager preferenceManager = this.f22306q0;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public PreferenceManager getPreferenceManager() {
        return this.f22306q0;
    }

    @Nullable
    public SharedPreferences getSharedPreferences() {
        if (this.f22306q0 == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.f22306q0.getSharedPreferences();
    }

    public boolean getShouldDisableView() {
        return this.f22294a1;
    }

    @Nullable
    public CharSequence getSummary() {
        return getSummaryProvider() != null ? getSummaryProvider().provideSummary(this) : this.E0;
    }

    @Nullable
    public final SummaryProvider getSummaryProvider() {
        return this.f22303j1;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.f22313y0;
    }

    public final int getWidgetLayoutResource() {
        return this.f22296c1;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.H0);
    }

    public boolean isCopyingEnabled() {
        return this.Z0;
    }

    public boolean isEnabled() {
        return this.L0 && this.R0 && this.S0;
    }

    public boolean isIconSpaceReserved() {
        return this.Y0;
    }

    public boolean isPersistent() {
        return this.O0;
    }

    public boolean isSelectable() {
        return this.M0;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().getPreferenceScreen()) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.X0;
    }

    public final boolean isVisible() {
        return this.T0;
    }

    public void notifyChanged() {
        b bVar = this.f22297d1;
        if (bVar != null) {
            bVar.onPreferenceChange(this);
        }
    }

    public void notifyDependencyChange(boolean z10) {
        ArrayList arrayList = this.f22298e1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) arrayList.get(i10)).onDependencyChanged(this, z10);
        }
    }

    public void notifyHierarchyChanged() {
        b bVar = this.f22297d1;
        if (bVar != null) {
            bVar.onPreferenceHierarchyChange(this);
        }
    }

    public void onAttached() {
        b();
    }

    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager) {
        this.f22306q0 = preferenceManager;
        if (!this.f22309t0) {
            this.f22308s0 = preferenceManager.c();
        }
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.Q0);
            return;
        }
        if (shouldPersist() && getSharedPreferences().contains(this.H0)) {
            onSetInitialValue(true, null);
            return;
        }
        Object obj = this.Q0;
        if (obj != null) {
            onSetInitialValue(false, obj);
        }
    }

    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        Integer numValueOf;
        View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.f22304k1);
        view.setId(this.f22312x0);
        TextView textView = (TextView) preferenceViewHolder.findViewById(android.R.id.summary);
        if (textView != null) {
            CharSequence summary = getSummary();
            if (TextUtils.isEmpty(summary)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(summary);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(android.R.id.title);
        if (textView2 != null) {
            CharSequence title = getTitle();
            if (TextUtils.isEmpty(title)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(title);
                textView2.setVisibility(0);
                if (this.W0) {
                    textView2.setSingleLine(this.X0);
                }
                if (!isSelectable() && isEnabled() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(android.R.id.icon);
        if (imageView != null) {
            int i10 = this.F0;
            if (i10 != 0 || this.G0 != null) {
                if (this.G0 == null) {
                    this.G0 = AppCompatResources.getDrawable(this.f22305p0, i10);
                }
                Drawable drawable = this.G0;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.G0 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.Y0 ? 4 : 8);
            }
        }
        View viewFindViewById = preferenceViewHolder.findViewById(R.id.icon_frame);
        if (viewFindViewById == null) {
            viewFindViewById = preferenceViewHolder.findViewById(16908350);
        }
        if (viewFindViewById != null) {
            if (this.G0 != null) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(this.Y0 ? 4 : 8);
            }
        }
        if (this.f22294a1) {
            c(view, isEnabled());
        } else {
            c(view, true);
        }
        boolean zIsSelectable = isSelectable();
        view.setFocusable(zIsSelectable);
        view.setClickable(zIsSelectable);
        preferenceViewHolder.setDividerAllowedAbove(this.U0);
        preferenceViewHolder.setDividerAllowedBelow(this.V0);
        boolean zIsCopyingEnabled = isCopyingEnabled();
        if (zIsCopyingEnabled && this.f22302i1 == null) {
            this.f22302i1 = new c(this);
        }
        view.setOnCreateContextMenuListener(zIsCopyingEnabled ? this.f22302i1 : null);
        view.setLongClickable(zIsCopyingEnabled);
        if (!zIsCopyingEnabled || zIsSelectable) {
            return;
        }
        ViewCompat.setBackground(view, null);
    }

    public void onDependencyChanged(@NonNull Preference preference, boolean z10) {
        if (this.R0 == z10) {
            this.R0 = !z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onDetached() {
        e();
        this.f22300g1 = true;
    }

    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i10) {
        return null;
    }

    public void onParentChanged(@NonNull Preference preference, boolean z10) {
        if (this.S0 == z10) {
            this.S0 = !z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onPrepareForRemoval() {
        e();
    }

    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        this.f22301h1 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        this.f22301h1 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void onSetInitialValue(@Nullable Object obj) {
    }

    @Nullable
    public Bundle peekExtras() {
        return this.K0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick(@NonNull View view) {
        performClick();
    }

    public boolean persistBoolean(boolean z10) {
        if (!shouldPersist()) {
            return false;
        }
        if (z10 == getPersistedBoolean(!z10)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putBoolean(this.H0, z10);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putBoolean(this.H0, z10);
            d(editorB);
        }
        return true;
    }

    public boolean persistFloat(float f6) {
        if (!shouldPersist()) {
            return false;
        }
        if (f6 == getPersistedFloat(Float.NaN)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putFloat(this.H0, f6);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putFloat(this.H0, f6);
            d(editorB);
        }
        return true;
    }

    public boolean persistInt(int i10) {
        if (!shouldPersist()) {
            return false;
        }
        if (i10 == getPersistedInt(~i10)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putInt(this.H0, i10);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putInt(this.H0, i10);
            d(editorB);
        }
        return true;
    }

    public boolean persistLong(long j10) {
        if (!shouldPersist()) {
            return false;
        }
        if (j10 == getPersistedLong(~j10)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putLong(this.H0, j10);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putLong(this.H0, j10);
            d(editorB);
        }
        return true;
    }

    public boolean persistString(String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putString(this.H0, str);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putString(this.H0, str);
            d(editorB);
        }
        return true;
    }

    public boolean persistStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putStringSet(this.H0, set);
        } else {
            SharedPreferences.Editor editorB = this.f22306q0.b();
            editorB.putStringSet(this.H0, set);
            d(editorB);
        }
        return true;
    }

    public void restoreHierarchyState(@NonNull Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(@NonNull Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            notifyChanged();
        }
    }

    public void setDefaultValue(Object obj) {
        this.Q0 = obj;
    }

    public void setDependency(@Nullable String str) {
        e();
        this.P0 = str;
        b();
    }

    public void setEnabled(boolean z10) {
        if (this.L0 != z10) {
            this.L0 = z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void setFragment(@Nullable String str) {
        this.J0 = str;
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.G0 != drawable) {
            this.G0 = drawable;
            this.F0 = 0;
            notifyChanged();
        }
    }

    public void setIconSpaceReserved(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            notifyChanged();
        }
    }

    public void setIntent(@Nullable Intent intent) {
        this.I0 = intent;
    }

    public void setKey(String str) {
        this.H0 = str;
        if (!this.N0 || hasKey()) {
            return;
        }
        if (TextUtils.isEmpty(this.H0)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.N0 = true;
    }

    public void setLayoutResource(int i10) {
        this.f22295b1 = i10;
    }

    public void setOnPreferenceChangeListener(@Nullable OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f22310u0 = onPreferenceChangeListener;
    }

    public void setOnPreferenceClickListener(@Nullable OnPreferenceClickListener onPreferenceClickListener) {
        this.v0 = onPreferenceClickListener;
    }

    public void setOrder(int i10) {
        if (i10 != this.f22311w0) {
            this.f22311w0 = i10;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z10) {
        this.O0 = z10;
    }

    public void setPreferenceDataStore(@Nullable PreferenceDataStore preferenceDataStore) {
        this.f22307r0 = preferenceDataStore;
    }

    public void setSelectable(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z10) {
        if (this.f22294a1 != z10) {
            this.f22294a1 = z10;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z10) {
        this.W0 = true;
        this.X0 = z10;
    }

    public void setSummary(@Nullable CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.E0, charSequence)) {
            return;
        }
        this.E0 = charSequence;
        notifyChanged();
    }

    public final void setSummaryProvider(@Nullable SummaryProvider summaryProvider) {
        this.f22303j1 = summaryProvider;
        notifyChanged();
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f22313y0)) {
            return;
        }
        this.f22313y0 = charSequence;
        notifyChanged();
    }

    public void setViewId(int i10) {
        this.f22312x0 = i10;
    }

    public final void setVisible(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            b bVar = this.f22297d1;
            if (bVar != null) {
                bVar.onPreferenceVisibilityChange(this);
            }
        }
    }

    public void setWidgetLayoutResource(int i10) {
        this.f22296c1 = i10;
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public boolean shouldPersist() {
        return this.f22306q0 != null && isPersistent() && hasKey();
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb2.append(title);
            sb2.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb2.append(summary);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Preference preference) {
        int i10 = this.f22311w0;
        int i11 = preference.f22311w0;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f22313y0;
        CharSequence charSequence2 = preference.f22313y0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f22313y0.toString());
    }

    @Deprecated
    public void onSetInitialValue(boolean z10, Object obj) {
        onSetInitialValue(obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick() {
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled() && isSelectable()) {
            onClick();
            OnPreferenceClickListener onPreferenceClickListener = this.v0;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.I0 != null) {
                    getContext().startActivity(this.I0);
                }
            }
        }
    }

    public void setTitle(int i10) {
        setTitle(this.f22305p0.getString(i10));
    }

    public void setIcon(int i10) {
        setIcon(AppCompatResources.getDrawable(this.f22305p0, i10));
        this.F0 = i10;
    }

    public void setSummary(int i10) {
        setSummary(this.f22305p0.getString(i10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager, long j10) {
        this.f22308s0 = j10;
        this.f22309t0 = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.f22309t0 = false;
        }
    }

    public void onClick() {
    }

    @CallSuper
    @Deprecated
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
