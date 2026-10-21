package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010/B\u001d\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010)¢\u0006\u0004\b-\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002JI\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016ø\u0001\u0000J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "<set-?>", "g", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/PlatformTextInput;", "platformTextInput", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;Landroidx/compose/ui/text/input/PlatformTextInput;Ljava/util/concurrent/Executor;)V", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "context", "(Landroid/view/View;Landroidx/compose/ui/text/input/PlatformTextInput;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,515:1\n1182#2:516\n1161#2,2:517\n728#3,2:519\n460#3,11:522\n1#4:521\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n108#1:516\n108#1:517,2\n212#1:519,2\n289#1:522,11\n*E\n"})
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InputMethodManager f18146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final PlatformTextInput f18147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Executor f18148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Function1<? super List<? extends EditCommand>, Unit> f18149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Function1<? super ImeAction, Unit> f18150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextFieldValue state;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public ImeOptions f18152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList f18153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f18154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Rect f18155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableVector<a> f18156l;

    @Nullable
    public androidx.activity.f m;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a HideKeyboard;
        public static final a ShowKeyboard;
        public static final a StartInput;
        public static final a StopInput;

        static {
            a aVar = new a("StartInput", 0);
            StartInput = aVar;
            a aVar2 = new a("StopInput", 1);
            StopInput = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            ShowKeyboard = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            HideKeyboard = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class b extends Lambda implements Function0<BaseInputConnection> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(TextInputServiceAndroid.this.getView(), false);
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class c extends Lambda implements Function1<List<? extends EditCommand>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f18158p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends EditCommand> list) {
            List<? extends EditCommand> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class d extends Lambda implements Function1<ImeAction, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f18160p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
            imeAction.getF18070a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class e extends Lambda implements Function1<List<? extends EditCommand>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f18161p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends EditCommand> list) {
            List<? extends EditCommand> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class f extends Lambda implements Function1<ImeAction, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f18162p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
            imeAction.getF18070a();
            return Unit.INSTANCE;
        }
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager, @Nullable PlatformTextInput platformTextInput, @NotNull Executor inputCommandProcessorExecutor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
        this.view = view;
        this.f18146b = inputMethodManager;
        this.f18147c = platformTextInput;
        this.f18148d = inputCommandProcessorExecutor;
        this.f18149e = c.f18158p0;
        this.f18150f = d.f18160p0;
        this.state = new TextFieldValue("", TextRange.INSTANCE.m3972getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.f18152h = ImeOptions.INSTANCE.getDefault();
        this.f18153i = new ArrayList();
        this.f18154j = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b());
        this.f18156l = new MutableVector<>(new a[16], 0);
    }

    public static final BaseInputConnection access$getBaseInputConnection(TextInputServiceAndroid textInputServiceAndroid) {
        return (BaseInputConnection) textInputServiceAndroid.f18154j.getValue();
    }

    public final void a(a aVar) {
        this.f18156l.add(aVar);
        if (this.m == null) {
            androidx.activity.f fVar = new androidx.activity.f(this, 3);
            this.f18148d.execute(fVar);
            this.m = fVar;
        }
    }

    @NotNull
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        TextInputServiceAndroid_androidKt.update(outAttrs, this.f18152h, this.state);
        TextInputServiceAndroid_androidKt.access$updateWithEmojiCompat(outAttrs);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(@NotNull RecordingInputConnection ic2) {
                Intrinsics.checkNotNullParameter(ic2, "ic");
                TextInputServiceAndroid textInputServiceAndroid = TextInputServiceAndroid.this;
                int size = textInputServiceAndroid.f18153i.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (Intrinsics.areEqual(((WeakReference) textInputServiceAndroid.f18153i.get(i10)).get(), ic2)) {
                        textInputServiceAndroid.f18153i.remove(i10);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(@NotNull List<? extends EditCommand> editCommands) {
                Intrinsics.checkNotNullParameter(editCommands, "editCommands");
                TextInputServiceAndroid.this.f18149e.invoke(editCommands);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo4130onImeActionKlQnJC8(int imeAction) {
                TextInputServiceAndroid.this.f18150f.invoke(ImeAction.m4101boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                TextInputServiceAndroid.access$getBaseInputConnection(TextInputServiceAndroid.this).sendKeyEvent(event);
            }
        }, this.f18152h.getAutoCorrect());
        this.f18153i.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$ui_release, reason: from getter */
    public final TextFieldValue getState() {
        return this.state;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        a(a.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f18155k = new Rect(mk.c.roundToInt(rect.getLeft()), mk.c.roundToInt(rect.getTop()), mk.c.roundToInt(rect.getRight()), mk.c.roundToInt(rect.getBottom()));
        if (!this.f18153i.isEmpty() || (rect2 = this.f18155k) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        a(a.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        PlatformTextInput platformTextInput = this.f18147c;
        if (platformTextInput != null) {
            platformTextInput.requestInputFocus();
        }
        this.state = value;
        this.f18152h = imeOptions;
        this.f18149e = onEditCommand;
        this.f18150f = onImeActionPerformed;
        a(a.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        PlatformTextInput platformTextInput = this.f18147c;
        if (platformTextInput != null) {
            platformTextInput.releaseInputFocus();
        }
        this.f18149e = e.f18161p0;
        this.f18150f = f.f18162p0;
        this.f18155k = null;
        a(a.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue oldValue, @NotNull TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean z10 = (TextRange.m3960equalsimpl0(this.state.getSelection(), newValue.getSelection()) && Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        ArrayList arrayList = this.f18153i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) arrayList.get(i10)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(newValue);
            }
        }
        boolean zAreEqual = Intrinsics.areEqual(oldValue, newValue);
        InputMethodManager inputMethodManager = this.f18146b;
        if (zAreEqual) {
            if (z10) {
                int iM3965getMinimpl = TextRange.m3965getMinimpl(newValue.getSelection());
                int iM3964getMaximpl = TextRange.m3964getMaximpl(newValue.getSelection());
                TextRange composition = this.state.getComposition();
                int iM3965getMinimpl2 = composition != null ? TextRange.m3965getMinimpl(composition.getF17768a()) : -1;
                TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(iM3965getMinimpl, iM3964getMaximpl, iM3965getMinimpl2, composition2 != null ? TextRange.m3964getMaximpl(composition2.getF17768a()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.areEqual(oldValue.getText(), newValue.getText()) || (TextRange.m3960equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            inputMethodManager.restartInput();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) arrayList.get(i11)).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, inputMethodManager);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextInputServiceAndroid(View view, InputMethodManager inputMethodManager, PlatformTextInput platformTextInput, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 8) != 0) {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            executor = TextInputServiceAndroid_androidKt.asExecutor(choreographer);
        }
        this(view, inputMethodManager, platformTextInput, executor);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextInputServiceAndroid(View view, InputMethodManager inputMethodManager, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            executor = TextInputServiceAndroid_androidKt.asExecutor(choreographer);
        }
        this(view, inputMethodManager, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager, @NotNull Executor inputCommandProcessorExecutor) {
        this(view, inputMethodManager, (PlatformTextInput) null, inputCommandProcessorExecutor);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PlatformTextInput platformTextInput, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i10 & 2) != 0 ? null : platformTextInput);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@NotNull View view, @Nullable PlatformTextInput platformTextInput) {
        this(view, new InputMethodManagerImpl(view), platformTextInput, null, 8, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
