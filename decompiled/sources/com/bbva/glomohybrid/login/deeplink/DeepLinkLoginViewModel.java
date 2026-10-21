package com.bbva.glomohybrid.login.deeplink;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.QRDeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkLoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/login/deeplink/DeepLinkLoginViewModel;", "", "configDeeplinkObservers", "", "handleMemberGetMemberLink", DeepLinkListenerAdapter.Constants.DEEP_LINK, "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "handlePublicDeepLink", "handleQrLink", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "handleQrNavigationLink", "qrDeepLinkModel", "Lcom/bbva/glomohybrid/base/models/QRDeepLinkModel;", "persistDeepLink", "persistShortcut", "shortcut", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DeepLinkLoginViewModel {
    void configDeeplinkObservers();

    void handleMemberGetMemberLink(@NotNull DeepLinkModel deepLink);

    void handlePublicDeepLink();

    void handleQrLink(@NotNull QRPayload payload);

    void handleQrNavigationLink(@NotNull QRDeepLinkModel qrDeepLinkModel);

    void persistDeepLink(@NotNull DeepLinkModel deepLink);

    void persistShortcut(@NotNull ShortcutModel shortcut);
}
