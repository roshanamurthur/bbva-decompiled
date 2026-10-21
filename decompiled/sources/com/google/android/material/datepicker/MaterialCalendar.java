package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends t<S> {
    public static final /* synthetic */ int H0 = 0;
    public View E0;
    public View F0;
    public View G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @StyleRes
    public int f44475p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f44476q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f44477r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f44478s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Month f44479t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public d f44480u0;
    public com.google.android.material.datepicker.b v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public RecyclerView f44481w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public RecyclerView f44482x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public View f44483y0;

    public class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    public class b extends u {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i10, int i11) {
            super(context, i10, false);
            this.G = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int i10 = this.G;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i10 == 0) {
                iArr[0] = materialCalendar.f44482x0.getWidth();
                iArr[1] = materialCalendar.f44482x0.getWidth();
            } else {
                iArr[0] = materialCalendar.f44482x0.getHeight();
                iArr[1] = materialCalendar.f44482x0.getHeight();
            }
        }
    }

    public class c implements e {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d DAY;
        public static final d YEAR;

        static {
            d dVar = new d("DAY", 0);
            DAY = dVar;
            d dVar2 = new d("YEAR", 1);
            YEAR = dVar2;
            $VALUES = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public interface e {
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i10, @NonNull CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i10, calendarConstraints, null);
    }

    public final void a(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f44482x0.getAdapter();
        int iE = monthsPagerAdapter.f44527p0.f44456p0.e(month);
        int iE2 = iE - monthsPagerAdapter.f44527p0.f44456p0.e(this.f44479t0);
        boolean z10 = Math.abs(iE2) > 3;
        boolean z11 = iE2 > 0;
        this.f44479t0 = month;
        if (z10 && z11) {
            this.f44482x0.scrollToPosition(iE - 3);
            this.f44482x0.post(new j(this, iE));
        } else if (!z10) {
            this.f44482x0.post(new j(this, iE));
        } else {
            this.f44482x0.scrollToPosition(iE + 3);
            this.f44482x0.post(new j(this, iE));
        }
    }

    @Override // com.google.android.material.datepicker.t
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    public final void b(d dVar) {
        this.f44480u0 = dVar;
        if (dVar == d.YEAR) {
            this.f44481w0.getLayoutManager().scrollToPosition(this.f44479t0.f44523r0 - ((YearGridAdapter) this.f44481w0.getAdapter()).f44549p0.f44477r0.f44456p0.f44523r0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(8);
            this.f44483y0.setVisibility(8);
            this.E0.setVisibility(8);
            return;
        }
        if (dVar == d.DAY) {
            this.F0.setVisibility(8);
            this.G0.setVisibility(0);
            this.f44483y0.setVisibility(0);
            this.E0.setVisibility(0);
            a(this.f44479t0);
        }
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.f44476q0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f44475p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f44476q0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f44477r0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f44478s0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f44479t0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f44475p0);
        this.v0 = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f44477r0.f44456p0;
        if (MaterialDatePicker.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.google.android.material.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.google.android.material.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = r.v0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new a());
        int i13 = this.f44477r0.f44460t0;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new h(i13) : new h()));
        gridView.setNumColumns(month.f44524s0);
        gridView.setEnabled(false);
        this.f44482x0 = (RecyclerView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_months);
        this.f44482x0.setLayoutManager(new b(getContext(), i11, i11));
        this.f44482x0.setTag("MONTHS_VIEW_GROUP_TAG");
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f44476q0, this.f44477r0, this.f44478s0, new c());
        this.f44482x0.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.google.android.material.R.integer.mtrl_calendar_year_selector_span);
        int i14 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(i14);
        this.f44481w0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f44481w0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f44481w0.setAdapter(new YearGridAdapter(this));
            this.f44481w0.addItemDecoration(new l(this));
        }
        int i15 = com.google.android.material.R.id.month_navigation_fragment_toggle;
        if (viewInflate.findViewById(i15) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(i15);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new m(this));
            View viewFindViewById = viewInflate.findViewById(com.google.android.material.R.id.month_navigation_previous);
            this.f44483y0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.google.android.material.R.id.month_navigation_next);
            this.E0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.F0 = viewInflate.findViewById(i14);
            this.G0 = viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_day_selector_frame);
            b(d.DAY);
            materialButton.setText(this.f44479t0.d());
            this.f44482x0.addOnScrollListener(new n(this, monthsPagerAdapter, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.E0.setOnClickListener(new p(this, monthsPagerAdapter));
            this.f44483y0.setOnClickListener(new i(this, monthsPagerAdapter));
        }
        if (!MaterialDatePicker.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.f44482x0);
        }
        this.f44482x0.scrollToPosition(monthsPagerAdapter.f44527p0.f44456p0.e(this.f44479t0));
        ViewCompat.setAccessibilityDelegate(this.f44482x0, new k());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f44475p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f44476q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f44477r0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f44478s0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f44479t0);
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i10, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f44459s0);
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
