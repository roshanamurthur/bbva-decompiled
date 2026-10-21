package com.bbva.glomohybrid.landing.presentation.adapter;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderPreDrawInformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingItemsAnimator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J.\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsAnimator;", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "()V", "animateChange", "", "oldHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "newHolder", "preInfo", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;", "postInfo", "canReuseUpdatedViewHolder", "viewHolder", "payloads", "", "", "recordPreLayoutInformation", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "changeFlags", "", "Animation", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingItemsAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingItemsAnimator.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsAnimator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n800#2,11:74\n*S KotlinDebug\n*F\n+ 1 LandingItemsAnimator.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsAnimator\n*L\n62#1:74,11\n*E\n"})
public final class LandingItemsAnimator extends DefaultItemAnimator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f33005t = 450;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LandingItemsAnimator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsAnimator$Animation;", "", "EXPAND", "COLLAPSE", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Animation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Animation[] $VALUES;
        public static final Animation COLLAPSE;
        public static final Animation EXPAND;

        static {
            Animation animation = new Animation("EXPAND", 0);
            EXPAND = animation;
            Animation animation2 = new Animation("COLLAPSE", 1);
            COLLAPSE = animation2;
            Animation[] animationArr = {animation, animation2};
            $VALUES = animationArr;
            $ENTRIES = EnumEntriesKt.enumEntries(animationArr);
        }

        public Animation() {
            throw null;
        }

        @NotNull
        public static EnumEntries<Animation> getEntries() {
            return $ENTRIES;
        }

        public static Animation valueOf(String str) {
            return (Animation) Enum.valueOf(Animation.class, str);
        }

        public static Animation[] values() {
            return (Animation[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: LandingItemsAnimator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsAnimator$Companion;", "", "()V", "ANIMATION_DURATION", "", "getANIMATION_DURATION", "()J", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getANIMATION_DURATION() {
            return LandingItemsAnimator.f33005t;
        }
    }

    /* JADX INFO: compiled from: LandingItemsAnimator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Animation.values().length];
            try {
                iArr[Animation.EXPAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Animation.COLLAPSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LandingItemsAnimator.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingHeaderViewHolder f33007q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LandingHeaderViewHolder landingHeaderViewHolder) {
            super(0);
            this.f33007q0 = landingHeaderViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LandingItemsAnimator.this.dispatchAnimationFinished(this.f33007q0);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@NotNull RecyclerView.ViewHolder oldHolder, @NotNull RecyclerView.ViewHolder newHolder, @NotNull RecyclerView.ItemAnimator.ItemHolderInfo preInfo, @NotNull RecyclerView.ItemAnimator.ItemHolderInfo postInfo) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        Intrinsics.checkNotNullParameter(newHolder, "newHolder");
        Intrinsics.checkNotNullParameter(preInfo, "preInfo");
        Intrinsics.checkNotNullParameter(postInfo, "postInfo");
        LandingHeaderViewHolder landingHeaderViewHolder = newHolder instanceof LandingHeaderViewHolder ? (LandingHeaderViewHolder) newHolder : null;
        LandingHeaderPreDrawInformation landingHeaderPreDrawInformation = preInfo instanceof LandingHeaderPreDrawInformation ? (LandingHeaderPreDrawInformation) preInfo : null;
        if (landingHeaderViewHolder == null || landingHeaderPreDrawInformation == null) {
            return super.animateChange(oldHolder, newHolder, preInfo, postInfo);
        }
        landingHeaderViewHolder.animate(landingHeaderPreDrawInformation, new a(landingHeaderViewHolder));
        return true;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (viewHolder instanceof LandingHeaderViewHolder) {
            return true;
        }
        return super.canReuseUpdatedViewHolder(viewHolder, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @NotNull
    public RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(@NotNull RecyclerView.State state, @NotNull RecyclerView.ViewHolder viewHolder, int changeFlags, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!(viewHolder instanceof LandingHeaderViewHolder) || changeFlags != 2) {
            RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = super.recordPreLayoutInformation(state, viewHolder, changeFlags, payloads);
            Intrinsics.checkNotNullExpressionValue(itemHolderInfoRecordPreLayoutInformation, "recordPreLayoutInformation(...)");
            return itemHolderInfoRecordPreLayoutInformation;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : payloads) {
            if (obj instanceof Animation) {
                arrayList.add(obj);
            }
        }
        Animation animation = (Animation) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
        int i10 = animation == null ? -1 : WhenMappings.$EnumSwitchMapping$0[animation.ordinal()];
        if (i10 == 1) {
            return ((LandingHeaderViewHolder) viewHolder).getANIMATION_EXPAND();
        }
        if (i10 == 2) {
            return ((LandingHeaderViewHolder) viewHolder).getANIMATION_COLLAPSE();
        }
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation2 = super.recordPreLayoutInformation(state, viewHolder, changeFlags, payloads);
        Intrinsics.checkNotNullExpressionValue(itemHolderInfoRecordPreLayoutInformation2, "recordPreLayoutInformation(...)");
        return itemHolderInfoRecordPreLayoutInformation2;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof LandingHeaderViewHolder) {
            return true;
        }
        return super.canReuseUpdatedViewHolder(viewHolder);
    }
}
