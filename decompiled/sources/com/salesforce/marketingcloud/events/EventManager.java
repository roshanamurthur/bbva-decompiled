package com.salesforce.marketingcloud.events;

import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.sfmcsdk.BuildConfig;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager;", "", "()V", "track", "", "events", "", "Lcom/salesforce/marketingcloud/events/Event;", "([Lcom/salesforce/marketingcloud/events/Event;)V", "AuthEventType", "Companion", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EventManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = com.salesforce.marketingcloud.g.a("EventManager");

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager$AuthEventType;", "", "(Ljava/lang/String;I)V", "LOGIN", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AuthEventType {
        LOGIN
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager$Companion;", "", "", "name", "", k.a.f65041h, "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "producer", "Lcom/salesforce/marketingcloud/events/Event;", "customEvent", "input", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEventManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventManager.kt\ncom/salesforce/marketingcloud/events/EventManager$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,107:1\n215#2,2:108\n*S KotlinDebug\n*F\n+ 1 EventManager.kt\ncom/salesforce/marketingcloud/events/EventManager$Companion\n*L\n46#1:108,2\n*E\n"})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        public static final class a extends Lambda implements Function0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f64141a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f64141a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return ad.d.f(new StringBuilder(), this.f64141a, " contains a \".\" and will be dropped.");
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        public static final class b extends Lambda implements Function0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f64142a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.f64142a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return ad.d.f(new StringBuilder(), this.f64142a, " is null, blank, starts with a \"$\", or contains a line break and will be dropped.");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event a(Companion companion, String str, Map map, com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = q.emptyMap();
            }
            if ((i10 & 4) != 0) {
                producer = com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH;
            }
            return companion.customEvent(str, map, producer);
        }

        @Nullable
        public final String b(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            String string = StringsKt__StringsKt.trim((CharSequence) input).toString();
            if (!l.isBlank(string) && !l.startsWith$default(string, Constant.MXN_SYMBOL, false, 2, null) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) RootService.LINE_BREAK, false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "\r", false, 2, (Object) null)) {
                return string;
            }
            com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f64223a, EventManager.TAG, null, new b(input), 2, null);
            return null;
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return customEvent(name, q.emptyMap(), com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH);
        }

        @Nullable
        public final String a(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (!StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) Constant.DOT_STRING, false, 2, (Object) null)) {
                return b(input);
            }
            com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f64223a, EventManager.TAG, null, new a(input), 2, null);
            return null;
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return customEvent(name, attributes, com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH);
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(producer, "producer");
            String strB = b(name);
            if (strB == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                String strA = EventManager.INSTANCE.a(entry.getKey());
                if (strA != null) {
                    linkedHashMap.put(strA, entry.getValue());
                }
            }
            return new com.salesforce.marketingcloud.events.b(strB, linkedHashMap, producer);
        }
    }

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str) {
        return INSTANCE.customEvent(str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "To leverage the benefits of the Unified SDK propagating your tracked events across all configured products, please use its event tracking API rather than the Push specific event tracking.", replaceWith = @ReplaceWith(expression = "SFMCSdk.track(event)", imports = {BuildConfig.LIBRARY_PACKAGE_NAME}))
    public abstract void track(@NotNull Event... events);

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        return INSTANCE.customEvent(str, map);
    }

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer) {
        return INSTANCE.customEvent(str, map, producer);
    }
}
