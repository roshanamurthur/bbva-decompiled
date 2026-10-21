package com.veridas.util;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RingBuffer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018J\u0006\u0010\u0004\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/veridas/util/RingBuffer;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "endIndex", "get", "()Ljava/lang/Object;", AnalyticsConstants.Key.ITEM, "", PutCommand.ID, "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "init", "reset", "size", "startIndex", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "", "a", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "buffer", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RingBuffer.kt\ncom/veridas/util/RingBuffer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n13374#2,3:64\n*S KotlinDebug\n*F\n+ 1 RingBuffer.kt\ncom/veridas/util/RingBuffer\n*L\n25#1:64,3\n*E\n"})
public final class RingBuffer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final T[] buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67487c;

    /* JADX INFO: compiled from: RingBuffer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/veridas/util/RingBuffer$Companion;", "", "()V", "createIntRingBuffer", "Lcom/veridas/util/RingBuffer;", "", "capacity", "init", "Lkotlin/Function1;", "createLongRingBuffer", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RingBuffer<Integer> createIntRingBuffer(int capacity, @NotNull Function1<? super Integer, Integer> init) {
            Intrinsics.checkNotNullParameter(init, "init");
            Integer[] numArr = new Integer[capacity];
            for (int i10 = 0; i10 < capacity; i10++) {
                numArr[i10] = init.invoke(Integer.valueOf(i10));
            }
            return new RingBuffer<>(numArr, null);
        }

        @JvmStatic
        @NotNull
        public final RingBuffer<Long> createLongRingBuffer(int capacity, @NotNull Function1<? super Integer, Long> init) {
            Intrinsics.checkNotNullParameter(init, "init");
            Long[] lArr = new Long[capacity];
            for (int i10 = 0; i10 < capacity; i10++) {
                lArr[i10] = init.invoke(Integer.valueOf(i10));
            }
            return new RingBuffer<>(lArr, null);
        }
    }

    public RingBuffer() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RingBuffer(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.buffer = objArr;
    }

    @JvmStatic
    @NotNull
    public static final RingBuffer<Integer> createIntRingBuffer(int i10, @NotNull Function1<? super Integer, Integer> function1) {
        return INSTANCE.createIntRingBuffer(i10, function1);
    }

    @JvmStatic
    @NotNull
    public static final RingBuffer<Long> createLongRingBuffer(int i10, @NotNull Function1<? super Integer, Long> function1) {
        return INSTANCE.createLongRingBuffer(i10, function1);
    }

    /* JADX INFO: renamed from: endIndex, reason: from getter */
    public final int getF67487c() {
        return this.f67487c;
    }

    public final T get() {
        int i10 = this.f67486b;
        int i11 = i10 + 1;
        this.f67486b = i11;
        T t10 = this.buffer[i10];
        this.f67486b = i11 % size();
        return t10;
    }

    @NotNull
    public final T[] getBuffer() {
        return this.buffer;
    }

    public final void put(T item) {
        int i10 = this.f67487c;
        int i11 = i10 + 1;
        this.f67487c = i11;
        this.buffer[i10] = item;
        this.f67487c = i11 % size();
    }

    public final void reset(@NotNull Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        T[] tArr = this.buffer;
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            tArr[i11] = init.invoke(Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f67486b = 0;
        this.f67487c = 0;
    }

    public final int size() {
        return this.buffer.length;
    }

    /* JADX INFO: renamed from: startIndex, reason: from getter */
    public final int getF67486b() {
        return this.f67486b;
    }

    public final T get(int index) {
        int size = index % size();
        if (size < 0) {
            size += size();
        }
        return this.buffer[size];
    }
}
