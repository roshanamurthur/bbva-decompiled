package com.bbva.glomohybrid.base.cells.channels;

import ad.d;
import androidx.camera.core.processing.f;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnrollmentChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"R'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR-\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\b¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/EnrollmentChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "Lcom/bbva/component/ic/security/utils/SecurityType;", "a", "Lkotlin/Lazy;", "getNaturalAuthSignRequest", "()Lcom/bbva/cellscore/channel/model/Channel;", "naturalAuthSignRequest", "", "", "b", "getNaturalAuthSignResponse", "naturalAuthSignResponse", "c", "Lcom/bbva/cellscore/channel/model/Channel;", "getNaturalAuthSignCancelRequest", "naturalAuthSignCancelRequest", "", "d", "getDeviceAccessesSoftTokenEnrolled", "deviceAccessesSoftTokenEnrolled", "", "e", "getDeviceAccessesOpenSecuritySettings", "deviceAccessesOpenSecuritySettings", "f", "getDeviceAccessesDeviceId", "deviceAccessesDeviceId", "g", "getSecondFactorRequest", "secondFactorRequest", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class EnrollmentChannels {

    @NotNull
    public static final EnrollmentChannels INSTANCE = new EnrollmentChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy naturalAuthSignRequest = LazyKt__LazyJVMKt.lazy(a.f31167p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy naturalAuthSignResponse = LazyKt__LazyJVMKt.lazy(b.f31168p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final WebChannel f31162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final WebChannel f31163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<Unit> deviceAccessesOpenSecuritySettings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<String> deviceAccessesDeviceId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<String> secondFactorRequest;

    /* JADX INFO: compiled from: EnrollmentChannels.kt */
    @SourceDebugExtension({"SMAP\nEnrollmentChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnrollmentChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/EnrollmentChannels$naturalAuthSignRequest$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 EnrollmentChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/EnrollmentChannels$naturalAuthSignRequest$2\n*L\n15#1:63\n15#1:64,3\n*E\n"})
    public static final class a extends Lambda implements Function0<Channel<List<? extends SecurityType>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31167p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<List<? extends SecurityType>> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("device_accesses_sign_request").toWebObject(new f()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: EnrollmentChannels.kt */
    @SourceDebugExtension({"SMAP\nEnrollmentChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnrollmentChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/EnrollmentChannels$naturalAuthSignResponse$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1789#2,2:63\n1791#2:66\n1#3:65\n*S KotlinDebug\n*F\n+ 1 EnrollmentChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/EnrollmentChannels$naturalAuthSignResponse$2\n*L\n29#1:63,2\n29#1:66\n*E\n"})
    public static final class b extends Lambda implements Function0<Channel<Map<String, ? extends String>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31168p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Map<String, ? extends String>> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("device_accesses_sign_response").toNativeObject(new d()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    static {
        WebChannel webChannelCreate = new WebChannel.Builder("cancel_otp_request").create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        f31162c = webChannelCreate;
        WebChannel webChannelCreate2 = new WebChannel.Builder("device_accesses_softtoken_enrolled").toNativeObject(new androidx.camera.core.imagecapture.a()).create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate2, "create(...)");
        f31163d = webChannelCreate2;
        deviceAccessesOpenSecuritySettings = z1.b("device_accesses_open_configuration_settings", "create(...)");
        deviceAccessesDeviceId = z1.b(UserTypeChannels.DEVICE_ID, "create(...)");
        secondFactorRequest = z1.b("device_accesses_second_factor_request", "create(...)");
    }

    @NotNull
    public final Channel<String> getDeviceAccessesDeviceId() {
        return deviceAccessesDeviceId;
    }

    @NotNull
    public final Channel<Unit> getDeviceAccessesOpenSecuritySettings() {
        return deviceAccessesOpenSecuritySettings;
    }

    @NotNull
    public final Channel<Boolean> getDeviceAccessesSoftTokenEnrolled() {
        return f31163d;
    }

    @NotNull
    public final Channel<Object> getNaturalAuthSignCancelRequest() {
        return f31162c;
    }

    @NotNull
    public final Channel<List<SecurityType>> getNaturalAuthSignRequest() {
        return (Channel) naturalAuthSignRequest.getValue();
    }

    @NotNull
    public final Channel<Map<String, String>> getNaturalAuthSignResponse() {
        return (Channel) naturalAuthSignResponse.getValue();
    }

    @NotNull
    public final Channel<String> getSecondFactorRequest() {
        return secondFactorRequest;
    }
}
