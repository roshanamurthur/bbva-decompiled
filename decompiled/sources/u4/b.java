package u4;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.header.customers.CustomerInterceptorDataManager;
import io.reactivex.functions.Consumer;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93720p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DataManager f93721q0;

    public /* synthetic */ b(DataManager dataManager, int i10) {
        this.f93720p0 = i10;
        this.f93721q0 = dataManager;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f93720p0;
        DataManager dataManager = this.f93721q0;
        switch (i10) {
            case 0:
                ((AnonymousInterceptorDataManager) dataManager).headerName = (String) obj;
                break;
            default:
                ((CustomerInterceptorDataManager) dataManager).authHeaderName = (String) obj;
                break;
        }
    }
}
