package com.bbva.component.ui.message.card;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.Scale;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.cellswidgets.skeleton.CellsSkeletonView;
import com.bbva.component.ui.message.card.databinding.ViewCardSkeletonBinding;
import com.bbva.component.ui.message.card.databinding.ViewMessageCardBinding;
import com.bbva.component.ui.message.card.databinding.ViewMessageSkeletonBinding;
import com.bbva.component.ui.message.card.model.Button;
import com.bbva.component.ui.message.card.model.ButtonStyle;
import com.bbva.component.ui.message.card.model.ImageSize;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.component.ui.message.card.model.TypeMessage;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t5.c;
import t5.d;
import t5.e;

/* JADX INFO: compiled from: MessageCardView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB;\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardView;", "Landroid/widget/FrameLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/ui/message/card/databinding/ViewMessageCardBinding;", "t0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/component/ui/message/card/databinding/ViewMessageCardBinding;", "binding", "Lcom/bbva/component/ui/message/card/MessageCardViewModel;", "u0", "Lcom/bbva/component/ui/message/card/MessageCardViewModel;", "getViewModel", "()Lcom/bbva/component/ui/message/card/MessageCardViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "isDarkModeEnabled", "canCloseByItself", "forceDarkStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V", "Companion", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCardView.kt\ncom/bbva/component/ui/message/card/MessageCardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n1#2:387\n1855#3,2:388\n*S KotlinDebug\n*F\n+ 1 MessageCardView.kt\ncom/bbva/component/ui/message/card/MessageCardView\n*L\n263#1:388,2\n*E\n"})
public final class MessageCardView extends FrameLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f28619p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f28620q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f28621r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28622s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MessageCardViewModel viewModel;

    @Nullable
    public final CellsSkeletonView v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f28625w0;

    /* JADX INFO: compiled from: MessageCardView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardView$Companion;", "", "<init>", "()V", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMessageCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCardView.kt\ncom/bbva/component/ui/message/card/MessageCardView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1#2:387\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Context access$getContextThemeWrapper(Companion companion, boolean z10, boolean z11, Context context) {
            int i10;
            companion.getClass();
            if (z10) {
                i10 = R.style.MessageCardStyle_Dark;
            } else {
                i10 = z11 ? R.style.MessageCardStyle_DayNight : R.style.MessageCardStyle;
            }
            return new ContextThemeWrapper(context, i10);
        }

        public static final boolean access$initCanCloseByItself(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.messageCardView_canCloseByItself});
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            return z10;
        }

        public static final boolean access$initForceDarkStyle(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.messageCardView_forceDarkStyle});
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            return z10;
        }

        public static final boolean access$initIsDarkModeEnabled(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.messageCardView_isDarkModeEnabled});
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            return z10;
        }
    }

    /* JADX INFO: compiled from: MessageCardView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ImageSize.values().length];
            try {
                iArr[ImageSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeMessage.values().length];
            try {
                iArr2[TypeMessage.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonStyle.values().length];
            try {
                iArr3[ButtonStyle.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[ButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ButtonStyle.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ButtonStyle.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: compiled from: MessageCardView.kt */
    public static final class a extends Lambda implements Function0<ViewMessageCardBinding> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewMessageCardBinding invoke() {
            MessageCardView messageCardView = MessageCardView.this;
            return ViewMessageCardBinding.inflate(LayoutInflater.from(messageCardView.getContext()), messageCardView);
        }
    }

    /* JADX INFO: compiled from: MessageCardView.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Button f28628q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Button button) {
            super(0);
            this.f28628q0 = button;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MessageCardView.this.getViewModel().onMessageCardButtonClick$component_ui_message_card_release(this.f28628q0.getId());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCardView(@NotNull Context context) {
        this(context, null, false, false, false, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(MessageCardView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewModel.onMessageCloseButtonClick$component_ui_message_card_release();
        if (this$0.f28620q0) {
            this$0.getBinding().getRoot().setVisibility(8);
        }
    }

    public static final void access$updateView(MessageCardView messageCardView, MessageCardState messageCardState) {
        messageCardView.getClass();
        messageCardView.g(messageCardState.getType(), messageCardState.getTitle() != null);
        messageCardView.f(messageCardState.getType(), messageCardState.getImageSize());
        if (URLUtil.isValidUrl(messageCardState.getImage())) {
            CellsImageView cellsImageView = messageCardView.getBinding().messageCardImageView;
            Intrinsics.checkNotNullExpressionValue(cellsImageView, "binding.messageCardImageView");
            ImageViewKt.settings(cellsImageView, new ImageSettings((ViewSettings) null, (Scale) null, (ResourceId) null, messageCardState.getImage(), 7, (DefaultConstructorMarker) null), new d(messageCardView));
        } else {
            CellsImageView cellsImageView2 = messageCardView.getBinding().messageCardImageView;
            Intrinsics.checkNotNullExpressionValue(cellsImageView2, "binding.messageCardImageView");
            ImageViewKt.settings(cellsImageView2, new ImageSettings((ViewSettings) null, (Scale) null, new ResourceId(messageCardState.getImage(), (Integer) null, 2, (DefaultConstructorMarker) null), (String) null, 11, (DefaultConstructorMarker) null), new e(messageCardView));
        }
        messageCardView.i(messageCardState.getTitle(), messageCardState.getPrimaryText(), messageCardState.getSecondaryText());
        Button messageLink = messageCardState.getMessageLink();
        messageCardView.getBinding().messageLink.removeAllViews();
        if (messageLink != null) {
            FrameLayout frameLayout = messageCardView.getBinding().messageLink;
            ButtonItemView buttonItemViewB = messageCardView.b(messageLink);
            buttonItemViewB.applyLinkAlignment();
            frameLayout.addView(buttonItemViewB);
        }
        List<Button> buttons = messageCardState.getButtons();
        messageCardView.getBinding().messageCardButtonContainer.removeAllViews();
        for (Button button : buttons) {
            LinearLayout linearLayout = messageCardView.getBinding().messageCardButtonContainer;
            ButtonItemView buttonItemViewB2 = messageCardView.b(button);
            buttonItemViewB2.applyMarginTop();
            linearLayout.addView(buttonItemViewB2);
        }
        String closeButtonAccessibility = messageCardState.getCloseButtonAccessibility();
        if (closeButtonAccessibility != null) {
            messageCardView.getBinding().messageCardCloseView.setContentDescription(closeButtonAccessibility);
        }
        CellsSkeletonView cellsSkeletonView = messageCardView.v0;
        if (cellsSkeletonView != null) {
            cellsSkeletonView.stopAnimation();
        }
        messageCardView.getBinding().skeletonContainerView.setVisibility(8);
        messageCardView.getBinding().messageCard.setVisibility(0);
    }

    public static TypeMessage e(int i10) {
        if (i10 == 0) {
            return TypeMessage.MESSAGE;
        }
        if (i10 != 1) {
            return i10 != 2 ? TypeMessage.MESSAGE : TypeMessage.CARD_CROSS;
        }
        return TypeMessage.CARD;
    }

    private final ViewMessageCardBinding getBinding() {
        return (ViewMessageCardBinding) this.binding.getValue();
    }

    public static void h(CellsTextView cellsTextView, String str) {
        if (str == null || l.isBlank(str)) {
            cellsTextView.setVisibility(8);
        } else {
            cellsTextView.setText(str);
            cellsTextView.setVisibility(0);
        }
    }

    public final ButtonItemView b(Button button) {
        int i10;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int i11 = WhenMappings.$EnumSwitchMapping$2[button.getStyle().ordinal()];
        boolean z10 = this.f28619p0;
        boolean z11 = this.f28621r0;
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = R.style.MessageCard_PrimaryButton;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z11) {
                    i10 = R.style.MessageCard_LinkButton_Dark;
                } else {
                    i10 = z10 ? R.style.MessageCard_LinkButton_DayNight : R.style.MessageCard_LinkButton;
                }
            } else if (z11) {
                i10 = R.style.MessageCard_SecondaryButton_Dark;
            } else {
                i10 = z10 ? R.style.MessageCard_SecondaryButton_DayNight : R.style.MessageCard_SecondaryButton;
            }
        } else if (z11) {
            i10 = R.style.MessageCard_PositiveButton_Dark;
        } else {
            i10 = z10 ? R.style.MessageCard_PositiveButton_DayNight : R.style.MessageCard_PositiveButton;
        }
        ButtonItemView buttonItemView = new ButtonItemView(context, i10);
        buttonItemView.setText$component_ui_message_card_release(button.getText());
        buttonItemView.setOnClickListener(new b(button));
        return buttonItemView;
    }

    public final void c(TypeMessage typeMessage) {
        CellsImageView cellsImageView = getBinding().messageCardImageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, cellsImageView.getContext().getResources().getDimensionPixelSize(typeMessage == TypeMessage.CARD_CROSS ? R.dimen.message_card_component_margin_2xl : R.dimen.message_card_component_margin_0), 0, 0);
        cellsImageView.setLayoutParams(layoutParams);
    }

    public final void d() {
        CellsImageView cellsImageView = getBinding().messageCardImageView;
        int dimensionPixelSize = cellsImageView.getContext().getResources().getDimensionPixelSize(R.dimen.message_card_component_image_small_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        Resources resources = cellsImageView.getContext().getResources();
        int i10 = R.dimen.message_card_component_margin_m;
        layoutParams.setMargins(resources.getDimensionPixelSize(i10), cellsImageView.getContext().getResources().getDimensionPixelSize(i10), 0, 0);
        cellsImageView.setLayoutParams(layoutParams);
    }

    public final void f(TypeMessage typeMessage, ImageSize imageSize) {
        int i10 = imageSize == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageSize.ordinal()];
        if (i10 == -1) {
            if (typeMessage == TypeMessage.MESSAGE) {
                c(typeMessage);
                return;
            } else {
                d();
                return;
            }
        }
        if (i10 == 1) {
            d();
        } else {
            if (i10 != 2) {
                return;
            }
            c(typeMessage);
        }
    }

    public final void g(TypeMessage typeMessage, boolean z10) {
        if (WhenMappings.$EnumSwitchMapping$1[typeMessage.ordinal()] == 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(z10 ? R.dimen.message_card_component_margin_s : R.dimen.message_card_component_margin_m);
            RelativeLayout relativeLayout = getBinding().messageCardBackground;
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
            layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
            int i10 = R.dimen.message_card_component_card_default_elevation;
            RelativeLayout relativeLayout2 = getBinding().messageCardBackground;
            relativeLayout2.setBackgroundColor(ContextCompat.getColor(relativeLayout2.getContext(), android.R.color.transparent));
            relativeLayout2.setElevation(relativeLayout2.getResources().getDimension(i10));
            getBinding().messageCardCloseView.setVisibility(8);
            return;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.message_card_component_margin_m);
        RelativeLayout relativeLayout3 = getBinding().messageCardBackground;
        LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-1, -2);
        layoutParams2.setMargins(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        relativeLayout3.setLayoutParams(layoutParams2);
        int i11 = this.f28625w0;
        int i12 = R.dimen.message_card_component_card_elevation;
        RelativeLayout relativeLayout4 = getBinding().messageCardBackground;
        relativeLayout4.setBackgroundColor(ContextCompat.getColor(relativeLayout4.getContext(), i11));
        relativeLayout4.setElevation(relativeLayout4.getResources().getDimension(i12));
        getBinding().messageCardCloseView.setVisibility(typeMessage == TypeMessage.CARD_CROSS ? 0 : 8);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28622s0.getCoroutineContext();
    }

    @NotNull
    public final MessageCardViewModel getViewModel() {
        return this.viewModel;
    }

    public final void i(String str, String str2, String str3) {
        CellsTextView cellsTextView = getBinding().messageCardTitleView;
        Intrinsics.checkNotNullExpressionValue(cellsTextView, "binding.messageCardTitleView");
        h(cellsTextView, str);
        CellsTextView cellsTextView2 = getBinding().messageCardPrimaryTextView;
        Intrinsics.checkNotNullExpressionValue(cellsTextView2, "binding.messageCardPrimaryTextView");
        h(cellsTextView2, str2);
        CellsTextView cellsTextView3 = getBinding().messageCardSecondaryTextView;
        Intrinsics.checkNotNullExpressionValue(cellsTextView3, "binding.messageCardSecondaryTextView");
        h(cellsTextView3, str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, false, false, false, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, boolean z10) {
        this(context, attributeSet, z10, false, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, boolean z10, boolean z11) {
        this(context, attributeSet, z10, z11, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageCardView(Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i10 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet2, (i10 & 4) != 0 ? Companion.access$initIsDarkModeEnabled(INSTANCE, context, attributeSet2) : z10, (i10 & 8) != 0 ? Companion.access$initCanCloseByItself(INSTANCE, context, attributeSet2) : z11, (i10 & 16) != 0 ? Companion.access$initForceDarkStyle(INSTANCE, context, attributeSet2) : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, boolean z10, boolean z11, boolean z12) {
        ImageSize imageSize;
        int i10;
        CellsSkeletonView root;
        super(Companion.access$getContextThemeWrapper(INSTANCE, z12, z10, context), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28619p0 = z10;
        this.f28620q0 = z11;
        this.f28621r0 = z12;
        this.f28622s0 = CoroutineScopeKt.MainScope();
        this.binding = LazyKt__LazyJVMKt.lazy(new a());
        this.viewModel = new MessageCardViewModel();
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.MessageCardView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "this");
        this.f28625w0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MessageCardView_messageCardView_cardBackground, com.bbva.cellswidgets.R.color.white);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.MessageCardView_messageCardView_image);
        int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.MessageCardView_messageCardView_type, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.MessageCardView_messageCardView_image_size, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.MessageCardView_messageCardView_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.MessageCardView_messageCardView_primaryText);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.MessageCardView_messageCardView_secondaryText);
        if (string == null && drawable == null && string2 == null && string3 == null) {
            FrameLayout frameLayout = getBinding().skeletonContainerView;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.skeletonContainerView");
            TypeMessage typeMessageE = e(integer);
            frameLayout.removeAllViews();
            if (z12) {
                i10 = R.style.MessageCard_Skeleton_Dark;
            } else if (z10) {
                i10 = R.style.MessageCard_Skeleton_DayNight;
            } else {
                i10 = R.style.MessageCard_Skeleton;
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(new ContextThemeWrapper(getContext(), i10));
            if (typeMessageE != TypeMessage.CARD && typeMessageE != TypeMessage.CARD_CROSS) {
                root = ViewMessageSkeletonBinding.inflate(layoutInflaterFrom, frameLayout, false).getRoot();
            } else {
                root = ViewCardSkeletonBinding.inflate(layoutInflaterFrom, frameLayout, false).getRoot();
            }
            this.v0 = root;
            frameLayout.addView(root);
            frameLayout.setVisibility(0);
            getBinding().messageCard.setVisibility(8);
            CellsSkeletonView cellsSkeletonView = this.v0;
            if (cellsSkeletonView != null) {
                cellsSkeletonView.startAnimation();
            }
        }
        g(e(integer), string != null);
        TypeMessage typeMessageE2 = e(integer);
        if (integer2 != 0) {
            imageSize = integer2 != 1 ? null : ImageSize.LARGE;
        } else {
            imageSize = ImageSize.SMALL;
        }
        f(typeMessageE2, imageSize);
        getBinding().messageCardImageView.setImageDrawable(drawable);
        i(string, string2, string3);
        ViewCompat.setAccessibilityHeading(getBinding().messageCardTitleView, true);
        ViewCompat.setAccessibilityHeading(getBinding().messageCardPrimaryTextView, true);
        getBinding().messageCardCloseView.setOnClickListener(new t5.b(this, 0));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, null), 3, null);
        typedArrayObtainStyledAttributes.recycle();
    }
}
