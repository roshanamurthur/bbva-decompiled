package kotlin.collections;

import androidx.camera.camera2.internal.n1;
import bk.b;
import bk.c;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n13896#2,14:3043\n13919#2,14:3057\n13942#2,14:3071\n13965#2,14:3085\n13988#2,14:3099\n14011#2,14:3113\n14034#2,14:3127\n14057#2,14:3141\n14080#2,14:3155\n16482#2,14:3169\n16505#2,14:3183\n16528#2,14:3197\n16551#2,14:3211\n16574#2,14:3225\n16597#2,14:3239\n16620#2,14:3253\n16643#2,14:3267\n16666#2,14:3281\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2434#1:3043,14\n2441#1:3057,14\n2448#1:3071,14\n2455#1:3085,14\n2462#1:3099,14\n2469#1:3113,14\n2476#1:3127,14\n2483#1:3141,14\n2490#1:3155,14\n2632#1:3169,14\n2639#1:3183,14\n2646#1:3197,14\n2653#1:3211,14\n2660#1:3225,14\n2667#1:3239,14\n2674#1:3253,14\n2681#1:3267,14\n2688#1:3281,14\n*E\n"})
public class ArraysKt___ArraysJvmKt extends c {

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$1, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Byte;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractList<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f79437p0;

