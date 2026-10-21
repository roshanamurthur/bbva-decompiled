package kc;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.bbva.ui.R;
import com.bbva.ui.compose.TextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\ncom/bbva/ui/compose/TextFieldKt$ActionItems$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,395:1\n1097#2,6:396\n*S KotlinDebug\n*F\n+ 1 TextField.kt\ncom/bbva/ui/compose/TextFieldKt$ActionItems$1$1\n*L\n300#1:396,6\n*E\n"})
public final class b extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f79287p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f79288q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f79289r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, long j10, Function0<Unit> function0) {
        super(3);
        this.f79287p0 = str;
        this.f79288q0 = j10;
        this.f79289r0 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) throws XmlPullParserException {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022881762, iIntValue, -1, "com.bbva.ui.compose.ActionItems.<anonymous>.<anonymous> (TextField.kt:298)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer2.startReplaceableGroup(572570894);
        String str = this.f79287p0;
        boolean zChanged = composer2.changed(str);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(str);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        TextFieldKt.a(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), this.f79288q0, PainterResources_androidKt.painterResource(R.drawable.ic_cross_16dp, composer2, 0), this.f79289r0, composer2, 512, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
