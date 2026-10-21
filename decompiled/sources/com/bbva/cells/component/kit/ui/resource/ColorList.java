package com.bbva.cells.component.kit.ui.resource;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ColorList implements ColorStable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26703a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26704b = new ArrayList();

    public ColorList(int i10) {
        setEnable(i10);
    }

    public void setChecked(int i10) {
        this.f26703a.add(Integer.valueOf(i10));
        this.f26704b.add(new int[]{R.attr.state_checked});
    }

    public void setDisable(int i10) {
        this.f26703a.add(Integer.valueOf(i10));
        this.f26704b.add(new int[]{-16842910});
    }

    public void setEnable(int i10) {
        this.f26703a.add(Integer.valueOf(i10));
        this.f26704b.add(new int[]{R.attr.state_enabled});
    }

    public void setPressed(int i10) {
        this.f26703a.add(Integer.valueOf(i10));
        this.f26704b.add(new int[]{R.attr.state_pressed});
    }

    public void setUnchecked(int i10) {
        this.f26703a.add(Integer.valueOf(i10));
        this.f26704b.add(new int[]{-16842912});
    }

    @Override // com.bbva.cells.component.kit.ui.resource.ColorStable
    public ColorStateList toColorStateList(Context context) {
        ArrayList arrayList = this.f26704b;
        int size = arrayList.size();
        int[][] iArr = new int[size][];
        ArrayList arrayList2 = this.f26703a;
        int size2 = arrayList2.size();
        int[] iArr2 = new int[size2];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = (int[]) arrayList.get(i10);
        }
        for (int i11 = 0; i11 < size2; i11++) {
            iArr2[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public ColorList(int i10, int i11) {
        setEnable(i10);
        setDisable(i11);
    }

    public ColorList(int i10, int i11, int i12, int i13, int i14) {
        setEnable(i10);
        setDisable(i11);
        setChecked(i12);
        setUnchecked(i13);
        setPressed(i14);
    }
}
