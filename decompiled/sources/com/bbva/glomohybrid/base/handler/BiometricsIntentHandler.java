package com.bbva.glomohybrid.base.handler;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.ui.biometrics.BiometricResult;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricsIntentHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent;", "r0", "Lkotlinx/coroutines/flow/Flow;", "getIntent", "()Lkotlinx/coroutines/flow/Flow;", "intent", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "pageId", "<init>", "(I)V", "Companion", "Intent", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class BiometricsIntentHandler implements CoroutineScope {

    @NotNull
    public static final String ID = "biometrics";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f31388p0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Channel<Intent> f31389q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<Intent> intent;

    /* JADX INFO: compiled from: BiometricsIntentHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent;", "", "()V", "AccessDenied", "AccessGranted", "Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent$AccessDenied;", "Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent$AccessGranted;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: BiometricsIntentHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent$AccessDenied;", "Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AccessDenied extends Intent {

            @NotNull
            public static final AccessDenied INSTANCE = new AccessDenied();

            public AccessDenied() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: BiometricsIntentHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent$AccessGranted;", "Lcom/bbva/glomohybrid/base/handler/BiometricsIntentHandler$Intent;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AccessGranted extends Intent {

            @NotNull
            public static final AccessGranted INSTANCE = new AccessGranted();

            public AccessGranted() {
                super(null);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BiometricsIntentHandler(int i10) {
        Channel<Intent> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f31389q0 = channelChannel$default;
        this.intent = FlowKt.consumeAsFlow(channelChannel$default);
        BiometricsComponent biometricsComponent = (BiometricsComponent) ComponentManager.get(i10, ID);
        if (biometricsComponent != null) {
            biometricsComponent.addOnEventListener(new ReactiveComponent.ActionSpecListener() { // from class: com.bbva.glomohybrid.base.handler.BiometricsIntentHandler.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bbva.cells.component.kit.common.ReactiveComponent.ActionSpecListener
                public <T> void onEvent(@NotNull String id, @NotNull ActionSpec<T> action, T payload) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(action, "action");
                    BiometricResult biometricResult = payload instanceof BiometricResult ? (BiometricResult) payload : null;
                    if (biometricResult == null || Intrinsics.areEqual(biometricResult, BiometricResult.Failed.INSTANCE)) {
                        return;
                    }
                    boolean zAreEqual = Intrinsics.areEqual(biometricResult, BiometricResult.Success.INSTANCE);
                    BiometricsIntentHandler biometricsIntentHandler = BiometricsIntentHandler.this;
                    if (zAreEqual) {
                        BiometricsIntentHandler.access$handleBiometricsSuccess(biometricsIntentHandler);
                    } else if (biometricResult instanceof BiometricResult.Error) {
                        BiometricsIntentHandler.access$handleBiometricsError(biometricsIntentHandler, (BiometricResult.Error) biometricResult);
                    }
                }
            });
        }
    }

    public static final void access$handleBiometricsError(BiometricsIntentHandler biometricsIntentHandler, BiometricResult.Error error) {
        biometricsIntentHandler.getClass();
        Intent intent = Intent.AccessGranted.INSTANCE;
        if (error.getCode() != 1 && error.getCode() != 11) {
            intent = null;
        }
        if (intent == null) {
            intent = Intent.AccessDenied.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(biometricsIntentHandler, null, null, new a(biometricsIntentHandler, intent, null), 3, null);
    }

    public static final void access$handleBiometricsSuccess(BiometricsIntentHandler biometricsIntentHandler) {
        biometricsIntentHandler.getClass();
        BuildersKt__Builders_commonKt.launch$default(biometricsIntentHandler, null, null, new b(biometricsIntentHandler, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f31388p0.getCoroutineContext();
    }

    @NotNull
    public final Flow<Intent> getIntent() {
        return this.intent;
    }
}
