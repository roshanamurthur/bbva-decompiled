package com.bbva.ethermobilesdk.pinning.work;

import android.content.Context;
import com.bbva.ethermobilesdk.EtherPinningFactory;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.ethermobilesdk.pinning.provider.site.storage.SharedPropertyStorage;
import com.bbva.ethermobilesdk.pinning.update.CatalogUpdater;
import ek.a;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0019\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J+\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/work/UpdateManager;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "config", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "forceUpdate", "", "providerType", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "schedule", "intervalInSeconds", "", "(Ljava/lang/Long;)V", "update", "immediate", "", "(Ljava/lang/Long;Z)V", "updateCatalog", "(Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Ljava/lang/Long;Z)V", "updateIfNeeded", "propertiesStorage", "Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/SharedPropertyStorage;", "(Ljava/lang/Long;Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/SharedPropertyStorage;)V", "Companion", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdateManager implements CoroutineScope {
    private static final long DEFAULT_REPEAT_INTERVAL = TimeUnit.HOURS.toMillis(1);
    private final /* synthetic */ CoroutineScope $$delegate_0;

    @NotNull
    private final PinningConfig config;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.pinning.work.UpdateManager$updateCatalog$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdateManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.bbva.ethermobilesdk.pinning.work.UpdateManager$updateCatalog$1", f = "UpdateManager.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $immediate;
        final /* synthetic */ Long $intervalInSeconds;
        final /* synthetic */ ProviderType $providerType;
        int label;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.pinning.work.UpdateManager$updateCatalog$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: UpdateManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.bbva.ethermobilesdk.pinning.work.UpdateManager$updateCatalog$1$1", f = "UpdateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $immediate;
            final /* synthetic */ Long $intervalInSeconds;
            final /* synthetic */ ProviderType $providerType;
            int label;
            final /* synthetic */ UpdateManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01281(UpdateManager updateManager, ProviderType providerType, boolean z10, Long l6, Continuation<? super C01281> continuation) {
                super(2, continuation);
                this.this$0 = updateManager;
                this.$providerType = providerType;
                this.$immediate = z10;
                this.$intervalInSeconds = l6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C01281(this.this$0, this.$providerType, this.$immediate, this.$intervalInSeconds, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object obj2 = UpdateManagerKt.updateLock;
                UpdateManager updateManager = this.this$0;
                ProviderType providerType = this.$providerType;
                boolean z10 = this.$immediate;
                Long l6 = this.$intervalInSeconds;
                synchronized (obj2) {
                    try {
                        SharedPropertyStorage sharedPropertyStorage = new SharedPropertyStorage(updateManager.context, providerType.getProperties());
                        if (z10) {
                            updateManager.forceUpdate(providerType);
                            sharedPropertyStorage.setLastUpdate(System.currentTimeMillis());
                        } else {
                            updateManager.updateIfNeeded(l6, providerType, sharedPropertyStorage);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C01281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProviderType providerType, boolean z10, Long l6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$providerType = providerType;
            this.$immediate = z10;
            this.$intervalInSeconds = l6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpdateManager.this.new AnonymousClass1(this.$providerType, this.$immediate, this.$intervalInSeconds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C01281 c01281 = new C01281(UpdateManager.this, this.$providerType, this.$immediate, this.$intervalInSeconds, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c01281, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public UpdateManager(@NotNull Context context, @NotNull PinningConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.context = context;
        this.config = config;
        this.$$delegate_0 = CoroutineScopeKt.MainScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceUpdate(ProviderType providerType) {
        new CatalogUpdater(providerType, new EtherPinningFactory(this.context, this.config.getId(), this.config.getMode(), this.config.getFallbackFile(), false, 16, null).createPinningVerifier()).updateCatalog();
    }

    public static /* synthetic */ void schedule$default(UpdateManager updateManager, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = null;
        }
        updateManager.schedule(l6);
    }

    public static /* synthetic */ void update$default(UpdateManager updateManager, Long l6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        updateManager.update(l6, z10);
    }

    private final void updateCatalog(ProviderType providerType, Long intervalInSeconds, boolean immediate) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(providerType, immediate, intervalInSeconds, null), 3, null);
    }

    public static /* synthetic */ void updateCatalog$default(UpdateManager updateManager, ProviderType providerType, Long l6, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l6 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        updateManager.updateCatalog(providerType, l6, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIfNeeded(Long intervalInSeconds, ProviderType providerType, SharedPropertyStorage propertiesStorage) {
        Long lValueOf;
        long jLongValue;
        if (intervalInSeconds != null) {
            try {
                lValueOf = Long.valueOf(intervalInSeconds.longValue() * ((long) 1000));
            } catch (Throwable th2) {
                LoggerKt.logError("There was a problem configuring the catalog update.", th2);
                return;
            }
        } else {
            lValueOf = null;
        }
        String updateThreshold = propertiesStorage.getUpdateThreshold();
        Long lValueOf2 = updateThreshold != null ? Long.valueOf(Long.parseLong(updateThreshold) * ((long) 1000)) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : DEFAULT_REPEAT_INTERVAL;
        }
        long j10 = DEFAULT_REPEAT_INTERVAL;
        if (jLongValue < j10) {
            jLongValue = j10;
        }
        long lastUpdate = propertiesStorage.getLastUpdate();
        long jCurrentTimeMillis = System.currentTimeMillis() - lastUpdate;
        if (lastUpdate == 0 || jCurrentTimeMillis > jLongValue) {
            forceUpdate(providerType);
            propertiesStorage.setLastUpdate(System.currentTimeMillis());
        }
    }

    public static /* synthetic */ void updateIfNeeded$default(UpdateManager updateManager, Long l6, ProviderType providerType, SharedPropertyStorage sharedPropertyStorage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = null;
        }
        updateManager.updateIfNeeded(l6, providerType, sharedPropertyStorage);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Deprecated(message = "This method is deprecated use the [update] method instead.", replaceWith = @ReplaceWith(expression = "update(intervalInSeconds)", imports = {}))
    public final void schedule(@Nullable Long intervalInSeconds) {
        update$default(this, intervalInSeconds, false, 2, null);
    }

    public final void update(@Nullable Long intervalInSeconds, boolean immediate) {
        updateCatalog(ProviderType.APP_PROVIDER, intervalInSeconds, immediate);
        if (this.config.getMode() != PinningGlobalEnvironment.NONE) {
            updateCatalog$default(this, ProviderType.INTERNAL_PROVIDER, intervalInSeconds, false, 4, null);
        }
    }
}
