package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import bk.p;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0017\u0018B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "vectorize", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "a", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,657:1\n442#2:658\n392#2:659\n1238#3,4:660\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:658\n496#1:659\n496#1:660,4\n*E\n"})
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KeyframesSpecConfig<T> config;

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010&J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0086\u0004J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "timeStamp", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDurationMillis", "()I", "setDurationMillis", "(I)V", "durationMillis", "b", "getDelayMillis", "setDelayMillis", "delayMillis", "", "c", "Ljava/util/Map;", "getKeyframes$animation_core_release", "()Ljava/util/Map;", "keyframes", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    public static final class KeyframesSpecConfig<T> {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int delayMillis;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int durationMillis = 300;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f3014c = new LinkedHashMap();

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KeyframeEntity<T> at(T t10, int i10) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t10, null, 2, 0 == true ? 1 : 0);
            this.f3014c.put(Integer.valueOf(i10), keyframeEntity);
            return keyframeEntity;
        }

        @NotNull
        public final KeyframeEntity<T> atFraction(T t10, float f6) {
            return at(t10, c.roundToInt(this.durationMillis * f6));
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) other;
                if (this.delayMillis == keyframesSpecConfig.delayMillis && this.durationMillis == keyframesSpecConfig.durationMillis && Intrinsics.areEqual(this.f3014c, keyframesSpecConfig.f3014c)) {
                    return true;
                }
            }
            return false;
        }

        public final int getDelayMillis() {
            return this.delayMillis;
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final Map<Integer, KeyframeEntity<T>> getKeyframes$animation_core_release() {
            return this.f3014c;
        }

        public int hashCode() {
            return this.f3014c.hashCode() + (((this.durationMillis * 31) + this.delayMillis) * 31);
        }

        public final void setDelayMillis(int i10) {
            this.delayMillis = i10;
        }

        public final void setDurationMillis(int i10) {
            this.durationMillis = i10;
        }

        public final void with(@NotNull KeyframeEntity<T> keyframeEntity, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(keyframeEntity, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    public KeyframesSpec(@NotNull KeyframesSpecConfig<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KeyframesSpec) {
            if (Intrinsics.areEqual(this.config, ((KeyframesSpec) other).config)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0015\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0015\u001a\u00028\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "toPair$animation_core_release", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "toPair", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "value", "b", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    public static final class KeyframeEntity<T> {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final T value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Easing easing;

        public KeyframeEntity(T t10, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.value = t10;
            this.easing = easing;
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) other;
                if (Intrinsics.areEqual(keyframeEntity.value, this.value) && Intrinsics.areEqual(keyframeEntity.easing, this.easing)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: getEasing$animation_core_release, reason: from getter */
        public final Easing getEasing() {
            return this.easing;
        }

        public final T getValue$animation_core_release() {
            return this.value;
        }

        public int hashCode() {
            T t10 = this.value;
            return this.easing.hashCode() + ((t10 != null ? t10.hashCode() : 0) * 31);
        }

        public final void setEasing$animation_core_release(@NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "<set-?>");
            this.easing = easing;
        }

        @NotNull
        public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(@NotNull Function1<? super T, ? extends V> convertToVector) {
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            return TuplesKt.to(convertToVector.invoke(this.value), this.easing);
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        KeyframesSpecConfig<T> keyframesSpecConfig = this.config;
        Map<Integer, KeyframeEntity<T>> keyframes$animation_core_release = keyframesSpecConfig.getKeyframes$animation_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(keyframes$animation_core_release.size()));
        Iterator<T> it = keyframes$animation_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, keyframesSpecConfig.getDurationMillis(), keyframesSpecConfig.getDelayMillis());
    }
}
