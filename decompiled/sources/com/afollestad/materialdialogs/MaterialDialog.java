package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CheckResult;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.list.DialogAdapter;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.message.DialogMessageSettings;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.DialogsKt;
import com.afollestad.materialdialogs.utils.FontsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaterialDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B\u001c\u0012\u0006\u0010z\u001a\u00020u\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020{¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00102\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u0017J\u0006\u0010\u001b\u001a\u00020\u0000JC\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001c\u0010\u0017J\u0006\u0010\u001d\u001a\u00020\u0000JE\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\b\u0010\u001f\u001a\u00020\u0000H\u0007J\b\u0010 \u001a\u00020\u0000H\u0007J%\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010)\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020(H\u0007J\b\u0010*\u001a\u00020\u0013H\u0016J\"\u0010*\u001a\u00020\u00002\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020(J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010,\u001a\u00020(H\u0017J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020(J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020(H\u0017J\b\u00100\u001a\u00020\u0013H\u0016J\u0017\u00105\u001a\u00020\u00132\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000207068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R*\u0010C\u001a\u00020(2\u0006\u0010<\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR.\u0010K\u001a\u0004\u0018\u00010D2\b\u0010<\u001a\u0004\u0018\u00010D8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR.\u0010O\u001a\u0004\u0018\u00010D2\b\u0010<\u001a\u0004\u0018\u00010D8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR.\u0010S\u001a\u0004\u0018\u00010D2\b\u0010<\u001a\u0004\u0018\u00010D8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR*\u0010.\u001a\u00020(2\u0006\u0010<\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR*\u0010,\u001a\u00020(2\u0006\u0010<\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010>\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR.\u0010&\u001a\u0004\u0018\u00010$2\b\u0010<\u001a\u0004\u0018\u00010$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0017\u0010e\u001a\u00020`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR0\u0010k\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00180f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR0\u0010n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00180f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR0\u0010q\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00180f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010h\u001a\u0004\bp\u0010jR0\u0010t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00180f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010h\u001a\u0004\bs\u0010jR\u0017\u0010z\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010\u0080\u0001\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "Landroid/app/Dialog;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "config", "(Ljava/lang/String;)Ljava/lang/Object;", "", "res", "Landroid/graphics/drawable/Drawable;", PluginUtils.IDENTIFIER_DRAWABLE, "icon", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lcom/afollestad/materialdialogs/MaterialDialog;", "text", "title", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog;", "", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "", "Lkotlin/ExtensionFunctionType;", "applySettings", "message", "(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "click", "positiveButton", "clearPositiveListeners", "negativeButton", "clearNegativeListeners", "neutralButton", "clearNeutralListeners", "noAutoDismiss", "literal", "maxWidth", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;", "", "literalDp", "cornerRadius", "(Ljava/lang/Float;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;", "", "debugMode", "show", "func", "cancelable", "setCancelable", "cancelOnTouchOutside", "setCanceledOnTouchOutside", "dismiss", "Lcom/afollestad/materialdialogs/WhichButton;", RootService.WHICH, "onActionButtonClicked$com_afollestad_material_dialogs_core", "(Lcom/afollestad/materialdialogs/WhichButton;)V", "onActionButtonClicked", "", "", "p0", "Ljava/util/Map;", "getConfig", "()Ljava/util/Map;", "<set-?>", "q0", "Z", "getAutoDismissEnabled", "()Z", "setAutoDismissEnabled$com_afollestad_material_dialogs_core", "(Z)V", "autoDismissEnabled", "Landroid/graphics/Typeface;", "r0", "Landroid/graphics/Typeface;", "getTitleFont", "()Landroid/graphics/Typeface;", "setTitleFont$com_afollestad_material_dialogs_core", "(Landroid/graphics/Typeface;)V", "titleFont", "s0", "getBodyFont", "setBodyFont$com_afollestad_material_dialogs_core", "bodyFont", "t0", "getButtonFont", "setButtonFont$com_afollestad_material_dialogs_core", "buttonFont", "u0", "getCancelOnTouchOutside", "setCancelOnTouchOutside$com_afollestad_material_dialogs_core", "v0", "getCancelable", "setCancelable$com_afollestad_material_dialogs_core", "w0", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius$com_afollestad_material_dialogs_core", "(Ljava/lang/Float;)V", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "y0", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "view", "", "E0", "Ljava/util/List;", "getPreShowListeners$com_afollestad_material_dialogs_core", "()Ljava/util/List;", "preShowListeners", "F0", "getShowListeners$com_afollestad_material_dialogs_core", "showListeners", "G0", "getDismissListeners$com_afollestad_material_dialogs_core", "dismissListeners", "H0", "getCancelListeners$com_afollestad_material_dialogs_core", "cancelListeners", "Landroid/content/Context;", "L0", "Landroid/content/Context;", "getWindowContext", "()Landroid/content/Context;", "windowContext", "Lcom/afollestad/materialdialogs/DialogBehavior;", "M0", "Lcom/afollestad/materialdialogs/DialogBehavior;", "getDialogBehavior", "()Lcom/afollestad/materialdialogs/DialogBehavior;", "dialogBehavior", "<init>", "(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)V", "Companion", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class MaterialDialog extends Dialog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static DialogBehavior N0 = ModalDialog.INSTANCE;

    @NotNull
    public final ArrayList E0;

    @NotNull
    public final ArrayList F0;

    @NotNull
    public final ArrayList G0;

    @NotNull
    public final ArrayList H0;
    public final ArrayList I0;
    public final ArrayList J0;
    public final ArrayList K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final Context windowContext;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @NotNull
    public final DialogBehavior dialogBehavior;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f25453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public boolean autoDismissEnabled;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Typeface titleFont;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Typeface bodyFont;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Typeface buttonFont;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public boolean cancelOnTouchOutside;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean cancelable;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float cornerRadius;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Px
    public Integer f25460x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DialogLayout view;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WhichButton.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[WhichButton.POSITIVE.ordinal()] = 1;
            iArr[WhichButton.NEGATIVE.ordinal()] = 2;
            iArr[WhichButton.NEUTRAL.ordinal()] = 3;
        }
    }

    /* JADX INFO: compiled from: MaterialDialog.kt */
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(ColorsKt.resolveColor$default(MaterialDialog.this, null, Integer.valueOf(R.attr.colorBackgroundFloating), null, 5, null));
        }
    }

    public /* synthetic */ MaterialDialog(Context context, DialogBehavior dialogBehavior, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? N0 : dialogBehavior);
    }

    public static /* synthetic */ MaterialDialog cornerRadius$default(MaterialDialog materialDialog, Float f6, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        return materialDialog.cornerRadius(f6, num);
    }

    public static /* synthetic */ MaterialDialog debugMode$default(MaterialDialog materialDialog, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return materialDialog.debugMode(z10);
    }

    @NotNull
    public static final DialogBehavior getDEFAULT_BEHAVIOR() {
        return N0;
    }

    public static /* synthetic */ MaterialDialog icon$default(MaterialDialog materialDialog, Integer num, Drawable drawable, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            drawable = null;
        }
        return materialDialog.icon(num, drawable);
    }

    public static /* synthetic */ MaterialDialog maxWidth$default(MaterialDialog materialDialog, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        return materialDialog.maxWidth(num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialDialog message$default(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            charSequence = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return materialDialog.message(num, charSequence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialDialog negativeButton$default(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            charSequence = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return materialDialog.negativeButton(num, charSequence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialDialog neutralButton$default(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            charSequence = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return materialDialog.neutralButton(num, charSequence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialDialog positiveButton$default(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            charSequence = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return materialDialog.positiveButton(num, charSequence, function1);
    }

    public static final void setDEFAULT_BEHAVIOR(@NotNull DialogBehavior dialogBehavior) {
        N0 = dialogBehavior;
    }

    public static /* synthetic */ MaterialDialog title$default(MaterialDialog materialDialog, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return materialDialog.title(num, str);
    }

    public final void a() {
        int iResolveColor$default = ColorsKt.resolveColor$default(this, null, Integer.valueOf(R.attr.md_background_color), new a(), 1, null);
        Float f6 = this.cornerRadius;
        float fFloatValue = f6 != null ? f6.floatValue() : MDUtil.resolveDimen$default(MDUtil.INSTANCE, this.windowContext, R.attr.md_corner_radius, 0.0f, 4, null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.dialogBehavior.setBackgroundColor(this.view, iResolveColor$default, fFloatValue);
    }

    @NotNull
    public final MaterialDialog cancelOnTouchOutside(boolean cancelable) {
        setCanceledOnTouchOutside(cancelable);
        return this;
    }

    @NotNull
    public final MaterialDialog cancelable(boolean cancelable) {
        setCancelable(cancelable);
        return this;
    }

    @NotNull
    public final MaterialDialog clearNegativeListeners() {
        this.J0.clear();
        return this;
    }

    @Deprecated(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    @NotNull
    public final MaterialDialog clearNeutralListeners() {
        this.K0.clear();
        return this;
    }

    @NotNull
    public final MaterialDialog clearPositiveListeners() {
        this.I0.clear();
        return this;
    }

    public final <T> T config(@NotNull String key) {
        return (T) this.f25453p0.get(key);
    }

    @NotNull
    public final MaterialDialog cornerRadius(@Nullable Float literalDp, @DimenRes @Nullable Integer res) {
        Float fValueOf;
        MDUtil.INSTANCE.assertOneSet("cornerRadius", literalDp, res);
        Context context = this.windowContext;
        if (res != null) {
            fValueOf = Float.valueOf(context.getResources().getDimension(res.intValue()));
        } else {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "windowContext.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (literalDp == null) {
                Intrinsics.throwNpe();
            }
            fValueOf = Float.valueOf(TypedValue.applyDimension(1, literalDp.floatValue(), displayMetrics));
        }
        this.cornerRadius = fValueOf;
        a();
        return this;
    }

    @CheckResult
    @NotNull
    public final MaterialDialog debugMode(boolean debugMode) {
        this.view.setDebugMode(debugMode);
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.dialogBehavior.onDismiss()) {
            return;
        }
        DialogsKt.hideKeyboard(this);
        super.dismiss();
    }

    public final boolean getAutoDismissEnabled() {
        return this.autoDismissEnabled;
    }

    @Nullable
    public final Typeface getBodyFont() {
        return this.bodyFont;
    }

    @Nullable
    public final Typeface getButtonFont() {
        return this.buttonFont;
    }

    @NotNull
    public final List<Function1<MaterialDialog, Unit>> getCancelListeners$com_afollestad_material_dialogs_core() {
        return this.H0;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final Map<String, Object> getConfig() {
        return this.f25453p0;
    }

    @Nullable
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final DialogBehavior getDialogBehavior() {
        return this.dialogBehavior;
    }

    @NotNull
    public final List<Function1<MaterialDialog, Unit>> getDismissListeners$com_afollestad_material_dialogs_core() {
        return this.G0;
    }

    @NotNull
    public final List<Function1<MaterialDialog, Unit>> getPreShowListeners$com_afollestad_material_dialogs_core() {
        return this.E0;
    }

    @NotNull
    public final List<Function1<MaterialDialog, Unit>> getShowListeners$com_afollestad_material_dialogs_core() {
        return this.F0;
    }

    @Nullable
    public final Typeface getTitleFont() {
        return this.titleFont;
    }

    @NotNull
    public final DialogLayout getView() {
        return this.view;
    }

    @NotNull
    public final Context getWindowContext() {
        return this.windowContext;
    }

    @NotNull
    public final MaterialDialog icon(@DrawableRes @Nullable Integer res, @Nullable Drawable drawable) {
        MDUtil.INSTANCE.assertOneSet("icon", drawable, res);
        DialogsKt.populateIcon(this, this.view.getTitleLayout().getIconView$com_afollestad_material_dialogs_core(), res, drawable);
        return this;
    }

    @NotNull
    public final MaterialDialog maxWidth(@DimenRes @Nullable Integer res, @Px @Nullable Integer literal) {
        MDUtil.INSTANCE.assertOneSet("maxWidth", res, literal);
        Integer num = this.f25460x0;
        boolean z10 = num != null && num.intValue() == 0;
        Context context = this.windowContext;
        if (res != null) {
            literal = Integer.valueOf(context.getResources().getDimensionPixelSize(res.intValue()));
        } else if (literal == null) {
            Intrinsics.throwNpe();
        }
        this.f25460x0 = literal;
        if (z10) {
            Window window = getWindow();
            if (window == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(window, "window!!");
            this.dialogBehavior.setWindowConstraints(context, window, this.view, literal);
        }
        return this;
    }

    @NotNull
    public final MaterialDialog message(@StringRes @Nullable Integer res, @Nullable CharSequence text, @Nullable Function1<? super DialogMessageSettings, Unit> applySettings) {
        MDUtil.INSTANCE.assertOneSet("message", text, res);
        this.view.getContentLayout().setMessage(this, res, text, this.bodyFont, applySettings);
        return this;
    }

    @NotNull
    public final MaterialDialog negativeButton(@StringRes @Nullable Integer res, @Nullable CharSequence text, @Nullable Function1<? super MaterialDialog, Unit> click) {
        if (click != null) {
            this.J0.add(click);
        }
        DialogActionButton actionButton = DialogActionExtKt.getActionButton(this, WhichButton.NEGATIVE);
        if (res == null && text == null && ViewsKt.isVisible(actionButton)) {
            return this;
        }
        DialogsKt.populateText(this, actionButton, res, text, android.R.string.cancel, this.buttonFont, Integer.valueOf(R.attr.md_color_button_text));
        return this;
    }

    @Deprecated(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    @NotNull
    public final MaterialDialog neutralButton(@StringRes @Nullable Integer res, @Nullable CharSequence text, @Nullable Function1<? super MaterialDialog, Unit> click) {
        if (click != null) {
            this.K0.add(click);
        }
        DialogActionButton actionButton = DialogActionExtKt.getActionButton(this, WhichButton.NEUTRAL);
        if (res == null && text == null && ViewsKt.isVisible(actionButton)) {
            return this;
        }
        DialogsKt.populateText(this, actionButton, (40 & 2) != 0 ? null : res, (40 & 4) != 0 ? null : text, (40 & 8) != 0 ? 0 : 0, this.buttonFont, (40 & 32) != 0 ? null : null);
        return this;
    }

    @CheckResult
    @NotNull
    public final MaterialDialog noAutoDismiss() {
        this.autoDismissEnabled = false;
        return this;
    }

    public final void onActionButtonClicked$com_afollestad_material_dialogs_core(@NotNull WhichButton which) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[which.ordinal()];
        if (i10 == 1) {
            DialogCallbackExtKt.invokeAll(this.I0, this);
            Object listAdapter = DialogListExtKt.getListAdapter(this);
            if (!(listAdapter instanceof DialogAdapter)) {
                listAdapter = null;
            }
            DialogAdapter dialogAdapter = (DialogAdapter) listAdapter;
            if (dialogAdapter != null) {
                dialogAdapter.positiveButtonClicked();
            }
        } else if (i10 == 2) {
            DialogCallbackExtKt.invokeAll(this.J0, this);
        } else if (i10 == 3) {
            DialogCallbackExtKt.invokeAll(this.K0, this);
        }
        if (this.autoDismissEnabled) {
            dismiss();
        }
    }

    @NotNull
    public final MaterialDialog positiveButton(@StringRes @Nullable Integer res, @Nullable CharSequence text, @Nullable Function1<? super MaterialDialog, Unit> click) {
        if (click != null) {
            this.I0.add(click);
        }
        DialogActionButton actionButton = DialogActionExtKt.getActionButton(this, WhichButton.POSITIVE);
        if (res == null && text == null && ViewsKt.isVisible(actionButton)) {
            return this;
        }
        DialogsKt.populateText(this, actionButton, res, text, android.R.string.ok, this.buttonFont, Integer.valueOf(R.attr.md_color_button_text));
        return this;
    }

    public final void setAutoDismissEnabled$com_afollestad_material_dialogs_core(boolean z10) {
        this.autoDismissEnabled = z10;
    }

    public final void setBodyFont$com_afollestad_material_dialogs_core(@Nullable Typeface typeface) {
        this.bodyFont = typeface;
    }

    public final void setButtonFont$com_afollestad_material_dialogs_core(@Nullable Typeface typeface) {
        this.buttonFont = typeface;
    }

    public final void setCancelOnTouchOutside$com_afollestad_material_dialogs_core(boolean z10) {
        this.cancelOnTouchOutside = z10;
    }

    @Override // android.app.Dialog
    @Deprecated(message = "Use fluent cancelable(Boolean) instead.", replaceWith = @ReplaceWith(expression = "cancelable(cancelable)", imports = {}))
    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
        super.setCancelable(cancelable);
    }

    public final void setCancelable$com_afollestad_material_dialogs_core(boolean z10) {
        this.cancelable = z10;
    }

    @Override // android.app.Dialog
    @Deprecated(message = "Use fluent cancelOnTouchOutside(Boolean) instead.", replaceWith = @ReplaceWith(expression = "cancelOnTouchOutside(cancelOnTouchOutside)", imports = {}))
    public void setCanceledOnTouchOutside(boolean cancelOnTouchOutside) {
        this.cancelOnTouchOutside = cancelOnTouchOutside;
        super.setCanceledOnTouchOutside(cancelOnTouchOutside);
    }

    public final void setCornerRadius$com_afollestad_material_dialogs_core(@Nullable Float f6) {
        this.cornerRadius = f6;
    }

    public final void setTitleFont$com_afollestad_material_dialogs_core(@Nullable Typeface typeface) {
        this.titleFont = typeface;
    }

    @NotNull
    public final MaterialDialog show(@NotNull Function1<? super MaterialDialog, Unit> func) {
        func.invoke(this);
        show();
        return this;
    }

    @NotNull
    public final MaterialDialog title(@StringRes @Nullable Integer res, @Nullable String text) {
        MDUtil.INSTANCE.assertOneSet("title", text, res);
        DialogsKt.populateText(this, this.view.getTitleLayout().getTitleView$com_afollestad_material_dialogs_core(), (40 & 2) != 0 ? null : res, (40 & 4) != 0 ? null : text, (40 & 8) != 0 ? 0 : 0, this.titleFont, (40 & 32) != 0 ? null : Integer.valueOf(R.attr.md_color_title));
        return this;
    }

    public MaterialDialog(@NotNull Context context, @NotNull DialogBehavior dialogBehavior) {
        super(context, ThemeKt.inferTheme(context, dialogBehavior));
        this.windowContext = context;
        this.dialogBehavior = dialogBehavior;
        this.f25453p0 = new LinkedHashMap();
        this.autoDismissEnabled = true;
        this.cancelOnTouchOutside = true;
        this.cancelable = true;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(window, "window!!");
        Intrinsics.checkExpressionValueIsNotNull(layoutInflater, "layoutInflater");
        ViewGroup viewGroupCreateView = dialogBehavior.createView(context, window, layoutInflater, this);
        setContentView(viewGroupCreateView);
        DialogLayout dialogLayout = dialogBehavior.getDialogLayout(viewGroupCreateView);
        dialogLayout.attachDialog(this);
        this.view = dialogLayout;
        this.titleFont = FontsKt.font$default(this, null, Integer.valueOf(R.attr.md_font_title), 1, null);
        this.bodyFont = FontsKt.font$default(this, null, Integer.valueOf(R.attr.md_font_body), 1, null);
        this.buttonFont = FontsKt.font$default(this, null, Integer.valueOf(R.attr.md_font_button), 1, null);
        a();
    }

    @Override // android.app.Dialog
    public void show() {
        Integer num = this.f25460x0;
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(window, "window!!");
        DialogLayout dialogLayout = this.view;
        Context context = this.windowContext;
        DialogBehavior dialogBehavior = this.dialogBehavior;
        dialogBehavior.setWindowConstraints(context, window, dialogLayout, num);
        DialogsKt.preShow(this);
        dialogBehavior.onPreShow(this);
        super.show();
        dialogBehavior.onPostShow(this);
    }

    /* JADX INFO: compiled from: MaterialDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog$Companion;", "", "()V", "DEFAULT_BEHAVIOR", "Lcom/afollestad/materialdialogs/DialogBehavior;", "DEFAULT_BEHAVIOR$annotations", "getDEFAULT_BEHAVIOR", "()Lcom/afollestad/materialdialogs/DialogBehavior;", "setDEFAULT_BEHAVIOR", "(Lcom/afollestad/materialdialogs/DialogBehavior;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialogBehavior getDEFAULT_BEHAVIOR() {
            return MaterialDialog.N0;
        }

        public final void setDEFAULT_BEHAVIOR(@NotNull DialogBehavior dialogBehavior) {
            MaterialDialog.N0 = dialogBehavior;
        }

        @JvmStatic
        public static /* synthetic */ void DEFAULT_BEHAVIOR$annotations() {
        }
    }
}
