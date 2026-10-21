package com.bbva.glomohybrid.login.domain.model;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.component.ui.login.model.BiometricState;
import com.bbva.component.ui.login.model.Button;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserImage;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q9.b;
import q9.c;
import q9.d;
import q9.e;

/* JADX INFO: compiled from: CountryRememberedUserBiometricsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/CountryRememberedUserBiometricsViewState;", "Lcom/bbva/glomohybrid/login/domain/model/RememberedUserBiometricsViewDataState;", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "userRememberedUser", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "avatarModel", "Lcom/bbva/component/ui/login/model/RememberedUserType;", "rememberedUserType", "Lcom/bbva/component/ui/login/model/LoginState;", "configure", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;", "formLoginConfigurator", "<init>", "(Landroid/content/Context;Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryRememberedUserBiometricsViewState implements RememberedUserBiometricsViewDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FormLoginConfigurator f33380b;

    public CountryRememberedUserBiometricsViewState(@NotNull Context context, @NotNull FormLoginConfigurator formLoginConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formLoginConfigurator, "formLoginConfigurator");
        this.f33379a = context;
        this.f33380b = formLoginConfigurator;
    }

    public static final Resource access$toResource(CountryRememberedUserBiometricsViewState countryRememberedUserBiometricsViewState, int i10) {
        countryRememberedUserBiometricsViewState.getClass();
        return new Resource(countryRememberedUserBiometricsViewState.f33379a.getString(i10), (ResourceId) null, 2, (DefaultConstructorMarker) null);
    }

    @Override // com.bbva.glomohybrid.login.domain.model.RememberedUserBiometricsViewDataState
    @NotNull
    public LoginState configure(@Nullable RememberedUser userRememberedUser, @Nullable UserAvatarModel avatarModel, @NotNull RememberedUserType rememberedUserType) {
        Intrinsics.checkNotNullParameter(rememberedUserType, "rememberedUserType");
        LoginViewType loginViewType = LoginViewType.BIOMETRICS;
        RememberedUserImage rememberedUserImage = new RememberedUserImage(avatarModel != null ? avatarModel.getBase64() : null, null, androidx.camera.core.impl.utils.a.b(userRememberedUser != null ? userRememberedUser.getUsername() : null, " ", userRememberedUser != null ? userRememberedUser.getLastName() : null));
        Button button = new Button(SettingsKt.textSettings(new d(this)));
        TextSettings textSettings = SettingsKt.textSettings(new e(this, userRememberedUser));
        FormLoginConfigurator formLoginConfigurator = this.f33380b;
        RememberedUserState rememberedUserState = new RememberedUserState(rememberedUserImage, textSettings, (TextSettings) null, formLoginConfigurator.inputPassword(), formLoginConfigurator.configureRememberedPassword(R.string.login_forgot_password), button, (BiometricState) null, rememberedUserType, 64, (DefaultConstructorMarker) null);
        return new LoginState(loginViewType, null, rememberedUserState.copy((Opcodes.ATHROW & 1) != 0 ? rememberedUserState.image : null, (Opcodes.ATHROW & 2) != 0 ? rememberedUserState.greeting : null, (Opcodes.ATHROW & 4) != 0 ? rememberedUserState.userName : null, (Opcodes.ATHROW & 8) != 0 ? rememberedUserState.passwordInputFieldConfig : null, (Opcodes.ATHROW & 16) != 0 ? rememberedUserState.rememberPassword : null, (Opcodes.ATHROW & 32) != 0 ? rememberedUserState.primaryButton : null, (Opcodes.ATHROW & 64) != 0 ? rememberedUserState.biometricState : new BiometricState(new Button(SettingsKt.textSettings(new b(rememberedUserType, this))), new Button(SettingsKt.textSettings(new c(rememberedUserType, this))), SettingsKt.textSettings(new q9.a(this))), (Opcodes.ATHROW & 128) != 0 ? rememberedUserState.rememberedUserType : null));
    }
}
