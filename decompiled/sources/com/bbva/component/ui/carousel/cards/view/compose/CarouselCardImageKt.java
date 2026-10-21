package com.bbva.component.ui.carousel.cards.view.compose;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.g0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.component.ui.carousel.R;
import com.bbva.component.ui.carousel.cards.view.compose.defaults.CardImageDefaults;
import com.bbva.component.ui.carousel.extensions.CarouselStringExtensionsKt;
import com.bbva.component.ui.carousel.view.compose.theme.Dimension;
import com.bbva.component.ui.carousel.view.compose.theme.Palette;
import com.bbva.component.ui.carousel.view.compose.theme.Theme;
import com.bbva.component.ui.carousel.view.compose.theme.ThemeKt;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.network.glide.NetworkImageFetcher;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CarouselCardImage.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", GoogleTapAndPay.KEY_PAN, AuthConstants.IMAGE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "", "onClick", "CarouselCardImage", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselCardImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselCardImage.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselCardImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,152:1\n25#2:153\n25#2:161\n36#2:168\n460#2,13:194\n473#2,3:208\n1114#3,6:154\n1114#3,6:162\n1114#3,6:169\n76#4:160\n76#4:182\n67#5,6:175\n73#5:207\n77#5:212\n75#6:181\n76#6,11:183\n89#6:211\n76#7:213\n*S KotlinDebug\n*F\n+ 1 CarouselCardImage.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselCardImageKt\n*L\n51#1:153\n55#1:161\n63#1:168\n57#1:194,13\n57#1:208,3\n51#1:154,6\n55#1:162,6\n63#1:169,6\n54#1:160\n57#1:182\n57#1:175,6\n57#1:207\n57#1:212\n57#1:181\n57#1:183,11\n57#1:211\n56#1:213\n*E\n"})
public final class CarouselCardImageKt {

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Bitmap f28272p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28273q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28274r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28275s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, Modifier modifier, int i10, int i11) {
            super(2);
            this.f28272p0 = bitmap;
            this.f28273q0 = modifier;
            this.f28274r0 = i10;
            this.f28275s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28274r0 | 1);
            CarouselCardImageKt.a(this.f28272p0, this.f28273q0, composer, iUpdateChangedFlags, this.f28275s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f28276p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28277q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28278r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28279s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Modifier modifier, int i10, int i11) {
            super(2);
            this.f28276p0 = z10;
            this.f28277q0 = modifier;
            this.f28278r0 = i10;
            this.f28279s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28278r0 | 1);
            CarouselCardImageKt.b(this.f28276p0, this.f28277q0, composer, iUpdateChangedFlags, this.f28279s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f28280p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28281p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.f28281p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28281p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f28282p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    @DebugMetadata(c = "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImageKt$CarouselCardImage$6", f = "CarouselCardImage.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f28283p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Bitmap> f28284q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f28285r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f28286s0;

        /* JADX INFO: compiled from: CarouselCardImage.kt */
        @DebugMetadata(c = "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImageKt$CarouselCardImage$6$1", f = "CarouselCardImage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ Object f28287p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Bitmap> f28288q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Context f28289r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ String f28290s0;

            /* JADX INFO: renamed from: com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImageKt$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CarouselCardImage.kt */
            @DebugMetadata(c = "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImageKt$CarouselCardImage$6$1$1", f = "CarouselCardImage.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0120a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public MutableState f28291p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f28292q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ MutableState<Bitmap> f28293r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ Context f28294s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ String f28295t0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0120a(MutableState<Bitmap> mutableState, Context context, String str, Continuation<? super C0120a> continuation) {
                    super(2, continuation);
                    this.f28293r0 = mutableState;
                    this.f28294s0 = context;
                    this.f28295t0 = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0120a(this.f28293r0, this.f28294s0, this.f28295t0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0120a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    MutableState<Bitmap> mutableState;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f28292q0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        NetworkImageFetcher networkImageFetcher = NetworkImageFetcher.INSTANCE;
                        Context context = this.f28294s0;
                        String str = this.f28295t0;
                        if (str == null) {
                            str = "";
                        }
                        MutableState<Bitmap> mutableState2 = this.f28293r0;
                        this.f28291p0 = mutableState2;
                        this.f28292q0 = 1;
                        obj = NetworkImageFetcher.fetch$default(networkImageFetcher, context, str, null, this, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableState = mutableState2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState = this.f28291p0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap == null) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(bitmap);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MutableState<Bitmap> mutableState, Context context, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f28288q0 = mutableState;
                this.f28289r0 = context;
                this.f28290s0 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f28288q0, this.f28289r0, this.f28290s0, continuation);
                aVar.f28287p0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f28287p0, Dispatchers.getIO(), null, new C0120a(this.f28288q0, this.f28289r0, this.f28290s0, null), 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MutableState<Bitmap> mutableState, Context context, String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f28284q0 = mutableState;
            this.f28285r0 = context;
            this.f28286s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.f28284q0, this.f28285r0, this.f28286s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28283p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.f28284q0, this.f28285r0, this.f28286s0, null);
                this.f28283p0 = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f28296p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f28297q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28298r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f28299s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28300t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f28301u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, Modifier modifier, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f28296p0 = str;
            this.f28297q0 = str2;
            this.f28298r0 = modifier;
            this.f28299s0 = mutableInteractionSource;
            this.f28300t0 = function0;
            this.f28301u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CarouselCardImageKt.CarouselCardImage(this.f28296p0, this.f28297q0, this.f28298r0, this.f28299s0, this.f28300t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28301u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f28302p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28303q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28304r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28305s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Modifier modifier, int i10, int i11) {
            super(2);
            this.f28302p0 = str;
            this.f28303q0 = modifier;
            this.f28304r0 = i10;
            this.f28305s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28304r0 | 1);
            CarouselCardImageKt.c(this.f28302p0, this.f28303q0, composer, iUpdateChangedFlags, this.f28305s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0134  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CarouselCardImage(@NotNull String pan, @Nullable String str, @Nullable Modifier modifier, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        int i15;
        Function0<Unit> function1;
        int i16;
        MutableInteractionSource mutableInteractionSource3;
        Function0<Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        Function0<ComposeUiNode> constructor;
        MutableInteractionSource mutableInteractionSource4;
        Function0<Unit> function3;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pan, "pan");
        Composer composerStartRestartGroup = composer.startRestartGroup(1201675357);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(pan) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i15 != 0) {
                            function2 = c.f28280p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                        }
                        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState = (MutableState) objRememberedValue;
                        State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                        Modifier modifierClip = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new d(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
                        Modifier modifier3 = modifier2;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                        ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        a((Bitmap) mutableState.getValue(), null, composerStartRestartGroup, 8, 2);
                        b(stateCollectIsPressedAsState.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                        c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(str, new f(mutableState, context, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        function3 = function2;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableInteractionSource4 = mutableInteractionSource2;
                        function3 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
                }
                i12 |= 24576;
                function1 = function0;
                if ((46811 & i12) == 9362) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState2 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState2 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip2 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip2, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics$default2);
                    Modifier modifier4 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, density2));
                    ai.a.j(0, function3MaterializerOf2, g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState2.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState2.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState2, context2, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier4;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState3 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState3 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip3 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics$default3);
                    Modifier modifier5 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, density3));
                    ai.a.j(0, function3MaterializerOf3, g0.b(companion4, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState3.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState3.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState3, context3, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((46811 & i12) == 9362) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context4 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState4 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState4 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip4 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip4, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierSemantics$default4);
                    Modifier modifier6 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl4, measurePolicyC4, composerM2074constructorimpl4, density4));
                    ai.a.j(0, function3MaterializerOf4, g0.b(companion5, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState4.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState4.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState4, context4, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier6;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context5 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState5 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState5 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip5 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip5, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierSemantics$default5);
                    Modifier modifier7 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl5, measurePolicyC5, composerM2074constructorimpl5, density5));
                    ai.a.j(0, function3MaterializerOf5, g0.b(companion6, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState5.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState5.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState5, context5, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
            }
            i12 |= 24576;
            function1 = function0;
            if ((46811 & i12) == 9362) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context6 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState6 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState6 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip6 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip6, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierSemantics$default6);
                Modifier modifier8 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl6, measurePolicyC6, composerM2074constructorimpl6, density6));
                ai.a.j(0, function3MaterializerOf6, g0.b(companion7, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState6.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState6.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState6, context6, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier8;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context7 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState7 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState7 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip7 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip7, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierSemantics$default7);
                Modifier modifier9 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl7, measurePolicyC7, composerM2074constructorimpl7, density7));
                ai.a.j(0, function3MaterializerOf7, g0.b(companion8, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState7.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState7.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState7, context7, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((46811 & i12) == 9362) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context8 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState8 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState8 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip8 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default8 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip8, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC8 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierSemantics$default8);
                    Modifier modifier10 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl8, measurePolicyC8, composerM2074constructorimpl8, density8));
                    ai.a.j(0, function3MaterializerOf8, g0.b(companion9, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState8.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState8.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState8, context8, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier10;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i15 != 0) {
                        function2 = c.f28280p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                    }
                    Context context9 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState9 = (MutableState) objRememberedValue;
                    State<Boolean> stateCollectIsPressedAsState9 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                    Modifier modifierClip9 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new d(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default9 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip9, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC9 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierSemantics$default9);
                    Modifier modifier11 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl9, measurePolicyC9, composerM2074constructorimpl9, density9));
                    ai.a.j(0, function3MaterializerOf9, g0.b(companion10, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    a((Bitmap) mutableState9.getValue(), null, composerStartRestartGroup, 8, 2);
                    b(stateCollectIsPressedAsState9.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                    c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(str, new f(mutableState9, context9, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function3 = function2;
                    modifier2 = modifier11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
            }
            i12 |= 24576;
            function1 = function0;
            if ((46811 & i12) == 9362) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context10 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState10 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState10 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip10 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default10 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip10, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC10 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierSemantics$default10);
                Modifier modifier12 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl10, measurePolicyC10, composerM2074constructorimpl10, density10));
                ai.a.j(0, function3MaterializerOf10, g0.b(companion11, composerM2074constructorimpl10, viewConfiguration10, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState10.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState10.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState10, context10, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier12;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context11 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState11 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState11 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip11 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default11 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip11, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC11 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierSemantics$default11);
                Modifier modifier13 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl11, measurePolicyC11, composerM2074constructorimpl11, density11));
                ai.a.j(0, function3MaterializerOf11, g0.b(companion12, composerM2074constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState11.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState11.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState11, context11, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
        }
        i12 |= 3072;
        mutableInteractionSource2 = mutableInteractionSource;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((46811 & i12) == 9362) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context12 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState12 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState12 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip12 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default12 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip12, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC12 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierSemantics$default12);
                Modifier modifier14 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion13, composerM2074constructorimpl12, measurePolicyC12, composerM2074constructorimpl12, density12));
                ai.a.j(0, function3MaterializerOf12, g0.b(companion13, composerM2074constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState12.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState12.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState12, context12, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier14;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i15 != 0) {
                    function2 = c.f28280p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
                }
                Context context13 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState13 = (MutableState) objRememberedValue;
                State<Boolean> stateCollectIsPressedAsState13 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
                Modifier modifierClip13 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default13 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip13, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC13 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierSemantics$default13);
                Modifier modifier15 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl13, measurePolicyC13, composerM2074constructorimpl13, density13));
                ai.a.j(0, function3MaterializerOf13, g0.b(companion14, composerM2074constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                a((Bitmap) mutableState13.getValue(), null, composerStartRestartGroup, 8, 2);
                b(stateCollectIsPressedAsState13.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
                c(pan, null, composerStartRestartGroup, i12 & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(str, new f(mutableState13, context13, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                function3 = function2;
                modifier2 = modifier15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
        }
        i12 |= 24576;
        function1 = function0;
        if ((46811 & i12) == 9362) {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (i15 != 0) {
                function2 = c.f28280p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
            }
            Context context14 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState14 = (MutableState) objRememberedValue;
            State<Boolean> stateCollectIsPressedAsState14 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
            Modifier modifierClip14 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default14 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip14, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC14 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierSemantics$default14);
            Modifier modifier16 = modifier2;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl14, measurePolicyC14, composerM2074constructorimpl14, density14));
            ai.a.j(0, function3MaterializerOf14, g0.b(companion15, composerM2074constructorimpl14, viewConfiguration14, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            a((Bitmap) mutableState14.getValue(), null, composerStartRestartGroup, 8, 2);
            b(stateCollectIsPressedAsState14.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
            c(pan, null, composerStartRestartGroup, i12 & 14, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(str, new f(mutableState14, context14, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            function3 = function2;
            modifier2 = modifier16;
        } else {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (i15 != 0) {
                function2 = c.f28280p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201675357, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImage (CarouselCardImage.kt:46)");
            }
            Context context15 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState15 = (MutableState) objRememberedValue;
            State<Boolean> stateCollectIsPressedAsState15 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i12 >> 9) & 14);
            Modifier modifierClip15 = ClipKt.clip(modifier2, CardImageDefaults.INSTANCE.getShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default15 = SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(modifierClip15, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, e.f28282p0, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC15 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            constructor = companion16.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierSemantics$default15);
            Modifier modifier17 = modifier2;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl15, measurePolicyC15, composerM2074constructorimpl15, density15));
            ai.a.j(0, function3MaterializerOf15, g0.b(companion16, composerM2074constructorimpl15, viewConfiguration15, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            a((Bitmap) mutableState15.getValue(), null, composerStartRestartGroup, 8, 2);
            b(stateCollectIsPressedAsState15.getValue().booleanValue(), null, composerStartRestartGroup, 0, 2);
            c(pan, null, composerStartRestartGroup, i12 & 14, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(str, new f(mutableState15, context15, str, null), composerStartRestartGroup, ((i12 >> 3) & 14) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            function3 = function2;
            modifier2 = modifier17;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(pan, str, modifier2, mutableInteractionSource4, function3, i10, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Bitmap bitmap, Modifier modifier, Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2072208593);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2072208593, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CardImage (CarouselCardImage.kt:80)");
        }
        ImageBitmap imageBitmapAsImageBitmap = bitmap != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap) : null;
        composerStartRestartGroup.startReplaceableGroup(-1878890126);
        if (imageBitmapAsImageBitmap == null) {
            imageBitmapAsImageBitmap = ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, R.drawable.carousel_default_card, composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifier3 = modifier2;
        ImageKt.m158Image5hnEew(imageBitmapAsImageBitmap, null, SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(bitmap, modifier3, i10, i11));
    }

    public static final void access$CarouselCardImagePreview(Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-731551779);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731551779, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardImagePreview (CarouselCardImage.kt:140)");
            }
            ThemeKt.Theme(false, false, ComposableSingletons$CarouselCardImageKt.INSTANCE.m4853getLambda1$component_ui_carousel_release(), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j5.a(i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(boolean z10, Modifier modifier, Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1814633417);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814633417, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CardOverlay (CarouselCardImage.kt:96)");
            }
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), z10 ? Color.m2507copywmQWz5c$default(CardImageDefaults.Overlay.INSTANCE.m4858getColor0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m2507copywmQWz5c$default(CardImageDefaults.Overlay.INSTANCE.m4858getColor0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, modifier, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(String str, Modifier modifier, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(898391855);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(898391855, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.TextWithShadow (CarouselCardImage.kt:113)");
                }
                String pan = CarouselStringExtensionsKt.formatPan(str);
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), Alignment.INSTANCE.getBottom(), false, 2, null);
                Dimension.Padding padding = Dimension.Padding.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierWrapContentHeight$default, padding.m4861getSmallD9Ej5fM(), 0.0f, padding.m4861getSmallD9Ej5fM(), CardImageDefaults.INSTANCE.m4855getContentBottomPaddingD9Ej5fM(), 2, null);
                Palette palette = Palette.INSTANCE;
                long jM4870getWhite0d7_KjU = palette.m4870getWhite0d7_KjU();
                Modifier modifier4 = modifier3;
                TextStyle textStyle = Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getDefault();
                TextStyle textStyleM3981copyCXVQc50 = textStyle.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyle.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyle.spanStyle.getShadow() : new Shadow(palette.m4866getNeutralGrey1000d7_KjU(), OffsetKt.Offset(2.0f, 2.0f), 2.0f, null), (3653631 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : null, (3653631 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyle.platformStyle : null, (3653631 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyle.paragraphStyle.getHyphens() : null);
                composer2 = composerStartRestartGroup;
                TextKt.m879Text4IGK_g(pan, modifierM300paddingqDBjuR0$default, jM4870getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3981copyCXVQc50, composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0, 65528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(str, modifier2, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898391855, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.TextWithShadow (CarouselCardImage.kt:113)");
            }
            String pan2 = CarouselStringExtensionsKt.formatPan(str);
            Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), Alignment.INSTANCE.getBottom(), false, 2, null);
            Dimension.Padding padding2 = Dimension.Padding.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(modifierWrapContentHeight$default2, padding2.m4861getSmallD9Ej5fM(), 0.0f, padding2.m4861getSmallD9Ej5fM(), CardImageDefaults.INSTANCE.m4855getContentBottomPaddingD9Ej5fM(), 2, null);
            Palette palette2 = Palette.INSTANCE;
            long jM4870getWhite0d7_KjU2 = palette2.m4870getWhite0d7_KjU();
            Modifier modifier5 = modifier3;
            TextStyle textStyle2 = Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getDefault();
            TextStyle textStyleM3981copyCXVQc51 = textStyle2.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyle2.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyle2.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyle2.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyle2.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyle2.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyle2.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyle2.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : new Shadow(palette2.m4866getNeutralGrey1000d7_KjU(), OffsetKt.Offset(2.0f, 2.0f), 2.0f, null), (3653631 & 16384) != 0 ? textStyle2.paragraphStyle.getTextAlign() : null, (3653631 & 32768) != 0 ? textStyle2.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyle2.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyle2.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyle2.platformStyle : null, (3653631 & 524288) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyle2.paragraphStyle.getHyphens() : null);
            composer2 = composerStartRestartGroup;
            TextKt.m879Text4IGK_g(pan2, modifierM300paddingqDBjuR0$default2, jM4870getWhite0d7_KjU2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3981copyCXVQc51, composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898391855, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.TextWithShadow (CarouselCardImage.kt:113)");
            }
            String pan3 = CarouselStringExtensionsKt.formatPan(str);
            Modifier modifierWrapContentHeight$default3 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), Alignment.INSTANCE.getBottom(), false, 2, null);
            Dimension.Padding padding3 = Dimension.Padding.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(modifierWrapContentHeight$default3, padding3.m4861getSmallD9Ej5fM(), 0.0f, padding3.m4861getSmallD9Ej5fM(), CardImageDefaults.INSTANCE.m4855getContentBottomPaddingD9Ej5fM(), 2, null);
            Palette palette3 = Palette.INSTANCE;
            long jM4870getWhite0d7_KjU3 = palette3.m4870getWhite0d7_KjU();
            Modifier modifier6 = modifier3;
            TextStyle textStyle3 = Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getDefault();
            TextStyle textStyleM3981copyCXVQc52 = textStyle3.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyle3.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyle3.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyle3.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyle3.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyle3.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyle3.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyle3.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyle3.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyle3.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyle3.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyle3.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyle3.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyle3.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyle3.spanStyle.getShadow() : new Shadow(palette3.m4866getNeutralGrey1000d7_KjU(), OffsetKt.Offset(2.0f, 2.0f), 2.0f, null), (3653631 & 16384) != 0 ? textStyle3.paragraphStyle.getTextAlign() : null, (3653631 & 32768) != 0 ? textStyle3.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyle3.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyle3.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyle3.platformStyle : null, (3653631 & 524288) != 0 ? textStyle3.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyle3.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyle3.paragraphStyle.getHyphens() : null);
            composer2 = composerStartRestartGroup;
            TextKt.m879Text4IGK_g(pan3, modifierM300paddingqDBjuR0$default3, jM4870getWhite0d7_KjU3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3981copyCXVQc52, composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(str, modifier2, i10, i11));
    }
}
