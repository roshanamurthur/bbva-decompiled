package com.bbva.ui.widget.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FilterableAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017BP\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012'\u0010\u000e\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016R8\u0010\u000e\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0004\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/bbva/ui/widget/adapters/FilterableAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/ArrayAdapter;", "Landroid/widget/Filter;", "getFilter", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "constraint", "", "p0", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "filter", "Landroid/content/Context;", "context", "", "resource", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(Landroid/content/Context;ILjava/util/List;Lkotlin/jvm/functions/Function2;)V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class FilterableAdapter<T> extends ArrayAdapter<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, CharSequence, Boolean> filter;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final List<T> f37736q0;

    /* JADX INFO: compiled from: FilterableAdapter.kt */
    @SourceDebugExtension({"SMAP\nFilterableAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterableAdapter.kt\ncom/bbva/ui/widget/adapters/FilterableAdapter$CustomFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n766#2:54\n857#2,2:55\n*S KotlinDebug\n*F\n+ 1 FilterableAdapter.kt\ncom/bbva/ui/widget/adapters/FilterableAdapter$CustomFilter\n*L\n39#1:54\n39#1:55,2\n*E\n"})
    public final class a extends Filter {
        public a() {
        }

        @Override // android.widget.Filter
        @NotNull
        public final Filter.FilterResults performFiltering(@Nullable CharSequence charSequence) {
            List arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            FilterableAdapter<T> filterableAdapter = FilterableAdapter.this;
            if (charSequence != null) {
                List list = filterableAdapter.f37736q0;
                arrayList = new ArrayList();
                for (T t10 : list) {
                    if (filterableAdapter.getFilter().invoke(t10, charSequence).booleanValue()) {
                        arrayList.add(t10);
                    }
                }
            } else {
                arrayList = filterableAdapter.f37736q0;
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(@Nullable CharSequence charSequence, @NotNull Filter.FilterResults results) {
            Intrinsics.checkNotNullParameter(results, "results");
            Object obj = results.values;
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                FilterableAdapter<T> filterableAdapter = FilterableAdapter.this;
                filterableAdapter.clear();
                filterableAdapter.addAll(list);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterableAdapter(@NotNull Context context, @LayoutRes int i10, @NotNull List<? extends T> items, @NotNull Function2<? super T, ? super CharSequence, Boolean> filter) {
        super(context, i10, CollectionsKt___CollectionsKt.toMutableList((Collection) items));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.filter = filter;
        this.f37736q0 = items;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NotNull
    public final Function2<T, CharSequence, Boolean> getFilter() {
        return this.filter;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new a();
    }
}
