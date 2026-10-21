package com.bbva.plugin.wearables.info.plugin.commands;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.plugin.wearables.info.library.WearableDeviceInfo;
import com.bbva.plugin.wearables.info.plugin.models.WearableConnectivityRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import mb.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetWearableConnectivityCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/wearables/info/plugin/commands/GetWearableConnectivityCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/wearables/info/plugin/models/WearableConnectivityRequest;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;", "wearableDeviceInfo", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetWearableConnectivityCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWearableConnectivityCommand.kt\ncom/bbva/plugin/wearables/info/plugin/commands/GetWearableConnectivityCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class GetWearableConnectivityCommand extends AbstractCommand<WearableConnectivityRequest> implements CoroutineScope {

    @NotNull
    public static final String ID = "connectivity-request";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final WearableDeviceInfo f36088p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    public /* synthetic */ GetWearableConnectivityCommand(WearableDeviceInfo wearableDeviceInfo, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wearableDeviceInfo, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable WearableConnectivityRequest params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        if (params != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, params, callback, null), 3, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.sendError(Errors.ErrorMalformedParam);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWearableConnectivityCommand(@NotNull WearableDeviceInfo wearableDeviceInfo, @NotNull ThreadDispatchers dispatchers) {
        super(WearableConnectivityRequest.class);
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "wearableDeviceInfo");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f36088p0 = wearableDeviceInfo;
        this.coroutineContext = dispatchers.main().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }
}
