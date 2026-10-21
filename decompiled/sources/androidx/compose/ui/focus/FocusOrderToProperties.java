package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B \u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "focusProperties", "invoke", "Landroidx/compose/ui/focus/FocusOrder;", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/jvm/functions/Function1;", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;", "focusOrderReceiver", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusOrderToProperties implements Function1<FocusProperties, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<FocusOrder, Unit> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(@NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        this.focusOrderReceiver = focusOrderReceiver;
    }

    @NotNull
    public final Function1<FocusOrder, Unit> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }
}
