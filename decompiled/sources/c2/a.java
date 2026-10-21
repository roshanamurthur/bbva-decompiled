package c2;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25344p0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25344p0) {
            case 0:
                return Integer.parseInt(((String) obj).split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)[0]) - Integer.parseInt(((String) obj2).split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)[0]);
            default:
                Charset charset = CrashlyticsReportPersistence.f48278e;
                String name = ((File) obj).getName();
                int i10 = CrashlyticsReportPersistence.f48279f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
        }
    }
}
