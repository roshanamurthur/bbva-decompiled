package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImeOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B<\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\"\u0010#JE\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "copy", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Z", "getSingleLine", "()Z", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCapitalization-IUNYP9k", "()I", "c", "getAutoCorrect", "d", "getKeyboardType-PjHm6EE", "e", "getImeAction-eUduSuo", "<init>", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class ImeOptions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ImeOptions f18071f = new ImeOptions(false, 0, false, 0, 0, 31, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean autoCorrect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int keyboardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int imeAction;

    /* JADX INFO: compiled from: ImeOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImeOptions getDefault() {
            return ImeOptions.f18071f;
        }
    }

    public ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this.singleLine = z10;
        this.capitalization = i10;
        this.autoCorrect = z11;
        this.keyboardType = i11;
        this.imeAction = i12;
    }

    /* JADX INFO: renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4124copyuxg59PA$default(ImeOptions imeOptions, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = imeOptions.singleLine;
        }
        if ((i13 & 2) != 0) {
            i10 = imeOptions.capitalization;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            z11 = imeOptions.autoCorrect;
        }
        boolean z12 = z11;
        if ((i13 & 8) != 0) {
            i11 = imeOptions.keyboardType;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            i12 = imeOptions.imeAction;
        }
        return imeOptions.m4125copyuxg59PA(z10, i14, z12, i15, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-uxg59PA, reason: not valid java name */
    public final ImeOptions m4125copyuxg59PA(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m4134equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m4149equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m4104equalsimpl0(this.imeAction, imeOptions.imeAction);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return ImeAction.m4105hashCodeimpl(this.imeAction) + ((KeyboardType.m4150hashCodeimpl(this.keyboardType) + ((((KeyboardCapitalization.m4135hashCodeimpl(this.capitalization) + ((this.singleLine ? 1231 : 1237) * 31)) * 31) + (this.autoCorrect ? 1231 : 1237)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m4136toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4151toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4106toStringimpl(this.imeAction)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? KeyboardCapitalization.INSTANCE.m4143getNoneIUNYP9k() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? KeyboardType.INSTANCE.m4169getTextPjHm6EE() : i11, (i13 & 16) != 0 ? ImeAction.INSTANCE.m4116getDefaulteUduSuo() : i12, null);
    }
}
