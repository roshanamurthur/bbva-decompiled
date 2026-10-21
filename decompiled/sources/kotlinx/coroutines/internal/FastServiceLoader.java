package kotlinx.coroutines.internal;

import ak.b;
import androidx.camera.core.processing.f;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import bk.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J3\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", ExifInterface.LATITUDE_SOUTH, "Ljava/lang/Class;", NotificationCompat.CATEGORY_SERVICE, "Ljava/lang/ClassLoader;", "loader", "", "load", "", "name", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "parse", "Ljava/io/BufferedReader;", "r", "parseFile", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "()Ljava/util/List;", "loadMainDispatcherFactory", "loadProviders$kotlinx_coroutines_core", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "loadProviders", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
public final class FastServiceLoader {

    @NotNull
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();

    private FastServiceLoader() {
    }

    private final <S> S getProviderInstance(String name, ClassLoader loader, Class<S> service) throws ClassNotFoundException {
        Class<?> cls = Class.forName(name, false, loader);
        if (service.isAssignableFrom(cls)) {
            return service.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + service + ", but found " + cls).toString());
    }

    private final <S> List<S> load(Class<S> service, ClassLoader loader) {
        try {
            return loadProviders$kotlinx_coroutines_core(service, loader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.toList(ServiceLoader.load(service, loader));
        }
    }

    private final List<String> parse(URL url) throws IOException {
        String string = url.toString();
        if (!l.startsWith$default(string, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = INSTANCE.parseFile(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return file;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        }
        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter$default(string, "jar:file:", (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
        String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(string, "!/", (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(strSubstringBefore$default, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strSubstringAfter$default)), "UTF-8"));
            try {
                List<String> file2 = INSTANCE.parseFile(bufferedReader2);
                CloseableKt.closeFinally(bufferedReader2, null);
                jarFile.close();
                return file2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(bufferedReader2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    jarFile.close();
                    throw th7;
                } catch (Throwable th8) {
                    b.addSuppressed(th6, th8);
                    throw th6;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader r3) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = r3.readLine();
            if (line == null) {
                return CollectionsKt___CollectionsKt.toList(linkedHashSet);
            }
            String string = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(line, "#", (String) null, 2, (Object) null)).toString();
            for (int i10 = 0; i10 < string.length(); i10++) {
                char cCharAt = string.charAt(i10);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(f.d("Illegal service provider class name: ", string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    @NotNull
    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    @NotNull
    public final <S> List<S> loadProviders$kotlinx_coroutines_core(@NotNull Class<S> service, @NotNull ClassLoader loader) {
        ArrayList list = Collections.list(loader.getResources("META-INF/services/".concat(service.getName())));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g.addAll(arrayList, INSTANCE.parse((URL) it.next()));
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (!(!set.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), loader, service));
        }
        return arrayList2;
    }
}
