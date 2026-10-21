package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.DeviceDTO;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f83a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceDTO f84b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f85c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f86d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f86d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f85c = obj;
        this.f87e |= Integer.MIN_VALUE;
        return this.f86d.connectToBluetoothDevice(null, null, this);
    }
}
