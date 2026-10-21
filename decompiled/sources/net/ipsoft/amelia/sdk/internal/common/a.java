package net.ipsoft.amelia.sdk.internal.common;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.ipsoft.amelia.sdk.BaseAuthSystem;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.BaseDomain;
import net.ipsoft.amelia.sdk.ConversationInfo;
import net.ipsoft.amelia.sdk.FormInputData;
import net.ipsoft.amelia.sdk.IAmeliaChat;
import net.ipsoft.amelia.sdk.IConversationListener;
import net.ipsoft.amelia.sdk.IResourceToDisplay;
import net.ipsoft.amelia.sdk.ISessionInfo;
import net.ipsoft.amelia.sdk.ISessionListener;
import net.ipsoft.amelia.sdk.LoginOptions;
import net.ipsoft.amelia.sdk.UploadMessage;
import net.ipsoft.amelia.sdk.internal.b.ac;
import net.ipsoft.amelia.sdk.internal.b.ad;
import net.ipsoft.amelia.sdk.internal.b.aj;
import net.ipsoft.amelia.sdk.internal.b.n;

/* JADX INFO: loaded from: classes12.dex */
public class a implements IAmeliaChat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj f84809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.a.f f84810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f84812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f84814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public UploadMessage f84815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f84816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.a.h f84817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f84818j;

    /* JADX INFO: renamed from: net.ipsoft.amelia.sdk.internal.common.a$a, reason: collision with other inner class name */
    public class C0473a extends ad {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseConversation f84819a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ac f84820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f84821j;

        public C0473a(BaseConversation baseConversation, ac acVar, f fVar) {
            this.f84819a = baseConversation;
            this.f84820i = acVar;
            this.f84821j = fVar;
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.o
        public final void a() {
            net.ipsoft.amelia.sdk.internal.b.l lVar = this.f84764f;
            ac acVar = this.f84820i;
            BaseConversation baseConversation = this.f84819a;
            a aVar = a.this;
            if (lVar != null || "Error".equals(this.f84691h)) {
                aVar.f84815g.setRecentError(new net.ipsoft.amelia.sdk.internal.common.c(this.f84764f, this.f84691h));
                Iterator it = aVar.f84812d.iterator();
                while (it.hasNext()) {
                    ((IConversationListener) it.next()).onUploadFailed(baseConversation, aVar.f84816h, acVar.e().getName());
                }
            } else {
                aVar.f84815g.setRecentError(null);
                aVar.f84815g.setUploaded(true);
                aVar.f84810b.a(this.f84821j, true);
                aVar.b(baseConversation, true, "Upload", IAmeliaChat.InputStateChangeReason.upload);
                Iterator it2 = aVar.f84812d.iterator();
                while (it2.hasNext()) {
                    ((IConversationListener) it2.next()).onUploadSuccess(baseConversation, aVar.f84816h, acVar.e().getName(), this.f84691h);
                }
            }
            File fileE = acVar.e();
            if (fileE != null) {
                fileE.delete();
            }
        }
    }

    public class d implements net.ipsoft.amelia.sdk.internal.a.h.a {
        public d() {
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.h.a
        public final void a(BaseConversation baseConversation) {
            Iterator it = a.this.f84812d.iterator();
            while (it.hasNext()) {
                ((IConversationListener) it.next()).onSpeakStart();
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.h.a
        public final void b(BaseConversation baseConversation) {
            Iterator it = a.this.f84812d.iterator();
            while (it.hasNext()) {
                ((IConversationListener) it.next()).onSpeakEnd();
            }
        }
    }

    public a(Context context, net.ipsoft.amelia.sdk.internal.common.b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f84811c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f84812d = arrayList2;
        b bVar2 = new b();
        c cVar = new c();
        d dVar = new d();
        Context applicationContext = context.getApplicationContext();
        this.f84818j = applicationContext;
        int i10 = bVar.f84834i;
        this.f84813e = bVar.f84829d;
        n nVar = new n(bVar);
        this.f84814f = nVar;
        if (bVar.f84838n.enabled) {
            this.f84817i = new net.ipsoft.amelia.sdk.internal.a.h(applicationContext, nVar, dVar);
        }
        net.ipsoft.amelia.sdk.internal.b.a aVar = new net.ipsoft.amelia.sdk.internal.b.a(nVar);
        net.ipsoft.amelia.sdk.internal.a.e eVar = new net.ipsoft.amelia.sdk.internal.a.e(nVar, bVar);
        k kVar = bVar.f84830e;
        kVar = kVar == null ? new k(aVar, eVar) : kVar;
        aj ajVar = new aj(context.getApplicationContext(), bVar, kVar, bVar2);
        this.f84809a = ajVar;
        net.ipsoft.amelia.sdk.internal.a.f fVarB = kVar.b();
        this.f84810b = fVarB;
        fVarB.a(cVar);
        arrayList.addAll(bVar.f84839o);
        arrayList2.addAll(bVar.f84840p);
        ajVar.b();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public net.ipsoft.amelia.sdk.internal.common.d getUser() {
        return this.f84809a.f();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void addConversationListener(IConversationListener iConversationListener) {
        ArrayList arrayList = this.f84812d;
        if (arrayList.contains(iConversationListener)) {
            return;
        }
        arrayList.add(iConversationListener);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void addSessionListener(ISessionListener iSessionListener) {
        ArrayList arrayList = this.f84811c;
        if (arrayList.contains(iSessionListener)) {
            return;
        }
        arrayList.add(iSessionListener);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void ask(BaseConversation baseConversation, String str) {
        if (baseConversation.getClass() == f.class) {
            f fVar = (f) baseConversation;
            fVar.a(System.currentTimeMillis());
            this.f84810b.a(fVar, str, false);
        }
    }

    public final void b(BaseConversation baseConversation, boolean z10, String str, IAmeliaChat.InputStateChangeReason inputStateChangeReason) {
        f fVar = (f) baseConversation;
        if (fVar.getClass() != f.class || fVar.isInputEnabled() == z10) {
            return;
        }
        fVar.a(z10);
        Iterator it = this.f84812d.iterator();
        while (it.hasNext()) {
            ((IConversationListener) it.next()).onInputEnabledChanged(baseConversation, z10, str, inputStateChangeReason);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void cancleFileUpload(BaseConversation baseConversation) {
        if (baseConversation.getClass() == f.class) {
            this.f84810b.a((f) baseConversation, false);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void clearChatHistory(BaseConversation baseConversation) {
        Iterator it = this.f84812d.iterator();
        while (it.hasNext()) {
            ((IConversationListener) it.next()).onChatHistoryClear(baseConversation);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void endConversation(BaseConversation baseConversation) {
        if (baseConversation == null || baseConversation.getClass() != f.class) {
            return;
        }
        this.f84809a.b((f) baseConversation);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public long getTimeOfLastMessage(BaseConversation baseConversation) {
        return baseConversation.getTimeOfLastMessage();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void initialize() {
        this.f84809a.a();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void joinConversation(ConversationInfo conversationInfo) {
        this.f84809a.a(conversationInfo);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void login(LoginOptions loginOptions) {
        this.f84809a.a(loginOptions);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void logout() {
        this.f84809a.d();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void mute(BaseConversation baseConversation) {
        if (baseConversation.getClass() == f.class) {
            ((f) baseConversation).c(true);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void removeConversationListener(IConversationListener iConversationListener) {
        this.f84812d.remove(iConversationListener);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void removeSessionListener(ISessionListener iSessionListener) {
        this.f84811c.remove(iSessionListener);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void resetConversation(BaseConversation baseConversation) {
        if (baseConversation.getClass() == f.class) {
            this.f84809a.a((f) baseConversation);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void runAction(BaseConversation baseConversation, String str, String str2, String str3) {
        if (baseConversation.getClass() == f.class) {
            b(baseConversation, true, "FormSubmit", IAmeliaChat.InputStateChangeReason.form);
            this.f84810b.a((f) baseConversation, str, str2, str3);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void say(BaseConversation baseConversation, String str) {
        if (!baseConversation.isSecureInputEnabled()) {
            ask(baseConversation, str);
            return;
        }
        f fVar = (f) baseConversation;
        if (fVar.getClass() == f.class) {
            fVar.a(System.currentTimeMillis());
            this.f84810b.a(fVar, str, true);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void selectDomain(BaseDomain baseDomain) {
        this.f84809a.a(baseDomain);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void sendCustomConversationAttributes(BaseConversation baseConversation, Map<String, String> map) {
        if (baseConversation.getClass() == f.class) {
            this.f84810b.a((f) baseConversation, map);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void startNewConversation() {
        startNewConversation(null, null);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void startNewConversationWithDefaultDomain(@Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        aj ajVar = this.f84809a;
        ajVar.a((Map<String, String>) null);
        ajVar.b((Map<String, String>) null);
        ajVar.e();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void stepupLogin() {
        this.f84809a.c();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void stopPlayAudio(BaseConversation baseConversation) {
        net.ipsoft.amelia.sdk.internal.a.h hVar = this.f84817i;
        if (hVar != null) {
            hVar.a(baseConversation);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void submitForm(BaseConversation baseConversation, FormInputData formInputData, String str) {
        if (baseConversation.getClass() == f.class) {
            b(baseConversation, true, "FormSubmit", IAmeliaChat.InputStateChangeReason.form);
            this.f84810b.a((f) baseConversation, formInputData, str);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void unmute(BaseConversation baseConversation) {
        if (baseConversation.getClass() == f.class) {
            ((f) baseConversation).c(false);
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void uploadFile(BaseConversation baseConversation, Uri uri) {
        if (baseConversation.getClass() == f.class) {
            f fVar = (f) baseConversation;
            ac acVar = new ac(this.f84818j, uri, fVar);
            this.f84814f.a(acVar, new C0473a(baseConversation, acVar, fVar));
        }
    }

    public class b implements aj.a {
        public b() {
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a() {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onSessionStart();
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void b() {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onLoginSuccess();
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void c() {
            a aVar = a.this;
            aVar.f84810b.a();
            Iterator it = aVar.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onLogout();
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void e(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onLoginFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void f(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onDomainFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void g(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onConversationFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a(List<BaseAuthSystem> list) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onLoginRequired(list);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void b(List<ConversationInfo> list) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onConversationInfoList(list);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a(ISessionInfo iSessionInfo) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).sessionInitialized(iSessionInfo);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void b(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onSessionInitFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void c(List<BaseDomain> list) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onDomainSelectionRequired(list);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onConversationFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void b(f fVar) {
            a.this.f84810b.b(fVar);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void c(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onSessionFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a(net.ipsoft.amelia.sdk.internal.common.d dVar, String str) {
            a aVar = a.this;
            aVar.f84810b.a(dVar, str);
            Iterator it = aVar.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onUserInit(dVar.getName(), dVar.getEmail());
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void a(f fVar) {
            a aVar = a.this;
            aVar.f84810b.a(fVar);
            Iterator it = aVar.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onConversationStart(fVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.aj.a
        public final void d(net.ipsoft.amelia.sdk.internal.common.c cVar) {
        }
    }

    public class c implements net.ipsoft.amelia.sdk.internal.a.f.a {
        public c() {
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void a(net.ipsoft.amelia.sdk.internal.common.c cVar) {
            Iterator it = a.this.f84811c.iterator();
            while (it.hasNext()) {
                ((ISessionListener) it.next()).onSessionFail(cVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void b(f fVar) {
            a aVar = a.this;
            Iterator it = aVar.f84812d.iterator();
            while (it.hasNext()) {
                ((IConversationListener) it.next()).onReconnect(fVar);
            }
            aVar.b(fVar, true, null, IAmeliaChat.InputStateChangeReason.idle);
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void c(f fVar) {
            a aVar = a.this;
            Iterator it = aVar.f84812d.iterator();
            while (it.hasNext()) {
                ((IConversationListener) it.next()).onDisconnect(fVar);
            }
            aVar.b(fVar, false, null, IAmeliaChat.InputStateChangeReason.disconnected);
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void d(f fVar) {
            a aVar = a.this;
            aVar.clearChatHistory(fVar);
            if (fVar.getClass() == f.class) {
                fVar.b(false);
                aVar.f84809a.c(fVar);
                Iterator it = aVar.f84811c.iterator();
                while (it.hasNext()) {
                    ((ISessionListener) it.next()).onConversationEnd(fVar);
                }
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void a(f fVar) {
            Iterator it = a.this.f84812d.iterator();
            while (it.hasNext()) {
                ((IConversationListener) it.next()).onConnect(fVar);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void a(f fVar, String str) {
            if ("InboundUserUtteranceMessage".equals(str)) {
                boolean zIsInputEnabled = fVar.isInputEnabled();
                a aVar = a.this;
                if (!zIsInputEnabled) {
                    Iterator it = aVar.f84812d.iterator();
                    while (it.hasNext()) {
                        ((IConversationListener) it.next()).onErrorInputBlocked(fVar);
                    }
                    return;
                }
                aVar.b(fVar, false, str, IAmeliaChat.InputStateChangeReason.unknown);
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // net.ipsoft.amelia.sdk.internal.a.f.a
        public final void a(f fVar, String str, net.ipsoft.amelia.sdk.internal.a.d dVar) {
            boolean zBooleanValue;
            a aVar = a.this;
            aVar.getClass();
            IAmeliaChat.InputStateChangeReason inputStateChangeReason = IAmeliaChat.InputStateChangeReason.unknown;
            String messageType = dVar.getMessageType();
            messageType.getClass();
            byte b10 = 1;
            if (messageType.equals("OutboundTextMessage")) {
                if (dVar.getFormInputData() == null || !"FORM_ONLY".equals(dVar.getFormInputData().getAllowedUserInputs())) {
                    zBooleanValue = dVar.getMessageText() == null || !dVar.getMessageText().contains("UPLOAD_REQUEST_MESSAGE_EVENT");
                    if (!zBooleanValue) {
                        if (fVar.getClass() == f.class) {
                            fVar.a(true);
                        }
                        inputStateChangeReason = IAmeliaChat.InputStateChangeReason.upload;
                    }
                } else {
                    inputStateChangeReason = IAmeliaChat.InputStateChangeReason.form;
                    zBooleanValue = false;
                }
            } else if (messageType.equals("OutboundAckRequestMessage")) {
                if (fVar.getClass() == f.class) {
                    fVar.a(true);
                }
                aVar.f84810b.a(fVar, "InboundAckMessage");
                zBooleanValue = true;
            } else {
                zBooleanValue = Boolean.valueOf(dVar.getHeader("X-Amelia-Input-Enabled")).booleanValue();
            }
            aVar.b(fVar, zBooleanValue, dVar.getMessageType(), inputStateChangeReason);
            String mood = dVar.getMood();
            String mood2 = fVar.getMood();
            if (mood == null) {
                if (mood2 == null) {
                    mood2 = aVar.f84813e;
                }
                dVar.l(mood2);
            } else if (!mood.equals(mood2)) {
                Iterator it = aVar.f84812d.iterator();
                while (it.hasNext()) {
                    ((IConversationListener) it.next()).onMoodChange(fVar, mood, mood2);
                }
                fVar.a(mood);
            }
            Iterator it2 = aVar.f84812d.iterator();
            while (it2.hasNext()) {
                ((IConversationListener) it2.next()).onMessageReceived(fVar, str);
            }
            net.ipsoft.amelia.sdk.internal.a.h hVar = aVar.f84817i;
            if (hVar != null) {
                hVar.a(fVar, dVar);
                aVar.f84817i.a(dVar.getVoice());
            }
            String messageType2 = dVar.getMessageType();
            messageType2.getClass();
            switch (messageType2.hashCode()) {
                case -2121648466:
                    b10 = !messageType2.equals("OutboundAvatarChangeVoiceMessage") ? (byte) -1 : (byte) 0;
                    break;
                case -1861655044:
                    if (!messageType2.equals("OutboundPresentMessage")) {
                        b10 = -1;
                    }
                    break;
                case -1805999330:
                    b10 = !messageType2.equals("OutboundReplayFinishedMessage") ? (byte) -1 : (byte) 2;
                    break;
                case -1802019820:
                    b10 = !messageType2.equals("OutboundAgentSessionChangedMessage") ? (byte) -1 : (byte) 3;
                    break;
                case -1689016312:
                    b10 = !messageType2.equals("OutboundConversationClosedMessage") ? (byte) -1 : (byte) 4;
                    break;
                case -1550781016:
                    b10 = !messageType2.equals("OutboundRequestMessage") ? (byte) -1 : (byte) 5;
                    break;
                case -799280843:
                    b10 = !messageType2.equals("OutboundSessionClosedMessage") ? (byte) -1 : (byte) 6;
                    break;
                case -363182741:
                    b10 = !messageType2.equals("OutboundEscalationStartedMessage") ? (byte) -1 : (byte) 7;
                    break;
                case -279125899:
                    b10 = !messageType2.equals("OutboundBpnExecutionEventMessage") ? (byte) -1 : (byte) 8;
                    break;
                case 214199319:
                    b10 = !messageType2.equals("OutboundIdleTalkMessage") ? (byte) -1 : (byte) 9;
                    break;
                case 422356447:
                    b10 = !messageType2.equals("OutboundAmeliaReadyMessage") ? (byte) -1 : (byte) 10;
                    break;
                case 457708227:
                    b10 = !messageType2.equals("OutboundIntegrationMessage") ? (byte) -1 : (byte) 11;
                    break;
                case 527800049:
                    b10 = !messageType2.equals("OutboundFormInputMessage") ? (byte) -1 : (byte) 12;
                    break;
                case 538168445:
                    b10 = !messageType2.equals("OutboundProgressTextMessage") ? (byte) -1 : (byte) 13;
                    break;
                case 848028451:
                    b10 = !messageType2.equals("WolframAlphaFinalMessage") ? (byte) -1 : Constants.CVR_B1b41_1110_ONLINE_PIN;
                    break;
                case 1176925253:
                    b10 = !messageType2.equals("OutboundFinalErrorMessage") ? (byte) -1 : (byte) 15;
                    break;
                case 1300620522:
                    b10 = !messageType2.equals("OutboundTextMessage") ? (byte) -1 : (byte) 16;
                    break;
                case 1608497394:
                    b10 = !messageType2.equals("OutboundEchoMessage") ? (byte) -1 : (byte) 17;
                    break;
                case 1687390769:
                    b10 = !messageType2.equals("OutboundAckRequestMessage") ? (byte) -1 : MessageUtils.MESSAGE_18_DC2;
                    break;
                case 1951746070:
                    b10 = !messageType2.equals("OutboundNoIdleTalkMessage") ? (byte) -1 : (byte) 19;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    String avatarVoice = dVar.getAvatarVoice();
                    net.ipsoft.amelia.sdk.internal.a.h hVar2 = aVar.f84817i;
                    if (hVar2 != null && avatarVoice != null) {
                        hVar2.a(avatarVoice);
                    }
                    break;
                case 1:
                    IResourceToDisplay resourceToDisplay = dVar.getResourceToDisplay();
                    if (resourceToDisplay != null && fVar.getClass() == f.class) {
                        dVar.a(new h(aVar.f84814f, fVar, resourceToDisplay, dVar.getContextId()));
                        Iterator it3 = aVar.f84812d.iterator();
                        while (it3.hasNext()) {
                            ((IConversationListener) it3.next()).outboundMmoDownloadMessage(fVar, dVar);
                        }
                        return;
                    }
                    break;
                case 2:
                    Iterator it4 = aVar.f84812d.iterator();
                    while (it4.hasNext()) {
                        ((IConversationListener) it4.next()).outboundReplayFinishedMessage(fVar, dVar);
                    }
                    break;
                case 3:
                    fVar.a(System.currentTimeMillis());
                    Iterator it5 = aVar.f84812d.iterator();
                    while (it5.hasNext()) {
                        ((IConversationListener) it5.next()).outboundAgentSessionChangedMessage(fVar, dVar);
                    }
                    break;
                case 4:
                    fVar.a(System.currentTimeMillis());
                    Iterator it6 = aVar.f84812d.iterator();
                    while (it6.hasNext()) {
                        ((IConversationListener) it6.next()).outboundConversationClosedMessage(fVar, dVar);
                    }
                    break;
                case 5:
                    UploadMessage uploadMessage = new UploadMessage(dVar.isCancellable(), dVar.isMultiple());
                    aVar.f84815g = uploadMessage;
                    uploadMessage.setResourceToRequest(dVar.getResourceToRequest());
                    dVar.a(aVar.f84815g);
                    aVar.f84816h = dVar.getFromUserDisplayName();
                    Iterator it7 = aVar.f84812d.iterator();
                    while (it7.hasNext()) {
                        ((IConversationListener) it7.next()).onUploadRequest(fVar, dVar);
                    }
                    return;
                case 6:
                    Iterator it8 = aVar.f84812d.iterator();
                    while (it8.hasNext()) {
                        ((IConversationListener) it8.next()).outboundSessionClosedMessage(fVar, dVar);
                    }
                    break;
                case 7:
                    Iterator it9 = aVar.f84812d.iterator();
                    while (it9.hasNext()) {
                        ((IConversationListener) it9.next()).outboundEscalationStartedMessage(fVar, dVar);
                    }
                    break;
                case 8:
                    Iterator it10 = aVar.f84812d.iterator();
                    while (it10.hasNext()) {
                        ((IConversationListener) it10.next()).outboundBpnExecutionEventMessage(fVar, dVar);
                    }
                    break;
                case 9:
                    Iterator it11 = aVar.f84812d.iterator();
                    while (it11.hasNext()) {
                        ((IConversationListener) it11.next()).outboundIdleTalkMessage(fVar, dVar);
                    }
                    break;
                case 10:
                    Iterator it12 = aVar.f84812d.iterator();
                    while (it12.hasNext()) {
                        ((IConversationListener) it12.next()).outboundAmeliaReadyMessage(fVar, dVar);
                    }
                    break;
                case 11:
                    fVar.a(System.currentTimeMillis());
                    Iterator it13 = aVar.f84812d.iterator();
                    while (it13.hasNext()) {
                        ((IConversationListener) it13.next()).outboundIntegrationMessage(fVar, dVar);
                    }
                    break;
                case 12:
                    Iterator it14 = aVar.f84812d.iterator();
                    while (it14.hasNext()) {
                        ((IConversationListener) it14.next()).outboundFormInputMessage(fVar, dVar);
                    }
                    break;
                case 13:
                    fVar.a(System.currentTimeMillis());
                    Iterator it15 = aVar.f84812d.iterator();
                    while (it15.hasNext()) {
                        ((IConversationListener) it15.next()).outboundProgressTextMessage(fVar, dVar);
                    }
                    break;
                case 14:
                    fVar.a(System.currentTimeMillis());
                    Iterator it16 = aVar.f84812d.iterator();
                    while (it16.hasNext()) {
                        ((IConversationListener) it16.next()).wolframAlphaFinalMessage(fVar, dVar);
                    }
                    break;
                case 15:
                    fVar.a(System.currentTimeMillis());
                    Iterator it17 = aVar.f84812d.iterator();
                    while (it17.hasNext()) {
                        ((IConversationListener) it17.next()).outboundFinalErrorMessage(fVar, dVar);
                    }
                    break;
                case 16:
                    fVar.a(System.currentTimeMillis());
                    Iterator it18 = aVar.f84812d.iterator();
                    while (it18.hasNext()) {
                        ((IConversationListener) it18.next()).outboundTextMessage(fVar, dVar);
                    }
                    boolean zShouldSecureInput = dVar.shouldSecureInput();
                    if (fVar.getClass() == f.class && fVar.isSecureInputEnabled() != zShouldSecureInput) {
                        fVar.b(zShouldSecureInput);
                        Iterator it19 = aVar.f84812d.iterator();
                        while (it19.hasNext()) {
                            ((IConversationListener) it19.next()).onSecureInputEnabledChanged(fVar, zShouldSecureInput);
                        }
                    }
                    break;
                case 17:
                    fVar.a(System.currentTimeMillis());
                    String messageText = dVar.getMessageText();
                    if (messageText == null || !messageText.contains("getFile") || !messageText.contains("was successfully uploaded")) {
                        Iterator it20 = aVar.f84812d.iterator();
                        while (it20.hasNext()) {
                            ((IConversationListener) it20.next()).outboundEchoMessage(fVar, dVar);
                        }
                    }
                    break;
                case 18:
                    Iterator it21 = aVar.f84812d.iterator();
                    while (it21.hasNext()) {
                        ((IConversationListener) it21.next()).outboundAckRequestMessage(fVar, dVar);
                    }
                    break;
                case 19:
                    Iterator it22 = aVar.f84812d.iterator();
                    while (it22.hasNext()) {
                        ((IConversationListener) it22.next()).outboundNoIdleTalkMessage(fVar, dVar);
                    }
                    break;
                default:
                    ALog.d(ALog.TAG_AMELIA, "Unrecognized message type: " + dVar.getMessageType());
                    break;
            }
            Iterator it23 = aVar.f84812d.iterator();
            while (it23.hasNext()) {
                ((IConversationListener) it23.next()).outboundAmeliaMessage(fVar, dVar);
            }
        }
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaChat
    public void startNewConversation(@Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        aj ajVar = this.f84809a;
        ajVar.a(map);
        ajVar.b(map2);
        selectDomain(null);
    }
}
