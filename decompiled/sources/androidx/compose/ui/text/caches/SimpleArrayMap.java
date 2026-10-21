package androidx.compose.ui.text.caches;

import androidx.appcompat.app.i;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010<\u001a\u00020\u0005¢\u0006\u0004\b=\u00107B\u001f\b\u0016\u0012\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b=\u0010?J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010!\u001a\u00020\rJ\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001e\u0010$\u001a\u00020\t2\u0016\u0010#\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000J\u001f\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010&\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\u001dJ\u001f\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b)\u0010\u001aJ%\u0010)\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\b)\u0010,J\u0013\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u000200H\u0016R\"\u00108\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0017\u00109\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00105¨\u0006@"}, d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "", HashCommand.ID, "indexOf", "indexOfNull", "", ClearCommand.ID, "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "value", "indexOfValue$ui_text_release", "(Ljava/lang/Object;)I", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", PutCommand.ID, "array", "putAll", "putIfAbsent", RemoveCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "get_size", "()I", "set_size", "(I)V", "_size", "size", "size$annotations", "()V", "capacity", "<init>", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class SimpleArrayMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f17877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f17878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @JvmOverloads
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public final void clear() {
        if (this._size > 0) {
            this.f17877a = ContainerHelpersKt.EMPTY_INTS;
            this.f17878b = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public final boolean containsValue(V value) {
        return indexOfValue$ui_text_release(value) >= 0;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i10 = this._size;
        int[] iArr = this.f17877a;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f17877a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f17878b, minimumCapacity << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f17878b = objArrCopyOf;
        }
        if (this._size != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i10 = this._size;
                if (i10 != simpleArrayMap._size) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K kKeyAt = keyAt(i11);
                    V vValueAt = valueAt(i11);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(vValueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i12 = this._size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kKeyAt2 = keyAt(i13);
                V vValueAt2 = valueAt(i13);
                Object obj2 = ((Map) other).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vValueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Nullable
    public final V get(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return (V) this.f17878b[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K key, V defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (V) this.f17878b[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.f17877a;
        Object[] objArr = this.f17878b;
        int i10 = this._size;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final int indexOf(@NotNull Object key, int hash) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.f17877a, i10, hash);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(key, this.f17878b[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i11 = iBinarySearchInternal + 1;
        while (i11 < i10 && this.f17877a[i11] == hash) {
            if (Intrinsics.areEqual(key, this.f17878b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iBinarySearchInternal - 1; i12 >= 0 && this.f17877a[i12] == hash; i12--) {
            if (Intrinsics.areEqual(key, this.f17878b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int indexOfKey(@Nullable Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    public final int indexOfNull() {
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.f17877a, i10, 0);
        if (iBinarySearchInternal < 0 || this.f17878b[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i11 = iBinarySearchInternal + 1;
        while (i11 < i10 && this.f17877a[i11] == 0) {
            if (this.f17878b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iBinarySearchInternal - 1; i12 >= 0 && this.f17877a[i12] == 0; i12--) {
            if (this.f17878b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int indexOfValue$ui_text_release(V value) {
        int i10 = this._size << 1;
        Object[] objArr = this.f17878b;
        if (value == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.areEqual(value, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    public final K keyAt(int index) {
        return (K) this.f17878b[index << 1];
    }

    @Nullable
    public final V put(K key, V value) {
        int iHashCode;
        int iIndexOf;
        int i10 = this._size;
        if (key == null) {
            iIndexOf = indexOfNull();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iIndexOf = indexOf(key, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i11 = (iIndexOf << 1) + 1;
            Object[] objArr = this.f17878b;
            V v3 = (V) objArr[i11];
            objArr[i11] = value;
            return v3;
        }
        int i12 = ~iIndexOf;
        int[] iArr = this.f17877a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f17877a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f17878b, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f17878b = objArrCopyOf;
            if (i10 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f17877a;
            int i14 = i12 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f17878b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i14 << 1, i12 << 1, this._size << 1);
        }
        int i15 = this._size;
        if (i10 == i15) {
            int[] iArr3 = this.f17877a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f17878b;
                int i16 = i12 << 1;
                objArr3[i16] = key;
                objArr3[i16 + 1] = value;
                this._size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(@NotNull SimpleArrayMap<? extends K, ? extends V> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = array._size;
        ensureCapacity(this._size + i10);
        if (this._size != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(array.keyAt(i11), array.valueAt(i11));
            }
        } else if (i10 > 0) {
            ArraysKt___ArraysJvmKt.copyInto(array.f17877a, this.f17877a, 0, 0, i10);
            ArraysKt___ArraysJvmKt.copyInto(array.f17878b, this.f17878b, 0, 0, i10 << 1);
            this._size = i10;
        }
    }

    @Nullable
    public final V putIfAbsent(K key, V value) {
        V v3 = get(key);
        return v3 == null ? put(key, value) : v3;
    }

    @Nullable
    public final V remove(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    @Nullable
    public final V removeAt(int index) {
        Object[] objArr = this.f17878b;
        int i10 = index << 1;
        V v3 = (V) objArr[i10 + 1];
        int i11 = this._size;
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f17877a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (index < i12) {
                    int i13 = index + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, index, i13, i11);
                    Object[] objArr2 = this.f17878b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i10, i13 << 1, i11 << 1);
                }
                Object[] objArr3 = this.f17878b;
                int i14 = i12 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                int i15 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArr2 = new int[i15];
                this.f17877a = iArr2;
                this.f17878b = new Object[i15 << 1];
                if (index > 0) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, index);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.f17878b, 0, 0, i10);
                }
                if (index < i12) {
                    int i16 = index + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, this.f17877a, index, i16, i11);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.f17878b, i10, i16 << 1, i11 << 1);
                }
            }
            if (i11 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i12;
        }
        return v3;
    }

    @Nullable
    public final V replace(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, value);
        }
        return null;
    }

    public final V setValueAt(int index, V value) {
        int i10 = (index << 1) + 1;
        Object[] objArr = this.f17878b;
        V v3 = (V) objArr[i10];
        objArr[i10] = value;
        return v3;
    }

    public final void set_size(int i10) {
        this._size = i10;
    }

    @JvmName(name = "size")
    public final int size() {
        return this._size;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this._size * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kKeyAt = keyAt(i11);
            if (kKeyAt != this) {
                sb2.append(kKeyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vValueAt = valueAt(i11);
            if (vValueAt != this) {
                sb2.append(vValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return i.b(sb2, AbstractJsonLexerKt.END_OBJ, "buffer.toString()");
    }

    public final V valueAt(int index) {
        return (V) this.f17878b[(index << 1) + 1];
    }

    @JvmOverloads
    public SimpleArrayMap(int i10) {
        if (i10 == 0) {
            this.f17877a = ContainerHelpersKt.EMPTY_INTS;
            this.f17878b = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.f17877a = new int[i10];
            this.f17878b = new Object[i10 << 1];
        }
        this._size = 0;
    }

    public final boolean remove(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final boolean replace(K key, V oldValue, V newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != oldValue) {
            return false;
        }
        setValueAt(iIndexOfKey, newValue);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(@Nullable SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public static /* synthetic */ void size$annotations() {
    }
}
