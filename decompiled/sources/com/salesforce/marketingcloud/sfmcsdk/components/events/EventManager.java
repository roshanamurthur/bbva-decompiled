package com.salesforce.marketingcloud.sfmcsdk.components.events;

import ad.d;
import androidx.camera.core.impl.utils.c;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutorsKt;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EventManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventManager;", "", "moduleName", "", "(Ljava/lang/String;)V", "subscribe", "", "subscriber", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventSubscriber;", "track", "events", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "([Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;)V", "unsubscribe", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EventManager {

    @NotNull
    public static final String TAG = "~$EventManager";

    @NotNull
    private final String moduleName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<EventSubscriber> subscribers = new ArrayList();

    /* JADX INFO: compiled from: EventManager.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u0016J/\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u001c\"\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018H\u0000¢\u0006\u0002\b R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventManager$Companion;", "", "()V", "TAG", "", "subscribers", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventSubscriber;", "customEvent", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "name", k.a.f65041h, "", "producer", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "category", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "getValidatedAttributeKey", "input", "prefix", "getValidatedName", "identityEvent", "identityEvent$sfmcsdk_release", "publish", "", "executors", "Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;", "events", "", "publish$sfmcsdk_release", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;[Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;)V", "staticTearDown", "staticTearDown$sfmcsdk_release", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event customEvent$default(Companion companion, String str, Map map, Event.Producer producer, Event.Category category, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = q.emptyMap();
            }
            if ((i10 & 4) != 0) {
                producer = Event.Producer.SFMC_SDK;
            }
            if ((i10 & 8) != 0) {
                category = Event.Category.ENGAGEMENT;
            }
            return companion.customEvent(str, map, producer, category);
        }

        private final String getValidatedAttributeKey(final String input, final String prefix) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) Constant.DOT_STRING, false, 2, (Object) null)) {
                return getValidatedName(input, prefix);
            }
            SFMCSdkLogger.INSTANCE.w(EventManager.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$getValidatedAttributeKey$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(prefix);
                    sb2.append(" '");
                    return d.f(sb2, input, "' contains a \".\" and will be dropped.");
                }
            });
            return null;
        }

        public static /* synthetic */ String getValidatedAttributeKey$default(Companion companion, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = "Attribute Key";
            }
            return companion.getValidatedAttributeKey(str, str2);
        }

        private final String getValidatedName(final String input, final String prefix) {
            String string = StringsKt__StringsKt.trim((CharSequence) input).toString();
            if (!l.isBlank(string) && !l.startsWith$default(string, Constant.MXN_SYMBOL, false, 2, null) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) RootService.LINE_BREAK, false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "\r", false, 2, (Object) null)) {
                return string;
            }
            SFMCSdkLogger.INSTANCE.w(EventManager.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$getValidatedName$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(prefix);
                    sb2.append(" '");
                    return d.f(sb2, input, "' is null, blank, starts with a \"$\", or contains a line break and will be dropped.");
                }
            });
            return null;
        }

        public static /* synthetic */ String getValidatedName$default(Companion companion, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = "Event Name";
            }
            return companion.getValidatedName(str, str2);
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Event customEvent(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return customEvent$default(this, name, null, null, null, 14, null);
        }

        @Nullable
        public final Event identityEvent$sfmcsdk_release() {
            return customEvent$default(this, "IdentityUpdate", Identity.INSTANCE.toEvent$sfmcsdk_release(), null, Event.Category.IDENTITY, 4, null);
        }

        public final void publish$sfmcsdk_release(@NotNull SdkExecutors executors, @NotNull final Event... events) {
            Intrinsics.checkNotNullParameter(executors, "executors");
            Intrinsics.checkNotNullParameter(events, "events");
            if (ArraysKt___ArraysKt.filterNotNull(events).isEmpty()) {
                return;
            }
            synchronized (EventManager.subscribers) {
                for (final EventSubscriber eventSubscriber : EventManager.subscribers) {
                    try {
                        SFMCSdkLogger.INSTANCE.d(EventManager.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                StringBuilder sb2 = new StringBuilder("Publishing events: ");
                                String string = "";
                                for (Event event : ArraysKt___ArraysKt.filterNotNull(events)) {
                                    StringBuilder sbD = c.d(string);
                                    sbD.append(l.isBlank(string) ? "" : ", ");
                                    sbD.append(Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName());
                                    sbD.append("( ");
                                    sbD.append(event.getName());
                                    sbD.append(" )");
                                    string = sbD.toString();
                                }
                                sb2.append(string);
                                sb2.append(" to subscriber: ");
                                sb2.append(eventSubscriber);
                                return sb2.toString();
                            }
                        });
                    } catch (Exception unused) {
                    }
                    try {
                        ExecutorService diskIO = executors.getDiskIO();
                        String name = eventSubscriber.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "subscriber::class.java.name");
                        SdkExecutorsKt.namedRunnable(diskIO, name, new Function0<Unit>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                EventSubscriber eventSubscriber2 = eventSubscriber;
                                Event[] eventArr = events;
                                eventSubscriber2.onEventPublished((Event[]) Arrays.copyOf(eventArr, eventArr.length));
                            }
                        });
                    } catch (Exception unused2) {
                        SFMCSdkLogger.INSTANCE.e(EventManager.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Failed to publish event(s) " + events + " to subscriber " + eventSubscriber + '.';
                            }
                        });
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void staticTearDown$sfmcsdk_release() {
            synchronized (EventManager.subscribers) {
                EventManager.subscribers.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return customEvent$default(this, name, attributes, null, null, 12, null);
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull Event.Producer producer) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(producer, "producer");
            return customEvent$default(this, name, attributes, producer, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull Event.Producer producer, @NotNull Event.Category category) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(category, "category");
            String validatedName$default = getValidatedName$default(this, name, null, 2, null);
            if (validatedName$default == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                String validatedAttributeKey$default = getValidatedAttributeKey$default(EventManager.INSTANCE, entry.getKey(), null, 2, null);
                if (validatedAttributeKey$default != null) {
                    linkedHashMap.put(validatedAttributeKey$default, entry.getValue());
                }
            }
            return new CustomEvent(validatedName$default, linkedHashMap, producer, category);
        }
    }

    public EventManager(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.moduleName = moduleName;
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Event customEvent(@NotNull String str) {
        return INSTANCE.customEvent(str);
    }

    public final void subscribe(@NotNull EventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        List<EventSubscriber> list = subscribers;
        synchronized (list) {
            list.add(subscriber);
        }
    }

    public final void track(@NotNull Event... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        String str = this.moduleName;
        Event.Producer producer = Intrinsics.areEqual(str, ModuleIdentifier.PUSH.name()) ? Event.Producer.PUSH : Intrinsics.areEqual(str, ModuleIdentifier.CDP.name()) ? Event.Producer.CDP : Event.Producer.SFMC_SDK;
        ArrayList arrayList = new ArrayList();
        for (Event event : events) {
            Event eventCustomEvent$default = Companion.customEvent$default(INSTANCE, event.getName(), event.attributes(), producer, null, 8, null);
            if (eventCustomEvent$default != null) {
                arrayList.add(eventCustomEvent$default);
            }
        }
        SFMCSdk.Companion companion = SFMCSdk.INSTANCE;
        Object[] array = arrayList.toArray(new Event[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Event[] eventArr = (Event[]) array;
        companion.track((Event[]) Arrays.copyOf(eventArr, eventArr.length));
    }

    public final void unsubscribe(@NotNull EventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        List<EventSubscriber> list = subscribers;
        synchronized (list) {
            list.remove(subscriber);
        }
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        return INSTANCE.customEvent(str, map);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Event.Producer producer) {
        return INSTANCE.customEvent(str, map, producer);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Event.Producer producer, @NotNull Event.Category category) {
        return INSTANCE.customEvent(str, map, producer, category);
    }
}
