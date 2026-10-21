package com.bbva.glomohybrid.login.domain.model;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.component.ui.login.model.BiometricState;
import com.bbva.component.ui.login.model.Button;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserImage;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import com.bbva.glomohybrid.login.extensions.CalendarProviderExtensionKt;
import com.bbva.glomoutils.time.CalendarProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q9.m;
import q9.n;

/* JADX INFO: compiled from: RememberedUserViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/RememberedUserViewState;", "Lcom/bbva/glomohybrid/login/domain/model/RememberedUserViewDataState;", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "userRemembered", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "avatarModel", "Lcom/bbva/component/ui/login/model/LoginState;", "configure", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;", "formLoginConfigurator", "<init>", "(Landroid/content/Context;Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserViewState implements RememberedUserViewDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FormLoginConfigurator f33410b;

    public RememberedUserViewState(@NotNull Context context, @NotNull FormLoginConfigurator formLoginConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formLoginConfigurator, "formLoginConfigurator");
        this.f33409a = context;
        this.f33410b = formLoginConfigurator;
    }

    @Override // com.bbva.glomohybrid.login.domain.model.RememberedUserViewDataState
    @NotNull
    public LoginState configure(@Nullable RememberedUser userRemembered, @Nullable UserAvatarModel avatarModel) {
        LoginViewType loginViewType = LoginViewType.REMEMBERED_USER;
        RememberedUserImage rememberedUserImage = new RememberedUserImage(avatarModel != null ? avatarModel.getBase64() : null, null, androidx.camera.core.impl.utils.a.b(userRemembered != null ? userRemembered.getUsername() : null, " ", userRemembered != null ? userRemembered.getLastName() : null));
        Button button = new Button(SettingsKt.textSettings(new m(this)));
        TextSettings textSettingsGreetingsText$default = CalendarProviderExtensionKt.greetingsText$default(CalendarProvider.INSTANCE, this.f33409a, null, 2, null);
        TextSettings textSettings = SettingsKt.textSettings(new n(userRemembered));
        FormLoginConfigurator formLoginConfigurator = this.f33410b;
        InputFieldConfig inputFieldConfigInputPassword = formLoginConfigurator.inputPassword();
        return new LoginState(loginViewType, null, new RememberedUserState(rememberedUserImage, textSettingsGreetingsText$default, textSettings, inputFieldConfigInputPassword.copy((871 & 1) != 0 ? inputFieldConfigInputPassword.inputFieldIdentifier : null, (871 & 2) != 0 ? inputFieldConfigInputPassword.hint : null, (871 & 4) != 0 ? inputFieldConfigInputPassword.showLeftIcon : false, (871 & 8) != 0 ? inputFieldConfigInputPassword.inputType : null, (871 & 16) != 0 ? inputFieldConfigInputPassword.maxLength : 0, (871 & 32) != 0 ? inputFieldConfigInputPassword.mask : null, (871 & 64) != 0 ? inputFieldConfigInputPassword.customCharactersRegex : null, (871 & 128) != 0 ? inputFieldConfigInputPassword.validations : null, (871 & 256) != 0 ? inputFieldConfigInputPassword.com.bbva.nativesettings.common.Constants.ACCESSIBILITY java.lang.String : null, (871 & 512) != 0 ? inputFieldConfigInputPassword.hasFocus : true), formLoginConfigurator.configureRememberedPassword(R.string.login_forgot_password), button, (BiometricState) null, RememberedUserType.CREDENTIALS, 64, (DefaultConstructorMarker) null));
    }
}
