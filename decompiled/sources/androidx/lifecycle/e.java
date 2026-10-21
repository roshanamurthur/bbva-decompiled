package androidx.lifecycle;

import com.bbva.cellswidgets.CellsEditText;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22175b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f22174a = i10;
        this.f22175b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f22174a;
        Object obj2 = this.f22175b;
        switch (i10) {
            case 0:
                ((ProducerScope) obj2).mo5953trySendJP2dKIU(obj);
                break;
            default:
                CellsEditText.c((CellsEditText) obj2, (String) obj);
                break;
        }
    }
}
