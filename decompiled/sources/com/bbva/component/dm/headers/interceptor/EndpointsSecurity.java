package com.bbva.component.dm.headers.interceptor;

import android.net.Uri;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import bk.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EndpointsSecurity.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\t\u0010\nR#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u000f\u0010\f*\u0004\b\u000e\u0010\nR#\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0012\u0010\f*\u0004\b\u0011\u0010\nR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00048@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016*\u0004\b\u0014\u0010\nR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00048@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u0016*\u0004\b\u0018\u0010\n¨\u0006 "}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/EndpointsSecurity;", "", "map", "", "", "(Ljava/util/Map;)V", "defaultMap", "domainsBlacklist", "", "getDomainsBlacklist$delegate", "(Lcom/bbva/component/dm/headers/interceptor/EndpointsSecurity;)Ljava/lang/Object;", "getDomainsBlacklist", "()Ljava/util/List;", "domainsWhitelist", "getDomainsWhitelist$delegate", "getDomainsWhitelist", "endpointsWhitelist", "getEndpointsWhitelist$delegate", "getEndpointsWhitelist", "id", "getId$component_ic_token_release$delegate", "getId$component_ic_token_release", "()Ljava/lang/String;", "type", "getType$component_ic_token_release$delegate", "getType$component_ic_token_release", "isAllowedSetupToken", "", "destiny", "Landroid/net/Uri;", "isAllowedUpdateToken", "origin", "component-ic-token_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEndpointsSecurity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndpointsSecurity.kt\ncom/bbva/component/dm/headers/interceptor/EndpointsSecurity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1747#2,3:36\n2624#2,3:39\n1747#2,3:42\n1747#2,3:45\n2624#2,3:48\n*S KotlinDebug\n*F\n+ 1 EndpointsSecurity.kt\ncom/bbva/component/dm/headers/interceptor/EndpointsSecurity\n*L\n18#1:36,3\n20#1:39,3\n26#1:42,3\n28#1:45,3\n30#1:48,3\n*E\n"})
public final class EndpointsSecurity {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {i.d(EndpointsSecurity.class, "id", "getId$component_ic_token_release()Ljava/lang/String;", 0), i.d(EndpointsSecurity.class, "type", "getType$component_ic_token_release()Ljava/lang/String;", 0), i.d(EndpointsSecurity.class, "endpointsWhitelist", "getEndpointsWhitelist()Ljava/util/List;", 0), i.d(EndpointsSecurity.class, "domainsWhitelist", "getDomainsWhitelist()Ljava/util/List;", 0), i.d(EndpointsSecurity.class, "domainsBlacklist", "getDomainsBlacklist()Ljava/util/List;", 0)};

    @NotNull
    private final Map<String, Object> defaultMap;

    /* JADX INFO: compiled from: EndpointsSecurity.kt */
    public static final class a extends Lambda implements Function1<String, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27660p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public EndpointsSecurity(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.defaultMap = o.withDefault(map, a.f27660p0);
    }

    private final List<String> getDomainsBlacklist() {
        return (List) o.getOrImplicitDefaultNullable(this.defaultMap, $$delegatedProperties[4].getName());
    }

    private final List<String> getDomainsWhitelist() {
        return (List) o.getOrImplicitDefaultNullable(this.defaultMap, $$delegatedProperties[3].getName());
    }

    private final List<String> getEndpointsWhitelist() {
        return (List) o.getOrImplicitDefaultNullable(this.defaultMap, $$delegatedProperties[2].getName());
    }

    @Nullable
    public final String getId$component_ic_token_release() {
        return (String) o.getOrImplicitDefaultNullable(this.defaultMap, $$delegatedProperties[0].getName());
    }

