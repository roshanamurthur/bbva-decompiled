package com.bbva.glomohybrid;

import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import com.bbva.cellscore.web.client.CellsWebChromeClient;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.base.webview.WebPermissionCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebChromeClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/WebChromeClient;", "Lcom/bbva/cellscore/web/client/CellsWebChromeClient;", "", "origin", "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "", "onGeolocationPermissionsShowPrompt", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebChromeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebChromeClient.kt\ncom/bbva/glomohybrid/WebChromeClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class WebChromeClient extends CellsWebChromeClient {
    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(@Nullable final String origin, @Nullable final GeolocationPermissions.Callback callback) {
        CellsReactor.fire(WebActions.ID, WebActions.INSTANCE.getACTION_REQUEST_LOCATION_PERMISSION(), new WebPermissionCallback() { // from class: com.bbva.glomohybrid.WebChromeClient.onGeolocationPermissionsShowPrompt.1
            @Override // com.bbva.glomohybrid.base.webview.WebPermissionCallback
            public void run(boolean granted) {
                GeolocationPermissions.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.invoke(origin, granted, false);
                }
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(@Nullable PermissionRequest request) {
        if (request != null) {
            String[] resources = request.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            if (!(!(resources.length == 0)) || !Intrinsics.areEqual(request.getResources()[0], "android.webkit.resource.VIDEO_CAPTURE")) {
                request = null;
            }
            if (request != null) {
                request.grant(request.getResources());
            }
        }
    }
}
