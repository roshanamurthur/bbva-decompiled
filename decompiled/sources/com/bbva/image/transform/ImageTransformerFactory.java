package com.bbva.image.transform;

import bk.q;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageTransformerFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/image/transform/ImageTransformerFactory;", "", "", "transformation", "", "params", "Lcom/bbva/image/transform/ImageTransformer;", "create", "<init>", "()V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class ImageTransformerFactory {

    @NotNull
    public static final ImageTransformerFactory INSTANCE = new ImageTransformerFactory();

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class a extends Lambda implements Function0<CenterCropImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map f34891p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(0);
            this.f34891p0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CenterCropImageTransformer invoke() {
            return new CenterCropImageTransformer((Map<String, ? extends Object>) this.f34891p0);
        }
    }

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class b extends Lambda implements Function0<ImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map f34892p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map) {
            super(0);
            this.f34892p0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageTransformer invoke() {
            return new ScaleToFitSizeTransformer((Map<String, ? extends Object>) this.f34892p0);
        }
    }

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class c extends Lambda implements Function0<ImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map f34893p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map map) {
            super(0);
            this.f34893p0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageTransformer invoke() {
            return new ScaleToMaxWeightTransformer((Map<String, ? extends Object>) this.f34893p0);
        }
    }

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class d extends Lambda implements Function0<ImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map f34894p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map map) {
            super(0);
            this.f34894p0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageTransformer invoke() {
            return new ScaleToMaxSideTransformer((Map<String, ? extends Object>) this.f34894p0);
        }
    }

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class e extends Lambda implements Function0<ImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f34895p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final ImageTransformer invoke() {
            return new GrayscaleImageTransformer();
        }
    }

    /* JADX INFO: compiled from: ImageTransformerFactory.kt */
    public static final class f extends Lambda implements Function0<ImageTransformer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map f34896p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Map map) {
            super(0);
            this.f34896p0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageTransformer invoke() {
            return new MonochromeImageTransformer(this.f34896p0);
        }
    }

    public static String a(String str) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Nullable
    public final ImageTransformer create(@NotNull String transformation, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        Intrinsics.checkNotNullParameter(params, "params");
        Function0 function0 = (Function0) q.mapOf(TuplesKt.to(a(CenterCropImageTransformer.ID), new a(params)), TuplesKt.to(a(ScaleToFitSizeTransformer.ID), new b(params)), TuplesKt.to(a(ScaleToMaxWeightTransformer.ID), new c(params)), TuplesKt.to(a(ScaleToMaxSideTransformer.ID), new d(params)), TuplesKt.to(a(GrayscaleImageTransformer.ID), e.f34895p0), TuplesKt.to(a(MonochromeImageTransformer.ID), new f(params))).get(a(transformation));
        if (function0 != null) {
            return (ImageTransformer) function0.invoke();
        }
        return null;
    }
}
