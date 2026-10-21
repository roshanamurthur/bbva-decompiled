package e4;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.ic.security.SecurityDataManager;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68273p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68274q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f68273p0 = i10;
        this.f68274q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f68273p0;
        Object obj2 = this.f68274q0;
        switch (i10) {
            case 0:
                ((UseCase.UseCaseSuccessCallback) obj2).onUseCaseComplete(obj);
                break;
            default:
                ((SecurityDataManager) obj2).setUnauthorizedCode((Map) obj);
                break;
        }
    }
}
