package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TableLayoutBindingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f20603a = Pattern.compile("\\s*,\\s*");

    public static SparseBooleanArray a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : f20603a.split(charSequence)) {
            try {
                int i10 = Integer.parseInt(str);
                if (i10 >= 0) {
                    sparseBooleanArray.put(i10, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        for (int i10 = 0; i10 < 20; i10++) {
            boolean z10 = sparseBooleanArrayA.get(i10, false);
            if (z10 != tableLayout.isColumnCollapsed(i10)) {
                tableLayout.setColumnCollapsed(i10, z10);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        int size = sparseBooleanArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseBooleanArrayA.keyAt(i10);
            boolean zValueAt = sparseBooleanArrayA.valueAt(i10);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(iKeyAt, zValueAt);
            }
        }
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        int size = sparseBooleanArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseBooleanArrayA.keyAt(i10);
            boolean zValueAt = sparseBooleanArrayA.valueAt(i10);
            if (zValueAt) {
                tableLayout.setColumnStretchable(iKeyAt, zValueAt);
            }
        }
    }
}
