package androidx.room;

import android.graphics.Rect;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.dasnano.vddocumentcapture.managers.UserVisualHelpManager;
import com.dasnano.vddocumentcapture.other.Rectangle;
import com.mypinpad.tsdk.isolation.getDiscretionaryTagData;
import com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23382p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23383q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f23384r0;

    public /* synthetic */ i(DocumentFragment documentFragment, Runnable runnable) {
        this.f23382p0 = 1;
        this.f23384r0 = documentFragment;
        this.f23383q0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f23382p0;
        Object obj = this.f23384r0;
        Object obj2 = this.f23383q0;
        switch (i10) {
            case 0:
                Runnable command = (Runnable) obj2;
                TransactionExecutor this$0 = (TransactionExecutor) obj;
                Intrinsics.checkNotNullParameter(command, "$command");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.scheduleNext();
                }
            case 1:
                DocumentFragment.j((DocumentFragment) obj, (Runnable) obj2);
                return;
            case 2:
                Rect rect = (Rect) obj;
                Rectangle rectangle = ((UserVisualHelpManager) obj2).f39420k;
                if (rectangle != null) {
                    rectangle.setRect(rect);
                    return;
                }
                return;
            default:
                getDiscretionaryTagData.setY(new Object[]{(setLastBaselineToBottomHeight) obj2, (byte[]) obj}, -966667861, 966667869, (int) System.currentTimeMillis());
                return;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i10) {
        this.f23382p0 = i10;
        this.f23383q0 = obj;
        this.f23384r0 = obj2;
    }
}
