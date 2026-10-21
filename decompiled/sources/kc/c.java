package kc;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\ncom/bbva/ui/compose/TextFieldKt$ActionItems$1$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
public final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f79290p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f79291q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f79292r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, String str, String str2) {
        super(1);
        this.f79290p0 = z10;
        this.f79291q0 = str;
        this.f79292r0 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (this.f79290p0) {
            String str = this.f79291q0;
            if (str != null) {
                SemanticsPropertiesKt.setContentDescription(semantics, str);
            }
        } else {
            String str2 = this.f79292r0;
            if (str2 != null) {
                SemanticsPropertiesKt.setContentDescription(semantics, str2);
            }
        }
        return Unit.INSTANCE;
    }
}
