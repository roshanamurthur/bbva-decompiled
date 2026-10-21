package com.noknok.android.client.appsdk.jsonapi;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.Extension;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Message {

    @Expose
    public App app;

    @Expose
    public List<AuthInfo> authInfos;

    @Expose
    public Device device;

    @Expose
    public List<Extension> extensions;

    @Expose
    public Notify notify;

    @Expose
    public String oobData;

    @Expose
    public String operation;

    @Expose
    public String protocol;

    @Expose
    public String protocolMessage;

    @Expose
    public List<ProtocolMessage> protocolMessages;

    @Expose
    public QuickAuthData quickAuthData;

    @Expose
    public boolean regUsedOnThisDevice = true;

    @Expose
    public Sdk sdk;

    @Expose
    public Server server;

    @Expose
    public String version;

    public enum OperationID {
        INIT_REG,
        FINISH_REG,
        INIT_AUTH,
        FINISH_AUTH,
        INIT_OOB_REG,
        FINISH_OOB_REG,
        INIT_OOB_AUTH,
        FINISH_OOB_AUTH,
        LIST_REG,
        DELETE_REG
    }

    public void copy(Message message) {
        this.version = message.version;
        this.operation = message.operation;
        this.protocol = message.protocol;
        this.sdk = message.sdk;
        this.app = message.app;
        this.device = message.device;
        this.server = message.server;
        this.notify = message.notify;
        this.protocolMessage = message.protocolMessage;
        this.protocolMessages = message.protocolMessages;
        this.oobData = message.oobData;
        this.authInfos = message.authInfos;
        this.extensions = message.extensions;
        this.regUsedOnThisDevice = message.regUsedOnThisDevice;
    }
}
