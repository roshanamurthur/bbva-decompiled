package t6;

import com.bbva.dynamiclinks.DynamicLinksHandler;
import com.bbva.dynamiclinks.extensions.DynamicLinksExtensionsKt;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f93462b;

    public /* synthetic */ b(Function1 function1, int i10) {
        this.f93461a = i10;
        this.f93462b = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f93461a;
        Function1 onSuccess = this.f93462b;
        switch (i10) {
            case 0:
                DynamicLinksHandler dynamicLinksHandler = DynamicLinksHandler.INSTANCE;
                Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
                onSuccess.invoke(DynamicLinksExtensionsKt.toModel((PendingDynamicLinkData) obj));
                break;
            default:
                onSuccess.invoke(obj);
                break;
        }
    }
}
