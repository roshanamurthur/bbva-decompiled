package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f44603p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f44604q0;

    public s(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView) {
        this.f44604q0 = monthsPagerAdapter;
        this.f44603p0 = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f44603p0;
        r rVarB = materialCalendarGridView.b();
        if (i10 < rVarB.a() || i10 > rVarB.c()) {
            return;
        }
        MaterialCalendar.e eVar = this.f44604q0.f44530s0;
        long jLongValue = materialCalendarGridView.b().getItem(i10).longValue();
        MaterialCalendar materialCalendar = MaterialCalendar.this;
        if (materialCalendar.f44477r0.getDateValidator().isValid(jLongValue)) {
            materialCalendar.f44476q0.select(jLongValue);
            Iterator it = materialCalendar.onSelectionChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnSelectionChangedListener) it.next()).onSelectionChanged(materialCalendar.f44476q0.getSelection());
            }
            materialCalendar.f44482x0.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = materialCalendar.f44481w0;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
