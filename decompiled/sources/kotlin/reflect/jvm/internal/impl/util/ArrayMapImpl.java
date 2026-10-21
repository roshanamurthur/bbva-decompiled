package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11245#2,11:146\n13374#2,2:157\n13376#2:160\n11256#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Object[] f82061p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f82062q0;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ArrayMapImpl() {
        super(null);
        this.f82061p0 = new Object[20];
        this.f82062q0 = 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i10) {
        return (T) ArraysKt___ArraysKt.getOrNull(this.f82061p0, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f82062q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f82063r0 = -1;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ ArrayMapImpl<T> f82064s0;

            {
                this.f82064s0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                ArrayMapImpl<T> arrayMapImpl;
                do {
                    int i10 = this.f82063r0 + 1;
                    this.f82063r0 = i10;
                    arrayMapImpl = this.f82064s0;
                    if (i10 >= arrayMapImpl.f82061p0.length) {
                        break;
                    }
                } while (arrayMapImpl.f82061p0[this.f82063r0] == null);
                if (this.f82063r0 >= arrayMapImpl.f82061p0.length) {
                    done();
                    return;
                }
                Object obj = arrayMapImpl.f82061p0[this.f82063r0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f82061p0;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] objArrCopyOf = Arrays.copyOf(this.f82061p0, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f82061p0 = objArrCopyOf;
        }
        if (this.f82061p0[i10] == null) {
            this.f82062q0 = getSize() + 1;
        }
        this.f82061p0[i10] = value;
    }
}
