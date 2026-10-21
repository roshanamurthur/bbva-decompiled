package com.bbva.cells.component.kit.datamanager.domain.helper;

import com.bbva.cells.component.kit.datamanager.domain.model.ImmutableDate;
import com.bbva.cells.component.kit.datamanager.mapper.Mapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MapperHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26677a = new a();

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        }
    }

    public static ImmutableDate dateOrEmpty(String str) {
        try {
            return str == null ? ImmutableDate.empty() : ImmutableDate.create(str, f26677a.get().parse(str));
        } catch (ParseException e5) {
            e5.getMessage();
            return ImmutableDate.empty();
        }
    }

    public static String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static <T, M> List<M> valueOrEmpty(List<T> list, Mapper<T, M> mapper) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.toData(it.next()));
        }
        return arrayList;
    }
}
