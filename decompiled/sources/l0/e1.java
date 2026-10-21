package l0;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.StateData;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f82504p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f82505q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f82506r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f82507s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82508t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f82509u0;
    public final /* synthetic */ LazyGridState v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82510w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ String f82511x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ String f82512y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e1(StateData stateData, int i10, int i11, Function1<? super Integer, Unit> function1, int i12, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
        super(1);
        this.f82504p0 = stateData;
        this.f82505q0 = i10;
        this.f82506r0 = i11;
        this.f82507s0 = function1;
        this.f82508t0 = i12;
        this.f82509u0 = datePickerColors;
        this.v0 = lazyGridState;
        this.f82510w0 = coroutineScope;
        this.f82511x0 = str;
        this.f82512y0 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        androidx.compose.foundation.lazy.grid.b.b(LazyVerticalGrid, CollectionsKt___CollectionsKt.count(this.f82504p0.getYearRange()), null, null, null, ComposableLambdaKt.composableLambdaInstance(1369226173, true, new androidx.compose.material3.p0(this.f82504p0, this.f82505q0, this.f82506r0, this.f82507s0, this.f82508t0, this.f82509u0, this.v0, this.f82510w0, this.f82511x0, this.f82512y0)), 14, null);
        return Unit.INSTANCE;
    }
}
