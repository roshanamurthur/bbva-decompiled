package d9;

import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListContract;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.OptionsViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.noknok.android.client.utils.ConfirmationActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68140p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68141q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f68142r0;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f68140p0 = i10;
        this.f68141q0 = obj;
        this.f68142r0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f68140p0;
        Object obj = this.f68142r0;
        Object obj2 = this.f68141q0;
        switch (i10) {
            case 0:
                Function1 listener = (Function1) obj2;
                OptionData optionData = (OptionData) obj;
                int i11 = OptionsViewHolder.f32420q0;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(optionData, "$optionData");
                listener.invoke(new OptionListContract.Intent.OptionSelected(optionData));
                break;
            default:
                ((ConfirmationActivity) obj2).b((AlertDialog) obj, view);
                break;
        }
    }
}
