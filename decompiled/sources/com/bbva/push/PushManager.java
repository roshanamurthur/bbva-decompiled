package com.bbva.push;

import android.content.Context;
import com.bbva.push.bus.PushBus;
import com.bbva.push.exception.HandlerNotFound;
import com.bbva.push.executor.PushExecutor;
import com.bbva.push.handler.LocalHandler;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import com.bbva.push.model.TokenResult;
import com.bbva.push.source.PushSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import nb.c;
import nb.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\b\u0000\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0013\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\f\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\r\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bJ$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014J)\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\bJ\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0014R\u0014\u0010#\u001a\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/bbva/push/PushManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function1;", "Lcom/bbva/push/model/TokenResult;", "", "callback", "requestToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addObserveTokenUpdates", "removeTokenUpdatesObserver", "Lcom/bbva/push/model/Push;", "addObserveNewPushes", "removePushObserver", "", "getCachedPushes", "Lcom/bbva/push/handler/PushHandler;", "handler", "addPushHandler", "handlerId", "", "", "configuration", "configure", "getConfiguration", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/push/inbox/Inbox;", "inbox", "Lcom/bbva/push/model/NotificationOptions;", "notification", "data", "sendLocalPush", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Lcom/bbva/push/PushManagerBuilder;", "builder", "<init>", "(Landroid/content/Context;Lcom/bbva/push/PushManagerBuilder;)V", "Companion", "push_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1743#2,3:272\n1851#2,2:275\n223#2,2:278\n766#2:280\n857#2,2:281\n1851#2,2:283\n223#2,2:285\n223#2,2:287\n1#3:277\n*S KotlinDebug\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager\n*L\n53#1:272,3\n171#1:275,2\n189#1:278,2\n202#1:280\n202#1:281,2\n209#1:283,2\n221#1:285,2\n236#1:287,2\n*E\n"})
public final class PushManager implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final NotificationChannel E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f36187p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final PushExecutor f36189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final List<PushHandler> f36190s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final List<PushSource> f36191t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final ArrayList f36192u0;

    @NotNull
    public final ArrayList v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final ArrayList f36193w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f36194x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f36195y0;

    /* JADX INFO: compiled from: PushManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/bbva/push/PushManager$Companion;", "", "()V", "single", "Lcom/bbva/push/PushManager;", "context", "Landroid/content/Context;", "pushExecutor", "Lcom/bbva/push/executor/PushExecutor;", "defaultChannel", "Lcom/bbva/push/model/NotificationChannel;", "block", "Lkotlin/Function1;", "Lcom/bbva/push/PushManagerBuilder;", "", "Lkotlin/ExtensionFunctionType;", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PushManager single(@NotNull Context context, @NotNull PushExecutor pushExecutor, @NotNull NotificationChannel defaultChannel, @NotNull Function1<? super PushManagerBuilder, Unit> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pushExecutor, "pushExecutor");
            Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
            Intrinsics.checkNotNullParameter(block, "block");
            PushManagerBuilder pushManagerBuilder = new PushManagerBuilder(pushExecutor, defaultChannel);
            block.invoke(pushManagerBuilder);
            return pushManagerBuilder.build(context);
        }
    }

    /* JADX INFO: compiled from: PushManager.kt */
    @DebugMetadata(c = "com.bbva.push.PushManager", f = "PushManager.kt", i = {}, l = {222}, m = "getConfiguration", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f36196p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f36198r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36196p0 = obj;
            this.f36198r0 |= Integer.MIN_VALUE;
            return PushManager.this.getConfiguration(null, this);
        }
    }

    /* JADX INFO: compiled from: PushManager.kt */
    public static final class b extends Lambda implements Function1<TokenResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<TokenResult> f36199p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SafeContinuation safeContinuation) {
            super(1);
            this.f36199p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TokenResult tokenResult) {
            TokenResult it = tokenResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f36199p0.resumeWith(Result.m5535constructorimpl(it));
            return Unit.INSTANCE;
        }
    }

    public PushManager(@NotNull Context context, @NotNull PushManagerBuilder builder) {
        List<PushHandler> handlers$push_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f36187p0 = context;
        this.f36188q0 = CoroutineScopeKt.MainScope();
        this.f36192u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.f36193w0 = new ArrayList();
        this.f36189r0 = builder.getPushExecutor();
        List<PushHandler> handlers$push_release2 = builder.getHandlers$push_release();
        if (!(handlers$push_release2 instanceof Collection) || !handlers$push_release2.isEmpty()) {
            Iterator<T> it = handlers$push_release2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((PushHandler) it.next()).getId(), "local")) {
                        handlers$push_release = builder.getHandlers$push_release();
                        break;
                    }
                } else {
                    handlers$push_release = CollectionsKt___CollectionsKt.toMutableList((Collection) builder.getHandlers$push_release());
                    handlers$push_release.add(0, new LocalHandler());
                    break;
                }
            }
        } else {
            handlers$push_release = CollectionsKt___CollectionsKt.toMutableList((Collection) builder.getHandlers$push_release());
            handlers$push_release.add(0, new LocalHandler());
            break;
        }
        this.f36190s0 = handlers$push_release;
        List<PushSource> sources$push_release = builder.getSources$push_release();
        this.f36191t0 = sources$push_release;
        this.f36194x0 = builder.getCacheCapacity();
        this.f36195y0 = builder.getDefaultIcon();
        this.E0 = builder.getDefaultChannel();
        PushBus pushBus = PushBus.INSTANCE;
        pushBus.observeTokenUpdates(new d(this));
        pushBus.observeNewPushes(new c(this));
        for (PushSource pushSource : sources$push_release) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new nb.a(pushSource, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new nb.b(pushSource, null), 3, null);
        }
    }

    public static final void access$addPushToCache(PushManager pushManager, Push push) {
        ArrayList arrayList = pushManager.f36193w0;
        arrayList.add(push);
        if (arrayList.size() > pushManager.f36194x0) {
            arrayList.remove(0);
        }
    }

    public final void addObserveNewPushes(@NotNull Function1<? super Push, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.v0.add(callback);
    }

    public final void addObserveTokenUpdates(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36192u0.add(callback);
    }

    public final void addPushHandler(@NotNull PushHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f36190s0.add(0, handler);
    }

    public final void configure(@NotNull String handlerId, @NotNull Map<String, ? extends Object> configuration) throws HandlerNotFound {
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        List<PushHandler> list = this.f36190s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((PushHandler) obj).getId(), handlerId)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw HandlerNotFound.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PushHandler) it.next()).configure(configuration);
        }
    }

    @NotNull
    public final List<Push> getCachedPushes() {
        return CollectionsKt___CollectionsKt.toList(this.f36193w0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getConfiguration(@NotNull String str, @NotNull Continuation<? super Map<String, ? extends Object>> continuation) throws HandlerNotFound {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f36198r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36198r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object configuration = aVar.f36196p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f36198r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(configuration);
                for (Object obj : this.f36190s0) {
                    if (Intrinsics.areEqual(((PushHandler) obj).getId(), str)) {
                        aVar.f36198r0 = 1;
                        configuration = ((PushHandler) obj).getConfiguration(aVar);
                        if (configuration == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(configuration);
            return (Map) configuration;
        } catch (NoSuchElementException unused) {
            throw HandlerNotFound.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36188q0.getCoroutineContext();
    }

    @NotNull
    public final PushHandler handler(@NotNull String handlerId) throws HandlerNotFound {
        Object objM5535constructorimpl;
        Object next;
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = this.f36190s0.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((PushHandler) next).getId(), handlerId));
            objM5535constructorimpl = Result.m5535constructorimpl((PushHandler) next);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return (PushHandler) objM5535constructorimpl;
        }
        throw HandlerNotFound.INSTANCE;
    }

    @NotNull
    public final Inbox inbox(@NotNull String handlerId) throws HandlerNotFound {
        Object objM5535constructorimpl;
        Object next;
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = this.f36190s0.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((PushHandler) next).getId(), handlerId));
            objM5535constructorimpl = Result.m5535constructorimpl(((PushHandler) next).getInbox());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return (Inbox) objM5535constructorimpl;
        }
        throw HandlerNotFound.INSTANCE;
    }

    public final void removePushObserver(@NotNull Function1<? super Push, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.v0.remove(callback);
    }

    public final void removeTokenUpdatesObserver(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36192u0.remove(callback);
    }

    public final void requestToken(@NotNull Function1<? super TokenResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36189r0.requestToken(callback);
    }

    public final void sendLocalPush(@NotNull NotificationOptions notification, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(data, "data");
        PushBus.INSTANCE.onNewPush(new Push("local", notification, data));
    }

    @Nullable
    public final Object requestToken(@NotNull Continuation<? super TokenResult> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f36189r0.requestToken(new b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
