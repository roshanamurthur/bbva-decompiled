package l0;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1672:1\n25#2:1673\n25#2:1680\n25#2:1687\n25#2:1698\n36#2:1711\n1114#3,6:1674\n1114#3,6:1681\n1114#3,6:1688\n1114#3,3:1699\n1117#3,3:1705\n1114#3,6:1712\n474#4,4:1694\n478#4,2:1702\n482#4:1708\n474#5:1704\n76#6:1709\n1#7:1710\n76#8:1718\n102#8,2:1719\n76#8:1721\n102#8,2:1722\n76#8:1724\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n*L\n1245#1:1673\n1246#1:1680\n1247#1:1687\n1248#1:1698\n1252#1:1711\n1245#1:1674,6\n1246#1:1681,6\n1247#1:1688,6\n1248#1:1699,3\n1248#1:1705,3\n1252#1:1712,6\n1248#1:1694,4\n1248#1:1702,2\n1248#1:1708\n1248#1:1704\n1249#1:1709\n1245#1:1718\n1245#1:1719,2\n1246#1:1721\n1246#1:1722,2\n1247#1:1724\n*E\n"})
public final class l5 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82690p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82691q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(TimePickerState timePickerState, boolean z10) {
        super(3);
        this.f82690p0 = timePickerState;
        this.f82691q0 = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifier, "$this$composed", composer2, -1645090088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1645090088, iA, -1, "androidx.compose.material3.clockDial.<anonymous> (TimePicker.kt:1243)");
        }
        composer2.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composer2.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        composer2.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composer2.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(IntOffset.m4498boximpl(IntOffset.INSTANCE.m4517getZeronOccac()), null, 2, null);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue3;
        Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
        if (objB == companion.getEmpty()) {
            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
        }
        composer2.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
        composer2.endReplaceableGroup();
        float fMo415toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(TimePickerKt.f12350h);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer2.startReplaceableGroup(1157296644);
        TimePickerState timePickerState = this.f82690p0;
        boolean zChanged = composer2.changed(timePickerState);
        Object objRememberedValue4 = composer2.rememberedValue();
        if (zChanged || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new i5(timePickerState);
            composer2.updateRememberedValue(objRememberedValue4);
        }
        composer2.endReplaceableGroup();
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) objRememberedValue4), new Object[]{timePickerState, IntOffset.m4498boximpl(((IntOffset) mutableState3.getValue()).getF18312a()), Float.valueOf(fMo415toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new j5(fMo415toPx0680j_4, this.f82690p0, mutableState, mutableState2, null, coroutineScope, this.f82691q0)), new Object[]{timePickerState, IntOffset.m4498boximpl(((IntOffset) mutableState3.getValue()).getF18312a()), Float.valueOf(fMo415toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new androidx.compose.material3.d5(fMo415toPx0680j_4, this.f82690p0, mutableState, mutableState2, null, coroutineScope, this.f82691q0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierPointerInput;
    }
}
