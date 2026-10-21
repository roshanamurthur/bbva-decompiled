package com.bbva.glomohybrid.base.cells.channels;

import androidx.datastore.preferences.protobuf.q;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerContractsChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR-\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/CustomerContractsChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "Lcom/bbva/component/ic/security/utils/SecurityType;", "a", "Lkotlin/Lazy;", "getRequestOtpForCustomerContractsChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "requestOtpForCustomerContractsChannel", "", "", "b", "getResponseOtpForCustomerContractsChannel", "responseOtpForCustomerContractsChannel", "c", "Lcom/bbva/cellscore/channel/model/Channel;", "getCancelOperationCustomerContractsChannel", "cancelOperationCustomerContractsChannel", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class CustomerContractsChannels {

    @NotNull
    public static final CustomerContractsChannels INSTANCE = new CustomerContractsChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy requestOtpForCustomerContractsChannel = LazyKt__LazyJVMKt.lazy(a.f31158p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy responseOtpForCustomerContractsChannel = LazyKt__LazyJVMKt.lazy(b.f31159p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<Object> cancelOperationCustomerContractsChannel = z1.b("cancel_operation_customer_contracts", "create(...)");

    /* JADX INFO: compiled from: CustomerContractsChannels.kt */
    @SourceDebugExtension({"SMAP\nCustomerContractsChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerContractsChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/CustomerContractsChannels$requestOtpForCustomerContractsChannel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1855#2,2:34\n*S KotlinDebug\n*F\n+ 1 CustomerContractsChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/CustomerContractsChannels$requestOtpForCustomerContractsChannel$2\n*L\n13#1:34,2\n*E\n"})
    public static final class a extends Lambda implements Function0<Channel<List<? extends SecurityType>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31158p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<List<? extends SecurityType>> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("request_otp_customer_contracts").toWebObject(new q()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: CustomerContractsChannels.kt */
    public static final class b extends Lambda implements Function0<Channel<Map<String, ? extends String>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31159p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Map<String, ? extends String>> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("response_otp_customer_contracts").toNativeObject(new androidx.constraintlayout.core.state.a()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    @NotNull
    public final Channel<Object> getCancelOperationCustomerContractsChannel() {
        return cancelOperationCustomerContractsChannel;
    }

    @NotNull
    public final Channel<List<SecurityType>> getRequestOtpForCustomerContractsChannel() {
        return (Channel) requestOtpForCustomerContractsChannel.getValue();
    }

    @NotNull
    public final Channel<Map<String, String>> getResponseOtpForCustomerContractsChannel() {
        return (Channel) responseOtpForCustomerContractsChannel.getValue();
    }
}
