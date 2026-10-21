package t;

import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function1<KeyEvent, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f93416p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Map<Key, PressInteraction.Press> f93417q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<Offset> f93418r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f93419s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f93420t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f93421u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, Map<Key, PressInteraction.Press> map, State<Offset> state, CoroutineScope coroutineScope, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.f93416p0 = z10;
        this.f93417q0 = map;
        this.f93418r0 = state;
        this.f93419s0 = coroutineScope;
        this.f93420t0 = function0;
        this.f93421u0 = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KeyEvent keyEvent) {
        android.view.KeyEvent keyEvent2 = keyEvent.m3355unboximpl();
        Intrinsics.checkNotNullParameter(keyEvent2, "keyEvent");
        boolean z10 = false;
        MutableInteractionSource mutableInteractionSource = this.f93421u0;
        Map<Key, PressInteraction.Press> map = this.f93417q0;
        boolean z11 = this.f93416p0;
        if (z11 && Clickable_androidKt.m156isPressZmokQxo(keyEvent2)) {
            if (!map.containsKey(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(keyEvent2)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.f93418r0.getValue().getF15533a(), null);
                map.put(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(keyEvent2)), press);
                BuildersKt__Builders_commonKt.launch$default(this.f93419s0, null, null, new k(mutableInteractionSource, press, null), 3, null);
                z10 = true;
            }
        } else if (z11 && Clickable_androidKt.m155isClickZmokQxo(keyEvent2)) {
            PressInteraction.Press pressRemove = map.remove(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(keyEvent2)));
            if (pressRemove != null) {
                BuildersKt__Builders_commonKt.launch$default(this.f93419s0, null, null, new l(mutableInteractionSource, pressRemove, null), 3, null);
            }
            this.f93420t0.invoke();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
