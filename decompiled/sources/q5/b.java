package q5;

import android.content.DialogInterface;
import com.bbva.component.ui.login.credentials.documentlist.DocumentListSelector;
import com.bbva.component.ui.login.model.DocumentItem;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92764p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92765q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f92764p0 = i10;
        this.f92765q0 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f92764p0;
        Object obj = this.f92765q0;
        switch (i11) {
            case 0:
                DocumentListSelector this$0 = (DocumentListSelector) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                DocumentItem documentItem = this$0.f28494a.get(this$0.f28495b);
                Function1<? super DocumentItem, Unit> function1 = this$0.f28497d;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onItemSelected");
                    function1 = null;
                }
                function1.invoke(documentItem);
                break;
            default:
                String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                ((VideoFragment) obj).G();
                break;
        }
    }
}
