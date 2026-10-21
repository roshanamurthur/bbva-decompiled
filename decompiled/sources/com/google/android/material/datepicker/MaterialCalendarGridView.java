package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Calendar f44485p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f44486q0;

    public class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    @NonNull
    public final r b() {
        return (r) super.getAdapter();
    }

    public final View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final Adapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i10;
        int width3;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        r rVar = (r) super.getAdapter();
        DateSelector<?> dateSelector = rVar.f44598q0;
        b bVar = rVar.f44600s0;
        int iMax = Math.max(rVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(rVar.c(), getLastVisiblePosition());
        Long item = rVar.getItem(iMax);
        Long item2 = rVar.getItem(iMin);
        Iterator<Pair<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l6 = next.first;
            if (l6 != null) {
                if (next.second != null) {
                    long jLongValue = l6.longValue();
                    long jLongValue2 = next.second.longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Long lValueOf2 = Long.valueOf(jLongValue2);
                    if (item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        iMax = iMax;
                        rVar = rVar;
                        it = it;
                    } else {
                        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f44485p0;
                        Month month = rVar.f44597p0;
                        if (jLongValue < jLongValue3) {
                            if (iMax % month.f44524s0 == 0) {
                                right = 0;
                            } else {
                                right = !zIsLayoutRtl ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                            }
                            width = right;
                            iA = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA = rVar.a() + (calendar.get(5) - 1);
                            View viewC = materialCalendarGridView.c(iA);
                            width = (viewC.getWidth() / 2) + viewC.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            if ((iMin + 1) % month.f44524s0 == 0) {
                                width2 = getWidth();
                            } else {
                                width2 = !zIsLayoutRtl ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                            }
                            iA2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA2 = rVar.a() + (calendar.get(5) - 1);
                            View viewC2 = materialCalendarGridView.c(iA2);
                            width2 = (viewC2.getWidth() / 2) + viewC2.getLeft();
                        }
                        int itemId = (int) rVar.getItemId(iA);
                        int itemId2 = (int) rVar.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            r rVar2 = rVar;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View viewC3 = materialCalendarGridView.c(numColumns);
                            int top = viewC3.getTop() + bVar.f44557a.f44551a.top;
                            Iterator<Pair<Long, Long>> it2 = it;
                            int bottom = viewC3.getBottom() - bVar.f44557a.f44551a.bottom;
                            if (zIsLayoutRtl) {
                                int i11 = iA2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iA ? getWidth() : width;
                                i10 = i11;
                                width3 = width4;
                            } else {
                                i10 = numColumns > iA ? 0 : width;
                                width3 = iA2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i10, top, width3, bottom, bVar.f44564h);
                            itemId++;
                            materialCalendarGridView = this;
                            iMax = iMax;
                            rVar = rVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((r) super.getAdapter()).c());
        } else if (i10 == 130) {
            setSelection(((r) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((r) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((r) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f44486q0) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < ((r) super.getAdapter()).a()) {
            super.setSelection(((r) super.getAdapter()).a());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final ListAdapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44485p0 = w.i(null);
        if (MaterialDatePicker.e(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.google.android.material.R.id.cancel_button);
            setNextFocusRightId(com.google.android.material.R.id.confirm_button);
        }
        this.f44486q0 = MaterialDatePicker.e(getContext(), com.google.android.material.R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new a());
    }
}
