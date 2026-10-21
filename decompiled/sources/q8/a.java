package q8;

import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.plugin.google.pay.command.GetCardStatusCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f92775b;

    public /* synthetic */ a(Function1 function1, int i10) {
        this.f92774a = i10;
        this.f92775b = function1;
    }

    @Override // com.bbva.androidtoolkit.optional.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f92774a;
        Function1 tmp0 = this.f92775b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                GetCardStatusCommand.Companion companion = GetCardStatusCommand.Companion;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
        }
    }
}
