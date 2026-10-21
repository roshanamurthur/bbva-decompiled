package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n76#2:39\n76#2:40\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:39\n27#1:40\n*E\n"})
public final class Strings_androidKt {
    @Composable
    @NotNull
    /* JADX INFO: renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m832getString4foXLRw(int i10, @Nullable Composer composer, int i11) {
        String string;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m821equalsimpl0(i10, companion.m829getNavigationMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m821equalsimpl0(i10, companion.m825getCloseDrawerUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m821equalsimpl0(i10, companion.m826getCloseSheetUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m821equalsimpl0(i10, companion.m827getDefaultErrorMessageUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m821equalsimpl0(i10, companion.m828getExposedDropdownMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m821equalsimpl0(i10, companion.m831getSliderRangeStartUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_start)");
        } else if (Strings.m821equalsimpl0(i10, companion.m830getSliderRangeEndUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_end)");
        } else {
            string = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }
}
