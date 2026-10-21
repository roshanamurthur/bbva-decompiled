package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010 J\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016R*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector1D;", "newVector", "", FirebaseAnalytics.Param.INDEX, "", "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", SetCommand.ID, "", "toString", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "<set-?>", "a", "F", "getValue", "()F", "setValue$animation_core_release", "(F)V", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize$animation_core_release", "()I", "size", "initVal", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int size;

    public AnimationVector1D(float f6) {
        super(null);
        this.value = f6;
        this.size = 1;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof AnimationVector1D) && ((AnimationVector1D) other).value == this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: getSize$animation_core_release, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    public final void setValue$animation_core_release(float f6) {
        this.value = f6;
    }

    @NotNull
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}
