package androidx.room;

import android.content.SharedPreferences;
import android.os.Handler;
import com.appsflyer.internal.AFc1wSDK;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.dasnano.vddocumentcapture.fragments.l;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.firebase.messaging.o;
import com.mypinpad.tsdk.isolation.getDiscretionaryTagData;
import com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23381q0;

    public /* synthetic */ h(Object obj, int i10) {
        this.f23380p0 = i10;
        this.f23381q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f23380p0) {
            case 0:
                QueryInterceptorStatement this$0 = (QueryInterceptorStatement) this.f23381q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23266s0.onQuery(this$0.f23264q0, this$0.f23267t0);
                return;
            case 1:
                AFc1wSDK.valueOf((AFc1wSDK) this.f23381q0);
                return;
            case 2:
                DocumentFragment documentFragment = (DocumentFragment) this.f23381q0;
                String str = DocumentFragment.CAMERA_FAILURE;
                documentFragment.getClass();
                new Handler().postDelayed(new l(documentFragment), 500L);
                return;
            case 3:
                SelfieFragment selfieFragment = (SelfieFragment) this.f23381q0;
                String str2 = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                selfieFragment.J();
                return;
            case 4:
                com.google.android.material.timepicker.f fVar = ((MaterialTimePicker) this.f23381q0).f45739x0;
                if (fVar instanceof com.google.android.material.timepicker.i) {
                    ((com.google.android.material.timepicker.i) fVar).b();
                    return;
                }
                return;
            case 5:
                o oVar = (o) this.f23381q0;
                synchronized (oVar.f48655d) {
                    SharedPreferences.Editor editorEdit = oVar.f48652a.edit();
                    String str3 = oVar.f48653b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = oVar.f48655d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(oVar.f48654c);
                    }
                    editorEdit.putString(str3, sb2.toString()).commit();
                    break;
                }
                return;
            default:
                getDiscretionaryTagData.setY(new Object[]{(setLastBaselineToBottomHeight) this.f23381q0}, 277785605, -277785592, (int) System.currentTimeMillis());
                return;
        }
    }
}
