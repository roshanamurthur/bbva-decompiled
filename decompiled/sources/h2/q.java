package h2;

import android.content.Context;
import androidx.core.location.LocationManagerCompat;
import androidx.room.QueryInterceptorDatabase;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.material.R;
import com.google.android.material.datepicker.w;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Date;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69296p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69297q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69298r0;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f69296p0 = i10;
        this.f69297q0 = obj;
        this.f69298r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69296p0) {
            case 0:
                LocationManagerCompat.n nVar = (LocationManagerCompat.n) this.f69297q0;
                if (nVar.f19970b == ((Executor) this.f69298r0)) {
                    nVar.f19969a.onStopped();
                    break;
                }
                break;
            case 1:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) this.f69297q0;
                String sql = (String) this.f69298r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(sql, "$sql");
                this$0.f23255r0.onQuery(sql, CollectionsKt__CollectionsKt.emptyList());
                break;
            case 2:
                RememberedUserView.a((RememberedUserView) this.f69297q0, (RememberedUserState) this.f69298r0);
                break;
            default:
                com.google.android.material.datepicker.d dVar = (com.google.android.material.datepicker.d) this.f69297q0;
                String str = (String) this.f69298r0;
                TextInputLayout textInputLayout = dVar.f44567p0;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + RootService.LINE_BREAK + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', Typography.nbsp)) + RootService.LINE_BREAK + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), dVar.f44569r0.format(new Date(w.h().getTimeInMillis())).replace(' ', Typography.nbsp)));
                dVar.b();
                break;
        }
    }
}
