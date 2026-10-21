package com.bbva.bridge.dispatcher;

import androidx.annotation.VisibleForTesting;
import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.cellscore.web.WebController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebMessageDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/bbva/bridge/dispatcher/WebMessageDispatcher;", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "Lcom/bbva/bridge/WebAwareComponent;", "Lcom/bbva/bridge/webcontroller/WebState;", "state", "", "onWebReady", "", "isReady", "", "channelName", "notifyEvent", "Lcom/bbva/bridge/dispatcher/WebMessage;", "webMessage", "sendMessage", "", "b", "Ljava/util/List;", "getInternalQueue", "()Ljava/util/List;", "getInternalQueue$annotations", "()V", "internalQueue", "Lkotlinx/coroutines/flow/StateFlow;", "d", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/cellscore/web/WebController;", "webController", "<init>", "(Lcom/bbva/cellscore/web/WebController;)V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebMessageDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebMessageDispatcher.kt\ncom/bbva/bridge/dispatcher/WebMessageDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
@ExperimentalCoroutinesApi
public final class WebMessageDispatcher implements MessageDispatcher, WebAwareComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebController f26611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f26612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<WebState> f26613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f26614d;

    public WebMessageDispatcher(@NotNull WebController webController) {
        Intrinsics.checkNotNullParameter(webController, "webController");
        this.f26611a = webController;
        this.f26612b = new ArrayList();
        MutableStateFlow<WebState> MutableStateFlow = StateFlowKt.MutableStateFlow(WebState.IDLE);
        this.f26613c = MutableStateFlow;
        this.f26614d = MutableStateFlow;
    }

    @NotNull
    public final List<WebMessage> getInternalQueue() {
        return this.f26612b;
    }

    @Override // com.bbva.bridge.dispatcher.MessageDispatcher
    @NotNull
    public StateFlow<WebState> getState() {
        return this.f26614d;
    }

    @Override // com.bbva.bridge.dispatcher.MessageDispatcher
    public boolean isReady() {
        return getState().getValue() == WebState.READY;
    }

    @Override // com.bbva.bridge.dispatcher.MessageDispatcher
    public void notifyEvent(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        String str = isReady() ? channelName : null;
        if (str != null) {
            this.f26611a.sendMessageToWeb(channelName, (Object) null);
        } else {
            str = null;
        }
        if (str == null) {
            this.f26612b.add(new WebMessage(channelName, null));
        }
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onPageLoaded(@NotNull String str) {
        WebAwareComponent.DefaultImpls.onPageLoaded(this, str);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onWebReady(@NotNull WebState state) {
        WebState webState;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zIsReady = isReady();
        ArrayList arrayList = this.f26612b;
        MutableStateFlow<WebState> mutableStateFlow = this.f26613c;
        if (zIsReady || state != WebState.READY) {
            if (zIsReady && state == (webState = WebState.IDLE)) {
                arrayList.clear();
                mutableStateFlow.setValue(webState);
                return;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WebMessage webMessage = (WebMessage) it.next();
            this.f26611a.sendMessageToWeb(webMessage.getChannelName(), webMessage.getPayload());
            it.remove();
        }
        mutableStateFlow.setValue(WebState.READY);
    }

    @Override // com.bbva.bridge.dispatcher.MessageDispatcher
    public void sendMessage(@NotNull String str, @NotNull Object obj) {
        MessageDispatcher.DefaultImpls.sendMessage(this, str, obj);
    }

    @Override // com.bbva.bridge.dispatcher.MessageDispatcher
    public void sendMessage(@NotNull WebMessage webMessage) {
        Intrinsics.checkNotNullParameter(webMessage, "webMessage");
        String channelName = webMessage.getChannelName();
        Object payload = webMessage.getPayload();
        String str = null;
        String str2 = isReady() ? channelName : null;
        if (str2 != null) {
            this.f26611a.sendMessageToWeb(channelName, payload);
            str = str2;
        }
        if (str == null) {
            this.f26612b.add(webMessage);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getInternalQueue$annotations() {
    }
}
