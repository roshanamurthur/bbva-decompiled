package com.bbva.cellscore.web.bridge;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.bridge.CellsWebViewManager;
import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.model.to_web.ChannelMessageDTO;
import com.bbva.cellscore.web.model.to_web.NavigationDTO;
import com.bbva.cellscore.web.model.to_web.NavigationOptions;
import com.bbva.cellscore.web.model.to_web.OnResumeDTO;
import com.bbva.cellscore.web.model.to_web.PubSubBulkDTO;
import com.bbva.cellscore.web.model.to_web.ResetDTO;
import com.bbva.cellscore.web.model.to_web.skip.SkipNavigationDTO;
import com.bbva.cellscore.web.model.to_web.skip.SkipTransitionDTO;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSender.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u000e\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003¨\u0006\u0019"}, d2 = {"Lcom/bbva/cellscore/web/bridge/WebSender;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "resume", "back", "", "route", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/cellscore/web/model/to_web/NavigationOptions;", "options", "navigateTo", "", "Lcom/bbva/cellscore/web/model/to_web/ChannelMessageDTO;", NavigationOperations.UPDATE, "Lcom/bbva/cellscore/web/model/to_web/skip/SkipTransitionDTO;", "routes", "skipNavigations", "resetWebView", "logout", "Lcom/bbva/cells/bridge/CellsWebViewManager;", "webViewManager", "<init>", "(Lcom/bbva/cells/bridge/CellsWebViewManager;)V", "Companion", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class WebSender<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CellsWebViewManager<T> f27060a;

    public WebSender(@NotNull CellsWebViewManager<T> webViewManager) {
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        this.f27060a = webViewManager;
    }

    public static /* synthetic */ void navigateTo$default(WebSender webSender, String str, Object obj, NavigationOptions navigationOptions, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            navigationOptions = null;
        }
        webSender.navigateTo(str, obj, navigationOptions);
    }

    public final void a(String str, PayloadDTO payloadDTO) {
        CellsLogger.INSTANCE.logMethod(LogModule.WebSender, "postMessage", CellsLoggerKt.paramOf("operation", str), CellsLoggerKt.jsonParamOf(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, payloadDTO));
        this.f27060a.postMessage(str, payloadDTO);
    }

    public final void back() {
        a("back", new ChannelMessageDTO(null));
    }

    public final void channels(@NotNull List<? extends ChannelMessageDTO> channels) {
        Intrinsics.checkNotNullParameter(channels, "channels");
        a(NavigationOperations.UPDATE, new PubSubBulkDTO(channels));
    }

    public final void logout() {
        a("logout", new ResetDTO());
    }

    public final void navigateTo(@NotNull String route, @Nullable Object payload, @Nullable NavigationOptions options) {
        Intrinsics.checkNotNullParameter(route, "route");
        a("nav", new NavigationDTO(route, payload, options));
    }

    public final void resetWebView() {
        a("reset-webview", new ResetDTO());
    }

    public final void resume() {
        a("back", new OnResumeDTO(true));
    }

    public final void skipNavigations(@NotNull List<? extends SkipTransitionDTO> routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        a("skip-nav", new SkipNavigationDTO(routes));
    }
}
