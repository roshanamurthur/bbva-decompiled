package d9;

import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.ExpandableViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.noknok.android.client.utils.ConfirmationActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68137p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68138q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f68139r0;

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f68137p0 = i10;
        this.f68138q0 = obj;
        this.f68139r0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f68137p0;
        Object obj = this.f68139r0;
        Object obj2 = this.f68138q0;
        switch (i10) {
            case 0:
                Function1 onExpandClick = (Function1) obj2;
                OptionData optionData = (OptionData) obj;
                int i11 = ExpandableViewHolder.f32415r0;
                Intrinsics.checkNotNullParameter(onExpandClick, "$onExpandClick");
                Intrinsics.checkNotNullParameter(optionData, "$optionData");
                onExpandClick.invoke(optionData);
                break;
            default:
                ((ConfirmationActivity) obj2).a((AlertDialog) obj, view);
                break;
        }
    }
}
