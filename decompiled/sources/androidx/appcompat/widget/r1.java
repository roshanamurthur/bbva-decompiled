package androidx.appcompat.widget;

import androidx.camera.core.impl.CameraStateRegistry;
import androidx.room.QueryInterceptorDatabase;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import com.bbva.plugin.digipassmanager.commands.RemainingTimeCommand;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.mypinpad.tsdk.isolation.ty;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1676p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1677q0;

    public /* synthetic */ r1(Object obj, int i10) {
        this.f1676p0 = i10;
        this.f1677q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws TerminalException {
        int i10 = 1;
        int i11 = this.f1676p0;
        Object obj = this.f1677q0;
        switch (i11) {
            case 0:
                ((Toolbar) obj).invalidateMenu();
                break;
            case 1:
                ((CameraStateRegistry.OnOpenAvailableListener) obj).onOpenAvailable();
                break;
            case 2:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23255r0.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                break;
            case 3:
                AFa1dSDK.AFInAppEventParameterName((AFc1zSDK) obj);
                break;
            case 4:
                ((SecurityDataManager) obj).fire(SecurityDataManager.f28166x0);
                break;
            case 5:
                CommandCallback callback = (CommandCallback) obj;
                RemainingTimeCommand.Companion companion = RemainingTimeCommand.Companion;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendEvent((int) DigipassManagerHelper.INSTANCE.getInstance().getF34946b());
                break;
            case 6:
                DocumentFragment.m((DocumentFragment) obj);
                break;
            case 7:
                com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) obj;
                if (searchView.R0) {
                    searchView.requestFocusAndShowKeyboard();
                }
                break;
            case 8:
                DefaultTokenRefresher defaultTokenRefresher = (DefaultTokenRefresher) obj;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = defaultTokenRefresher.f47613a;
                defaultFirebaseAppCheck.m.getToken().onSuccessTask(defaultFirebaseAppCheck.f47606g, new androidx.camera.core.impl.k(defaultFirebaseAppCheck)).addOnFailureListener(defaultTokenRefresher.f47614b, new com.dasnano.vdphotoselfiecapture.other.e(defaultTokenRefresher, i10));
                break;
            default:
                ty.setOnFocusChangeListener(new Object[]{(ty) obj}, -1397233336, 1397233340, (int) System.currentTimeMillis());
                break;
        }
    }
}
