package com.bbva.component.ui.login.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/login/model/LoginResult;", "", "", "Lcom/bbva/component/ui/login/model/InputFormResult;", "component1", "inputsFormResult", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getInputsFormResult", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<InputFormResult> inputsFormResult;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = loginResult.inputsFormResult;
        }
        return loginResult.copy(list);
    }

    @NotNull
    public final List<InputFormResult> component1() {
        return this.inputsFormResult;
    }

    @NotNull
    public final LoginResult copy(@NotNull List<InputFormResult> inputsFormResult) {
        Intrinsics.checkNotNullParameter(inputsFormResult, "inputsFormResult");
        return new LoginResult(inputsFormResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoginResult) && Intrinsics.areEqual(this.inputsFormResult, ((LoginResult) other).inputsFormResult);
    }

    @NotNull
    public final List<InputFormResult> getInputsFormResult() {
        return this.inputsFormResult;
    }

    public int hashCode() {
        return this.inputsFormResult.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("LoginResult(inputsFormResult="), this.inputsFormResult, ")");
    }

    public LoginResult(@NotNull List<InputFormResult> inputsFormResult) {
        Intrinsics.checkNotNullParameter(inputsFormResult, "inputsFormResult");
        this.inputsFormResult = inputsFormResult;
    }

    public /* synthetic */ LoginResult(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
