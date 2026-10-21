package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* JADX INFO: loaded from: classes.dex */
public class GuidelineReference implements Facade, Reference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f19094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Guideline f19096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19097d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19098e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19099f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f19100g;

    public GuidelineReference(State state) {
        this.f19094a = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.f19096c.setOrientation(this.f19095b);
        int i10 = this.f19097d;
        if (i10 != -1) {
            this.f19096c.setGuideBegin(i10);
            return;
        }
        int i11 = this.f19098e;
        if (i11 != -1) {
            this.f19096c.setGuideEnd(i11);
        } else {
            this.f19096c.setGuidePercent(this.f19099f);
        }
    }

    public GuidelineReference end(Object obj) {
        this.f19097d = -1;
        this.f19098e = this.f19094a.convertDimension(obj);
        this.f19099f = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.f19096c == null) {
            this.f19096c = new Guideline();
        }
        return this.f19096c;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f19100g;
    }

    public int getOrientation() {
        return this.f19095b;
    }

    public GuidelineReference percent(float f6) {
        this.f19097d = -1;
        this.f19098e = -1;
        this.f19099f = f6;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.f19096c = (Guideline) constraintWidget;
        } else {
            this.f19096c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f19100g = obj;
    }

    public void setOrientation(int i10) {
        this.f19095b = i10;
    }

    public GuidelineReference start(Object obj) {
        this.f19097d = this.f19094a.convertDimension(obj);
        this.f19098e = -1;
        this.f19099f = 0.0f;
        return this;
    }
}
