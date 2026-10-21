package com.bbva.glomohybrid.base.cells.channels;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.base.cells.components.InactiveSessionComponent;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\n\b\u0002¢\u0006\u0005\b\u0094\u0001\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R!\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010\u0016R!\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0016R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b3\u0010\u0016R!\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u0010\u0016R'\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0014\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u0016R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u0016R#\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0014\u001a\u0004\bC\u0010\u0016R#\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0014\u001a\u0004\bF\u0010\u0016R#\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0014\u001a\u0004\bI\u0010\u0016R#\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u0014\u001a\u0004\bL\u0010\u0016R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0014\u001a\u0004\bP\u0010\u0016R#\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0014\u001a\u0004\bS\u0010\u0016R#\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0014\u001a\u0004\bV\u0010\u0016R#\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\u0014\u001a\u0004\bY\u0010\u0016R#\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\u0014\u001a\u0004\b\\\u0010\u0016R!\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b^\u0010\u0014\u001a\u0004\b_\u0010\u0016R!\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\u0014\u001a\u0004\bb\u0010\u0016R!\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\u0014\u001a\u0004\be\u0010\u0016R!\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010\u0014\u001a\u0004\bh\u0010\u0016R!\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\u0014\u001a\u0004\bk\u0010\u0016R!\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010\u0014\u001a\u0004\bn\u0010\u0016R!\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010\u0014\u001a\u0004\bq\u0010\u0016R#\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bs\u0010\u0014\u001a\u0004\bt\u0010\u0016R#\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u0010\u0014\u001a\u0004\bw\u0010\u0016R!\u0010{\u001a\b\u0012\u0004\u0012\u00020>0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\by\u0010\u0014\u001a\u0004\bz\u0010\u0016R!\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010\u0014\u001a\u0004\b~\u0010\u0016R&\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0014\u001a\u0005\b\u0081\u0001\u0010\u0016R&\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0083\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010\u0014\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R$\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020|0\u00118FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0014\u001a\u0005\b\u0089\u0001\u0010\u0016R$\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0014\u001a\u0005\b\u008c\u0001\u0010\u0016R$\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0014\u001a\u0005\b\u008f\u0001\u0010\u0016R\u001f\u0010\u0093\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/CellsChannels;", "", "", "TEMPORAL_PASSWORD_DATA_CHANNEL", "Ljava/lang/String;", "LOGOUT_CHANNEL", "FEEDBACK_CHANNEL", "SWITCH_USER_CHANNEL", "NATIVE_LOGIN_SUCCESS_CHANNEL", "CLEAN_DATA_CHANGE_USER", "SEND_NATIVE_BACK", "CONFIG_HOST_SINGLE_APP_CHANNEL", "CLOSE_NOTIFICATION_CHANNEL", "OTHER_BANKS_CHANNEL", "NATIVE_CLICK_EVENT", "NATIVE_BIOCATCH_SINGLEAPP_CHANNEL", "NATIVE_WEBVIEW_OPENED", "Lcom/bbva/cellscore/channel/model/Channel;", "Ljava/lang/Void;", "a", "Lkotlin/Lazy;", "getChangeUserChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "changeUserChannel", "b", "getInactiveChannel", "inactiveChannel", "", "c", "getNativeRateAppChannel", "nativeRateAppChannel", "d", "getLoginWithGenderChannel", "loginWithGenderChannel", "e", "getLoginErrorsChannel", "loginErrorsChannel", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "f", "getAccessTokenChannel", "accessTokenChannel", "g", "getUserIdChannel", "userIdChannel", "h", "getGlobalNativeUuidChannel", "globalNativeUuidChannel", "i", "getGlobalNativeGemaUuidChannel", "globalNativeGemaUuidChannel", "j", "getNativeLoginSuccess", "nativeLoginSuccess", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "k", "getAnonymousLoginErrorChannel", "anonymousLoginErrorChannel", "l", "getNativeAnonymousAtmLoginRequestChannel", "getNativeAnonymousAtmLoginRequestChannel$annotations", "()V", "nativeAnonymousAtmLoginRequestChannel", "", "m", "getEnableMenuSwipeChannel", "enableMenuSwipeChannel", "n", "getLogoutSuccessChannel", "logoutSuccessChannel", "o", "getShowGenericErrorChannel", "showGenericErrorChannel", "p", "getOpenMenuChannel", "openMenuChannel", "q", "getGlobalRateApp", "globalRateApp", "Lcom/bbva/glomohybrid/base/router/Route;", "r", "getCrashErrorScreenNavigationChannel", "crashErrorScreenNavigationChannel", "s", "getExpiredSessionChannel", "expiredSessionChannel", "t", "getSessionTimeStampResetChannel", "sessionTimeStampResetChannel", "u", "getNotifyDashboardLoadedChannel", "notifyDashboardLoadedChannel", SharedPrefsStorage.VERSION_KEY, "getWebVisibleChannel", "webVisibleChannel", "w", "getShortcutChannel", "shortcutChannel", "x", "getSharingChannel", "sharingChannel", "y", "getCellsModalOpenedWebChannel", "cellsModalOpenedWebChannel", "z", "getCellsModalClosedWebChannel", "cellsModalClosedWebChannel", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSendNativeBackWebChannel", "sendNativeBackWebChannel", "B", "getRateYourAppChannel", "rateYourAppChannel", "C", "getOpenAppPermissionsSettings", "openAppPermissionsSettings", "D", "getOpenNotificationDetail", "openNotificationDetail", ExifInterface.LONGITUDE_EAST, "getOpenNotification", "openNotification", "F", "getOnCloseSessionSuccess", "onCloseSessionSuccess", "", "G", "getUserLifePointsChannel", "userLifePointsChannel", "H", "getCloseInAppBrowserChannel", "closeInAppBrowserChannel", "Lcom/bbva/cellscore/web/model/channel/WebChannel;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHostSingleAppChannel", "()Lcom/bbva/cellscore/web/model/channel/WebChannel;", "hostSingleAppChannel", "J", "getSetSponsoredUser", "setSponsoredUser", "K", "getDownloadDynamicModuleChannel", "downloadDynamicModuleChannel", "L", "isDynamicModuleInstalledChannel", "", "getWebChannels", "()Ljava/util/List;", "webChannels", "<init>", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class CellsChannels {

    @NotNull
    public static final String CLEAN_DATA_CHANGE_USER = "clean_data_change_user";

    @NotNull
    public static final String CLOSE_NOTIFICATION_CHANNEL = "close_notification";

    @NotNull
    public static final String CONFIG_HOST_SINGLE_APP_CHANNEL = "change_host_single_app";

    @NotNull
    public static final String FEEDBACK_CHANNEL = "global_navigation_to_appFeedback";

    @NotNull
    public static final String LOGOUT_CHANNEL = "global_launch_logout_clicked";

    @NotNull
    public static final String NATIVE_BIOCATCH_SINGLEAPP_CHANNEL = "global_native_biocatch_singleapp";

    @NotNull
    public static final String NATIVE_CLICK_EVENT = "native_click_event";

    @NotNull
    public static final String NATIVE_LOGIN_SUCCESS_CHANNEL = "native_login_success";

    @NotNull
    public static final String NATIVE_WEBVIEW_OPENED = "native_webview_opened";

    @NotNull
    public static final String OTHER_BANKS_CHANNEL = "other_banks_login";

    @NotNull
    public static final String SEND_NATIVE_BACK = "native_back_button_clicked";

    @NotNull
    public static final String SWITCH_USER_CHANNEL = "global_switch_user";

    @NotNull
    public static final String TEMPORAL_PASSWORD_DATA_CHANNEL = "global_temporal_login_data";

    @NotNull
    public static final CellsChannels INSTANCE = new CellsChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy changeUserChannel = LazyKt__LazyJVMKt.lazy(e.f31104p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy inactiveChannel = LazyKt__LazyJVMKt.lazy(o.f31122p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy nativeRateAppChannel = LazyKt__LazyJVMKt.lazy(v.f31129p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy loginWithGenderChannel = LazyKt__LazyJVMKt.lazy(r.f31125p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy loginErrorsChannel = LazyKt__LazyJVMKt.lazy(q.f31124p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy accessTokenChannel = LazyKt__LazyJVMKt.lazy(a.f31096p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy userIdChannel = LazyKt__LazyJVMKt.lazy(j0.f31115p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy globalNativeUuidChannel = LazyKt__LazyJVMKt.lazy(l.f31118p0);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy globalNativeGemaUuidChannel = LazyKt__LazyJVMKt.lazy(k.f31116p0);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy nativeLoginSuccess = LazyKt__LazyJVMKt.lazy(u.f31128p0);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy anonymousLoginErrorChannel = LazyKt__LazyJVMKt.lazy(b.f31098p0);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy nativeAnonymousAtmLoginRequestChannel = LazyKt__LazyJVMKt.lazy(t.f31127p0);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Lazy enableMenuSwipeChannel = LazyKt__LazyJVMKt.lazy(i.f31112p0);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy logoutSuccessChannel = LazyKt__LazyJVMKt.lazy(s.f31126p0);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy showGenericErrorChannel = LazyKt__LazyJVMKt.lazy(i0.f31113p0);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy openMenuChannel = LazyKt__LazyJVMKt.lazy(z.f31133p0);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy globalRateApp = LazyKt__LazyJVMKt.lazy(m.f31120p0);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy crashErrorScreenNavigationChannel = LazyKt__LazyJVMKt.lazy(g.f31108p0);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy expiredSessionChannel = LazyKt__LazyJVMKt.lazy(j.f31114p0);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy sessionTimeStampResetChannel = LazyKt__LazyJVMKt.lazy(e0.f31105p0);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy notifyDashboardLoadedChannel = LazyKt__LazyJVMKt.lazy(w.f31130p0);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy webVisibleChannel = LazyKt__LazyJVMKt.lazy(l0.f31119p0);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy shortcutChannel = LazyKt__LazyJVMKt.lazy(h0.f31111p0);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy sharingChannel = LazyKt__LazyJVMKt.lazy(g0.f31109p0);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy cellsModalOpenedWebChannel = LazyKt__LazyJVMKt.lazy(d.f31102p0);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy cellsModalClosedWebChannel = LazyKt__LazyJVMKt.lazy(c.f31100p0);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final Lazy sendNativeBackWebChannel = LazyKt__LazyJVMKt.lazy(d0.f31103p0);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final Lazy rateYourAppChannel = LazyKt__LazyJVMKt.lazy(c0.f31101p0);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final Lazy openAppPermissionsSettings = LazyKt__LazyJVMKt.lazy(y.f31132p0);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final Lazy openNotificationDetail = LazyKt__LazyJVMKt.lazy(b0.f31099p0);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final Lazy openNotification = LazyKt__LazyJVMKt.lazy(a0.f31097p0);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final Lazy onCloseSessionSuccess = LazyKt__LazyJVMKt.lazy(x.f31131p0);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final Lazy userLifePointsChannel = LazyKt__LazyJVMKt.lazy(k0.f31117p0);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final Lazy closeInAppBrowserChannel = LazyKt__LazyJVMKt.lazy(f.f31106p0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final Lazy hostSingleAppChannel = LazyKt__LazyJVMKt.lazy(n.f31121p0);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final Lazy setSponsoredUser = LazyKt__LazyJVMKt.lazy(f0.f31107p0);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final Lazy downloadDynamicModuleChannel = LazyKt__LazyJVMKt.lazy(h.f31110p0);

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final Lazy isDynamicModuleInstalledChannel = LazyKt__LazyJVMKt.lazy(p.f31123p0);

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<AccessToken>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31096p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<AccessToken> invoke() {
            return new WebChannel.Builder(UserTypeChannels.GLOBAL_AUTH_GLOMO).toWebObject(new i8.d(2)).toNativeObject(new j4.b(0)).onSave(new w4.j(1)).onRestore(new com.google.android.gms.internal.mlkit_common.a()).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class a0 extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a0 f31097p0 = new a0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("open_notification").toNativeObject(new z0.b(3)).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class b extends Lambda implements Function0<Channel<LoginException>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31098p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<LoginException> invoke() {
            return z1.b("global_anonymous_login_error", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class b0 extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b0 f31099p0 = new b0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("open_notification_detail").toNativeObject(new bc.org.bouncycastle.math.ec.a()).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class c extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31100p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return z1.b("cells_to_native_modal_closed", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class c0 extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c0 f31101p0 = new c0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return z1.b("feedback_show_rate_the_app", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class d extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f31102p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return z1.b("cells_to_native_modal_opened", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class d0 extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d0 f31103p0 = new d0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return z1.b("native_back_button_clicked_close_modal", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class e extends Lambda implements Function0<Channel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f31104p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Void> invoke() {
            return new Channel<>("change-user");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class e0 extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e0 f31105p0 = new e0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return androidx.databinding.f.d("session_timestamp_reset");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class f extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f31106p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return androidx.databinding.f.d("in_app_browser_closed");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class f0 extends Lambda implements Function0<WebChannel<Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f0 f31107p0 = new f0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Integer> invoke() {
            return new WebChannel.Builder("set_sponsored_user").toNativeObject(new ai.a()).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class g extends Lambda implements Function0<WebChannel<Route>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f31108p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Route> invoke() {
            return androidx.databinding.f.d("crash_error_navigation_channel");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class g0 extends Lambda implements Function0<Channel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g0 f31109p0 = new g0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<String> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("global_share_product_info_account").toNativeObject(new androidx.collection.h()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class h extends Lambda implements Function0<Channel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f31110p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<String> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("global_native_download_dynamic_modules").toNativeObject(new k4.d(2)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class h0 extends Lambda implements Function0<Channel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h0 f31111p0 = new h0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<String> invoke() {
            return z1.b("shortcut_navigation", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class i extends Lambda implements Function0<WebChannel<Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f31112p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Boolean> invoke() {
            return new WebChannel.Builder("global_enable_menu_swipe").toNativeObject(new w4.q()).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class i0 extends Lambda implements Function0<Channel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i0 f31113p0 = new i0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Object> invoke() {
            return z1.b("show_generic_error", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class j extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f31114p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return androidx.databinding.f.d("session_timeout_expired");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class j0 extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j0 f31115p0 = new j0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d("native_user_id");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class k extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f31116p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d("global_native_gema_uuid");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class k0 extends Lambda implements Function0<WebChannel<Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k0 f31117p0 = new k0(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Integer> invoke() {
            return new WebChannel.Builder("user_life_points").toNativeObject(new b2.a(2)).create();
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class l extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f31118p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d("global_native_uuid");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class l0 extends Lambda implements Function0<Channel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l0 f31119p0 = new l0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Void> invoke() {
            return z1.b("native_page_visible", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class m extends Lambda implements Function0<Channel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f31120p0 = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Object> invoke() {
            return z1.b("global_rate_app", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class n extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f31121p0 = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d(CellsChannels.CONFIG_HOST_SINGLE_APP_CHANNEL);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class o extends Lambda implements Function0<Channel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f31122p0 = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Void> invoke() {
            return new Channel<>(InactiveSessionComponent.ID);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class p extends Lambda implements Function0<Channel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f31123p0 = new p(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<String> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("global_native_is_dynamic_module_installed").toNativeObject(new z0.a(3)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class q extends Lambda implements Function0<Channel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f31124p0 = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Void> invoke() {
            return new Channel<>("login-errors-channel");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class r extends Lambda implements Function0<Channel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f31125p0 = new r(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<String> invoke() {
            return new Channel<>("login-with-gender");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class s extends Lambda implements Function0<Channel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f31126p0 = new s(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Object> invoke() {
            return z1.b("logout_success", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class t extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f31127p0 = new t(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return z1.b("native_anonymous_atm_login_request", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class u extends Lambda implements Function0<Channel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f31128p0 = new u(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Void> invoke() {
            return new Channel<>(CellsChannels.NATIVE_LOGIN_SUCCESS_CHANNEL);
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class v extends Lambda implements Function0<Channel<Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final v f31129p0 = new v(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Unit> invoke() {
            return new Channel<>("native-rate-app");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class w extends Lambda implements Function0<Channel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final w f31130p0 = new w(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Object> invoke() {
            return z1.b("notify_dashboard_loaded", "create(...)");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class x extends Lambda implements Function0<WebChannel<Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f31131p0 = new x(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Boolean> invoke() {
            return androidx.databinding.f.d("app_on_session_close");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class y extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f31132p0 = new y(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return androidx.databinding.f.d("open_app_permissions_settings");
        }
    }

    /* JADX INFO: compiled from: CellsChannels.kt */
    public static final class z extends Lambda implements Function0<Channel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f31133p0 = new z(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Object> invoke() {
            return z1.b("global_open_native_menu", "create(...)");
        }
    }

    @NotNull
    public final Channel<AccessToken> getAccessTokenChannel() {
        Object value = accessTokenChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<LoginException> getAnonymousLoginErrorChannel() {
        return (Channel) anonymousLoginErrorChannel.getValue();
    }

    @NotNull
    public final Channel<Unit> getCellsModalClosedWebChannel() {
        return (Channel) cellsModalClosedWebChannel.getValue();
    }

    @NotNull
    public final Channel<Unit> getCellsModalOpenedWebChannel() {
        return (Channel) cellsModalOpenedWebChannel.getValue();
    }

    @NotNull
    public final Channel<Void> getChangeUserChannel() {
        return (Channel) changeUserChannel.getValue();
    }

    @NotNull
    public final Channel<Object> getCloseInAppBrowserChannel() {
        Object value = closeInAppBrowserChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Route> getCrashErrorScreenNavigationChannel() {
        Object value = crashErrorScreenNavigationChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getDownloadDynamicModuleChannel() {
        return (Channel) downloadDynamicModuleChannel.getValue();
    }

    @NotNull
    public final Channel<Boolean> getEnableMenuSwipeChannel() {
        Object value = enableMenuSwipeChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getExpiredSessionChannel() {
        Object value = expiredSessionChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getGlobalNativeGemaUuidChannel() {
        Object value = globalNativeGemaUuidChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getGlobalNativeUuidChannel() {
        Object value = globalNativeUuidChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getGlobalRateApp() {
        return (Channel) globalRateApp.getValue();
    }

    @NotNull
    public final WebChannel<String> getHostSingleAppChannel() {
        Object value = hostSingleAppChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WebChannel) value;
    }

    @NotNull
    public final Channel<Void> getInactiveChannel() {
        return (Channel) inactiveChannel.getValue();
    }

    @NotNull
    public final Channel<Void> getLoginErrorsChannel() {
        return (Channel) loginErrorsChannel.getValue();
    }

    @NotNull
    public final Channel<String> getLoginWithGenderChannel() {
        return (Channel) loginWithGenderChannel.getValue();
    }

    @NotNull
    public final Channel<Object> getLogoutSuccessChannel() {
        return (Channel) logoutSuccessChannel.getValue();
    }

    @NotNull
    public final Channel<Unit> getNativeAnonymousAtmLoginRequestChannel() {
        return (Channel) nativeAnonymousAtmLoginRequestChannel.getValue();
    }

    @NotNull
    public final Channel<Void> getNativeLoginSuccess() {
        return (Channel) nativeLoginSuccess.getValue();
    }

    @NotNull
    public final Channel<Unit> getNativeRateAppChannel() {
        return (Channel) nativeRateAppChannel.getValue();
    }

    @NotNull
    public final Channel<Object> getNotifyDashboardLoadedChannel() {
        return (Channel) notifyDashboardLoadedChannel.getValue();
    }

    @NotNull
    public final Channel<Boolean> getOnCloseSessionSuccess() {
        Object value = onCloseSessionSuccess.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getOpenAppPermissionsSettings() {
        Object value = openAppPermissionsSettings.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getOpenMenuChannel() {
        return (Channel) openMenuChannel.getValue();
    }

    @NotNull
    public final Channel<String> getOpenNotification() {
        Object value = openNotification.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getOpenNotificationDetail() {
        Object value = openNotificationDetail.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Unit> getRateYourAppChannel() {
        return (Channel) rateYourAppChannel.getValue();
    }

    @NotNull
    public final Channel<Unit> getSendNativeBackWebChannel() {
        return (Channel) sendNativeBackWebChannel.getValue();
    }

    @NotNull
    public final Channel<Object> getSessionTimeStampResetChannel() {
        Object value = sessionTimeStampResetChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Integer> getSetSponsoredUser() {
        Object value = setSponsoredUser.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getSharingChannel() {
        return (Channel) sharingChannel.getValue();
    }

    @NotNull
    public final Channel<String> getShortcutChannel() {
        return (Channel) shortcutChannel.getValue();
    }

    @NotNull
    public final Channel<Object> getShowGenericErrorChannel() {
        return (Channel) showGenericErrorChannel.getValue();
    }

    @NotNull
    public final Channel<String> getUserIdChannel() {
        Object value = userIdChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Integer> getUserLifePointsChannel() {
        Object value = userLifePointsChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final List<Channel<?>> getWebChannels() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Channel[]{getAccessTokenChannel(), getEnableMenuSwipeChannel(), getLogoutSuccessChannel(), getOpenMenuChannel(), getExpiredSessionChannel(), getWebVisibleChannel(), getSharingChannel(), getSessionTimeStampResetChannel(), getNotifyDashboardLoadedChannel()});
    }

    @NotNull
    public final Channel<Void> getWebVisibleChannel() {
        return (Channel) webVisibleChannel.getValue();
    }

    @NotNull
    public final Channel<String> isDynamicModuleInstalledChannel() {
        return (Channel) isDynamicModuleInstalledChannel.getValue();
    }

    @Deprecated(message = "Anonymous interceptor is available")
    public static /* synthetic */ void getNativeAnonymousAtmLoginRequestChannel$annotations() {
    }
}
