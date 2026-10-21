package b6;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.component.ui.welcome.header.WelcomeHeader;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24882b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f24881a = i10;
        this.f24882b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f24881a;
        Object obj2 = this.f24882b;
        switch (i10) {
            case 0:
                ((WelcomeHeader) obj2).setWelcomeHeaderUsername((Map) obj);
                break;
            default:
                ((TokenDeregistrationFragment) obj2).b((Pair) obj);
                break;
        }
    }
}
