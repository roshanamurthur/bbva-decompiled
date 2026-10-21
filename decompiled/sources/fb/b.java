package fb;

import android.location.Location;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: HmsLocator.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b<T> implements FlowCollector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Location, Unit> f68400p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<ErrorMessage, Unit> f68401q0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super Location, Unit> function1, Function1<? super ErrorMessage, Unit> function2) {
        this.f68400p0 = function1;
        this.f68401q0 = function2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            this.f68400p0.invoke((Location) ((Result.Success) result).getValue());
        } else {
            if (!(result instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f68401q0.invoke(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}
