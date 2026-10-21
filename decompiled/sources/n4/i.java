package n4;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.component.ui.welcome.header.WelcomeHeader;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84445b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f84444a = i10;
        this.f84445b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84444a;
        Object obj2 = this.f84445b;
        switch (i10) {
            case 0:
                Function1 tmp0 = (Function1) obj2;
                int i11 = CellsEditText.N0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 1:
                ((WelcomeHeader) obj2).setWelcomeHeaderDescription((Map) obj);
                break;
            default:
                ((TokenDeregistrationFragment) obj2).a((Pair) obj);
                break;
        }
    }
}
