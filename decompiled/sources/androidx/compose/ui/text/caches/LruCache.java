package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.image.transform.ScaleToMaxSideTransformer;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\nJ1\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\nJ\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J'\u0010(\u001a\u00028\u0002\"\u0004\b\u0002\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00020$H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010'R$\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", ScaleToMaxSideTransformer.SIDE, "", "resize", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", RemoveCommand.ID, "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "", "toString", "R", "Lkotlin/Function0;", "block", "synchronizedValue$ui_text_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "synchronizedValue", "<set-?>", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "size", "()I", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n348#1:352\n348#1:361\n348#1:363\n348#1:365\n348#1:367\n348#1:369\n348#1:371\n24#2:353\n24#2:355\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:362\n24#2:364\n24#2:366\n24#2:368\n24#2:370\n24#2:372\n24#2:373\n24#2:374\n24#2:375\n1#3:354\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:352\n295#1:361\n301#1:363\n307#1:365\n312#1:367\n317#1:369\n322#1:371\n40#1:353\n71#1:355\n86#1:356\n104#1:357\n142#1:358\n176#1:359\n218#1:360\n295#1:362\n301#1:364\n307#1:366\n312#1:368\n317#1:370\n322#1:372\n329#1:373\n339#1:374\n348#1:375\n*E\n"})
public class LruCache<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SynchronizedObject f17867a = Synchronization_jvmKt.createSynchronizedObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<K, V> f17868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<K> f17869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17876j;

    public LruCache(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f17871e = i10;
        this.f17868b = new HashMap<>(0, 0.75f);
        this.f17869c = new LinkedHashSet<>();
    }

    public final int a(K k10, V v3) {
        int iSizeOf = sizeOf(k10, v3);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v3).toString());
    }

    @Nullable
    public V create(K key) {
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17873g;
        }
        return i10;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17874h;
        }
        return i10;
    }

    @Nullable
    public final V get(K key) {
        synchronized (this.f17867a) {
            V v3 = this.f17868b.get(key);
            if (v3 != null) {
                this.f17869c.remove(key);
                this.f17869c.add(key);
                this.f17875i++;
                return v3;
            }
            this.f17876j++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.f17867a) {
                try {
                    this.f17873g++;
                    V vPut = this.f17868b.put(key, vCreate);
                    this.f17869c.remove(key);
                    this.f17869c.add(key);
                    if (vPut != null) {
                        this.f17868b.put(key, vPut);
                        v3 = vPut;
                    } else {
                        this.size = size() + a(key, vCreate);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v3 != null) {
                entryRemoved(false, key, vCreate, v3);
                return v3;
            }
            trimToSize(this.f17871e);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17875i;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17871e;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17876j;
        }
        return i10;
    }

    @Nullable
    public final V put(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.f17867a) {
            try {
                this.f17872f++;
                this.size = size() + a(key, value);
                vPut = this.f17868b.put(key, value);
                if (vPut != null) {
                    this.size = size() - a(key, vPut);
                }
                if (this.f17869c.contains(key)) {
                    this.f17869c.remove(key);
                }
                this.f17869c.add(key);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.f17871e);
        return vPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.f17872f;
        }
        return i10;
    }

    @Nullable
    public final V remove(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.f17867a) {
            try {
                vRemove = this.f17868b.remove(key);
                this.f17869c.remove(key);
                if (vRemove != null) {
                    this.size = size() - a(key, vRemove);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.f17867a) {
            this.f17871e = maxSize;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    @JvmName(name = "size")
    public final int size() {
        int i10;
        synchronized (this.f17867a) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(K key, V value) {
        return 1;
    }

    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f17867a) {
            linkedHashMap = new LinkedHashMap();
            for (K k10 : this.f17869c) {
                V v3 = this.f17868b.get(k10);
                Intrinsics.checkNotNull(v3);
                linkedHashMap.put(k10, v3);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(@NotNull Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f17867a) {
            try {
                rInvoke = block.invoke();
                InlineMarker.finallyStart(1);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
            }
        }
        return rInvoke;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.f17867a) {
            try {
                int i10 = this.f17875i;
                int i11 = this.f17876j + i10;
                str = "LruCache[maxSize=" + this.f17871e + ",hits=" + this.f17875i + ",misses=" + this.f17876j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int maxSize) {
        Object objFirst;
        V v3;
        while (true) {
            synchronized (this.f17867a) {
                try {
                    if (size() >= 0 && (!this.f17868b.isEmpty() || size() == 0)) {
                        if (this.f17868b.isEmpty() != this.f17869c.isEmpty()) {
                            break;
                        }
                        if (size() <= maxSize || this.f17868b.isEmpty()) {
                            objFirst = null;
                            v3 = null;
                        } else {
                            objFirst = CollectionsKt___CollectionsKt.first(this.f17869c);
                            v3 = this.f17868b.get(objFirst);
                            if (v3 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            TypeIntrinsics.asMutableMap(this.f17868b).remove(objFirst);
                            TypeIntrinsics.asMutableCollection(this.f17869c).remove(objFirst);
                            int size = size();
                            Intrinsics.checkNotNull(objFirst);
                            Intrinsics.checkNotNull(v3);
                            this.size = size - a(objFirst, v3);
                            this.f17874h++;
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objFirst == null && v3 == null) {
                return;
            }
            Intrinsics.checkNotNull(objFirst);
            Intrinsics.checkNotNull(v3);
            entryRemoved(true, objFirst, v3, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, @Nullable V newValue) {
    }
}
