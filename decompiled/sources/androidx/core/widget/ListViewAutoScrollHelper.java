package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    public final ListView M0;

    public ListViewAutoScrollHelper(@NonNull ListView listView) {
        super(listView);
        this.M0 = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int i10) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int i10) {
        ListView listView = this.M0;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int i10, int i11) {
        ListViewCompat.scrollListBy(this.M0, i11);
    }
}
