package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyboardOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B2\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR \u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "copy", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCapitalization-IUNYP9k", "()I", "b", "Z", "getAutoCorrect", "()Z", "c", "getKeyboardType-PjHm6EE", "d", "getImeAction-eUduSuo", "<init>", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class KeyboardOptions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final KeyboardOptions f5917e = new KeyboardOptions(0, false, 0, 0, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int capitalization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean autoCorrect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int keyboardType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int imeAction;

    public KeyboardOptions(int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this.capitalization = i10;
        this.autoCorrect = z10;
        this.keyboardType = i11;
        this.imeAction = i12;
    }

    /* JADX INFO: renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m504copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z10 = keyboardOptions.autoCorrect;
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m505copy3m2b7yw(i10, z10, i11, i12);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ImeOptions.INSTANCE.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3m2b7yw, reason: not valid java name */
    public final KeyboardOptions m505copy3m2b7yw(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, autoCorrect, keyboardType, imeAction, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.m4134equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m4149equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m4104equalsimpl0(this.imeAction, keyboardOptions.imeAction);
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

    public int hashCode() {
        return ImeAction.m4105hashCodeimpl(this.imeAction) + ((KeyboardType.m4150hashCodeimpl(this.keyboardType) + (((KeyboardCapitalization.m4135hashCodeimpl(this.capitalization) * 31) + (this.autoCorrect ? 1231 : 1237)) * 31)) * 31);
    }

    @NotNull
    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, null);
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m4136toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4151toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4106toStringimpl(this.imeAction)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m4143getNoneIUNYP9k() : i10, (i13 & 2) != 0 ? true : z10, (i13 & 4) != 0 ? KeyboardType.INSTANCE.m4169getTextPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.INSTANCE.m4116getDefaulteUduSuo() : i12, null);
    }

    /* JADX INFO: compiled from: KeyboardOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.f5917e;
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }
}
