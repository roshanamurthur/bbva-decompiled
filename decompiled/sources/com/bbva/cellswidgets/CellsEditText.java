package com.bbva.cellswidgets;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.databinding.ContentEditTextBinding;
import com.bbva.cellswidgets.databinding.ContentEditTextDefaultBinding;
import com.bbva.cellswidgets.edittext.CellsEditTextViewModel;
import com.bbva.cellswidgets.edittext.CellsInputType;
import com.bbva.cellswidgets.edittext.CellsInputTypeKt;
import com.bbva.cellswidgets.extension.DefaultCellsEditTextKt;
import com.bbva.cellswidgets.model.Accessibility;
import com.bbva.cellswidgets.model.CellsEditTextConfig;
import com.bbva.cellswidgets.model.CellsEditTextState;
import com.bbva.cellswidgets.model.ValidationRule;
import com.bbva.cellswidgets.transformations.PasswordTransformation;
import com.bbva.cellswidgets.transformations.PlainCharTransformation;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.l;
import n4.i;
import n4.j;
import n4.k;
import n4.q;
import n4.r;
import n4.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsEditText.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B*\b\u0007\u0012\u0006\u0010}\u001a\u00020|\u0012\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010~\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001B/\b\u0017\u0012\u0006\u0010}\u001a\u00020|\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u0003\u0012\u0007\u0010\u0083\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J*\u0010\u0011\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0018\u001a\u00020\u000e2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014JU\u0010\"\u001a\u00020\u000e2M\u0010!\u001aI\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00070\u0019J\u0006\u0010#\u001a\u00020\u0007J\u0014\u0010'\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$J\u0010\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0015J\u0010\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0015J\u0017\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b.\u0010/J\u000e\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u000eJ\u0006\u00103\u001a\u00020\u000eJ\u0006\u00104\u001a\u00020\u000eJ\u0006\u00105\u001a\u00020\u000eJ\u0010\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0015H\u0002R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010AR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010IR\u001b\u0010N\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010IR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bY\u0010ZR?\u0010d\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u000e\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR?\u0010j\u001a\u001f\u0012\u0013\u0012\u00110e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010_\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cRk\u0010q\u001aK\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010]\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010{\u001a\u0004\u0018\u00010\u00152\b\u0010r\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006\u0085\u0001"}, d2 = {"Lcom/bbva/cellswidgets/CellsEditText;", "Landroid/widget/LinearLayout;", "Landroid/text/TextWatcher;", "", "extraSpace", "", "onCreateDrawableState", "", "hasFocus", "", "s", EventDataKeys.Lifecycle.LIFECYCLE_START, "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "", "", "", "map", "setConfig", "Lkotlin/Function3;", "Landroid/widget/TextView;", "Lkotlin/ParameterName;", "name", "view", "actionId", "Landroid/view/KeyEvent;", "event", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnEditorActionListener", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "validations", "setValidations", "getValidations", "inputType", "setInputType", "newMask", "applyMask", "length", "setMaxLength", "(Ljava/lang/Integer;)V", LogKeysKt.TAG, "setTagEditText", "requestFocusEditText", "disableChilds", "enableChilds", "removeFilters", "regex", "setFilter", "Landroidx/appcompat/widget/AppCompatEditText;", "x0", "Lkotlin/Lazy;", "getEditText", "()Landroidx/appcompat/widget/AppCompatEditText;", "editText", "Landroidx/appcompat/widget/AppCompatImageButton;", "y0", "getActionButton", "()Landroidx/appcompat/widget/AppCompatImageButton;", "actionButton", "E0", "getLeftActionButton", "leftActionButton", "Lcom/bbva/cellswidgets/CellsTextView;", "F0", "getHintTextView", "()Lcom/bbva/cellswidgets/CellsTextView;", "hintTextView", "G0", "getErrorLayout", "()Landroid/widget/LinearLayout;", "errorLayout", "H0", "getErrorLabel", "errorLabel", "Lcom/bbva/cellswidgets/edittext/CellsEditTextViewModel;", "I0", "getViewModel", "()Lcom/bbva/cellswidgets/edittext/CellsEditTextViewModel;", "viewModel", "Lcom/bbva/cellswidgets/PropertyLoader;", "J0", "getPropertyLoader", "()Lcom/bbva/cellswidgets/PropertyLoader;", "propertyLoader", "Lkotlin/Function1;", "text", "K0", "Lkotlin/jvm/functions/Function1;", "getOnTextChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnTextChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onTextChangeListener", "Lcom/bbva/cellswidgets/model/CellsEditTextState;", "state", "L0", "getOnTextChangeStateListener", "setOnTextChangeStateListener", "onTextChangeStateListener", "M0", "Lkotlin/jvm/functions/Function3;", "getOnTextChangedListener", "()Lkotlin/jvm/functions/Function3;", "setOnTextChangedListener", "(Lkotlin/jvm/functions/Function3;)V", "onTextChangedListener", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "getMask", "()Ljava/lang/String;", "setMask", "(Ljava/lang/String;)V", "mask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsEditText.kt\ncom/bbva/cellswidgets/CellsEditText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,503:1\n1#2:504\n26#3:505\n*S KotlinDebug\n*F\n+ 1 CellsEditText.kt\ncom/bbva/cellswidgets/CellsEditText\n*L\n447#1:505\n*E\n"})
public final class CellsEditText extends LinearLayout implements TextWatcher {
    public static final /* synthetic */ int N0 = 0;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final Lazy leftActionButton;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @NotNull
    public final Lazy hintTextView;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    public final Lazy errorLayout;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public final Lazy errorLabel;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public final Lazy propertyLoader;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super CharSequence, Unit> onTextChangeListener;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super CellsEditTextState, Unit> onTextChangeStateListener;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @Nullable
    public Function3<? super String, ? super Integer, ? super Integer, Unit> onTextChangedListener;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public MaskTextWatcher f27240p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Typeface f27241q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f27242r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f27243s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public ValueAnimator f27244t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f27245u0;

