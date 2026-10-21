package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* JADX INFO: loaded from: classes.dex */
public class GridReference extends HelperReference {
    public GridCore O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public float X;
    public String Y;
    public String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f19091a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f19092b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f19093c0;

    public GridReference(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        if (helper == State.Helper.ROW) {
            this.U = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.V = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        this.O.setOrientation(this.T);
        int i10 = this.U;
        if (i10 != 0) {
            this.O.setRows(i10);
        }
        int i11 = this.V;
        if (i11 != 0) {
            this.O.setColumns(i11);
        }
        float f6 = this.W;
        if (f6 != 0.0f) {
            this.O.setHorizontalGaps(f6);
        }
        float f10 = this.X;
        if (f10 != 0.0f) {
            this.O.setVerticalGaps(f10);
        }
        String str = this.Y;
        if (str != null && !str.isEmpty()) {
            this.O.setRowWeights(this.Y);
        }
        String str2 = this.Z;
        if (str2 != null && !str2.isEmpty()) {
            this.O.setColumnWeights(this.Z);
        }
        String str3 = this.f19091a0;
        if (str3 != null && !str3.isEmpty()) {
            this.O.setSpans(this.f19091a0);
        }
        String str4 = this.f19092b0;
        if (str4 != null && !str4.isEmpty()) {
            this.O.setSkips(this.f19092b0);
        }
        this.O.setFlags(this.f19093c0);
        this.O.setPaddingStart(this.P);
        this.O.setPaddingEnd(this.Q);
        this.O.setPaddingTop(this.R);
        this.O.setPaddingBottom(this.S);
        applyBase();
    }

    @Nullable
    public String getColumnWeights() {
        return this.Z;
    }

    public int getColumnsSet() {
        return this.V;
    }

    public int getFlags() {
        return this.f19093c0;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    @NonNull
    public HelperWidget getHelperWidget() {
        if (this.O == null) {
            this.O = new GridCore();
        }
        return this.O;
    }

    public float getHorizontalGaps() {
        return this.W;
    }

    public int getOrientation() {
        return this.T;
    }

    public int getPaddingBottom() {
        return this.S;
    }

    public int getPaddingEnd() {
        return this.Q;
    }

    public int getPaddingStart() {
        return this.P;
    }

    public int getPaddingTop() {
        return this.R;
    }

    @Nullable
    public String getRowWeights() {
        return this.Y;
    }

    public int getRowsSet() {
        return this.U;
    }

    @Nullable
    public String getSkips() {
        return this.f19092b0;
    }

    @Nullable
    public String getSpans() {
        return this.f19091a0;
    }

    public float getVerticalGaps() {
        return this.X;
    }

    public void setColumnWeights(@NonNull String str) {
        this.Z = str;
    }

    public void setColumnsSet(int i10) {
        if (super.getType() == State.Helper.ROW) {
            return;
        }
        this.V = i10;
    }

    public void setFlags(int i10) {
        this.f19093c0 = i10;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(@Nullable HelperWidget helperWidget) {
        if (helperWidget instanceof GridCore) {
            this.O = (GridCore) helperWidget;
        } else {
            this.O = null;
        }
    }

    public void setHorizontalGaps(float f6) {
        this.W = f6;
    }

    public void setOrientation(int i10) {
        this.T = i10;
    }

    public void setPaddingBottom(int i10) {
        this.S = i10;
    }

    public void setPaddingEnd(int i10) {
        this.Q = i10;
    }

    public void setPaddingStart(int i10) {
        this.P = i10;
    }

    public void setPaddingTop(int i10) {
        this.R = i10;
    }

    public void setRowWeights(@NonNull String str) {
        this.Y = str;
    }

    public void setRowsSet(int i10) {
        if (super.getType() == State.Helper.COLUMN) {
            return;
        }
        this.U = i10;
    }

    public void setSkips(@NonNull String str) {
        this.f19092b0 = str;
    }

    public void setSpans(@NonNull String str) {
        this.f19091a0 = str;
    }

    public void setVerticalGaps(float f6) {
        this.X = f6;
    }

    public void setFlags(@NonNull String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.f19093c0 = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("subgridbycolrow")) {
                this.f19093c0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.f19093c0 |= 2;
            }
        }
    }
}
