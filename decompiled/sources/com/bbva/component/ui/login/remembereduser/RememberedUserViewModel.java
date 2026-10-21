package com.bbva.component.ui.login.remembereduser;

import bk.d;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.login.credentials.LoginCredentialsFormViewModel;
import com.bbva.component.ui.login.credentials.LoginEvent;
import com.bbva.component.ui.login.handler.FormValidatorHandler;
import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.model.InputFieldDataKt;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.component.ui.login.model.RememberedUserState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RememberedUserViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0003R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/bbva/component/ui/login/remembereduser/RememberedUserViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/login/model/RememberedUserState;", "", "initialize", "Lcom/bbva/component/ui/login/model/InputFieldData;", "formFieldData", "addFormField", "input", "onTextChange", "", "length", "onDataInsertedLengthChange", "Lcom/bbva/component/ui/login/remembereduser/ButtonType;", "buttonType", "onButtonTaped", "onButtonLoginEnabled", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "x0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "Lkotlinx/coroutines/flow/StateFlow;", "", "y0", "Lkotlinx/coroutines/flow/StateFlow;", "isFormValid", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/component/ui/login/handler/FormValidatorHandler;", "formValidatorHandler", "<init>", "(Lcom/bbva/component/ui/login/handler/FormValidatorHandler;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserViewModel extends ViewModel<RememberedUserState> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final FormValidatorHandler f28604w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<LoginEvent> onEvents;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StateFlow<Boolean> isFormValid;

    /* JADX INFO: compiled from: RememberedUserViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.BIOMETRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedUserViewModel(@NotNull FormValidatorHandler formValidatorHandler) {
        super(new JsonDeserializer(RememberedUserState.INSTANCE.serializer()));
        Intrinsics.checkNotNullParameter(formValidatorHandler, "formValidatorHandler");
        this.f28604w0 = formValidatorHandler;
        this.onEvents = events(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent());
        this.isFormValid = formValidatorHandler.isFormValid();
    }

    public final void addFormField(@NotNull InputFieldData formFieldData) {
        Intrinsics.checkNotNullParameter(formFieldData, "formFieldData");
        this.f28604w0.addFormFieldData(formFieldData);
    }

    @NotNull
    public final Flow<LoginEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void initialize() {
        this.f28604w0.initialize();
    }

    @NotNull
    public final StateFlow<Boolean> isFormValid() {
        return this.isFormValid;
    }

    public final void onButtonLoginEnabled() {
        fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), LoginEvent.LoginButtonEnabled.INSTANCE);
    }

    public final void onButtonTaped(@NotNull ButtonType buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        if (i10 == 1) {
            fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), new LoginEvent.OnLoginButtonTaped(new LoginResult(d.listOf(InputFieldDataKt.inputFormResult((InputFieldData) CollectionsKt___CollectionsKt.first((List) this.f28604w0.dataResult()))))));
        } else if (i10 == 2) {
            fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), LoginEvent.OnBiometricButtonTaped.INSTANCE);
        } else {
            if (i10 != 3) {
                return;
            }
            fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), LoginEvent.OnRememberedPasswordTaped.INSTANCE);
        }
    }

    public final void onDataInsertedLengthChange(int length) {
        fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), new LoginEvent.OnPasswordDataInsertedLength(length));
    }

    public final void onTextChange(@NotNull InputFieldData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f28604w0.onEditTextChange(input);
    }
}
