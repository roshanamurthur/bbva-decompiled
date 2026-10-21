package com.bbva.glomohybrid.base.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.QRDeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\rR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR!\u00105\u001a\b\u0012\u0004\u0012\u000201008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/CellsDeepLinkChannels;", "", "", "CELLS_DEEP_LINK_CHANNEL_NAME", "Ljava/lang/String;", "NATIVE_CAMERA_QR_READER_CHANNEL_NAME", "CELLS_DEEP_LINK_LOGIN_FLAG_CHANNEL_NAME", "GEMA_DEEP_LINK_CHANNEL_NAME", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "a", "Lkotlin/Lazy;", "getDeepLinkManager", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "deepLinkManager", "b", "getDeepLinkToAtm", "deepLinkToAtm", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "c", "getQrLinkChannel", "qrLinkChannel", "d", "getDeepLinkToMgm", "deepLinkToMgm", "e", "getGoogleAssistantActionChannel", "googleAssistantActionChannel", "f", "getDeepLinkManagerPublic", "deepLinkManagerPublic", "g", "getDeepLinkInappWebRedirection", "deepLinkInappWebRedirection", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "h", "getPrivateShortcutChannel", "privateShortcutChannel", "Lcom/bbva/cellscore/channel/model/Channel;", "i", "Lcom/bbva/cellscore/channel/model/Channel;", "getGlobalProcessingDeeplinkChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "globalProcessingDeeplinkChannel", "Lcom/bbva/glomohybrid/base/models/QRDeepLinkModel;", "j", "getQrLinkNavigationChannel", "qrLinkNavigationChannel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "k", "getWebReadyToExecuteDeeplinkFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "webReadyToExecuteDeeplinkFlow", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class CellsDeepLinkChannels {

    @NotNull
    public static final String CELLS_DEEP_LINK_CHANNEL_NAME = "global_deep_link";

    @NotNull
    public static final String GEMA_DEEP_LINK_CHANNEL_NAME = "ch_native_app_notification_config";

    @NotNull
    public static final String NATIVE_CAMERA_QR_READER_CHANNEL_NAME = "native_camera_qr_reader";

    @NotNull
    public static final CellsDeepLinkChannels INSTANCE = new CellsDeepLinkChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy deepLinkManager = LazyKt__LazyJVMKt.lazy(b.f31146p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy deepLinkToAtm = LazyKt__LazyJVMKt.lazy(d.f31148p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy qrLinkChannel = LazyKt__LazyJVMKt.lazy(h.f31152p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy deepLinkToMgm = LazyKt__LazyJVMKt.lazy(e.f31149p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy googleAssistantActionChannel = LazyKt__LazyJVMKt.lazy(f.f31150p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy deepLinkManagerPublic = LazyKt__LazyJVMKt.lazy(c.f31147p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy deepLinkInappWebRedirection = LazyKt__LazyJVMKt.lazy(a.f31145p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy privateShortcutChannel = LazyKt__LazyJVMKt.lazy(g.f31151p0);

    @NotNull
    public static final String CELLS_DEEP_LINK_LOGIN_FLAG_CHANNEL_NAME = "global_processing_deeplink";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<String> globalProcessingDeeplinkChannel = z1.b(CELLS_DEEP_LINK_LOGIN_FLAG_CHANNEL_NAME, "create(...)");

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy qrLinkNavigationChannel = LazyKt__LazyJVMKt.lazy(i.f31153p0);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy webReadyToExecuteDeeplinkFlow = LazyKt__LazyJVMKt.lazy(j.f31154p0);

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class a extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31145p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class b extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31146p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class c extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31147p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class d extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f31148p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class e extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f31149p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class f extends Lambda implements Function0<MutableSharedFlow<DeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f31150p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<DeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class g extends Lambda implements Function0<MutableSharedFlow<ShortcutModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f31151p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<ShortcutModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class h extends Lambda implements Function0<MutableSharedFlow<QRPayload>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f31152p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<QRPayload> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class i extends Lambda implements Function0<MutableSharedFlow<QRDeepLinkModel>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f31153p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableSharedFlow<QRDeepLinkModel> invoke() {
            return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: CellsDeepLinkChannels.kt */
    public static final class j extends Lambda implements Function0<MutableStateFlow<Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f31154p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableStateFlow<Boolean> invoke() {
            return StateFlowKt.MutableStateFlow(Boolean.FALSE);
        }
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getDeepLinkInappWebRedirection() {
        return (MutableSharedFlow) deepLinkInappWebRedirection.getValue();
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getDeepLinkManager() {
        return (MutableSharedFlow) deepLinkManager.getValue();
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getDeepLinkManagerPublic() {
        return (MutableSharedFlow) deepLinkManagerPublic.getValue();
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getDeepLinkToAtm() {
        return (MutableSharedFlow) deepLinkToAtm.getValue();
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getDeepLinkToMgm() {
        return (MutableSharedFlow) deepLinkToMgm.getValue();
    }

    @NotNull
    public final Channel<String> getGlobalProcessingDeeplinkChannel() {
        return globalProcessingDeeplinkChannel;
    }

    @NotNull
    public final MutableSharedFlow<DeepLinkModel> getGoogleAssistantActionChannel() {
        return (MutableSharedFlow) googleAssistantActionChannel.getValue();
    }

    @NotNull
    public final MutableSharedFlow<ShortcutModel> getPrivateShortcutChannel() {
        return (MutableSharedFlow) privateShortcutChannel.getValue();
    }

    @NotNull
    public final MutableSharedFlow<QRPayload> getQrLinkChannel() {
        return (MutableSharedFlow) qrLinkChannel.getValue();
    }

    @NotNull
    public final MutableSharedFlow<QRDeepLinkModel> getQrLinkNavigationChannel() {
        return (MutableSharedFlow) qrLinkNavigationChannel.getValue();
    }

    @NotNull
    public final MutableStateFlow<Boolean> getWebReadyToExecuteDeeplinkFlow() {
        return (MutableStateFlow) webReadyToExecuteDeeplinkFlow.getValue();
    }
}
