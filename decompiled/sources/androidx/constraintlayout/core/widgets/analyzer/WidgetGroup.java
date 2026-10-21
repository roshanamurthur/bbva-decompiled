package androidx.constraintlayout.core.widgets.analyzer;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class WidgetGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19222g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19224b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19226d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f19223a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19225c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f19227e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19228f = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ConstraintWidget> f19229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19235g;
    }

    public WidgetGroup(int i10) {
        int i11 = f19222g;
        f19222g = i11 + 1;
        this.f19224b = i11;
        this.f19226d = i10;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        ArrayList<ConstraintWidget> arrayList = this.f19223a;
        if (arrayList.contains(constraintWidget)) {
            return false;
        }
        arrayList.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.f19227e != null && this.f19225c) {
            for (int i10 = 0; i10 < this.f19227e.size(); i10++) {
                a aVar = this.f19227e.get(i10);
                ConstraintWidget constraintWidget = aVar.f19229a.get();
                if (constraintWidget != null) {
                    constraintWidget.setFinalFrame(aVar.f19230b, aVar.f19231c, aVar.f19232d, aVar.f19233e, aVar.f19234f, aVar.f19235g);
                }
            }
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.f19223a.size();
        if (this.f19228f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                WidgetGroup widgetGroup = arrayList.get(i10);
                if (this.f19228f == widgetGroup.f19224b) {
                    moveTo(this.f19226d, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.f19223a.clear();
    }

    public int getId() {
        return this.f19224b;
    }

    public int getOrientation() {
        return this.f19226d;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        int i10 = 0;
        while (true) {
            ArrayList<ConstraintWidget> arrayList = this.f19223a;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (widgetGroup.f19223a.contains(arrayList.get(i10))) {
                return true;
            }
            i10++;
        }
    }

    public boolean isAuthoritative() {
        return this.f19225c;
    }

    public int measureWrap(LinearSystem linearSystem, int i10) {
        int objectVariableValue;
        int objectVariableValue2;
        ArrayList<ConstraintWidget> arrayList = this.f19223a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).addToSolver(linearSystem, false);
        }
        if (i10 == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i10 == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e5) {
            System.err.println(e5.toString() + RootService.LINE_BREAK + Arrays.toString(e5.getStackTrace()).replace(Constant.BRACKET_OPEN, "   at ").replace(",", "\n   at").replace(Constant.BRACKET_CLOSE, ""));
        }
        this.f19227e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ConstraintWidget constraintWidget = arrayList.get(i12);
            a aVar = new a();
            aVar.f19229a = new WeakReference<>(constraintWidget);
            aVar.f19230b = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            aVar.f19231c = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            aVar.f19232d = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            aVar.f19233e = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            aVar.f19234f = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            aVar.f19235g = i10;
            this.f19227e.add(aVar);
        }
        if (i10 == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public void moveTo(int i10, WidgetGroup widgetGroup) {
        for (ConstraintWidget constraintWidget : this.f19223a) {
            widgetGroup.add(constraintWidget);
            if (i10 == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
            }
        }
        this.f19228f = widgetGroup.f19224b;
    }

    public void setAuthoritative(boolean z10) {
        this.f19225c = z10;
    }

    public void setOrientation(int i10) {
        this.f19226d = i10;
    }

    public int size() {
        return this.f19223a.size();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f19226d;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strC = androidx.appcompat.widget.a.c(sb2, this.f19224b, "] <");
        for (ConstraintWidget constraintWidget : this.f19223a) {
            StringBuilder sbE = f.e(strC, " ");
            sbE.append(constraintWidget.getDebugName());
            strC = sbE.toString();
        }
        return u.f(strC, " >");
    }
}
