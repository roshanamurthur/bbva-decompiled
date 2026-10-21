package i4;

import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69503p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69504q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f69503p0 = i10;
        this.f69504q0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f69503p0;
        Object obj2 = this.f69504q0;
        switch (i10) {
            case 0:
                WebController webController = (WebController) obj2;
                CellsMessage cellsMessage = (CellsMessage) obj;
                String str = WebController.ID;
                webController.getClass();
                byte b10 = 0;
                WebController.b("dispatchWebMessage", CellsLoggerKt.paramOf("cellsMessage", cellsMessage));
                webController.fire(WebController.ON_WEB_MESSAGE, cellsMessage);
                String strOperation = cellsMessage.operation();
                strOperation.getClass();
                int iHashCode = strOperation.hashCode();
                if (iHashCode != -2009927795) {
                    if (iHashCode != 636883866) {
                        if (iHashCode == 1081612148 && strOperation.equals(NavigationOperations.PAGE_LOADED)) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strOperation.equals(NavigationOperations.WEB_READY)) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (!strOperation.equals(NavigationOperations.PAGE_UNLOADED)) {
                    b10 = -1;
                }
                InternalWebView internalWebView = webController.f27055b;
                if (b10 == 0) {
                    internalWebView.routeUnloaded(cellsMessage.route());
                    webController.a(WebController.ON_PAGE_UNLOADED_CHANNEL, cellsMessage.route());
                    break;
                } else if (b10 == 1) {
                    webController.fire(WebController.ON_WEB_READY);
                    webController.a(WebController.ON_WEB_READY_CHANNEL, null);
                    break;
                } else if (b10 == 2) {
                    internalWebView.routeLoaded(cellsMessage.route());
                    webController.a(WebController.ON_PAGE_LOADED_CHANNEL, cellsMessage.route());
                    break;
                }
                break;
            default:
                ((HeadersInterceptorDataManager) obj2).endpointsSecurityMaps = (List) obj;
                break;
        }
    }
}
