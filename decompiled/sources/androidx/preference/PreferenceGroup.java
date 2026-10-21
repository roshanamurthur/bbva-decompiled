package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final SimpleArrayMap<String, Long> f22367l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final Handler f22368m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final ArrayList f22369n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f22370o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f22371p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f22372q1;
    public int r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public OnExpandButtonClickListener f22373s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final a f22374t1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(@NonNull Preference preference);

        int getPreferenceAdapterPosition(@NonNull String str);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22375p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f22375p0 = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22375p0);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                PreferenceGroup.this.f22367l1.clear();
            }
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22367l1 = new SimpleArrayMap<>();
        this.f22368m1 = new Handler(Looper.getMainLooper());
        this.f22370o1 = true;
        this.f22371p1 = 0;
        this.f22372q1 = false;
        this.r1 = Integer.MAX_VALUE;
        this.f22373s1 = null;
        this.f22374t1 = new a();
        this.f22369n1 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceGroup, i10, i11);
        int i12 = R.styleable.PreferenceGroup_orderingFromXml;
        this.f22370o1 = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = R.styleable.PreferenceGroup_initialExpandedChildrenCount;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setInitialExpandedChildrenCount(TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void addItemFromInflater(@NonNull Preference preference) {
        addPreference(preference);
    }

    public boolean addPreference(@NonNull Preference preference) {
        long jC;
        if (this.f22369n1.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            PreferenceGroup parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            parent.findPreference(preference.getKey());
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.f22370o1) {
                int i10 = this.f22371p1;
                this.f22371p1 = i10 + 1;
                preference.setOrder(i10);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).setOrderingAsAdded(this.f22370o1);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f22369n1, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!onPrepareAddPreference(preference)) {
            return false;
        }
        synchronized (this) {
            this.f22369n1.add(iBinarySearch, preference);
        }
        PreferenceManager preferenceManager = getPreferenceManager();
        String key = preference.getKey();
        if (key == null || !this.f22367l1.containsKey(key)) {
            jC = preferenceManager.c();
        } else {
            jC = this.f22367l1.get(key).longValue();
            this.f22367l1.remove(key);
        }
        preference.onAttachedToHierarchy(preferenceManager, jC);
        if (preference.f22299f1 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        preference.f22299f1 = this;
        if (this.f22372q1) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).dispatchSaveInstanceState(bundle);
        }
    }

    public final boolean f(@NonNull Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.onPrepareForRemoval();
                if (preference.getParent() == this) {
                    preference.f22299f1 = null;
                }
                zRemove = this.f22369n1.remove(preference);
                if (zRemove) {
                    String key = preference.getKey();
                    if (key != null) {
                        this.f22367l1.put(key, Long.valueOf(preference.a()));
                        this.f22368m1.removeCallbacks(this.f22374t1);
                        this.f22368m1.post(this.f22374t1);
                    }
                    if (this.f22372q1) {
                        preference.onDetached();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        T t10;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            PreferenceGroup preferenceGroup = (T) getPreference(i10);
            if (TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t10 = (T) preferenceGroup.findPreference(charSequence)) != null) {
                return t10;
            }
        }
        return null;
    }

    public int getInitialExpandedChildrenCount() {
        return this.r1;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OnExpandButtonClickListener getOnExpandButtonClickListener() {
        return this.f22373s1;
    }

    @NonNull
    public Preference getPreference(int i10) {
        return (Preference) this.f22369n1.get(i10);
    }

    public int getPreferenceCount() {
        return this.f22369n1.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAttached() {
        return this.f22372q1;
    }

    public boolean isOnSameScreenAsChildren() {
        return true;
    }

    public boolean isOrderingAsAdded() {
        return this.f22370o1;
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z10) {
        super.notifyDependencyChange(z10);
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onParentChanged(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.f22372q1 = true;
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.f22372q1 = false;
        int preferenceCount = getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            getPreference(i10).onDetached();
        }
    }

    public boolean onPrepareAddPreference(@NonNull Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.r1 = savedState.f22375p0;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        int i10 = this.r1;
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22375p0 = i10;
        return savedState;
    }

    public void removeAll() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f22369n1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f((Preference) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyHierarchyChanged();
    }

    public boolean removePreference(@NonNull Preference preference) {
        boolean zF = f(preference);
        notifyHierarchyChanged();
        return zF;
    }

    public boolean removePreferenceRecursively(@NonNull CharSequence charSequence) {
        Preference preferenceFindPreference = findPreference(charSequence);
        if (preferenceFindPreference == null) {
            return false;
        }
        return preferenceFindPreference.getParent().removePreference(preferenceFindPreference);
    }

    public void setInitialExpandedChildrenCount(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            hasKey();
        }
        this.r1 = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOnExpandButtonClickListener(@Nullable OnExpandButtonClickListener onExpandButtonClickListener) {
        this.f22373s1 = onExpandButtonClickListener;
    }

    public void setOrderingAsAdded(boolean z10) {
        this.f22370o1 = z10;
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
