package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialTextInputPicker<S> extends t<S> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @StyleRes
    public int f44517p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f44518q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f44519r0;

    public class a extends OnSelectionChangedListener<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public final void onIncompleteSelectionChanged() {
            Iterator<OnSelectionChangedListener<S>> it = MaterialTextInputPicker.this.onSelectionChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().onIncompleteSelectionChanged();
            }
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public final void onSelectionChanged(S s4) {
            Iterator<OnSelectionChangedListener<S>> it = MaterialTextInputPicker.this.onSelectionChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().onSelectionChanged(s4);
            }
        }
    }

    @NonNull
    public DateSelector<S> getDateSelector() {
        DateSelector<S> dateSelector = this.f44518q0;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f44517p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f44518q0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f44519r0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f44518q0.onCreateTextInputView(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f44517p0)), viewGroup, bundle, this.f44519r0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f44517p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f44518q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f44519r0);
    }
}
