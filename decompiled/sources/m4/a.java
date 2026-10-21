package m4;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.web.plugin.WebPluginManager;
import com.bbva.cellscore.web.plugin.model.PluginRequestDTO;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomo.semaas.interceptor.SemaasInterceptorDataManager;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f83348p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f83349q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f83348p0 = i10;
        this.f83349q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f83348p0;
        Object obj2 = this.f83349q0;
        switch (i10) {
            case 0:
                WebPluginManager webPluginManager = (WebPluginManager) obj2;
                Pair pair = (Pair) obj;
                webPluginManager.getClass();
                String str = (String) pair.getFirst();
                PluginRequestDTO pluginRequestDTO = (PluginRequestDTO) pair.getSecond();
                WebPluginManager.a("onPluginRequest", CellsLoggerKt.paramOf("request", pluginRequestDTO));
                Plugin plugin = (Plugin) webPluginManager.f27201a.get(pluginRequestDTO.getPluginId());
                if (plugin == null && webPluginManager.f27208h.contains(pluginRequestDTO.getPluginId())) {
                    plugin = webPluginManager.f27208h.get(pluginRequestDTO.getPluginId());
                    webPluginManager.register(plugin);
                }
                if (plugin == null) {
                    webPluginManager.f27210j.send(str);
                } else {
                    plugin.execute(pluginRequestDTO.getActionId(), pluginRequestDTO.getPayload(), new CommandCallback(pluginRequestDTO.getID(), webPluginManager.f27207g));
                }
                break;
            case 1:
                ((BiometricsComponent) obj2).setConfirmationRequired(((Boolean) obj).booleanValue());
                break;
            case 2:
                ((SemaasInterceptorDataManager) obj2).headers = (Map) obj;
                break;
            default:
                ((InfoScreenComponent) obj2).setTitleLabel((Map) obj);
                break;
        }
    }
}
