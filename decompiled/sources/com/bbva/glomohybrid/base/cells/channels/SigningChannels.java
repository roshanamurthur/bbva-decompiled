package com.bbva.glomohybrid.base.cells.channels;

import ad.e;
import bk.q;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SigningChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/SigningChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "", "b", "Lkotlin/Lazy;", "getNaturalHeadersSignRequest", "()Lcom/bbva/cellscore/channel/model/Channel;", "naturalHeadersSignRequest", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSigningChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SigningChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/SigningChannels\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,35:1\n478#2,7:36\n125#3:43\n152#3,3:44\n*S KotlinDebug\n*F\n+ 1 SigningChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/SigningChannels\n*L\n28#1:36,7\n30#1:43\n30#1:44,3\n*E\n"})
public final class SigningChannels {

    @NotNull
    public static final SigningChannels INSTANCE = new SigningChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f31190a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"authenticationdata", "authenticationtype", "authenticationchallenge", EventDataKeys.Identity.AUTHENTICATION_STATE});

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy naturalHeadersSignRequest = LazyKt__LazyJVMKt.lazy(a.f31192p0);

    /* JADX INFO: compiled from: SigningChannels.kt */
    @SourceDebugExtension({"SMAP\nSigningChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SigningChannels.kt\ncom/bbva/glomohybrid/base/cells/channels/SigningChannels$naturalHeadersSignRequest$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
    public static final class a extends Lambda implements Function0<Channel<Map<String, ? extends String>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31192p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Map<String, ? extends String>> invoke() {
            WebChannel webChannelCreate = new WebChannel.Builder("device_accesses_signing_headers").toWebObject(new e()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return ChannelsExtensionsKt.autoClean(webChannelCreate);
        }
    }

    public static final Map access$filterOtpChallengeHeaders(SigningChannels signingChannels, Map map) {
        signingChannels.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (f31190a.contains(lowerCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(TuplesKt.to(lowerCase2, str2));
        }
        return q.toMap(arrayList);
    }

    @NotNull
    public final Channel<Map<String, String>> getNaturalHeadersSignRequest() {
        return (Channel) naturalHeadersSignRequest.getValue();
    }
}
