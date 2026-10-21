package com.bbva.cells.pluginkit;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cells.pluginkit.command.Command;
import com.bbva.cells.pluginkit.command.PluginTarget;
import com.bbva.cells.pluginkit.command.model.CommandResult;
import com.bbva.cells.pluginkit.command.model.PluginResult;
import com.bbva.cells.pluginkit.command.model.ResultCode;
import com.bbva.cells.pluginkit.postmessage.PostMessenger;
import com.bbva.cells.pluginkit.provider.CommandFactory;
import com.bbva.cells.pluginkit.provider.PlatformProvider;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: XPlugin.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/bbva/cells/pluginkit/XPlugin;", "Lkotlinx/coroutines/CoroutineScope;", "", "id", "action", "data", "Lcom/bbva/cells/pluginkit/command/PluginTarget;", "target", "", "execute", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "platformProvider", "Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;", "postMessenger", "init", "", "bind", "Lkotlin/reflect/KClass;", TypedValues.TransitionType.S_TO, "addComponent", "Lkotlin/coroutines/CoroutineContext;", "t0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "u0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/bbva/cells/pluginkit/provider/CommandFactory;", "getFactory", "()Lcom/bbva/cells/pluginkit/provider/CommandFactory;", "factory", "mainContext", "<init>", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class XPlugin implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableJob f26790p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LinkedHashMap f26791q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PlatformProvider f26792r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PostMessenger f26793s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: compiled from: XPlugin.kt */
    @DebugMetadata(c = "com.bbva.cells.pluginkit.XPlugin$execute$1", f = "XPlugin.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26796p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26798r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f26799s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PluginTarget f26800t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f26801u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, PluginTarget pluginTarget, String str3, Continuation continuation) {
            super(2, continuation);
            this.f26798r0 = str;
            this.f26799s0 = str2;
            this.f26800t0 = pluginTarget;
            this.f26801u0 = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return XPlugin.this.new a(this.f26798r0, this.f26799s0, this.f26800t0, this.f26801u0, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PluginResult<?> pluginResult;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26796p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                XPlugin xPlugin = XPlugin.this;
                Command<?> command = xPlugin.getFactory().get(this.f26798r0);
                if (command != null) {
                    command.setComponents(xPlugin.f26791q0);
                    command.setPlatformProvider(XPlugin.access$getPlatformProvider$p(xPlugin));
                    command.setPostMessenger(XPlugin.access$getPostMessenger$p(xPlugin));
                    this.f26796p0 = 1;
                    obj = command.executeAction(this.f26799s0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CommandResult commandResult = (CommandResult) obj;
            if (commandResult instanceof CommandResult.Success) {
                CommandResult.Success success = (CommandResult.Success) commandResult;
                pluginResult = new PluginResult<>(ResultCode.SUCCESS, success.getSerializer(), success.getValue());
            } else {
                if (!(commandResult instanceof CommandResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                CommandResult.Error error = (CommandResult.Error) commandResult;
                pluginResult = new PluginResult<>(ResultCode.ERROR, error.getValue().getSerializer(), error.getValue());
            }
            this.f26800t0.send(this.f26801u0, pluginResult);
            return Unit.INSTANCE;
        }
    }

    public XPlugin(@NotNull String id, @NotNull CoroutineContext mainContext) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.id = id;
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f26790p0 = completableJobJob$default;
        this.f26791q0 = new LinkedHashMap();
        this.coroutineContext = mainContext.plus(completableJobJob$default);
    }

    public static final /* synthetic */ PlatformProvider access$getPlatformProvider$p(XPlugin xPlugin) {
        PlatformProvider platformProvider = xPlugin.f26792r0;
        if (platformProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformProvider");
        }
        return platformProvider;
    }

    public static final /* synthetic */ PostMessenger access$getPostMessenger$p(XPlugin xPlugin) {
        PostMessenger postMessenger = xPlugin.f26793s0;
        if (postMessenger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postMessenger");
        }
        return postMessenger;
    }

    public final void addComponent(@NotNull Object bind, @NotNull KClass<?> to) {
        Intrinsics.checkNotNullParameter(bind, "bind");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f26791q0.put(to, bind);
    }

    public final void execute(@NotNull String id, @NotNull String action, @Nullable String data, @NotNull PluginTarget target) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(target, "target");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(action, data, target, id, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public abstract CommandFactory getFactory();

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final void init(@NotNull PlatformProvider platformProvider, @NotNull PostMessenger postMessenger) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(postMessenger, "postMessenger");
        this.f26792r0 = platformProvider;
        this.f26793s0 = postMessenger;
    }

    public /* synthetic */ XPlugin(String str, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? UIDispatcherKt.getUiDispatcher() : coroutineContext);
    }
}
