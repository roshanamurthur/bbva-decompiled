package l0;

import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s4 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82916p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82917q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f82918r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f82919s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Offset> f82920t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(CoroutineScope coroutineScope, TimePickerState timePickerState, float f6, boolean z10, MutableState<Offset> mutableState) {
        super(0);
        this.f82916p0 = coroutineScope;
        this.f82917q0 = timePickerState;
        this.f82918r0 = f6;
        this.f82919s0 = z10;
        this.f82920t0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f82916p0, null, null, new r4(this.f82917q0, this.f82918r0, this.f82919s0, this.f82920t0, null), 3, null);
        return Boolean.TRUE;
    }
}
