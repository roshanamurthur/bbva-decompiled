package z5;

import android.view.View;
import androidx.camera.camera2.internal.d;
import com.bbva.component.ui.shortcuts.ShortcutItemView;
import com.noknok.android.client.appsdk_plus.registration.FidoMethod;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94977p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94978q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f94979r0;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f94977p0 = i10;
        this.f94978q0 = obj;
        this.f94979r0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94977p0;
        Object obj = this.f94979r0;
        Object obj2 = this.f94978q0;
        switch (i10) {
            case 0:
                ShortcutItemView this$0 = (ShortcutItemView) obj2;
                Function0 listener = (Function0) obj;
                ShortcutItemView.Companion companion = ShortcutItemView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                this$0.setClickable(false);
                this$0.postDelayed(new d(this$0, 3), 600L);
                listener.invoke();
                break;
            default:
                ((FidoRegisterFragment) obj2).a((FidoMethod) obj, view);
                break;
        }
    }
}
