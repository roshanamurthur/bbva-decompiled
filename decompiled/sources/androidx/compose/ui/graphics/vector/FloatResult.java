package androidx.compose.ui.graphics.vector;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FastFloatParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/FloatResult;", "", "", "a", "F", "getValue", "()F", "setValue", "(F)V", "value", "", "b", "Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "()Z", "setValid", "(Z)V", "<init>", "(FZ)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class FloatResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isValid;

    public FloatResult() {
        this(0.0f, false, 3, null);
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final void setValid(boolean z10) {
        this.isValid = z10;
    }

    public final void setValue(float f6) {
        this.value = f6;
    }

    public FloatResult(float f6, boolean z10) {
        this.value = f6;
        this.isValid = z10;
    }

    public /* synthetic */ FloatResult(float f6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Float.NaN : f6, (i10 & 2) != 0 ? false : z10);
    }
}
