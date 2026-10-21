package u4;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.filefetcher.datamanager.FileFetcherDataManager;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93718p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DataManager f93719q0;

    public /* synthetic */ a(DataManager dataManager, int i10) {
        this.f93718p0 = i10;
        this.f93719q0 = dataManager;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f93718p0;
        DataManager dataManager = this.f93719q0;
        switch (i10) {
            case 0:
                ((AnonymousInterceptorDataManager) dataManager).whiteList = (List) obj;
                break;
            default:
                ((FileFetcherDataManager) dataManager).headers = (HashMap) obj;
                break;
        }
    }
}
