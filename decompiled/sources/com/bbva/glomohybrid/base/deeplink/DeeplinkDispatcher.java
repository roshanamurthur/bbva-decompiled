package com.bbva.glomohybrid.base.deeplink;

import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeeplinkDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcher;", "Lcom/bbva/glomohybrid/base/deeplink/DeeplinkDispatcherProvider;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "qr", "", "dispatchQrDeeplink", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class DeeplinkDispatcher implements DeeplinkDispatcherProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f31237a = CoroutineScopeKt.MainScope();

    /* JADX INFO: compiled from: DeeplinkDispatcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher$dispatchQrDeeplink$1", f = "DeeplinkDispatcher.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31238p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ QRPayload f31239q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QRPayload qRPayload, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31239q0 = qRPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f31239q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31238p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<QRPayload> qrLinkChannel = CellsDeepLinkChannels.INSTANCE.getQrLinkChannel();
                this.f31238p0 = 1;
                if (qrLinkChannel.emit(this.f31239q0, this) == coroutine_suspended) {
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

    @Override // com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider
    public void dispatch(@NotNull ShortcutModel shortcutModel) {
        DeeplinkDispatcherProvider.DefaultImpls.dispatch(this, shortcutModel);
    }

    @Override // com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider
    public void dispatchQrDeeplink(@NotNull QRPayload qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        BuildersKt__Builders_commonKt.launch$default(this.f31237a, null, null, new a(qr, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider
    @NotNull
    /* JADX INFO: renamed from: scope, reason: from getter */
    public CoroutineScope getF31237a() {
        return this.f31237a;
    }

    @Override // com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider
    public void dispatch(@NotNull String str, @NotNull DeepLinkModel deepLinkModel) {
        DeeplinkDispatcherProvider.DefaultImpls.dispatch(this, str, deepLinkModel);
    }
}
