package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SupportMenuInflater extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f824f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f828d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final Class<?>[] f829r0 = {MenuItem.class};

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f830p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Method f831q0;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f831q0;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f830p0;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Menu f832a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f839h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f840i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f841j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f842k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f843l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f844n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f845o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f846p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f847q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f848r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f849s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f851u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f852v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f853w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f854x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f855y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ActionProvider f856z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f833b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f834c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f835d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f836e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f837f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f838g = true;

        public b(Menu menu) {
            this.f832a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f827c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e5) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f849s).setVisible(this.f850t).setEnabled(this.f851u).setCheckable(this.f848r >= 1).setTitleCondensed(this.f843l).setIcon(this.m);
            int i10 = this.f852v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f855y;
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            if (str != null) {
                if (supportMenuInflater.f827c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (supportMenuInflater.f828d == null) {
                    supportMenuInflater.f828d = SupportMenuInflater.a(supportMenuInflater.f827c);
                }
                Object obj = supportMenuInflater.f828d;
                String str2 = this.f855y;
                a aVar = new a();
                aVar.f830p0 = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f831q0 = cls.getMethod(str2, a.f829r0);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e5) {
                    StringBuilder sbD = ci.a.d("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbD.append(cls.getName());
                    InflateException inflateException = new InflateException(sbD.toString());
                    inflateException.initCause(e5);
                    throw inflateException;
                }
            }
            if (this.f848r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str3 = this.f854x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, SupportMenuInflater.f823e, supportMenuInflater.f825a));
                z10 = true;
            }
            int i11 = this.f853w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            ActionProvider actionProvider = this.f856z;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.A);
            MenuItemCompat.setTooltipText(menuItem, this.B);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.f844n, this.f845o);
            MenuItemCompat.setNumericShortcut(menuItem, this.f846p, this.f847q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f823e = clsArr;
        f824f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f827c = context;
        Object[] objArr = {context};
        this.f825a = objArr;
        this.f826b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i10) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.f833b = 0;
                        bVar.f834c = 0;
                        bVar.f835d = 0;
                        bVar.f836e = 0;
                        bVar.f837f = true;
                        bVar.f838g = true;
                    } else if (name2.equals(AnalyticsConstants.Key.ITEM)) {
                        if (!bVar.f839h) {
                            ActionProvider actionProvider = bVar.f856z;
                            if (actionProvider == null || !actionProvider.hasSubMenu()) {
                                bVar.f839h = true;
                                bVar.b(bVar.f832a.add(bVar.f833b, bVar.f840i, bVar.f841j, bVar.f842k));
                            } else {
                                bVar.f839h = true;
                                bVar.b(bVar.f832a.addSubMenu(bVar.f833b, bVar.f840i, bVar.f841j, bVar.f842k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = supportMenuInflater.f827c.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
                    bVar.f833b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
                    bVar.f834c = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
                    bVar.f835d = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
                    bVar.f836e = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
                    bVar.f837f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
                    bVar.f838g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals(AnalyticsConstants.Key.ITEM)) {
                    TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(supportMenuInflater.f827c, attributeSet, R.styleable.MenuItem);
                    bVar.f840i = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
                    bVar.f841j = (tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, bVar.f834c) & SupportMenu.CATEGORY_MASK) | (tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, bVar.f835d) & 65535);
                    bVar.f842k = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
                    bVar.f843l = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
                    bVar.m = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
                    String string = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut);
                    bVar.f844n = string == null ? (char) 0 : string.charAt(0);
                    bVar.f845o = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
                    String string2 = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut);
                    bVar.f846p = string2 == null ? (char) 0 : string2.charAt(0);
                    bVar.f847q = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
                    int i11 = R.styleable.MenuItem_android_checkable;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                        bVar.f848r = tintTypedArrayObtainStyledAttributes.getBoolean(i11, false) ? 1 : 0;
                    } else {
                        bVar.f848r = bVar.f836e;
                    }
                    bVar.f849s = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
                    bVar.f850t = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, bVar.f837f);
                    bVar.f851u = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, bVar.f838g);
                    bVar.f852v = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
                    bVar.f855y = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
                    bVar.f853w = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
                    bVar.f854x = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
                    String string3 = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
                    boolean z12 = string3 != null;
                    if (z12 && bVar.f853w == 0 && bVar.f854x == null) {
                        bVar.f856z = (ActionProvider) bVar.a(string3, f824f, supportMenuInflater.f826b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f856z = null;
                    }
                    bVar.A = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
                    bVar.B = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
                    int i12 = R.styleable.MenuItem_iconTintMode;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
                        bVar.D = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i12, -1), bVar.D);
                    } else {
                        bVar.D = null;
                    }
                    int i13 = R.styleable.MenuItem_iconTint;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                        bVar.C = tintTypedArrayObtainStyledAttributes.getColorStateList(i13);
                    } else {
                        bVar.C = null;
                    }
                    tintTypedArrayObtainStyledAttributes.recycle();
                    bVar.f839h = false;
                } else if (name3.equals("menu")) {
                    bVar.f839h = true;
                    SubMenu subMenuAddSubMenu = bVar.f832a.addSubMenu(bVar.f833b, bVar.f840i, bVar.f841j, bVar.f842k);
                    bVar.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@LayoutRes int i10, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f827c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (menuBuilder.isDispatchingItemsChanged()) {
                        menuBuilder.stopDispatchingItemsChanged();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((MenuBuilder) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