        public AnonymousClass1(byte[] bArr) {
            this.f79437p0 = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79437p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79437p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte element) {
            return ArraysKt___ArraysKt.contains(this.f79437p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Byte get(int index) {
            return Byte.valueOf(this.f79437p0[index]);
        }

        public int indexOf(byte element) {
            return ArraysKt___ArraysKt.indexOf(this.f79437p0, element);
        }

        public int lastIndexOf(byte element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79437p0, element);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$2, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Short;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends AbstractList<Short> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ short[] f79438p0;

        public AnonymousClass2(short[] sArr) {
            this.f79438p0 = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79438p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79438p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short element) {
            return ArraysKt___ArraysKt.contains(this.f79438p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Short get(int index) {
            return Short.valueOf(this.f79438p0[index]);
        }

        public int indexOf(short element) {
            return ArraysKt___ArraysKt.indexOf(this.f79438p0, element);
        }

        public int lastIndexOf(short element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79438p0, element);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$3, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Integer;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends AbstractList<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int[] f79439p0;

        public AnonymousClass3(int[] iArr) {
            this.f79439p0 = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79439p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79439p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int element) {
            return ArraysKt___ArraysKt.contains(this.f79439p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Integer get(int index) {
            return Integer.valueOf(this.f79439p0[index]);
        }

        public int indexOf(int element) {
            return ArraysKt___ArraysKt.indexOf(this.f79439p0, element);
        }

        public int lastIndexOf(int element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79439p0, element);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$4, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Long;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends AbstractList<Long> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long[] f79440p0;

        public AnonymousClass4(long[] jArr) {
            this.f79440p0 = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79440p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79440p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long element) {
            return ArraysKt___ArraysKt.contains(this.f79440p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Long get(int index) {
            return Long.valueOf(this.f79440p0[index]);
        }

        public int indexOf(long element) {
            return ArraysKt___ArraysKt.indexOf(this.f79440p0, element);
        }

        public int lastIndexOf(long element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79440p0, element);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$5, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$5", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Float;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12524#2,2:3043\n1687#2,6:3045\n1795#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3043,2\n201#1:3045,6\n202#1:3051,6\n*E\n"})
    public static final class AnonymousClass5 extends AbstractList<Float> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float[] f79441p0;

        public AnonymousClass5(float[] fArr) {
            this.f79441p0 = fArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79441p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79441p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float element) {
            for (float f6 : this.f79441p0) {
                if (Float.floatToIntBits(f6) == Float.floatToIntBits(element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Float get(int index) {
            return Float.valueOf(this.f79441p0[index]);
        }

        public int indexOf(float element) {
            float[] fArr = this.f79441p0;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(element)) {
                    return i10;
                }
            }
            return -1;
        }

        public int lastIndexOf(float element) {
            float[] fArr = this.f79441p0;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(element)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$6, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$6", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Double;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"})
    public static final class AnonymousClass6 extends AbstractList<Double> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ double[] f79442p0;

        public AnonymousClass6(double[] dArr) {
            this.f79442p0 = dArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79442p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79442p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double element) {
            for (double d2 : this.f79442p0) {
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Double get(int index) {
            return Double.valueOf(this.f79442p0[index]);
        }

        public int indexOf(double element) {
            double[] dArr = this.f79442p0;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(element)) {
                    return i10;
                }
            }
            return -1;
        }

        public int lastIndexOf(double element) {
            double[] dArr = this.f79442p0;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(element)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$7, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$7", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Boolean;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass7 extends AbstractList<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean[] f79443p0;

        public AnonymousClass7(boolean[] zArr) {
            this.f79443p0 = zArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79443p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79443p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean element) {
            return ArraysKt___ArraysKt.contains(this.f79443p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Boolean get(int index) {
            return Boolean.valueOf(this.f79443p0[index]);
        }

        public int indexOf(boolean element) {
            return ArraysKt___ArraysKt.indexOf(this.f79443p0, element);
        }

        public int lastIndexOf(boolean element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79443p0, element);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$8, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$8", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Character;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass8 extends AbstractList<Character> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ char[] f79444p0;

        public AnonymousClass8(char[] cArr) {
            this.f79444p0 = cArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79444p0.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f79444p0.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char element) {
            return ArraysKt___ArraysKt.contains(this.f79444p0, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Character get(int index) {
            return Character.valueOf(this.f79444p0[index]);
        }

        public int indexOf(char element) {
            return ArraysKt___ArraysKt.indexOf(this.f79444p0, element);
        }

        public int lastIndexOf(char element) {
            return ArraysKt___ArraysKt.lastIndexOf(this.f79444p0, element);
        }
    }

    @NotNull
    public static <T> List<T> asList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listAsList = Arrays.asList(tArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t10, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return copyInto(objArr, objArr2, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static <T> T[] copyOfRange(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static <T> void fill(@NotNull T[] tArr, T t10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        fill(objArr, obj, i10, i11);
    }

    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Object[] objArr, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] objArr, @NotNull C destination, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                T t11 = tArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t10;
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(objArr, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                T t11 = tArr[intIteratorG.nextInt()];
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t10;
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(objArr, comparator);
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static final void sort(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        sort(comparableArr, i10, i11);
    }

    public static final <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        sortWith(objArr, comparator, i10, i11);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    @NotNull
    public static final Byte[] toTypedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return copyInto(bArr, bArr2, i10, i11, i12);
    }

    public static void fill(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        fill(bArr, b10, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        sort(bArr, i10, i11);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    @NotNull
    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    @NotNull
    public static final List<Byte> asList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new AnonymousClass1(bArr);
    }

    public static final int binarySearch(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return binarySearch(bArr, b10, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] copyInto(@NotNull short[] sArr, @NotNull short[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return copyInto(sArr, sArr2, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static byte[] copyOfRange(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static void fill(@NotNull short[] sArr, short s4, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s4);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s4, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        fill(sArr, s4, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(comparableArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(comparableArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        sort(sArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Short> toSortedSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    @NotNull
    public static final List<Short> asList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new AnonymousClass2(sArr);
    }

    public static final int binarySearch(@NotNull short[] sArr, short s4, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s4);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s4, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return binarySearch(sArr, s4, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static int[] copyInto(@NotNull int[] iArr, @NotNull int[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return copyInto(iArr, iArr2, i10, i11, i12);
    }

    public static void fill(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        fill(iArr, i10, i11, i12);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte max(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(bArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte min(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(bArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        sort(iArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Integer> toSortedSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @NotNull
    public static List<Integer> asList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new AnonymousClass3(iArr);
    }

    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return binarySearch(iArr, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static long[] copyInto(@NotNull long[] jArr, @NotNull long[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return copyInto(jArr, jArr2, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static short[] copyOfRange(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    public static void fill(@NotNull long[] jArr, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        fill(jArr, j10, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short max(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(sArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short min(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(sArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b10;
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void sort(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        sort(jArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Long> toSortedSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    @NotNull
    public static List<Long> asList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new AnonymousClass4(jArr);
    }

    public static final int binarySearch(@NotNull long[] jArr, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return binarySearch(jArr, j10, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static float[] copyInto(@NotNull float[] fArr, @NotNull float[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return copyInto(fArr, fArr2, i10, i11, i12);
    }

    public static final void fill(@NotNull float[] fArr, float f6, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f6);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f6, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        fill(fArr, f6, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer max(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(iArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer min(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(iArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        sort(fArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Float> toSortedSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    @NotNull
    public static final List<Float> asList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new AnonymousClass5(fArr);
    }

    public static final int binarySearch(@NotNull float[] fArr, float f6, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f6);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f6, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return binarySearch(fArr, f6, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final double[] copyInto(@NotNull double[] dArr, @NotNull double[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return copyInto(dArr, dArr2, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static int[] copyOfRange(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    public static final void fill(@NotNull double[] dArr, double d2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d2);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        fill(dArr, d2, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long max(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(jArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long min(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(jArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        sort(dArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Double> toSortedSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    @NotNull
    public static final Integer[] toTypedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @NotNull
    public static List<Double> asList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new AnonymousClass6(dArr);
    }

    public static final int binarySearch(@NotNull double[] dArr, double d2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d2);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return binarySearch(dArr, d2, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final boolean[] copyInto(@NotNull boolean[] zArr, @NotNull boolean[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return copyInto(zArr, zArr2, i10, i11, i12);
    }

    public static final void fill(@NotNull boolean[] zArr, boolean z10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        fill(zArr, z10, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    public static <T> void sort(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        sort(cArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    @NotNull
    public static final List<Boolean> asList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new AnonymousClass7(zArr);
    }

    public static final int binarySearch(@NotNull char[] cArr, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return binarySearch(cArr, c10, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static char[] copyInto(@NotNull char[] cArr, @NotNull char[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return copyInto(cArr, cArr2, i10, i11, i12);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static long[] copyOfRange(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    public static final void fill(@NotNull char[] cArr, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        fill(cArr, c10, i10, i11);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s4;
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        sort(objArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    @NotNull
    public static final List<Character> asList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new AnonymousClass8(cArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(cArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(cArr);
    }

    public static final void sort(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    @NotNull
    public static final Long[] toTypedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final float[] copyOfRange(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static final void sort(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    public static void sort(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final double[] copyOfRange(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            byte b11 = bArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            byte b11 = bArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static void sort(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @NotNull
    public static final Float[] toTypedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static void sort(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final boolean[] copyOfRange(@NotNull boolean[] zArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    public static final void sort(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    public static final void sort(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @NotNull
    public static final Double[] toTypedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final char[] copyOfRange(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        b.copyOfRangeToIndexCheck(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j10;
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final <T> void sort(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @NotNull
    public static final Boolean[] toTypedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, float f6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f6;
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, double d2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d2;
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R rInvoke = selector.invoke(Short.valueOf(s4));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            short s7 = sArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s7));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s4 = s7;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R rInvoke = selector.invoke(Short.valueOf(s4));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            short s7 = sArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s7));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s4 = s7;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z10;
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c10;
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            int i11 = iArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            int i11 = iArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] bArr, @NotNull Collection<Byte> elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull Collection<Short> elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, @NotNull Collection<Integer> elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, @NotNull Collection<Long> elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            long j11 = jArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                j10 = j11;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j10);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            long j11 = jArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                j10 = j11;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j10);
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull Collection<Float> elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull Collection<Double> elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull Collection<Boolean> elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f6);
        }
        R rInvoke = selector.invoke(Float.valueOf(f6));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            float f10 = fArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f10));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f6 = f10;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f6);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f6 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f6);
        }
        R rInvoke = selector.invoke(Float.valueOf(f6));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            float f10 = fArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f10));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f6 = f10;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f6);
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull Collection<Character> elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            double d3 = dArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                d2 = d3;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d2);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            double d3 = dArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                d2 = d3;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull short[] elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, @NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            boolean z11 = zArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            boolean z11 = zArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char c11 = cArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char c11 = cArr[intIteratorG.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull char[] elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }
}
