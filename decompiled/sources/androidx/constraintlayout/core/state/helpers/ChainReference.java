package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChainReference extends HelperReference {
    public HashMap<String, Float> O;
    public HashMap<String, Float> P;
    protected float mBias;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapPostMargin;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapPreMargin;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapWeights;

    @NonNull
    protected State.Chain mStyle;

    public ChainReference(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.mBias = 0.5f;
        this.mMapWeights = new HashMap<>();
        this.mMapPreMargin = new HashMap<>();
        this.mMapPostMargin = new HashMap<>();
        this.mStyle = State.Chain.SPREAD;
    }

    public void addChainElement(@NonNull String str, float f6, float f10, float f11) {
        addChainElement(str, f6, f10, f11, 0.0f, 0.0f);
    }

    public final float c(@NonNull String str) {
        HashMap<String, Float> map = this.P;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.P.get(str).floatValue();
    }

    public final float d(@NonNull String str) {
        HashMap<String, Float> map = this.O;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.O.get(str).floatValue();
    }

    public float getBias() {
        return this.mBias;
    }

    public float getPostMargin(@NonNull String str) {
        if (this.mMapPostMargin.containsKey(str)) {
            return this.mMapPostMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    public float getPreMargin(@NonNull String str) {
        if (this.mMapPreMargin.containsKey(str)) {
            return this.mMapPreMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    @NonNull
    public State.Chain getStyle() {
        return State.Chain.SPREAD;
    }

    public float getWeight(@NonNull String str) {
        if (this.mMapWeights.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    @NonNull
    public ChainReference style(@NonNull State.Chain chain) {
        this.mStyle = chain;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addChainElement(@NonNull Object obj, float f6, float f10, float f11, float f12, float f13) {
        super.add(obj);
        String string = obj.toString();
        if (!Float.isNaN(f6)) {
            this.mMapWeights.put(string, Float.valueOf(f6));
        }
        if (!Float.isNaN(f10)) {
            this.mMapPreMargin.put(string, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            this.mMapPostMargin.put(string, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            if (this.O == null) {
                this.O = new HashMap<>();
            }
            this.O.put(string, Float.valueOf(f12));
        }
        if (Float.isNaN(f13)) {
            return;
        }
        if (this.P == null) {
            this.P = new HashMap<>();
        }
        this.P.put(string, Float.valueOf(f13));
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    @NonNull
    public ChainReference bias(float f6) {
        this.mBias = f6;
        return this;
    }
}
