package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u009b\u0003\u00103\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u009b\u0003\u00109\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00102J\u0087\u0003\u00103\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u0087\u0003\u00109\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010<J\u0085\u0002\u00103\u001a\u0002002\b\b\u0002\u0010>\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0085\u0002\u00109\u001a\u0002002\b\b\u0002\u0010>\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010AR\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "", "expanded", "", "TrailingIcon", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "Landroidx/compose/material3/TextFieldColors;", "textFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-FD9MK7s", "outlinedTextFieldColors", "containerColor", "textFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-tN0la-I", "textColor", "placeholderColor", "textFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-St-qZLY", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ItemContentPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n76#2:1059\n76#2:1060\n76#2:1061\n76#2:1062\n76#2:1063\n76#2:1064\n154#3:1065\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n370#1:1059\n524#1:1060\n637#1:1061\n743#1:1062\n844#1:1063\n934#1:1064\n622#1:1065\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ItemContentPadding = PaddingKt.m290PaddingValuesYgX7TsA(ExposedDropdownMenuKt.f10244a, Dp.m4389constructorimpl(0));

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10242q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10243r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, int i10) {
            super(2);
            this.f10242q0 = z10;
            this.f10243r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10243r0 | 1);
            ExposedDropdownMenuDefaults.this.TrailingIcon(this.f10242q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public final void TrailingIcon(boolean z10, @Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1803742020);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803742020, i10, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:300)");
            }
            IconKt.m1140Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), (String) null, RotateKt.rotate(Modifier.INSTANCE, z10 ? 180.0f : 0.0f), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, i10));
    }

    @NotNull
    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1096outlinedTextFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, @Nullable Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        composer.startReplaceableGroup(-325161132);
        long color = (i14 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long color2 = (i14 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i14 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i14 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM2543getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long jM2543getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j15;
        long jM2543getTransparent0d7_KjU3 = (i14 & 64) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j16;
        long jM2543getTransparent0d7_KjU4 = (i14 & 128) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j17;
        long color4 = (i14 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long color5 = (i14 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        TextSelectionColors textSelectionColors2 = (i14 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i14 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j20;
        long color7 = (i14 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j21;
        long jM2507copywmQWz5c$default2 = (i14 & 8192) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long color8 = (i14 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j23;
        long color9 = (32768 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j24;
        long color10 = (65536 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j25;
        long jM2507copywmQWz5c$default3 = (131072 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color11 = (262144 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j27;
        long color12 = (524288 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j28;
        long color13 = (1048576 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j29;
        long jM2507copywmQWz5c$default4 = (2097152 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color14 = (4194304 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j31;
        long color15 = (8388608 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j32;
        long color16 = (16777216 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j33;
        long jM2507copywmQWz5c$default5 = (33554432 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color17 = (67108864 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j35;
        long color18 = (134217728 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long color19 = (268435456 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long jM2507copywmQWz5c$default6 = (536870912 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long color20 = (i14 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long color21 = (i15 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        long color22 = (i15 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long jM2507copywmQWz5c$default7 = (i15 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j42;
        long color23 = (i15 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        long color24 = (i15 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j44;
        long color25 = (i15 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        long jM2507copywmQWz5c$default8 = (i15 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j46;
        long color26 = (i15 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-325161132, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:510)");
        }
        int i16 = i13 << 12;
        int i17 = i13 >> 18;
        TextFieldColors textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(color, color2, jM2507copywmQWz5c$default, color3, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU2, jM2543getTransparent0d7_KjU3, jM2543getTransparent0d7_KjU4, color4, color5, textSelectionColors2, color6, color7, jM2507copywmQWz5c$default2, color8, color9, color10, jM2507copywmQWz5c$default3, color11, color12, color13, jM2507copywmQWz5c$default4, color14, color15, color16, jM2507copywmQWz5c$default5, color17, color18, color19, jM2507copywmQWz5c$default6, color20, 0L, 0L, 0L, 0L, color21, color22, jM2507copywmQWz5c$default7, color23, color24, color25, jM2507copywmQWz5c$default8, color26, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 14) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), (i17 & 14) | 3072 | (i17 & 112) | (i17 & 896), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1193colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1097outlinedTextFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(-83147315);
        long color = (i13 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        long jM2507copywmQWz5c$default = (i13 & 2) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2543getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long color2 = (i13 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long color3 = (i13 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i13 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i13 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j15;
        long color5 = (i13 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j16;
        long jM2507copywmQWz5c$default2 = (i13 & 256) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color6 = (i13 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j18;
        long color7 = (i13 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long color8 = (i13 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        long jM2507copywmQWz5c$default3 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color9 = (i13 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long color10 = (i13 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long color11 = (32768 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        long jM2507copywmQWz5c$default4 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color12 = (131072 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long color13 = (262144 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long color14 = (524288 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long jM2507copywmQWz5c$default5 = (1048576 & i13) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color15 = (2097152 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long color16 = (4194304 & i13) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        long jM2507copywmQWz5c$default6 = (i13 & 8388608) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83147315, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:925)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long color17 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color18 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM2507copywmQWz5c$default7 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long color19 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color20 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color21 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM2507copywmQWz5c$default8 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long color22 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i10 >> 15;
        int i21 = i11 << 15;
        int i22 = (i20 & 57344) | (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i11 >> 15;
        int i24 = i12 << 15;
        int i25 = i12 << 18;
        TextFieldColors textFieldColorsM1096outlinedTextFieldColorsFD9MK7s = m1096outlinedTextFieldColorsFD9MK7s(color, color, jM2507copywmQWz5c$default, color, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, jM2507copywmQWz5c$default2, color6, color7, color8, jM2507copywmQWz5c$default3, color9, color10, color11, jM2507copywmQWz5c$default4, color12, color13, color14, jM2507copywmQWz5c$default5, color15, color16, color16, jM2507copywmQWz5c$default6, color16, color17, color18, jM2507copywmQWz5c$default7, color19, color20, color21, jM2507copywmQWz5c$default8, color22, composer, i19, i22, (i23 & 57344) | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), ((i12 >> 6) & 14) | (i24 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1096outlinedTextFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1098outlinedTextFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, TextSelectionColors textSelectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        composer.startReplaceableGroup(-907010558);
        long color = (i14 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long color2 = (i14 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i14 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i14 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM2543getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long jM2543getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j15;
        long color4 = (i14 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long color5 = (i14 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        TextSelectionColors textSelectionColors2 = (i14 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i14 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j18;
        long color7 = (i14 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j19;
        long jM2507copywmQWz5c$default2 = (i14 & 2048) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color8 = (i14 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j21;
        long color9 = (i14 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long color10 = (i14 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        long jM2507copywmQWz5c$default3 = (32768 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long color11 = (65536 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long color12 = (131072 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long color13 = (262144 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        long jM2507copywmQWz5c$default4 = (524288 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long color14 = (1048576 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long color15 = (2097152 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long color16 = (4194304 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        long jM2507copywmQWz5c$default5 = (8388608 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long color17 = (16777216 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long color18 = (33554432 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long color19 = (67108864 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        long jM2507copywmQWz5c$default6 = (134217728 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j36;
        long color20 = (268435456 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long color21 = (536870912 & i14) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long color22 = (i14 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long jM2507copywmQWz5c$default7 = (i15 & 1) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j40;
        long color23 = (i15 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long color24 = (i15 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long color25 = (i15 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        long jM2507copywmQWz5c$default8 = (i15 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j44;
        long color26 = (i15 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907010558, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:731)");
        }
        int i16 = i10 << 6;
        int i17 = i10 >> 24;
        int i18 = i11 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 >> 24;
        int i21 = i12 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i12 >> 24;
        int i24 = i13 << 6;
        TextFieldColors textFieldColorsM1096outlinedTextFieldColorsFD9MK7s = m1096outlinedTextFieldColorsFD9MK7s(color, color2, jM2507copywmQWz5c$default, color3, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU2, color4, color5, textSelectionColors2, color6, color7, jM2507copywmQWz5c$default2, color8, color9, color10, jM2507copywmQWz5c$default3, color11, color12, color13, jM2507copywmQWz5c$default4, color14, color15, color16, jM2507copywmQWz5c$default5, color17, color18, color19, jM2507copywmQWz5c$default6, color20, color21, color22, jM2507copywmQWz5c$default7, color23, color24, color25, jM2507copywmQWz5c$default8, color26, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), i19, i22, (i23 & 112) | (i23 & 14) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1096outlinedTextFieldColorsFD9MK7s;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1099textFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, @Nullable Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        composer.startReplaceableGroup(-375683630);
        long color = (i14 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long color2 = (i14 & 2) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i14 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i14 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long color4 = (i14 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long color5 = (i14 & 32) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long color6 = (i14 & 64) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j16;
        long color7 = (i14 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j17;
        long color8 = (i14 & 256) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long color9 = (i14 & 512) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        TextSelectionColors textSelectionColors2 = (i14 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color10 = (i14 & 2048) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j20;
        long color11 = (i14 & 4096) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j21;
        long jM2507copywmQWz5c$default2 = (i14 & 8192) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long color12 = (i14 & 16384) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j23;
        long color13 = (32768 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j24;
        long color14 = (65536 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j25;
        long jM2507copywmQWz5c$default3 = (131072 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color15 = (262144 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j27;
        long color16 = (524288 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j28;
        long color17 = (1048576 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j29;
        long jM2507copywmQWz5c$default4 = (2097152 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color18 = (4194304 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j31;
        long color19 = (8388608 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j32;
        long color20 = (16777216 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j33;
        long color21 = (33554432 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j34;
        long color22 = (67108864 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j35;
        long color23 = (134217728 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        long color24 = (268435456 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long jM2507copywmQWz5c$default5 = (536870912 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long color25 = (i14 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long color26 = (i15 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j40;
        long color27 = (i15 & 2) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long jM2507copywmQWz5c$default6 = (i15 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j42;
        long color28 = (i15 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        long color29 = (i15 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j44;
        long color30 = (i15 & 32) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        long jM2507copywmQWz5c$default7 = (i15 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j46;
        long color31 = (i15 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-375683630, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:357)");
        }
        int i16 = i13 << 12;
        int i17 = i13 >> 18;
        TextFieldColors textFieldColorsM1366colors0hiis_0 = TextFieldDefaults.INSTANCE.m1366colors0hiis_0(color, color2, jM2507copywmQWz5c$default, color3, color4, color5, color6, color7, color8, color9, textSelectionColors2, color10, color11, jM2507copywmQWz5c$default2, color12, color13, color14, jM2507copywmQWz5c$default3, color15, color16, color17, jM2507copywmQWz5c$default4, color18, color19, color20, color21, color22, color23, color24, jM2507copywmQWz5c$default5, color25, 0L, 0L, 0L, 0L, color26, color27, jM2507copywmQWz5c$default6, color28, color29, color30, jM2507copywmQWz5c$default7, color31, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 14) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), (i17 & 14) | 3072 | (i17 & 112) | (i17 & 896), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1366colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1100textFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(-2013303349);
        long color = (i13 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        long jM2507copywmQWz5c$default = (i13 & 2) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color2 = (i13 & 4) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j12;
        long color3 = (i13 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long color4 = (i13 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i13 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i13 & 64) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j15;
        long color6 = (i13 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j16;
        long jM2507copywmQWz5c$default2 = (i13 & 256) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color7 = (i13 & 512) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j18;
        long color8 = (i13 & 1024) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long color9 = (i13 & 2048) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        long jM2507copywmQWz5c$default3 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color10 = (i13 & 8192) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long color11 = (i13 & 16384) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long color12 = (32768 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        long jM2507copywmQWz5c$default4 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color13 = (131072 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long color14 = (262144 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long color15 = (524288 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long color16 = (1048576 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j29;
        long color17 = (2097152 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long color18 = (4194304 & i13) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        long jM2507copywmQWz5c$default5 = (i13 & 8388608) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013303349, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:836)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long color19 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color20 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long color21 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color22 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long color23 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM2507copywmQWz5c$default7 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long color24 = ColorSchemeKt.toColor(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i10 >> 15;
        int i21 = i11 << 15;
        int i22 = (i20 & 57344) | (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i11 >> 15;
        int i24 = i12 << 15;
        int i25 = i12 << 18;
        TextFieldColors textFieldColorsM1099textFieldColorsFD9MK7s = m1099textFieldColorsFD9MK7s(color, color, jM2507copywmQWz5c$default, color, color2, color2, color2, color2, color3, color4, textSelectionColors2, color5, color6, jM2507copywmQWz5c$default2, color7, color8, color9, jM2507copywmQWz5c$default3, color10, color11, color12, jM2507copywmQWz5c$default4, color13, color14, color15, color16, color17, color18, color18, jM2507copywmQWz5c$default5, color18, color19, color20, jM2507copywmQWz5c$default6, color21, color22, color23, jM2507copywmQWz5c$default7, color24, composer, i19, i22, (i23 & 57344) | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), ((i12 >> 6) & 14) | (i24 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1099textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1101textFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, TextSelectionColors textSelectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        composer.startReplaceableGroup(1357676928);
        long color = (i14 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long color2 = (i14 & 2) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i14 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i14 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long color4 = (i14 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long color5 = (i14 & 32) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long color6 = (i14 & 64) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long color7 = (i14 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        TextSelectionColors textSelectionColors2 = (i14 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color8 = (i14 & 512) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j18;
        long color9 = (i14 & 1024) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j19;
        long jM2507copywmQWz5c$default2 = (i14 & 2048) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color10 = (i14 & 4096) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j21;
        long color11 = (i14 & 8192) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long color12 = (i14 & 16384) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        long jM2507copywmQWz5c$default3 = (32768 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long color13 = (65536 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long color14 = (131072 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long color15 = (262144 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        long jM2507copywmQWz5c$default4 = (524288 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long color16 = (1048576 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long color17 = (2097152 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long color18 = (4194304 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        long color19 = (8388608 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j32;
        long color20 = (16777216 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long color21 = (33554432 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long color22 = (67108864 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        long jM2507copywmQWz5c$default5 = (134217728 & i14) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j36;
        long color23 = (268435456 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long color24 = (536870912 & i14) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long color25 = (i14 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        long jM2507copywmQWz5c$default6 = (i15 & 1) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j40;
        long color26 = (i15 & 2) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long color27 = (i15 & 4) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long color28 = (i15 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        long jM2507copywmQWz5c$default7 = (i15 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j44;
        long color29 = (i15 & 32) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1357676928, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:626)");
        }
        int i16 = i10 << 6;
        int i17 = i10 >> 24;
        int i18 = i11 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 >> 24;
        int i21 = i12 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i12 >> 24;
        int i24 = i13 << 6;
        TextFieldColors textFieldColorsM1099textFieldColorsFD9MK7s = m1099textFieldColorsFD9MK7s(color, color2, jM2507copywmQWz5c$default, color3, color4, color4, color4, color5, color6, color7, textSelectionColors2, color8, color9, jM2507copywmQWz5c$default2, color10, color11, color12, jM2507copywmQWz5c$default3, color13, color14, color15, jM2507copywmQWz5c$default4, color16, color17, color18, color19, color20, color21, color22, jM2507copywmQWz5c$default5, color23, color24, color25, jM2507copywmQWz5c$default6, color26, color27, color28, jM2507copywmQWz5c$default7, color29, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), i19, i22, (i23 & 112) | (i23 & 14) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1099textFieldColorsFD9MK7s;
    }
}
