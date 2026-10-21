package com.bbva.glomohybrid.base.deeplink;

import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.logs.LoggerKt;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeeplinkDispatcherProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u001e\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcherProvider;", "", "dispatch", "", "shortcut", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "componentId", "", "deeplink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "dispatchQrDeeplink", "qr", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sendToChannel", "channel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DeeplinkDispatcherProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31240a;

    /* JADX INFO: compiled from: DeeplinkDispatcherProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcherProvider$Companion;", "", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f31240a = new Companion();
    }

    void dispatch(@NotNull ShortcutModel shortcut);

    void dispatch(@NotNull String componentId, @NotNull DeepLinkModel deeplink);

    void dispatchQrDeeplink(@NotNull QRPayload qr);

    @NotNull
    /* JADX INFO: renamed from: scope */
    CoroutineScope getF31237a();

    /* JADX INFO: compiled from: DeeplinkDispatcherProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {

        /* JADX INFO: compiled from: DeeplinkDispatcherProvider.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider$dispatch$1", f = "DeeplinkDispatcherProvider.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f31241p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ShortcutModel f31242q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ShortcutModel shortcutModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f31242q0 = shortcutModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f31242q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f31241p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<ShortcutModel> privateShortcutChannel = CellsDeepLinkChannels.INSTANCE.getPrivateShortcutChannel();
                    this.f31241p0 = 1;
                    if (privateShortcutChannel.emit(this.f31242q0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static void dispatch(@NotNull DeeplinkDispatcherProvider deeplinkDispatcherProvider, @NotNull String componentId, @NotNull DeepLinkModel deeplink) {
            MutableSharedFlow<DeepLinkModel> deepLinkInappWebRedirection;
            Intrinsics.checkNotNullParameter(componentId, "componentId");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (DeepLinkExtensionsKt.isLinkToAtm(deeplink)) {
                deepLinkInappWebRedirection = CellsDeepLinkChannels.INSTANCE.getDeepLinkToAtm();
            } else if (DeepLinkExtensionsKt.isLinkToMgm(deeplink)) {
                deepLinkInappWebRedirection = CellsDeepLinkChannels.INSTANCE.getDeepLinkToMgm();
            } else if (DeepLinkExtensionsKt.isLGoogleAssistantDeepLink(deeplink)) {
                deepLinkInappWebRedirection = CellsDeepLinkChannels.INSTANCE.getGoogleAssistantActionChannel();
            } else if (DeepLinkExtensionsKt.isPublicManagerDeepLink(deeplink)) {
                deepLinkInappWebRedirection = CellsDeepLinkChannels.INSTANCE.getDeepLinkManagerPublic();
            } else {
                deepLinkInappWebRedirection = DeepLinkExtensionsKt.isWebAppRedirection(deeplink) ? CellsDeepLinkChannels.INSTANCE.getDeepLinkInappWebRedirection() : CellsDeepLinkChannels.INSTANCE.getDeepLinkManager();
            }
            LoggerKt.logDebug$default("[DeeplinkDispatcher]: Dispatched by " + componentId + " deeplink " + deeplink + " ", null, 2, null);
            BuildersKt__Builders_commonKt.launch$default(deeplinkDispatcherProvider.getF31237a(), null, null, new com.bbva.glomohybrid.base.deeplink.a(deepLinkInappWebRedirection, deeplink, null), 3, null);
        }

        public static void dispatch(@NotNull DeeplinkDispatcherProvider deeplinkDispatcherProvider, @NotNull ShortcutModel shortcut) {
            Intrinsics.checkNotNullParameter(shortcut, "shortcut");
            BuildersKt__Builders_commonKt.launch$default(deeplinkDispatcherProvider.getF31237a(), null, null, new a(shortcut, null), 3, null);
        }
    }
}
