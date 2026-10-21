package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"getString", "", "string", "Landroidx/compose/material3/Strings;", "getString-NWtq2-8", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-iSCLEhQ", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,211:1\n76#2:212\n76#2:213\n76#2:214\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n*L\n30#1:212\n31#1:213\n208#1:214\n*E\n"})
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    @NotNull
    /* JADX INFO: renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m1320getStringNWtq28(int i10, @Nullable Composer composer, int i11) {
        String string;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i11, -1, "androidx.compose.material3.getString (Strings.android.kt:28)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m1253equalsimpl0(i10, companion.m1300getNavigationMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1262getCloseDraweradMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1263getCloseSheetadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1295getDefaultErrorMessageadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1297getExposedDropdownMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1303getSliderRangeStartadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_start)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1302getSliderRangeEndadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_end)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1296getDialogadMyvUU())) {
            string = resources.getString(R.string.dialog);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1299getMenuExpandedadMyvUU())) {
            string = resources.getString(R.string.expanded);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1298getMenuCollapsedadMyvUU())) {
            string = resources.getString(R.string.collapsed);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…rial3.R.string.collapsed)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1304getSnackbarDismissadMyvUU())) {
            string = resources.getString(R.string.snackbar_dismiss);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …nackbar_dismiss\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1301getSearchBarSearchadMyvUU())) {
            string = resources.getString(R.string.search_bar_search);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …arch_bar_search\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1305getSuggestionsAvailableadMyvUU())) {
            string = resources.getString(R.string.suggestions_available);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…ng.suggestions_available)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1284getDatePickerTitleadMyvUU())) {
            string = resources.getString(R.string.date_picker_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …te_picker_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1272getDatePickerHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_picker_headline);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …picker_headline\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1286getDatePickerYearPickerPaneTitleadMyvUU())) {
            string = resources.getString(R.string.date_picker_year_picker_pane_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …cker_pane_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1283getDatePickerSwitchToYearSelectionadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_year_selection);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_year_selection\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1279getDatePickerSwitchToDaySelectionadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_day_selection);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …o_day_selection\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1281getDatePickerSwitchToNextMonthadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_next_month);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …h_to_next_month\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1282getDatePickerSwitchToPreviousMonthadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1274getDatePickerNavigateToYearDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_navigate_to_year_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ear_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1273getDatePickerHeadlineDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_headline_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1275getDatePickerNoSelectionDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_no_selection_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ion_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1285getDatePickerTodayDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_today_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …day_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1277getDatePickerScrollToShowLaterYearsadMyvUU())) {
            string = resources.getString(R.string.date_picker_scroll_to_later_years);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_to_later_years\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1276getDatePickerScrollToShowEarlierYearsadMyvUU())) {
            string = resources.getString(R.string.date_picker_scroll_to_earlier_years);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …o_earlier_years\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1271getDateInputTitleadMyvUU())) {
            string = resources.getString(R.string.date_input_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ate_input_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1264getDateInputHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_input_headline);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_input_headline\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1269getDateInputLabeladMyvUU())) {
            string = resources.getString(R.string.date_input_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ate_input_label\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1265getDateInputHeadlineDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_input_headline_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1270getDateInputNoInputDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_input_no_input_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …put_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1267getDateInputInvalidNotAllowedadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_not_allowed);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …lid_not_allowed\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1266getDateInputInvalidForPatternadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_for_pattern);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …lid_for_pattern\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1268getDateInputInvalidYearRangeadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_year_range);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …alid_year_range\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1278getDatePickerSwitchToCalendarModeadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_calendar_mode);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …o_calendar_mode\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1280getDatePickerSwitchToInputModeadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_input_mode);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …h_to_input_mode\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1294getDateRangePickerTitleadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ge_picker_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1293getDateRangePickerStartHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_start_headline);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_start_headline\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1290getDateRangePickerEndHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_end_headline);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …er_end_headline\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1291getDateRangePickerScrollToShowNextMonthadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_scroll_to_next_month);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …l_to_next_month\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1292getDateRangePickerScrollToShowPreviousMonthadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_scroll_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1289getDateRangePickerDayInRangeadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_day_in_range);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …er_day_in_range\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1288getDateRangeInputTitleadMyvUU())) {
            string = resources.getString(R.string.date_range_input_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …nge_input_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1287getDateRangeInputInvalidRangeInputadMyvUU())) {
            string = resources.getString(R.string.date_range_input_invalid_range_input);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …lid_range_input\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1260getBottomSheetPaneTitleadMyvUU())) {
            string = resources.getString(R.string.m3c_bottom_sheet_pane_title);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …heet_pane_title\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1258getBottomSheetDragHandleDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_drag_handle_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …dle_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1261getBottomSheetPartialExpandDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_collapse_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …pse_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1257getBottomSheetDismissDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_dismiss_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …iss_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1259getBottomSheetExpandDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_expand_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …and_description\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1318getTooltipLongPressLabeladMyvUU())) {
            string = resources.getString(R.string.tooltip_long_press_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ong_press_label\n        )");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1307getTimePickerAMadMyvUU())) {
            string = resources.getString(R.string.time_picker_am);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   ….R.string.time_picker_am)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1316getTimePickerPMadMyvUU())) {
            string = resources.getString(R.string.time_picker_pm);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   ….R.string.time_picker_pm)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1317getTimePickerPeriodToggleadMyvUU())) {
            string = resources.getString(R.string.time_picker_period_toggle_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …eriod_toggle_description)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1313getTimePickerMinuteSelectionadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_selection);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …_picker_minute_selection)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1309getTimePickerHourSelectionadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_selection);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …me_picker_hour_selection)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1310getTimePickerHourSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_suffix);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   ….time_picker_hour_suffix)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1314getTimePickerMinuteSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_suffix);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ime_picker_minute_suffix)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1306getTimePicker24HourSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_24h_suffix);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …e_picker_hour_24h_suffix)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1308getTimePickerHouradMyvUU())) {
            string = resources.getString(R.string.time_picker_hour);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   ….string.time_picker_hour)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1312getTimePickerMinuteadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …tring.time_picker_minute)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1311getTimePickerHourTextFieldadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_text_field);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …e_picker_hour_text_field)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1315getTimePickerMinuteTextFieldadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_text_field);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …picker_minute_text_field)");
        } else if (Strings.m1253equalsimpl0(i10, companion.m1319getTooltipPaneDescriptionadMyvUU())) {
            string = resources.getString(R.string.tooltip_pane_description);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …tooltip_pane_description)");
        } else {
            string = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* JADX INFO: renamed from: getString-iSCLEhQ, reason: not valid java name */
    public static final String m1321getStringiSCLEhQ(int i10, @NotNull Object[] formatArgs, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126124681, i11, -1, "androidx.compose.material3.getString (Strings.android.kt:204)");
        }
        String strM1320getStringNWtq28 = m1320getStringNWtq28(i10, composer, i11 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(formatArgs, formatArgs.length);
        String str = String.format(locale, strM1320getStringNWtq28, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
