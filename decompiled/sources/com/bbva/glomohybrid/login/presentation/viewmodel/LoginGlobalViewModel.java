package com.bbva.glomohybrid.login.presentation.viewmodel;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import androidx.autofill.HintConstants;
import androidx.camera.camera2.internal.h0;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase;
import com.bbva.component.dm.biometriclogin.presentation.model.LoginState;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.DefaultBiometricLoginViewModel;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.mx.Avatars;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomo.user.domain.usecase.RememberedUserData;
import com.bbva.glomo.user.domain.usecase.RememberedUserDocument;
import com.bbva.glomo.user.domain.usecase.StoreRememberedDataFromCustomerUseCase;
import com.bbva.glomo.user.domain.usecase.StoreRememberedUserDocumentUseCase;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.cells.channels.EnrollmentChannels;
import com.bbva.glomohybrid.base.cells.components.ZipActionKt;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.deeplink.usecase.SendGlobalProcessingDeepLinkUseCase;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomohybrid.base.handler.ShortcutHandler;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.LoginConfigurationData;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.models.QRDeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.shortcuts.Shortcut;
import com.bbva.glomohybrid.base.shortcuts.ShortcutController;
import com.bbva.glomohybrid.base.shortcuts.ShortcutReader;
import com.bbva.glomohybrid.base.snackbar.DefaultSnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel;
import com.bbva.glomohybrid.login.domain.mapper.CountryErrorModals;
import com.bbva.glomohybrid.login.domain.mapper.CountryLoginErrorMapperFactory;
import com.bbva.glomohybrid.login.domain.mapper.UserCredentialsMapper;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import com.bbva.glomohybrid.login.domain.model.LoginAccessStateParam;
import com.bbva.glomohybrid.login.domain.model.LoginHeaderModel;
import com.bbva.glomohybrid.login.domain.model.NativeLinkPage;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import com.bbva.glomohybrid.login.domain.usecase.CheckConnectionUseCase;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginAccessStateUseCase;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginHeaderUseCase;
import com.bbva.glomohybrid.login.domain.usecase.UpdateCredentialsFormStateUseCase;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.glomohybrid.login.extensions.CustomerExtensionsKt;
import com.bbva.glomohybrid.login.extensions.NativeLinkPageExtensionsKt;
import com.bbva.glomohybrid.login.model.constants.ActionConstants;
import com.bbva.glomohybrid.login.model.enums.LoaderState;
import com.bbva.glomohybrid.login.model.enums.UserAvatar;
import com.bbva.glomohybrid.login.model.ui.LoginHeaderImage;
import com.bbva.glomohybrid.login.presentation.reactions.LoginModals;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.handler.DeviceAlertsHandler;
import com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginAnalyticsHandler;
import com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginAnalytics;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.network.model.ConnectionStatusEvent;
import com.bbva.network.model.NetworkSpeed;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: LoginGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ô\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 Ø\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ø\u0002B\u001f\u0012\b\u0010¹\u0001\u001a\u00030´\u0001\u0012\n\b\u0002\u0010¿\u0001\u001a\u00030º\u0001¢\u0006\u0006\bÖ\u0002\u0010×\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001J\u001b\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0001J\b\u0010%\u001a\u00020\u0005H\u0016J\u001e\u0010*\u001a\u00020\u00052\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0016J\u0013\u00103\u001a\u00020\u0005H\u0090@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\b\u00104\u001a\u00020\u0005H&J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u000205H&J\b\u00108\u001a\u00020\u0005H&J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u0017\u0010?\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b=\u0010>J\u000e\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@J\b\u0010C\u001a\u00020\u0005H\u0016JI\u0010I\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u001d2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010F\u001a\u00020@2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001dH\u0084@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010N\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u001dH\u0080@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u0004\u0018\u00010OH\u0096@ø\u0001\u0000¢\u0006\u0004\bP\u00102J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010R\u001a\u00020\u0005H\u0017J\u0017\u0010W\u001a\u00020\u00052\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bU\u0010VJ\u0013\u0010X\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\bX\u00102J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020YH\u0016J\u0013\u0010\\\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\\\u00102J\u001b\u0010a\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]H\u0080@ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u0006\u0010b\u001a\u00020\u0005J'\u0010g\u001a\u0004\u0018\u00010f2\b\u0010c\u001a\u0004\u0018\u00010O2\u0006\u0010e\u001a\u00020dH\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u0018\u0010m\u001a\u00020\u00052\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020kH\u0014J\u001f\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020o0nH\u0086@ø\u0001\u0000¢\u0006\u0004\bp\u00102J\u0014\u0010s\u001a\u00020\u00052\n\b\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0016J\u0006\u0010t\u001a\u00020\u0005J\b\u0010u\u001a\u00020\u0005H\u0016J\u001c\u0010x\u001a\u00020\u00052\u0014\u0010w\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010(0vJ\u001e\u0010y\u001a\u00020\u00052\u0014\u0010w\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010(0vH\u0016J\u000f\u0010|\u001a\u00020\u0005H\u0000¢\u0006\u0004\bz\u0010{J\u001c\u0010}\u001a\u00020\u00052\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010(0vJ\b\u0010~\u001a\u00020\u0005H\u0004J\u0010\u0010\u0080\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u007f\u0010{J\u0011\u0010\u0082\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0005\b\u0081\u0001\u0010{J\t\u0010\u0083\u0001\u001a\u00020\u0005H\u0004J\u0011\u0010\u0086\u0001\u001a\u00020\u00052\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001J\t\u0010\u0087\u0001\u001a\u00020\u0005H\u0004J\u0007\u0010\u0088\u0001\u001a\u00020\u0005J\t\u0010\u0089\u0001\u001a\u00020\u001dH\u0014J\u0010\u0010\u008b\u0001\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u001dJ,\u0010\u008d\u0001\u001a\u00020\u00052\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001d2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010vH\u0016J\u0019\u0010\u008e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010vH\u0014J\u0015\u0010\u0091\u0001\u001a\u00020\u00052\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u0005H\u0014J\t\u0010\u0093\u0001\u001a\u00020\u0005H\u0016J(\u0010\u0096\u0001\u001a\u00020\u00052\u0007\u0010\u008c\u0001\u001a\u00020\u001d2\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0094\u00012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(J\u0013\u0010\u0099\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0004J\u0013\u0010\u009a\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u0005H\u0016J\u0013\u0010\u009e\u0001\u001a\u00020\u00052\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0016J\u0013\u0010¡\u0001\u001a\u00020\u00052\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016J\u0012\u0010£\u0001\u001a\u00020\u00052\u0007\u0010)\u001a\u00030¢\u0001H\u0016J\u0013\u0010¦\u0001\u001a\u00020\u00052\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0016J\u0013\u0010§\u0001\u001a\u00020\u00052\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0016J \u0010©\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u000b\b\u0002\u0010¨\u0001\u001a\u0004\u0018\u00010\u001dH\u0004J\t\u0010ª\u0001\u001a\u00020\u0005H\u0016J\t\u0010«\u0001\u001a\u00020\u0005H\u0016J\u0012\u0010®\u0001\u001a\u00020@H\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0007\u0010¯\u0001\u001a\u00020\u0005J\u0007\u0010°\u0001\u001a\u00020\u0005J\t\u0010±\u0001\u001a\u00020\u0005H\u0004J\t\u0010²\u0001\u001a\u00020\u0005H\u0016J\u0007\u0010³\u0001\u001a\u00020\u0005R \u0010¹\u0001\u001a\u00030´\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R \u0010¿\u0001\u001a\u00030º\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R'\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010À\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R/\u0010É\u0001\u001a\u0012\u0012\r\u0012\u000b Æ\u0001*\u0004\u0018\u00010@0@0À\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010Â\u0001\u001a\u0006\bÈ\u0001\u0010Ä\u0001R.\u0010Î\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ë\u00010Ê\u00010À\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Â\u0001\u001a\u0006\bÍ\u0001\u0010Ä\u0001R*\u0010Ó\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ë\u00010Ê\u00010\n8\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R(\u0010B\u001a\u00020@8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u00ad\u0001\"\u0006\b×\u0001\u0010Ø\u0001R&\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020@0À\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Â\u0001\u001a\u0006\bÚ\u0001\u0010Ä\u0001R&\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020@0À\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Â\u0001\u001a\u0006\bÝ\u0001\u0010Ä\u0001R'\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010À\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010Â\u0001\u001a\u0006\bá\u0001\u0010Ä\u0001R'\u0010é\u0001\u001a\n\u0012\u0005\u0012\u00030ä\u00010ã\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R#\u0010î\u0001\u001a\t\u0012\u0005\u0012\u00030ä\u00010\r8\u0006¢\u0006\u0010\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001R)\u0010ï\u0001\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R!\u0010ú\u0001\u001a\u00030õ\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R!\u0010ÿ\u0001\u001a\u00030û\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0001\u0010÷\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R!\u0010\u0084\u0002\u001a\u00030\u0080\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010÷\u0001\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010\u0089\u0002\u001a\u00030\u0085\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010÷\u0001\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R#\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008a\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010÷\u0001\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R!\u0010\u0093\u0002\u001a\u00030\u008f\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010÷\u0001\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R6\u0010\u009a\u0002\u001a\u0004\u0018\u00010O2\t\u0010\u0094\u0002\u001a\u0004\u0018\u00010O8D@DX\u0084\u008e\u0002¢\u0006\u0017\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0005\bP\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R(\u0010e\u001a\u00020d8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002R,\u0010§\u0002\u001a\u0005\u0018\u00010¡\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b\u008d\u0001\u0010¦\u0002R#\u0010¬\u0002\u001a\u0005\u0018\u00010¨\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0002\u0010÷\u0001\u001a\u0006\bª\u0002\u0010«\u0002R!\u0010±\u0002\u001a\u00030\u00ad\u00028@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0002\u0010÷\u0001\u001a\u0006\b¯\u0002\u0010°\u0002R#\u0010¶\u0002\u001a\u0005\u0018\u00010²\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0002\u0010÷\u0001\u001a\u0006\b´\u0002\u0010µ\u0002R!\u0010»\u0002\u001a\u00030·\u00028DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0002\u0010÷\u0001\u001a\u0006\b¹\u0002\u0010º\u0002R)\u0010Â\u0002\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¼\u0002\u0010½\u0002\u001a\u0006\b¾\u0002\u0010¿\u0002\"\u0006\bÀ\u0002\u0010Á\u0002R\u001b\u0010Ä\u0002\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\n8F¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ò\u0001R\u001a\u0010Æ\u0002\u001a\b\u0012\u0004\u0012\u00020@0\n8F¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Ò\u0001R\u001b\u0010È\u0002\u001a\t\u0012\u0005\u0012\u00030ß\u00010\n8F¢\u0006\b\u001a\u0006\bÇ\u0002\u0010Ò\u0001R\u0017\u0010É\u0002\u001a\u00020@8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010\u00ad\u0001R\u001a\u0010Í\u0002\u001a\u0005\u0018\u00010Ê\u00028DX\u0084\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R\u001b\u0010Ð\u0002\u001a\t\u0012\u0005\u0012\u00030Î\u00020\r8F¢\u0006\b\u001a\u0006\bÏ\u0002\u0010í\u0001R\u001b\u0010Ò\u0002\u001a\t\u0012\u0004\u0012\u00020@0Ñ\u00028F¢\u0006\b\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0017\u0010Õ\u0002\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0002\u0010¿\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ù\u0002"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lcom/bbva/glomohybrid/login/deeplink/DeepLinkLoginViewModel;", "Lcom/bbva/glomohybrid/base/snackbar/SnackBarDelegate;", "Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricLoginViewModel;", "", "hideSnackBar", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "snackbarSpec", "showSnackBar", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "snackBarObserver", "Lkotlinx/coroutines/flow/Flow;", "biometricAuthObserver", "checkBiometricAuth", "closeBiometryChannels", "invalidateStartupAuthentication", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "loginStateObserver", "onBiometricAuthentication", "", "fidoException", "onBiometryAuthenticationError", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$Success;", "params", "onBiometryAuthenticationSuccess", "resetBiometricsSessionState", "retryBiometry", "", Constants.backendRequestUserId, "setBiometricUser", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "state", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "updateBiometricAuthentication", "setupActions", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "actionSpec", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "onActionPerformed", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Intent;", "intent", "setIntent", "Lcom/bbva/component/ui/login/model/LoginResult;", "data", "handleOnLoginButtonTaped", "configureProfile$Login_mexicoGoogleRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureProfile", "initView", "Lcom/bbva/component/ui/modal/list/model/Item;", AnalyticsConstants.Key.ITEM, "setDocument", "openSelectorDocumentModal", "openWebDeviceActivation", "onRememberedPasswordTaped", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "analyticsEvent", "trackEvent$Login_mexicoGoogleRelease", "(Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;)V", "trackEvent", "", "value", "comesFromBackground", "onViewCreate", HintConstants.AUTOFILL_HINT_USERNAME, CustomerLoginsParser.LAST_NAME, LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, CustomerIdInterceptor.FAKE_CUSTOMER_ID, "avatarUrl", "storeRememberedUserData", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "document", "storeRememberedUserDocument$Login_mexicoGoogleRelease", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeRememberedUserDocument", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getRememberedUser", "loadRememberedUser", "sendExternalDeviceIdToWeb", "Lcom/bbva/bridge/dispatcher/WebMessage;", "message", "sendMessageToWeb$Login_mexicoGoogleRelease", "(Lcom/bbva/bridge/dispatcher/WebMessage;)V", "sendMessageToWeb", "computeUserType", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "customer", "saveUserDataAndNotifyRememberedUser", "sendLoginProfileToAnalytics", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "userCredentials", "saveUserData$Login_mexicoGoogleRelease", "(Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserData", "deleteUserData", "user", "Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "fetchHeader", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;Lcom/bbva/glomo/user/domain/model/UserType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "avatar", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "background", "refreshHeaderState", "Lcom/bbva/glomoutils/Either;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "fetchAppSettings", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "loginResponse", "onLoginSuccess", "sendGlobalProcessingDeepLink", "getCustomer", "", "errors", "manageZipActionsError", "manageCustomerErrors", "clearLoginLoaderState$Login_mexicoGoogleRelease", "()V", "clearLoginLoaderState", "manageZipActionsCompleted", "manageCustomerSuccess", "showGenericCustomerError$Login_mexicoGoogleRelease", "showGenericCustomerError", "sendUserId$Login_mexicoGoogleRelease", "sendUserId", "configureShortcuts", "Lcom/bbva/glomohybrid/login/model/enums/LoaderState;", "loaderState", "setLoginLoaderState", "preloadNavigation", "openMainWebScreen", "getPostLoginWebRoute", "channelName", "notifyWebChannel", "route", "setNativeLinkPage", "getNavigationPayload", "Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "config", "setUserConfiguration", "onCleared", "logActivityEvent", "Lcom/bbva/glomohybrid/base/Animation;", "animation", "openWeb", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "exception", "logLoginException", "onLoginError", "handlePublicDeepLink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", DeepLinkListenerAdapter.Constants.DEEP_LINK, "persistDeepLink", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "shortcut", "persistShortcut", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "handleQrLink", "Lcom/bbva/glomohybrid/base/models/QRDeepLinkModel;", "qrDeepLinkModel", "handleQrNavigationLink", "handleMemberGetMemberLink", "modalId", "trackLoginErrorAnalytic", "getNativeFeatureFlag", "trackGoogleAssistantLoginScreen", "existValidNativeLinkRoute$Login_mexicoGoogleRelease", "()Z", "existValidNativeLinkRoute", "cleanDeeplink", "cleanShortcut", "validatePasswordQuality", "configDeeplinkObservers", "checkConnection", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "q0", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "getProvider", "()Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "r0", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "getAnalyticsHandler", "()Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "analyticsHandler", "Landroidx/lifecycle/MutableLiveData;", "u0", "Landroidx/lifecycle/MutableLiveData;", "get_loginLoaderState", "()Landroidx/lifecycle/MutableLiveData;", "_loginLoaderState", "kotlin.jvm.PlatformType", "v0", "get_loaderSpinner", "_loaderSpinner", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/base/router/Route;", "w0", "get_screenNavigation", "_screenNavigation", "x0", "Landroidx/lifecycle/LiveData;", "getScreenNavigation", "()Landroidx/lifecycle/LiveData;", "screenNavigation", "y0", "Z", "getComesFromBackground", "setComesFromBackground", "(Z)V", "E0", "getClearPasswordLiveData$Login_mexicoGoogleRelease", "clearPasswordLiveData", "F0", "getToolbarBehaviorLiveData$Login_mexicoGoogleRelease", "toolbarBehaviorLiveData", "Lcom/bbva/glomohybrid/base/models/ModalType;", "G0", "get_modals", "_modals", "Lkotlinx/coroutines/channels/Channel;", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$Event;", "H0", "Lkotlinx/coroutines/channels/Channel;", "get_events", "()Lkotlinx/coroutines/channels/Channel;", "_events", "I0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "userValid", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "getUserValid", "()Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "setUserValid", "(Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;)V", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "K0", "Lkotlin/Lazy;", "getThreadDispatchers", "()Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "L0", "getMessageDispatcher", "()Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "Lcom/bbva/bridge/navigate/NavigateDispatcher;", "M0", "getNavigateDispatcher", "()Lcom/bbva/bridge/navigate/NavigateDispatcher;", "navigateDispatcher", "Lcom/bbva/component/dm/customer/CustomerDataManager;", "N0", "getCustomerDataManager", "()Lcom/bbva/component/dm/customer/CustomerDataManager;", "customerDataManager", "Lcom/bbva/glomohybrid/base/handler/DeepLinkHandler;", "P0", "getDeepLinkHandler", "()Lcom/bbva/glomohybrid/base/handler/DeepLinkHandler;", "deepLinkHandler", "Lcom/bbva/glomohybrid/base/session/Session;", "R0", "getSession", "()Lcom/bbva/glomohybrid/base/session/Session;", "session", "<set-?>", "S0", "Lkotlin/properties/ReadWriteProperty;", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "setRememberedUser", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;)V", "rememberedUser", "T0", "Lcom/bbva/glomo/user/domain/model/UserType;", "getUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "setUserType", "(Lcom/bbva/glomo/user/domain/model/UserType;)V", "Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;", "U0", "Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;", "getNativeLinkPage", "()Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;", "(Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;)V", "nativeLinkPage", "Lcom/bbva/glomohybrid/login/domain/usecase/ValidatePasswordQualityUseCase;", "W0", "getValidatePasswordQualityUseCase", "()Lcom/bbva/glomohybrid/login/domain/usecase/ValidatePasswordQualityUseCase;", "validatePasswordQualityUseCase", "Lcom/bbva/glomohybrid/login/domain/mapper/UserCredentialsMapper;", "Y0", "getUserCredentialsMapper$Login_mexicoGoogleRelease", "()Lcom/bbva/glomohybrid/login/domain/mapper/UserCredentialsMapper;", "userCredentialsMapper", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/DeviceAlertsHandler;", "c1", "getDeviceAlertsHandler", "()Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/DeviceAlertsHandler;", "deviceAlertsHandler", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "g1", "getDeviceIdDataSource", "()Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "deviceIdDataSource", "h1", "Ljava/lang/String;", "getPostLoginRoute", "()Ljava/lang/String;", "setPostLoginRoute", "(Ljava/lang/String;)V", "postLoginRoute", "getLoginLoaderState", "loginLoaderState", "getLoaderSpinner", "loaderSpinner", "getModalsLiveData", "modalsLiveData", "isUserValidInitialized", "Lcom/bbva/glomohybrid/base/cells/components/ZipActionsComponent;", "getZipComponent", "()Lcom/bbva/glomohybrid/base/cells/components/ZipActionsComponent;", "zipComponent", "Lcom/bbva/glomohybrid/login/presentation/view/LoginContract$State;", "getLoginState", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "isLowConnection", "()Lkotlinx/coroutines/flow/StateFlow;", "getId", "id", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n56#2,6:940\n56#2,6:946\n56#2,6:952\n56#2,6:961\n56#2,6:971\n56#2,6:977\n56#2,6:983\n56#2,6:989\n56#2,6:995\n56#2,6:1005\n56#2,6:1011\n41#2,6:1028\n47#2:1035\n33#3,3:958\n29#4,4:967\n29#4,4:1001\n42#4,4:1017\n45#4:1038\n120#5:1021\n107#5:1036\n120#5:1039\n158#6:1022\n133#6:1034\n158#6:1040\n215#7:1023\n216#7:1025\n12#8:1024\n1855#9,2:1026\n1#10:1037\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel\n*L\n185#1:940,6\n195#1:946,6\n209#1:952,6\n222#1:961,6\n229#1:971,6\n233#1:977,6\n234#1:983,6\n237#1:989,6\n241#1:995,6\n253#1:1005,6\n261#1:1011,6\n703#1:1028,6\n703#1:1035\n214#1:958,3\n225#1:967,4\n243#1:1001,4\n615#1:1017,4\n774#1:1038\n615#1:1021\n703#1:1036\n774#1:1039\n615#1:1022\n703#1:1034\n774#1:1040\n649#1:1023\n649#1:1025\n653#1:1024\n689#1:1026,2\n*E\n"})
public abstract class LoginGlobalViewModel extends BaseViewModel implements DeepLinkLoginViewModel, SnackBarDelegate, BiometricLoginViewModel {

    @NotNull
    public static final String ID = "login-view-model";

    @NotNull
    public static final String LOG_TAG = "LoginGlobalViewModel";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> clearPasswordLiveData;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> toolbarBehaviorLiveData;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<ModalType> _modals;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public final Channel<LoginContract.Event> _events;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final Flow<LoginContract.Event> events;

    @NotNull
    public final Lazy J0;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @NotNull
    public final Lazy threadDispatchers;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageDispatcher;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @NotNull
    public final Lazy navigateDispatcher;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public final Lazy customerDataManager;

    @NotNull
    public final Lazy O0;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @NotNull
    public final Lazy deepLinkHandler;

    @NotNull
    public final Lazy Q0;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @NotNull
    public final Lazy session;

    @NotNull
    public final LoginGlobalViewModel$special$$inlined$observable$1 S0;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @NotNull
    public UserType userType;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @Nullable
    public NativeLinkPage nativeLinkPage;

    @NotNull
    public final Lazy V0;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @NotNull
    public final Lazy validatePasswordQualityUseCase;

    @NotNull
    public final Lazy X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @NotNull
    public final Lazy userCredentialsMapper;

    @NotNull
    public final Lazy Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @NotNull
    public final Lazy f33569a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public final Lazy f33570b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy deviceAlertsHandler;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<LoginContract.State> f33572d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f33573e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public final Lazy f33574f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy deviceIdDataSource;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String postLoginRoute;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelComponentsProviders provider;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginAnalytics analyticsHandler;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DefaultSnackBarDelegate f33579s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ DefaultBiometricLoginViewModel f33580t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<LoaderState> _loginLoaderState;
    public UserCredentials userValid;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _loaderSpinner;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Event<Route>> _screenNavigation;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f33583x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public boolean comesFromBackground;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f33567i1 = {androidx.camera.core.impl.utils.c.e(LoginGlobalViewModel.class, "rememberedUser", "getRememberedUser()Lcom/bbva/glomo/user/domain/model/RememberedUser;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<AnalyticsEvent> f33568j1 = new ActionSpec<>("action-track-login-event");

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$Companion;", "", "()V", "ACTION_TRACK_LOGIN_EVENT", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "getACTION_TRACK_LOGIN_EVENT", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ID", "", "LOG_TAG", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<AnalyticsEvent> getACTION_TRACK_LOGIN_EVENT() {
            return LoginGlobalViewModel.f33568j1;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$checkConnection$1", f = "LoginGlobalViewModel.kt", i = {}, l = {933}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33585p0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
        public static final class C0146a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginGlobalViewModel f33587p0;

            public C0146a(LoginGlobalViewModel loginGlobalViewModel) {
                this.f33587p0 = loginGlobalViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f33587p0.f33573e1.setValue(Boxing.boxBoolean(((ConnectionStatusEvent) obj).getSpeed() == NetworkSpeed.LOW));
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33585p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
                Flow<? extends ConnectionStatusEvent> flowExecute2 = LoginGlobalViewModel.access$getCheckConnectionUseCase(loginGlobalViewModel).execute();
                C0146a c0146a = new C0146a(loginGlobalViewModel);
                this.f33585p0 = 1;
                if (flowExecute2.collect(c0146a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class a0 extends Lambda implements Function0<ShortcutHandler> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShortcutHandler invoke() {
            return (ShortcutHandler) LoginGlobalViewModel.this.getProvider().provide(ShortcutHandler.ID);
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class b extends Lambda implements Function1<DeepLinkModel, Boolean> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DeepLinkModel deepLinkModel) {
            boolean z10;
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            boolean zIsGemaLink = DeepLinkExtensionsKt.isGemaLink(deeplink);
            LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
            if (zIsGemaLink && loginGlobalViewModel.getUserType() == UserType.PERSONAL) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(loginGlobalViewModel), null, null, new com.bbva.glomohybrid.login.presentation.viewmodel.a(loginGlobalViewModel, null), 3, null);
                z10 = false;
            } else {
                loginGlobalViewModel.persistDeepLink(deeplink);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$storeRememberedUserData$2", f = "LoginGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$storeRememberedUserData$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$storeRememberedUserData$2\n*L\n498#1:940,6\n498#1:947\n498#1:946\n498#1:948\n*E\n"})
    public static final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f33591q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f33592r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f33593s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f33594t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f33595u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, String str2, boolean z10, String str3, String str4, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.f33591q0 = str;
            this.f33592r0 = str2;
            this.f33593s0 = z10;
            this.f33594t0 = str3;
            this.f33595u0 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new b0(this.f33591q0, this.f33592r0, this.f33593s0, this.f33594t0, this.f33595u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ViewModelComponentsProviders provider = LoginGlobalViewModel.this.getProvider();
            ((StoreRememberedDataFromCustomerUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(StoreRememberedDataFromCustomerUseCase.class), null, null)).execute2(new RememberedUserData(this.f33591q0, this.f33592r0, this.f33593s0, this.f33594t0, this.f33595u0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class c extends Lambda implements Function1<DeepLinkModel, Boolean> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            LoginGlobalViewModel.this.handleMemberGetMemberLink(deeplink);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$storeRememberedUserDocument$2", f = "LoginGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$storeRememberedUserDocument$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$storeRememberedUserDocument$2\n*L\n509#1:940,6\n509#1:947\n509#1:946\n509#1:948\n*E\n"})
    public static final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f33598q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.f33598q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new c0(this.f33598q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ViewModelComponentsProviders provider = LoginGlobalViewModel.this.getProvider();
            ((StoreRememberedUserDocumentUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(StoreRememberedUserDocumentUseCase.class), null, null)).execute2(new RememberedUserDocument(this.f33598q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class d extends Lambda implements Function1<DeepLinkModel, Boolean> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            LoginGlobalViewModel.this.handlePublicDeepLink();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class d0 extends Lambda implements Function0<ParametersHolder> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LoginGlobalViewModel.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class e extends Lambda implements Function1<QRPayload, Boolean> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(QRPayload qRPayload) {
            QRPayload qr = qRPayload;
            Intrinsics.checkNotNullParameter(qr, "qr");
            LoginGlobalViewModel.this.handleQrLink(qr);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$validatePasswordQuality$1", f = "LoginGlobalViewModel.kt", i = {}, l = {859}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33602p0;

        public e0(Continuation<? super e0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new e0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33602p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
                ValidatePasswordQualityUseCase validatePasswordQualityUseCase = loginGlobalViewModel.getValidatePasswordQualityUseCase();
                if (validatePasswordQualityUseCase != null) {
                    UserCredentials userValid = loginGlobalViewModel.getUserValid();
                    this.f33602p0 = 1;
                    if (validatePasswordQualityUseCase.execute(userValid, (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class f extends Lambda implements Function1<DeepLinkModel, Boolean> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel deeplink = deepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
            loginGlobalViewModel.persistDeepLink(deeplink);
            loginGlobalViewModel.trackGoogleAssistantLoginScreen();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class f0 extends Lambda implements Function0<ParametersHolder> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LoginGlobalViewModel.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class g extends Lambda implements Function1<QRDeepLinkModel, Boolean> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(QRDeepLinkModel qRDeepLinkModel) {
            QRDeepLinkModel deeplink = qRDeepLinkModel;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            LoginGlobalViewModel.this.handleQrNavigationLink(deeplink);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class g0 extends Lambda implements Function0<MessageDispatcher> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            return (MessageDispatcher) LoginGlobalViewModel.this.getProvider().provide("web-dispatcher");
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class h extends Lambda implements Function1<ShortcutModel, Boolean> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ShortcutModel shortcutModel) {
            ShortcutModel shortcut = shortcutModel;
            Intrinsics.checkNotNullParameter(shortcut, "shortcut");
            LoginGlobalViewModel.this.persistShortcut(shortcut);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class i extends Lambda implements Function0<DeepLinkHandler> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DeepLinkHandler invoke() {
            return (DeepLinkHandler) LoginGlobalViewModel.this.getProvider().provide(DeepLinkHandler.ID);
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$deleteUserData$1", f = "LoginGlobalViewModel.kt", i = {}, l = {585}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33610p0;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33610p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f33610p0 = 1;
                if (LoginGlobalViewModel.access$removeUser(LoginGlobalViewModel.this, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$fetchAppSettings$2", f = "LoginGlobalViewModel.kt", i = {}, l = {601}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$fetchAppSettings$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$fetchAppSettings$2\n*L\n601#1:940,6\n601#1:947\n601#1:946\n601#1:948\n*E\n"})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33612p0;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33612p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ViewModelComponentsProviders provider = LoginGlobalViewModel.this.getProvider();
                FetchSettingsUseCase fetchSettingsUseCase = (FetchSettingsUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(FetchSettingsUseCase.class), null, null);
                SettingsPolicy settingsPolicy = SettingsPolicy.Local;
                this.f33612p0 = 1;
                obj = fetchSettingsUseCase.execute(settingsPolicy, (Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel", f = "LoginGlobalViewModel.kt", i = {}, l = {591}, m = "fetchHeader", n = {}, s = {})
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33614p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f33616r0;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33614p0 = obj;
            this.f33616r0 |= Integer.MIN_VALUE;
            return LoginGlobalViewModel.this.fetchHeader(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$fetchHeader$header$1", f = "LoginGlobalViewModel.kt", i = {}, l = {592}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$fetchHeader$header$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$fetchHeader$header$1\n*L\n592#1:940,6\n592#1:947\n592#1:946\n592#1:948\n*E\n"})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoginHeaderModel>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33617p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f33619r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(UserProfileConfiguration userProfileConfiguration, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f33619r0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new m(this.f33619r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoginHeaderModel> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33617p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ViewModelComponentsProviders provider = LoginGlobalViewModel.this.getProvider();
                FetchLoginHeaderUseCase fetchLoginHeaderUseCase = (FetchLoginHeaderUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(FetchLoginHeaderUseCase.class), null, null);
                this.f33617p0 = 1;
                obj = fetchLoginHeaderUseCase.execute(this.f33619r0, (Continuation<? super LoginHeaderModel>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class n extends Lambda implements Function0<ParametersHolder> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LoginGlobalViewModel.this.getProvider());
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel", f = "LoginGlobalViewModel.kt", i = {}, l = {515}, m = "getRememberedUser$suspendImpl", n = {}, s = {})
    public static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33621p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f33623r0;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33621p0 = obj;
            this.f33623r0 |= Integer.MIN_VALUE;
            return LoginGlobalViewModel.a(LoginGlobalViewModel.this, this);
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$handleOnLoginButtonTaped$1", f = "LoginGlobalViewModel.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33624p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LoginResult f33626r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(LoginResult loginResult, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f33626r0 = loginResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new p(this.f33626r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33624p0;
            LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                loginGlobalViewModel.setUserValid(loginGlobalViewModel.getUserCredentialsMapper$Login_mexicoGoogleRelease().map(this.f33626r0, loginGlobalViewModel.getRememberedUser()));
                this.f33624p0 = 1;
                if (loginGlobalViewModel.configureProfile$Login_mexicoGoogleRelease(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CellsReactor.fire("login-view-model", ActionConstants.INSTANCE.getDO_LOGIN(), loginGlobalViewModel.getUserValid());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1, reason: invalid class name */
    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1", f = "LoginGlobalViewModel.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$preloadNavigation$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,939:1\n36#2:940\n21#2:941\n23#2:945\n50#3:942\n55#3:944\n107#4:943\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$preloadNavigation$1\n*L\n707#1:940\n707#1:941\n707#1:945\n707#1:942\n707#1:944\n707#1:943\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33627p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ NavigateDispatcher f33629r0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1$a */
        /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginGlobalViewModel f33630p0;

            public a(LoginGlobalViewModel loginGlobalViewModel) {
                this.f33630p0 = loginGlobalViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f33630p0.setLoginLoaderState(LoaderState.NEXT);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NavigateDispatcher navigateDispatcher, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f33629r0 = navigateDispatcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new AnonymousClass1(this.f33629r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33627p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
                final Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(this.f33629r0, loginGlobalViewModel.getPostLoginWebRoute(), false, loginGlobalViewModel.getNavigationPayload(), 2, null);
                Flow<Object> flow = new Flow<Object>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n36#2:224\n23#2:225\n*E\n"})
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f33632p0;

                        /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$preloadNavigation$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "LoginGlobalViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public /* synthetic */ Object f33633p0;

                            /* JADX INFO: renamed from: q0, reason: collision with root package name */
                            public int f33634q0;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.f33633p0 = obj;
                                this.f33634q0 |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f33632p0 = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i10 = anonymousClass1.f33634q0;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f33634q0 = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.f33633p0;
                            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                            int i11 = anonymousClass1.f33634q0;
                            if (i11 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                if (obj instanceof WebNavigationState.Loaded) {
                                    anonymousClass1.f33634q0 = 1;
                                    if (this.f33632p0.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowNavigate$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                a aVar = new a(loginGlobalViewModel);
                this.f33627p0 = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$initializeUserState$1", f = "LoginGlobalViewModel.kt", i = {0, 0}, l = {343}, m = "invokeSuspend", n = {"$this$launch", "rememberedUser"}, s = {"L$0", "L$3"})
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$initializeUserState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n1#2:940\n*E\n"})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LoginGlobalViewModel f33636p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public RememberedUserType f33637q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public RememberedUser f33638r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33639s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f33640t0;
        public final /* synthetic */ RememberedUserType v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(RememberedUserType rememberedUserType, Continuation<? super q> continuation) {
            super(2, continuation);
            this.v0 = rememberedUserType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            q qVar = LoginGlobalViewModel.this.new q(this.v0, continuation);
            qVar.f33640t0 = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            RememberedUser rememberedUser;
            RememberedUserType rememberedUserType;
            LoginGlobalViewModel loginGlobalViewModel;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33639s0;
            LoginGlobalViewModel loginGlobalViewModel2 = LoginGlobalViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f33640t0;
                RememberedUser rememberedUser2 = loginGlobalViewModel2.getRememberedUser();
                if (rememberedUser2 != null) {
                    UserType userType = loginGlobalViewModel2.getUserType();
                    this.f33640t0 = coroutineScope;
                    this.f33636p0 = loginGlobalViewModel2;
                    RememberedUserType rememberedUserType2 = this.v0;
                    this.f33637q0 = rememberedUserType2;
                    this.f33638r0 = rememberedUser2;
                    this.f33639s0 = 1;
                    Object objFetchHeader = loginGlobalViewModel2.fetchHeader(rememberedUser2, userType, this);
                    if (objFetchHeader == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rememberedUser = rememberedUser2;
                    rememberedUserType = rememberedUserType2;
                    obj = objFetchHeader;
                    loginGlobalViewModel = loginGlobalViewModel2;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LoginGlobalViewModel.access$handleConfigureCredentialsState(loginGlobalViewModel2);
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rememberedUser = this.f33638r0;
            rememberedUserType = this.f33637q0;
            loginGlobalViewModel = this.f33636p0;
            ResultKt.throwOnFailure(obj);
            LoginGlobalViewModel.access$configureUserState(loginGlobalViewModel, rememberedUser, (UserAvatarModel) obj, rememberedUserType);
            unit = Unit.INSTANCE;
            if (unit == null) {
                LoginGlobalViewModel.access$handleConfigureCredentialsState(loginGlobalViewModel2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$loadRememberedUser$1", f = "LoginGlobalViewModel.kt", i = {}, l = {527, 528}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LoginGlobalViewModel f33642p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f33643q0;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LoginGlobalViewModel loginGlobalViewModel;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33643q0;
            LoginGlobalViewModel loginGlobalViewModel2 = LoginGlobalViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    loginGlobalViewModel = this.f33642p0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                loginGlobalViewModel2.setComesFromBackground(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f33642p0 = loginGlobalViewModel2;
            this.f33643q0 = 1;
            obj = loginGlobalViewModel2.getRememberedUser(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            loginGlobalViewModel = loginGlobalViewModel2;
            loginGlobalViewModel.setRememberedUser((RememberedUser) obj);
            RememberedUser rememberedUser = loginGlobalViewModel2.getRememberedUser();
            this.f33642p0 = null;
            this.f33643q0 = 2;
            if (LoginGlobalViewModel.access$checkBiometricsAuth(loginGlobalViewModel2, rememberedUser, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            loginGlobalViewModel2.setComesFromBackground(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class s extends Lambda implements Function0<MessageDispatcher> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            Object objProvide = LoginGlobalViewModel.this.getProvider().provide("web-dispatcher");
            if (objProvide != null) {
                return (MessageDispatcher) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$navigateDispatcher$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$navigateDispatcher$2\n*L\n192#1:940,6\n192#1:947\n192#1:946\n192#1:948\n*E\n"})
    public static final class t extends Lambda implements Function0<NavigateDispatcher> {
        public t() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final NavigateDispatcher invoke() {
            ViewModelComponentsProviders provider = LoginGlobalViewModel.this.getProvider();
            return (NavigateDispatcher) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), null, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$observeDeeplinkChannel$1", f = "LoginGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u<E> extends SuspendLambda implements Function2<E, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<E, Boolean> f33688q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<E> f33689r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Function1<? super E, Boolean> function1, MutableSharedFlow<E> mutableSharedFlow, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f33688q0 = function1;
            this.f33689r0 = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            u uVar = new u(this.f33688q0, this.f33689r0, continuation);
            uVar.f33687p0 = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((u) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f33688q0.invoke((E) this.f33687p0).booleanValue()) {
                this.f33689r0.resetReplayCache();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$observeDeeplinkChannel$2", f = "LoginGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v<E> extends SuspendLambda implements Function3<FlowCollector<? super E>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Throwable f33690p0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Throwable th2, Continuation<? super Unit> continuation) {
            v vVar = new v(3, continuation);
            vVar.f33690p0 = th2;
            return vVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoggerKt.logError$default("[LoginGlobalViewModel]: Error receiving deeplink", this.f33690p0, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$openWeb$1", f = "LoginGlobalViewModel.kt", i = {}, l = {756}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33691p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f33693r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Object f33694s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Animation f33695t0;

        /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginGlobalViewModel f33696p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Animation f33697q0;

            public a(LoginGlobalViewModel loginGlobalViewModel, Animation animation) {
                this.f33696p0 = loginGlobalViewModel;
                this.f33697q0 = animation;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WebNavigationState webNavigationState = (WebNavigationState) obj;
                boolean z10 = webNavigationState instanceof WebNavigationState.Loading;
                LoginGlobalViewModel loginGlobalViewModel = this.f33696p0;
                if (z10) {
                    loginGlobalViewModel.get_loaderSpinner().setValue(Boxing.boxBoolean(true));
                } else if (webNavigationState instanceof WebNavigationState.Loaded) {
                    loginGlobalViewModel.get_loaderSpinner().setValue(Boxing.boxBoolean(false));
                    loginGlobalViewModel.get_screenNavigation().setValue(new Event<>(new Route("cellsweb", this.f33697q0, null, 4, null)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, Object obj, Animation animation, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f33693r0 = str;
            this.f33694s0 = obj;
            this.f33695t0 = animation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new w(this.f33693r0, this.f33694s0, this.f33695t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33691p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
                Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(loginGlobalViewModel.getNavigateDispatcher(), this.f33693r0, false, this.f33694s0, 2, null);
                a aVar = new a(loginGlobalViewModel, this.f33695t0);
                this.f33691p0 = 1;
                if (flowNavigate$default.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class x extends Lambda implements Function0<PrefsStorageDataManager> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrefsStorageDataManager invoke() {
            Object objProvide = LoginGlobalViewModel.this.getProvider().provide(PrefsStorageDataManager.ID);
            if (objProvide != null) {
                return (PrefsStorageDataManager) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$saveUserDataAndNotifyRememberedUser$1", f = "LoginGlobalViewModel.kt", i = {}, l = {563, 569, 573}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33699p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Customer f33701r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Customer customer, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f33701r0 = customer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new y(this.f33701r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008b  */
        /* JADX WARN: Code duplicated, block: B:30:0x009c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object rememberedUser;
            MessageDispatcher messageDispatcherAccess$getWebDispatcher;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33699p0;
            LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
            Customer customer = this.f33701r0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    rememberedUser = obj;
                    CellsReactor.fire("login-view-model", com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED(), (RememberedUser) rememberedUser);
                    loginGlobalViewModel.getSession().initialize().setCustomer(customer);
                    messageDispatcherAccess$getWebDispatcher = LoginGlobalViewModel.access$getWebDispatcher(loginGlobalViewModel);
                    if (messageDispatcherAccess$getWebDispatcher != null) {
                        messageDispatcherAccess$getWebDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, customer.getMap());
                    }
                    this.f33699p0 = 3;
                    if (loginGlobalViewModel.sendLoginProfileToAnalytics(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoginGlobalViewModel loginGlobalViewModel2 = LoginGlobalViewModel.this;
            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            String customerIdBy = CustomerExtensionsKt.getCustomerIdBy(customer, ConfigConstantsKt.CUSTOMERS_API_VERSION);
            if (customerIdBy == null) {
                customerIdBy = customer.getCustomerId();
            }
            Avatars avatars = customer.getAvatars();
            String url = avatars != null ? avatars.getUrl() : null;
            this.f33699p0 = 1;
            if (LoginGlobalViewModel.storeRememberedUserData$default(loginGlobalViewModel2, firstName, lastName, false, customerIdBy, url, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f33699p0 = 2;
            rememberedUser = loginGlobalViewModel.getRememberedUser(this);
            if (rememberedUser == coroutine_suspended) {
                return coroutine_suspended;
            }
            CellsReactor.fire("login-view-model", com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED(), (RememberedUser) rememberedUser);
            loginGlobalViewModel.getSession().initialize().setCustomer(customer);
            messageDispatcherAccess$getWebDispatcher = LoginGlobalViewModel.access$getWebDispatcher(loginGlobalViewModel);
            if (messageDispatcherAccess$getWebDispatcher != null) {
                messageDispatcherAccess$getWebDispatcher.sendMessage(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL, customer.getMap());
            }
            this.f33699p0 = 3;
            if (loginGlobalViewModel.sendLoginProfileToAnalytics(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$sendExternalDeviceIdToWeb$1", f = "LoginGlobalViewModel.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33702p0;

        /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$sendExternalDeviceIdToWeb$1$externalDeviceId$1", f = "LoginGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginGlobalViewModel f33704p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LoginGlobalViewModel loginGlobalViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f33704p0 = loginGlobalViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f33704p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return this.f33704p0.getDeviceIdDataSource().getDeviceId();
            }
        }

        public z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginGlobalViewModel.this.new z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33702p0;
            LoginGlobalViewModel loginGlobalViewModel = LoginGlobalViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcherIo = loginGlobalViewModel.getThreadDispatchers().io();
                a aVar = new a(loginGlobalViewModel, null);
                this.f33702p0 = 1;
                obj = BuildersKt.withContext(coroutineDispatcherIo, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            String name = EnrollmentChannels.INSTANCE.getDeviceAccessesDeviceId().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (str == null) {
                str = "";
            }
            loginGlobalViewModel.sendMessageToWeb$Login_mexicoGoogleRelease(new WebMessage(name, str));
            LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] sendExternalDeviceIdToWeb", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LoginGlobalViewModel(ViewModelComponentsProviders viewModelComponentsProviders, LoginAnalytics loginAnalytics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new GlobalLoginAnalyticsHandler(viewModelComponentsProviders) : loginAnalytics);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object a(LoginGlobalViewModel loginGlobalViewModel, Continuation<? super RememberedUser> continuation) {
        o oVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i10 = oVar.f33623r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f33623r0 = i10 - Integer.MIN_VALUE;
            } else {
                oVar = loginGlobalViewModel.new o(continuation);
            }
        } else {
            oVar = loginGlobalViewModel.new o(continuation);
        }
        o oVar2 = oVar;
        Object objExecute$default = oVar2.f33621p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = oVar2.f33623r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute$default);
            GetUserConfigurationUseCase getUserConfigurationUseCase = (GetUserConfigurationUseCase) loginGlobalViewModel.V0.getValue();
            oVar2.f33623r0 = 1;
            objExecute$default = GetUserConfigurationUseCase.execute$default(getUserConfigurationUseCase, false, true, oVar2, 1, null);
            if (objExecute$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objExecute$default);
        }
        return ((UserProfileConfiguration) objExecute$default).getRememberedUser();
    }

    public static final Object access$checkBiometricsAuth(LoginGlobalViewModel loginGlobalViewModel, RememberedUser rememberedUser, Continuation continuation) {
        loginGlobalViewModel.getClass();
        if (rememberedUser != null) {
            loginGlobalViewModel.setBiometricUser(rememberedUser.getDocument());
            if (((GetIsBiometricAccessEnabledUseCase) loginGlobalViewModel.X0.getValue()).execute().booleanValue()) {
                loginGlobalViewModel.checkBiometricAuth();
                loginGlobalViewModel.b(RememberedUserType.ACCESSING_BIOMETRIC);
                loginGlobalViewModel.onBiometricAuthentication();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void access$configureUserState(LoginGlobalViewModel loginGlobalViewModel, RememberedUser rememberedUser, UserAvatarModel userAvatarModel, RememberedUserType rememberedUserType) {
        boolean zBooleanValue = ((GetIsBiometricAccessEnabledUseCase) loginGlobalViewModel.X0.getValue()).execute().booleanValue();
        MutableSharedFlow<LoginContract.State> mutableSharedFlow = loginGlobalViewModel.f33572d1;
        Lazy lazy = loginGlobalViewModel.Z0;
        if (zBooleanValue) {
            mutableSharedFlow.tryEmit(new LoginContract.State.Ready(((FetchLoginAccessStateUseCase) lazy.getValue()).execute(new LoginAccessStateParam(LoginViewType.BIOMETRICS, rememberedUser, userAvatarModel, rememberedUserType))));
        } else {
            mutableSharedFlow.tryEmit(new LoginContract.State.Ready(((FetchLoginAccessStateUseCase) lazy.getValue()).execute(new LoginAccessStateParam(LoginViewType.REMEMBERED_USER, rememberedUser, userAvatarModel, RememberedUserType.BIOMETRICS))));
        }
    }

    public static final CheckConnectionUseCase access$getCheckConnectionUseCase(LoginGlobalViewModel loginGlobalViewModel) {
        return (CheckConnectionUseCase) loginGlobalViewModel.f33574f1.getValue();
    }

    public static final MessageDispatcher access$getWebDispatcher(LoginGlobalViewModel loginGlobalViewModel) {
        return (MessageDispatcher) loginGlobalViewModel.O0.getValue();
    }

    public static final void access$handleConfigureCredentialsState(LoginGlobalViewModel loginGlobalViewModel) {
        loginGlobalViewModel.f33572d1.tryEmit(new LoginContract.State.Ready(((FetchLoginAccessStateUseCase) loginGlobalViewModel.Z0.getValue()).execute(new LoginAccessStateParam(LoginViewType.CREDENTIALS, null, null, null, 8, null))));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$isTokenActive(LoginGlobalViewModel loginGlobalViewModel, RememberedUser rememberedUser, Continuation continuation) {
        u9.b bVar;
        Boolean bool;
        boolean zBooleanValue;
        loginGlobalViewModel.getClass();
        if (continuation instanceof u9.b) {
            bVar = (u9.b) continuation;
            int i10 = bVar.f93754r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f93754r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new u9.b(loginGlobalViewModel, continuation);
            }
        } else {
            bVar = new u9.b(loginGlobalViewModel, continuation);
        }
        Object objExecute = bVar.f93752p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f93754r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            SuspendUseCase suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(loginGlobalViewModel.provider).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new u9.c(rememberedUser));
            if (suspendUseCase != null) {
                bVar.f93754r0 = 1;
                objExecute = suspendUseCase.execute(bVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                bool = null;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] isTokenActive[" + bool + "] - Comp[" + zBooleanValue + Constant.BRACKET_CLOSE, null, 2, null);
            return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        bool = (Boolean) objExecute;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] isTokenActive[" + bool + "] - Comp[" + zBooleanValue + Constant.BRACKET_CLOSE, null, 2, null);
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    public static final Object access$removeUser(LoginGlobalViewModel loginGlobalViewModel, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(loginGlobalViewModel.getThreadDispatchers().io(), new u9.d(loginGlobalViewModel, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ void onActionPerformed$default(LoginGlobalViewModel loginGlobalViewModel, ActionSpec actionSpec, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActionPerformed");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        loginGlobalViewModel.onActionPerformed(actionSpec, obj);
    }

    public static /* synthetic */ void onLoginSuccess$default(LoginGlobalViewModel loginGlobalViewModel, LoginResponse loginResponse, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoginSuccess");
        }
        if ((i10 & 1) != 0) {
            loginResponse = null;
        }
        loginGlobalViewModel.onLoginSuccess(loginResponse);
    }

    public static /* synthetic */ void openWeb$default(LoginGlobalViewModel loginGlobalViewModel, String str, Animation animation, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWeb");
        }
        if ((i10 & 2) != 0) {
            animation = Animation.None.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        loginGlobalViewModel.openWeb(str, animation, obj);
    }

    public static /* synthetic */ Object storeRememberedUserData$default(LoginGlobalViewModel loginGlobalViewModel, String str, String str2, boolean z10, String str3, String str4, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            return loginGlobalViewModel.storeRememberedUserData(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeRememberedUserData");
    }

    public static /* synthetic */ void trackLoginErrorAnalytic$default(LoginGlobalViewModel loginGlobalViewModel, LoginException loginException, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackLoginErrorAnalytic");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        loginGlobalViewModel.trackLoginErrorAnalytic(loginException, str);
    }

    public final void b(RememberedUserType rememberedUserType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q(rememberedUserType, null), 3, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    @NotNull
    public Flow<Unit> biometricAuthObserver() {
        return this.f33580t0.biometricAuthObserver();
    }

    public final <E> void c(MutableSharedFlow<E> mutableSharedFlow, Function1<? super E, Boolean> function1) {
        FlowKt.launchIn(FlowKt.m5982catch(FlowKt.onEach(mutableSharedFlow, new u(function1, mutableSharedFlow, null)), new v(3, null)), ViewModelKt.getViewModelScope(this));
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void checkBiometricAuth() {
        this.f33580t0.checkBiometricAuth();
    }

    public final void checkConnection() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final void cleanDeeplink() {
        DeepLinkHandler deepLinkHandler = getDeepLinkHandler();
        if (deepLinkHandler == null) {
            return;
        }
        deepLinkHandler.setDeepLink(null);
    }

    public final void cleanShortcut() {
        ShortcutHandler shortcutHandler = (ShortcutHandler) this.Q0.getValue();
        if (shortcutHandler == null) {
            return;
        }
        shortcutHandler.setShortcut(null);
    }

    public final void clearLoginLoaderState$Login_mexicoGoogleRelease() {
        this.clearPasswordLiveData.setValue(Boolean.TRUE);
        setLoginLoaderState(LoaderState.HIDE);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void closeBiometryChannels() {
        this.f33580t0.closeBiometryChannels();
    }

    public final void comesFromBackground(boolean value) {
        this.comesFromBackground = value;
    }

    @Nullable
    public Object computeUserType(@NotNull Continuation<? super String> continuation) {
        return UserType.PERSONAL.getValue();
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void configDeeplinkObservers() {
        CellsDeepLinkChannels cellsDeepLinkChannels = CellsDeepLinkChannels.INSTANCE;
        c(cellsDeepLinkChannels.getDeepLinkManager(), new b());
        c(cellsDeepLinkChannels.getDeepLinkToMgm(), new c());
        c(cellsDeepLinkChannels.getDeepLinkToAtm(), new d());
        c(cellsDeepLinkChannels.getQrLinkChannel(), new e());
        c(cellsDeepLinkChannels.getGoogleAssistantActionChannel(), new f());
        c(cellsDeepLinkChannels.getQrLinkNavigationChannel(), new g());
        c(cellsDeepLinkChannels.getPrivateShortcutChannel(), new h());
    }

    @Nullable
    public Object configureProfile$Login_mexicoGoogleRelease(@NotNull Continuation<? super Unit> continuation) {
        Object objSaveUserData$Login_mexicoGoogleRelease = saveUserData$Login_mexicoGoogleRelease(getUserValid(), continuation);
        return objSaveUserData$Login_mexicoGoogleRelease == ek.a.getCOROUTINE_SUSPENDED() ? objSaveUserData$Login_mexicoGoogleRelease : Unit.INSTANCE;
    }

    public final void configureShortcuts() {
        List<Shortcut> shortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
            ShortcutController shortcutController = (ShortcutController) viewModelComponentsProviders.provide(ShortcutController.ID);
            ShortcutReader shortcutReader = (ShortcutReader) viewModelComponentsProviders.provide(ShortcutReader.ID);
            if (shortcutReader == null || (shortcuts = shortcutReader.getShortcuts()) == null) {
                return;
            }
            for (Shortcut shortcut : shortcuts) {
                if (shortcutController != null) {
                    shortcutController.add(shortcut);
                }
            }
        }
    }

    public final void deleteUserData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(null), 3, null);
    }

    public final boolean existValidNativeLinkRoute$Login_mexicoGoogleRelease() {
        NativeLinkPage nativeLinkPage = this.nativeLinkPage;
        if (nativeLinkPage != null) {
            return NativeLinkPageExtensionsKt.hasValidRoute(nativeLinkPage);
        }
        return false;
    }

    @Nullable
    public final Object fetchAppSettings(@NotNull Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>> continuation) {
        return BuildersKt.withContext(getThreadDispatchers().io(), new k(null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetchHeader(@Nullable RememberedUser rememberedUser, @NotNull UserType userType, @NotNull Continuation<? super UserAvatarModel> continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i10 = lVar.f33616r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f33616r0 = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objWithContext = lVar.f33614p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = lVar.f33616r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            UserProfileConfiguration userProfileConfiguration = new UserProfileConfiguration(rememberedUser, userType);
            CoroutineDispatcher coroutineDispatcherIo = getThreadDispatchers().io();
            m mVar = new m(userProfileConfiguration, null);
            lVar.f33616r0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherIo, mVar, lVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((LoginHeaderModel) objWithContext).getAvatar();
    }

    @NotNull
    public final LoginAnalytics getAnalyticsHandler() {
        return this.analyticsHandler;
    }

    @NotNull
    public final MutableLiveData<Boolean> getClearPasswordLiveData$Login_mexicoGoogleRelease() {
        return this.clearPasswordLiveData;
    }

    public final boolean getComesFromBackground() {
        return this.comesFromBackground;
    }

    public void getCustomer() {
        getCustomerDataManager().fetchCustomer();
        LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] getCustomer", null, 2, null);
    }

    @NotNull
    public final CustomerDataManager getCustomerDataManager() {
        return (CustomerDataManager) this.customerDataManager.getValue();
    }

    @Nullable
    public final DeepLinkHandler getDeepLinkHandler() {
        return (DeepLinkHandler) this.deepLinkHandler.getValue();
    }

    @Nullable
    public final DeviceAlertsHandler getDeviceAlertsHandler() {
        return (DeviceAlertsHandler) this.deviceAlertsHandler.getValue();
    }

    @NotNull
    public final DeviceIdDataSource getDeviceIdDataSource() {
        return (DeviceIdDataSource) this.deviceIdDataSource.getValue();
    }

    @NotNull
    public final Flow<LoginContract.Event> getEvents() {
        return this.events;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return "login-view-model";
    }

    @NotNull
    public final LiveData<Boolean> getLoaderSpinner() {
        return this._loaderSpinner;
    }

    @NotNull
    public final LiveData<LoaderState> getLoginLoaderState() {
        return this._loginLoaderState;
    }

    @NotNull
    public final Flow<LoginContract.State> getLoginState() {
        return FlowKt.asSharedFlow(this.f33572d1);
    }

    @NotNull
    public final MessageDispatcher getMessageDispatcher() {
        return (MessageDispatcher) this.messageDispatcher.getValue();
    }

    @NotNull
    public final LiveData<ModalType> getModalsLiveData() {
        return this._modals;
    }

    @Nullable
    public final NativeLinkPage getNativeLinkPage() {
        return this.nativeLinkPage;
    }

    @NotNull
    public final NavigateDispatcher getNavigateDispatcher() {
        return (NavigateDispatcher) this.navigateDispatcher.getValue();
    }

    @Nullable
    public Map<String, Object> getNavigationPayload() {
        return null;
    }

    @NotNull
    public final String getPostLoginRoute() {
        return this.postLoginRoute;
    }

    @NotNull
    public String getPostLoginWebRoute() {
        DeepLinkHandler deepLinkHandler = getDeepLinkHandler();
        return (deepLinkHandler != null ? deepLinkHandler.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String() : null) != null ? RouteConstants.CELLS_DEEPLINK_MANAGER : this.postLoginRoute;
    }

    @NotNull
    public final ViewModelComponentsProviders getProvider() {
        return this.provider;
    }

    @Nullable
    public Object getRememberedUser(@NotNull Continuation<? super RememberedUser> continuation) {
        return a(this, continuation);
    }

    @NotNull
    public final LiveData<Event<Route>> getScreenNavigation() {
        return this.f33583x0;
    }

    @NotNull
    public final Session getSession() {
        return (Session) this.session.getValue();
    }

    @NotNull
    public final ThreadDispatchers getThreadDispatchers() {
        return (ThreadDispatchers) this.threadDispatchers.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getToolbarBehaviorLiveData$Login_mexicoGoogleRelease() {
        return this.toolbarBehaviorLiveData;
    }

    @NotNull
    public final UserCredentialsMapper getUserCredentialsMapper$Login_mexicoGoogleRelease() {
        return (UserCredentialsMapper) this.userCredentialsMapper.getValue();
    }

    @NotNull
    public final UserType getUserType() {
        return this.userType;
    }

    @NotNull
    public final UserCredentials getUserValid() {
        UserCredentials userCredentials = this.userValid;
        if (userCredentials != null) {
            return userCredentials;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userValid");
        return null;
    }

    @Nullable
    public final ValidatePasswordQualityUseCase getValidatePasswordQualityUseCase() {
        return (ValidatePasswordQualityUseCase) this.validatePasswordQualityUseCase.getValue();
    }

    @Nullable
    public final ZipActionsComponent getZipComponent() {
        return (ZipActionsComponent) this.provider.provide(ZipActionsComponent.ID);
    }

    @NotNull
    public final Channel<LoginContract.Event> get_events() {
        return this._events;
    }

    @NotNull
    public final MutableLiveData<Boolean> get_loaderSpinner() {
        return this._loaderSpinner;
    }

    @NotNull
    public final MutableLiveData<LoaderState> get_loginLoaderState() {
        return this._loginLoaderState;
    }

    @NotNull
    public final MutableLiveData<ModalType> get_modals() {
        return this._modals;
    }

    @NotNull
    public final MutableLiveData<Event<Route>> get_screenNavigation() {
        return this._screenNavigation;
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void handleMemberGetMemberLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        openWeb(RouteConstants.DYNAMICS_AND_REWARDS, Animation.SlideRight.INSTANCE, deepLink);
    }

    public void handleOnLoginButtonTaped(@NotNull LoginResult data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new p(data, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void handlePublicDeepLink() {
        openWeb$default(this, RouteConstants.ATM, Animation.SlideRight.INSTANCE, null, 4, null);
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void handleQrLink(@NotNull QRPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        openWeb(RouteConstants.CARDS_WITHOUT_DATA, Animation.SlideRight.INSTANCE, payload);
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void handleQrNavigationLink(@NotNull QRDeepLinkModel qrDeepLinkModel) {
        Intrinsics.checkNotNullParameter(qrDeepLinkModel, "qrDeepLinkModel");
        openWeb(qrDeepLinkModel.getRoute().getRoute(), Animation.SlideRight.INSTANCE, qrDeepLinkModel.getPayload());
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void hideSnackBar() {
        this.f33579s0.hideSnackBar();
    }

    public abstract void initView();

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void invalidateStartupAuthentication() {
        this.f33580t0.invalidateStartupAuthentication();
    }

    @NotNull
    public final StateFlow<Boolean> isLowConnection() {
        return this.f33573e1;
    }

    public final boolean isUserValidInitialized() {
        return this.userValid != null;
    }

    public void loadRememberedUser(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r(null), 3, null);
    }

    public final void logLoginException(@NotNull LoginException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer statusCode = exception.getStatusCode();
        String detailMessage = exception.getDetailMessage();
        if (detailMessage == null) {
            detailMessage = exception.getCode();
        }
        String str = "TAG[LoginGlobalViewModel] onLoginError - Exception[" + statusCode + "][" + detailMessage + "] - Category[" + exception.getCategory() + Constant.BRACKET_CLOSE;
        if (statusCode == null || statusCode.intValue() == -1 || statusCode.intValue() >= 500) {
            LoggerKt.logError$default(str, exception, null, 4, null);
        } else {
            LoggerKt.logWarning$default(str, null, 2, null);
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    @NotNull
    public Flow<LoginState> loginStateObserver() {
        return this.f33580t0.loginStateObserver();
    }

    public void manageCustomerErrors(@NotNull Map<String, ? extends Object> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        showGenericCustomerError$Login_mexicoGoogleRelease();
    }

    public final void manageCustomerSuccess() {
        MutableLiveData<Boolean> mutableLiveData = this.clearPasswordLiveData;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        this.toolbarBehaviorLiveData.setValue(bool);
        ((PrefsStorageDataManager) this.J0.getValue()).save("user-is-logged", bool);
        sendGlobalProcessingDeepLink();
    }

    public final void manageZipActionsCompleted(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Iterator<Map.Entry<String, ? extends Object>> it = params.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (Intrinsics.areEqual(key, com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED().getId())) {
                manageCustomerSuccess();
            } else {
                AppStartReadyChannel appStartReadyChannel = AppStartReadyChannel.INSTANCE;
                if (Intrinsics.areEqual(key, appStartReadyChannel.getACTION_APP_READY().getId())) {
                    String id = appStartReadyChannel.getACTION_APP_READY().getId();
                    Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                    AppStartReadyChannel.AppReadyParams appReadyParams = new AppStartReadyChannel.AppReadyParams(RouteConstants.DASHBOARD);
                    Object obj = params.get(id);
                    if (!(obj instanceof AppStartReadyChannel.AppReadyParams)) {
                        obj = null;
                    }
                    AppStartReadyChannel.AppReadyParams appReadyParams2 = (AppStartReadyChannel.AppReadyParams) obj;
                    if (appReadyParams2 != null) {
                        appReadyParams = appReadyParams2;
                    }
                    this.postLoginRoute = appReadyParams.getPageId();
                }
            }
        }
        preloadNavigation();
    }

    public final void manageZipActionsError(@NotNull Map<String, ? extends Object> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        if (errors.containsKey(CustomerDataManager.ACTION_GET_CUSTOMER_ERROR.getId())) {
            manageCustomerErrors(errors);
        }
    }

    public final void notifyWebChannel(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.O0.getValue();
        if (messageDispatcher != null) {
            messageDispatcher.notifyEvent(channelName);
        }
    }

    public final void onActionPerformed(@NotNull ActionSpec<?> actionSpec, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(actionSpec, "actionSpec");
        ZipActionsComponent zipComponent = getZipComponent();
        if (zipComponent != null) {
            zipComponent.onActionPerformed(actionSpec, payload);
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometricAuthentication() {
        this.f33580t0.onBiometricAuthentication();
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometryAuthenticationError(@Nullable Throwable fidoException) {
        this.f33580t0.onBiometryAuthenticationError(fidoException);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometryAuthenticationSuccess(@NotNull BiometryAuthResult.Success params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f33580t0.onBiometryAuthenticationSuccess(params);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        getCustomerDataManager().dispose();
    }

    public void onLoginError(@NotNull LoginException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        CountryLoginErrorType countryLoginErrorTypeCreate = new CountryLoginErrorMapperFactory().create(exception);
        logLoginException(exception);
        CountryErrorModals countryErrorModals = (CountryErrorModals) this.provider.provide(LoginModals.ID);
        String modalId = countryErrorModals != null ? countryErrorModals.getModalId(countryLoginErrorTypeCreate) : null;
        this._modals.setValue(modalId != null ? new ModalType.ErrorById(modalId) : ModalType.ErrorGeneric.INSTANCE);
        setIntent(LoginContract.Intent.CredentialsErrorViewState.INSTANCE);
        trackLoginErrorAnalytic$default(this, exception, null, 2, null);
    }

    public void onLoginSuccess(@Nullable LoginResponse loginResponse) {
        getCustomer();
        sendUserId$Login_mexicoGoogleRelease();
        configureShortcuts();
        setLoginLoaderState(LoaderState.NEXT);
        sendExternalDeviceIdToWeb();
    }

    public void onRememberedPasswordTaped() {
        trackEvent$Login_mexicoGoogleRelease(getRememberedUser() != null ? AnalyticsEvent.LOGIN_ACCESS_KEY_RECOVERY : AnalyticsEvent.LOGIN_ACCESS_KEY_RECOVERY_REMEMBERED);
    }

    public void onViewCreate() {
        trackEvent$Login_mexicoGoogleRelease(AnalyticsEvent.LOGIN_SCREEN);
    }

    public final void openMainWebScreen() {
        this._screenNavigation.setValue(new Event<>(new Route("cellsweb", Animation.SlideRight.INSTANCE, null, 4, null)));
    }

    public abstract void openSelectorDocumentModal();

    public final void openWeb(@NotNull String route, @NotNull Animation animation, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w(route, payload, animation, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void persistDeepLink(@NotNull DeepLinkModel deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        DeepLinkHandler deepLinkHandler = getDeepLinkHandler();
        if (deepLinkHandler == null) {
            return;
        }
        deepLinkHandler.setDeepLink(deepLink);
    }

    @Override // com.bbva.glomohybrid.login.deeplink.DeepLinkLoginViewModel
    public void persistShortcut(@NotNull ShortcutModel shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        ShortcutHandler shortcutHandler = (ShortcutHandler) this.Q0.getValue();
        if (shortcutHandler == null) {
            return;
        }
        shortcutHandler.setShortcut(shortcut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void preloadNavigation() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.provider;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1((NavigateDispatcher) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), null, null), null), 3, null);
    }

    public void refreshHeaderState(@NotNull UserAvatar avatar, @NotNull LoginHeaderImage background) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(background, "background");
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void resetBiometricsSessionState() {
        this.f33580t0.resetBiometricsSessionState();
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void retryBiometry() {
        this.f33580t0.retryBiometry();
    }

    @Nullable
    public final Object saveUserData$Login_mexicoGoogleRelease(@NotNull UserCredentials userCredentials, @NotNull Continuation<? super Unit> continuation) {
        Object objStoreRememberedUserDocument$Login_mexicoGoogleRelease = storeRememberedUserDocument$Login_mexicoGoogleRelease(userCredentials.getUser(), continuation);
        return objStoreRememberedUserDocument$Login_mexicoGoogleRelease == ek.a.getCOROUTINE_SUSPENDED() ? objStoreRememberedUserDocument$Login_mexicoGoogleRelease : Unit.INSTANCE;
    }

    public void saveUserDataAndNotifyRememberedUser(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y(customer, null), 3, null);
    }

    @SuppressLint({"MissingPermission"})
    public void sendExternalDeviceIdToWeb() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z(null), 3, null);
    }

    public final void sendGlobalProcessingDeepLink() {
        ZipActionsComponent zipComponent;
        SendGlobalProcessingDeepLinkUseCase sendGlobalProcessingDeepLinkUseCase = (SendGlobalProcessingDeepLinkUseCase) androidx.camera.core.impl.utils.c.f(this.provider).getOrNull(Reflection.getOrCreateKotlinClass(SendGlobalProcessingDeepLinkUseCase.class), null, null);
        Boolean boolExecute2 = sendGlobalProcessingDeepLinkUseCase != null ? sendGlobalProcessingDeepLinkUseCase.execute(getDeepLinkHandler()) : null;
        if (boolExecute2 == null || !boolExecute2.booleanValue()) {
            return;
        }
        LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] sendDeeplinkGlobalProcessing", null, 2, null);
        DeepLinkHandler deepLinkHandler = getDeepLinkHandler();
        if ((deepLinkHandler != null ? deepLinkHandler.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String() : null) == null || (zipComponent = getZipComponent()) == null) {
            return;
        }
        String id = AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        zipComponent.removeAction(id);
    }

    @Nullable
    public Object sendLoginProfileToAnalytics(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final void sendMessageToWeb$Login_mexicoGoogleRelease(@NotNull WebMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getMessageDispatcher().sendMessage(message);
    }

    public final void sendUserId$Login_mexicoGoogleRelease() {
        if (this.userValid == null) {
            LoggerKt.logError$default("TAG[LoginGlobalViewModel] sendUserId is not initialized", null, null, 6, null);
        } else {
            LoggerKt.logDebug$default("TAG[LoginGlobalViewModel] sendUserId is initialized", null, 2, null);
            CellsReactor.fire("login-view-model", ActionConstants.INSTANCE.getSEND_USER_ID(), getUserValid().getUser());
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void setBiometricUser(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f33580t0.setBiometricUser(userId);
    }

    public final void setComesFromBackground(boolean z10) {
        this.comesFromBackground = z10;
    }

    public abstract void setDocument(@NotNull Item item);

    public final void setIntent(@NotNull LoginContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof LoginContract.Intent.LoadLoginViewState) {
            b(RememberedUserType.ACCESSING_BIOMETRIC);
            return;
        }
        if (intent instanceof LoginContract.Intent.LoadRememberedUser) {
            loadRememberedUser(((LoginContract.Intent.LoadRememberedUser) intent).getActivity());
            return;
        }
        if (intent instanceof LoginContract.Intent.InitializeView) {
            initView();
            return;
        }
        if (intent instanceof LoginContract.Intent.BiometricAuthenticationTaped) {
            onBiometricAuthentication();
            return;
        }
        if (intent instanceof LoginContract.Intent.RememberedPasswordTaped) {
            onRememberedPasswordTaped();
            return;
        }
        if (intent instanceof LoginContract.Intent.LoginButtonTaped) {
            handleOnLoginButtonTaped(((LoginContract.Intent.LoginButtonTaped) intent).getData());
            return;
        }
        if (intent instanceof LoginContract.Intent.UserConfiguration) {
            setUserConfiguration(((LoginContract.Intent.UserConfiguration) intent).getLoginConfigurationData());
            return;
        }
        if (intent instanceof LoginContract.Intent.NativeLinkPage) {
            LoginContract.Intent.NativeLinkPage nativeLinkPage = (LoginContract.Intent.NativeLinkPage) intent;
            setNativeLinkPage(nativeLinkPage.getPage(), nativeLinkPage.getPayload());
            return;
        }
        boolean z10 = intent instanceof LoginContract.Intent.UpdateForm;
        MutableSharedFlow<LoginContract.State> mutableSharedFlow = this.f33572d1;
        if (z10) {
            mutableSharedFlow.tryEmit(new LoginContract.State.Ready(((UpdateCredentialsFormStateUseCase) this.f33569a1.getValue()).execute(((LoginContract.Intent.UpdateForm) intent).getItemSelected())));
            return;
        }
        if (intent instanceof LoginContract.Intent.BiometricsLoginError) {
            b(RememberedUserType.BIOMETRICS);
            return;
        }
        if (intent instanceof LoginContract.Intent.LoadUserRememberedBiometrics) {
            b(RememberedUserType.BIOMETRICS);
            return;
        }
        if (intent instanceof LoginContract.Intent.LoadUserRememberedCredentials) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u9.a(this, null), 3, null);
            return;
        }
        if (intent instanceof LoginContract.Intent.CredentialsErrorViewState) {
            mutableSharedFlow.tryEmit(new LoginContract.State.Ready(((FetchLoginAccessStateUseCase) this.Z0.getValue()).execute(new LoginAccessStateParam(LoginViewType.RESET_PASSWORD, null, null, null, 8, null))));
            return;
        }
        if (intent instanceof LoginContract.Intent.AccessingBiometrics) {
            b(RememberedUserType.ACCESSING_BIOMETRIC);
            return;
        }
        if (!(intent instanceof LoginContract.Intent.SendFilledPasswordEvent)) {
            if ((intent instanceof LoginContract.Intent.CheckLoginState) && ((LoginContract.Intent.CheckLoginState) intent).getLoginState().getLoginType() == LoginViewType.REMEMBERED_USER) {
                this._events.mo5953trySendJP2dKIU(LoginContract.Event.OpenKeyBoard.INSTANCE);
                return;
            }
            return;
        }
        int dataLength = ((LoginContract.Intent.SendFilledPasswordEvent) intent).getDataLength();
        DeviceAlertsHandler deviceAlertsHandler = getDeviceAlertsHandler();
        if (deviceAlertsHandler != null) {
            deviceAlertsHandler.computePasswordAutoFilled(dataLength);
        }
    }

    public final void setLoginLoaderState(@NotNull LoaderState loaderState) {
        Intrinsics.checkNotNullParameter(loaderState, "loaderState");
        LoggerKt.logDebug$default(h0.b("TAG[LoginGlobalViewModel] sendLoginLoaderState[", loaderState.name(), Constant.BRACKET_CLOSE), null, 2, null);
        this._loginLoaderState.setValue(loaderState);
    }

    public void setNativeLinkPage(@Nullable String route, @Nullable Map<String, ? extends Object> payload) {
    }

    public final void setPostLoginRoute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postLoginRoute = str;
    }

    public final void setRememberedUser(@Nullable RememberedUser rememberedUser) {
        setValue(this, f33567i1[0], rememberedUser);
    }

    public void setUserConfiguration(@Nullable LoginConfigurationData config) {
        if (config != null) {
            LoginConfigurationData loginConfigurationData = config.isNotEmpty() ? config : null;
            if (loginConfigurationData == null) {
                return;
            }
            this.userType = config.getUserType();
            setRememberedUser(new RememberedUser(loginConfigurationData.getUserName(), loginConfigurationData.getUserDocument(), loginConfigurationData.getUserLastName(), loginConfigurationData.isBusinessUser(), loginConfigurationData.getCustomerId(), null, 32, null));
        }
    }

    public final void setUserType(@NotNull UserType userType) {
        Intrinsics.checkNotNullParameter(userType, "<set-?>");
        this.userType = userType;
    }

    public final void setUserValid(@NotNull UserCredentials userCredentials) {
        Intrinsics.checkNotNullParameter(userCredentials, "<set-?>");
        this.userValid = userCredentials;
    }

    public void setupActions() {
        ZipActionsComponent zipComponent = getZipComponent();
        if (zipComponent != null) {
            String id = CustomerDataManager.ACTION_GET_CUSTOMER_ERROR.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            String id2 = CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            String id3 = com.bbva.glomohybrid.base.cells.constants.ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED().getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            String id4 = AppStartReadyChannel.INSTANCE.getACTION_APP_READY().getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getId(...)");
            zipComponent.addActions(ZipActionKt.anyError(id), ZipActionKt.allOf(id2, id3), ZipActionKt.just(id4));
        }
        configDeeplinkObservers();
    }

    public final void showGenericCustomerError$Login_mexicoGoogleRelease() {
        this._modals.setValue(ModalType.ErrorGeneric.INSTANCE);
        clearLoginLoaderState$Login_mexicoGoogleRelease();
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void showSnackBar(@NotNull SnackbarSpec snackbarSpec) {
        Intrinsics.checkNotNullParameter(snackbarSpec, "snackbarSpec");
        this.f33579s0.showSnackBar(snackbarSpec);
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    @NotNull
    public LiveData<SnackbarState> snackBarObserver() {
        return this.f33579s0.snackBarObserver();
    }

    @Nullable
    public final Object storeRememberedUserData(@NotNull String str, @Nullable String str2, boolean z10, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(getThreadDispatchers().io(), new b0(str, str2, z10, str3, str4, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object storeRememberedUserDocument$Login_mexicoGoogleRelease(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(getThreadDispatchers().io(), new c0(str, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void trackEvent$Login_mexicoGoogleRelease(@NotNull AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        CellsReactor.fire("login-view-model", f33568j1, analyticsEvent);
    }

    public final void trackLoginErrorAnalytic(@NotNull LoginException exception, @Nullable String modalId) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.analyticsHandler.trackLoginError(exception, modalId);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void updateBiometricAuthentication(@NotNull BiometryAuthState state, @Nullable Activity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f33580t0.updateBiometricAuthentication(state, activity);
    }

    public final void validatePasswordQuality() {
        if (isUserValidInitialized()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e0(null), 3, null);
        }
    }

    @Nullable
    public final RememberedUser getRememberedUser() {
        return getValue(this, f33567i1[0]);
    }

    public final void setNativeLinkPage(@Nullable NativeLinkPage nativeLinkPage) {
        this.nativeLinkPage = nativeLinkPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$observable$1] */
    public LoginGlobalViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull LoginAnalytics analyticsHandler) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(analyticsHandler, "analyticsHandler");
        this.provider = provider;
        this.analyticsHandler = analyticsHandler;
        this.f33579s0 = new DefaultSnackBarDelegate();
        this.f33580t0 = new DefaultBiometricLoginViewModel("login-view-model", LoginState.Basic.INSTANCE, provider);
        this._loginLoaderState = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        this._loaderSpinner = new MutableLiveData<>(bool);
        MutableLiveData<Event<Route>> mutableLiveData = new MutableLiveData<>();
        this._screenNavigation = mutableLiveData;
        this.f33583x0 = mutableLiveData;
        this.clearPasswordLiveData = new MutableLiveData<>();
        this.toolbarBehaviorLiveData = new MutableLiveData<>();
        this._modals = new MutableLiveData<>();
        final Qualifier qualifier = null;
        Channel<LoginContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this._events = channelChannel$default;
        this.events = FlowKt.receiveAsFlow(channelChannel$default);
        this.J0 = LazyKt__LazyJVMKt.lazy(new x());
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.threadDispatchers = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ThreadDispatchers>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomoutils.scheduler.ThreadDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ThreadDispatchers invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), qualifier, objArr);
            }
        });
        this.messageDispatcher = LazyKt__LazyJVMKt.lazy(new s());
        this.navigateDispatcher = LazyKt__LazyJVMKt.lazy(new t());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.customerDataManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<CustomerDataManager>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.customer.CustomerDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CustomerDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CustomerDataManager.class), objArr2, objArr3);
            }
        });
        this.O0 = LazyKt__LazyJVMKt.lazy(new g0());
        this.deepLinkHandler = LazyKt__LazyJVMKt.lazy(new i());
        this.Q0 = LazyKt__LazyJVMKt.lazy(new a0());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.session = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<Session>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.Session, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Session invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Session.class), objArr4, objArr5);
            }
        });
        Delegates delegates = Delegates.INSTANCE;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.S0 = new ObservableProperty<RememberedUser>(objArr6) { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, RememberedUser oldValue, RememberedUser newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                RememberedUser rememberedUser = newValue;
                if (!Intrinsics.areEqual(oldValue, rememberedUser) || rememberedUser == null) {
                    this.getClass();
                }
            }
        };
        this.userType = UserType.PERSONAL;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr7 = 0 == true ? 1 : 0;
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.V0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<GetUserConfigurationUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetUserConfigurationUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetUserConfigurationUseCase.class), objArr7, objArr8);
            }
        });
        final f0 f0Var = new f0();
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.validatePasswordQualityUseCase = LazyKt__LazyJVMKt.lazy(new Function0<ValidatePasswordQualityUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ValidatePasswordQualityUseCase invoke() {
                return androidx.camera.core.imagecapture.a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(ValidatePasswordQualityUseCase.class), objArr9, f0Var);
            }
        });
        final n nVar = new n();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        this.X0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<GetIsBiometricAccessEnabledUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetIsBiometricAccessEnabledUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GetIsBiometricAccessEnabledUseCase.class), objArr10, nVar);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr11 = 0 == true ? 1 : 0;
        final Object[] objArr12 = 0 == true ? 1 : 0;
        this.userCredentialsMapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<UserCredentialsMapper>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.mapper.UserCredentialsMapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UserCredentialsMapper invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(UserCredentialsMapper.class), objArr11, objArr12);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr13 = 0 == true ? 1 : 0;
        final Object[] objArr14 = 0 == true ? 1 : 0;
        this.Z0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<FetchLoginAccessStateUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.usecase.FetchLoginAccessStateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchLoginAccessStateUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FetchLoginAccessStateUseCase.class), objArr13, objArr14);
            }
        });
        final d0 d0Var = new d0();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.f33569a1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<UpdateCredentialsFormStateUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.usecase.UpdateCredentialsFormStateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UpdateCredentialsFormStateUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(UpdateCredentialsFormStateUseCase.class), objArr15, d0Var);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode9 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr16 = 0 == true ? 1 : 0;
        final Object[] objArr17 = 0 == true ? 1 : 0;
        this.f33570b1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode9, (Function0) new Function0<BiometricAuthenticationDataManager>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BiometricAuthenticationDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), objArr16, objArr17);
            }
        });
        final Object[] objArr18 = 0 == true ? 1 : 0;
        final Object[] objArr19 = 0 == true ? 1 : 0;
        this.deviceAlertsHandler = LazyKt__LazyJVMKt.lazy(new Function0<DeviceAlertsHandler>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.login.presentation.viewmodel.handler.DeviceAlertsHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final DeviceAlertsHandler invoke() {
                return androidx.camera.core.imagecapture.a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(DeviceAlertsHandler.class), objArr18, objArr19);
            }
        });
        this.f33572d1 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f33573e1 = StateFlowKt.MutableStateFlow(bool);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode10 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr20 = 0 == true ? 1 : 0;
        final Object[] objArr21 = 0 == true ? 1 : 0;
        this.f33574f1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode10, (Function0) new Function0<CheckConnectionUseCase>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.usecase.CheckConnectionUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckConnectionUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CheckConnectionUseCase.class), objArr20, objArr21);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode11 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr22 = 0 == true ? 1 : 0;
        final Object[] objArr23 = 0 == true ? 1 : 0;
        this.deviceIdDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode11, (Function0) new Function0<DeviceIdDataSource>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$special$$inlined$inject$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.localstorage.DeviceIdDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceIdDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), objArr22, objArr23);
            }
        });
        this.postLoginRoute = RouteConstants.DASHBOARD;
    }

    public void getNativeFeatureFlag() {
    }

    public void logActivityEvent() {
    }

    public void openWebDeviceActivation() {
    }

    public void trackGoogleAssistantLoginScreen() {
    }
}
