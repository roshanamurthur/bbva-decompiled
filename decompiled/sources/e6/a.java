package e6;

import com.bbva.component_devicemanager.data.service.DeviceManagerService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerService.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.bbva.component_devicemanager.data.service.DeviceManagerService", f = "DeviceManagerService.kt", i = {0}, l = {28}, m = "runNetworkRequest", n = {"this"}, s = {"L$0"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DeviceManagerService f68276p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68277q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DeviceManagerService f68278r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f68279s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeviceManagerService deviceManagerService, Continuation<? super a> continuation) {
        super(continuation);
        this.f68278r0 = deviceManagerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68277q0 = obj;
        this.f68279s0 |= Integer.MIN_VALUE;
        return DeviceManagerService.access$runNetworkRequest(this.f68278r0, this);
    }
}
