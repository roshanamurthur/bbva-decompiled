package androidx.appcompat.widget;

import androidx.room.QueryInterceptorStatement;
import com.appsflyer.internal.AFc1wSDK;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.mypinpad.tsdk.isolation.getDiscretionaryTagData;
import com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1697p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1698q0;

    public /* synthetic */ x1(Object obj, int i10) {
        this.f1697p0 = i10;
        this.f1698q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f1697p0;
        Object obj = this.f1698q0;
        switch (i10) {
            case 0:
                ((y1) obj).a();
                break;
            case 1:
                QueryInterceptorStatement this$0 = (QueryInterceptorStatement) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23266s0.onQuery(this$0.f23264q0, this$0.f23267t0);
                break;
            case 2:
                AFc1wSDK.values((AFc1wSDK) obj);
                break;
            case 3:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).E();
                break;
            default:
                getDiscretionaryTagData.setY(new Object[]{(setLastBaselineToBottomHeight) obj}, 277785605, -277785592, (int) System.currentTimeMillis());
                break;
        }
    }
}
