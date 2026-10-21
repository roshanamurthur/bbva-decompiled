package com.bbva.ethermobilesdk.deviceinfo.plugin.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.params.GetTrueTimeParams;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.params.GetTrueTimeParamsValidator;
import com.bbva.ethermobilesdk.deviceinfo.plugin.di.InjectorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTrueTimeCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/GetTrueTimeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/GetTrueTimeParams;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTrueTimeCommand extends AbstractCommand<GetTrueTimeParams> implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29583p0;

    /* JADX INFO: compiled from: GetTrueTimeCommand.kt */
    public static final class a extends Lambda implements Function1<DeviceInfo, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GetTrueTimeParams f29585q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29586r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetTrueTimeParams getTrueTimeParams, CommandCallback commandCallback) {
            super(1);
            this.f29585q0 = getTrueTimeParams;
            this.f29586r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeviceInfo deviceInfo) {
            DeviceInfo it = deviceInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(GetTrueTimeCommand.this, null, null, new com.bbva.ethermobilesdk.deviceinfo.plugin.command.a(it, this.f29585q0, this.f29586r0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public GetTrueTimeCommand() {
        super(GetTrueTimeParams.class, new GetTrueTimeParamsValidator());
        this.f29583p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29583p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable GetTrueTimeParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        InjectorKt.withDeviceInfoClient(mApplication, new a(params, callback));
    }
}
