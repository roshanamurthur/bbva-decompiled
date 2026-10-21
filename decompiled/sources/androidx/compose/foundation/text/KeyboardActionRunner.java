package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "Landroidx/compose/ui/text/input/TextInputSession;", "a", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextInputSession inputSession;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo502defaultKeyboardActionKlQnJC8(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4119getNexteUduSuo())) {
            getFocusManager().mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2222getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4121getPreviouseUduSuo())) {
            getFocusManager().mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2224getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4117getDoneeUduSuo())) {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
                return;
            }
            return;
        }
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4118getGoeUduSuo()) || ImeAction.m4104equalsimpl0(imeAction, companion.m4122getSearcheUduSuo()) || ImeAction.m4104equalsimpl0(imeAction, companion.m4123getSendeUduSuo()) || ImeAction.m4104equalsimpl0(imeAction, companion.m4116getDefaulteUduSuo())) {
            return;
        }
        ImeAction.m4104equalsimpl0(imeAction, companion.m4120getNoneeUduSuo());
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m503runActionKlQnJC8(int imeAction) {
        Function1<KeyboardActionScope, Unit> onSend;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        Unit unit = null;
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4117getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4118getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4119getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4121getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4122getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4123getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!ImeAction.m4104equalsimpl0(imeAction, companion.m4116getDefaulteUduSuo()) && !ImeAction.m4104equalsimpl0(imeAction, companion.m4120getNoneeUduSuo())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo502defaultKeyboardActionKlQnJC8(imeAction);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        Intrinsics.checkNotNullParameter(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
