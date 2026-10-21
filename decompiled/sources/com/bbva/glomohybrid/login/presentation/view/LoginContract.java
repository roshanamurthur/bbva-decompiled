package com.bbva.glomohybrid.login.presentation.view;

import android.app.Activity;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.LoginConfigurationData;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract;", "", "()V", "Event", "Intent", "State", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoginContract {

    /* JADX INFO: compiled from: LoginContract.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "", "()V", "CloseLogin", "OpenAccessKeyRecovery", "OpenDialer", "OpenKeyBoard", "SendMessageToCells", "StartDeviceManager", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$CloseLogin;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenAccessKeyRecovery;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenKeyBoard;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$SendMessageToCells;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$StartDeviceManager;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$CloseLogin;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseLogin extends Event {

            @NotNull
            public static final CloseLogin INSTANCE = new CloseLogin();

            public CloseLogin() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseLogin)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1255386318;
            }

            @NotNull
            public String toString() {
                return "CloseLogin";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenAccessKeyRecovery;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenAccessKeyRecovery extends Event {

            @NotNull
            public static final OpenAccessKeyRecovery INSTANCE = new OpenAccessKeyRecovery();

            public OpenAccessKeyRecovery() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenAccessKeyRecovery)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -136149687;
            }

            @NotNull
            public String toString() {
                return "OpenAccessKeyRecovery";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "", "component1", "phoneNumber", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenDialer extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String phoneNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDialer(@NotNull String phoneNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                this.phoneNumber = phoneNumber;
            }

            public static /* synthetic */ OpenDialer copy$default(OpenDialer openDialer, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openDialer.phoneNumber;
                }
                return openDialer.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            @NotNull
            public final OpenDialer copy(@NotNull String phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                return new OpenDialer(phoneNumber);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenDialer) && Intrinsics.areEqual(this.phoneNumber, ((OpenDialer) other).phoneNumber);
            }

            @NotNull
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            public int hashCode() {
                return this.phoneNumber.hashCode();
            }

            @NotNull
            public String toString() {
                return ad.d.f(new StringBuilder("OpenDialer(phoneNumber="), this.phoneNumber, ")");
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$OpenKeyBoard;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenKeyBoard extends Event {

            @NotNull
            public static final OpenKeyBoard INSTANCE = new OpenKeyBoard();

            public OpenKeyBoard() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenKeyBoard)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -789280402;
            }

            @NotNull
            public String toString() {
                return "OpenKeyBoard";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$SendMessageToCells;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "Lcom/bbva/bridge/dispatcher/WebMessage;", "component1", "webMessage", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/bridge/dispatcher/WebMessage;", "getWebMessage", "()Lcom/bbva/bridge/dispatcher/WebMessage;", "<init>", "(Lcom/bbva/bridge/dispatcher/WebMessage;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SendMessageToCells extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final WebMessage webMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendMessageToCells(@NotNull WebMessage webMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(webMessage, "webMessage");
                this.webMessage = webMessage;
            }

            public static /* synthetic */ SendMessageToCells copy$default(SendMessageToCells sendMessageToCells, WebMessage webMessage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    webMessage = sendMessageToCells.webMessage;
                }
                return sendMessageToCells.copy(webMessage);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final WebMessage getWebMessage() {
                return this.webMessage;
            }

            @NotNull
            public final SendMessageToCells copy(@NotNull WebMessage webMessage) {
                Intrinsics.checkNotNullParameter(webMessage, "webMessage");
                return new SendMessageToCells(webMessage);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendMessageToCells) && Intrinsics.areEqual(this.webMessage, ((SendMessageToCells) other).webMessage);
            }

            @NotNull
            public final WebMessage getWebMessage() {
                return this.webMessage;
            }

            public int hashCode() {
                return this.webMessage.hashCode();
            }

            @NotNull
            public String toString() {
                return "SendMessageToCells(webMessage=" + this.webMessage + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event$StartDeviceManager;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartDeviceManager extends Event {

            @NotNull
            public static final StartDeviceManager INSTANCE = new StartDeviceManager();

            public StartDeviceManager() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartDeviceManager)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1772832078;
            }

            @NotNull
            public String toString() {
                return "StartDeviceManager";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoginContract.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "", "()V", "AccessingBiometrics", "BiometricAuthenticationTaped", "BiometricsLoginError", "CheckLoginState", "CredentialsErrorViewState", "InitializeView", "LoadLoginViewState", "LoadRememberedUser", "LoadUserRememberedBiometrics", "LoadUserRememberedCredentials", "LoginButtonTaped", "NativeLinkPage", "RememberedPasswordTaped", "SendFilledPasswordEvent", "UpdateForm", "UserConfiguration", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$AccessingBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$BiometricAuthenticationTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$BiometricsLoginError;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$CheckLoginState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$CredentialsErrorViewState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$InitializeView;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadLoginViewState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadRememberedUser;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadUserRememberedBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadUserRememberedCredentials;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoginButtonTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$NativeLinkPage;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$RememberedPasswordTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$SendFilledPasswordEvent;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$UpdateForm;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$UserConfiguration;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$AccessingBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AccessingBiometrics extends Intent {

            @NotNull
            public static final AccessingBiometrics INSTANCE = new AccessingBiometrics();

            public AccessingBiometrics() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccessingBiometrics)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1518685232;
            }

            @NotNull
            public String toString() {
                return "AccessingBiometrics";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$BiometricAuthenticationTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BiometricAuthenticationTaped extends Intent {

            @NotNull
            public static final BiometricAuthenticationTaped INSTANCE = new BiometricAuthenticationTaped();

            public BiometricAuthenticationTaped() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricAuthenticationTaped)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1708398821;
            }

            @NotNull
            public String toString() {
                return "BiometricAuthenticationTaped";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$BiometricsLoginError;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BiometricsLoginError extends Intent {

            @NotNull
            public static final BiometricsLoginError INSTANCE = new BiometricsLoginError();

            public BiometricsLoginError() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricsLoginError)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1001067197;
            }

            @NotNull
            public String toString() {
                return "BiometricsLoginError";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$CheckLoginState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "Lcom/bbva/component/ui/login/model/LoginState;", "component1", "loginState", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginState;", "getLoginState", "()Lcom/bbva/component/ui/login/model/LoginState;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginState;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class CheckLoginState extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LoginState loginState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckLoginState(@NotNull LoginState loginState) {
                super(null);
                Intrinsics.checkNotNullParameter(loginState, "loginState");
                this.loginState = loginState;
            }

            public static /* synthetic */ CheckLoginState copy$default(CheckLoginState checkLoginState, LoginState loginState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    loginState = checkLoginState.loginState;
                }
                return checkLoginState.copy(loginState);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoginState getLoginState() {
                return this.loginState;
            }

            @NotNull
            public final CheckLoginState copy(@NotNull LoginState loginState) {
                Intrinsics.checkNotNullParameter(loginState, "loginState");
                return new CheckLoginState(loginState);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckLoginState) && Intrinsics.areEqual(this.loginState, ((CheckLoginState) other).loginState);
            }

            @NotNull
            public final LoginState getLoginState() {
                return this.loginState;
            }

            public int hashCode() {
                return this.loginState.hashCode();
            }

            @NotNull
            public String toString() {
                return "CheckLoginState(loginState=" + this.loginState + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$CredentialsErrorViewState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CredentialsErrorViewState extends Intent {

            @NotNull
            public static final CredentialsErrorViewState INSTANCE = new CredentialsErrorViewState();

            public CredentialsErrorViewState() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CredentialsErrorViewState)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1702728841;
            }

            @NotNull
            public String toString() {
                return "CredentialsErrorViewState";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$InitializeView;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InitializeView extends Intent {

            @NotNull
            public static final InitializeView INSTANCE = new InitializeView();

            public InitializeView() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializeView)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 889320734;
            }

            @NotNull
            public String toString() {
                return "InitializeView";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadLoginViewState;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadLoginViewState extends Intent {

            @NotNull
            public static final LoadLoginViewState INSTANCE = new LoadLoginViewState();

            public LoadLoginViewState() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadLoginViewState)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1760439378;
            }

            @NotNull
            public String toString() {
                return "LoadLoginViewState";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadRememberedUser;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "Landroid/app/Activity;", "component1", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class LoadRememberedUser extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Activity activity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadRememberedUser(@NotNull Activity activity) {
                super(null);
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.activity = activity;
            }

            public static /* synthetic */ LoadRememberedUser copy$default(LoadRememberedUser loadRememberedUser, Activity activity, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    activity = loadRememberedUser.activity;
                }
                return loadRememberedUser.copy(activity);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Activity getActivity() {
                return this.activity;
            }

            @NotNull
            public final LoadRememberedUser copy(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return new LoadRememberedUser(activity);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoadRememberedUser) && Intrinsics.areEqual(this.activity, ((LoadRememberedUser) other).activity);
            }

            @NotNull
            public final Activity getActivity() {
                return this.activity;
            }

            public int hashCode() {
                return this.activity.hashCode();
            }

            @NotNull
            public String toString() {
                return "LoadRememberedUser(activity=" + this.activity + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadUserRememberedBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadUserRememberedBiometrics extends Intent {

            @NotNull
            public static final LoadUserRememberedBiometrics INSTANCE = new LoadUserRememberedBiometrics();

            public LoadUserRememberedBiometrics() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadUserRememberedBiometrics)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -548567487;
            }

            @NotNull
            public String toString() {
                return "LoadUserRememberedBiometrics";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoadUserRememberedCredentials;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadUserRememberedCredentials extends Intent {

            @NotNull
            public static final LoadUserRememberedCredentials INSTANCE = new LoadUserRememberedCredentials();

            public LoadUserRememberedCredentials() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadUserRememberedCredentials)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1171974090;
            }

            @NotNull
            public String toString() {
                return "LoadUserRememberedCredentials";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$LoginButtonTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "Lcom/bbva/component/ui/login/model/LoginResult;", "component1", "data", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginResult;", "getData", "()Lcom/bbva/component/ui/login/model/LoginResult;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginResult;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class LoginButtonTaped extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LoginResult data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoginButtonTaped(@NotNull LoginResult data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public static /* synthetic */ LoginButtonTaped copy$default(LoginButtonTaped loginButtonTaped, LoginResult loginResult, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    loginResult = loginButtonTaped.data;
                }
                return loginButtonTaped.copy(loginResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoginResult getData() {
                return this.data;
            }

            @NotNull
            public final LoginButtonTaped copy(@NotNull LoginResult data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new LoginButtonTaped(data);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoginButtonTaped) && Intrinsics.areEqual(this.data, ((LoginButtonTaped) other).data);
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
                return "LoginButtonTaped(data=" + this.data + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003J-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$NativeLinkPage;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "", "component1", "", "", "component2", "page", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPage", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class NativeLinkPage extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String page;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Map<String, Object> payload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NativeLinkPage(@NotNull String page, @Nullable Map<String, ? extends Object> map) {
                super(null);
                Intrinsics.checkNotNullParameter(page, "page");
                this.page = page;
                this.payload = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NativeLinkPage copy$default(NativeLinkPage nativeLinkPage, String str, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = nativeLinkPage.page;
                }
                if ((i10 & 2) != 0) {
                    map = nativeLinkPage.payload;
                }
                return nativeLinkPage.copy(str, map);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPage() {
                return this.page;
            }

            @Nullable
            public final Map<String, Object> component2() {
                return this.payload;
            }

            @NotNull
            public final NativeLinkPage copy(@NotNull String page, @Nullable Map<String, ? extends Object> payload) {
                Intrinsics.checkNotNullParameter(page, "page");
                return new NativeLinkPage(page, payload);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NativeLinkPage)) {
                    return false;
                }
                NativeLinkPage nativeLinkPage = (NativeLinkPage) other;
                return Intrinsics.areEqual(this.page, nativeLinkPage.page) && Intrinsics.areEqual(this.payload, nativeLinkPage.payload);
            }

            @NotNull
            public final String getPage() {
                return this.page;
            }

            @Nullable
            public final Map<String, Object> getPayload() {
                return this.payload;
            }

            public int hashCode() {
                int iHashCode = this.page.hashCode() * 31;
                Map<String, Object> map = this.payload;
                return iHashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                return "NativeLinkPage(page=" + this.page + ", payload=" + this.payload + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$RememberedPasswordTaped;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RememberedPasswordTaped extends Intent {

            @NotNull
            public static final RememberedPasswordTaped INSTANCE = new RememberedPasswordTaped();

            public RememberedPasswordTaped() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RememberedPasswordTaped)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1844504690;
            }

            @NotNull
            public String toString() {
                return "RememberedPasswordTaped";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$SendFilledPasswordEvent;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "", "component1", "dataLength", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDataLength", "()I", "<init>", "(I)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SendFilledPasswordEvent extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int dataLength;

            public SendFilledPasswordEvent(int i10) {
                super(null);
                this.dataLength = i10;
            }

            public static /* synthetic */ SendFilledPasswordEvent copy$default(SendFilledPasswordEvent sendFilledPasswordEvent, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = sendFilledPasswordEvent.dataLength;
                }
                return sendFilledPasswordEvent.copy(i10);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getDataLength() {
                return this.dataLength;
            }

            @NotNull
            public final SendFilledPasswordEvent copy(int dataLength) {
                return new SendFilledPasswordEvent(dataLength);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendFilledPasswordEvent) && this.dataLength == ((SendFilledPasswordEvent) other).dataLength;
            }

            public final int getDataLength() {
                return this.dataLength;
            }

            public int hashCode() {
                return this.dataLength;
            }

            @NotNull
            public String toString() {
                return androidx.appcompat.widget.a.c(new StringBuilder("SendFilledPasswordEvent(dataLength="), this.dataLength, ")");
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$UpdateForm;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "Lcom/bbva/component/ui/login/model/DocumentItem;", "component1", "itemSelected", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/DocumentItem;", "getItemSelected", "()Lcom/bbva/component/ui/login/model/DocumentItem;", "<init>", "(Lcom/bbva/component/ui/login/model/DocumentItem;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class UpdateForm extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final DocumentItem itemSelected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateForm(@NotNull DocumentItem itemSelected) {
                super(null);
                Intrinsics.checkNotNullParameter(itemSelected, "itemSelected");
                this.itemSelected = itemSelected;
            }

            public static /* synthetic */ UpdateForm copy$default(UpdateForm updateForm, DocumentItem documentItem, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    documentItem = updateForm.itemSelected;
                }
                return updateForm.copy(documentItem);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentItem getItemSelected() {
                return this.itemSelected;
            }

            @NotNull
            public final UpdateForm copy(@NotNull DocumentItem itemSelected) {
                Intrinsics.checkNotNullParameter(itemSelected, "itemSelected");
                return new UpdateForm(itemSelected);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateForm) && Intrinsics.areEqual(this.itemSelected, ((UpdateForm) other).itemSelected);
            }

            @NotNull
            public final DocumentItem getItemSelected() {
                return this.itemSelected;
            }

            public int hashCode() {
                return this.itemSelected.hashCode();
            }

            @NotNull
            public String toString() {
                return "UpdateForm(itemSelected=" + this.itemSelected + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent$UserConfiguration;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "component1", "loginConfigurationData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "getLoginConfigurationData", "()Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "<init>", "(Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class UserConfiguration extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LoginConfigurationData loginConfigurationData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserConfiguration(@NotNull LoginConfigurationData loginConfigurationData) {
                super(null);
                Intrinsics.checkNotNullParameter(loginConfigurationData, "loginConfigurationData");
                this.loginConfigurationData = loginConfigurationData;
            }

            public static /* synthetic */ UserConfiguration copy$default(UserConfiguration userConfiguration, LoginConfigurationData loginConfigurationData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    loginConfigurationData = userConfiguration.loginConfigurationData;
                }
                return userConfiguration.copy(loginConfigurationData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoginConfigurationData getLoginConfigurationData() {
                return this.loginConfigurationData;
            }

            @NotNull
            public final UserConfiguration copy(@NotNull LoginConfigurationData loginConfigurationData) {
                Intrinsics.checkNotNullParameter(loginConfigurationData, "loginConfigurationData");
                return new UserConfiguration(loginConfigurationData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserConfiguration) && Intrinsics.areEqual(this.loginConfigurationData, ((UserConfiguration) other).loginConfigurationData);
            }

            @NotNull
            public final LoginConfigurationData getLoginConfigurationData() {
                return this.loginConfigurationData;
            }

            public int hashCode() {
                return this.loginConfigurationData.hashCode();
            }

            @NotNull
            public String toString() {
                return "UserConfiguration(loginConfigurationData=" + this.loginConfigurationData + ")";
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoginContract.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "", "()V", "BiometricsError", "CheckingBiometrics", "Ready", "Starting", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$BiometricsError;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$CheckingBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$Ready;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$Starting;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$BiometricsError;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BiometricsError extends State {

            @NotNull
            public static final BiometricsError INSTANCE = new BiometricsError();

            public BiometricsError() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricsError)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1200950695;
            }

            @NotNull
            public String toString() {
                return "BiometricsError";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$CheckingBiometrics;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CheckingBiometrics extends State {

            @NotNull
            public static final CheckingBiometrics INSTANCE = new CheckingBiometrics();

            public CheckingBiometrics() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckingBiometrics)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1551123365;
            }

            @NotNull
            public String toString() {
                return "CheckingBiometrics";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$Ready;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "Lcom/bbva/component/ui/login/model/LoginState;", "component1", "state", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginState;", "getState", "()Lcom/bbva/component/ui/login/model/LoginState;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginState;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Ready extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LoginState state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ready(@NotNull LoginState state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, LoginState loginState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    loginState = ready.state;
                }
                return ready.copy(loginState);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoginState getState() {
                return this.state;
            }

            @NotNull
            public final Ready copy(@NotNull LoginState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Ready(state);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ready) && Intrinsics.areEqual(this.state, ((Ready) other).state);
            }

            @NotNull
            public final LoginState getState() {
                return this.state;
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            @NotNull
            public String toString() {
                return "Ready(state=" + this.state + ")";
            }
        }

        /* JADX INFO: compiled from: LoginContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State$Starting;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Starting extends State {

            @NotNull
            public static final Starting INSTANCE = new Starting();

            public Starting() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Starting)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1410752486;
            }

            @NotNull
            public String toString() {
                return "Starting";
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