    @Nullable
    public final ContentEditTextBinding v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public final ContentEditTextDefaultBinding f27246w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy editText;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy actionButton;

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class a extends Lambda implements Function0<AppCompatImageButton> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppCompatImageButton invoke() {
            AppCompatImageButton appCompatImageButton;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (appCompatImageButton = contentEditTextBinding.actionButton) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                appCompatImageButton = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.actionButton : null;
                Intrinsics.checkNotNull(appCompatImageButton);
            }
            return appCompatImageButton;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class b extends Lambda implements Function0<AppCompatEditText> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppCompatEditText invoke() {
            AppCompatEditText appCompatEditText;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (appCompatEditText = contentEditTextBinding.editText) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                appCompatEditText = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.editText : null;
                Intrinsics.checkNotNull(appCompatEditText);
            }
            return appCompatEditText;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class c extends Lambda implements Function0<CellsTextView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellsTextView invoke() {
            CellsTextView cellsTextView;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (cellsTextView = contentEditTextBinding.errorLabel) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                cellsTextView = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.errorLabel : null;
                Intrinsics.checkNotNull(cellsTextView);
            }
            return cellsTextView;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class d extends Lambda implements Function0<LinearLayout> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout linearLayout;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (linearLayout = contentEditTextBinding.errorLayout) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                linearLayout = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.errorLayout : null;
                Intrinsics.checkNotNull(linearLayout);
            }
            return linearLayout;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class e extends Lambda implements Function0<CellsTextView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellsTextView invoke() {
            CellsTextView cellsTextView;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (cellsTextView = contentEditTextBinding.hintTextView) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                cellsTextView = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.hintTextView : null;
                Intrinsics.checkNotNull(cellsTextView);
            }
            return cellsTextView;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class f extends Lambda implements Function0<AppCompatImageButton> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppCompatImageButton invoke() {
            AppCompatImageButton appCompatImageButton;
            CellsEditText cellsEditText = CellsEditText.this;
            ContentEditTextBinding contentEditTextBinding = cellsEditText.v0;
            if (contentEditTextBinding == null || (appCompatImageButton = contentEditTextBinding.leftActionButton) == null) {
                ContentEditTextDefaultBinding contentEditTextDefaultBinding = cellsEditText.f27246w0;
                appCompatImageButton = contentEditTextDefaultBinding != null ? contentEditTextDefaultBinding.leftActionButton : null;
                Intrinsics.checkNotNull(appCompatImageButton);
            }
            return appCompatImageButton;
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class g extends Lambda implements Function0<PropertyLoader> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f27255p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.f27255p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PropertyLoader invoke() {
            return new PropertyLoader(this.f27255p0);
        }
    }

    /* JADX INFO: compiled from: CellsEditText.kt */
    public static final class h extends Lambda implements Function0<CellsEditTextViewModel> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellsEditTextViewModel invoke() {
            return new CellsEditTextViewModel(CellsEditText.this.getPropertyLoader());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(CellsEditText this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Editable text = this$0.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            this$0.q(this$0.hasFocus());
        }
    }

    public static void c(CellsEditText this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null || str.length() <= 0 || !(!l.isBlank(str))) {
            return;
        }
        this$0.getEditText().setTag(str);
    }

    public static void d(CellsEditText this$0, View view, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q(z10);
        this$0.refreshDrawableState();
        View.OnFocusChangeListener onFocusChangeListener = this$0.getOnFocusChangeListener();
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
        if (z10) {
            return;
        }
        CellsEditTextViewModel.validate$default(this$0.getViewModel(), this$0.getText().toString(), false, false, 6, null);
    }

    public static void e(CellsEditText this$0, Accessibility accessibility) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getEditText().setContentDescription(this$0.getPropertyLoader().getString(accessibility.getDescription()));
        AppCompatImageButton actionButton = this$0.getActionButton();
        if (this$0.getViewModel().isPassword() && this$0.getViewModel().isPasswordVisible()) {
            string = this$0.getPropertyLoader().getString(accessibility.getPasswordIconHide());
        } else {
            string = (!this$0.getViewModel().isPassword() || this$0.getViewModel().isPasswordVisible()) ? this$0.getPropertyLoader().getString(accessibility.getRightIcon()) : this$0.getPropertyLoader().getString(accessibility.getPasswordIconShow());
        }
        actionButton.setContentDescription(string);
        this$0.getLeftActionButton().setContentDescription(this$0.getPropertyLoader().getString(accessibility.getShowLeftIcon()));
    }

    public static void f(CellsEditText this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().actionButtonClicked();
    }

    public static void g(CellsEditText this$0, ValidationRule validationRule) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (validationRule != null) {
            this$0.getErrorLabel().setText(PropertiesHelper.loadString(this$0.getContext(), validationRule.getErrorMessage()));
            this$0.getErrorLayout().setVisibility(0);
            Function1<? super CellsEditTextState, Unit> function1 = this$0.onTextChangeStateListener;
            if (function1 != null) {
                function1.invoke(CellsEditTextState.ERROR);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.getErrorLabel().setText((CharSequence) null);
            this$0.getErrorLayout().setVisibility(8);
            Function1<? super CellsEditTextState, Unit> function2 = this$0.onTextChangeStateListener;
            if (function2 != null) {
                function2.invoke(CellsEditTextState.DEFAULT);
            }
        }
        this$0.refreshDrawableState();
    }

    private final AppCompatImageButton getActionButton() {
        return (AppCompatImageButton) this.actionButton.getValue();
    }

    private final AppCompatEditText getEditText() {
        return (AppCompatEditText) this.editText.getValue();
    }

    private final CellsTextView getErrorLabel() {
        return (CellsTextView) this.errorLabel.getValue();
    }

    private final LinearLayout getErrorLayout() {
        return (LinearLayout) this.errorLayout.getValue();
    }

    private final CellsTextView getHintTextView() {
        return (CellsTextView) this.hintTextView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatImageButton getLeftActionButton() {
        return (AppCompatImageButton) this.leftActionButton.getValue();
    }

    private final String getMask() {
        MaskTextWatcher maskTextWatcher = this.f27240p0;
        if (maskTextWatcher != null) {
            return maskTextWatcher.getMask();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertyLoader getPropertyLoader() {
        return (PropertyLoader) this.propertyLoader.getValue();
    }

    private final CellsEditTextViewModel getViewModel() {
        return (CellsEditTextViewModel) this.viewModel.getValue();
    }

    public static void h(CellsEditText this$0, Integer num) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null) {
            int iIntValue = num.intValue();
            AppCompatEditText editText = this$0.getEditText();
            Intrinsics.checkNotNullExpressionValue(editText, "<get-editText>(...)");
            ViewExtensionsKt.configureMaxLength(editText, Integer.valueOf(iIntValue));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            AppCompatEditText editText2 = this$0.getEditText();
            Intrinsics.checkNotNullExpressionValue(editText2, "<get-editText>(...)");
            ViewExtensionsKt.removeMaxLength(editText2);
        }
    }

    public static void i(CellsEditText this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().actionLeftButtonClicked();
    }

    public static void j(CellsEditText this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int selectionEnd = this$0.getEditText().getSelectionEnd();
        this$0.getEditText().setTransformationMethod(Intrinsics.areEqual(bool, Boolean.TRUE) ? PasswordTransformation.INSTANCE.instance() : PlainCharTransformation.INSTANCE.instance(this$0.f27241q0));
        this$0.getEditText().setSelection(selectionEnd);
    }

    public static void k(CellsEditText this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CellsTextView hintTextView = this$0.getHintTextView();
        if (str == null) {
            str = "";
        }
        hintTextView.setText(str);
    }

    public static boolean l(CellsEditText this$0, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i10 == 67 && this$0.getViewModel().clear();
    }

    public static void m(CellsEditText this$0, CellsInputType cellsInputType) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getEditText().setInputType(CellsInputTypeKt.toAndroidInputType(cellsInputType, this$0.getViewModel().getMask().getValue()));
    }

    public static void n(CellsEditText this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMask(str);
    }

    public static void o(CellsEditText this$0, FloatEvaluator evaluator, float f6, float f10, float f11, float f12, float f13, float f14, float f15, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(evaluator, "$evaluator");
        Intrinsics.checkNotNullParameter(it, "it");
        CellsTextView hintTextView = this$0.getHintTextView();
        Float fEvaluate = evaluator.evaluate(it.getAnimatedFraction(), (Number) Float.valueOf(f11), (Number) Float.valueOf(f12));
        Intrinsics.checkNotNullExpressionValue(fEvaluate, "evaluate(...)");
        hintTextView.setScaleX(fEvaluate.floatValue());
        Float fEvaluate2 = evaluator.evaluate(it.getAnimatedFraction(), (Number) Float.valueOf(f13), (Number) Float.valueOf(f12));
        Intrinsics.checkNotNullExpressionValue(fEvaluate2, "evaluate(...)");
        hintTextView.setScaleY(fEvaluate2.floatValue());
        Float fEvaluate3 = evaluator.evaluate(it.getAnimatedFraction(), (Number) Float.valueOf(f14), (Number) Float.valueOf(f15));
        Intrinsics.checkNotNullExpressionValue(fEvaluate3, "evaluate(...)");
        hintTextView.setTranslationY(fEvaluate3.floatValue());
        AppCompatEditText editText = this$0.getEditText();
        Float fEvaluate4 = evaluator.evaluate(it.getAnimatedFraction(), (Number) Float.valueOf(f6), (Number) Float.valueOf(f10));
        Intrinsics.checkNotNullExpressionValue(fEvaluate4, "evaluate(...)");
        editText.setTranslationY(fEvaluate4.floatValue());
    }

    private final void setFilter(final String regex) {
        getEditText().setFilters(new InputFilter[]{new InputFilter() { // from class: n4.m
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                int i14 = CellsEditText.N0;
                CellsEditText this$0 = this.f84451p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String regex2 = regex;
                Intrinsics.checkNotNullParameter(regex2, "$regex");
                String string = charSequence.toString();
                this$0.getClass();
                if (!Pattern.compile(regex2).matcher(string).matches()) {
                    charSequence = null;
                }
                return charSequence == null ? "" : charSequence;
            }
        }});
    }

    private final void setMask(String str) {
        Unit unit;
        if (str != null) {
            getEditText().removeTextChangedListener(this.f27240p0);
            this.f27240p0 = new MaskTextWatcher(str);
            getEditText().addTextChangedListener(this.f27240p0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            getEditText().removeTextChangedListener(this.f27240p0);
            this.f27240p0 = null;
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s4) {
        Function1<? super CharSequence, Unit> function1 = this.onTextChangeListener;
        if (function1 != null) {
            function1.invoke(getText());
        }
        r();
        CellsEditTextViewModel.validate$default(getViewModel(), getText().toString(), true, false, 4, null);
    }

    public final void applyMask(@Nullable String newMask) {
        getViewModel().setMask(newMask);
    }

    public final void disableChilds() {
        getEditText().setEnabled(false);
        getActionButton().setEnabled(false);
        getErrorLayout().setEnabled(false);
    }

    public final void enableChilds() {
        getEditText().setEnabled(true);
        getActionButton().setEnabled(true);
        getErrorLayout().setEnabled(true);
    }

    @Nullable
    public final Function1<CharSequence, Unit> getOnTextChangeListener() {
        return this.onTextChangeListener;
    }

    @Nullable
    public final Function1<CellsEditTextState, Unit> getOnTextChangeStateListener() {
        return this.onTextChangeStateListener;
    }

    @Nullable
    public final Function3<String, Integer, Integer, Unit> getOnTextChangedListener() {
        return this.onTextChangedListener;
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence charSequenceUnmaskText$cells_widgets_release;
        MaskTextWatcher maskTextWatcher = this.f27240p0;
        if (maskTextWatcher != null && (charSequenceUnmaskText$cells_widgets_release = maskTextWatcher.unmaskText$cells_widgets_release(getEditText().getText())) != null) {
            return charSequenceUnmaskText$cells_widgets_release;
        }
        Editable text = getEditText().getText();
        return text != null ? text : "";
    }

    @NotNull
    public final List<ValidationRule> getValidations() {
        List<ValidationRule> value = getViewModel().getValidations().getValue();
        return value == null ? CollectionsKt__CollectionsKt.emptyList() : value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return getEditText().hasFocus();
    }

    public final boolean isValid() {
        return getViewModel().isValid(getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] iArr = new int[3];
        iArr[0] = R.attr.state_error * (getViewModel().hasError() ? 1 : -1);
        iArr[1] = (hasFocus() ? 1 : -1) * android.R.attr.state_focused;
        iArr[2] = R.attr.state_password_visible * (getViewModel().isPasswordVisible() ? 1 : -1);
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 3);
        View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s4, int start, int before, int count) {
        Function3<? super String, ? super Integer, ? super Integer, Unit> function3 = this.onTextChangedListener;
        if (function3 != null) {
            function3.invoke(s4 != null ? s4.toString() : null, Integer.valueOf(start), Integer.valueOf(count));
        }
    }

    public final void p(final float f6, final float f10, final float f11) {
        final FloatEvaluator floatEvaluator = new FloatEvaluator();
        final float scaleX = getHintTextView().getScaleX();
        final float scaleY = getHintTextView().getScaleY();
        final float translationY = getHintTextView().getTranslationY();
        final float translationY2 = getEditText().getTranslationY();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n4.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CellsEditText.o(this.f84423a, floatEvaluator, translationY2, f11, scaleX, f6, scaleY, translationY, f10, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.f27244t0 = valueAnimatorOfInt;
    }

    public final void q(boolean z10) {
        boolean z11 = z10 || !TextUtils.isEmpty(getText());
        ValueAnimator valueAnimator = this.f27244t0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        if (z11 && getEditText().getTranslationY() == 0.0f) {
            float f6 = -getHintTextView().getTop();
            float f10 = this.f27242r0;
            p(this.f27243s0, f6 + f10, f10);
        } else {
            if (z11 || getEditText().getTranslationY() != this.f27242r0) {
                return;
            }
            p(1.0f, 0.0f, 0.0f);
        }
    }

    public final void r() {
        getActionButton().setVisibility(getViewModel().isPassword() || !TextUtils.isEmpty(getText()) ? 0 : 8);
    }

    public final void removeFilters() {
        getEditText().setFilters(new InputFilter[0]);
    }

    public final void requestFocusEditText() {
        getEditText().requestFocus();
    }

    public final void setConfig(@NotNull Map<String, ? extends Object> map) {
        String customCharactersRegex;
        Intrinsics.checkNotNullParameter(map, "map");
        CellsEditTextConfig cellsEditTextConfig = new CellsEditTextConfig(TypeIntrinsics.asMutableMap(map));
        if ((Intrinsics.areEqual("custom", cellsEditTextConfig.getInputType()) || Intrinsics.areEqual("customPassword", cellsEditTextConfig.getInputType())) && (customCharactersRegex = cellsEditTextConfig.getCustomCharactersRegex()) != null) {
            setFilter(customCharactersRegex);
        }
        getViewModel().setConfig(cellsEditTextConfig);
    }

    public final void setInputType(@Nullable String inputType) {
        getViewModel().setInputType(inputType);
    }

    public final void setMaxLength(@Nullable Integer length) {
        getViewModel().setMaxLength(length);
    }

    public final void setOnEditorActionListener(@NotNull final Function3<? super TextView, ? super Integer, ? super KeyEvent, Boolean> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: n4.l
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = CellsEditText.N0;
                Function3 tmp0 = listener;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(textView, Integer.valueOf(i10), keyEvent)).booleanValue();
            }
        });
    }

    public final void setOnTextChangeListener(@Nullable Function1<? super CharSequence, Unit> function1) {
        this.onTextChangeListener = function1;
    }

    public final void setOnTextChangeStateListener(@Nullable Function1<? super CellsEditTextState, Unit> function1) {
        this.onTextChangeStateListener = function1;
    }

    public final void setOnTextChangedListener(@Nullable Function3<? super String, ? super Integer, ? super Integer, Unit> function3) {
        this.onTextChangedListener = function3;
    }

    public final void setTagEditText(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        getViewModel().setTag(tag);
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getEditText().setText(value);
        q(hasFocus());
    }

    public final void setValidations(@NotNull List<ValidationRule> validations) {
        Intrinsics.checkNotNullParameter(validations, "validations");
        getViewModel().changeValidations(validations);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CellsEditText(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27243s0 = 1.0f;
        this.editText = LazyKt__LazyJVMKt.lazy(new b());
        this.actionButton = LazyKt__LazyJVMKt.lazy(new a());
        this.leftActionButton = LazyKt__LazyJVMKt.lazy(new f());
        this.hintTextView = LazyKt__LazyJVMKt.lazy(new e());
        this.errorLayout = LazyKt__LazyJVMKt.lazy(new d());
        this.errorLabel = LazyKt__LazyJVMKt.lazy(new c());
        this.viewModel = LazyKt__LazyJVMKt.lazy(new h());
        this.propertyLoader = LazyKt__LazyJVMKt.lazy(new g(context));
        try {
            this.v0 = ContentEditTextBinding.inflate(LayoutInflater.from(context), this);
        } catch (Exception unused) {
            this.f27246w0 = ContentEditTextDefaultBinding.inflate(LayoutInflater.from(context), this);
            DefaultCellsEditTextKt.applyDefaultAttributes$default(this, attributeSet, i10, 0, 4, null);
        }
        setOrientation(1);
        int i11 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellsEditText, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f27242r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CellsEditText_cellsEditText_verticalPadding, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsEditText_cellsEditText_hintTextAppearance, -1);
        this.f27245u0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CellsEditText_cellsEditText_clearPasswordWhenDel, false);
        AppCompatEditText editText = getEditText();
        Intrinsics.checkNotNullExpressionValue(editText, "<get-editText>(...)");
        DefaultCellsEditTextKt.configCopyPaste(editText, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId > -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(resourceId, new int[]{android.R.attr.textSize});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            this.f27243s0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 12) / getEditText().getTextSize();
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (this.f27245u0) {
            getEditText().setOnKeyListener(new View.OnKeyListener() { // from class: n4.o
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                    return CellsEditText.l(this.f84454p0, i12);
                }
            });
        }
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n4.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                CellsEditText.d(this.f84453a, view, z10);
            }
        });
        r();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LifecycleOwner lifecycleOwner = ViewExtensionsKt.getLifecycleOwner(context2);
        if (lifecycleOwner != null) {
            getViewModel().getHint().observe(lifecycleOwner, new Observer() { // from class: n4.p
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    CellsEditText.k(this.f84455a, (String) obj);
                }
            });
            getViewModel().getMaxLength().observe(lifecycleOwner, new q(this, 0));
            getViewModel().getMask().observe(lifecycleOwner, new r(this, 0));
            getViewModel().getInputType().observe(lifecycleOwner, new n4.c(this, 0));
            getViewModel().getVisibility().observe(lifecycleOwner, new n4.d(this, 0));
            getViewModel().getAccessibility().observe(lifecycleOwner, new n4.e(this, 0));
            getViewModel().getUnfilledValidation().observe(lifecycleOwner, new n4.f(this, 0));
            getViewModel().getHidden().observe(lifecycleOwner, new n4.g(this, 0));
            getViewModel().getClear().observe(lifecycleOwner, new n4.h(this, 0));
            getViewModel().getShowLeftIcon().observe(lifecycleOwner, new i(new s(this), 0));
            getViewModel().getTag().observe(lifecycleOwner, new androidx.lifecycle.e(this, 1));
            Unit unit = Unit.INSTANCE;
        }
        getActionButton().setOnClickListener(new j(this, i11));
        getLeftActionButton().setOnClickListener(new k(this, i11));
        float textSize = getEditText().getTextSize();
        CellsTextView hintTextView = getHintTextView();
        hintTextView.setScaleX(hintTextView.hasFocus() ? this.f27243s0 : 1.0f);
        hintTextView.setTextSize(0, textSize);
        getEditText().addTextChangedListener(this);
        Typeface typeface = getEditText().getTypeface();
        Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
        this.f27241q0 = typeface;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CellsEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s4, int start, int count, int after) {
    }
}
