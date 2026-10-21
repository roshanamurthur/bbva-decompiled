package q8;

import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.glomohybrid.documents.plugin.commands.OpenPathCommand;
import com.bbva.plugin.google.pay.command.GetPushDataCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f92779b;

    public /* synthetic */ c(Function1 function1, int i10) {
        this.f92778a = i10;
        this.f92779b = function1;
    }

    @Override // com.bbva.androidtoolkit.optional.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f92778a;
        Function1 tmp0 = this.f92779b;
        switch (i10) {
            case 0:
                OpenPathCommand.Companion companion = OpenPathCommand.Companion;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                GetPushDataCommand.Companion companion2 = GetPushDataCommand.Companion;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
        }
    }
}
