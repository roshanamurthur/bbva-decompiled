package com.bbva.glomohybrid.landing.presentation.adapter.render;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.landing.databinding.ViewHolderLandingHeaderBinding;
import com.bbva.glomohybrid.landing.databinding.ViewHolderSectionEcommerceCardsBinding;
import com.bbva.glomohybrid.landing.databinding.ViewHolderSectionMessageBinding;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingECommerceCardsViewHolder;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingMessageCardViewHolder;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingRender.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/render/LandingRender;", "", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "render", "<init>", "()V", "ViewType", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingRender {

    @NotNull
    public static final LandingRender INSTANCE = new LandingRender();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LandingRender.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/render/LandingRender$ViewType;", "", "HEADER", "SECTION_MESSAGES", "SECTION_ECOMMERCE_CARDS", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType HEADER;
        public static final ViewType SECTION_ECOMMERCE_CARDS;
        public static final ViewType SECTION_MESSAGES;

        static {
            ViewType viewType = new ViewType("HEADER", 0);
            HEADER = viewType;
            ViewType viewType2 = new ViewType("SECTION_MESSAGES", 1);
            SECTION_MESSAGES = viewType2;
            ViewType viewType3 = new ViewType("SECTION_ECOMMERCE_CARDS", 2);
            SECTION_ECOMMERCE_CARDS = viewType3;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3};
            $VALUES = viewTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder render(@NotNull ViewGroup parent, int viewType, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (viewType == ViewType.SECTION_MESSAGES.ordinal()) {
            ViewHolderSectionMessageBinding viewHolderSectionMessageBindingInflate = ViewHolderSectionMessageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(viewHolderSectionMessageBindingInflate, "inflate(...)");
            return new LandingMessageCardViewHolder(viewHolderSectionMessageBindingInflate, coroutineContext);
        }
        if (viewType == ViewType.HEADER.ordinal()) {
            ViewHolderLandingHeaderBinding viewHolderLandingHeaderBindingInflate = ViewHolderLandingHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(viewHolderLandingHeaderBindingInflate, "inflate(...)");
            return new LandingHeaderViewHolder(viewHolderLandingHeaderBindingInflate, parent, coroutineContext);
        }
        ViewHolderSectionEcommerceCardsBinding viewHolderSectionEcommerceCardsBindingInflate = ViewHolderSectionEcommerceCardsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewHolderSectionEcommerceCardsBindingInflate, "inflate(...)");
        return new LandingECommerceCardsViewHolder(viewHolderSectionEcommerceCardsBindingInflate, coroutineContext);
    }
}
