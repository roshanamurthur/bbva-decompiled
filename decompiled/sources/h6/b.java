package h6;

import android.content.DialogInterface;
import com.bbva.datepicker.DefaultDatePicker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: DefaultDatePicker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0 f69353p0;

    public b(DefaultDatePicker.a aVar) {
        this.f69353p0 = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f69353p0.invoke();
    }
}
