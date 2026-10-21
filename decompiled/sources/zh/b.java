package zh;

import com.mastercard.sonic.analytics.mixpanel.model.MixPanel;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: MixPanelFileHandling.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends Lambda implements Function2<Map.Entry<? extends String, ? extends MixPanel>, Map.Entry<? extends String, ? extends MixPanel>, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f95070p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Map.Entry<? extends String, ? extends MixPanel> entry, Map.Entry<? extends String, ? extends MixPanel> entry2) {
        return Integer.valueOf(entry.getValue().getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getStartTime().compareTo(entry2.getValue().getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getStartTime()));
    }
}
