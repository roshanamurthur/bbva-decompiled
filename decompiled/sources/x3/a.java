package x3;

import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V, O> implements AnimatableValue<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Keyframe<V>> f94482a;

    public a(List<Keyframe<V>> list) {
        this.f94482a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<V>> getKeyframes() {
        return this.f94482a;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        List<Keyframe<V>> list = this.f94482a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && list.get(0).isStatic();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<Keyframe<V>> list = this.f94482a;
        if (!list.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(list.toArray()));
        }
        return sb2.toString();
    }
}
