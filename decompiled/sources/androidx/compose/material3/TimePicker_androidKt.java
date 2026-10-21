package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0000\u001a\u00020\u00018AX\u0080\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"defaultTimePickerLayoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "getDefaultTimePickerLayoutType$annotations", "()V", "getDefaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n76#2:34\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n26#1:34\n*E\n"})
public final class TimePicker_androidKt {
    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getDefaultTimePickerLayoutType")
    public static final int getDefaultTimePickerLayoutType(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1979410629, i10, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:25)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        int iM1416getHorizontalQJTpgSE = configuration.screenHeightDp < configuration.screenWidthDp ? TimePickerLayoutType.INSTANCE.m1416getHorizontalQJTpgSE() : TimePickerLayoutType.INSTANCE.m1417getVerticalQJTpgSE();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iM1416getHorizontalQJTpgSE;
    }

    public static /* synthetic */ void getDefaultTimePickerLayoutType$annotations() {
    }
}
