package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u008f\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "", "DateInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/CalendarDate;", "initialDate", "onDateChanged", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "locale", "DateInputTextField-zm97o8M", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/StateData;Landroidx/compose/material3/CalendarDate;Lkotlin/jvm/functions/Function1;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,358:1\n36#2:359\n50#2:366\n49#2:367\n36#2:374\n36#2:382\n1114#3,6:360\n1114#3,6:368\n1114#3,6:375\n1114#3,6:383\n154#4:381\n154#4:392\n154#4:393\n154#4:394\n154#4:395\n76#5:389\n102#5,2:390\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n56#1:359\n62#1:366\n62#1:367\n88#1:374\n167#1:382\n56#1:360,6\n62#1:368,6\n88#1:375,6\n167#1:383,6\n162#1:381\n350#1:392\n351#1:393\n352#1:394\n357#1:395\n111#1:389\n111#1:390,2\n*E\n"})
public final class DateInputKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9862b = Dp.m4389constructorimpl(16);

    /* JADX INFO: compiled from: DateInput.kt */
    @SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,358:1\n50#2:359\n49#2:360\n1114#3,6:361\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$1\n*L\n83#1:359\n83#1:360\n83#1:361,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f9863p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f9864q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.f9863p0 = str;
            this.f9864q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-438341159, iIntValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:79)");
                }
                String str = this.f9863p0;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(str);
                String str2 = this.f9864q0;
                boolean zChanged2 = zChanged | composer2.changed(str2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new u(str, str2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1389Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f9865p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(2);
            this.f9865p0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1914447672, iIntValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:84)");
                }
                TextKt.m1389Text4IGK_g(this.f9865p0, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, v.f14343p0), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class c extends Lambda implements Function1<CalendarDate, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f9866p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StateData stateData) {
            super(1);
            this.f9866p0 = stateData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CalendarDate calendarDate) {
            this.f9866p0.getSelectedStartDate().setValue(calendarDate);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f9867p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f9868q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f9869r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9870s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(StateData stateData, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, int i10) {
            super(2);
            this.f9867p0 = stateData;
            this.f9868q0 = datePickerFormatter;
            this.f9869r0 = function1;
            this.f9870s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f9870s0 | 1);
            DatePickerFormatter datePickerFormatter = this.f9868q0;
            Function1<Long, Boolean> function1 = this.f9869r0;
            DateInputKt.DateInputContent(this.f9867p0, datePickerFormatter, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    @SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,358:1\n1064#2,2:359\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n*L\n132#1:359,2\n*E\n"})
    public static final class e extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateInputFormat f9871p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f9872q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<CalendarDate, Unit> f9873r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ StateData f9874s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ DateInputValidator f9875t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9876u0;
        public final /* synthetic */ Locale v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f9877w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(DateInputFormat dateInputFormat, MutableState<String> mutableState, Function1<? super CalendarDate, Unit> function1, StateData stateData, DateInputValidator dateInputValidator, int i10, Locale locale, MutableState<TextFieldValue> mutableState2) {
            super(1);
            this.f9871p0 = dateInputFormat;
            this.f9872q0 = mutableState;
            this.f9873r0 = function1;
            this.f9874s0 = stateData;
            this.f9875t0 = dateInputValidator;
            this.f9876u0 = i10;
            this.v0 = locale;
            this.f9877w0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue input = textFieldValue;
            Intrinsics.checkNotNullParameter(input, "input");
            int length = input.getText().length();
            DateInputFormat dateInputFormat = this.f9871p0;
            if (length <= dateInputFormat.getPatternWithoutDelimiters().length()) {
                String text = input.getText();
                for (int i10 = 0; i10 < text.length(); i10++) {
                    if (Character.isDigit(text.charAt(i10))) {
                    }
                }
                this.f9877w0.setValue(input);
                String string = StringsKt__StringsKt.trim((CharSequence) input.getText()).toString();
                int length2 = string.length();
                Function1<CalendarDate, Unit> function1 = this.f9873r0;
                MutableState<String> mutableState = this.f9872q0;
                if (length2 != 0 && string.length() >= dateInputFormat.getPatternWithoutDelimiters().length()) {
                    CalendarDate calendarDate = this.f9874s0.getCalendarModel().parse(string, dateInputFormat.getPatternWithoutDelimiters());
                    mutableState.setValue(this.f9875t0.m1052validateXivgLIo(calendarDate, this.f9876u0, this.v0));
                    function1.invoke(mutableState.getValue().length() == 0 ? calendarDate : null);
                } else {
                    mutableState.setValue("");
                    function1.invoke(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class f extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f9878p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MutableState<String> mutableState) {
            super(1);
            this.f9878p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            MutableState<String> mutableState = this.f9878p0;
            if (!kotlin.text.l.isBlank(mutableState.getValue())) {
                SemanticsPropertiesKt.error(semantics, mutableState.getValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f9879p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MutableState<String> mutableState) {
            super(2);
            this.f9879p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785795078, iIntValue, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:171)");
                }
                MutableState<String> mutableState = this.f9879p0;
                if (!kotlin.text.l.isBlank(mutableState.getValue())) {
                    TextKt.m1389Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9880p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9881q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9882r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ StateData f9883s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f9884t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1<CalendarDate, Unit> f9885u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DateInputValidator f9886w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ DateInputFormat f9887x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Locale f9888y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, StateData stateData, CalendarDate calendarDate, Function1<? super CalendarDate, Unit> function1, int i10, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, int i11) {
            super(2);
            this.f9880p0 = modifier;
            this.f9881q0 = function2;
            this.f9882r0 = function3;
            this.f9883s0 = stateData;
            this.f9884t0 = calendarDate;
            this.f9885u0 = function1;
            this.v0 = i10;
            this.f9886w0 = dateInputValidator;
            this.f9887x0 = dateInputFormat;
            this.f9888y0 = locale;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateInputKt.m1051DateInputTextFieldzm97o8M(this.f9880p0, this.f9881q0, this.f9882r0, this.f9883s0, this.f9884t0, this.f9885u0, this.v0, this.f9886w0, this.f9887x0, this.f9888y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class i extends Lambda implements Function0<MutableState<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f9889p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<String> invoke() {
            return SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        }
    }

    /* JADX INFO: compiled from: DateInput.kt */
    public static final class j extends Lambda implements Function0<MutableState<TextFieldValue>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f9890p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f9891q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DateInputFormat f9892r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Locale f9893s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(StateData stateData, CalendarDate calendarDate, DateInputFormat dateInputFormat, Locale locale) {
            super(0);
            this.f9890p0 = stateData;
            this.f9891q0 = calendarDate;
            this.f9892r0 = dateInputFormat;
            this.f9893s0 = locale;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<TextFieldValue> invoke() {
            String withPattern;
            CalendarDate calendarDate = this.f9891q0;
            if (calendarDate == null || (withPattern = this.f9890p0.getCalendarModel().formatWithPattern(calendarDate.getUtcTimeMillis(), this.f9892r0.getPatternWithoutDelimiters(), this.f9893s0)) == null) {
                withPattern = "";
            }
            return SnapshotStateKt.mutableStateOf$default(new TextFieldValue(withPattern, TextRangeKt.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
        }
    }

    static {
        float f6 = 24;
        f9861a = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(10), Dp.m4389constructorimpl(f6), 0.0f, 8, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(@NotNull StateData stateData, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @Nullable Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer composerStartRestartGroup = composer.startRestartGroup(814303288);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(stateData) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(dateFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(dateValidator) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814303288, i12, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:48)");
            }
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputFormat dateInputFormat = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.INSTANCE;
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion.m1266getDateInputInvalidForPatternadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion.m1268getDateInputInvalidYearRangeadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq210 = Strings_androidKt.m1320getStringNWtq28(companion.m1267getDateInputInvalidNotAllowedadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat) | composerStartRestartGroup.changed(dateFormatter);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat, dateFormatter, dateValidator, strM1320getStringNWtq28, strM1320getStringNWtq29, strM1320getStringNWtq210, "");
                composerStartRestartGroup.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strM1320getStringNWtq211 = Strings_androidKt.m1320getStringNWtq28(companion.m1269getDateInputLabeladMyvUU(), composerStartRestartGroup, 6);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f9861a);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -438341159, true, new a(strM1320getStringNWtq211, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1914447672, true, new b(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new c(stateData);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            m1051DateInputTextFieldzm97o8M(modifierPadding, composableLambda, composableLambda2, stateData, value, (Function1) objRememberedValue3, InputIdentifier.INSTANCE.m1155getSingleDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, localeDefaultLocale, composerStartRestartGroup, ((i12 << 9) & 7168) | 1075315126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(stateData, dateFormatter, dateValidator, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: DateInputTextField-zm97o8M, reason: not valid java name */
    public static final void m1051DateInputTextFieldzm97o8M(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @NotNull StateData stateData, @Nullable CalendarDate calendarDate, @NotNull Function1<? super CalendarDate, Unit> onDateChanged, int i10, @NotNull DateInputValidator dateInputValidator, @NotNull DateInputFormat dateInputFormat, @NotNull Locale locale, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(onDateChanged, "onDateChanged");
        Intrinsics.checkNotNullParameter(dateInputValidator, "dateInputValidator");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Composer composerStartRestartGroup = composer.startRestartGroup(626552973);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626552973, i11, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) i.f9889p0, composerStartRestartGroup, 3080, 6);
        MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) new j(stateData, calendarDate, dateInputFormat, locale), composerStartRestartGroup, 72, 4);
        TextFieldValue textFieldValue = (TextFieldValue) mutableStateRememberSaveable.getValue();
        e eVar = new e(dateInputFormat, mutableState, onDateChanged, stateData, dateInputValidator, i10, locale, mutableStateRememberSaveable);
        Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, kotlin.text.l.isBlank((CharSequence) mutableState.getValue()) ^ true ? Dp.m4389constructorimpl(0) : f9862b, 7, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new f(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i12 = i11 << 15;
        OutlinedTextFieldKt.OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) eVar, SemanticsModifierKt.semantics$default(modifierM300paddingqDBjuR0$default, false, (Function1) objRememberedValue, 1, null), false, false, (TextStyle) null, function2, function3, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 785795078, true, new g(mutableState)), !kotlin.text.l.isBlank((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m4165getNumberPjHm6EE(), ImeAction.INSTANCE.m4117getDoneeUduSuo(), 1, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composerStartRestartGroup, (3670016 & i12) | (i12 & 29360128), 12779904, 0, 8195896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, function2, function3, stateData, calendarDate, onDateChanged, i10, dateInputValidator, dateInputFormat, locale, i11));
    }

    @NotNull
    public static final PaddingValues getInputTextFieldPadding() {
        return f9861a;
    }
}
