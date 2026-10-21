package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* JADX INFO: loaded from: classes.dex */
public class BarrierReference extends HelperReference {
    public State.Direction O;
    public int P;
    public Barrier Q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19090a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f19090a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19090a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19090a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19090a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19090a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19090a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        int i10 = a.f19090a[this.O.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.Q.setBarrierType(i11);
        this.Q.setMargin(this.P);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.Q == null) {
            this.Q = new Barrier();
        }
        return this.Q;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object obj) {
        margin(this.mHelperState.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(State.Direction direction) {
        this.O = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int i10) {
        this.P = i10;
        return this;
    }
}
