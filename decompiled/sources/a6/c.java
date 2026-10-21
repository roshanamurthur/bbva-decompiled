package a6;

import com.bbva.cells.component.kit.common.RxComponent;
import com.bbva.component.ui.showinfo.ShowInfoSnackbar;
import com.bbva.glomohybrid.base.shortcuts.ShortcutReader;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RxComponent f208q0;

    public /* synthetic */ c(RxComponent rxComponent, int i10) {
        this.f207p0 = i10;
        this.f208q0 = rxComponent;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f207p0;
        RxComponent rxComponent = this.f208q0;
        switch (i10) {
            case 0:
                ((ShowInfoSnackbar) rxComponent).setDurationInMillis((Map) obj);
                break;
            default:
                ((ShortcutReader) rxComponent).setConfig((List) obj);
                break;
        }
    }
}
