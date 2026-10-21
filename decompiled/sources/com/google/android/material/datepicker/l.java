package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f44583a = w.i(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f44584b = w.i(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44585c;

    public l(MaterialCalendar materialCalendar) {
        this.f44585c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f44585c;
            for (Pair<Long, Long> pair : materialCalendar.f44476q0.getSelectedRanges()) {
                Long l6 = pair.first;
                if (l6 != null && pair.second != null) {
                    long jLongValue = l6.longValue();
                    Calendar calendar = this.f44583a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = pair.second.longValue();
                    Calendar calendar2 = this.f44584b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i10 = calendar.get(1) - yearGridAdapter.f44549p0.f44477r0.f44456p0.f44523r0;
                    int i11 = calendar2.get(1) - yearGridAdapter.f44549p0.f44477r0.f44456p0.f44523r0;
                    View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i10);
                    View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i11);
                    int spanCount = i10 / gridLayoutManager.getSpanCount();
                    int spanCount2 = i11 / gridLayoutManager.getSpanCount();
                    for (int i12 = spanCount; i12 <= spanCount2; i12++) {
                        View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i12);
                        if (viewFindViewByPosition3 != null) {
                            int top = viewFindViewByPosition3.getTop() + materialCalendar.v0.f44560d.f44551a.top;
                            int bottom = viewFindViewByPosition3.getBottom() - materialCalendar.v0.f44560d.f44551a.bottom;
                            canvas.drawRect((i12 != spanCount || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft(), top, (i12 != spanCount2 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft(), bottom, materialCalendar.v0.f44564h);
                        }
                    }
                }
            }
        }
    }
}
