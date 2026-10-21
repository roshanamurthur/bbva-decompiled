package e0;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f68214p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f68215q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f68216r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TextFieldSelectionManager textFieldSelectionManager, boolean z10, int i10) {
        super(2);
        this.f68214p0 = textFieldSelectionManager;
        this.f68215q0 = z10;
        this.f68216r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68216r0 | 1);
        CoreTextFieldKt.access$SelectionToolbarAndHandles(this.f68214p0, this.f68215q0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
