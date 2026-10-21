package com.bbva.glomohybrid.infoscreen.webView.force.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bbva.glomohybrid.infoscreen.webView.force.WebViewForceUpdateContract;
import com.bbva.glomohybrid.infoscreen.webView.force.domain.usecase.GetWebViewStoreUrlUseCase;
import h9.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebViewForceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/viewmodel/WebViewForceUpdateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Intent;", "intent", "", "setIntent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event;", "r0", "Lkotlinx/coroutines/flow/Flow;", "getEvent", "()Lkotlinx/coroutines/flow/Flow;", "event", "Lcom/bbva/glomohybrid/infoscreen/webView/force/domain/usecase/GetWebViewStoreUrlUseCase;", "webViewStoreUrlUseCase", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/webView/force/domain/usecase/GetWebViewStoreUrlUseCase;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class WebViewForceUpdateViewModel extends ViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final GetWebViewStoreUrlUseCase f32503p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Channel<WebViewForceUpdateContract.Event> f32504q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<WebViewForceUpdateContract.Event> event;

    public WebViewForceUpdateViewModel(@NotNull GetWebViewStoreUrlUseCase webViewStoreUrlUseCase) {
        Intrinsics.checkNotNullParameter(webViewStoreUrlUseCase, "webViewStoreUrlUseCase");
        this.f32503p0 = webViewStoreUrlUseCase;
        Channel<WebViewForceUpdateContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f32504q0 = channelChannel$default;
        this.event = FlowKt.receiveAsFlow(channelChannel$default);
    }

    @NotNull
    public final Flow<WebViewForceUpdateContract.Event> getEvent() {
        return this.event;
    }

    public final void setIntent(@NotNull WebViewForceUpdateContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent, WebViewForceUpdateContract.Intent.PositiveButtonTap.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(this, null), 3, null);
        }
    }
}
