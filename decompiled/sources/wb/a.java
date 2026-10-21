package wb;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.s1;
import com.bbva.showinfo.databinding.LayoutTooltipBinding;
import com.bbva.showinfo.generator.InfoTooltipGenerator;
import com.bbva.ui.widget.BbvaStrictButton;
import com.noknok.android.client.utils.TryFidoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94191p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94192q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f94193r0;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f94191p0 = i10;
        this.f94192q0 = obj;
        this.f94193r0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94191p0;
        Object obj = this.f94193r0;
        Object obj2 = this.f94192q0;
        switch (i10) {
            case 0:
                LayoutTooltipBinding tooltipBinding = (LayoutTooltipBinding) obj2;
                PopupWindow tooltipWindow = (PopupWindow) obj;
                InfoTooltipGenerator infoTooltipGenerator = InfoTooltipGenerator.INSTANCE;
                Intrinsics.checkNotNullParameter(tooltipBinding, "$tooltipBinding");
                Intrinsics.checkNotNullParameter(tooltipWindow, "$tooltipWindow");
                Function0<Unit> function0 = InfoTooltipGenerator.f36478a;
                if (function0 != null) {
                    function0.invoke();
                }
                tooltipBinding.getRoot().animate().alpha(0.0f).setDuration(300L).withEndAction(new s1(tooltipWindow, 4));
                break;
            case 1:
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                BbvaStrictButton this$0 = (BbvaStrictButton) obj;
                BbvaStrictButton.Companion companion = BbvaStrictButton.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (onClickListener != null) {
                    onClickListener.onClick(this$0);
                }
                this$0.setEnabled(false);
                new Handler(Looper.getMainLooper()).postDelayed(new s1(this$0, 5), 600L);
                break;
            default:
                ((TryFidoActivity) obj2).b((AlertDialog) obj, view);
                break;
        }
    }
}
