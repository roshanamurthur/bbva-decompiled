package com.bbva.component.ui.login.credentials;

import androidx.appcompat.widget.a;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent;", "", "()V", "LoginButtonEnabled", "OnBiometricButtonTaped", "OnItemListSelected", "OnLoginButtonTaped", "OnPasswordDataInsertedLength", "OnRememberedPasswordTaped", "Lcom/bbva/component/ui/login/credentials/LoginEvent$LoginButtonEnabled;", "Lcom/bbva/component/ui/login/credentials/LoginEvent$OnBiometricButtonTaped;", "Lcom/bbva/component/ui/login/credentials/LoginEvent$OnItemListSelected;", "Lcom/bbva/component/ui/login/credentials/LoginEvent$OnLoginButtonTaped;", "Lcom/bbva/component/ui/login/credentials/LoginEvent$OnPasswordDataInsertedLength;", "Lcom/bbva/component/ui/login/credentials/LoginEvent$OnRememberedPasswordTaped;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LoginEvent {

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$LoginButtonEnabled;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoginButtonEnabled extends LoginEvent {

        @NotNull
        public static final LoginButtonEnabled INSTANCE = new LoginButtonEnabled();

        public LoginButtonEnabled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$OnBiometricButtonTaped;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnBiometricButtonTaped extends LoginEvent {

        @NotNull
        public static final OnBiometricButtonTaped INSTANCE = new OnBiometricButtonTaped();

        public OnBiometricButtonTaped() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$OnItemListSelected;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "Lcom/bbva/component/ui/login/model/DocumentItem;", "component1", "documentItem", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/DocumentItem;", "getDocumentItem", "()Lcom/bbva/component/ui/login/model/DocumentItem;", "<init>", "(Lcom/bbva/component/ui/login/model/DocumentItem;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OnItemListSelected extends LoginEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DocumentItem documentItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnItemListSelected(@NotNull DocumentItem documentItem) {
            super(null);
            Intrinsics.checkNotNullParameter(documentItem, "documentItem");
            this.documentItem = documentItem;
        }

        public static /* synthetic */ OnItemListSelected copy$default(OnItemListSelected onItemListSelected, DocumentItem documentItem, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                documentItem = onItemListSelected.documentItem;
            }
            return onItemListSelected.copy(documentItem);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentItem getDocumentItem() {
            return this.documentItem;
        }

        @NotNull
        public final OnItemListSelected copy(@NotNull DocumentItem documentItem) {
            Intrinsics.checkNotNullParameter(documentItem, "documentItem");
            return new OnItemListSelected(documentItem);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnItemListSelected) && Intrinsics.areEqual(this.documentItem, ((OnItemListSelected) other).documentItem);
        }

        @NotNull
        public final DocumentItem getDocumentItem() {
            return this.documentItem;
        }

        public int hashCode() {
            return this.documentItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnItemListSelected(documentItem=" + this.documentItem + ")";
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$OnLoginButtonTaped;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "Lcom/bbva/component/ui/login/model/LoginResult;", "component1", "data", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginResult;", "getData", "()Lcom/bbva/component/ui/login/model/LoginResult;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginResult;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OnLoginButtonTaped extends LoginEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LoginResult data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoginButtonTaped(@NotNull LoginResult data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ OnLoginButtonTaped copy$default(OnLoginButtonTaped onLoginButtonTaped, LoginResult loginResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                loginResult = onLoginButtonTaped.data;
            }
            return onLoginButtonTaped.copy(loginResult);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoginResult getData() {
            return this.data;
        }

        @NotNull
        public final OnLoginButtonTaped copy(@NotNull LoginResult data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new OnLoginButtonTaped(data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnLoginButtonTaped) && Intrinsics.areEqual(this.data, ((OnLoginButtonTaped) other).data);
        }

        @NotNull
        public final LoginResult getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnLoginButtonTaped(data=" + this.data + ")";
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$OnPasswordDataInsertedLength;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "", "component1", "dataLength", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDataLength", "()I", "<init>", "(I)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OnPasswordDataInsertedLength extends LoginEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int dataLength;

        public OnPasswordDataInsertedLength(int i10) {
            super(null);
            this.dataLength = i10;
        }

        public static /* synthetic */ OnPasswordDataInsertedLength copy$default(OnPasswordDataInsertedLength onPasswordDataInsertedLength, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = onPasswordDataInsertedLength.dataLength;
            }
            return onPasswordDataInsertedLength.copy(i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDataLength() {
            return this.dataLength;
        }

        @NotNull
        public final OnPasswordDataInsertedLength copy(int dataLength) {
            return new OnPasswordDataInsertedLength(dataLength);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPasswordDataInsertedLength) && this.dataLength == ((OnPasswordDataInsertedLength) other).dataLength;
        }

        public final int getDataLength() {
            return this.dataLength;
        }

        public int hashCode() {
            return this.dataLength;
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("OnPasswordDataInsertedLength(dataLength="), this.dataLength, ")");
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginEvent$OnRememberedPasswordTaped;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnRememberedPasswordTaped extends LoginEvent {

        @NotNull
        public static final OnRememberedPasswordTaped INSTANCE = new OnRememberedPasswordTaped();

        public OnRememberedPasswordTaped() {
            super(null);
        }
    }

    public LoginEvent() {
    }

    public /* synthetic */ LoginEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
