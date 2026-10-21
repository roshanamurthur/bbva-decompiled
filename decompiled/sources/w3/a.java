package w3;

import android.widget.EditText;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DialogInputExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function1<MaterialDialog, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ EditText f94132p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CharSequence f94133q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditText editText, CharSequence charSequence) {
        super(1);
        this.f94132p0 = editText;
        this.f94133q0 = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MaterialDialog materialDialog) {
        this.f94132p0.setSelection(this.f94133q0.length());
        return Unit.INSTANCE;
    }
}
