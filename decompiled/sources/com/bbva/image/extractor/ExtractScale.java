package com.bbva.image.extractor;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExtractScale.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/image/extractor/ExtractScale;", "", "()V", "Default", "Side", "Weight", "Lcom/bbva/image/extractor/ExtractScale$Weight;", "Lcom/bbva/image/extractor/ExtractScale$Side;", "Lcom/bbva/image/extractor/ExtractScale$Default;", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public abstract class ExtractScale {

    /* JADX INFO: compiled from: ExtractScale.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/image/extractor/ExtractScale$Default;", "Lcom/bbva/image/extractor/ExtractScale;", "()V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
    public static final class Default extends ExtractScale {

        @NotNull
        public static final Default INSTANCE = new Default();

        public Default() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ExtractScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/image/extractor/ExtractScale$Side;", "Lcom/bbva/image/extractor/ExtractScale;", "", "a", "F", "getMaxSide", "()F", "maxSide", "<init>", "(F)V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
    public static final class Side extends ExtractScale {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float maxSide;

        public Side(float f6) {
            super(null);
            this.maxSide = f6;
        }

        public final float getMaxSide() {
            return this.maxSide;
        }
    }

    /* JADX INFO: compiled from: ExtractScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/image/extractor/ExtractScale$Weight;", "Lcom/bbva/image/extractor/ExtractScale;", "", "a", "F", "getWeightInMegabytes", "()F", "weightInMegabytes", "<init>", "(F)V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
    public static final class Weight extends ExtractScale {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float weightInMegabytes;

        public Weight() {
            this(0.0f, 1, null);
        }

        public final float getWeightInMegabytes() {
            return this.weightInMegabytes;
        }

        public Weight(float f6) {
            super(null);
            this.weightInMegabytes = f6;
        }

        public /* synthetic */ Weight(float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1.0f : f6);
        }
    }

    public ExtractScale() {
    }

    public /* synthetic */ ExtractScale(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
