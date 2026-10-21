package d6;

import com.bbva.component_devicemanager.data.GlobalDeviceManagerData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalDeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.bbva.component_devicemanager.data.GlobalDeviceManagerData", f = "GlobalDeviceManagerData.kt", i = {}, l = {38}, m = "initializeData", n = {}, s = {})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GlobalDeviceManagerData f68126p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68127q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GlobalDeviceManagerData f68128r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f68129s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GlobalDeviceManagerData globalDeviceManagerData, Continuation<? super a> continuation) {
        super(continuation);
        this.f68128r0 = globalDeviceManagerData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68127q0 = obj;
        this.f68129s0 |= Integer.MIN_VALUE;
        return GlobalDeviceManagerData.access$initializeData(this.f68128r0, this);
    }
}
