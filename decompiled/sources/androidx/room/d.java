package androidx.room;

import com.airbnb.lottie.LottieTask;
import com.mypinpad.tsdk.isolation.TerminalErrorCodes;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23371q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f23370p0 = i10;
        this.f23371q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23370p0;
        Object obj = this.f23371q0;
        switch (i10) {
            case 0:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23255r0.onQuery("END TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                break;
            case 1:
                Executor executor = LottieTask.EXECUTOR;
                ((LottieTask) obj).b();
                break;
            default:
                TerminalErrorCodes.Companion companion = TerminalErrorCodes.INSTANCE;
                TerminalErrorCodes.setY(new Object[]{(TerminalErrorCodes) obj}, 1889804456, -1889804456, (int) System.currentTimeMillis());
                break;
        }
    }
}
