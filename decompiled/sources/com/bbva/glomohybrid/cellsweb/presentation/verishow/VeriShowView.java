package com.bbva.glomohybrid.cellsweb.presentation.verishow;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.HearingDisabilitiesComponent;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.channels.HearingDisabilitiesChannels;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.enums.VeriShowStatus;
import com.bbva.networkmonitor.lib.NetworkExtensionsKt;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VeriShowView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0003CDEB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0006\u0010/\u001a\u00020,J\u000e\u00100\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u00101\u001a\u00020,J\u0006\u00102\u001a\u00020,J\u0016\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J\u0006\u00106\u001a\u00020,J\b\u00107\u001a\u00020\u0004H\u0016J\u0006\u00108\u001a\u00020,J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\rH\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J\u0015\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020=H\u0000¢\u0006\u0002\b@J\u0006\u0010A\u001a\u00020,J\u0006\u0010B\u001a\u00020,R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010%\u001a\u00020&X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006F"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/VeriShowView;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "Lcom/bbva/glomohybrid/base/HearingDisabilitiesComponent;", "url", "", "context", "Landroid/content/Context;", "messageDispatcher", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "(Ljava/lang/String;Landroid/content/Context;Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "mainActivity", "Landroidx/appcompat/app/AppCompatActivity;", "mainView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getMainView", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setMainView", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "payloadVeriShow", "getPayloadVeriShow", "()Ljava/lang/String;", "setPayloadVeriShow", "(Ljava/lang/String;)V", "videoCallAgentSuccess", "", "getVideoCallAgentSuccess", "()Z", "setVideoCallAgentSuccess", "(Z)V", "videoCallNotAvailableAgent", "getVideoCallNotAvailableAgent", "setVideoCallNotAvailableAgent", "videoCallRejection", "getVideoCallRejection", "setVideoCallRejection", "webViewVeriShow", "Landroid/webkit/WebView;", "getWebViewVeriShow", "()Landroid/webkit/WebView;", "setWebViewVeriShow", "(Landroid/webkit/WebView;)V", "addViewAsComponent", "", "pageId", "", "closeScreenTimer", "configWebViewForVeriShow", "configureWebViewSettings", "configureWebViewVerishow", "evaluateJavascript", "functionName", "params", "finishSessionVeriShow", "getId", "getNetworkStatusDisabilityVideocallChannel", "initialize", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "launchStatusEvaluation", "status", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/enums/VeriShowStatus;", "valuateStatus", "verishowStatus", "valuateStatus$CellsWeb_mexicoRelease", "volumeSounds", "waitingTimeIsOver", "Companion", "VeriShowJavascriptInteractions", "VeriShowWebViewClient", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VeriShowView extends ReactiveComponent implements HearingDisabilitiesComponent {

    @NotNull
    public static final String ID = "VeriShowView";

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineScope coroutineScope;
    private AppCompatActivity mainActivity;
    public CoordinatorLayout mainView;

    @NotNull
    private final MessageDispatcher messageDispatcher;
    public String payloadVeriShow;

    @NotNull
    private final String url;
    private boolean videoCallAgentSuccess;
    private boolean videoCallNotAvailableAgent;
    private boolean videoCallRejection;
    public WebView webViewVeriShow;

    /* JADX INFO: compiled from: VeriShowView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/VeriShowView$VeriShowJavascriptInteractions;", "", "(Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/VeriShowView;)V", "vsAgentsAvailable", "", "vsAgentsUnavailable", "vsAppReady", "vsSessionClosed", "vsSessionFailed", ErrorBundle.DETAIL_ENTRY, "vsSessionStarted", "vsSessionSuccess", "vsValidationError", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class VeriShowJavascriptInteractions {
        public VeriShowJavascriptInteractions() {
        }

        @JavascriptInterface
        @NotNull
        public final String vsAgentsAvailable() {
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsAgentsUnavailable() {
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_NOT_AVAILABLE_AGENT);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsAppReady() {
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_APP_READY);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsSessionClosed() {
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_CLOSED_SESSION);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsSessionFailed(@NotNull String details) {
            Intrinsics.checkNotNullParameter(details, "details");
            VeriShowView.this.launchStatusEvaluation(!TextUtils.isEmpty(details) ? VeriShowStatus.VIDEOCALL_REJECTION_CAUSE : VeriShowStatus.VIDEOCALL_AGENT_REJECTION);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsSessionStarted() {
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_STARTED);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsSessionSuccess() {
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_AGENT_SUCCESS);
            return "";
        }

        @JavascriptInterface
        @NotNull
        public final String vsValidationError(@NotNull String details) {
            Intrinsics.checkNotNullParameter(details, "details");
            VeriShowView.this.launchStatusEvaluation(VeriShowStatus.VIDEOCALL_VALIDATION_ERROR);
            return "";
        }
    }

    /* JADX INFO: compiled from: VeriShowView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/VeriShowView$VeriShowWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/VeriShowView;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class VeriShowWebViewClient extends WebViewClient {
        public VeriShowWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.verishow.VeriShowView$launchStatusEvaluation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VeriShowView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.verishow.VeriShowView$launchStatusEvaluation$1", f = "VeriShowView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C05661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VeriShowStatus $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05661(VeriShowStatus veriShowStatus, Continuation<? super C05661> continuation) {
            super(2, continuation);
            this.$status = veriShowStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VeriShowView.this.new C05661(this.$status, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VeriShowView.this.valuateStatus$CellsWeb_mexicoRelease(this.$status);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C05661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VeriShowView(@NotNull String url, @NotNull Context context, @NotNull MessageDispatcher messageDispatcher) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        this.url = url;
        this.context = context;
        this.messageDispatcher = messageDispatcher;
        this.coroutineScope = CoroutineScopeKt.MainScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchStatusEvaluation(VeriShowStatus status) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getMain(), null, new C05661(status, null), 2, null);
    }

    @Override // com.bbva.glomohybrid.base.HearingDisabilitiesComponent
    public void addViewAsComponent(int pageId) {
        ComponentManager.addComponentToPage(pageId, getF32219p0(), this);
    }

    public final void closeScreenTimer() {
        finishSessionVeriShow();
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        String name = HearingDisabilitiesChannels.INSTANCE.getDisabilityVideocallVerishowLogout().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        messageDispatcher.sendMessage(name, HearingDisabilitiesConstants.EXIT_VIDEO_CALL);
    }

    public final void configWebViewForVeriShow(@NotNull String payloadVeriShow) {
        Intrinsics.checkNotNullParameter(payloadVeriShow, "payloadVeriShow");
        setPayloadVeriShow(payloadVeriShow);
        setWebViewVeriShow(new WebView(this.context));
        configureWebViewVerishow();
        configureWebViewSettings();
        getWebViewVeriShow().setWebChromeClient(new WebChromeClient() { // from class: com.bbva.glomohybrid.cellsweb.presentation.verishow.VeriShowView.configWebViewForVeriShow.1
            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(@Nullable PermissionRequest request) {
                if (request != null) {
                    request.grant(request.getResources());
                }
                VeriShowView.this.getWebViewVeriShow().setVisibility(0);
            }
        });
        getWebViewVeriShow().setWebViewClient(new VeriShowWebViewClient());
        getWebViewVeriShow().addJavascriptInterface(new VeriShowJavascriptInteractions(), "NativeInterface");
        getWebViewVeriShow().loadUrl(this.url);
    }

    public final void configureWebViewSettings() {
        WebSettings settings = getWebViewVeriShow().getSettings();
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setSupportZoom(true);
        settings.setSupportMultipleWindows(true);
        getWebViewVeriShow().clearCache(true);
    }

    public final void configureWebViewVerishow() {
        getWebViewVeriShow().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AppCompatActivity appCompatActivity = this.mainActivity;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainActivity");
            appCompatActivity = null;
        }
        View viewFindViewById = appCompatActivity.findViewById(R.id.coordinatorLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setMainView((CoordinatorLayout) viewFindViewById);
        getMainView().addView(getWebViewVeriShow());
        getWebViewVeriShow().setVisibility(8);
    }

    public final void evaluateJavascript(@NotNull String functionName, @NotNull String params) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(params, "params");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(functionName);
        k.e(sb2, " && ", functionName, "(", params);
        sb2.append(")");
        getWebViewVeriShow().evaluateJavascript(sb2.toString(), null);
    }

    public final void finishSessionVeriShow() {
        getWebViewVeriShow().clearCache(true);
        getWebViewVeriShow().clearHistory();
        getWebViewVeriShow().destroy();
        getMainView().removeView(getWebViewVeriShow());
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @NotNull
    public final CoordinatorLayout getMainView() {
        CoordinatorLayout coordinatorLayout = this.mainView;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainView");
        return null;
    }

    public final void getNetworkStatusDisabilityVideocallChannel() {
        if (NetworkExtensionsKt.isInternetConnected(NetworkExtensionsKt.connectivityManager(this.context))) {
            MessageDispatcher messageDispatcher = this.messageDispatcher;
            String name = HearingDisabilitiesChannels.INSTANCE.getDisabilityVideocallStatusNetworkChannel().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, "success");
            return;
        }
        MessageDispatcher messageDispatcher2 = this.messageDispatcher;
        String name2 = HearingDisabilitiesChannels.INSTANCE.getDisabilityVideocallStatusNetworkChannel().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        messageDispatcher2.sendMessage(name2, "error");
    }

    @NotNull
    public final String getPayloadVeriShow() {
        String str = this.payloadVeriShow;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payloadVeriShow");
        return null;
    }

    public final boolean getVideoCallAgentSuccess() {
        return this.videoCallAgentSuccess;
    }

    public final boolean getVideoCallNotAvailableAgent() {
        return this.videoCallNotAvailableAgent;
    }

    public final boolean getVideoCallRejection() {
        return this.videoCallRejection;
    }

    @NotNull
    public final WebView getWebViewVeriShow() {
        WebView webView = this.webViewVeriShow;
        if (webView != null) {
            return webView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webViewVeriShow");
        return null;
    }

    @Override // com.bbva.glomohybrid.base.HearingDisabilitiesComponent
    public void initialize(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.mainActivity = activity;
    }

    public final void setMainView(@NotNull CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.mainView = coordinatorLayout;
    }

    public final void setPayloadVeriShow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payloadVeriShow = str;
    }

    public final void setVideoCallAgentSuccess(boolean z10) {
        this.videoCallAgentSuccess = z10;
    }

    public final void setVideoCallNotAvailableAgent(boolean z10) {
        this.videoCallNotAvailableAgent = z10;
    }

    public final void setVideoCallRejection(boolean z10) {
        this.videoCallRejection = z10;
    }

    public final void setWebViewVeriShow(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<set-?>");
        this.webViewVeriShow = webView;
    }

    public final void valuateStatus$CellsWeb_mexicoRelease(@NotNull VeriShowStatus verishowStatus) {
        Intrinsics.checkNotNullParameter(verishowStatus, "verishowStatus");
        int status = verishowStatus.getStatus();
        if (status == VeriShowStatus.VIDEOCALL_NOT_AVAILABLE_AGENT.getStatus()) {
            this.videoCallNotAvailableAgent = true;
            return;
        }
        if (status == VeriShowStatus.VIDEOCALL_STARTED.getStatus()) {
            getWebViewVeriShow().setVisibility(0);
            volumeSounds();
            MessageDispatcher messageDispatcher = this.messageDispatcher;
            String name = HearingDisabilitiesChannels.INSTANCE.getDisabilityVideocallVerishowLogout().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, HearingDisabilitiesConstants.CLOSE_MODAL);
            this.videoCallAgentSuccess = true;
            return;
        }
        if (status == VeriShowStatus.VIDEOCALL_APP_READY.getStatus()) {
            evaluateJavascript("openVeriShowSession", getPayloadVeriShow());
            return;
        }
        if (status == VeriShowStatus.VIDEOCALL_VALIDATION_ERROR.getStatus()) {
            finishSessionVeriShow();
            return;
        }
        if (status != VeriShowStatus.VIDEOCALL_CLOSED_SESSION.getStatus()) {
            if (status == VeriShowStatus.VIDEOCALL_REJECTION_CAUSE.getStatus()) {
                getWebViewVeriShow().evaluateJavascript("Wrapper.updateAdditionalInfo('estatus','D');", null);
                this.videoCallRejection = true;
                return;
            }
            return;
        }
        if (this.videoCallAgentSuccess && this.videoCallRejection) {
            MessageDispatcher messageDispatcher2 = this.messageDispatcher;
            String name2 = HearingDisabilitiesChannels.INSTANCE.getDisabilityVideocallVerishowLogout().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            messageDispatcher2.sendMessage(name2, "logout");
            finishSessionVeriShow();
        }
    }

    public final void volumeSounds() {
        AppCompatActivity appCompatActivity = this.mainActivity;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainActivity");
            appCompatActivity = null;
        }
        appCompatActivity.setVolumeControlStream(3);
        Object systemService = this.context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).adjustStreamVolume(3, 1, 1);
    }

    public final void waitingTimeIsOver() {
        finishSessionVeriShow();
    }
}
