package l0;

import androidx.compose.material3.ModalBottomSheet_androidKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l2 extends FunctionReferenceImpl implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object>, SuspendFunction {
    public l2(Object obj) {
        super(3, obj, Intrinsics.Kotlin.class, "suspendConversion0", "modalBottomSheetSwipeable$suspendConversion0(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
        return ModalBottomSheet_androidKt.access$modalBottomSheetSwipeable$suspendConversion0((Function2) this.receiver, coroutineScope, f6.floatValue(), continuation);
    }
}
