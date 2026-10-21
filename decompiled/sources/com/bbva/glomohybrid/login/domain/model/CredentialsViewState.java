package com.bbva.glomohybrid.login.domain.model;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.component.ui.login.model.Accessibility;
import com.bbva.component.ui.login.model.BuilderType;
import com.bbva.component.ui.login.model.Button;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.LoginCredentialsState;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.ResourceType;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CredentialsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\n\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/CredentialsViewState;", "", "Lcom/bbva/component/ui/login/model/DocumentItem;", "documentItem", "Lcom/bbva/component/ui/login/model/LoginState;", "update", "c", "Lkotlin/Lazy;", "getLoginState", "()Lcom/bbva/component/ui/login/model/LoginState;", "loginState", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;", "formLoginConfigurator", "<init>", "(Landroid/content/Context;Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCredentialsViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialsViewState.kt\ncom/bbva/glomohybrid/login/domain/model/CredentialsViewState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n288#2,2:83\n1549#2:85\n1620#2,3:86\n*S KotlinDebug\n*F\n+ 1 CredentialsViewState.kt\ncom/bbva/glomohybrid/login/domain/model/CredentialsViewState\n*L\n70#1:83,2\n76#1:85\n76#1:86,3\n*E\n"})
public final class CredentialsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FormLoginConfigurator f33384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy loginState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f33386d;

    /* JADX INFO: compiled from: CredentialsViewState.kt */
    public static final class a extends Lambda implements Function0<LoginCredentialsState> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoginCredentialsState invoke() {
            CredentialsViewState credentialsViewState = CredentialsViewState.this;
            return new LoginCredentialsState(false, (BuilderType) null, new Button(SettingsKt.textSettings(new com.bbva.glomohybrid.login.domain.model.a(credentialsViewState))), credentialsViewState.f33384b.configureRememberedPassword(R.string.login_forgot_password), (List) credentialsViewState.f33384b.getInputsForm(), 3, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: compiled from: CredentialsViewState.kt */
    public static final class b extends Lambda implements Function0<LoginState> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoginState invoke() {
            return new LoginState(LoginViewType.CREDENTIALS, CredentialsViewState.access$getCredentialsState(CredentialsViewState.this), null);
        }
    }

    public CredentialsViewState(@NotNull Context context, @NotNull FormLoginConfigurator formLoginConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formLoginConfigurator, "formLoginConfigurator");
        this.f33383a = context;
        this.f33384b = formLoginConfigurator;
        this.loginState = LazyKt__LazyJVMKt.lazy(new b());
        this.f33386d = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final LoginCredentialsState access$getCredentialsState(CredentialsViewState credentialsViewState) {
        return (LoginCredentialsState) credentialsViewState.f33386d.getValue();
    }

    @NotNull
    public final LoginState getLoginState() {
        return (LoginState) this.loginState.getValue();
    }

    @NotNull
    public final LoginState update(@NotNull DocumentItem documentItem) {
        Object next;
        ArrayList arrayList;
        List<Rule> rules;
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        LoginState loginState = getLoginState();
        LoginCredentialsState loginCredentialsState = (LoginCredentialsState) this.f33386d.getValue();
        BuilderType builderType = BuilderType.UPDATE;
        InputFieldIdentifier inputFieldIdentifier = InputFieldIdentifier.DOCUMENT;
        Iterator<T> it = LoginHelperConstants.INSTANCE.getDocumentValidations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((FormInputValidatorRule) next).getTag(), documentItem.getTag()));
        FormInputValidatorRule formInputValidatorRule = (FormInputValidatorRule) next;
        String inputType = formInputValidatorRule != null ? formInputValidatorRule.getInputType() : null;
        String str = inputType == null ? "" : inputType;
        int maxLength = formInputValidatorRule != null ? formInputValidatorRule.getMaxLength() : 0;
        if (formInputValidatorRule == null || (rules = formInputValidatorRule.getRules()) == null) {
            arrayList = null;
        } else {
            List<Rule> list = rules;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FormInputValidatorRuleKt.toValidation((Rule) it2.next(), this.f33383a));
            }
            arrayList = arrayList2;
        }
        return LoginState.copy$default(loginState, null, LoginCredentialsState.copy$default(loginCredentialsState, false, builderType, null, null, this.f33384b.updateInputForm(inputFieldIdentifier, new InputFieldConfig(inputFieldIdentifier, new ResourceType("", ""), false, str, maxLength, (String) null, (String) null, (List) arrayList, (Accessibility) null, false, 864, (DefaultConstructorMarker) null)), 12, null), null, 5, null);
    }
}
