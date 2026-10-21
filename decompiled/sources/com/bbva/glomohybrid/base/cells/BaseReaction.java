package com.bbva.glomohybrid.base.cells;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.bridge.core.AppLifecycleProvider;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.component.ay.catalyst.Catalyst;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher;
import com.bbva.glomohybrid.base.webview.WebActions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v7.a;

/* JADX INFO: compiled from: BaseReaction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0015J#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\"\u0004\b\u0000\u0010\u00062\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u0005\u001a\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014JG\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\u001a\u0010\u0019\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a\"\u0006\u0012\u0002\b\u00030\u001b¢\u0006\u0002\u0010\u001cJ:\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001eH\u0004J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u0018H\u0004J&\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u0018JY\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001d\u0010!\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0002\b$JF\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010&2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000b0'J2\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\b\b\u0002\u0010)\u001a\u00020\u0014H\u0005JL\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0004\b\u0000\u0010\u0006*\u0012\u0012\u0004\u0012\u0002H\u00060\u0017j\b\u0012\u0004\u0012\u0002H\u0006`\u00182\b\b\u0002\u0010+\u001a\u00020\u00142\u0014\b\u0004\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000b0'H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "Lcom/bbva/cellscore/reactor/PageReaction;", "()V", "configure", "", "getComponent", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "componentId", "", "(I)Ljava/lang/Object;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "openScreen", "route", "animation", "Lcom/bbva/glomohybrid/base/Animation;", "params", "Landroid/os/Bundle;", "clearHistory", "", "cleanChannel", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;", "Lcom/bbva/glomohybrid/base/cells/Reaction;", NavigationOperations.UPDATE, "", "Lcom/bbva/cellscore/channel/model/Channel;", "(Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;[Lcom/bbva/cellscore/channel/model/Channel;)Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", "cleanChannels", "", "closeApp", "closeScreen", "routeProvider", "Lkotlin/Function2;", "Lcom/bbva/glomohybrid/base/router/Router;", "Lkotlin/ExtensionFunctionType;", "openWeb", "", "Lkotlin/Function1;", "shortcutReady", "ready", "webRouter", "skipHistory", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseReaction.kt\ncom/bbva/glomohybrid/base/cells/BaseReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,123:1\n25#2,8:124\n25#2,8:132\n25#2,8:140\n25#2,8:148\n25#2,8:156\n25#2,8:164\n25#2,8:172\n*S KotlinDebug\n*F\n+ 1 BaseReaction.kt\ncom/bbva/glomohybrid/base/cells/BaseReaction\n*L\n45#1:124,8\n68#1:132,8\n83#1:140,8\n100#1:148,8\n106#1:156,8\n111#1:164,8\n117#1:172,8\n*E\n"})
public abstract class BaseReaction extends PageReaction {
    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder openScreen$default(BaseReaction baseReaction, ReactorCoreBuilder.ReactionBuilder reactionBuilder, Animation animation, boolean z10, Function2 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openScreen");
        }
        if ((i10 & 1) != 0) {
            animation = Animation.Fade.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return baseReaction.openScreen(reactionBuilder, animation, z10, function2);
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder openWeb$default(BaseReaction baseReaction, ReactorCoreBuilder.ReactionBuilder reactionBuilder, Object obj, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWeb");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return baseReaction.openWeb(reactionBuilder, obj, function1);
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder shortcutReady$default(BaseReaction baseReaction, ReactorCoreBuilder.ReactionBuilder reactionBuilder, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shortcutReady");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return baseReaction.shortcutReady(reactionBuilder, z10);
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder webRouter$default(BaseReaction baseReaction, ReactorCoreBuilder.ReactionBuilder reactionBuilder, boolean z10, Function1 routeProvider, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: webRouter");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(routeProvider, "routeProvider");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside(WebActions.ID, WebController.class).delay(0L).doReaction(new BaseReaction$webRouter$$inlined$reactIn$default$1(z10, routeProvider));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> cleanChannel(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @NotNull Channel<?>... channels) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(channels, "channels");
        return cleanChannels(reactionBuilder, ArraysKt___ArraysKt.toList(channels));
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> cleanChannels(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @NotNull final List<? extends Channel<?>> channels) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(channels, "channels");
        String mTag = this.mTag;
        Intrinsics.checkNotNullExpressionValue(mTag, "mTag");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(mTag, Activity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$cleanChannels$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                Object applicationContext = ((Activity) p4).getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.bbva.bridge.core.AppLifecycleProvider");
                AppLifecycle appLifecycle = ((AppLifecycleProvider) applicationContext).getAppLifecycle();
                Iterator it = channels.iterator();
                while (it.hasNext()) {
                    appLifecycle.cleanChannel(((Channel) it.next()).getName(), false);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> closeApp(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        String mTag = this.mTag;
        Intrinsics.checkNotNullExpressionValue(mTag, "mTag");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(mTag, Activity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$closeApp$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                ((Activity) p4).finishAffinity();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> closeScreen(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        String mTag = this.mTag;
        Intrinsics.checkNotNullExpressionValue(mTag, "mTag");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(mTag, Activity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$closeScreen$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                ((Activity) p4).finish();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @Override // com.bbva.cellscore.reactor.GlobalReaction
    @SuppressLint({"NewApi"})
    @CallSuper
    public void configure() {
        Application application = this.mActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        addComponent(new Catalyst(application, (LifecycleOwner) componentCallbacks2, null, false, null, 28, null));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = reactTo(WebController.ON_WEB_READY_CHANNEL).then().onlyIf(new a(0));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        shortcutReady$default(this, reactionBuilderOnlyIf, false, 1, null);
    }

    public final <T> T getComponent(@NotNull String componentId) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        T t10 = (T) ComponentManager.get(this.mActivity.hashCode(), componentId);
        return t10 == null ? (T) ComponentManager.get(componentId) : t10;
    }

    public final void openScreen(@NotNull String route, @NotNull Animation animation, @NotNull Bundle params, boolean clearHistory) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(params, "params");
        Object component = getComponent(Router.ID);
        Intrinsics.checkNotNullExpressionValue(component, "getComponent(...)");
        Activity mActivity = this.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Router.navigate$default((Router) component, mActivity, route, animation, params, null, clearHistory, 16, null);
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> openWeb(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @Nullable final Object obj, @NotNull final Function1<? super T, String> routeProvider) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(routeProvider, "routeProvider");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(WebActions.ID, WebController.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$openWeb$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                WebController webController = (WebController) p4;
                WebNavigation webNavigationBuild = new WebNavigation.Builder().route((String) routeProvider.invoke(t10)).build();
                String route = webNavigationBuild.getRoute();
                Intrinsics.checkNotNull(route);
                if (route.length() <= 0) {
                    route = null;
                }
                if (route != null) {
                    webController.openWeb(((GlobalReaction) this).mActivity, webNavigationBuild, obj);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @RequiresApi(25)
    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> shortcutReady(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, final boolean z10) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(ShortcutComponentLauncher.ID, ShortcutComponentLauncher.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$shortcutReady$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                ((ShortcutComponentLauncher) p4).setReady(z10);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> webRouter(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, boolean z10, @NotNull Function1<? super T, String> routeProvider) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(routeProvider, "routeProvider");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(WebActions.ID, WebController.class).delay(0L).doReaction(new BaseReaction$webRouter$$inlined$reactIn$default$1(z10, routeProvider));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static /* synthetic */ void openScreen$default(BaseReaction baseReaction, String str, Animation animation, Bundle EMPTY, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openScreen");
        }
        if ((i10 & 2) != 0) {
            animation = Animation.Fade.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        baseReaction.openScreen(str, animation, EMPTY, z10);
    }

    public final <T> T getComponent(@IdRes int componentId) {
        T t10 = (T) ComponentManager.get(this.mActivity.hashCode(), String.valueOf(componentId));
        return t10 == null ? (T) ComponentManager.get(String.valueOf(componentId)) : t10;
    }

    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> openScreen(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @NotNull final Animation animation, final boolean z10, @NotNull final Function2<? super Router, ? super T, String> routeProvider) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(routeProvider, "routeProvider");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.BaseReaction$openScreen$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                Router router = (Router) p4;
                Activity activity = ((GlobalReaction) this.f31044p0).mActivity;
                Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1922512954(...)");
                Router.navigate$default(router, activity, (String) routeProvider.invoke(router, t10), animation, null, null, z10, 24, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }
}