    @Nullable
    public final String getType$component_ic_token_release() {
        return (String) o.getOrImplicitDefaultNullable(this.defaultMap, $$delegatedProperties[1].getName());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:1: B:22:0x0059->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1 A[EDGE_INSN: B:48:0x00b1->B:38:0x00b1 BREAK  A[LOOP:0: B:10:0x0020->B:43:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:2: B:34:0x0092->B:49:?, LOOP_END, SYNTHETIC] */
    public final boolean isAllowedSetupToken(@NotNull Uri destiny) {
        List<String> domainsWhitelist;
        List<String> domainsBlacklist;
        List<String> list;
        Iterator<T> it;
        List<String> list2;
        Iterator<T> it2;
        Intrinsics.checkNotNullParameter(destiny, "destiny");
        List<String> endpointsWhitelist = getEndpointsWhitelist();
        if (endpointsWhitelist == null) {
            domainsWhitelist = getDomainsWhitelist();
            if (domainsWhitelist != null) {
                domainsBlacklist = getDomainsBlacklist();
                if (domainsBlacklist != null) {
                    list = domainsBlacklist;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                break;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                break;
                                break;
                            }
                        }
                    }
                }
                return true;
            }
            list2 = domainsWhitelist;
            if (!(list2 instanceof Collection)) {
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (new Regex((String) it2.next()).matches(String.valueOf(destiny.getHost()))) {
                        domainsBlacklist = getDomainsBlacklist();
                        if (domainsBlacklist != null) {
                            list = domainsBlacklist;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
                break;
                break;
            }
            it2 = list2.iterator();
            while (it2.hasNext()) {
                if (new Regex((String) it2.next()).matches(String.valueOf(destiny.getHost()))) {
                    domainsBlacklist = getDomainsBlacklist();
                    if (domainsBlacklist != null) {
                        list = domainsBlacklist;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                    break;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            break;
            break;
        }
        List<String> list3 = endpointsWhitelist;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (new Regex((String) it3.next()).matches(String.valueOf(destiny.getPath()))) {
                    domainsWhitelist = getDomainsWhitelist();
                    if (domainsWhitelist != null) {
                        domainsBlacklist = getDomainsBlacklist();
                        if (domainsBlacklist != null) {
                            list = domainsBlacklist;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    list2 = domainsWhitelist;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (new Regex((String) it2.next()).matches(String.valueOf(destiny.getHost()))) {
                                domainsBlacklist = getDomainsBlacklist();
                                if (domainsBlacklist != null) {
                                    list = domainsBlacklist;
                                    if ((list instanceof Collection) || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            if (new Regex((String) it.next()).matches(String.valueOf(destiny.getHost()))) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[EDGE_INSN: B:33:0x0077->B:26:0x0077 BREAK  A[LOOP:0: B:10:0x001f->B:31:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:1: B:22:0x0058->B:34:?, LOOP_END, SYNTHETIC] */
    public final boolean isAllowedUpdateToken(@NotNull Uri origin) {
        List<String> domainsBlacklist;
        List<String> list;
        Iterator<T> it;
        Intrinsics.checkNotNullParameter(origin, "origin");
        List<String> domainsWhitelist = getDomainsWhitelist();
        if (domainsWhitelist == null) {
            domainsBlacklist = getDomainsBlacklist();
            if (domainsBlacklist != null) {
                list = domainsBlacklist;
                if (list instanceof Collection) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (new Regex((String) it.next()).matches(String.valueOf(origin.getHost()))) {
                            break;
                            break;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (new Regex((String) it.next()).matches(String.valueOf(origin.getHost()))) {
                            break;
                            break;
                        }
                    }
                }
            }
            return true;
        }
        List<String> list2 = domainsWhitelist;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (new Regex((String) it2.next()).matches(String.valueOf(origin.getHost()))) {
                    domainsBlacklist = getDomainsBlacklist();
                    if (domainsBlacklist != null) {
                        list = domainsBlacklist;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (new Regex((String) it.next()).matches(String.valueOf(origin.getHost()))) {
                                    break;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
