package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.contacts.ContactAccessor;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.DeleteTokenCommand;
import com.bbva.plugin.contacts.ContactCommandFactory;
import com.bbva.plugin.contacts.command.impl.FindContactsBySearchTermCommand;
import com.bbva.plugin.showinfo.ShowInfoPluginCommandFactory;
import com.bbva.plugin.showinfo.command.SnackBarCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92951b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f92950a = i10;
        this.f92951b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92950a;
        Object obj = this.f92951b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new DeleteTokenCommand(this_apply);
            case 1:
                ContactAccessor contactAccessor = (ContactAccessor) obj;
                ContactCommandFactory.Companion companion = ContactCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(contactAccessor, "$contactAccessor");
                return new FindContactsBySearchTermCommand(contactAccessor);
            default:
                ShowInfoPluginCommandFactory this$0 = (ShowInfoPluginCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new SnackBarCommand(this$0.f35997a, this$0.f35998b);
        }
    }
}
