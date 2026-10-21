package pb;

import android.content.Intent;
import com.bbva.push.model.Token;
import com.bbva.push.model.TokenError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92600b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f92599a = i10;
        this.f92600b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task it) {
        int i10 = this.f92599a;
        Object obj = this.f92600b;
        switch (i10) {
            case 0:
                Function1 callback = (Function1) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!it.isSuccessful()) {
                    callback.invoke(new TokenError(null, 1, null));
                } else {
                    String str = (String) it.getResult();
                    if (str == null) {
                        str = "";
                    }
                    callback.invoke(new Token(str));
                }
                break;
            default:
                x.a((Intent) obj);
                break;
        }
    }
}
