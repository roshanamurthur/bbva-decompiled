package com.salesforce.marketingcloud.events;

import androidx.annotation.RestrictTo;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.contacts.ContactAccessor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0006\u001aC\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\b*\n\u0012\u0006\b\u0000\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007¢\u0006\u0004\b\u0005\u0010\u000e\u001a3\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b*\n\u0012\u0006\b\u0000\u0012\u00020\u00000\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000f\u001aF\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0002\u001aP\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u001aJ\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\"\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/salesforce/marketingcloud/events/Event;", "", "", "", "", "a", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "b", "", "Ljava/util/EnumSet;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "producers", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", ContactAccessor.CATEGORIES, "([Ljava/lang/Object;Ljava/util/EnumSet;Ljava/util/EnumSet;)[Lcom/salesforce/marketingcloud/events/Event;", "([Ljava/lang/Object;Ljava/util/EnumSet;)[Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "output", "source", "prefix", AnalyticsConstants.Key.ITEM, "", "Ljava/lang/String;", "TAG", "sdk_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUtils.kt\ncom/salesforce/marketingcloud/events/EventUtilsKt\n+ 2 ApplicationUtils.kt\ncom/salesforce/marketingcloud/sfmcsdk/util/ApplicationUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n58#2:183\n58#2:186\n37#3,2:184\n37#3,2:187\n1855#4,2:189\n*S KotlinDebug\n*F\n+ 1 EventUtils.kt\ncom/salesforce/marketingcloud/events/EventUtilsKt\n*L\n59#1:183\n87#1:186\n69#1:184,2\n97#1:187,2\n173#1:189,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f64175a = com.salesforce.marketingcloud.g.a("EventUtilsKt");

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.sfmcsdk.components.events.Event f64176a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.salesforce.marketingcloud.sfmcsdk.components.events.Event event) {
            super(0);
            this.f64176a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "(" + this.f64176a + ") returned null during conversion to Push SDK Event.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f64177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(0);
            this.f64177a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return androidx.camera.core.impl.a.e(new StringBuilder("Failed to convert event '"), this.f64177a, "' to Push SDK Event.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Event f64178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Event event) {
            super(0);
            this.f64178a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "(" + this.f64178a + ") returned null during conversion to SFMC SDK Event.";
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.events.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class C0249d extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f64179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0249d(Object obj) {
            super(0);
            this.f64179a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return androidx.camera.core.impl.a.e(new StringBuilder("Failed to convert event '"), this.f64179a, "' to SFMCSdk Event.");
        }
    }

    @Nullable
    public static final Event a(@NotNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event event) {
        Intrinsics.checkNotNullParameter(event, "<this>");
        return EventManager.INSTANCE.customEvent(event.getName(), event.attributes(), event.getProducer());
    }

    @Nullable
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event b(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "<this>");
        return com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.Companion.customEvent$default(com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.INSTANCE, event.getName(), event.attributes(), com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH, null, 8, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, List<Object>> a(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "<this>");
        return a(new LinkedHashMap(), event.attributes(), (String) null, 4, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] b(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return a(objArr, null, 1, null);
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, Object obj, String str) {
        try {
            if (obj instanceof List) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                return a(map, (List<Object>) TypeIntrinsics.asMutableList(obj), str);
            }
            if (!(obj instanceof Map)) {
                return map;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>");
            return a(map, (Map<Object, Object>) TypeIntrinsics.asMutableMap(obj), str);
        } catch (Exception unused) {
            return map;
        }
    }

    @JvmOverloads
    @NotNull
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] b(@NotNull Object[] objArr, @NotNull EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer> producers) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(producers, "producers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                try {
                    Event event = (Event) obj;
                    if (producers.contains(event.getProducer())) {
                        com.salesforce.marketingcloud.sfmcsdk.components.events.Event eventB = b(event);
                        if ((eventB != null ? Boolean.valueOf(arrayList.add(eventB)) : null) == null) {
                            com.salesforce.marketingcloud.g.c(com.salesforce.marketingcloud.g.f64223a, f64175a, null, new c(event), 2, null);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f64223a, f64175a, null, new C0249d(obj), 2, null);
                }
            }
        }
        return (com.salesforce.marketingcloud.sfmcsdk.components.events.Event[]) arrayList.toArray(new com.salesforce.marketingcloud.sfmcsdk.components.events.Event[0]);
    }

    public static /* synthetic */ Map a(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            str = "";
        }
        return a((Map<String, List<Object>>) map, obj, str);
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, List<Object> list, String str) {
        for (Object obj : list) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (obj != null) {
                if (a(obj)) {
                    map.putAll(a(map, obj, str));
                } else {
                    List<Object> list2 = map.get(lowerCase);
                    if (list2 == null || list2.isEmpty()) {
                        map.put(lowerCase, CollectionsKt__CollectionsKt.mutableListOf(obj));
                    } else {
                        List<Object> list3 = map.get(lowerCase);
                        if (list3 != null) {
                            list3.add(obj);
                        }
                    }
                }
            }
        }
        return map;
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, Map<Object, Object> map2, String str) {
        String str2;
        for (Map.Entry<Object, Object> entry : map2.entrySet()) {
            if (!l.isBlank(str)) {
                str2 = str + '.' + entry.getKey();
            } else {
                Object key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) key;
            }
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (a(entry.getValue())) {
                map.putAll(a(map, entry.getValue(), lowerCase));
            } else {
                List<Object> list = map.get(lowerCase);
                if (list == null || list.isEmpty()) {
                    map.put(lowerCase, CollectionsKt__CollectionsKt.mutableListOf(entry.getValue()));
                } else {
                    List<Object> list2 = map.get(lowerCase);
                    if (list2 != null) {
                        list2.add(entry.getValue());
                    }
                }
            }
        }
        return map;
    }

    private static final boolean a(Object obj) {
        if (obj instanceof Map) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        for (Object obj2 : (Iterable) obj) {
            if (obj2 != null && a(obj2)) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return a(objArr, (EnumSet) null, (EnumSet) null, 3, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr, @NotNull EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer> producers) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(producers, "producers");
        return a(objArr, producers, (EnumSet) null, 2, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr, @NotNull EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer> producers, @NotNull EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Category> categories) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(producers, "producers");
        Intrinsics.checkNotNullParameter(categories, "categories");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                try {
                    com.salesforce.marketingcloud.sfmcsdk.components.events.Event event = (com.salesforce.marketingcloud.sfmcsdk.components.events.Event) obj;
                    if (producers.contains(event.getProducer()) && categories.contains(event.getCategory())) {
                        Event eventA = a(event);
                        if ((eventA != null ? Boolean.valueOf(arrayList.add(eventA)) : null) == null) {
                            com.salesforce.marketingcloud.g.c(com.salesforce.marketingcloud.g.f64223a, f64175a, null, new a(event), 2, null);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.g.f64223a, f64175a, null, new b(obj), 2, null);
                }
            }
        }
        return (Event[]) arrayList.toArray(new Event[0]);
    }

    public static /* synthetic */ Event[] a(Object[] objArr, EnumSet enumSet, EnumSet enumSet2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumSet = EnumSet.allOf(com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.class);
            Intrinsics.checkNotNullExpressionValue(enumSet, "allOf(\n        UnifiedSd…roducer::class.java\n    )");
        }
        if ((i10 & 2) != 0) {
            enumSet2 = EnumSet.allOf(com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Category.class);
            Intrinsics.checkNotNullExpressionValue(enumSet2, "allOf(UnifiedSdkEvent.Category::class.java)");
        }
        return a(objArr, (EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer>) enumSet, (EnumSet<com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Category>) enumSet2);
    }

    public static /* synthetic */ com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] a(Object[] objArr, EnumSet enumSet, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumSet = EnumSet.allOf(com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.class);
            Intrinsics.checkNotNullExpressionValue(enumSet, "allOf(UnifiedSdkEvent.Producer::class.java)");
        }
        return b(objArr, enumSet);
    }
}
