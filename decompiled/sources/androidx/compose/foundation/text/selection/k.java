package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function0<Offset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f6484q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TextFieldSelectionManager textFieldSelectionManager, MutableState<IntSize> mutableState) {
        super(0);
        this.f6483p0 = textFieldSelectionManager;
        this.f6484q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Offset invoke() {
        return Offset.m2264boximpl(TextFieldSelectionManagerKt.m648calculateSelectionMagnifierCenterAndroidO0kMr_c(this.f6483p0, this.f6484q0.getValue().getF18319a()));
    }
}
