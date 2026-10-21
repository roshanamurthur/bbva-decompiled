package androidx.camera.core;

import androidx.room.QueryInterceptorDatabase;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.ui.component.menu.SlideMenuView;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2079p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2080q0;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f2079p0 = i10;
        this.f2080q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2079p0;
        Object obj = this.f2080q0;
        switch (i10) {
            case 0:
                ((SafeCloseImageReaderProxy) obj).safeClose();
                break;
            case 1:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23255r0.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                break;
            case 2:
                CommandCallback callback = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendError(CommandError.ErrorDiscoverCapabilities);
                break;
            case 3:
                SlideMenuView.b((SlideMenuView) obj);
                break;
            case 4:
                ((TextInputLayout) obj).f45591s0.requestLayout();
                break;
            default:
                Function0 completion = (Function0) obj;
                Intrinsics.checkNotNullParameter(completion, "$completion");
                completion.invoke();
                break;
        }
    }
}
