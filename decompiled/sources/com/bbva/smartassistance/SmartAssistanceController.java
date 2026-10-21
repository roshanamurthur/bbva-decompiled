package com.bbva.smartassistance;

import android.content.Context;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.smartassistance.constants.SmartAssistanceConstants;
import com.bbva.smartassistance.flags.SmartAssistanceFlag;
import com.bbva.smartassistance.listeners.CustomBaseConversation;
import com.bbva.smartassistance.listeners.CustomBaseConversationListener;
import com.bbva.smartassistance.listeners.CustomBaseSessionListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import net.ipsoft.amelia.sdk.AmeliaChatBuilder;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.DomainSelectionMode;
import net.ipsoft.amelia.sdk.IAmeliaChat;
import net.ipsoft.amelia.sdk.SpeechParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmartAssistanceController.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/bbva/smartassistance/SmartAssistanceController;", "", "", "baseURL", "ameliaEmail", "ameliaKey", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "rememberedUser", "token", "Lcom/bbva/smartassistance/listeners/CustomBaseConversationListener;", "baseConversationListener", "Lcom/bbva/smartassistance/listeners/CustomBaseSessionListener;", "baseSessionListener", "", "initializeAmeliaChat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomo/user/domain/model/RememberedUser;Ljava/lang/String;Lcom/bbva/smartassistance/listeners/CustomBaseConversationListener;Lcom/bbva/smartassistance/listeners/CustomBaseSessionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "question", "ask", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/smartassistance/flags/SmartAssistanceFlag;", "flag", "reloadFlags", "(Lcom/bbva/smartassistance/flags/SmartAssistanceFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/smartassistance/listeners/CustomBaseConversation;", "baseConversation", "<init>", "(Landroid/content/Context;Lcom/bbva/smartassistance/listeners/CustomBaseConversation;)V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
public final class SmartAssistanceController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CustomBaseConversation f36792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IAmeliaChat f36793c;

    /* JADX INFO: compiled from: SmartAssistanceController.kt */
    @DebugMetadata(c = "com.bbva.smartassistance.SmartAssistanceController$ask$2", f = "SmartAssistanceController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36795q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36795q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmartAssistanceController.this.new a(this.f36795q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BaseConversation baseConversation;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SmartAssistanceController smartAssistanceController = SmartAssistanceController.this;
            IAmeliaChat iAmeliaChat = smartAssistanceController.f36793c;
            if (iAmeliaChat == null || (baseConversation = smartAssistanceController.f36792b.getBaseConversation()) == null) {
                return null;
            }
            iAmeliaChat.ask(baseConversation, this.f36795q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SmartAssistanceController.kt */
    @DebugMetadata(c = "com.bbva.smartassistance.SmartAssistanceController$logout$2", f = "SmartAssistanceController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmartAssistanceController.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SmartAssistanceController smartAssistanceController = SmartAssistanceController.this;
            IAmeliaChat iAmeliaChat = smartAssistanceController.f36793c;
            if (iAmeliaChat == null) {
                return null;
            }
            iAmeliaChat.endConversation(smartAssistanceController.f36792b.getBaseConversation());
            smartAssistanceController.f36793c = null;
            smartAssistanceController.f36792b.setBaseConversation(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SmartAssistanceController.kt */
    @DebugMetadata(c = "com.bbva.smartassistance.SmartAssistanceController$reloadFlags$2", f = "SmartAssistanceController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SmartAssistanceFlag f36798q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SmartAssistanceFlag smartAssistanceFlag, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f36798q0 = smartAssistanceFlag;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmartAssistanceController.this.new c(this.f36798q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CustomBaseSessionListener customBaseSessionListenerAccess$getBaseSessionListener$p = SmartAssistanceController.access$getBaseSessionListener$p(SmartAssistanceController.this);
            if (customBaseSessionListenerAccess$getBaseSessionListener$p == null) {
                return null;
            }
            SmartAssistanceFlag smartAssistanceFlag = this.f36798q0;
            customBaseSessionListenerAccess$getBaseSessionListener$p.reloadFlags(smartAssistanceFlag.getIsFirstTimeDigital(), smartAssistanceFlag.getIsFirstTimePhysical());
            return Unit.INSTANCE;
        }
    }

    public SmartAssistanceController(@NotNull Context context, @NotNull CustomBaseConversation baseConversation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseConversation, "baseConversation");
        this.f36791a = context;
        this.f36792b = baseConversation;
    }

    public static final Object access$createSession(SmartAssistanceController smartAssistanceController, CustomBaseSessionListener customBaseSessionListener, Continuation continuation) {
        smartAssistanceController.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new ec.a(smartAssistanceController, customBaseSessionListener, null), continuation);
    }

    public static final /* synthetic */ CustomBaseSessionListener access$getBaseSessionListener$p(SmartAssistanceController smartAssistanceController) {
        smartAssistanceController.getClass();
        return null;
    }

    @Nullable
    public final Object ask(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(str, null), continuation);
    }

    @Nullable
    public final Object initializeAmeliaChat(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable RememberedUser rememberedUser, @NotNull String str4, @NotNull CustomBaseConversationListener customBaseConversationListener, @NotNull CustomBaseSessionListener customBaseSessionListener, @NotNull Continuation<? super Unit> continuation) {
        customBaseSessionListener.setAttributesToDoLogin(rememberedUser, str2, str3, str4);
        this.f36793c = new AmeliaChatBuilder().setContext(this.f36791a).setBaseUrl(str).setDomainSelectionMode(DomainSelectionMode.predefined).setIgnoreCertificateErrors(true).setConnectTimeoutMs(30000).setReadTimeoutMs(30000).setWriteTimeoutMs(30000).setSpeechParams(new SpeechParams(true)).setDomainCode(SmartAssistanceConstants.AMELIA_DOMAIN).addConversationListener(customBaseConversationListener).build();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ec.a(this, customBaseSessionListener, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object logout(@NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(null), continuation);
    }

    @Nullable
    public final Object reloadFlags(@NotNull SmartAssistanceFlag smartAssistanceFlag, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(smartAssistanceFlag, null), continuation);
    }
}
