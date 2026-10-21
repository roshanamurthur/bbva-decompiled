package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0010ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "inputMode", "", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V", "initialInputMode", "Lkotlin/Function1;", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n81#2:77\n107#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
public final class InputModeManagerImpl implements InputModeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<InputMode, Boolean> f16169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState inputMode;

    public InputModeManagerImpl() {
        throw null;
    }

    public InputModeManagerImpl(int i10, Function1 onRequestInputModeChange, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(onRequestInputModeChange, "onRequestInputModeChange");
        this.f16169a = onRequestInputModeChange;
        this.inputMode = SnapshotStateKt.mutableStateOf$default(InputMode.m3043boximpl(i10), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* JADX INFO: renamed from: getInputMode-aOaMEAU */
    public int mo3052getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode.getValue()).getF16168a();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: requestInputMode-iuPiT84 */
    public boolean mo3053requestInputModeiuPiT84(int inputMode) {
        return this.f16169a.invoke(InputMode.m3043boximpl(inputMode)).booleanValue();
    }

    /* JADX INFO: renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m3054setInputModeiuPiT84(int i10) {
        this.inputMode.setValue(InputMode.m3043boximpl(i10));
    }
}
