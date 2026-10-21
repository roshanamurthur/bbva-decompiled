package v8;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bbva.glomohybrid.inappupdate.view.InAppUpdateModalView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: InAppUpdateModalView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f93984p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ InAppUpdateModalView f93985q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogFragment dialogFragment, InAppUpdateModalView inAppUpdateModalView) {
        super(1);
        this.f93984p0 = dialogFragment;
        this.f93985q0 = inAppUpdateModalView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f93984p0.dismiss();
        InAppUpdateModalView inAppUpdateModalView = this.f93985q0;
        BuildersKt__Builders_commonKt.launch$default(inAppUpdateModalView, null, null, new a(inAppUpdateModalView, null), 3, null);
        return Unit.INSTANCE;
    }
}
