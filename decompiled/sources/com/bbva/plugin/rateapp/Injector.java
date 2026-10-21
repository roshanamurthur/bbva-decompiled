package com.bbva.plugin.rateapp;

import android.content.Context;
import com.bbva.rateapp.InAppReview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/rateapp/Injector;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/bbva/rateapp/InAppReview;", "Lkotlin/ParameterName;", "name", "inAppClient", "", "block", "withReviewFactory", "Lcom/bbva/plugin/rateapp/InAppReviewFactory;", "a", "Lcom/bbva/plugin/rateapp/InAppReviewFactory;", "getFactory", "()Lcom/bbva/plugin/rateapp/InAppReviewFactory;", "setFactory", "(Lcom/bbva/plugin/rateapp/InAppReviewFactory;)V", "factory", "<init>", "()V", "rateapp-plugin_release"}, k = 1, mv = {1, 7, 1})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static InAppReviewFactory factory = new InAppReviewFactory();

    @NotNull
    public final InAppReviewFactory getFactory() {
        return factory;
    }

    public final void setFactory(@NotNull InAppReviewFactory inAppReviewFactory) {
        Intrinsics.checkNotNullParameter(inAppReviewFactory, "<set-?>");
        factory = inAppReviewFactory;
    }

    public final void withReviewFactory(@NotNull Context context, @NotNull Function1<? super InAppReview, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(factory.createInAppReview(context));
    }
}
