package xb;

import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.model.InfoElement;
import com.bbva.showinfo.nativemodal.activity.NativeListModalActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NativeListModalActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends Lambda implements Function0<InfoElement> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NativeListModalActivity f94515p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NativeListModalActivity nativeListModalActivity) {
        super(0);
        this.f94515p0 = nativeListModalActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InfoElement invoke() {
        return ShowInfoKt.nativeListModal(new c(this.f94515p0));
    }
}
