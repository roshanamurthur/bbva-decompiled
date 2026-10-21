package c4;

import com.bbva.actionlauncher.plugin.commands.ShareFileCommand;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.RegisterTokenCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25362b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f25361a = i10;
        this.f25362b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25361a;
        Object obj = this.f25362b;
        switch (i10) {
            case 0:
                ShareFileCommand this_with = (ShareFileCommand) obj;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                return this_with;
            default:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new RegisterTokenCommand(this_apply);
        }
    }
}
